package androidx.loader.content;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.os.OperationCanceledException;
import com.bugsnag.android.Client;
import com.google.android.gms.auth.api.signin.internal.zbc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class AsyncTaskLoader$LoadTask implements Runnable {
    public static Handler sHandler;
    public final ModernAsyncTask$2 mFuture;
    public final /* synthetic */ zbc this$0;
    public volatile int mStatus = 1;
    public final AtomicBoolean mCancelled = new AtomicBoolean();
    public final AtomicBoolean mTaskInvoked = new AtomicBoolean();

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.loader.content.ModernAsyncTask$2] */
    public AsyncTaskLoader$LoadTask(zbc zbcVar) {
        this.this$0 = zbcVar;
        final ModernAsyncTask$1 modernAsyncTask$1 = new ModernAsyncTask$1(this, 0);
        this.mFuture = new FutureTask(modernAsyncTask$1) { // from class: androidx.loader.content.ModernAsyncTask$2
            @Override // java.util.concurrent.FutureTask
            public final void done() {
                AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask = AsyncTaskLoader$LoadTask.this;
                AtomicBoolean atomicBoolean = asyncTaskLoader$LoadTask.mTaskInvoked;
                try {
                    Object obj = get();
                    if (atomicBoolean.get()) {
                        return;
                    }
                    asyncTaskLoader$LoadTask.postResult(obj);
                } catch (InterruptedException e) {
                    Log.w("AsyncTask", e);
                } catch (CancellationException unused) {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    asyncTaskLoader$LoadTask.postResult(null);
                } catch (ExecutionException e2) {
                    OptionalProvider$$ExternalSyntheticLambda0.m("An error occurred while executing doInBackground()", e2.getCause());
                } catch (Throwable th) {
                    OptionalProvider$$ExternalSyntheticLambda0.m("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }

    public final void doInBackground() {
        try {
            zbc zbcVar = this.this$0;
            Iterator it = zbcVar.zbb.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((GoogleApiClient) it.next()).maybeSignIn(zbcVar)) {
                    i++;
                }
            }
            try {
                zbcVar.zba.tryAcquire(i, 5L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
                Thread.currentThread().interrupt();
            }
        } catch (OperationCanceledException e2) {
            if (!this.mCancelled.get()) {
                throw e2;
            }
        }
    }

    public final void postResult(Object obj) {
        Handler handler;
        synchronized (AsyncTaskLoader$LoadTask.class) {
            try {
                if (sHandler == null) {
                    sHandler = new Handler(Looper.getMainLooper());
                }
                handler = sHandler;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new Client.AnonymousClass4(this, obj, false, 7));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.this$0.executePendingTask();
    }
}
