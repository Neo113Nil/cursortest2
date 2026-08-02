package defpackage;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.collections.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public final class wc61 extends r1r {
    public static final oq90 y;
    public final oq90 c;
    public final r1r w;
    public final LinkedHashMap x;

    static {
        String str = oq90.b;
        y = sms.f("/");
    }

    public wc61(oq90 oq90Var, r1r r1rVar, LinkedHashMap linkedHashMap) {
        this.c = oq90Var;
        this.w = r1rVar;
        this.x = linkedHashMap;
    }

    @Override // defpackage.r1r
    public final gfx B(oq90 oq90Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // defpackage.r1r
    public final uis0 D(oq90 oq90Var, boolean z) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.r1r
    public final y9t0 G(oq90 oq90Var) {
        Throwable th;
        jci0 jci0Var;
        oq90 oq90Var2 = y;
        oq90Var2.getClass();
        vc61 vc61Var = (vc61) this.x.get(g.b(oq90Var2, oq90Var, true));
        if (vc61Var == null) {
            yhl.h(oq90Var, "no such file: ");
            return null;
        }
        long j = vc61Var.f;
        gfx B = this.w.B(this.c);
        try {
            jci0Var = new jci0(B.a(vc61Var.h));
            try {
                B.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (B != null) {
                try {
                    B.close();
                } catch (Throwable th4) {
                    ljo.a(th3, th4);
                }
            }
            th = th3;
            jci0Var = null;
        }
        if (th != null) {
            throw th;
        }
        t1a1.i(jci0Var, null);
        return vc61Var.g == 0 ? new ler(jci0Var, j, true) : new ler(new usv(new ler(jci0Var, vc61Var.e, true), new Inflater(true)), j, false);
    }

    @Override // defpackage.r1r
    public final uis0 a(oq90 oq90Var) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.r1r
    public final void c(oq90 oq90Var, oq90 oq90Var2) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.r1r
    public final void e(oq90 oq90Var) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.r1r
    public final void k(oq90 oq90Var) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // defpackage.r1r
    public final List o(oq90 oq90Var) {
        oq90 oq90Var2 = y;
        oq90Var2.getClass();
        vc61 vc61Var = (vc61) this.x.get(g.b(oq90Var2, oq90Var, true));
        if (vc61Var != null) {
            return a.J0(vc61Var.q);
        }
        w511.h(oq90Var, "not a directory: ");
        return null;
    }

    @Override // defpackage.r1r
    public final m0r w(oq90 oq90Var) {
        boolean z;
        Long l;
        Long l2;
        Long l3;
        Long valueOf;
        Throwable th;
        Throwable th2;
        oq90 oq90Var2 = y;
        oq90Var2.getClass();
        vc61 vc61Var = (vc61) this.x.get(g.b(oq90Var2, oq90Var, true));
        if (vc61Var == null) {
            return null;
        }
        long j = vc61Var.h;
        if (j != -1) {
            gfx B = this.w.B(this.c);
            try {
                jci0 jci0Var = new jci0(B.a(j));
                try {
                    vc61Var = t1a1.i(jci0Var, vc61Var);
                    try {
                        jci0Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        jci0Var.close();
                    } catch (Throwable th5) {
                        ljo.a(th4, th5);
                    }
                    th2 = th4;
                    vc61Var = null;
                }
            } catch (Throwable th6) {
                if (B != null) {
                    try {
                        B.close();
                    } catch (Throwable th7) {
                        ljo.a(th6, th7);
                    }
                }
                th = th6;
                vc61Var = null;
            }
            if (th2 != null) {
                throw th2;
            }
            try {
                B.close();
                th = null;
            } catch (Throwable th8) {
                th = th8;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z2 = vc61Var.b;
        boolean z3 = !z2;
        Long valueOf2 = z2 ? null : Long.valueOf(vc61Var.f);
        Long l4 = vc61Var.m;
        if (l4 != null) {
            l = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
            z = true;
        } else {
            if (vc61Var.p != null) {
                z = true;
                l = Long.valueOf(r0.intValue() * 1000);
            } else {
                z = true;
                l = null;
            }
        }
        Long l5 = vc61Var.k;
        if (l5 != null) {
            l2 = Long.valueOf((l5.longValue() / 10000) - 11644473600000L);
        } else {
            if (vc61Var.n != null) {
                l2 = Long.valueOf(r2.intValue() * 1000);
            } else {
                int i = vc61Var.j;
                if (i != -1) {
                    int i2 = vc61Var.i;
                    if (i != -1) {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & HProv.PP_VERSION_TIMESTAMP) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        l2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                }
                l2 = null;
            }
        }
        Long l6 = vc61Var.l;
        if (l6 != null) {
            valueOf = Long.valueOf((l6.longValue() / 10000) - 11644473600000L);
        } else {
            if (vc61Var.o == null) {
                l3 = null;
                return new m0r(z3, z2, (oq90) null, valueOf2, l, l2, l3, 128);
            }
            valueOf = Long.valueOf(r1.intValue() * 1000);
        }
        l3 = valueOf;
        return new m0r(z3, z2, (oq90) null, valueOf2, l, l2, l3, 128);
    }
}
