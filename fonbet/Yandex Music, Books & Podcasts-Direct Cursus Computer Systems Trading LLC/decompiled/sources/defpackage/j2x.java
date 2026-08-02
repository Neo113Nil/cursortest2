package defpackage;

import android.os.Looper;
import java.util.Locale;

/* loaded from: classes.dex */
public final class j2x {
    public static final Object i = new Object();
    public final msg a;
    public final long b;
    public final String c;
    public c2x g;
    public yyo h;
    public long e = -1;
    public long f = 0;
    public final fsn d = new fsn(Looper.getMainLooper(), 3);

    public j2x(long j, String str) {
        this.b = j;
        this.c = str;
        this.a = new msg("RequestTracker", str);
    }

    public final void a(long j, c2x c2xVar) {
        c2x c2xVar2;
        long j2;
        long j3;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = i;
        synchronized (obj) {
            c2xVar2 = this.g;
            j2 = this.e;
            j3 = this.f;
            this.e = j;
            this.g = c2xVar;
            this.f = currentTimeMillis;
        }
        if (c2xVar2 != null) {
            c2xVar2.n(this.c, j2, j3, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                yyo yyoVar = this.h;
                if (yyoVar != null) {
                    this.d.removeCallbacks(yyoVar);
                }
                yyo yyoVar2 = new yyo(19, this);
                this.h = yyoVar2;
                this.d.postDelayed(yyoVar2, this.b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(long j, int i2, ybl yblVar) {
        synchronized (i) {
            try {
                if (c(j)) {
                    Locale locale = Locale.ROOT;
                    e(i2, "request " + j + " completed", yblVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(long j) {
        boolean z;
        synchronized (i) {
            long j2 = this.e;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    public final boolean d() {
        boolean z;
        synchronized (i) {
            z = this.e != -1;
        }
        return z;
    }

    public final void e(int i2, String str, Object obj) {
        this.a.b(str, new Object[0]);
        Object obj2 = i;
        synchronized (obj2) {
            try {
                if (this.g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    c2x c2xVar = this.g;
                    y1g.G(c2xVar);
                    c2xVar.v(this.c, this.e, i2, obj, this.f, currentTimeMillis);
                }
                this.e = -1L;
                this.g = null;
                synchronized (obj2) {
                    yyo yyoVar = this.h;
                    if (yyoVar != null) {
                        this.d.removeCallbacks(yyoVar);
                        this.h = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
    }

    public final boolean f(int i2) {
        synchronized (i) {
            try {
                if (!d()) {
                    return false;
                }
                Locale locale = Locale.ROOT;
                e(i2, "clearing request " + this.e, null);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
