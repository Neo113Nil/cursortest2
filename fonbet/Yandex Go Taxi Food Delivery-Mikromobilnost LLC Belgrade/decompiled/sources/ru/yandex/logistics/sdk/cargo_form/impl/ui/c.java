package ru.yandex.logistics.sdk.cargo_form.impl.ui;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import defpackage.a12;
import defpackage.a2y;
import defpackage.a7u0;
import defpackage.aii0;
import defpackage.b64;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cv8;
import defpackage.cx7;
import defpackage.cyk0;
import defpackage.d5b1;
import defpackage.dci;
import defpackage.did;
import defpackage.dmw0;
import defpackage.eja1;
import defpackage.el51;
import defpackage.es8;
import defpackage.exw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.gi0;
import defpackage.gl51;
import defpackage.gq1;
import defpackage.hw8;
import defpackage.hwy0;
import defpackage.ib51;
import defpackage.ira1;
import defpackage.jl40;
import defpackage.kae0;
import defpackage.ku0;
import defpackage.lbb1;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.lv8;
import defpackage.m4m0;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oip0;
import defpackage.oy60;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.pw91;
import defpackage.py60;
import defpackage.q;
import defpackage.qic;
import defpackage.qip0;
import defpackage.qje;
import defpackage.qkg;
import defpackage.qm51;
import defpackage.r1b0;
import defpackage.rv8;
import defpackage.rza0;
import defpackage.s1a1;
import defpackage.sb2;
import defpackage.sic;
import defpackage.sls;
import defpackage.sm91;
import defpackage.sv8;
import defpackage.t6s;
import defpackage.tfx;
import defpackage.tgg;
import defpackage.tls;
import defpackage.tse;
import defpackage.tv8;
import defpackage.typ0;
import defpackage.uip0;
import defpackage.uni;
import defpackage.uo5;
import defpackage.vni;
import defpackage.vv8;
import defpackage.w5;
import defpackage.wls;
import defpackage.wni;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xi8;
import defpackage.y30;
import defpackage.yx40;
import defpackage.z07;
import defpackage.z25;
import defpackage.z910;
import defpackage.zi8;
import defpackage.zpn;
import defpackage.zrb1;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.popup.data.PopupLayer;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.c;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.Anchor;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.FormSection;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public final class c implements wni {
    public final a2y A;
    public final uip0 B;
    public final rza0 C;
    public final oy60 D;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.g E;
    public final ru.yandex.logistics.sdk.cargo_form.impl.popup.b F;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.e a;
    public final y30 b;
    public final hwy0 c;
    public final tgg w;
    public final hw8 x;
    public final dci y;
    public final t6s z;

    public c(ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.e eVar, y30 y30Var, hwy0 hwy0Var, tgg tggVar, hw8 hw8Var, dci dciVar, t6s t6sVar, a2y a2yVar, uip0 uip0Var, rza0 rza0Var, oy60 oy60Var, ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.g gVar, ru.yandex.logistics.sdk.cargo_form.impl.popup.b bVar) {
        this.a = eVar;
        this.b = y30Var;
        this.c = hwy0Var;
        this.w = tggVar;
        this.x = hw8Var;
        this.y = dciVar;
        this.z = t6sVar;
        this.A = a2yVar;
        this.B = uip0Var;
        this.C = rza0Var;
        this.D = oy60Var;
        this.E = gVar;
        this.F = bVar;
    }

    public final void a(oz40 oz40Var, oip0 oip0Var, qkg qkgVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1355476189);
        cj6 cj6Var = cj6.a;
        int i2 = (btsVar.k(cj6Var) ? 4 : 2) | i | (btsVar.k(oz40Var) ? 32 : 16) | (btsVar.k(oip0Var) ? 256 : 128) | (btsVar.k(qkgVar) ? 2048 : 1024) | (btsVar.e(this) ? 16384 : 8192);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            f530 g = s1a1.g(ljs0.u(ljs0.c(c530.a, 1.0f), null, 3), 1.0f);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new w5(20, oz40Var);
                btsVar.o0(Q);
            }
            f530 y = eja1.y(g, (tls) Q);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = a12.e;
                btsVar.o0(Q2);
            }
            lbb1.b(cj6Var.a(exw0.a(y, zy11.a, (PointerInputEventHandler) Q2), x4c.B), oip0Var.b(), 0.0f, 0.0f, null, null, wwg.S(-1449300318, true, new rv8(this, qkgVar, i3), btsVar), btsVar, 1572864, 60);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sv8(this, oz40Var, oip0Var, qkgVar, i, 0);
        }
    }

    public final void b(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, gq1 gq1Var, lv8 lv8Var, zi8 zi8Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        c cVar;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2121852742);
        int i2 = i | (btsVar2.k(qkgVar) ? 4 : 2) | (btsVar2.k(qkgVar2) ? 32 : 16) | (btsVar2.k(qkgVar3) ? 256 : 128) | (btsVar2.k(gq1Var) ? 2048 : 1024) | (btsVar2.k(lv8Var) ? 16384 : 8192) | (btsVar2.e(zi8Var) ? 131072 : 65536) | (btsVar2.e(tlsVar) ? 1048576 : 524288) | (btsVar2.e(tlsVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar2.e(this) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB);
        if (btsVar2.V(i2 & 1, (38347923 & i2) != 38347922)) {
            oip0 o = pw91.o(btsVar2);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = zpn.j(EmptyCoroutineContext.a, btsVar2);
                btsVar2.o0(Q);
            }
            tse tseVar = (tse) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = androidx.compose.runtime.f.g(0);
                btsVar2.o0(Q2);
            }
            yx40 yx40Var = (yx40) Q2;
            Object Q3 = btsVar2.Q();
            if (Q3 == o430Var) {
                Q3 = androidx.compose.runtime.f.g(0);
                btsVar2.o0(Q3);
            }
            yx40 yx40Var2 = (yx40) Q3;
            Object Q4 = btsVar2.Q();
            if (Q4 == o430Var) {
                Q4 = androidx.compose.runtime.f.g(0);
                btsVar2.o0(Q4);
            }
            yx40 yx40Var3 = (yx40) Q4;
            f530 f530Var = zi8Var instanceof xi8 ? ljs0.c : c530.a;
            this.A.d = o.a.getIntValue();
            boolean e = btsVar2.e(this) | btsVar2.k(o) | btsVar2.e(tseVar);
            Object Q5 = btsVar2.Q();
            if (e || Q5 == o430Var) {
                Q5 = new CargoFormScreen$CargoFormRoot$1$1(this, tseVar, o, null);
                btsVar2.o0(Q5);
            }
            zy11 zy11Var = zy11.a;
            zpn.e(btsVar2, (wls) Q5, zy11Var);
            f530 a = androidx.compose.ui.input.nestedscroll.b.a(f530Var, zrb1.f(btsVar2), null);
            boolean e2 = btsVar2.e(this);
            Object Q6 = btsVar2.Q();
            if (e2 || Q6 == o430Var) {
                Q6 = new b(this);
                btsVar2.o0(Q6);
            }
            f530 a2 = exw0.a(a, zy11Var, (PointerInputEventHandler) Q6);
            boolean e3 = btsVar2.e(this);
            Object Q7 = btsVar2.Q();
            if (e3 || Q7 == o430Var) {
                Q7 = new cx7(21, this);
                btsVar2.o0(Q7);
            }
            f530 y = eja1.y(a2, (tls) Q7);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar2, y);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar2, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o2);
            wls wlsVar = androidx.compose.ui.node.d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
            es8 es8Var = new es8(this, qkgVar, qkgVar2, qkgVar3, yx40Var, yx40Var2, yx40Var3, o, lv8Var);
            cVar = this;
            cVar.e(o, wwg.S(-328660760, true, es8Var, btsVar2), btsVar2, ((i2 >> 18) & 896) | 48);
            fwi fwiVar = (fwi) btsVar2.m(j.h);
            btsVar2.e0(-220375330);
            int i3 = i2 >> 6;
            btsVar = btsVar2;
            ira1.a(gq1Var, fwiVar.H(yx40Var2.getIntValue()), yx40Var3, tlsVar, tlsVar2, btsVar, (i3 & 112) | 3078 | (57344 & i3) | (i3 & ImageMetadata.JPEG_GPS_COORDINATES));
            btsVar.t(false);
            cVar.f(fwiVar.H(yx40Var.getIntValue()), fwiVar.H(yx40Var2.getIntValue()), btsVar, ((i2 >> 15) & 7168) | 6);
            btsVar.t(true);
        } else {
            cVar = this;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new es8(cVar, qkgVar, qkgVar2, qkgVar3, gq1Var, lv8Var, zi8Var, tlsVar, tlsVar2, i);
        }
    }

    public final void c(qkg qkgVar, qkg qkgVar2, qkg qkgVar3, oz40 oz40Var, oz40 oz40Var2, oz40 oz40Var3, oip0 oip0Var, ldc ldcVar, int i, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-885597523);
        int i3 = i2 | (btsVar.k(cj6.a) ? 4 : 2) | (btsVar.k(qkgVar) ? 32 : 16) | (btsVar.k(qkgVar2) ? 256 : 128) | (btsVar.k(qkgVar3) ? 2048 : 1024) | (btsVar.k(oip0Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar.k(ldcVar) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | (btsVar.c(i) ? 536870912 : SelfTester_JCP.IMITA);
        if (btsVar.V(i3 & 1, ((306783379 & i3) == 306783378 && ((btsVar.e(this) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            a7u0 a7u0Var = ib51.a;
            py60 py60Var = (py60) btsVar.m(a7u0Var);
            boolean k = btsVar.k(py60Var);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new typ0(py60Var, FormSection.TOP);
                btsVar.o0(Q);
            }
            typ0 typ0Var = (typ0) Q;
            boolean k2 = btsVar.k(py60Var);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == o430Var) {
                Q2 = new typ0(py60Var, FormSection.MAIN);
                btsVar.o0(Q2);
            }
            typ0 typ0Var2 = (typ0) Q2;
            boolean k3 = btsVar.k(py60Var);
            Object Q3 = btsVar.Q();
            if (k3 || Q3 == o430Var) {
                Q3 = new typ0(py60Var, FormSection.BOTTOM);
                btsVar.o0(Q3);
            }
            sb2.b(a7u0Var.a(typ0Var), wwg.S(-220267027, true, new sv8(this, oz40Var, oip0Var, qkgVar, 2), btsVar), btsVar, 56);
            sb2.b(a7u0Var.a(typ0Var2), wwg.S(-542264810, true, new vv8(this, oz40Var, oz40Var2, oz40Var3, oip0Var, qkgVar2, qkgVar, ldcVar, i, 0), btsVar), btsVar, 56);
            sb2.b(a7u0Var.a((typ0) Q3), wwg.S(-659901579, true, new sv8(this, oz40Var2, oip0Var, qkgVar3, 3), btsVar), btsVar, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z25(this, qkgVar, qkgVar2, qkgVar3, oz40Var, oz40Var2, oz40Var3, oip0Var, ldcVar, i, i2);
        }
    }

    public final void d(oz40 oz40Var, oz40 oz40Var2, oz40 oz40Var3, oip0 oip0Var, qkg qkgVar, boolean z, ldc ldcVar, int i, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1713505582);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i2 | (btsVar.k(oz40Var) ? 4 : 2) | (btsVar.k(oz40Var2) ? 32 : 16) | (btsVar.k(oz40Var3) ? 256 : 128) | (btsVar.k(oip0Var) ? 2048 : 1024) | (btsVar.k(qkgVar) ? 16384 : 8192) | (btsVar.a(z) ? 131072 : 65536) | (btsVar.k(ldcVar) ? 1048576 : 524288) | (btsVar.c(i) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | (btsVar.e(this) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB);
        if (btsVar.V(i3 & 1, (38347923 & i3) != 38347922)) {
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d2);
            fwi fwiVar = (fwi) btsVar.m(j.h);
            f530 u = pw91.u(ljs0.c(c530Var, 1.0f), oip0Var, 14);
            boolean e = btsVar.e(this) | ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new q(29, this, oz40Var, oz40Var2);
                btsVar.o0(Q);
            }
            f530 y = eja1.y(u, (tls) Q);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, y);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            f530 c = ljs0.c(ljs0.e(c530Var, fwiVar.H(((Number) oz40Var.getValue()).intValue())), 1.0f);
            a7u0 a7u0Var = gl51.a;
            long c2 = ((el51) btsVar.m(a7u0Var)).c();
            a7u0 a7u0Var2 = qm51.a;
            pi6.a(m4m0.b(c, c2, YandexShapes.c(((YandexShapes) btsVar.m(a7u0Var2)).d, YandexShapes.Corner.TOP)), btsVar, 0);
            sb2.b(ru.yandex.taxi.logistics.sdk.ui.form.scroll.a.a.a(this.E), wwg.S(-1828870166, true, new gi0(this, i, ldcVar, qkgVar, z), btsVar), btsVar, 56);
            pi6.a(m4m0.b(ljs0.c(ljs0.e(c530Var, fwiVar.H(((Number) oz40Var3.getValue()).intValue()) + fwiVar.H(((Number) oz40Var2.getValue()).intValue())), 1.0f), ((el51) btsVar.m(a7u0Var)).c(), YandexShapes.c(((YandexShapes) btsVar.m(a7u0Var2)).d, YandexShapes.Corner.BOTTOM)), btsVar, 0);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z07(this, oz40Var, oz40Var2, oz40Var3, oip0Var, qkgVar, z, ldcVar, i, i2);
        }
    }

    public final void e(oip0 oip0Var, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        bts btsVar;
        yx40 yx40Var = oip0Var.a;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1371990697);
        int i2 = (i & 6) == 0 ? (btsVar2.k(oip0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(this) ? 256 : 128;
        }
        int i3 = i2;
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            btsVar = btsVar2;
            oz40 a = androidx.compose.runtime.f.a(this.F.g, EmptyList.a, null, btsVar, 48, 2);
            boolean k = btsVar.k((List) a.getValue());
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                List list = (List) a.getValue();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((kae0) obj).g == PopupLayer.CONTENT) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                Pair pair = new Pair(arrayList, arrayList2);
                btsVar.o0(pair);
                Q = pair;
            }
            Pair pair2 = (Pair) Q;
            List list2 = (List) pair2.getFirst();
            List list3 = (List) pair2.getSecond();
            boolean isEmpty = list2.isEmpty();
            c530 c530Var = c530.a;
            if (isEmpty) {
                btsVar.e0(-2065406901);
                btsVar.t(false);
            } else {
                btsVar.e0(-2065691357);
                int intValue = yx40Var.getIntValue();
                f530 g = s1a1.g(c530Var, 0.5f);
                ru.yandex.logistics.sdk.cargo_form.impl.popup.b bVar = this.F;
                boolean e = btsVar.e(bVar);
                Object Q2 = btsVar.Q();
                if (e || Q2 == o430Var) {
                    Q2 = new CargoFormScreen$PopupsOverlayWrapper$2$1(2, bVar, ru.yandex.logistics.sdk.cargo_form.impl.popup.b.class, "onPopupShown", "onPopupShown(Ljava/lang/String;Lcom/yandex/delivery/mapper/model/policies/ShowPolicy;)V", 0);
                    btsVar.o0(Q2);
                }
                ru.yandex.logistics.sdk.cargo_form.impl.popup.ui.a.b(list2, intValue, g, (wls) ((tfx) Q2), btsVar, 384);
                btsVar = btsVar;
                btsVar.t(false);
            }
            aVar.invoke(btsVar, Integer.valueOf((i3 >> 3) & 14));
            if (list3.isEmpty()) {
                btsVar.e0(-2065048789);
                btsVar.t(false);
            } else {
                btsVar.e0(-2065337089);
                int intValue2 = yx40Var.getIntValue();
                f530 g2 = s1a1.g(c530Var, 10.0f);
                ru.yandex.logistics.sdk.cargo_form.impl.popup.b bVar2 = this.F;
                boolean e2 = btsVar.e(bVar2);
                Object Q3 = btsVar.Q();
                if (e2 || Q3 == o430Var) {
                    CargoFormScreen$PopupsOverlayWrapper$3$1 cargoFormScreen$PopupsOverlayWrapper$3$1 = new CargoFormScreen$PopupsOverlayWrapper$3$1(2, bVar2, ru.yandex.logistics.sdk.cargo_form.impl.popup.b.class, "onPopupShown", "onPopupShown(Ljava/lang/String;Lcom/yandex/delivery/mapper/model/policies/ShowPolicy;)V", 0);
                    btsVar.o0(cargoFormScreen$PopupsOverlayWrapper$3$1);
                    Q3 = cargoFormScreen$PopupsOverlayWrapper$3$1;
                }
                wls wlsVar = (wls) ((tfx) Q3);
                bts btsVar3 = btsVar;
                ru.yandex.logistics.sdk.cargo_form.impl.popup.ui.a.b(list3, intValue2, g2, wlsVar, btsVar3, 384);
                btsVar = btsVar3;
                btsVar.t(false);
            }
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(this, oip0Var, aVar, i, 25);
        }
    }

    public final void f(final float f, final float f2, fid fidVar, final int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1786176293);
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.b(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.b(f2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(this) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Anchor anchor = Anchor.TOP;
            ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.e eVar = this.a;
            oz40 a = androidx.compose.runtime.f.a(eVar.a(anchor), null, null, btsVar, 48, 2);
            Anchor anchor2 = Anchor.BOTTOM;
            oz40 a2 = androidx.compose.runtime.f.a(eVar.a(anchor2), null, null, btsVar, 48, 2);
            uo5 uo5Var = x4c.w;
            c530 c530Var = c530.a;
            d5b1.a((qip0) a.getValue(), anchor, sm91.f(cj6Var.a(c530Var, uo5Var), 0.0f, f, 1), btsVar, 48);
            d5b1.a((qip0) a2.getValue(), anchor2, sm91.f(cj6Var.a(c530Var, x4c.C), 0.0f, -f2, 1), btsVar, 48);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: uv8
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i | 1);
                    c.this.f(f, f2, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public final void g(oz40 oz40Var, oip0 oip0Var, qkg qkgVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(854512065);
        cj6 cj6Var = cj6.a;
        int i2 = (btsVar.k(cj6Var) ? 4 : 2) | i | (btsVar.k(oz40Var) ? 32 : 16) | (btsVar.k(oip0Var) ? 256 : 128) | (btsVar.k(qkgVar) ? 2048 : 1024) | (btsVar.e(this) ? 16384 : 8192);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            f530 g = s1a1.g(ljs0.u(ljs0.c(c530.a, 1.0f), null, 3), 1.0f);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new w5(21, oz40Var);
                btsVar.o0(Q);
            }
            f530 y = eja1.y(g, (tls) Q);
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = a12.f;
                btsVar.o0(Q2);
            }
            lbb1.b(cj6Var.a(exw0.a(y, zy11.a, (PointerInputEventHandler) Q2), x4c.c), oip0Var.e(), 0.0f, 8.0f, null, cyk0.c(((YandexShapes) btsVar.m(qm51.a)).d), wwg.S(1266167324, true, new rv8(this, qkgVar, i3), btsVar), btsVar, 1575936, 20);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sv8(this, oz40Var, oip0Var, qkgVar, i, 1);
        }
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(this.b.a(), null, 0, 6, null);
        composeView.setContent(new androidx.compose.runtime.internal.a(493216980, new tv8(this, (cv8) uniVar, 0), true));
        return composeView;
    }
}
