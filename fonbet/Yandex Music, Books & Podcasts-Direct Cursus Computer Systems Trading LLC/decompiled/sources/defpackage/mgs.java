package defpackage;

import android.os.SystemClock;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class mgs {
    public final String a;
    public final lgq b;
    public final lgq c;
    public final lgq d;
    public final lgq e;
    public final dfb f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public long l;
    public int k = 1;
    public long m = -1;
    public long n = -1;
    public final Object o = btf.a(bwf.c, wjp.L);

    public mgs(String str, lgq lgqVar, lgq lgqVar2, lgq lgqVar3, lgq lgqVar4, dfb dfbVar) {
        this.a = str;
        this.b = lgqVar;
        this.c = lgqVar2;
        this.d = lgqVar3;
        this.e = lgqVar4;
        this.f = dfbVar;
    }

    public final void a() {
        int D = ouj.D(this.k);
        if (D == 1 || D == 2) {
            this.k = 1;
            b();
            this.b.invoke(Long.valueOf(d()));
            f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public final void b() {
        ((fgc) this.o.getValue()).a.removeCallbacksAndMessages(null);
    }

    public final void c() {
        Long l = this.g;
        lgq lgqVar = this.e;
        if (l == null) {
            lgqVar.invoke(Long.valueOf(d()));
            return;
        }
        long d = d();
        long longValue = l.longValue();
        if (d > longValue) {
            d = longValue;
        }
        lgqVar.invoke(Long.valueOf(d));
    }

    public final long d() {
        return (this.m == -1 ? 0L : SystemClock.elapsedRealtime() - this.m) + this.l;
    }

    public final void e(String str) {
        this.f.d(new IllegalArgumentException(str));
    }

    public final void f() {
        this.m = -1L;
        this.n = -1L;
        this.l = 0L;
    }

    public final void g() {
        Long l = this.j;
        Long l2 = this.i;
        if (l != null && this.n != -1 && SystemClock.elapsedRealtime() - this.n > l.longValue()) {
            c();
        }
        if (l == null && l2 != null) {
            long longValue = l2.longValue();
            long d = longValue - d();
            if (d >= 0) {
                i(d, d, new xi0(this, longValue, 2));
                return;
            } else {
                this.d.invoke(l2);
                f();
                return;
            }
        }
        if (l == null || l2 == null) {
            if (l == null || l2 != null) {
                return;
            }
            long longValue2 = l.longValue();
            i(longValue2, longValue2 - (d() % longValue2), new ncs(3, this));
            return;
        }
        long longValue3 = l2.longValue();
        long longValue4 = l.longValue();
        long d2 = longValue4 - (d() % longValue4);
        wqn wqnVar = new wqn();
        wqnVar.a = (longValue3 / longValue4) - (d() / longValue4);
        i(longValue4, d2, new ihm(longValue3, this, wqnVar, longValue4, new ywg(1, longValue3, wqnVar, this)));
    }

    public final void h() {
        if (this.m != -1) {
            this.l += SystemClock.elapsedRealtime() - this.m;
            this.n = SystemClock.elapsedRealtime();
            this.m = -1L;
        }
        b();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [arf, java.lang.Object] */
    public final void i(long j, long j2, Function0 function0) {
        this.m = SystemClock.elapsedRealtime();
        fgc fgcVar = (fgc) this.o.getValue();
        fgcVar.a.postDelayed(new nh(fgcVar, j, function0), j2);
    }

    public final void j() {
        int D = ouj.D(this.k);
        if (D == 0) {
            b();
            this.i = this.g;
            this.j = this.h;
            this.k = 2;
            this.c.invoke(Long.valueOf(d()));
            g();
            return;
        }
        String str = this.a;
        if (D == 1) {
            e("The timer '" + str + "' already working!");
            return;
        }
        if (D != 2) {
            return;
        }
        e("The timer '" + str + "' paused!");
    }
}
