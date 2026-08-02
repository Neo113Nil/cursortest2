package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.HandlerThread;
import android.text.Editable;
import android.widget.FrameLayout;
import androidx.compose.ui.semantics.f;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.yandex.go.flex.common.ui.FlexFramingPopupModalView;
import com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewView;
import com.yandex.go.panorama.impl.GoPanoramaView;
import com.yandex.messaging.internal.gif.GifDrawable;
import com.yandex.payment.sdk.flex.impl.b;
import com.yandex.xplat.payment.sdk.PartnerInfo;
import com.yandex.xplat.payment.sdk.PaymentMethod;
import com.yandex.xplat.payment.sdk.PaymentMethodType;
import com.yandex.xplat.payment.sdk.YBCardType;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.AgreementImageEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.futurepayments.internal.screens.FuturePaymentsFragment;
import com.ybsdk.feature.savings.internal.screens.fund.creation.FundCreationFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.view.GuidelinesWidgetView;
import com.ybsdk.feature.transfer.version2.internal.screens.fund.FundDocsNoticeFragment;
import com.ybsdk.widgets.common.YbButtonView;
import flex.feature.flexoverlaycontroller.decorviewprovider.DecorViewLifecycle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.a;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerModalView;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.vendor_api.google.bank_card.GmsBankCardRecognitionActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class s1r implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s1r(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        PartnerInfo partnerInfo;
        zy11 insetsType$lambda$0;
        rbv nbvVar;
        oas oasVar;
        AgreementImageEntity agreementImageEntity;
        ThemedImageUrlEntity headerImage;
        String str;
        String str2;
        zy11 insetsType$lambda$02;
        boolean onAttachedToWindow$lambda$0;
        zy11 viewBinding$lambda$5$lambda$4;
        zy11 viewBinding$lambda$4$lambda$3;
        boolean viewBinding$lambda$2$lambda$0;
        zy11 centerCardListener$lambda$0;
        zy11 startAnimations$lambda$6;
        boolean onCreate$lambda$0;
        zy11 notifyChangePinListener$lambda$0;
        zy11 createGuidelineItemView$lambda$6$lambda$4;
        int i = 5;
        int i2 = 8;
        Throwable th = null;
        switch (this.a) {
            case 0:
                t1r t1rVar = (t1r) this.b;
                jln jlnVar = t1rVar.a;
                String str3 = t1rVar.b.a;
                wwf wwfVar = (wwf) jlnVar.b;
                md51 j = ymx.j(w0b1.a((wh6) wwfVar.b, (xh6) wwfVar.c, new xc8(wwfVar, str3)), new sxo(7, jlnVar, str3), null, 5);
                sxo sxoVar = new sxo(i2, t1rVar, (String) obj);
                ymx ymxVar = (ymx) j;
                ymxVar.getClass();
                return ymx.j(ymxVar, sxoVar, null, 5);
            case 1:
                i3y i3yVar = ((g4r) this.b).c;
                ull0 T0 = ((oll0) obj).T0("SELECT * FROM filters");
                try {
                    int r = eja1.r(T0, "filter_id");
                    int r2 = eja1.r(T0, "chat_types");
                    int r3 = eja1.r(T0, "namespaces");
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        String Y1 = T0.Y1(r);
                        Set set = (Set) ((j6w) i3yVar.getValue()).l(T0.isNull(r2) ? null : T0.Y1(r2));
                        if (set == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Set<kotlin.Int>', but it was NULL.");
                        }
                        Set set2 = (Set) ((j6w) i3yVar.getValue()).l(T0.isNull(r3) ? null : T0.Y1(r3));
                        if (set2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Set<kotlin.Int>', but it was NULL.");
                        }
                        arrayList.add(new k4r(Y1, set, set2));
                    }
                    T0.close();
                    return arrayList;
                } finally {
                    T0.close();
                }
            case 2:
                laa0 laa0Var = (laa0) ((twd) this.b).b;
                PaymentMethod paymentMethod = (PaymentMethod) obj;
                PartnerInfo partnerInfo2 = paymentMethod.getPartnerInfo();
                YBCardType ybCardType = partnerInfo2 != null ? partnerInfo2.getYbCardType() : null;
                if (ybCardType == null || (partnerInfo = paymentMethod.getPartnerInfo()) == null) {
                    z = true;
                } else {
                    z = true;
                    if (partnerInfo.getIsYBCard()) {
                        if (!laa0Var.f || !laa0Var.g.contains(ybCardType)) {
                            z2 = false;
                            return Boolean.valueOf(z2);
                        }
                        z2 = z;
                        return Boolean.valueOf(z2);
                    }
                }
                if (paymentMethod.getType() == PaymentMethodType.Card) {
                    z2 = laa0Var.a;
                } else {
                    if (paymentMethod.getType() == PaymentMethodType.SbpToken) {
                        z2 = laa0Var.e;
                    }
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            case 3:
                sbh sbhVar = (sbh) this.b;
                qfr qfrVar = (qfr) obj;
                wjm wjmVar = sbhVar.a;
                i4u i4uVar = (i4u) wjmVar.x;
                nr41 nr41Var = (nr41) wjmVar.w;
                sbhVar.d = qfrVar.a;
                jdj jdjVar = sbhVar.c;
                LinkedHashMap linkedHashMap = (LinkedHashMap) jdjVar.w;
                linkedHashMap.clear();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                zv91.b(((me1) jdjVar.c).a(), new a6n(13, jdjVar, linkedHashMap2));
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    linkedHashMap.put((String) entry.getKey(), (y3x) entry.getValue());
                }
                ArrayList<jfr> arrayList2 = sbhVar.d;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (jfr jfrVar : arrayList2) {
                    for (Map.Entry entry2 : jfrVar.d.entrySet()) {
                        linkedHashMap3.put((String) entry2.getKey(), jfrVar.c);
                    }
                }
                sae saeVar = (sae) wjmVar.c;
                nj51 nj51Var = (nj51) wjmVar.b;
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                    Map map = (Map) entry3.getValue();
                    if (nj51Var.a.contains((String) entry3.getKey())) {
                        arrayList3.add(map);
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    for (Map.Entry entry4 : ((Map) it.next()).entrySet()) {
                        String str4 = (String) entry4.getValue();
                        String str5 = (String) entry4.getKey();
                        nj51 nj51Var2 = (nj51) linkedHashMap4.get(str5);
                        if (nj51Var2 == null) {
                            nj51Var2 = new nj51(0);
                        }
                        nj51Var2.a.add(str4);
                        linkedHashMap4.put(str5, nj51Var2);
                    }
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                int i3 = 12;
                zv91.b(linkedHashMap4, new a6n(i3, i4uVar, linkedHashMap5));
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                for (Map.Entry entry5 : linkedHashMap5.entrySet()) {
                    linkedHashMap6.put("known.".concat((String) entry5.getKey()), entry5.getValue());
                }
                nr41Var.q(linkedHashMap6);
                SharedPreferences.Editor edit = ((me1) saeVar.b).b.edit();
                zv91.b(saeVar.x(), new mjf(i, linkedHashMap4, new zgf(20, edit)));
                edit.apply();
                LinkedHashMap x = saeVar.x();
                LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                zv91.b(x, new a6n(i3, i4uVar, linkedHashMap7));
                nr41Var.q(linkedHashMap7);
                nr41Var.q(qfrVar.b);
                ofr.a = sbhVar;
                return zy11.a;
            case 4:
                b bVar = (b) this.b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ArrayList arrayList4 = bVar.e;
                if (booleanValue) {
                    arrayList4.clear();
                } else {
                    ycc.A(arrayList4);
                }
                return zy11.a;
            case 5:
                insetsType$lambda$0 = FlexFramingPopupModalView.insetsType$lambda$0((FlexFramingPopupModalView) this.b, (t1w) obj);
                return insetsType$lambda$0;
            case 6:
                wkr wkrVar = (wkr) this.b;
                if (((DecorViewLifecycle) obj) == DecorViewLifecycle.DETACH) {
                    wkrVar.hideOverlay(false);
                }
                return zy11.a;
            case 7:
                return Long.valueOf(a.t(((e3n) ((gau) this.b).invoke(obj)).a));
            case 8:
                wz40 wz40Var = (wz40) this.b;
                Object[] objArr = wz40Var.a;
                int i4 = wz40Var.c;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((aa10) objArr[i5]).c();
                }
                return zy11.a;
            case 9:
                ru.yandex.taxi.preorder.source.a aVar = (ru.yandex.taxi.preorder.source.a) this.b;
                TaxiMapView taxiMapView = (TaxiMapView) obj;
                aVar.h(taxiMapView.width(), taxiMapView.height());
                taxiMapView.addSizeChangedListener(aVar.A);
                return zy11.a;
            case 10:
                vxr vxrVar = (vxr) this.b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                vxrVar.d.l(bool);
                return zy11.a;
            case 11:
                f.l((mnq0) obj, ((dj70) this.b).g);
                return zy11.a;
            case 12:
                cbs cbsVar = (cbs) this.b;
                was wasVar = (was) obj;
                vas vasVar = wasVar.a;
                Text.Constant constant = vasVar.c;
                Text.Constant constant2 = vasVar.d;
                rbv f = job1.f(vasVar.e, new xvq(21));
                com.ybsdk.core.utils.text.b bVar2 = Text.Companion;
                fl1 fl1Var = wasVar.b;
                PageHeaderEntity pageHeaderEntity = vasVar.b;
                Text.Constant i6 = g8e.i(bVar2, pageHeaderEntity.getTitle());
                ThemedImageUrlEntity image = pageHeaderEntity.getImage();
                rbv f2 = image != null ? job1.f(image, new xvq(22)) : null;
                Text.Constant constant3 = (fl1Var == null || (str2 = fl1Var.b) == null) ? null : new Text.Constant(str2);
                Text.Constant constant4 = (fl1Var == null || (str = fl1Var.c) == null) ? null : new Text.Constant(str);
                if (fl1Var == null || (agreementImageEntity = fl1Var.d) == null || (headerImage = agreementImageEntity.getHeaderImage()) == null || (nbvVar = job1.f(headerImage, new xvq(23))) == null) {
                    nbvVar = new nbv(vxg0.ybsdk_account_placeholder_gray, null);
                }
                eu01 eu01Var = new eu01(i6, wasVar.d, nbvVar, constant3, constant4, new ntz0(0), f2);
                nas nasVar = wasVar.c;
                if (nasVar != null) {
                    ArrayList<fl1> arrayList5 = vasVar.h;
                    ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
                    for (fl1 fl1Var2 : arrayList5) {
                        String str6 = fl1Var2.a;
                        Throwable th2 = th;
                        String str7 = fl1Var2.b;
                        String str8 = fl1Var2.c;
                        AgreementImageEntity agreementImageEntity2 = fl1Var2.d;
                        arrayList6.add(new sl(str6, str7, str8, com.ybsdk.feature.transfer.version2.api.mappers.a.j(agreementImageEntity2 != null ? agreementImageEntity2.getBottomSheetImage() : th2), null, null, null));
                        th = th2;
                    }
                    Throwable th3 = th;
                    ArrayList arrayList7 = new ArrayList();
                    sl slVar = nasVar.a;
                    Iterator it2 = arrayList6.iterator();
                    int i7 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            scc.m();
                            throw th3;
                        }
                        sl slVar2 = (sl) next;
                        sl slVar3 = slVar;
                        boolean l = jl40.l(slVar.a, slVar2.a);
                        Drawable t = vng.t(l ? txg0.ybsdk_ic_selected_payment_method : txg0.ybsdk_ic_unselected_payment_method, cbsVar.a);
                        String str9 = slVar2.a;
                        rbv rbvVar = slVar2.d;
                        cbs cbsVar2 = cbsVar;
                        Text.Constant i9 = g8e.i(Text.Companion, slVar2.b);
                        String str10 = slVar2.c;
                        arrayList7.add(new ddq0(str9, rbvVar, i9, str10 != null ? new Text.Constant(str10) : th3, t, new edq0(slVar2, true), true, l));
                        if (i7 != scc.f(arrayList6)) {
                            arrayList7.add(giy.c);
                        }
                        cbsVar = cbsVar2;
                        i7 = i8;
                        slVar = slVar3;
                    }
                    oasVar = new oas(new pdq0(arrayList7, vasVar.a, null, null, null, 48));
                } else {
                    oasVar = null;
                }
                return new xas(eu01Var, constant, constant2, f, new YbButtonView.a(vasVar.f.getText(), null, null, null, null, null, null, false, wasVar.f, null, 3070), vasVar.g, oasVar);
            case 13:
                ru.yandex.taxi.perf.frame.a aVar2 = (ru.yandex.taxi.perf.frame.a) this.b;
                synchronized (aVar2) {
                    try {
                        Iterator it3 = kotlin.collections.a.N0(aVar2.g.keySet()).iterator();
                        while (it3.hasNext()) {
                            aVar2.b((String) it3.next());
                        }
                        if (aVar2.d.isInitialized()) {
                            ((HandlerThread) aVar2.d.getValue()).quitSafely();
                        }
                    } finally {
                    }
                }
                return zy11.a;
            case 14:
                dx3 dx3Var = (dx3) this.b;
                n70 n70Var = (n70) obj;
                Context context = n70Var.P;
                n70Var.W(new lc0(n70Var, context.getString(dzh0.ybsdk_common_accessibility_selected), context.getString(dzh0.ybsdk_common_accessibility_unselected), dx3Var, 19));
                return zy11.a;
            case 15:
                insetsType$lambda$02 = FullScreenBannerModalView.insetsType$lambda$0((FullScreenBannerModalView) this.b, (t1w) obj);
                return insetsType$lambda$02;
            case 16:
                onAttachedToWindow$lambda$0 = FullScreenBannerPage.onAttachedToWindow$lambda$0((FullScreenBannerPage) this.b, (t1w) obj);
                return Boolean.valueOf(onAttachedToWindow$lambda$0);
            case 17:
                ((isd) obj).X0(false, (dw1) this.b);
                return zy11.a;
            case 18:
                viewBinding$lambda$5$lambda$4 = FundCreationFragment.getViewBinding$lambda$5$lambda$4((FundCreationFragment) this.b, (Editable) obj);
                return viewBinding$lambda$5$lambda$4;
            case 19:
                ((com.ybsdk.feature.savings.internal.screens.fund.creation.a) this.b).r0((zps) obj, null);
                return zy11.a;
            case 20:
                viewBinding$lambda$4$lambda$3 = FundDocsNoticeFragment.getViewBinding$lambda$4$lambda$3((FundDocsNoticeFragment) this.b, ((Boolean) obj).booleanValue());
                return viewBinding$lambda$4$lambda$3;
            case 21:
                ((com.ybsdk.feature.savings.internal.screens.fund.operation.a) this.b).j0((hps) obj, null);
                return zy11.a;
            case 22:
                viewBinding$lambda$2$lambda$0 = FuturePaymentsFragment.getViewBinding$lambda$2$lambda$0((FuturePaymentsFragment) this.b, (Uri) obj);
                return Boolean.valueOf(viewBinding$lambda$2$lambda$0);
            case 23:
                dna dnaVar = (dna) this.b;
                ((FrameLayout) dnaVar.e).setVisibility(8);
                ((CircularProgressIndicator) dnaVar.c).setVisibility(8);
                return zy11.a;
            case 24:
                centerCardListener$lambda$0 = GasStationsOverviewView.centerCardListener$lambda$0((GasStationsOverviewView) this.b, ((Integer) obj).intValue());
                return centerCardListener$lambda$0;
            case 25:
                startAnimations$lambda$6 = GifDrawable.startAnimations$lambda$6((GifDrawable) this.b, (Throwable) obj);
                return startAnimations$lambda$6;
            case 26:
                onCreate$lambda$0 = GmsBankCardRecognitionActivity.onCreate$lambda$0((GmsBankCardRecognitionActivity) this.b, (t1w) obj);
                return Boolean.valueOf(onCreate$lambda$0);
            case 27:
                notifyChangePinListener$lambda$0 = GoPanoramaView.notifyChangePinListener$lambda$0((GoPanoramaView) this.b, (zzs) obj);
                return notifyChangePinListener$lambda$0;
            case 28:
                createGuidelineItemView$lambda$6$lambda$4 = GuidelinesWidgetView.createGuidelineItemView$lambda$6$lambda$4((GuidelinesWidgetView) this.b, (n4u) obj);
                return createGuidelineItemView$lambda$6$lambda$4;
            default:
                f.l((mnq0) obj, ((x91) this.b).e);
                return zy11.a;
        }
    }
}
