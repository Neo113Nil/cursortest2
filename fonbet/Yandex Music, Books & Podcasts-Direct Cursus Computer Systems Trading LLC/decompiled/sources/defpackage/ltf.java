package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ltf {
    public static final long s;
    public static final /* synthetic */ int t = 0;
    public final mm6 a;
    public final uod b;
    public final ypb c;
    public wdc d;
    public wdc e;
    public wdc f;
    public boolean g;
    public final x6k h;
    public final x6k i;
    public final x6k j;
    public final x6k k;
    public long l;
    public long m;
    public xod n;
    public final fk0 o;
    public final fk0 p;
    public final x6k q;
    public long r;

    static {
        long j = Integer.MAX_VALUE;
        s = (j & 4294967295L) | (j << 32);
    }

    public ltf(mm6 mm6Var, uod uodVar, ypb ypbVar) {
        this.a = mm6Var;
        this.b = uodVar;
        this.c = ypbVar;
        Boolean bool = Boolean.FALSE;
        this.h = szf.g0(bool);
        this.i = szf.g0(bool);
        this.j = szf.g0(bool);
        this.k = szf.g0(bool);
        long j = s;
        this.l = j;
        this.m = 0L;
        this.n = uodVar != null ? uodVar.b() : null;
        this.o = new fk0(new wpe(0L), azt.g, null, 12);
        this.p = new fk0(Float.valueOf(1.0f), azt.a, null, 12);
        this.q = szf.g0(new wpe(0L));
        this.r = j;
    }

    public final void a() {
        xod xodVar = this.n;
        wdc wdcVar = this.d;
        boolean booleanValue = ((Boolean) this.i.getValue()).booleanValue();
        mm6 mm6Var = this.a;
        Continuation continuation = null;
        if (booleanValue || wdcVar == null || xodVar == null) {
            if (b()) {
                if (xodVar != null) {
                    xodVar.h(1.0f);
                }
                x97.y(mm6Var, null, null, new jtf(this, continuation, 0), 3);
                return;
            }
            return;
        }
        d(true);
        boolean b = b();
        boolean z = !b;
        if (!b) {
            xodVar.h(0.0f);
        }
        x97.y(mm6Var, null, null, new ak1(z, this, wdcVar, xodVar, (Continuation) null), 3);
    }

    public final boolean b() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void c() {
        uod uodVar;
        boolean booleanValue = ((Boolean) this.h.getValue()).booleanValue();
        mm6 mm6Var = this.a;
        Continuation continuation = null;
        if (booleanValue) {
            f(false);
            x97.y(mm6Var, null, null, new jtf(this, continuation, 2), 3);
        }
        if (((Boolean) this.i.getValue()).booleanValue()) {
            d(false);
            x97.y(mm6Var, null, null, new jtf(this, continuation, 3), 3);
        }
        if (b()) {
            e(false);
            x97.y(mm6Var, null, null, new jtf(this, continuation, 4), 3);
        }
        this.g = false;
        g(0L);
        this.l = s;
        xod xodVar = this.n;
        if (xodVar != null && (uodVar = this.b) != null) {
            uodVar.a(xodVar);
        }
        this.n = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void d(boolean z) {
        this.i.setValue(Boolean.valueOf(z));
    }

    public final void e(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
    }

    public final void f(boolean z) {
        this.h.setValue(Boolean.valueOf(z));
    }

    public final void g(long j) {
        this.q.setValue(new wpe(j));
    }
}
