package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.semantics.d;
import androidx.core.app.w0;
import androidx.core.graphics.drawable.IconCompat;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.masstransit.sdk.camera.view.MtQRCameraPreview;
import com.yandex.go.payments.shared.family.web.nativeapi.response.PostcardInfoResponse;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$FoundModalButtonName;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$FoundModalCloseReason;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$FoundModalFeedbackAnswer;
import com.yandex.go.pickup_from_photo.data.b;
import com.yandex.go.preorder.navigation.c;
import com.yandex.go.preorder.navigation.h;
import com.yandex.messaging.core.net.entities.ContactData;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.authorized.chat.notifications.builder.f;
import com.yandex.messaging.internal.view.messagemenu.MessageMenuDialog;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.main.internal.screens.products.ProductsFragment;
import com.ybsdk.feature.main.internal.screens.products.ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType;
import com.ybsdk.feature.main.internal.screens.products.a;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.view.SubscriptionWidgetView;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.data.entities.SubscriptionStatus;
import com.ybsdk.feature.rebind.payment.internal.screens.RebindPaymentMethodFragment;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.summary.requirements.list.interactors.k0;

/* loaded from: classes13.dex */
public final /* synthetic */ class ugd0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ugd0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v98, types: [T, kyj0] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean showBottomSheet$lambda$42$lambda$41$lambda$40;
        vzj0 vzj0Var;
        v1v0 v1v0Var;
        zy11 onViewCreated$lambda$4$lambda$2;
        int i = 28;
        int i2 = 9;
        int i3 = 2;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        switch (this.a) {
            case 0:
                v7d0 v7d0Var = (v7d0) this.b;
                y4a0 y4a0Var = (y4a0) this.c;
                ogd0 ogd0Var = (ogd0) obj;
                ogd0Var.a = v7d0Var;
                ogd0Var.c = ffx.y(new k7d0(4, y4a0Var));
                ogd0Var.b = (b5d0) y4a0Var.b;
                break;
            case 1:
                ((wls) this.b).invoke(((kjg0) this.c).a, (String) obj);
                break;
            case 2:
                ((kbp) this.b).invoke((String) this.c, (PostcardInfoResponse) obj);
                break;
            case 3:
                break;
            case 4:
                poe0 poe0Var = (poe0) this.b;
                i7x0 i7x0Var = (i7x0) this.c;
                jyl jylVar = (jyl) obj;
                tls tlsVar = (tls) poe0Var.x;
                tlsVar.invoke(jylVar);
                jylVar.d = i7x0Var;
                v3a1.b(jylVar, (m0m) poe0Var.b, tlsVar, (tse) poe0Var.c);
                break;
            case 5:
                ((c) this.b).r(new ugd0(6, (bn30) this.c, (bn30) obj));
                break;
            case 6:
                bn30 bn30Var = (bn30) this.b;
                bn30 bn30Var2 = (bn30) this.c;
                gre0 gre0Var = (gre0) obj;
                if (bn30Var == null) {
                    bn30Var = bn30Var2;
                }
                h hVar = gre0Var.a;
                hVar.r(new qu(i2));
                ((h010) hVar.P.get()).a(bn30Var, null);
                break;
            case 7:
                ((u3f0) this.b).b.c((oll0) obj, (ArrayList) this.c);
                break;
            case 8:
                IconCompat iconCompat = (IconCompat) this.b;
                f fVar = (f) this.c;
                w0 w0Var = new w0();
                String str = ((ii60) obj).f;
                if (str != null) {
                    fVar.b.getClass();
                    r8 = str;
                }
                w0Var.a = r8;
                w0Var.b = iconCompat;
                break;
            case 9:
                showBottomSheet$lambda$42$lambda$41$lambda$40 = ProductsFragment.showBottomSheet$lambda$42$lambda$41$lambda$40((ProductsFragment) this.b, (ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType) this.c, (Uri) obj);
                break;
            case 10:
                x4c.g("Failed to parse backgroundColor in product", null, "color=" + ((ThemedParameter) this.b) + " product=" + ((String) this.c), null, 10);
                break;
            case 11:
                qis qisVar = (qis) this.b;
                a aVar = (a) this.c;
                break;
            case 12:
                zy11 zy11Var = zy11.a;
                qqf0 qqf0Var = (qqf0) this.b;
                tls tlsVar2 = (tls) this.c;
                mnq0 mnq0Var = (mnq0) obj;
                androidx.compose.ui.semantics.f.p(mnq0Var, 2);
                androidx.compose.ui.semantics.f.q(mnq0Var, ((oqf0) qqf0Var).a);
                if (tlsVar2 == null) {
                    mnq0Var.a(d.q, zy11Var);
                    break;
                }
                break;
            case 13:
                ((a60) ((com.yandex.go.promocodes.c) this.b).D).c((String) this.c, v770.n);
                ((sy60) obj).a();
                break;
            case 14:
                wls wlsVar = (wls) this.b;
                a8a a8aVar = (a8a) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                wlsVar.invoke(a8aVar.h.a, bool);
                break;
            case 15:
                com.yandex.messaging.ui.reactions.a aVar2 = (com.yandex.messaging.ui.reactions.a) this.b;
                String requiredChatId = ((ServerMessageRef) this.c).getRequiredChatId();
                sfl0 sfl0Var = aVar2.w;
                new bae(m620.d, requiredChatId, (String) obj);
                ((b0x) sfl0Var).c();
                MessageMenuDialog messageMenuDialog = aVar2.y;
                if (messageMenuDialog != null) {
                    messageMenuDialog.close();
                }
                break;
            case 16:
                break;
            case 17:
                e9g0 e9g0Var = (e9g0) this.b;
                SubscriptionStatus subscriptionStatus = (SubscriptionStatus) this.c;
                tzj0 tzj0Var = ((e9g0) obj).k;
                vzj0 vzj0Var2 = tzj0Var.c;
                if (vzj0Var2 != null) {
                    v1v0 v1v0Var2 = vzj0Var2.a;
                    if (v1v0Var2 != null) {
                        SubscriptionStatus subscriptionStatus2 = SubscriptionStatus.SUCCESS;
                        v1v0Var = v1v0.a(v1v0Var2, subscriptionStatus == subscriptionStatus2, false, subscriptionStatus != subscriptionStatus2, 3);
                    } else {
                        v1v0Var = null;
                    }
                    vzj0Var = vzj0.a(vzj0Var2, v1v0Var);
                } else {
                    vzj0Var = null;
                }
                break;
            case 18:
                qk11 qk11Var = (qk11) this.b;
                break;
            case 19:
                break;
            case 20:
                ebg0 ebg0Var = (ebg0) this.b;
                cma0 cma0Var = (cma0) this.c;
                ccv ccvVar = new ccv(vxg0.ybsdk_ic_circle_gray);
                rev revVar = rev.p;
                Context context = ebg0Var.a;
                break;
            case 21:
                n70 n70Var = (n70) this.b;
                v8g0 v8g0Var = (v8g0) this.c;
                SubscriptionWidgetView subscriptionWidgetView = ((v461) n70Var.N).a;
                subscriptionWidgetView.render(((u1v0) n70Var.Z()).c);
                subscriptionWidgetView.setListener(new qbg0(v8g0Var, c == true ? 1 : 0));
                break;
            case 22:
                MtQRCameraPreview mtQRCameraPreview = (MtQRCameraPreview) this.b;
                mtQRCameraPreview.post(new ud30(24, mtQRCameraPreview, (ggg0) obj, (tls) this.c));
                break;
            case 23:
                onViewCreated$lambda$4$lambda$2 = RebindPaymentMethodFragment.onViewCreated$lambda$4$lambda$2((e661) this.b, (RebindPaymentMethodFragment) this.c, (Throwable) obj);
                break;
            case 24:
                com.yandex.go.pickup_from_photo.navigation.d dVar = (com.yandex.go.pickup_from_photo.navigation.d) this.b;
                o8g0 o8g0Var = (o8g0) this.c;
                mhi0 mhi0Var = (mhi0) obj;
                xv10 xv10Var = dVar.I;
                ru.yandex.taxi.address.clarification.impl.repo.a aVar3 = (ru.yandex.taxi.address.clarification.impl.repo.a) xv10Var.b;
                b bVar = (b) xv10Var.a;
                umb0 umb0Var = (umb0) xv10Var.w;
                if (jl40.l(mhi0Var, ghi0.a)) {
                    umb0Var.e(PhotoPickUpAnalytics$FoundModalButtonName.Done);
                    ((com.yandex.go.clarify_address.a) ((kr0) xv10Var.c)).c(true, AddressClarificationReason.Map);
                    aVar3.m = true;
                    aVar3.n = false;
                    pv0 pv0Var = bVar.i;
                    if (pv0Var != null) {
                        bVar.f.w(pv0Var);
                    }
                    g2t g2tVar = bVar.h;
                    if (g2tVar != null) {
                        ((f2t) ((e2t) bVar.b.a)).b(g2tVar);
                    }
                    pv0 pv0Var2 = (pv0) bVar.e.i().orElse(null);
                    if (pv0Var2 != null) {
                        ((com.yandex.go.pickup_from_photo.navigation.d) o8g0Var.b).r(new t71(pv0Var2, 16));
                    }
                    umb0Var.d(PhotoPickUpAnalytics$FoundModalCloseReason.Done);
                } else if (jl40.l(mhi0Var, lhi0.a)) {
                    umb0Var.e(PhotoPickUpAnalytics$FoundModalButtonName.Retry);
                    aVar3.m = true;
                    aVar3.n = false;
                    bVar.c();
                    ((com.yandex.go.pickup_from_photo.navigation.d) o8g0Var.b).r(new cbg0(i));
                    umb0Var.d(PhotoPickUpAnalytics$FoundModalCloseReason.Retry);
                } else if (jl40.l(mhi0Var, ehi0.a)) {
                    com.yandex.go.pickup_from_photo.navigation.d dVar2 = (com.yandex.go.pickup_from_photo.navigation.d) o8g0Var.b;
                    dVar2.D((m950) dVar2.K.get(), new s71(((avj0) dVar2.J).h(kyh0.search_source_address_hint), PointType.SOURCE, false, false, true), new gnb0(dVar2, c4 == true ? 1 : 0));
                } else if (jl40.l(mhi0Var, hhi0.a)) {
                    aVar3.m = true;
                    aVar3.n = false;
                    ((thi0) o8g0Var.a).a.invoke();
                } else if (jl40.l(mhi0Var, jhi0.a)) {
                    com.yandex.go.pickup_from_photo.navigation.d dVar3 = (com.yandex.go.pickup_from_photo.navigation.d) o8g0Var.b;
                    dVar3.A((m950) dVar3.L.get(), new mbe0(r8, c3 == true ? 1 : 0), new com.yandex.go.pickup_from_photo.navigation.a(dVar3, c2 == true ? 1 : 0));
                } else if (jl40.l(mhi0Var, fhi0.a)) {
                    bVar.c();
                    ((com.yandex.go.pickup_from_photo.navigation.d) o8g0Var.b).r(new qu(i2));
                    umb0Var.d(PhotoPickUpAnalytics$FoundModalCloseReason.Back);
                } else if (jl40.l(mhi0Var, ihi0.a)) {
                    umb0Var.i(PhotoPickUpAnalytics$FoundModalFeedbackAnswer.No);
                    xv10Var.s();
                } else if (!jl40.l(mhi0Var, khi0.a)) {
                    w511.b();
                    break;
                } else {
                    umb0Var.i(PhotoPickUpAnalytics$FoundModalFeedbackAnswer.Yes);
                    xv10Var.s();
                }
                break;
            case 25:
                nsi0 nsi0Var = (nsi0) this.b;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                rwo rwoVar = nsi0Var.b;
                qv90.a.getClass();
                ((y22) rwoVar).a(sv90.e0().d(null));
                wj00 wj00Var = ((fvv) obj).s;
                ref$ObjectRef.element = new kyj0(wj00Var != null ? wj00Var.toString() : null);
                break;
            case 26:
                ContactData[] contactDataArr = (ContactData[]) this.b;
                gui0 gui0Var = (gui0) this.c;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (ContactData contactData : contactDataArr) {
                    String phoneId = contactData.getPhoneId();
                    if (phoneId != null) {
                        String userId = contactData.getUserId();
                        boolean deleted = contactData.getDeleted();
                        String contactName = contactData.getContactName();
                        cvi0 cvi0Var = new cvi0(userId, phoneId, contactName, deleted, null);
                        dvi0 dvi0Var = gui0Var.d;
                        String f = dvi0Var.f(contactData.getUserId(), contactData.getPhoneId());
                        if (f == null) {
                            f = null;
                        } else {
                            dvi0Var.b(f);
                        }
                        if (f != null) {
                            linkedHashSet.add(f);
                        }
                        dvi0 dvi0Var2 = gui0Var.d;
                        Long g = dvi0Var2.g(phoneId);
                        if (g == null) {
                            dvi0Var2.h(cvi0Var);
                        } else {
                            dvi0Var2.i(new cvi0(userId, phoneId, contactName, deleted, g));
                        }
                        String phoneId2 = contactData.getPhoneId();
                        if (phoneId2 != null) {
                            linkedHashSet.add(phoneId2);
                        }
                    } else if (ydz.a.a()) {
                        ydz.b("Sync:Contacts:Download:Remote2LocalWorker", "Contact has no phone_id: user_id=" + contactData.getUserId());
                    }
                }
                if (ydz.a.a()) {
                    ydz.a();
                }
                gui0Var.a.c(linkedHashSet);
                break;
            case 27:
                o8g0 o8g0Var2 = (o8g0) this.b;
                v5c0 v5c0Var = (v5c0) this.c;
                zgj0 zgj0Var = (zgj0) obj;
                if (zgj0Var != null) {
                    String str2 = zgj0Var.a;
                    String str3 = zgj0Var.b;
                    k0 k0Var = (k0) o8g0Var2.a;
                    lot0 lot0Var = k0Var.b;
                    if (lot0Var.b(str2) != null) {
                        if (evu0.J(str3)) {
                            lot0Var.a().w(str2);
                        } else {
                            lot0Var.a().r(str2, str3);
                        }
                    }
                    k0Var.e(str2, evu0.J(str3) ? null : str3);
                    ((t) v5c0Var.b).r(new qu(i2));
                    ((f580) o8g0Var2.b).b(str2, false);
                    break;
                } else {
                    o8g0Var2.getClass();
                    w511.b();
                    break;
                }
            case 28:
                t tVar = (t) this.b;
                o8g0 o8g0Var3 = (o8g0) this.c;
                yfd yfdVar = (yfd) obj;
                v5c0 v5c0Var2 = new v5c0(i, tVar);
                g92 g92Var = new g92(i3, new ahj0((mhj0) ((agd) yfdVar).a));
                agd agdVar = (agd) yfdVar;
                agdVar.c = g92Var;
                agdVar.e = new ugd0(27, o8g0Var3, v5c0Var2);
                wad.a.getClass();
                agdVar.g = wad.b;
                break;
            default:
                nhj0 nhj0Var = (nhj0) this.b;
                tls tlsVar3 = (tls) this.c;
                List list = nhj0Var.f;
                ((m6y) ((u6y) obj)).f(list.size(), null, new rc0(list, 11, ehj0.a), new androidx.compose.runtime.internal.a(802480018, new zx8(list, tlsVar3, 8), true));
                break;
        }
        return zy11.a;
    }
}
