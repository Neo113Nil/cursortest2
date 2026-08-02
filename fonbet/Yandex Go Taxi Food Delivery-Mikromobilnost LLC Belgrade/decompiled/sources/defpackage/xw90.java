package defpackage;

import android.content.Context;
import android.net.Uri;
import com.yandex.go.payments.paymentlist.details.PaymentMethodDetailsModalView;
import com.yandex.go.pickup_from_photo.navigation.c;
import com.yandex.go.pickup_from_photo.presentation.PickupFromPhotoModalView;
import com.yandex.go.pickup_from_photo.presentation.b;
import com.yandex.go.places.impl.ui.main.d;
import com.yandex.go.places.impl.ui.main.map.filters.PlacesCategoryFiltersModalView;
import com.yandex.go.places.impl.ui.main.map.filters.f;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v1.OrganizationCardFlexModalView;
import com.yandex.go.places.searchbar.impl.presentation.a;
import com.yandex.go.places.searchbar.impl.ui.PlacesSearchbarContainerView;
import com.yandex.go.places.searchbar.impl.ui.searchbar.PlacesSearchbarView;
import com.yandex.go.places.webview.api.navigation.PlacesWebAuthType;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentPollingResult;
import com.yandex.payment.sdk.core.impl.ChallengeType;
import com.yandex.xplat.common.YSError;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;
import ru.yandex.taxi.masstransit.paymentcards.TransportCardAction;

/* loaded from: classes13.dex */
public final /* synthetic */ class xw90 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xw90(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        PaymentPollingResult paymentPollingResult;
        PaymentPollingResult paymentPollingResult2;
        b cameraController_delegate$lambda$0;
        f fVar;
        f fVar2;
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        a aVar;
        tls tlsVar;
        tls tlsVar2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                tls tlsVar3 = (tls) obj;
                h111 h111Var = ((b1v) ((c1v) obj2)).a;
                TransportCardAction transportCardAction = h111Var.h;
                p011 p011Var = h111Var.j;
                int i2 = zw90.a[transportCardAction.ordinal()];
                if (i2 == 1) {
                    String str = h111Var.i;
                    tlsVar3.invoke(new xd31(str != null ? Uri.parse(str) : Uri.EMPTY, p011Var));
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    tlsVar3.invoke(new yd31(p011Var));
                }
                return zy11Var;
            case 1:
                ((ax90) ((vyc) obj2).c).a.a.a(new f770(((cx90) ((n351) obj)).f, new xvq(29)));
                return zy11Var;
            case 2:
                ((tls) obj).invoke(((oy90) obj2).d);
                return zy11Var;
            case 3:
                ryj0 ryj0Var = (ryj0) obj2;
                int i3 = vme.i[((com.yandex.xplat.payment.sdk.PaymentPollingResult) obj).ordinal()];
                if (i3 == 1) {
                    paymentPollingResult = PaymentPollingResult.SUCCESS;
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    paymentPollingResult = PaymentPollingResult.WAIT_FOR_PROCESSING;
                }
                ryj0Var.onSuccess(new um0(paymentPollingResult));
                return zy11Var;
            case 4:
                p370 p370Var = (p370) obj2;
                e770 e770Var = (e770) obj;
                u1n.m((u1n) p370Var.c, e770Var.b);
                ((dv8) p370Var.w).d(e770Var.a);
                return zy11Var;
            case 5:
                ((PaymentMethodDetailsModalView) obj2).setDefaultLeadIcon((Integer) obj);
                return zy11Var;
            case 6:
                ((tls) obj).invoke(((h6a0) obj2).i);
                return zy11Var;
            case 7:
                PaymentKitError.Companion.getClass();
                ((p370) obj2).i(com.yandex.payment.sdk.core.data.a.b((YSError) obj));
                return zy11Var;
            case 8:
                wga0 wga0Var = (wga0) obj2;
                com.yandex.xplat.payment.sdk.PaymentPollingResult paymentPollingResult3 = (com.yandex.xplat.payment.sdk.PaymentPollingResult) obj;
                wga0Var.i.invoke();
                ryj0 ryj0Var2 = wga0Var.n;
                if (ryj0Var2 != null) {
                    int i4 = vme.i[paymentPollingResult3.ordinal()];
                    if (i4 == 1) {
                        paymentPollingResult2 = PaymentPollingResult.SUCCESS;
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return null;
                        }
                        paymentPollingResult2 = PaymentPollingResult.WAIT_FOR_PROCESSING;
                    }
                    ryj0Var2.onSuccess(paymentPollingResult2);
                }
                return zy11Var;
            case 9:
                PaymentKitError.Companion.getClass();
                PaymentKitError b = com.yandex.payment.sdk.core.data.a.b((YSError) obj);
                ryj0 ryj0Var3 = ((wga0) obj2).n;
                if (ryj0Var3 != null) {
                    ryj0Var3.i(b);
                }
                return zy11Var;
            case 10:
                ((ox90) ((nw70) obj2).b).d(Uri.parse(((anh) obj).a.toString()));
                return zy11Var;
            case 11:
                String str2 = (String) obj2;
                boolean l = jl40.l(str2, ChallengeType.CHALLENGE_3DS.getChallengeName());
                ox90 ox90Var = (ox90) ((oy80) obj).b;
                if (l) {
                    ox90Var.c();
                } else {
                    ox90Var.b(str2);
                }
                return zy11Var;
            case 12:
                ct20 ct20Var = (ct20) obj;
                ljh ljhVar = ((wga0) obj2).p;
                if (ljhVar != null) {
                    w89 w89Var = (w89) ct20Var;
                    ljhVar.a.onSuccess(new rm0(Uri.parse(w89Var.b), w89Var.c));
                }
                return zy11Var;
            case 13:
                ((rza0) obj2).a.b.g((Permission) obj);
                return zy11Var;
            case 14:
                tls tlsVar4 = (tls) obj;
                ppm0 ppm0Var = ((ru.yandex.taxi.scooters.presentation.feedback.comment.a) obj2).V;
                if (ppm0Var != null) {
                    tlsVar4.invoke(ppm0Var);
                }
                return zy11Var;
            case 15:
                tls tlsVar5 = (tls) obj;
                ikb0 ikb0Var = (ikb0) obj2;
                if (tlsVar5 != null) {
                    tlsVar5.invoke(ikb0Var.a);
                }
                return zy11Var;
            case 16:
                tls tlsVar6 = (tls) obj;
                lkb0 lkb0Var = (lkb0) obj2;
                if (tlsVar6 != null) {
                    tlsVar6.invoke(lkb0Var.getId());
                }
                return zy11Var;
            case 17:
                cameraController_delegate$lambda$0 = PickupFromPhotoModalView.cameraController_delegate$lambda$0((Context) obj2, (PickupFromPhotoModalView) obj);
                return cameraController_delegate$lambda$0;
            case 18:
                c cVar = (c) obj2;
                cVar.E((cnb0) cVar.T.getValue(), zy11Var, new qob0((cob0) obj, cVar), hxx.a);
                return zy11Var;
            case 19:
                ((com.yandex.go.places.impl.ui.bookings.adapter.a) obj2).U.invoke((l5c0) obj);
                return zy11Var;
            case 20:
                k5c0 k5c0Var = (k5c0) obj2;
                PlacesCategoryFiltersModalView placesCategoryFiltersModalView = (PlacesCategoryFiltersModalView) obj;
                String str3 = k5c0Var.d;
                if (str3 == null || evu0.J(str3)) {
                    fVar = placesCategoryFiltersModalView.presenter;
                    List list = k5c0Var.e;
                    fVar.getClass();
                    List list2 = list;
                    if (list2 != null && !list2.isEmpty()) {
                        atj atjVar = (atj) ((d) fVar.A.a).D.a;
                        atjVar.A((m950) atjVar.M.get(), new x5c0(list), sy60.Q2);
                    }
                } else {
                    fVar2 = placesCategoryFiltersModalView.presenter;
                    atj atjVar2 = (atj) ((d) fVar2.A.a).D.a;
                    atjVar2.A((m950) atjVar2.L.get(), new ugc0(str3, PlacesWebAuthType.OAUTH, false, 12), qgc0.U3);
                }
                return zy11Var;
            case 21:
                com.yandex.go.places.impl.navigation.discovery.map.a aVar2 = (com.yandex.go.places.impl.navigation.discovery.map.a) obj2;
                xl80 xl80Var = (xl80) obj;
                r0 r0Var = aVar2.V.a;
                do {
                    value = r0Var.getValue();
                    arrayList = new ArrayList();
                    for (Object obj3 : (List) value) {
                        if (!jl40.l(((bcc0) obj3).a, xl80Var)) {
                            arrayList.add(obj3);
                        }
                    }
                } while (!r0Var.k(value, arrayList));
                com.yandex.go.places.impl.navigation.discovery.map.a.i0(aVar2, qoi0.a(OrganizationCardFlexModalView.class));
                return zy11Var;
            case 22:
                sls slsVar = (sls) obj;
                r0 r0Var2 = ((com.yandex.go.places.impl.navigation.common.navigator.internal.b) obj2).b.a;
                do {
                    value2 = r0Var2.getValue();
                    arrayList2 = new ArrayList();
                    for (Object obj4 : (List) value2) {
                        if (!(((bcc0) obj4).a instanceof wl80)) {
                            arrayList2.add(obj4);
                        }
                    }
                } while (!r0Var2.k(value2, arrayList2));
                slsVar.invoke();
                return zy11Var;
            case 23:
                ((com.yandex.go.places.impl.navigation.common.navigator.internal.b) obj2).j.a(new bov0(false, (khv0) null, (ijv0) djv0.a, 11), new rd50((zzs) obj, mb50.b, "", false, false, "", null));
                return zy11Var;
            case 24:
                PlacesSearchbarContainerView placesSearchbarContainerView = (PlacesSearchbarContainerView) obj;
                if (((yec0) obj2) instanceof xec0) {
                    aVar = placesSearchbarContainerView.presenter;
                    aVar.getClass();
                }
                return zy11Var;
            case 25:
                PlacesSearchbarView placesSearchbarView = (PlacesSearchbarView) obj;
                fr frVar = ((xec0) ((yec0) obj2)).b;
                if (frVar != null) {
                    tlsVar = placesSearchbarView.actionHandler;
                    tlsVar.invoke(frVar);
                }
                return zy11Var;
            case 26:
                PlacesSearchbarView placesSearchbarView2 = (PlacesSearchbarView) obj;
                fr frVar2 = ((wec0) obj2).d;
                if (frVar2 != null) {
                    tlsVar2 = placesSearchbarView2.actionHandler;
                    tlsVar2.invoke(frVar2);
                }
                return zy11Var;
            case 27:
                return Integer.valueOf(tje.r(((Number) ((sls) obj).invoke()).intValue(), (Context) ((bu0) obj2).a));
            case 28:
                return Integer.valueOf(tje.r(((Number) ((sls) obj).invoke()).intValue(), (Context) ((xv10) obj2).a));
            default:
                return Integer.valueOf(tje.r(((Number) ((sls) obj).invoke()).intValue(), ((zfc0) obj2).a));
        }
    }

    public /* synthetic */ xw90(tls tlsVar, int i, Object obj) {
        this.a = i;
        this.c = tlsVar;
        this.b = obj;
    }
}
