package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class gbs {
    public final mn0 a;
    public final long b;
    public final cds c;
    public final mnj d;
    public final pds e;
    public long f;
    public final mn0 g;
    public final ybs h;
    public final dds i;

    public gbs(ybs ybsVar, mnj mnjVar, dds ddsVar, pds pdsVar) {
        mn0 mn0Var = ybsVar.a;
        long j = ybsVar.b;
        cds cdsVar = ddsVar != null ? ddsVar.a : null;
        this.a = mn0Var;
        this.b = j;
        this.c = cdsVar;
        this.d = mnjVar;
        this.e = pdsVar;
        this.f = j;
        this.g = mn0Var;
        this.h = ybsVar;
        this.i = ddsVar;
    }

    public final List a(Function1 function1) {
        if (!rds.b(this.f)) {
            return u75.h(new vb5("", 0), new hop(rds.e(this.f), rds.e(this.f)));
        }
        i1b i1bVar = (i1b) function1.invoke(this);
        if (i1bVar != null) {
            return t75.c(i1bVar);
        }
        return null;
    }

    public final Integer b() {
        cds cdsVar = this.c;
        if (cdsVar == null) {
            return null;
        }
        ogi ogiVar = cdsVar.b;
        int d = rds.d(this.f);
        mnj mnjVar = this.d;
        return Integer.valueOf(mnjVar.c(ogiVar.d(ogiVar.e(mnjVar.d(d)), true)));
    }

    public final Integer c() {
        cds cdsVar = this.c;
        if (cdsVar == null) {
            return null;
        }
        int e = rds.e(this.f);
        mnj mnjVar = this.d;
        return Integer.valueOf(mnjVar.c(cdsVar.e(cdsVar.b.e(mnjVar.d(e)))));
    }

    public final Integer d() {
        int length;
        cds cdsVar = this.c;
        if (cdsVar == null) {
            return null;
        }
        int q = q();
        while (true) {
            mn0 mn0Var = this.a;
            if (q < mn0Var.b.length()) {
                int length2 = this.g.b.length() - 1;
                if (q <= length2) {
                    length2 = q;
                }
                long h = cdsVar.h(length2);
                int i = rds.c;
                int i2 = (int) (h & 4294967295L);
                if (i2 > q) {
                    length = this.d.c(i2);
                    break;
                }
                q++;
            } else {
                length = mn0Var.b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int i;
        cds cdsVar = this.c;
        if (cdsVar == null) {
            return null;
        }
        int q = q();
        while (true) {
            if (q <= 0) {
                i = 0;
                break;
            }
            int length = this.g.b.length() - 1;
            if (q <= length) {
                length = q;
            }
            long h = cdsVar.h(length);
            int i2 = rds.c;
            int i3 = (int) (h >> 32);
            if (i3 < q) {
                i = this.d.c(i3);
                break;
            }
            q--;
        }
        return Integer.valueOf(i);
    }

    public final boolean f() {
        cds cdsVar = this.c;
        return (cdsVar != null ? cdsVar.f(q()) : null) != i2o.b;
    }

    public final int g(cds cdsVar, int i) {
        int q = q();
        pds pdsVar = this.e;
        if (pdsVar.a == null) {
            pdsVar.a = Float.valueOf(cdsVar.b.b(q).a);
        }
        ogi ogiVar = cdsVar.b;
        int e = ogiVar.e(q) + i;
        if (e < 0) {
            return 0;
        }
        if (e >= ogiVar.f) {
            return this.g.b.length();
        }
        float c = ogiVar.c(e) - 1;
        Float f = pdsVar.a;
        f.getClass();
        float floatValue = f.floatValue();
        if ((f() && floatValue >= cdsVar.d(e)) || (!f() && floatValue <= ogiVar.g(e))) {
            return ogiVar.d(e, true);
        }
        return this.d.c(ogiVar.i((Float.floatToRawIntBits(c) & 4294967295L) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r9 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(dds ddsVar, int i) {
        ynn ynnVar;
        wof wofVar = ddsVar.b;
        ogi ogiVar = ddsVar.a.b;
        if (wofVar != null) {
            wof wofVar2 = ddsVar.c;
            ynnVar = wofVar2 != null ? wofVar2.y(wofVar, true) : null;
        }
        ynnVar = ynn.e;
        long j = this.h.b;
        int i2 = rds.c;
        int i3 = (int) (j & 4294967295L);
        mnj mnjVar = this.d;
        float f = ogiVar.b(mnjVar.d(i3)).a;
        return mnjVar.c(ogiVar.i((Float.floatToRawIntBits((Float.intBitsToFloat((int) (ynnVar.e() & 4294967295L)) * i) + r0.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void i() {
        pds pdsVar = this.e;
        pdsVar.a = null;
        mn0 mn0Var = this.g;
        if (mn0Var.b.length() > 0) {
            if (f()) {
                pdsVar.a = null;
                if (mn0Var.b.length() > 0) {
                    String str = mn0Var.b;
                    long j = this.f;
                    int i = rds.c;
                    int M = qgg.M((int) (j & 4294967295L), str);
                    if (M != -1) {
                        p(M, M);
                        return;
                    }
                    return;
                }
                return;
            }
            pdsVar.a = null;
            if (mn0Var.b.length() > 0) {
                String str2 = mn0Var.b;
                long j2 = this.f;
                int i2 = rds.c;
                int L = qgg.L((int) (j2 & 4294967295L), str2);
                if (L != -1) {
                    p(L, L);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        mn0 mn0Var = this.g;
        String str = mn0Var.b;
        String str2 = mn0Var.b;
        if (str.length() > 0) {
            int s = ngg.s(rds.d(this.f), str2);
            if (s == rds.d(this.f) && s != str2.length()) {
                s = ngg.s(s + 1, str2);
            }
            p(s, s);
        }
    }

    public final void k() {
        this.e.a = null;
        mn0 mn0Var = this.g;
        String str = mn0Var.b;
        String str2 = mn0Var.b;
        if (str.length() > 0) {
            int t = ngg.t(rds.e(this.f), str2);
            if (t == rds.e(this.f) && t != 0) {
                t = ngg.t(t - 1, str2);
            }
            p(t, t);
        }
    }

    public final void l() {
        pds pdsVar = this.e;
        pdsVar.a = null;
        mn0 mn0Var = this.g;
        if (mn0Var.b.length() > 0) {
            if (f()) {
                pdsVar.a = null;
                if (mn0Var.b.length() > 0) {
                    String str = mn0Var.b;
                    long j = this.f;
                    int i = rds.c;
                    int L = qgg.L((int) (j & 4294967295L), str);
                    if (L != -1) {
                        p(L, L);
                        return;
                    }
                    return;
                }
                return;
            }
            pdsVar.a = null;
            if (mn0Var.b.length() > 0) {
                String str2 = mn0Var.b;
                long j2 = this.f;
                int i2 = rds.c;
                int M = qgg.M((int) (j2 & 4294967295L), str2);
                if (M != -1) {
                    p(M, M);
                }
            }
        }
    }

    public final void m() {
        Integer b;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (b = b()) == null) {
            return;
        }
        int intValue = b.intValue();
        p(intValue, intValue);
    }

    public final void n() {
        Integer c;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (c = c()) == null) {
            return;
        }
        int intValue = c.intValue();
        p(intValue, intValue);
    }

    public final void o() {
        if (this.g.b.length() > 0) {
            int i = rds.c;
            this.f = y5g.P((int) (this.b >> 32), (int) (this.f & 4294967295L));
        }
    }

    public final void p(int i, int i2) {
        this.f = y5g.P(i, i2);
    }

    public final int q() {
        long j = this.f;
        int i = rds.c;
        return this.d.d((int) (j & 4294967295L));
    }
}
