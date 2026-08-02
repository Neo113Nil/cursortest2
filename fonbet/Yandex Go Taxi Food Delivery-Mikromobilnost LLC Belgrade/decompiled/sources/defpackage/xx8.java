package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.foundation.lazy.b;
import androidx.compose.foundation.pager.d;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackCompletedOrder$FinishingStage;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferModalView;
import com.yandex.go.rida.bids.ui.c;
import com.yandex.go.summary.ui.compose.expanded.content.tariffcard.carousel.a;
import com.yandex.messaging.ui.settings.folder.addChat.g;
import defpackage.b64;
import defpackage.bts;
import defpackage.cma1;
import defpackage.cs8;
import defpackage.cvw;
import defpackage.did;
import defpackage.ds31;
import defpackage.et41;
import defpackage.f530;
import defpackage.f5z;
import defpackage.fid;
import defpackage.gt0;
import defpackage.jl40;
import defpackage.jt8;
import defpackage.k3r;
import defpackage.ljs0;
import defpackage.ny61;
import defpackage.ohd;
import defpackage.ooc;
import defpackage.pi6;
import defpackage.q7u;
import defpackage.qje;
import defpackage.qnh;
import defpackage.qoi0;
import defpackage.r1b0;
import defpackage.rs31;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.tm41;
import defpackage.vt8;
import defpackage.w8f;
import defpackage.wls;
import defpackage.wm41;
import defpackage.x4c;
import defpackage.ywv;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zs8;
import defpackage.zwv;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;

/* loaded from: classes11.dex */
public final /* synthetic */ class xx8 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ xx8(n6 n6Var, tls tlsVar, tls tlsVar2, int i) {
        this.a = 2;
        this.b = n6Var;
        this.w = tlsVar;
        this.c = tlsVar2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 renderSuccess$lambda$2$2$0;
        zy11 renderSuccess$lambda$2$2;
        int i = this.a;
        c530 c530Var = c530.a;
        int i2 = 6;
        o430 o430Var = did.a;
        int i3 = 1;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                tpr tprVar = (tpr) obj5;
                hz8 hz8Var = (hz8) obj4;
                tls tlsVar = (tls) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    int i4 = 3;
                    b a = a7y.a(0, 3, btsVar);
                    a.e(a, tprVar, btsVar, 0);
                    k3r k3rVar = ljs0.c;
                    boolean k = btsVar.k(hz8Var);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
                        Q = new cx7(22, hz8Var);
                        btsVar.o0(Q);
                    }
                    f530 b = fnq0.b(k3rVar, false, (tls) Q);
                    l690 b2 = an91.b(16.0f, 0.0f, 2);
                    i43 i43Var = new i43(8.0f, true, new quz(11));
                    boolean k2 = btsVar.k(hz8Var) | btsVar.k(tlsVar);
                    Object Q2 = btsVar.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new cs8(i4, hz8Var, tlsVar);
                        btsVar.o0(Q2);
                    }
                    adb1.b(b, a, b2, i43Var, null, null, false, null, (tls) Q2, btsVar, 24960, 488);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                d dVar = (d) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                sls slsVar = (sls) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    k3r k3rVar2 = ljs0.c;
                    f530 b3 = m4m0.b(k3rVar2, ((el51) btsVar2.m(gl51.a)).i(), qke.q);
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar2, b3);
                    ohd.G1.getClass();
                    sls slsVar2 = androidx.compose.ui.node.d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar2);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, androidx.compose.ui.node.d.f, d);
                    qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
                    wls wlsVar = androidx.compose.ui.node.d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar2, hashCode, wlsVar);
                    }
                    qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
                    otr0.a(dVar, k3rVar2, null, null, 0.0f, null, null, false, null, null, null, null, wwg.S(635111480, true, new alb0(r9 ? 1 : 0, arrayList), btsVar2), btsVar2, 48, 16380);
                    ru.yandex.taxi.logistics.sdk.photocomments.a.f(dVar.k(), arrayList.size(), slsVar, cj6.a.a(c530Var, x4c.c), btsVar2, 0);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                com.ybsdk.feature.about.internal.presentation.a.d((n6) obj5, (tls) obj3, (tls) obj4, (fid) obj, vng.O(1));
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                com.ybsdk.feature.about.internal.presentation.a.b((m5) obj5, (String) obj4, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                g.b((l5f) obj5, (Set) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                final gt0 gt0Var = (gt0) obj5;
                qkg qkgVar = (qkg) obj4;
                j17 j17Var = (j17) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    sic a2 = qic.a(lr20.c, x4c.G, btsVar3, 0);
                    int hashCode2 = Long.hashCode(btsVar3.T);
                    r1b0 o2 = btsVar3.o();
                    f530 d3 = androidx.compose.ui.b.d(btsVar3, c530Var);
                    ohd.G1.getClass();
                    sls slsVar3 = androidx.compose.ui.node.d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar3);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, androidx.compose.ui.node.d.f, a2);
                    qje.W(btsVar3, androidx.compose.ui.node.d.e, o2);
                    wls wlsVar2 = androidx.compose.ui.node.d.g;
                    if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode2))) {
                        b64.z(hashCode2, btsVar3, hashCode2, wlsVar2);
                    }
                    qje.W(btsVar3, androidx.compose.ui.node.d.d, d3);
                    gt0Var.x.a(qkgVar, null, 0.0f, ldc.l, false, false, null, btsVar3, 16780288, HProv.PP_INFO);
                    if (j17Var == null) {
                        btsVar3.e0(-878856297);
                        btsVar3.t(false);
                    } else {
                        btsVar3.e0(-878856296);
                        f530 c = ljs0.c(ljs0.e(an91.k(c530Var, 8.0f), 56.0f), 1.0f);
                        boolean z = j17Var.c;
                        boolean e = btsVar3.e(gt0Var);
                        Object Q3 = btsVar3.Q();
                        if (e || Q3 == o430Var) {
                            Q3 = new sls() { // from class: ru.yandex.taxi.logistics.sdk.address_details.impl.ui.a
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    e eVar = gt0.this.b;
                                    eVar.getClass();
                                    tje.N(ds31.a(eVar), null, null, new AddressDetailsViewModel$onDoneClicked$1(eVar, null), 3);
                                    return zy11.a;
                                }
                            };
                            btsVar3.o0(Q3);
                        }
                        ru.yandex.taxi.logistics.sdk.ui.component.control.a.a((sls) Q3, c, null, 0L, 0L, null, z, null, null, null, wwg.S(2066669036, true, new bj0(i2, j17Var), btsVar3), btsVar3, 0, 3836);
                        btsVar3.t(false);
                    }
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 6:
                ((Integer) obj2).getClass();
                l9e.b((f530) obj5, (l7k0) obj4, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 7:
                n81 n81Var = (n81) obj5;
                ov0 ov0Var = (ov0) obj4;
                f530 f530Var = (f530) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    sya1.a(((l81) n81Var).a.d, f530Var, null, ov0Var.b, btsVar4, 0, 4);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 8:
                String str = (String) obj5;
                vp1 vp1Var = (vp1) obj4;
                tls tlsVar2 = (tls) obj3;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    boolean k3 = btsVar5.k(vp1Var) | btsVar5.k(tlsVar2);
                    Object Q4 = btsVar5.Q();
                    if (k3 || Q4 == o430Var) {
                        Q4 = new j0(vp1Var, tlsVar2);
                        btsVar5.o0(Q4);
                    }
                    com.yandex.go.ai_widget.ui.a.a(0, 6, btsVar5, (sls) Q4, null, str, false);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                com.yandex.go.ai_widget.ui.a.d((up1) obj5, (com.yandex.go.ai_widget.ui.component.b) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                msa1.h((String) obj5, (String) obj4, (String) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 11:
                f530 f530Var2 = (f530) obj5;
                oz40 oz40Var = (oz40) obj4;
                androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) obj3;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Object Q5 = btsVar6.Q();
                    if (Q5 == o430Var) {
                        Q5 = new w5(8, oz40Var);
                        btsVar6.o0(Q5);
                    }
                    f530 y = eja1.y(f530Var2, (tls) Q5);
                    z910 d4 = pi6.d(x4c.b, true);
                    int hashCode3 = Long.hashCode(btsVar6.T);
                    r1b0 o3 = btsVar6.o();
                    f530 d5 = androidx.compose.ui.b.d(btsVar6, y);
                    ohd.G1.getClass();
                    sls slsVar4 = androidx.compose.ui.node.d.b;
                    if (btsVar6.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar4);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, androidx.compose.ui.node.d.f, d4);
                    qje.W(btsVar6, androidx.compose.ui.node.d.e, o3);
                    qje.W(btsVar6, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode3));
                    qje.M(btsVar6, androidx.compose.ui.node.d.h);
                    qje.W(btsVar6, androidx.compose.ui.node.d.d, d5);
                    nnm.p(0, aVar, btsVar6, true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 12:
                return new com.yandex.go.chargers.order.active.a(lba.o((LayoutInflater) obj, (ViewGroup) obj2), (ytz) obj5, (nna) obj4, (gei0) obj3);
            case 13:
                ((wls) obj3).invoke(((vx2) obj5).a.b((KSerializer) obj4, (String) obj), (gcn) obj2);
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                h1b1.d((me3) obj5, (f530) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                q1b1.a((f530) obj5, (m7k0) obj4, (tls) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 16:
                return new com.yandex.go.chargers.order.active.b(lba.o((LayoutInflater) obj, (ViewGroup) obj2), (pav) obj5, (nna) obj4, (gei0) obj3);
            case 17:
                ((Integer) obj2).getClass();
                c.f((gq5) obj5, (f530) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 18:
                oz40 oz40Var2 = (oz40) obj5;
                j690 j690Var = (j690) obj4;
                zls zlsVar = (zls) obj3;
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    sb2.b(vee.a.a(Float.valueOf(ldc.d(((ldc) oz40Var2.getValue()).a))), wwg.S(-869936862, true, new x07(j690Var, zlsVar, i3), btsVar7), btsVar7, 56);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 19:
                ((Integer) obj2).getClass();
                zcb1.b((r57) obj5, (sls) obj4, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                com.yandex.go.taxi.order.cancel.v3.ui.a.d((x2y) obj5, (cz7) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                ((t68) obj5).b((hk2) obj4, (String) obj3, (fid) obj, vng.O(9));
                return zy11Var;
            case 22:
                ((Integer) obj2).getClass();
                ((wly0) obj5).m((hs8) obj4, (f530) obj3, (fid) obj, vng.O(9));
                return zy11Var;
            case 23:
                ((Integer) obj2).getClass();
                ((jt8) obj5).b((n4u0) obj4, (vt8) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 24:
                ((Integer) obj2).getClass();
                ((jt8) obj5).a((n4u0) obj4, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(49));
                return zy11Var;
            case 25:
                final jt8 jt8Var = (jt8) obj5;
                final qnh qnhVar = (qnh) obj4;
                final ComposeView composeView = (ComposeView) obj3;
                fid fidVar8 = (fid) obj;
                int intValue8 = ((Integer) obj2).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 3) != 2)) {
                    final rza0 rza0Var = zya0.a;
                    rza0Var.c(new Permission[]{Permission.CAMERA}, btsVar8, 0);
                    xi91.a(wwg.S(-408275431, true, new wls() { // from class: ru.yandex.logistics.care.web_view.impl.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj6, Object obj7) {
                            fid fidVar9 = (fid) obj6;
                            int intValue9 = ((Integer) obj7).intValue();
                            int i5 = 1;
                            int i6 = 2;
                            bts btsVar9 = (bts) fidVar9;
                            boolean V = btsVar9.V(intValue9 & 1, (intValue9 & 3) != 2);
                            zy11 zy11Var2 = zy11.a;
                            if (!V) {
                                btsVar9.Y();
                                return zy11Var2;
                            }
                            String d6 = qoi0.a(vt8.class).d();
                            btsVar9.e0(-1510658864);
                            zwv zwvVar = new zwv();
                            jt8 jt8Var2 = jt8.this;
                            boolean e2 = btsVar9.e(jt8Var2);
                            Object obj8 = rza0Var;
                            boolean e3 = e2 | btsVar9.e(obj8);
                            Object Q6 = btsVar9.Q();
                            Object obj9 = did.a;
                            if (e3 || Q6 == obj9) {
                                Q6 = new cs8(i5, jt8Var2, obj8);
                                btsVar9.o0(Q6);
                            }
                            zwvVar.a(qoi0.a(vt8.class), (tls) Q6);
                            ywv b4 = zwvVar.b();
                            btsVar9.t(false);
                            rs31 a3 = f5z.a(btsVar9);
                            if (a3 == null) {
                                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return null;
                            }
                            vt8 vt8Var = (vt8) ooc.G(qoi0.a(vt8.class), a3, d6, b4, a3 instanceof q7u ? ((q7u) a3).getDefaultViewModelCreationExtras() : w8f.b, btsVar9);
                            Object Q7 = btsVar9.Q();
                            if (Q7 == obj9) {
                                et41 et41Var = jt8Var2.a;
                                tm41 Y = vt8Var.Y();
                                et41Var.a.getClass();
                                Object aVar2 = new ru.yandex.taxi.logistics.sdk.webview.impl.ui.a(composeView.getContext(), Y);
                                btsVar9.o0(aVar2);
                                Q7 = aVar2;
                            }
                            wm41 wm41Var = (wm41) Q7;
                            boolean e4 = btsVar9.e(vt8Var) | btsVar9.e(wm41Var);
                            Object Q8 = btsVar9.Q();
                            if (e4 || Q8 == obj9) {
                                Q8 = new cs8(i6, vt8Var, wm41Var);
                                btsVar9.o0(Q8);
                            }
                            zpn.a(zy11Var2, (tls) Q8, btsVar9);
                            boolean e5 = btsVar9.e(vt8Var) | btsVar9.e(jt8Var2);
                            qnh qnhVar2 = qnhVar;
                            boolean e6 = e5 | btsVar9.e(qnhVar2);
                            Object Q9 = btsVar9.Q();
                            if (e6 || Q9 == obj9) {
                                Q9 = new CareWebViewLauncherImpl$getWebViewContent$1$1$1$2$1(vt8Var, jt8Var2, qnhVar2, null);
                                btsVar9.o0(Q9);
                            }
                            zpn.e(btsVar9, (wls) Q9, zy11Var2);
                            boolean e7 = btsVar9.e(vt8Var) | btsVar9.e(wm41Var);
                            Object Q10 = btsVar9.Q();
                            if (e7 || Q10 == obj9) {
                                Q10 = new CareWebViewLauncherImpl$getWebViewContent$1$1$1$3$1(vt8Var, wm41Var, null);
                                btsVar9.o0(Q10);
                            }
                            zpn.e(btsVar9, (wls) Q10, "js");
                            k3r k3rVar3 = ljs0.c;
                            z910 d7 = pi6.d(x4c.b, false);
                            int hashCode4 = Long.hashCode(btsVar9.T);
                            r1b0 o4 = btsVar9.o();
                            f530 d8 = androidx.compose.ui.b.d(btsVar9, k3rVar3);
                            ohd.G1.getClass();
                            sls slsVar5 = androidx.compose.ui.node.d.b;
                            if (btsVar9.a == null) {
                                cma1.b0();
                                throw null;
                            }
                            btsVar9.i0();
                            if (btsVar9.S) {
                                btsVar9.n(slsVar5);
                            } else {
                                btsVar9.r0();
                            }
                            qje.W(btsVar9, androidx.compose.ui.node.d.f, d7);
                            qje.W(btsVar9, androidx.compose.ui.node.d.e, o4);
                            wls wlsVar3 = androidx.compose.ui.node.d.g;
                            if (btsVar9.S || !jl40.l(btsVar9.Q(), Integer.valueOf(hashCode4))) {
                                b64.z(hashCode4, btsVar9, hashCode4, wlsVar3);
                            }
                            qje.W(btsVar9, androidx.compose.ui.node.d.d, d8);
                            zs8 zs8Var = new zs8();
                            boolean e8 = btsVar9.e(wm41Var);
                            Object Q11 = btsVar9.Q();
                            if (e8 || Q11 == obj9) {
                                Object careWebViewLauncherImpl$getWebViewContent$1$1$1$4$1$1 = new CareWebViewLauncherImpl$getWebViewContent$1$1$1$4$1$1(2, wm41Var, cvw.class, "Content", "getWebViewContent$lambda$0$0$0$5$0$Content(Lru/yandex/taxi/logistics/sdk/webview/impl/ui/WebViewContainer;Landroidx/compose/runtime/Composer;I)V", 0);
                                btsVar9.o0(careWebViewLauncherImpl$getWebViewContent$1$1$1$4$1$1);
                                Q11 = careWebViewLauncherImpl$getWebViewContent$1$1$1$4$1$1;
                            }
                            zs8Var.a((wls) Q11, btsVar9, 0);
                            jt8Var2.b(jt8Var2.b.b.a.a, vt8Var, btsVar9, 0);
                            btsVar9.t(true);
                            return zy11Var2;
                        }
                    }, btsVar8), btsVar8, 6);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            case 26:
                ((Integer) obj2).getClass();
                com.yandex.go.chargers.feedback.ui.b.l((x0a) obj5, (ChargersFeedbackCompletedOrder$FinishingStage) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 27:
                ((Integer) obj2).getClass();
                com.yandex.go.chargers.feedback.ui.b.f((dz9) obj5, (sls) obj4, (sls) obj3, (fid) obj, vng.O(9));
                return zy11Var;
            case 28:
                renderSuccess$lambda$2$2$0 = ChargersOfferModalView.renderSuccess$lambda$2$2$0((String) obj5, (wp2) obj4, (wp2) obj3, (fid) obj, ((Integer) obj2).intValue());
                return renderSuccess$lambda$2$2$0;
            default:
                renderSuccess$lambda$2$2 = ChargersOfferModalView.renderSuccess$lambda$2$2((String) obj5, (up2) obj4, (up2) obj3, (fid) obj, ((Integer) obj2).intValue());
                return renderSuccess$lambda$2$2;
        }
    }

    public /* synthetic */ xx8(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public /* synthetic */ xx8(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
