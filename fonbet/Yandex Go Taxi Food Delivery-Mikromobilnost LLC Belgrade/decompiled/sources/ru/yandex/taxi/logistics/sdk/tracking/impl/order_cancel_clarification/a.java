package ru.yandex.taxi.logistics.sdk.tracking.impl.order_cancel_clarification;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.fk70;
import defpackage.i43;
import defpackage.iu30;
import defpackage.jk70;
import defpackage.jl40;
import defpackage.khl0;
import defpackage.kq5;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.lzr;
import defpackage.ml70;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ohd;
import defpackage.qic;
import defpackage.qje;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.sc20;
import defpackage.sic;
import defpackage.sls;
import defpackage.t240;
import defpackage.tfx;
import defpackage.uh6;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.ymb1;
import defpackage.zj70;
import defpackage.zls;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r3v13, types: [bts] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17, types: [bts] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public static final void a(ArrayList arrayList, final wls wlsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        int i2;
        int i3;
        ?? r0;
        final ?? r4;
        boolean z;
        ?? r3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1623887222);
        int i4 = 32;
        f530 f530Var2 = f530Var;
        int i5 = i | (btsVar2.e(arrayList) ? 4 : 2) | (btsVar2.e(wlsVar) ? 32 : 16) | (btsVar2.k(f530Var2) ? 256 : 128);
        final int i6 = 0;
        ?? r9 = 1;
        if (btsVar2.V(i5 & 1, (i5 & 147) != 146)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final ml70 ml70Var = (ml70) it.next();
                boolean z2 = ml70Var.b;
                o430 o430Var = did.a;
                if (z2) {
                    btsVar2.e0(-1717048255);
                    String str = ml70Var.a;
                    int i7 = ((i5 & 112) == i4 ? r9 : i6) | (btsVar2.k(ml70Var) ? 1 : 0);
                    Object Q = btsVar2.Q();
                    if (i7 != 0 || Q == o430Var) {
                        Q = new sls() { // from class: ak70
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i8 = i6;
                                zy11 zy11Var = zy11.a;
                                ml70 ml70Var2 = ml70Var;
                                wls wlsVar2 = wlsVar;
                                switch (i8) {
                                    case 0:
                                        wlsVar2.invoke(ml70Var2.c, ml70Var2.d);
                                        break;
                                    default:
                                        wlsVar2.invoke(ml70Var2.c, ml70Var2.d);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar2.o0(Q);
                    }
                    i3 = i4;
                    i2 = i5;
                    bts btsVar3 = btsVar2;
                    r0 = i6;
                    ru.yandex.taxi.logistics.sdk.ui.component.control.a.a((sls) Q, f530Var2, null, 0L, 0L, null, false, str, null, null, wwg.S(-1934713734, r9, new zls() { // from class: bk70
                        @Override // defpackage.zls
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i8 = i6;
                            zy11 zy11Var = zy11.a;
                            ml70 ml70Var2 = ml70Var;
                            switch (i8) {
                                case 0:
                                    fid fidVar2 = (fid) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    bts btsVar4 = (bts) fidVar2;
                                    if (!btsVar4.V(intValue & 1, (intValue & 17) != 16)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        ymb1.e(ml70Var2.a, null, ((el51) btsVar4.m(gl51.a)).p(), null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar4, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65514);
                                        break;
                                    }
                                default:
                                    fid fidVar3 = (fid) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    bts btsVar5 = (bts) fidVar3;
                                    if (!btsVar5.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        btsVar5.Y();
                                        break;
                                    } else {
                                        ymb1.e(ml70Var2.a, null, ((el51) btsVar5.m(gl51.a)).q(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar5, 0, 0, 65530);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }, btsVar2), btsVar3, (i5 >> 3) & 112, 3580);
                    r3 = btsVar3;
                    r3.t(r0);
                    z = true;
                } else {
                    i2 = i5;
                    i3 = i4;
                    bts btsVar4 = btsVar2;
                    r0 = i6;
                    btsVar4.e0(-1716618533);
                    String str2 = ml70Var.a;
                    boolean k = btsVar4.k(ml70Var) | ((i2 & 112) == i3 ? true : r0 == true ? 1 : 0);
                    Object Q2 = btsVar4.Q();
                    if (k || Q2 == o430Var) {
                        r4 = 1;
                        final ?? r42 = 1 == true ? 1 : 0;
                        Q2 = new sls() { // from class: ak70
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i8 = r42;
                                zy11 zy11Var = zy11.a;
                                ml70 ml70Var2 = ml70Var;
                                wls wlsVar2 = wlsVar;
                                switch (i8) {
                                    case 0:
                                        wlsVar2.invoke(ml70Var2.c, ml70Var2.d);
                                        break;
                                    default:
                                        wlsVar2.invoke(ml70Var2.c, ml70Var2.d);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar4.o0(Q2);
                    } else {
                        r4 = 1;
                    }
                    z = r4;
                    ru.yandex.taxi.logistics.sdk.ui.component.control.a.b((sls) Q2, f530Var, null, 0L, 0L, null, null, null, false, str2, null, null, wwg.S(-72893849, r4, new zls() { // from class: bk70
                        @Override // defpackage.zls
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            int i8 = r4;
                            zy11 zy11Var = zy11.a;
                            ml70 ml70Var2 = ml70Var;
                            switch (i8) {
                                case 0:
                                    fid fidVar2 = (fid) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    bts btsVar42 = (bts) fidVar2;
                                    if (!btsVar42.V(intValue & 1, (intValue & 17) != 16)) {
                                        btsVar42.Y();
                                        break;
                                    } else {
                                        ymb1.e(ml70Var2.a, null, ((el51) btsVar42.m(gl51.a)).p(), null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar42, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65514);
                                        break;
                                    }
                                default:
                                    fid fidVar3 = (fid) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    bts btsVar5 = (bts) fidVar3;
                                    if (!btsVar5.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        btsVar5.Y();
                                        break;
                                    } else {
                                        ymb1.e(ml70Var2.a, null, ((el51) btsVar5.m(gl51.a)).q(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar5, 0, 0, 65530);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }, btsVar4), btsVar4, (i2 >> 3) & 112, 384, 3580);
                    r3 = btsVar4;
                    r3.t(r0);
                }
                f530Var2 = f530Var;
                i6 = r0;
                i4 = i3;
                btsVar2 = r3;
                i5 = i2;
                r9 = z;
            }
            btsVar = btsVar2;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240(arrayList, wlsVar, f530Var, i, 18);
        }
    }

    public static final void b(ArrayList arrayList, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(862904659);
        int i2 = (btsVar.e(arrayList) ? 4 : 2) | i | (btsVar.e(wlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(c530Var, 8.0f, 0.0f, 2);
            sic a = qic.a(new i43(4.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, d.d, d);
            a(arrayList, wlsVar, ljs0.c(ljs0.e(c530Var, 56.0f), 1.0f), btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zj70(arrayList, wlsVar, i, 1);
        }
    }

    public static final void c(ArrayList arrayList, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-929436651);
        int i2 = (btsVar.e(arrayList) ? 4 : 2) | i | (btsVar.e(wlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(c530Var, 8.0f, 0.0f, 2);
            lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, d.d, d);
            a(arrayList, wlsVar, ljs0.e(c530Var, 56.0f).k(new x2y(1.0f, true)), btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zj70(arrayList, wlsVar, i, 0);
        }
    }

    public static final void d(String str, String str2, fid fidVar, int i) {
        String str3;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1420090775);
        int i2 = i | (btsVar2.k(str) ? 32 : 16) | (btsVar2.k(str2) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 145) != 144)) {
            lzr lzrVar = lzr.E;
            long E = uh6.E(28);
            c530 c530Var = c530.a;
            ymb1.j(str, an91.o(c530Var, 16.0f, 0.0f, 16.0f, 0.0f, 10), 0L, null, lzrVar, 0L, E, 0L, null, 0, false, 0, null, null, btsVar2, ((i2 >> 3) & 14) | 12607536, 0, 65388);
            oeb1.c(btsVar2, ljs0.e(c530Var, 12.0f));
            if (str2 == null) {
                btsVar2.e0(496758045);
                btsVar2.t(false);
                btsVar = btsVar2;
                str3 = str2;
            } else {
                btsVar2.e0(496758046);
                str3 = str2;
                ymb1.e(str3, an91.o(c530Var, 16.0f, 0.0f, 16.0f, 0.0f, 10), 0L, null, null, null, 0L, uh6.E(19), 0L, null, 0, false, 0, null, null, btsVar2, 12582960, 0, 65404);
                btsVar = btsVar2;
                btsVar.t(false);
            }
        } else {
            str3 = str2;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kq5(str, str3, i, 9);
        }
    }

    public static final void e(jk70 jk70Var, fid fidVar, int i) {
        jk70 jk70Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-846600954);
        int i2 = (btsVar.e(jk70Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            fk70 fk70Var = jk70Var.x;
            boolean e = btsVar.e(jk70Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                jk70Var2 = jk70Var;
                OrderCancelClarificationKt$OrderCancelClarification$1$1 orderCancelClarificationKt$OrderCancelClarification$1$1 = new OrderCancelClarificationKt$OrderCancelClarification$1$1(2, jk70Var2, jk70.class, "onButtonClick", "onButtonClick(Lcom/yandex/delivery/mapper/model/CancelMessageButtonAction;Ljava/lang/String;)V", 0);
                btsVar.o0(orderCancelClarificationKt$OrderCancelClarification$1$1);
                Q = orderCancelClarificationKt$OrderCancelClarification$1$1;
            } else {
                jk70Var2 = jk70Var;
            }
            f(fk70Var, (wls) ((tfx) Q), btsVar, 0);
        } else {
            jk70Var2 = jk70Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sc20(jk70Var2, i, 21);
        }
    }

    public static final void f(fk70 fk70Var, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1545915766);
        int i2 = (btsVar.k(fk70Var) ? 4 : 2) | i | (btsVar.e(wlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, d.d, d);
            oeb1.c(btsVar, ljs0.e(c530Var, 20.0f));
            String str = fk70Var.a;
            ArrayList arrayList = fk70Var.c;
            d(str, fk70Var.b, btsVar, 6);
            int size = arrayList.size();
            oeb1.c(btsVar, ljs0.e(c530Var, size > 2 ? 16.0f : 24.0f));
            if (size == 2) {
                btsVar.e0(1256237628);
                c(arrayList, wlsVar, btsVar, i2 & 112);
                btsVar.t(false);
            } else {
                btsVar.e0(1256239583);
                b(arrayList, wlsVar, btsVar, i2 & 112);
                btsVar.t(false);
            }
            ly3.B(c530Var, 16.0f, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new iu30(fk70Var, wlsVar, i, 25);
        }
    }
}
