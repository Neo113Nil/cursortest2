package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.internal.analytics.f0;
import com.yandex.passport.internal.analytics.l0;
import com.yandex.passport.internal.ui.bouncer.model.m1;
import com.yandex.passport.internal.ui.bouncer.model.p1;
import com.yandex.passport.internal.ui.bouncer.model.r1;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import com.yandex.passport.internal.ui.bouncer.model.t1;
import com.yandex.passport.internal.ui.challenge.delete.DeleteAccountActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomSheetActivity;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.h0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.n0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.q0;
import com.yandex.passport.internal.ui.challenge.logout.bottomsheet.s0;
import com.yandex.passport.internal.ui.domik.a0;
import com.yandex.passport.internal.ui.domik.b0;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity;
import com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesActivity;
import com.yandex.passport.internal.ui.sloth.w;
import com.yandex.passport.internal.ui.sloth.webauthn.RegisterWebAuthNActivity;
import com.yandex.passport.internal.ui.sloth.webcard.i0;
import com.yandex.plus.core.graphql.a2;
import com.yandex.plus.core.graphql.y1;
import com.yandex.plus.core.graphql.z1;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.e5b;
import defpackage.ern;
import defpackage.gq5;
import defpackage.h9f;
import defpackage.hq5;
import defpackage.ild;
import defpackage.kjn;
import defpackage.n5g;
import defpackage.oq5;
import defpackage.r0w;
import defpackage.rqv;
import defpackage.rvf;
import defpackage.sqv;
import defpackage.t75;
import defpackage.tah;
import defpackage.tf6;
import defpackage.v75;
import defpackage.vci;
import defpackage.vlv;
import defpackage.wn5;
import defpackage.x97;
import defpackage.z7l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 5;
        int i3 = 10;
        kjn kjnVar = gq5.a;
        int i4 = 2;
        int i5 = 1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                q.a((u) obj4, (m1) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                q.d((u) obj4, (s1) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 2:
                ((Integer) obj2).getClass();
                com.yandex.plus.core.network.api.utils.a.d((u) obj4, (p1) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 3:
                ((Integer) obj2).getClass();
                com.yandex.passport.internal.ui.bouncer.loading.h.a((u) obj4, (t1) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                com.yandex.passport.internal.ui.bouncer.roundabout.p.a((u) obj4, (r1) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 5:
                com.yandex.passport.common.ui.a aVar = (com.yandex.passport.common.ui.a) obj4;
                DeleteAccountActivity deleteAccountActivity = (DeleteAccountActivity) obj3;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                int i6 = DeleteAccountActivity.b;
                if ((intValue & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                boolean z = com.yandex.plus.pay.ui.core.b.z(aVar, hq5Var);
                com.yandex.passport.internal.ui.challenge.delete.b bVar = deleteAccountActivity.a;
                if (bVar != null) {
                    com.yandex.passport.common.ui.compose.theme.d.a(z, bVar.isWhiteLabel(), ild.C(333741817, new r0w(i2, deleteAccountActivity), hq5Var), hq5Var, 384, 0);
                    return Unit.a;
                }
                Intrinsics.j("component");
                throw null;
            case 6:
                LogoutBottomSheetActivity logoutBottomSheetActivity = (LogoutBottomSheetActivity) obj4;
                n0 n0Var = (n0) obj3;
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i7 = LogoutBottomSheetActivity.k;
                if ((intValue2 & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                h0 h0Var = new h0(n0Var.a, n0Var.b, n0Var.c, n0Var.d, n0Var.e, n0Var.f);
                q0 k = logoutBottomSheetActivity.k();
                oq5 oq5Var3 = (oq5) hq5Var2;
                boolean h = oq5Var3.h(k);
                Object K = oq5Var3.K();
                if (h || K == kjnVar) {
                    vlv vlvVar = new vlv(1, k, q0.class, "wish", "wish(Lcom/yandex/passport/internal/ui/challenge/logout/bottomsheet/LogoutBottomsheetWish;)V", 0, 28);
                    oq5Var3.k0(vlvVar);
                    K = vlvVar;
                }
                com.yandex.passport.internal.report.reporters.h0 j = logoutBottomSheetActivity.j();
                WeakHashMap weakHashMap = rqv.w;
                s0.a(h0Var, j, (Function1) ((h9f) K), sqv.a(vci.a, new n5g(z7l.h(oq5Var3).e, 32)), oq5Var3, 0);
                return Unit.a;
            case 7:
                ((Integer) obj2).getClass();
                com.yandex.passport.internal.ui.a.l((String) obj4, (Function1) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            case 8:
                com.yandex.passport.internal.ui.domik.v vVar = (com.yandex.passport.internal.ui.domik.v) obj3;
                a0 a0Var = (a0) obj;
                com.yandex.passport.internal.ui.domik.t tVar = (com.yandex.passport.internal.ui.domik.t) obj2;
                a0Var.getClass();
                tVar.getClass();
                ((com.yandex.passport.internal.ui.domik.call.a) obj4).r.e(f0.a);
                vVar.getClass();
                com.yandex.passport.internal.analytics.n0 n0Var2 = vVar.d;
                b0 b0Var = a0Var.p;
                n0Var2.getClass();
                b0Var.getClass();
                n0Var2.c(n0Var2.e, l0.AUTH_SUCCESS, tah.b(new Pair("unsubscribe_from_maillists", b0Var.a)));
                vVar.a.u.m(tVar);
                return Unit.a;
            case 9:
                com.yandex.passport.common.ui.a aVar2 = (com.yandex.passport.common.ui.a) obj4;
                StandaloneSlothComposeActivity standaloneSlothComposeActivity = (StandaloneSlothComposeActivity) obj3;
                hq5 hq5Var3 = (hq5) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i8 = StandaloneSlothComposeActivity.c;
                if ((intValue3 & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                boolean z2 = com.yandex.plus.pay.ui.core.b.z(aVar2, hq5Var3);
                w wVar = standaloneSlothComposeActivity.a;
                if (wVar != null) {
                    com.yandex.passport.common.ui.compose.theme.d.a(z2, wVar.isWhiteLabel(), ild.C(1539540465, new r0w(i3, standaloneSlothComposeActivity), hq5Var3), hq5Var3, 384, 0);
                    return Unit.a;
                }
                Intrinsics.j("component");
                throw null;
            case 10:
                com.yandex.passport.internal.ui.sloth.ebs.b bVar2 = (com.yandex.passport.internal.ui.sloth.ebs.b) obj4;
                BiometricVerificationActivity biometricVerificationActivity = (BiometricVerificationActivity) obj3;
                hq5 hq5Var4 = (hq5) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i9 = BiometricVerificationActivity.a;
                if ((intValue4 & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var4;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var6 = (oq5) hq5Var4;
                boolean h2 = oq5Var6.h(biometricVerificationActivity);
                Object K2 = oq5Var6.K();
                if (h2 || K2 == kjnVar) {
                    K2 = new com.yandex.passport.internal.ui.sloth.authsdk.h0(i5, biometricVerificationActivity);
                    oq5Var6.k0(K2);
                }
                Function0 function0 = (Function0) K2;
                boolean h3 = oq5Var6.h(biometricVerificationActivity);
                Object K3 = oq5Var6.K();
                if (h3 || K3 == kjnVar) {
                    K3 = new r0w(11, biometricVerificationActivity);
                    oq5Var6.k0(K3);
                }
                com.yandex.passport.internal.ui.a.a(bVar2, function0, (Function2) K3, oq5Var6, 0);
                return Unit.a;
            case 11:
                com.yandex.passport.internal.ui.sloth.plusdevices.b bVar3 = (com.yandex.passport.internal.ui.sloth.plusdevices.b) obj4;
                ManagingPlusDevicesActivity managingPlusDevicesActivity = (ManagingPlusDevicesActivity) obj3;
                hq5 hq5Var5 = (hq5) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i10 = ManagingPlusDevicesActivity.a;
                if ((intValue5 & 3) == 2) {
                    oq5 oq5Var7 = (oq5) hq5Var5;
                    if (oq5Var7.z()) {
                        oq5Var7.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var8 = (oq5) hq5Var5;
                boolean h4 = oq5Var8.h(managingPlusDevicesActivity);
                Object K4 = oq5Var8.K();
                if (h4 || K4 == kjnVar) {
                    K4 = new com.yandex.passport.internal.ui.sloth.authsdk.h0(i2, managingPlusDevicesActivity);
                    oq5Var8.k0(K4);
                }
                Function0 function02 = (Function0) K4;
                boolean h5 = oq5Var8.h(managingPlusDevicesActivity);
                Object K5 = oq5Var8.K();
                if (h5 || K5 == kjnVar) {
                    K5 = new com.yandex.passport.internal.ui.bouncer.roundabout.k(9, managingPlusDevicesActivity);
                    oq5Var8.k0(K5);
                }
                com.yandex.plus.core.network.api.utils.a.f(bVar3, function02, (Function1) K5, oq5Var8, 0);
                return Unit.a;
            case 12:
                com.yandex.passport.internal.ui.sloth.webauthn.b bVar4 = (com.yandex.passport.internal.ui.sloth.webauthn.b) obj4;
                RegisterWebAuthNActivity registerWebAuthNActivity = (RegisterWebAuthNActivity) obj3;
                hq5 hq5Var6 = (hq5) obj;
                int intValue6 = ((Integer) obj2).intValue();
                int i11 = RegisterWebAuthNActivity.a;
                if ((intValue6 & 3) == 2) {
                    oq5 oq5Var9 = (oq5) hq5Var6;
                    if (oq5Var9.z()) {
                        oq5Var9.S();
                        return Unit.a;
                    }
                }
                oq5 oq5Var10 = (oq5) hq5Var6;
                boolean h6 = oq5Var10.h(registerWebAuthNActivity);
                Object K6 = oq5Var10.K();
                if (h6 || K6 == kjnVar) {
                    K6 = new com.yandex.passport.internal.ui.sloth.authsdk.h0(8, registerWebAuthNActivity);
                    oq5Var10.k0(K6);
                }
                Function0 function03 = (Function0) K6;
                boolean h7 = oq5Var10.h(registerWebAuthNActivity);
                Object K7 = oq5Var10.K();
                if (h7 || K7 == kjnVar) {
                    K7 = new r0w(12, registerWebAuthNActivity);
                    oq5Var10.k0(K7);
                }
                com.yandex.passport.internal.ui.a.k(bVar4, function03, (Function2) K7, oq5Var10, 0);
                return Unit.a;
            case 13:
                ((Integer) obj2).getClass();
                com.yandex.passport.internal.ui.sloth.webcard.j.a((i0) obj4, (wn5) obj3, (hq5) obj, rvf.R(49));
                return Unit.a;
            case 14:
                com.yandex.plus.log.api.b bVar5 = (com.yandex.plus.log.api.b) obj3;
                List list = (List) obj;
                list.getClass();
                ((com.yandex.plus.bdui.plus.analytics.c) obj2).getClass();
                bVar5.getClass();
                p pVar = new p(18, list, bVar5);
                com.yandex.plus.bdui.plus.c cVar = new com.yandex.plus.bdui.plus.c(i4, list, (tf6) obj4, bVar5);
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                return t75.c(new com.yandex.plus.bdui.scaffold.a(pVar, ern.a(com.yandex.plus.bdui.plus.scaffold.a.class), cVar, e5bVar));
            case 15:
                com.yandex.plus.bdui.m mVar = (com.yandex.plus.bdui.m) obj2;
                ((com.yandex.plus.bdui.s) obj).getClass();
                mVar.getClass();
                return new com.yandex.plus.bdui.plus.checkout.content.controller.b0(mVar, (com.yandex.plus.pay.inapp.api.b) obj4, (com.yandex.plus.log.api.b) obj3);
            case 16:
                com.yandex.plus.pay.internal.benchmark.a aVar3 = (com.yandex.plus.pay.internal.benchmark.a) obj4;
                PlusPayCompositeOffers.Offer offer = (PlusPayCompositeOffers.Offer) obj3;
                com.yandex.plus.core.benchmark.l lVar = (com.yandex.plus.core.benchmark.l) obj2;
                ((com.yandex.plus.bdui.analytics.c) obj).getClass();
                lVar.getClass();
                if (aVar3 != null) {
                    com.yandex.plus.pay.internal.benchmark.tarifficator.b bVar6 = (com.yandex.plus.pay.internal.benchmark.tarifficator.b) aVar3;
                    x97.y(bVar6.f, null, null, new com.yandex.plus.pay.internal.benchmark.tarifficator.a(lVar, bVar6, offer, null), 3);
                }
                return Unit.a;
            case 17:
                com.yandex.plus.bdui.plus.content.controller.f fVar = (com.yandex.plus.bdui.plus.content.controller.f) obj3;
                Function1 function1 = (Function1) obj;
                String str = (String) obj2;
                function1.getClass();
                str.getClass();
                com.yandex.plus.bdui.plus.content.controller.r rVar = ((com.yandex.plus.bdui.plus.content.controller.l) obj4).o;
                if (rVar == null) {
                    return null;
                }
                com.yandex.plus.bdui.content.d dVar = rVar.a;
                dVar.getClass();
                com.yandex.plus.bdui.action.a aVar4 = (com.yandex.plus.bdui.action.a) function1.invoke(dVar.b);
                com.yandex.plus.log.api.b bVar7 = (com.yandex.plus.log.api.b) fVar.b;
                if (aVar4 != null) {
                    com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.c;
                    if (bVar7.b(aVar5)) {
                        bVar7.c(aVar5, "PlusDivContentController.LogActionDispatcher", "dispatchLogAction(); action = " + aVar4);
                    }
                    ((com.yandex.plus.bdui.m) fVar.c).a.a(aVar4, new com.yandex.plus.bdui.action.h(dVar.c.c(new com.yandex.plus.bdui.plus.shared.f(str))), null);
                } else {
                    com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.d;
                    if (bVar7.b(aVar6)) {
                        bVar7.c(aVar6, "PlusDivContentController.LogActionDispatcher", "handleLogAction(); log action not defined in layout!");
                    }
                }
                return Unit.a;
            case 18:
                com.yandex.plus.bdui.s sVar = (com.yandex.plus.bdui.s) obj;
                Function0 function04 = (Function0) obj2;
                sVar.getClass();
                function04.getClass();
                return new com.yandex.plus.bdui.plus.action.serializer.r(sVar, function04, (List) obj4, (com.yandex.plus.log.api.b) obj3);
            default:
                com.yandex.plus.home.repository.api.model.panel.i iVar = (com.yandex.plus.home.repository.api.model.panel.i) obj3;
                z1 z1Var = (z1) obj;
                com.yandex.plus.home.graphql.panel.mappers.a aVar7 = (com.yandex.plus.home.graphql.panel.mappers.a) obj2;
                z1Var.getClass();
                aVar7.getClass();
                com.yandex.plus.bdui.plus.content.controller.f fVar2 = ((com.yandex.plus.home.graphql.panel.g) obj4).i;
                fVar2.getClass();
                iVar.getClass();
                ArrayList arrayList = z1Var.a;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((a2) it.next()).b);
                }
                ArrayList arrayList3 = z1Var.b;
                ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((y1) it2.next()).b);
                }
                ArrayList n = fVar2.n(arrayList2, arrayList4, true, aVar7);
                int a = tah.a(v75.o(n, 10));
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                Iterator it3 = n.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    linkedHashMap.put(((com.yandex.plus.home.repository.api.model.panel.b0) next).a, next);
                }
                List<com.yandex.plus.home.repository.api.model.panel.b0> list2 = iVar.c;
                ArrayList arrayList5 = new ArrayList();
                for (com.yandex.plus.home.repository.api.model.panel.b0 b0Var2 : list2) {
                    if (b0Var2.d) {
                        b0Var2 = (com.yandex.plus.home.repository.api.model.panel.b0) linkedHashMap.get(b0Var2.a);
                    }
                    if (b0Var2 != null) {
                        arrayList5.add(b0Var2);
                    }
                }
                return new com.yandex.plus.home.repository.api.model.panel.i(iVar.a, iVar.b, arrayList5);
        }
    }

    public /* synthetic */ p(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
