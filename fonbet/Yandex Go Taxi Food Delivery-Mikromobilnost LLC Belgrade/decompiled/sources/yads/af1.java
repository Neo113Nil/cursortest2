package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import defpackage.av81;
import defpackage.dda1;
import defpackage.m191;
import defpackage.nba1;
import defpackage.ny61;
import defpackage.t671;
import defpackage.zl61;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public final class af1 extends Handler implements Runnable {
    public final int b;
    public final zl61 c;
    public final long d;
    public av81 e;
    public IOException f;
    public int g;
    public Thread h;
    public boolean i;
    public volatile boolean j;
    public final /* synthetic */ t671 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af1(t671 t671Var, Looper looper, zl61 zl61Var, av81 av81Var, int i, long j) {
        super(looper);
        this.k = t671Var;
        this.c = zl61Var;
        this.e = av81Var;
        this.b = i;
        this.d = j;
    }

    public final void a(boolean z) {
        this.j = z;
        this.f = null;
        if (hasMessages(0)) {
            this.i = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.i = true;
                    this.c.b();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.k.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            av81 av81Var = this.e;
            av81Var.getClass();
            av81Var.a(this.c, elapsedRealtime, elapsedRealtime - this.d, true);
            this.e = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.j) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.f = null;
            t671 t671Var = this.k;
            ExecutorService executorService = t671Var.a;
            af1 af1Var = t671Var.b;
            af1Var.getClass();
            executorService.execute(af1Var);
            return;
        }
        if (i == 3) {
            throw ((Error) message.obj);
        }
        this.k.b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.d;
        av81 av81Var = this.e;
        av81Var.getClass();
        if (this.i) {
            av81Var.a(this.c, elapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 1) {
            try {
                av81Var.a(this.c, elapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                nba1.c("LoadTask", nba1.b("Unexpected exception handling load completed", e));
                this.k.c = new ef1(e);
                return;
            }
        }
        if (i2 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f = iOException;
        int i3 = this.g + 1;
        this.g = i3;
        m191 a = av81Var.a(this.c, elapsedRealtime, j, iOException, i3);
        int i4 = a.a;
        if (i4 == 3) {
            this.k.c = this.f;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.g = 1;
            }
            long j2 = a.b;
            if (j2 == -9223372036854775807L) {
                j2 = Math.min((this.g - 1) * 1000, 5000);
            }
            t671 t671Var2 = this.k;
            if (t671Var2.b != null) {
                ny61.k();
                return;
            }
            t671Var2.b = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
            } else {
                this.f = null;
                t671Var2.a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.i;
                this.h = Thread.currentThread();
            }
            if (!z) {
                dda1.i("load:".concat(this.c.getClass().getSimpleName()));
                try {
                    this.c.a();
                    dda1.h();
                } catch (Throwable th) {
                    dda1.h();
                    throw th;
                }
            }
            synchronized (this) {
                this.h = null;
                Thread.interrupted();
            }
            if (this.j) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.j) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Exception e2) {
            if (this.j) {
                return;
            }
            nba1.c("LoadTask", nba1.b("Unexpected exception loading stream", e2));
            obtainMessage(2, new ef1(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.j) {
                return;
            }
            nba1.c("LoadTask", nba1.b("OutOfMemory error loading stream", e3));
            obtainMessage(2, new ef1(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.j) {
                nba1.c("LoadTask", nba1.b("Unexpected error loading stream", e4));
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
