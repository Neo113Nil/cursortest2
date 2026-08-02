package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class lrh implements fih {
    public boolean a;
    public long b;
    public long c;
    public final Object d;
    public Object e;

    public lrh(sr7 sr7Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = sr7Var;
    }

    public void a(long j) {
        this.b = j;
        if (this.a) {
            ((dzr) this.d).getClass();
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public void b() {
        if (this.a) {
            return;
        }
        ((dzr) this.d).getClass();
        this.c = SystemClock.elapsedRealtime();
        this.a = true;
    }

    @Override // defpackage.fih
    public p0l m() {
        return (p0l) this.e;
    }

    @Override // defpackage.fih
    public void r(p0l p0lVar) {
        if (this.a) {
            a(t());
        }
        this.e = p0lVar;
    }

    @Override // defpackage.fih
    public long t() {
        long j = this.b;
        if (!this.a) {
            return j;
        }
        ((dzr) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        return (((p0l) this.e).a == 1.0f ? dvt.Y(elapsedRealtime) : elapsedRealtime * r4.c) + j;
    }

    public lrh(dzr dzrVar) {
        this.d = dzrVar;
        this.e = p0l.d;
    }
}
