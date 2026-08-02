package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.io.IOException;

/* loaded from: classes.dex */
public final class igg extends Handler implements Runnable {
    public final int a;
    public final jgg b;
    public final long c;
    public hgg d;
    public IOException e;
    public int f;
    public Thread g;
    public boolean h;
    public volatile boolean i;
    public final /* synthetic */ osh j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igg(osh oshVar, Looper looper, jgg jggVar, hgg hggVar, int i, long j) {
        super(looper);
        this.j = oshVar;
        this.b = jggVar;
        this.d = hggVar;
        this.a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.i = z;
        this.e = null;
        if (hasMessages(1)) {
            this.h = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.h = true;
                    this.b.f();
                    Thread thread = this.g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.j.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            hgg hggVar = this.d;
            hggVar.getClass();
            hggVar.d(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.c;
        hgg hggVar = this.d;
        hggVar.getClass();
        hggVar.o(this.b, elapsedRealtime, j, this.f);
        this.e = null;
        osh oshVar = this.j;
        z7h z7hVar = (z7h) oshVar.a;
        igg iggVar = (igg) oshVar.b;
        iggVar.getClass();
        z7hVar.execute(iggVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.i) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.j.b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.c;
        hgg hggVar = this.d;
        hggVar.getClass();
        if (this.h) {
            hggVar.d(this.b, elapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                hggVar.g(this.b, elapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                vq1.L("LoadTask", "Unexpected exception handling load completed", e);
                this.j.c = new lgg(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.e = iOException;
        int i3 = this.f + 1;
        this.f = i3;
        mdr v = hggVar.v(this.b, elapsedRealtime, j, iOException, i3);
        int i4 = v.a;
        if (i4 == 3) {
            this.j.c = this.e;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.f = 1;
            }
            long j2 = v.b;
            if (j2 == -9223372036854775807L) {
                j2 = Math.min((this.f - 1) * 1000, ScreenMirroringConfig.Test.pcVideoUdpPort);
            }
            osh oshVar = this.j;
            vq1.A(((igg) oshVar.b) == null);
            oshVar.b = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(1, j2);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.h;
                this.g = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.g = null;
                Thread.interrupted();
            }
            if (this.i) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.i) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.i) {
                return;
            }
            vq1.L("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(3, new lgg(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.i) {
                return;
            }
            vq1.L("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(3, new lgg(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.i) {
                vq1.L("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
