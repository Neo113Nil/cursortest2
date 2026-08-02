package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class ihs {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public boolean b = true;
    public long c;
    public long d;

    public ihs(ujl ujlVar) {
    }

    public final synchronized long a() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.b ? this.c : (SystemClock.elapsedRealtime() - this.d) + this.c;
    }

    public final synchronized void b() {
        this.a.set(false);
        this.b = true;
        this.c = 0L;
        this.d = 0L;
    }

    public final synchronized void c() {
        this.a.set(true);
        if (this.b) {
            this.d = SystemClock.elapsedRealtime();
            this.b = false;
        }
    }

    public final synchronized void d() {
        if (!this.b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.c = (elapsedRealtime - this.d) + this.c;
            this.b = true;
        }
    }
}
