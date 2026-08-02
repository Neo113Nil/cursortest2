package ru.yandex.taxi.communications.ticket.ui.component;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import defpackage.a3z0;
import defpackage.a740;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b3z0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.d3z0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.dwh0;
import defpackage.f4z0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.hex0;
import defpackage.jeb1;
import defpackage.khl0;
import defpackage.kyh0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.n;
import defpackage.nvs0;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sic;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.u2z0;
import defpackage.unr0;
import defpackage.vfc;
import defpackage.vti0;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.y7m;
import defpackage.z910;
import defpackage.zhb0;
import defpackage.zpn;
import defpackage.zy11;
import java.util.Calendar;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.communications.ticket.ui.component.b;

/* loaded from: classes5.dex */
public abstract class b {
    public static final void a(wp2 wp2Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-699790826);
        if ((i & 6) == 0) {
            i2 = i | (btsVar2.k(wp2Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar = btsVar2;
            jeb1.f(":", an91.o(an91.m(c530.a, 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), wp2Var, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.b(btsVar2).h, btsVar, ((i2 << 6) & 896) | 54, 0, 16376);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a740(wp2Var, i);
        }
    }

    public static final void b(vti0 vti0Var, wp2 wp2Var, wp2 wp2Var2, wp2 wp2Var3, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-112811892);
        int i2 = i | (btsVar.k(vti0Var) ? 4 : 2) | (btsVar.k(wp2Var) ? 32 : 16) | (btsVar.k(wp2Var2) ? 256 : 128) | (btsVar.k(wp2Var3) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            lhl0 a = khl0.a(lr20.e, x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c530.a);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            int i3 = vti0Var.a;
            int i4 = 65408 & (i2 << 3);
            h(i3, ohb1.c(dwh0.biletic_date_format_days, i3, btsVar), wp2Var, wp2Var2, wp2Var3, false, btsVar, i4, 32);
            int i5 = (i2 >> 3) & 14;
            a(wp2Var, btsVar, i5);
            int i6 = vti0Var.b;
            h(i6, ohb1.c(dwh0.biletic_date_format_hours, i6, btsVar), wp2Var, wp2Var2, wp2Var3, false, btsVar, i4, 32);
            a(wp2Var, btsVar, i5);
            h(vti0Var.c, ohb1.e(btsVar, kyh0.biletic_date_format_min), wp2Var, wp2Var2, wp2Var3, false, btsVar, i4, 32);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d3z0(vti0Var, wp2Var, wp2Var2, wp2Var3, i, 0);
        }
    }

    public static final void c(String str, wp2 wp2Var, wp2 wp2Var2, fid fidVar, int i) {
        String str2;
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1871247333);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (btsVar.k(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(wp2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(wp2Var2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 b = m4m0.b(ljs0.n(c530.a, 26.0f, 42.0f), tje.n(wp2Var2, btsVar), cyk0.c(8.0f));
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            jeb1.f(str2, null, wp2Var, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.b(btsVar).i, btsVar, (i2 & 14) | ((i2 << 3) & 896), 0, 16378);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(str, wp2Var, wp2Var2, i, 0);
        }
    }

    public static final void d(f530 f530Var, u2z0 u2z0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(941074485);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.k(u2z0Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 o = an91.o(ljs0.c(f530Var, 1.0f), 0.0f, 12.0f, 0.0f, 4.0f, 5);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            jeb1.f(u2z0Var.a, null, u2z0Var.b, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 0, 0, 16378);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hex0(i, 11, f530Var, u2z0Var);
        }
    }

    public static final void e(vti0 vti0Var, wp2 wp2Var, wp2 wp2Var2, wp2 wp2Var3, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(501087072);
        int i2 = i | (btsVar.k(vti0Var) ? 4 : 2) | (btsVar.k(wp2Var) ? 32 : 16) | (btsVar.k(wp2Var2) ? 256 : 128) | (btsVar.k(wp2Var3) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            lhl0 a = khl0.a(lr20.e, x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c530.a);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            int i3 = vti0Var.b;
            int i4 = 65408 & (i2 << 3);
            h(i3, ohb1.c(dwh0.biletic_date_format_hours, i3, btsVar), wp2Var, wp2Var2, wp2Var3, false, btsVar, i4, 32);
            int i5 = (i2 >> 3) & 14;
            a(wp2Var, btsVar, i5);
            h(vti0Var.c, ohb1.e(btsVar, kyh0.biletic_date_format_min), wp2Var, wp2Var2, wp2Var3, false, btsVar, i4, 32);
            a(wp2Var, btsVar, i5);
            h(vti0Var.d, ohb1.e(btsVar, kyh0.biletic_date_format_sec), wp2Var, wp2Var2, wp2Var3, false, btsVar, i4, 32);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d3z0(vti0Var, wp2Var, wp2Var2, wp2Var3, i, 2);
        }
    }

    public static final void f(vti0 vti0Var, wp2 wp2Var, wp2 wp2Var2, wp2 wp2Var3, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-935230495);
        int i2 = i | (btsVar.k(vti0Var) ? 4 : 2) | (btsVar.k(wp2Var) ? 32 : 16) | (btsVar.k(wp2Var2) ? 256 : 128) | (btsVar.k(wp2Var3) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            lhl0 a = khl0.a(lr20.e, x4c.E, btsVar, 54);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c530.a);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            int i3 = vti0Var.c;
            String e = ohb1.e(btsVar, kyh0.biletic_date_format_min);
            int i4 = i2 << 3;
            int i5 = i4 & HProv.ALG_CLASS_ALL;
            int i6 = 65408 & i4;
            h(i3, e, wp2Var, wp2Var2, wp2Var3, false, btsVar, i6, 32);
            int i7 = (i2 >> 3) & 14;
            a(wp2Var, btsVar, i7);
            h(vti0Var.d, ohb1.e(btsVar, kyh0.biletic_date_format_sec), wp2Var, wp2Var2, wp2Var3, false, btsVar, i6, 32);
            a(wp2Var, btsVar, i7);
            h(vti0Var.e, ohb1.e(btsVar, kyh0.biletic_date_format_ms), wp2Var, wp2Var2, wp2Var3, true, btsVar, 196608 | (i4 & 896) | (i4 & 7168) | i5, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d3z0(vti0Var, wp2Var, wp2Var2, wp2Var3, i, 1);
        }
    }

    public static final void g(f530 f530Var, f4z0 f4z0Var, Calendar calendar, fid fidVar, int i) {
        bts btsVar;
        Object ticketTimerKt$TicketTimer$1$1;
        oz40 oz40Var;
        oz40 oz40Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1402038034);
        int i2 = i | 6 | (btsVar2.k(f4z0Var) ? 32 : 16) | (btsVar2.e(calendar) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(Calendar.getInstance());
                btsVar2.o0(Q);
            }
            oz40 oz40Var3 = (oz40) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(Boolean.FALSE);
                btsVar2.o0(Q2);
            }
            oz40 oz40Var4 = (oz40) Q2;
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = f.j(Boolean.FALSE);
                btsVar2.o0(Q3);
            }
            oz40 oz40Var5 = (oz40) Q3;
            float density = ((fwi) btsVar2.m(j.h)).getDensity();
            Object Q4 = btsVar2.Q();
            if (Q4 == o430Var) {
                Q4 = f.j(new y7m(74.0f));
                btsVar2.o0(Q4);
            }
            oz40 oz40Var6 = (oz40) Q4;
            boolean e = btsVar2.e(calendar) | ((i2 & 112) == 32);
            Object Q5 = btsVar2.Q();
            if (e || Q5 == o430Var) {
                oz40Var = oz40Var3;
                ticketTimerKt$TicketTimer$1$1 = new TicketTimerKt$TicketTimer$1$1(f4z0Var, calendar, oz40Var, oz40Var4, oz40Var5, null);
                oz40Var2 = oz40Var5;
                btsVar2.o0(ticketTimerKt$TicketTimer$1$1);
            } else {
                oz40Var2 = oz40Var5;
                ticketTimerKt$TicketTimer$1$1 = Q5;
                oz40Var = oz40Var3;
            }
            zpn.e(btsVar2, (wls) ticketTimerKt$TicketTimer$1$1, zy11.a);
            btsVar = btsVar2;
            g.e(((Boolean) oz40Var4.getValue()).booleanValue(), null, k.e(null, 3), k.f(null, 3), null, wwg.S(1778004282, true, new a3z0(oz40Var2, f4z0Var, density, calendar, oz40Var6, oz40Var), btsVar2), btsVar, 200064, 18);
            f530Var = c530.a;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        f530 f530Var2 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0(f530Var2, f4z0Var, calendar, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final int i, final String str, final wp2 wp2Var, final wp2 wp2Var2, final wp2 wp2Var3, boolean z, fid fidVar, final int i2, final int i3) {
        int i4;
        boolean z2;
        final boolean z3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1128697372);
        dmw0 dmw0Var = btsVar.a;
        if ((i2 & 6) == 0) {
            i4 = (btsVar.c(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= btsVar.k(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= btsVar.k(wp2Var) ? 256 : 128;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar.k(wp2Var2) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar.k(wp2Var3) ? 16384 : 8192;
        }
        int i5 = i3 & 32;
        if (i5 != 0) {
            i4 |= ImageMetadata.EDGE_MODE;
        } else if ((196608 & i2) == 0) {
            z2 = z;
            i4 |= btsVar.a(z2) ? 131072 : 65536;
            if (btsVar.V(i4 & 1, (74899 & i4) == 74898)) {
                btsVar.Y();
                z3 = z2;
            } else {
                boolean z4 = i5 != 0 ? false : z2;
                int i6 = i4 & 14;
                boolean z5 = i6 == 4;
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (z5 || Q == o430Var) {
                    Q = String.valueOf(z4 ? 0 : i / 10);
                    btsVar.o0(Q);
                }
                String str2 = (String) Q;
                boolean z6 = i6 == 4;
                Object Q2 = btsVar.Q();
                if (z6 || Q2 == o430Var) {
                    Q2 = String.valueOf(i % 10);
                    btsVar.o0(Q2);
                }
                String str3 = (String) Q2;
                sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                c530 c530Var = c530.a;
                f530 d = androidx.compose.ui.b.d(btsVar, c530Var);
                ohd.G1.getClass();
                sls slsVar = d.b;
                if (dmw0Var == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                wls wlsVar = d.f;
                qje.W(btsVar, wlsVar, a);
                wls wlsVar2 = d.e;
                qje.W(btsVar, wlsVar2, o);
                Integer valueOf = Integer.valueOf(hashCode);
                wls wlsVar3 = d.g;
                qje.W(btsVar, wlsVar3, valueOf);
                tls tlsVar = d.h;
                qje.M(btsVar, tlsVar);
                wls wlsVar4 = d.d;
                qje.W(btsVar, wlsVar4, d);
                lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
                btsVar.i0();
                int i7 = i4;
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, a2);
                qje.W(btsVar, wlsVar2, o2);
                vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
                qje.W(btsVar, wlsVar4, d2);
                int i8 = (i7 >> 6) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND;
                c(str2, wp2Var2, wp2Var3, btsVar, i8);
                oeb1.c(btsVar, ljs0.q(c530Var, 4.0f));
                c(str3, wp2Var2, wp2Var3, btsVar, i8);
                n.y(btsVar, true, c530Var, 4.0f, btsVar);
                jeb1.f(str, null, wp2Var, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).i.a, btsVar, ((i7 >> 3) & 14) | (i7 & 896), 0, 16378);
                btsVar.t(true);
                z3 = z4;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: e3z0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b.h(i, str, wp2Var, wp2Var2, wp2Var3, z3, (fid) obj, vng.O(i2 | 1), i3);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if (btsVar.V(i4 & 1, (74899 & i4) == 74898)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void i(f530 f530Var, Calendar calendar, Calendar calendar2, f4z0 f4z0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1160631065);
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.e(calendar) ? 32 : 16) | (btsVar.e(calendar2) ? 256 : 128) | (btsVar.k(f4z0Var) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            vti0 j = j(calendar, calendar2);
            TimerFormat timerFormat = j.a > 0 ? TimerFormat.DAYS_HOURS_MINUTES : j.b > 0 ? TimerFormat.HOURS_MINUTES_SECONDS : TimerFormat.MINUTES_SECONDS_MILLISECONDS;
            f530 o = an91.o(ljs0.c(f530Var, 1.0f), 0.0f, 12.0f, 0.0f, 4.0f, 5);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, o);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            int i3 = a.a[timerFormat.ordinal()];
            if (i3 == 1) {
                btsVar.e0(827439092);
                b(j, f4z0Var.b, f4z0Var.c, f4z0Var.d, btsVar, 0);
                btsVar.t(false);
            } else if (i3 == 2) {
                btsVar.e0(827701073);
                e(j, f4z0Var.b, f4z0Var.c, f4z0Var.d, btsVar, 0);
                btsVar.t(false);
            } else {
                if (i3 != 3) {
                    throw unr0.y(-1635877739, btsVar, false);
                }
                btsVar.e0(827973098);
                f(j, f4z0Var.b, f4z0Var.c, f4z0Var.d, btsVar, 0);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(f530Var, calendar, calendar2, f4z0Var, i, 22);
        }
    }

    public static final vti0 j(Calendar calendar, Calendar calendar2) {
        long timeInMillis = calendar2.getTimeInMillis() - calendar.getTimeInMillis();
        return timeInMillis <= 0 ? new vti0(0, 0, 0, 0, 0) : new vti0((int) (timeInMillis / 86400000), (int) ((timeInMillis % 86400000) / 3600000), (int) ((timeInMillis % 3600000) / 60000), (int) ((timeInMillis % 60000) / 1000), (int) (timeInMillis % 1000));
    }
}
