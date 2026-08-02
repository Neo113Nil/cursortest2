package ru.yandex.taxi.logistics.sdk.payment_method_selector.ui;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bd90;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.dk91;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fj5;
import defpackage.fnq0;
import defpackage.gl51;
import defpackage.hi91;
import defpackage.i7a0;
import defpackage.j7a0;
import defpackage.jk30;
import defpackage.jl40;
import defpackage.kq5;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lzr;
import defpackage.o7a0;
import defpackage.o990;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.p7a0;
import defpackage.q7a0;
import defpackage.qic;
import defpackage.qje;
import defpackage.qm51;
import defpackage.r1b0;
import defpackage.sc20;
import defpackage.scc;
import defpackage.sic;
import defpackage.sls;
import defpackage.teb;
import defpackage.tfx;
import defpackage.tls;
import defpackage.u290;
import defpackage.u3b1;
import defpackage.v4v;
import defpackage.web1;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.ymb1;
import java.util.ArrayList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(String str, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-226476298);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.a(slsVar, ljs0.c(ljs0.e(an91.k(c530.a, 8.0f), 56.0f), 1.0f), ((YandexShapes) btsVar.m(qm51.a)).b(), 0L, 0L, null, false, null, null, null, wwg.S(1774527647, true, new jk30(str, 5), btsVar), btsVar, (i2 >> 3) & 14, 4088);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fj5(i, 4, slsVar, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final void b(ArrayList arrayList, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1598504282);
        int i3 = i | (btsVar.e(arrayList) ? 4 : 2);
        final int i4 = 0;
        final ?? r6 = 1;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            Object Q = btsVar.Q();
            Object obj = did.a;
            Object obj2 = Q;
            if (Q == obj) {
                Object tebVar = new teb(20);
                btsVar.o0(tebVar);
                obj2 = tebVar;
            }
            c530 c530Var = c530.a;
            f530 b = fnq0.b(c530Var, true, (tls) obj2);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, b);
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
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            btsVar.e0(-1106278832);
            int i5 = 0;
            for (Object obj3 : arrayList) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    scc.m();
                    throw null;
                }
                final o7a0 o7a0Var = (o7a0) obj3;
                boolean k = btsVar.k(o7a0Var);
                Object Q2 = btsVar.Q();
                Object obj4 = Q2;
                if (k || Q2 == obj) {
                    Object u290Var = new u290(17, o7a0Var);
                    btsVar.o0(u290Var);
                    obj4 = u290Var;
                }
                Object obj5 = obj;
                c530 c530Var2 = c530Var;
                boolean z = i4;
                int i7 = i5;
                web1.c(fnq0.a(c530Var, (tls) obj4), 0.0f, false, 0.0f, null, wwg.S(-883054063, r6, new wls() { // from class: k7a0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj6, Object obj7) {
                        int i8 = i4;
                        zy11 zy11Var = zy11.a;
                        o7a0 o7a0Var2 = o7a0Var;
                        switch (i8) {
                            case 0:
                                fid fidVar2 = (fid) obj6;
                                int intValue = ((Integer) obj7).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    s3b1.f(o7a0Var2.c, null, null, btsVar2, 0, 6);
                                    break;
                                }
                            default:
                                fid fidVar3 = (fid) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    web1.e(null, null, null, o7a0Var2.a, null, 0L, null, null, null, 0, false, 0, null, o7a0Var2.b, null, null, null, null, false, 0L, 0, false, 0, false, null, false, btsVar3, 0, 0, 0, 268402679);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), wwg.S(-2114346606, r6, new wls() { // from class: k7a0
                    @Override // defpackage.wls
                    public final Object invoke(Object obj6, Object obj7) {
                        int i8 = r6;
                        zy11 zy11Var = zy11.a;
                        o7a0 o7a0Var2 = o7a0Var;
                        switch (i8) {
                            case 0:
                                fid fidVar2 = (fid) obj6;
                                int intValue = ((Integer) obj7).intValue();
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    s3b1.f(o7a0Var2.c, null, null, btsVar2, 0, 6);
                                    break;
                                }
                            default:
                                fid fidVar3 = (fid) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    web1.e(null, null, null, o7a0Var2.a, null, 0L, null, null, null, 0, false, 0, null, o7a0Var2.b, null, null, null, null, false, 0L, 0, false, 0, false, null, false, btsVar3, 0, 0, 0, 268402679);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, null, null, null, null, false, btsVar, 1769472, 0, 8094);
                if (i7 != scc.f(arrayList)) {
                    btsVar.e0(411443408);
                    dk91.a(0.0f, 6, 6, 0L, btsVar, an91.o(c530Var2, 56.0f, 0.0f, 16.0f, 0.0f, 10));
                    btsVar.t(z);
                } else {
                    btsVar.e0(411539508);
                    btsVar.t(z);
                }
                i4 = z ? 1 : 0;
                i5 = i6;
                c530Var = c530Var2;
                obj = obj5;
                r6 = 1;
            }
            boolean z2 = i4;
            btsVar.t(z2);
            btsVar.t(true);
            i2 = z2;
        } else {
            i2 = 0;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i7a0(i, i2, arrayList);
        }
    }

    public static final void c(q7a0 q7a0Var, fid fidVar, int i) {
        q7a0 q7a0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1283455437);
        int i2 = (btsVar.e(q7a0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            p7a0 p7a0Var = (p7a0) f.b(q7a0Var.c, btsVar).getValue();
            boolean e = btsVar.e(q7a0Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                q7a0Var2 = q7a0Var;
                PaymentMethodSelectorKt$PaymentMethodSelector$1$1 paymentMethodSelectorKt$PaymentMethodSelector$1$1 = new PaymentMethodSelectorKt$PaymentMethodSelector$1$1(0, q7a0Var2, q7a0.class, "onDoneButtonClick", "onDoneButtonClick()V", 0);
                btsVar.o0(paymentMethodSelectorKt$PaymentMethodSelector$1$1);
                Q = paymentMethodSelectorKt$PaymentMethodSelector$1$1;
            } else {
                q7a0Var2 = q7a0Var;
            }
            d(p7a0Var, (sls) ((tfx) Q), btsVar, 0);
        } else {
            q7a0Var2 = q7a0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sc20(q7a0Var2, i, 26);
        }
    }

    public static final void d(p7a0 p7a0Var, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1979058419);
        int i2 = (btsVar.e(p7a0Var) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            v4v v4vVar = p7a0Var.c;
            if (v4vVar == null) {
                btsVar.e0(52554958);
                btsVar.t(false);
            } else {
                btsVar.e0(52554959);
                u3b1.g(an91.o(c530Var, 10.0f, 10.0f, 0.0f, 8.0f, 4), 0.0f, ((el51) btsVar.m(gl51.a)).g(), 0.0f, wwg.S(-491791116, true, new j7a0(v4vVar, 0), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 10);
                btsVar.t(false);
            }
            e(p7a0Var.a, p7a0Var.b, btsVar, 0);
            oeb1.c(btsVar, ljs0.e(c530Var, 12.0f));
            b(p7a0Var.e, btsVar, 0);
            a(p7a0Var.d, slsVar, btsVar, i2 & 112);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o990(p7a0Var, slsVar, i, 1);
        }
    }

    public static final void e(String str, String str2, fid fidVar, int i) {
        String str3;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-748956639);
        int i2 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.k(str2) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 d = hi91.d(c530Var, true, null, 2);
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new bd90(18);
                btsVar2.o0(Q);
            }
            f530 b = fnq0.b(d, true, (tls) Q);
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = b.d(btsVar2, b);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, d.f, a);
            qje.W(btsVar2, d.e, o);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d2);
            ymb1.j(str, an91.m(c530Var, 16.0f, 0.0f, 2), 0L, null, lzr.G, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar2, (i2 & 14) | 24624, 0, 65516);
            if (str2 == null) {
                btsVar2.e0(-1071050059);
                btsVar2.t(false);
                btsVar = btsVar2;
                str3 = str2;
            } else {
                btsVar2.e0(-1071050058);
                str3 = str2;
                ymb1.e(str3, an91.m(c530Var, 16.0f, 0.0f, 2), 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar2, 48, 0, 65532);
                btsVar = btsVar2;
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            str3 = str2;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kq5(str, str3, i, 10);
        }
    }
}
