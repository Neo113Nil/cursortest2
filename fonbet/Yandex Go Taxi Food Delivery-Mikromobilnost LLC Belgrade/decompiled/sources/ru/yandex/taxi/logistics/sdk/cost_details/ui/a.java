package ru.yandex.taxi.logistics.sdk.cost_details.ui;

import defpackage.aii0;
import defpackage.an91;
import defpackage.b2q0;
import defpackage.bts;
import defpackage.c530;
import defpackage.did;
import defpackage.dk91;
import defpackage.dke;
import defpackage.el51;
import defpackage.f530;
import defpackage.fid;
import defpackage.fj5;
import defpackage.fnq0;
import defpackage.gl51;
import defpackage.hi91;
import defpackage.k2i;
import defpackage.l2i;
import defpackage.le;
import defpackage.ljs0;
import defpackage.lzr;
import defpackage.n2i;
import defpackage.o430;
import defpackage.p6d;
import defpackage.q0;
import defpackage.qm51;
import defpackage.scc;
import defpackage.sls;
import defpackage.sn1;
import defpackage.tbb;
import defpackage.tfx;
import defpackage.tls;
import defpackage.u3b1;
import defpackage.v1i;
import defpackage.web1;
import defpackage.wth;
import defpackage.wwg;
import defpackage.ymb1;
import defpackage.zyd;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(String str, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1220265337);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            ru.yandex.taxi.logistics.sdk.ui.component.control.a.a(slsVar, ljs0.c(ljs0.e(an91.k(c530.a, 8.0f), 56.0f), 1.0f), ((YandexShapes) btsVar.m(qm51.a)).b(), 0L, 0L, null, false, null, null, null, wwg.S(1557789680, true, new le(str, 17), btsVar), btsVar, (i2 >> 3) & 14, 4088);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fj5(i, 1, slsVar, str);
        }
    }

    public static final void b(l2i l2iVar, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(565118349);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(l2iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new dke(23, l2iVar, slsVar);
                btsVar.o0(Q);
            }
            b2q0.b(null, 6.0f, 0L, true, false, null, (tls) Q, btsVar, 3120, 53);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zyd(l2iVar, slsVar, i, 10);
        }
    }

    public static final void c(n2i n2iVar, fid fidVar, int i) {
        n2i n2iVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(111137344);
        int i2 = (btsVar.e(n2iVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = n2iVar.b.a;
                btsVar.o0(Q);
            }
            l2i l2iVar = (l2i) Q;
            boolean e = btsVar.e(n2iVar);
            Object Q2 = btsVar.Q();
            if (e || Q2 == o430Var) {
                n2iVar2 = n2iVar;
                DeliveryCostDetailsScreenKt$DeliveryCostDetailsScreen$1$1 deliveryCostDetailsScreenKt$DeliveryCostDetailsScreen$1$1 = new DeliveryCostDetailsScreenKt$DeliveryCostDetailsScreen$1$1(0, n2iVar2, n2i.class, "onButtonClick", "onButtonClick()V", 0);
                btsVar.o0(deliveryCostDetailsScreenKt$DeliveryCostDetailsScreen$1$1);
                Q2 = deliveryCostDetailsScreenKt$DeliveryCostDetailsScreen$1$1;
            } else {
                n2iVar2 = n2iVar;
            }
            b(l2iVar, (sls) ((tfx) Q2), btsVar, 6);
        } else {
            n2iVar2 = n2iVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tbb(n2iVar2, i, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public static final void d(List list, fid fidVar, int i) {
        c530 c530Var;
        char c;
        List list2 = list;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-749651378);
        char c2 = 2;
        int i2 = i | (btsVar.e(list2) ? 4 : 2);
        ?? r5 = 1;
        byte b = 0;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            int size = list2.size();
            int i3 = 0;
            while (i3 < size) {
                v1i v1iVar = (v1i) list2.get(i3);
                int i4 = size;
                int i5 = i3;
                boolean z = r5;
                boolean z2 = b;
                web1.c(null, 0.0f, false, 0.0f, null, null, wwg.S(1508687252, r5, new k2i(v1iVar, b, b), btsVar), wwg.S(60680405, r5, new k2i(v1iVar, r5, b), btsVar), null, null, null, null, false, btsVar, 14155776, 0, 7999);
                String str = v1iVar.c;
                c530 c530Var2 = c530.a;
                if (str == null) {
                    btsVar.e0(966074700);
                    btsVar.t(z2);
                    c530Var = c530Var2;
                } else {
                    btsVar.e0(966074701);
                    bts btsVar2 = btsVar;
                    c530Var = c530Var2;
                    ymb1.f(str, an91.o(c530Var2, 16.0f, 0.0f, 16.0f, 16.0f, 2), ((el51) btsVar.m(gl51.a)).o(), null, null, null, 0L, 0L, 0L, null, 0, false, Integer.MAX_VALUE, null, null, btsVar2, 48, HProv.ALG_TYPE_SECURECHANNEL, 57336);
                    btsVar = btsVar2;
                    btsVar.t(z2);
                }
                if (i5 != scc.f(list)) {
                    btsVar.e0(966364768);
                    c = 2;
                    dk91.a(0.0f, 6, 6, 0L, btsVar, an91.m(c530Var, 16.0f, 0.0f, 2));
                    btsVar.t(z2);
                } else {
                    c = 2;
                    btsVar.e0(966445492);
                    btsVar.t(z2);
                }
                i3 = i5 + 1;
                b = z2;
                c2 = c;
                size = i4;
                r5 = z;
                list2 = list;
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sn1(i, 6, list);
        }
    }

    public static final void e(String str, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1023624562);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(c530Var, 10.0f, 10.0f, 0.0f, 8.0f, 4);
            p6d.a.getClass();
            u3b1.g(o, 0.0f, 0L, 0.0f, p6d.b, btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT, 14);
            lzr lzrVar = lzr.G;
            f530 d = hi91.d(an91.o(c530Var, 16.0f, 0.0f, 16.0f, 12.0f, 2), false, null, 3);
            Object Q = btsVar2.Q();
            if (Q == did.a) {
                Q = new wth(15);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            ymb1.j(str, fnq0.b(d, false, (tls) Q), 0L, null, lzrVar, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, (i2 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65516);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0(str, i, 14);
        }
    }

    public static final void f(v1i v1iVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(209528403);
        int i2 = (btsVar.k(v1iVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            web1.c(null, 0.0f, false, 0.0f, null, null, wwg.S(-1471938577, true, new k2i(v1iVar, 2, (byte) 0), btsVar), wwg.S(405330318, true, new k2i(v1iVar, 3, (byte) 0), btsVar), null, null, null, null, false, btsVar, 14155776, 0, 7999);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new k2i(v1iVar, i);
        }
    }
}
