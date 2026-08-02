package androidx.camera.core.impl.utils.futures;

import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricPrompt;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.room.util.DBUtil;
import com.bugsnag.android.Client;
import com.bumptech.glide.util.Executors$1;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class ListFuture implements ListenableFuture {
    public final boolean mAllMustSucceed;
    public ArrayList mFutures;
    public final AtomicInteger mRemaining;
    public final CallbackToFutureAdapter$SafeFuture mResult = DBUtil.getFuture(new BiometricPrompt(this, 12));
    public CallbackToFutureAdapter$Completer mResultNotifier;
    public ArrayList mValues;

    public ListFuture(ArrayList arrayList, boolean z, Executors$1 executors$1) {
        this.mFutures = arrayList;
        this.mValues = new ArrayList(arrayList.size());
        this.mAllMustSucceed = z;
        this.mRemaining = new AtomicInteger(arrayList.size());
        addListener(new Client.AnonymousClass7(this, 9), zzabp.directExecutor());
        if (this.mFutures.isEmpty()) {
            this.mResultNotifier.set(new ArrayList(this.mValues));
            return;
        }
        for (int i = 0; i < this.mFutures.size(); i++) {
            this.mValues.add(null);
        }
        ArrayList arrayList2 = this.mFutures;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ListenableFuture listenableFuture = (ListenableFuture) arrayList2.get(i2);
            listenableFuture.addListener(new BiometricFragment.AnonymousClass10(this, i2, listenableFuture, 2), executors$1);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.mResult.delegate.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.mFutures;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(z);
            }
        }
        return this.mResult.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        ArrayList arrayList = this.mFutures;
        if (arrayList != null && !isDone()) {
            Iterator it = arrayList.iterator();
            loop0: while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                while (!listenableFuture.isDone()) {
                    try {
                        listenableFuture.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.mAllMustSucceed) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) this.mResult.delegate.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.mResult.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.mResult.delegate.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.mResult.delegate.get(j, timeUnit);
    }
}
