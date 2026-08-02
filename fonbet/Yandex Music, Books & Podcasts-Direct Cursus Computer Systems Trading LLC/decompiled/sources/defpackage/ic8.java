package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ic8 {
    public final cc8 a;
    public final Function0 b;
    public String c;
    public boolean d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;
    public final Object l = btf.a(bwf.c, hc8.a);

    public ic8(cc8 cc8Var, cc8 cc8Var2) {
        this.a = cc8Var;
        this.b = cc8Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public final vwn a() {
        return (vwn) this.l.getValue();
    }

    public final void b() {
        long a;
        long longValue;
        Long l = this.e;
        Long l2 = this.f;
        Long l3 = this.g;
        vwn a2 = a();
        if (l != null) {
            if (l2 != null && l3 != null) {
                a = l2.longValue() + (vp4.a() - l3.longValue());
                longValue = l.longValue();
            } else if (l2 == null && l3 == null) {
                a = vp4.a();
                longValue = l.longValue();
            }
            a2.a = a - longValue;
            vyd.a((vyd) this.a.invoke(), this.c, null, 24);
        }
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final void c() {
        Long l = this.k;
        if (l != null) {
            a().e += vp4.a() - l.longValue();
        }
        if (this.d) {
            vwn a = a();
            vyd vydVar = (vyd) this.a.invoke();
            pwn pwnVar = (pwn) this.b.invoke();
            Math.max(a.a, a.b);
            vyd.a(vydVar, this.c, pwnVar.d, 8);
            vyd.a(vydVar, this.c, pwnVar.a, 8);
            vyd.a(vydVar, this.c, pwnVar.b, 8);
            vyd.a(vydVar, this.c, pwnVar.c, 8);
        }
        this.d = false;
        this.j = null;
        this.i = null;
        this.k = null;
        vwn a2 = a();
        a2.c = 0L;
        a2.d = 0L;
        a2.e = 0L;
        a2.a = 0L;
        a2.b = 0L;
    }

    public final void d() {
        Long l = this.h;
        vwn a = a();
        if (l != null) {
            a.b = vp4.a() - l.longValue();
            vyd.a((vyd) this.a.invoke(), this.c, null, 24);
        }
        this.h = null;
    }
}
