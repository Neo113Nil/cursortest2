package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.os.OperationCanceledException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class it1 implements Runnable {
    public static Handler f;
    public final /* synthetic */ dzw e;
    public volatile int b = 1;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean d = new AtomicBoolean();
    public final ozg a = new ozg(this, new z68(2, this));

    public it1(dzw dzwVar) {
        this.e = dzwVar;
    }

    public final void a() {
        try {
            dzw dzwVar = this.e;
            Iterator it = dzwVar.j.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((tmd) it.next()).d(dzwVar)) {
                    i++;
                }
            }
            try {
                dzwVar.i.tryAcquire(i, 5L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
                Thread.currentThread().interrupt();
            }
        } catch (OperationCanceledException e2) {
            if (!this.c.get()) {
                throw e2;
            }
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (it1.class) {
            try {
                if (f == null) {
                    f = new Handler(Looper.getMainLooper());
                }
                handler = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new e8h(6, this, obj));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.b();
    }
}
