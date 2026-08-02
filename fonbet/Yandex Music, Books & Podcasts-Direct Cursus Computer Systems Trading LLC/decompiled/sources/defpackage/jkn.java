package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class jkn implements Runnable {
    public final ps3 a;
    public volatile AtomicInteger b = new AtomicInteger(0);
    public final /* synthetic */ mkn c;

    public jkn(mkn mknVar, ps3 ps3Var) {
        this.c = mknVar;
        this.a = ps3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OkHttpClient okHttpClient;
        String concat = "OkHttp ".concat(this.c.b.a.i());
        mkn mknVar = this.c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            mknVar.f.i();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    mknVar.a.a.e(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.a.a(mknVar, mknVar.f());
                okHttpClient = mknVar.a;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    otk otkVar = otk.a;
                    otk otkVar2 = otk.a;
                    String concat2 = "Callback failure for ".concat(mkn.b(mknVar));
                    otkVar2.getClass();
                    otk.i(4, concat2, e);
                } else {
                    this.a.d(mknVar, e);
                }
                okHttpClient = mknVar.a;
                okHttpClient.a.e(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                mknVar.cancel();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    fob.a(iOException, th);
                    this.a.d(mknVar, iOException);
                }
                throw th;
            }
            okHttpClient.a.e(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
