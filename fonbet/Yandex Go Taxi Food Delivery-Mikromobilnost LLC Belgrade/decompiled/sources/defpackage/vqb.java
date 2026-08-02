package defpackage;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.semantics.f;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.yandex.go.copter.city_tour.b;
import com.yandex.go.copter.city_tour.d;
import com.yandex.go.design.compose.list.a;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpCreatingDraftModalView;
import com.yandex.go.payments.shared.business.accountcreation.corp.factory.CorpSuccessDraftCreatedModalView;
import com.yandex.go.places.complaint.impl.ui.modal.ComplaintModalView;
import com.yandex.go.summary.navigation.e;
import com.yandex.go.superapp.orders.card.OrderCardView;
import com.yandex.go.ui.CircleLoadingImageView;
import com.yandex.messaging.ui.settings.contacts.ContactsSettingsFragment;
import com.yandex.payment.sdk.ui.payment.common.ContinuePaymentFragment;
import com.yandex.plus.pay.common.internal.log.PayCoreLogTag;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.ClosingOfferFragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFragment;
import com.ybsdk.screens.registration.codeconfirmation.presentation.c;
import com.ybsdk.widgets.common.CircleButtonsListView;
import defpackage.axb;
import defpackage.bxb;
import defpackage.cxb;
import defpackage.dvd;
import defpackage.mdh;
import defpackage.nwb;
import defpackage.pwb;
import defpackage.qu;
import defpackage.rud;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uwb;
import defpackage.uyj;
import defpackage.w511;
import defpackage.zy11;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import ru.yandex.taxi.design.ChipsComponent;

/* loaded from: classes15.dex */
public final /* synthetic */ class vqb implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vqb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 loadIcon$lambda$0;
        zy11 buttonsAdapterDelegate$lambda$6;
        zy11 image$lambda$0;
        zy11 onViewCreated$lambda$3;
        zy11 render$lambda$8;
        zy11 adapter$lambda$0;
        zy11 onViewCreated$lambda$8;
        zy11 ContactsScreen$lambda$1$lambda$0;
        zy11 onViewCreated$lambda$0;
        zy11 policyCheckedChangeListener$lambda$0;
        zy11 startLoadIcon$lambda$1;
        int i = this.a;
        int i2 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                loadIcon$lambda$0 = ChipsComponent.loadIcon$lambda$0((ChipsComponent) obj2, (Drawable) obj);
                return loadIcon$lambda$0;
            case 1:
                mrb mrbVar = (mrb) obj2;
                o5b0 o5b0Var = (o5b0) obj;
                tls tlsVar = mrbVar.b;
                if (tlsVar != null) {
                    tlsVar.invoke(Long.valueOf(o5b0Var.a));
                }
                mrbVar.a.dismiss();
                return zy11Var;
            case 2:
                buttonsAdapterDelegate$lambda$6 = CircleButtonsListView.buttonsAdapterDelegate$lambda$6((CircleButtonsListView) obj2, (n70) obj);
                return buttonsAdapterDelegate$lambda$6;
            case 3:
                image$lambda$0 = CircleLoadingImageView.setImage$lambda$0((CircleLoadingImageView) obj2, (Drawable) obj);
                return image$lambda$0;
            case 4:
                final b bVar = (b) obj2;
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new tls() { // from class: com.yandex.go.copter.city_tour.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        cxb cxbVar = (cxb) obj3;
                        boolean z = cxbVar instanceof bxb;
                        b bVar2 = b.this;
                        if (z) {
                            d dVar = (d) bVar2.H.get();
                            int i3 = ((bxb) cxbVar).a;
                            if (!dVar.l) {
                                dVar.a.a(Integer.valueOf(i3), dVar.h);
                                dVar.l = true;
                            }
                            uwb uwbVar = (uwb) dVar.k.get(Integer.valueOf(i3));
                            pwb pwbVar = dVar.e;
                            if (uwbVar == null) {
                                pwbVar.a.l(null);
                            } else {
                                pwbVar.a.l(new nwb(i3, uwbVar.a, uwbVar.b));
                            }
                            bVar2.r(new qu(9));
                        } else {
                            if (!(cxbVar instanceof axb)) {
                                w511.b();
                                return null;
                            }
                            tse o = bVar2.o();
                            bVar2.F.getClass();
                            sjh sjhVar = uyj.a;
                            tje.N(o, mdh.b, null, new CityTourModalViewRouterImpl$content$1$1$1(bVar2, null), 2);
                        }
                        return zy11.a;
                    }
                };
                t5d.a.getClass();
                ((agd) yfdVar).g = t5d.b;
                return zy11Var;
            case 5:
                d dVar = (d) obj2;
                String str = (String) obj;
                voe voeVar = dVar.a;
                String str2 = dVar.h;
                String str3 = str != null ? str : "";
                voeVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("requirement", str2);
                hashMap.put("error", str3);
                voeVar.a.a("Copters.CityTourCard.LoadingFailed", hashMap, 1, new HashMap());
                return zy11Var;
            case 6:
                wzb wzbVar = (wzb) obj2;
                ((pep0) wzbVar.j).f(new pw1(i2, (i85) wzbVar.i.get(), new qa0(5, wzbVar)), new mbe0((String) obj, r4), hxx.a);
                return zy11Var;
            case 7:
                onViewCreated$lambda$3 = ClosingOfferFragment.onViewCreated$lambda$3((ClosingOfferFragment) obj2, (mx60) obj);
                return onViewCreated$lambda$3;
            case 8:
                render$lambda$8 = CodeConfirmationFragment.render$lambda$8((CodeConfirmationFragment) obj2, (String) obj);
                return render$lambda$8;
            case 9:
                c cVar = (c) obj2;
                cVar.Z(new p9c((Bundle) obj));
                cVar.H.e();
                return zy11Var;
            case 10:
                return Boolean.valueOf(((WeakReference) obj).get() == ((OrderCardView) obj2));
            case 11:
                ((pqc) obj2).a.startActivity((Intent) obj);
                return zy11Var;
            case 12:
                adapter$lambda$0 = ComplaintModalView.adapter$lambda$0((ComplaintModalView) obj2, (axc) obj);
                return adapter$lambda$0;
            case 13:
                ((e) obj2).O.a((String) obj);
                return zy11Var;
            case 14:
                mdd0.g(((com.yandex.plus.pay.internal.feature.offers.b) obj2).d, PayCoreLogTag.OFFERS, "Error when receiving composite offers. Retrying...", (Throwable) obj, 8);
                return zy11Var;
            case 15:
                final rud rudVar = (rud) obj2;
                final yfd yfdVar2 = (yfd) obj;
                final qud qudVar = new qud(rudVar, (wud) ((agd) yfdVar2).a);
                io9 io9Var = rudVar.F;
                agd agdVar = (agd) yfdVar2;
                wud wudVar = (wud) agdVar.a;
                sud b = ((gvd) io9Var.a).b(wudVar.b, wudVar.c, wudVar.d);
                if (b == null) {
                    ny61.r("mapSelectorInfo returned null, validation should be done before");
                    return null;
                }
                String str4 = b.a;
                String str5 = b.b;
                ArrayList<tud> arrayList = b.c;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                for (tud tudVar : arrayList) {
                    arrayList2.add(new evd(tudVar.a, tudVar.b, tudVar.f, tudVar.g, tudVar.d, tudVar.e));
                }
                agdVar.c = new g92(2, new fvd(str4, str5, a.b(arrayList2, new sdd(25)), b.d));
                agdVar.e = new tls() { // from class: com.yandex.go.requirements.navigation.selector.compound.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        rud rudVar2 = rud.this;
                        tje.N(rudVar2.o(), null, null, new CompoundOptionSelectComposeRouter$content$1$1$1(rudVar2, (dvd) obj3, qudVar, yfdVar2, null), 3);
                        return zy11.a;
                    }
                };
                a6d.a.getClass();
                agdVar.g = a6d.b;
                return zy11Var;
            case 16:
                f.q((mnq0) obj, ((evd) obj2).e);
                return zy11Var;
            case 17:
                return Boolean.valueOf(((nyd) obj2).a((myd) obj));
            case 18:
                uv6 uv6Var = (uv6) obj2;
                yfd yfdVar3 = (yfd) obj;
                ((agd) yfdVar3).e = new a7b(29, uv6Var, new io9(uv6Var));
                b6d.a.getClass();
                ((agd) yfdVar3).g = b6d.b;
                return zy11Var;
            case 19:
                ((com.yandex.go.payments.cards.navigation.a) obj).n1((v920) obj2);
                return zy11Var;
            case 20:
                return new w50(9, (AnimatedVectorDrawableCompat) obj2);
            case 21:
                ((u9e) obj2).y.v().a();
                return zy11Var;
            case 22:
                oae oaeVar = (oae) obj2;
                mnq0 mnq0Var = (mnq0) obj;
                CharSequence charSequence = oaeVar.d;
                if (charSequence == null) {
                    charSequence = "";
                }
                String str6 = oaeVar.c;
                f.l(mnq0Var, ((Object) charSequence) + " " + (str6 != null ? str6 : ""));
                f.p(mnq0Var, 0);
                return zy11Var;
            case 23:
                onViewCreated$lambda$8 = ContactsFragment.onViewCreated$lambda$8((ContactsFragment) obj2, (mx60) obj);
                return onViewCreated$lambda$8;
            case 24:
                com.yandex.messaging.contacts.sync.a aVar = (com.yandex.messaging.contacts.sync.a) obj2;
                Set N0 = kotlin.collections.a.N0(aVar.d.v().d());
                at2 at2Var = aVar.d;
                at2Var.v().a();
                qa2 qa2Var = ydz.a;
                if (qa2Var.a()) {
                    ydz.a();
                }
                ((Number) androidx.room.util.a.b(at2Var.d().a, false, true, new mr21(i2))).intValue();
                if (qa2Var.a()) {
                    ydz.a();
                }
                ((Number) androidx.room.util.a.b(at2Var.r0().b, false, true, new xpy(15))).intValue();
                if (qa2Var.a()) {
                    ydz.a();
                }
                aVar.e.c(N0);
                return zy11Var;
            case 25:
                ContactsScreen$lambda$1$lambda$0 = ContactsSettingsFragment.ContactsScreen$lambda$1$lambda$0((ContactsSettingsFragment) obj2, (ude) obj);
                return ContactsScreen$lambda$1$lambda$0;
            case 26:
                onViewCreated$lambda$0 = ContinuePaymentFragment.onViewCreated$lambda$0((ContinuePaymentFragment) obj2, (hle) obj);
                return onViewCreated$lambda$0;
            case 27:
                policyCheckedChangeListener$lambda$0 = CorpCreatingDraftModalView.policyCheckedChangeListener$lambda$0((CorpCreatingDraftModalView) obj2, ((Boolean) obj).booleanValue());
                return policyCheckedChangeListener$lambda$0;
            case 28:
                startLoadIcon$lambda$1 = CorpSuccessDraftCreatedModalView.startLoadIcon$lambda$1((AppCompatImageView) obj2, (Drawable) obj);
                return startLoadIcon$lambda$1;
            default:
                xxe xxeVar = (xxe) obj2;
                f.l((mnq0) obj, ((Object) xxeVar.c) + " " + ((Object) xxeVar.d));
                return zy11Var;
        }
    }
}
