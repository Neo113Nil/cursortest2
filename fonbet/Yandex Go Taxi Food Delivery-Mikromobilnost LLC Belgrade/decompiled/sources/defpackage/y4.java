package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.yandex.go.address.address_map_picker.domain.g;
import com.yandex.go.agreement.simple.ui.AgreementModalView;
import com.yandex.go.payments.shared.details.f;
import com.yandex.go.pin.repository.o;
import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.route.analytics.e;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.ybsdk.feature.about.internal.presentation.AboutComposeFragment;
import com.ybsdk.feature.about.internal.presentation.AboutFragment;
import com.ybsdk.feature.about.internal.presentation.b;
import defpackage.c5;
import defpackage.d6;
import defpackage.tje;
import defpackage.wpb0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.action_button.c;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.map.overlay.pickup.d;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.sdc.router.a;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.sharedpayments.AccountLinkingInfoFullscreenModalView;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.themes.dto.WebViewThemeChangeMode;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes13.dex */
public final /* synthetic */ class y4 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:311:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        b Content$lambda$1$lambda$0;
        zy11 adapter$lambda$0;
        zy11 _init_$lambda$3;
        WebView webView;
        String str2;
        zy11 updateIcon$lambda$0;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        zy11 newbiesInputListeners$lambda$0;
        String str17;
        zy11 descriptionHtml$lambda$0;
        int i = this.a;
        str = "";
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Content$lambda$1$lambda$0 = AboutComposeFragment.Content$lambda$1$lambda$0((AboutComposeFragment) obj2, (y8f) obj);
                return Content$lambda$1$lambda$0;
            case 1:
                final c5 c5Var = (c5) obj2;
                yfd yfdVar = (yfd) obj;
                final b5 b5Var = new b5(c5Var);
                ((agd) yfdVar).e = new tls() { // from class: com.yandex.go.about.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        c5 c5Var2 = c5.this;
                        tje.N(c5Var2.o(), null, null, new AboutComposeRouter$content$1$1$1(c5Var2, (d6) obj3, b5Var, null), 3);
                        return zy11.a;
                    }
                };
                v1d.a.getClass();
                ((agd) yfdVar).g = v1d.b;
                return zy11Var;
            case 2:
                adapter$lambda$0 = AboutFragment.adapter$lambda$0((AboutFragment) obj2, (m5) obj);
                return adapter$lambda$0;
            case 3:
                n70 n70Var = (n70) obj;
                n70Var.W(new v5(c == true ? 1 : 0, n70Var, (y4) obj2));
                return zy11Var;
            case 4:
                return obj == ((z6) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 5:
                b2b0 b2b0Var = (b2b0) obj2;
                Map.Entry entry = (Map.Entry) obj;
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == b2b0Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != b2b0Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 6:
                a aVar = (a) obj2;
                aVar.getClass();
                CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
                aVar2.b = (String) obj;
                aVar2.e = false;
                ru.yandex.taxi.am.token.a aVar3 = aVar.e;
                aVar2.c = aVar3.c();
                aVar2.b("Authorization", kp50.h(aVar3.c()));
                String Hg = ((h) aVar.f).Hg();
                aVar2.b("X-YaTaxi-UserId", Hg != null ? Hg : "");
                aVar2.g = true;
                UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar2.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                uiWebViewConfig.setHasTitleFromWeb(true);
                aVar.a.a().k(vf41.a(aVar.g, uiWebViewConfig, null, null, null, 254), 2.0f, true);
                return zy11Var;
            case 7:
                com.yandex.go.payments.acceptance.navigation.a aVar4 = (com.yandex.go.payments.acceptance.navigation.a) obj2;
                yfd yfdVar2 = (yfd) obj;
                String str18 = ((ne) ((agd) yfdVar2).a).a;
                agd agdVar = (agd) yfdVar2;
                agdVar.c = new mth(aVar4.G.a(str18), 6);
                agdVar.e = new v5(3, aVar4, str18);
                z1d.a.getClass();
                agdVar.g = z1d.b;
                return zy11Var;
            case 8:
                xw31.E((Button) obj2, null, null, null, Integer.valueOf(((t1w) obj).g));
                return Boolean.FALSE;
            case 9:
                ((f) obj2).P.setImageBitmap((Bitmap) obj);
                return zy11Var;
            case 10:
                _init_$lambda$3 = AccountLinkingInfoFullscreenModalView._init_$lambda$3((PlaceholderView) obj2, (Drawable) obj);
                return _init_$lambda$3;
            case 11:
                hn hnVar = (hn) obj2;
                View view = (View) obj;
                ViewGroup viewGroup = hnVar.a;
                if (viewGroup.getChildCount() == 0) {
                    viewGroup.addView(view);
                    ((qs90) hnVar.e.getValue()).a();
                }
                return zy11Var;
            case 12:
                ((c) obj2).b.a((b151) obj);
                return zy11Var;
            case 13:
                n70 n70Var2 = (n70) obj;
                n70Var2.W(new v5(4, n70Var2, (g10) obj2));
                return zy11Var;
            case 14:
                com.yandex.go.superapp.web.view.a aVar5 = (com.yandex.go.superapp.web.view.a) obj2;
                Context context = (Context) obj;
                if (aVar5 == null || (webView = com.yandex.go.superapp.web.view.a.a(aVar5, WebViewThemeChangeMode.PREFERS_COLOR_SCHEME, null, null, null, 30).getView()) == null) {
                    webView = new WebView(context);
                }
                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                webView.getSettings().setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                return webView;
            case 15:
                ((WebView) obj).loadUrl(((qh0) obj2).a, kotlin.collections.b.f());
                return zy11Var;
            case 16:
                sj0 sj0Var = (sj0) obj2;
                sj0Var.c.invoke((xky0) obj, npb1.c(sj0Var, AndroidCompositionLocals_androidKt.b));
                return zy11Var;
            case 17:
                mnq0 mnq0Var = (mnq0) obj;
                uv0 uv0Var = ((hw0) obj2).f;
                if (uv0Var != null && (str2 = uv0Var.a) != null) {
                    str = str2;
                }
                androidx.compose.ui.semantics.f.l(mnq0Var, str);
                return zy11Var;
            case 18:
                updateIcon$lambda$0 = AddressInputView.updateIcon$lambda$0((AddressInputView) obj2, (Drawable) obj);
                return updateIcon$lambda$0;
            case 19:
                final com.yandex.go.address.address_map_picker.navigation.f fVar = (com.yandex.go.address.address_map_picker.navigation.f) obj2;
                xm00 xm00Var = (xm00) obj;
                com.yandex.go.address.address_map_picker.domain.f fVar2 = fVar.L;
                qqb0 qqb0Var = new qqb0() { // from class: com.yandex.go.address.address_map_picker.navigation.c
                    @Override // defpackage.qqb0
                    public final void a(wpb0 wpb0Var) {
                        f fVar3 = f.this;
                        tje.N(fVar3.o(), null, null, new AddressMapPickerMapLayerRouterImpl$initMapApis$1$4$1$1(fVar3, wpb0Var, null), 3);
                    }
                };
                g gVar = fVar2.a;
                tt ttVar = gVar.a;
                xqb0 xqb0Var = new xqb0();
                lp00 lp00Var = (lp00) ttVar.e;
                d dVar = new d((ah00) ttVar.a, (Context) ttVar.b, (tse) ttVar.c, (lqx) ttVar.d, xm00Var, lp00Var, (erx) ttVar.f, (hmb0) ttVar.g, (hbm) ttVar.h, (ru.yandex.taxi.map_common.map.utils.a) ttVar.i, (ouw) ttVar.j, (ru.yandex.taxi.map.overlay.pickup.intersections.b) ttVar.k, (ru.yandex.taxi.map_common.map.process.b) ttVar.l, new pbl(c2 == true ? 1 : 0, ttVar, xm00Var), new cqb0(xqb0Var, lp00Var), (o) ttVar.n);
                gVar.e = dVar;
                dVar.resume();
                d dVar2 = gVar.e;
                if (dVar2 != null) {
                    dVar2.A.i = qqb0Var;
                }
                ru.yandex.taxi.preorder.source.pickup.a aVar6 = gVar.b;
                ah00 ah00Var = gVar.c;
                aVar6.getClass();
                boolean b = ru.yandex.taxi.preorder.source.pickup.a.b(ah00Var);
                d dVar3 = gVar.e;
                if (b) {
                    if (dVar3 != null) {
                        dVar3.Pg(aVar6.o);
                    }
                } else if (dVar3 != null) {
                    dVar3.Ig();
                }
                return zy11Var;
            case 20:
                c11 c11Var = (c11) obj2;
                yfd yfdVar3 = (yfd) obj;
                ((agd) yfdVar3).f = me4.a;
                a11 a11Var = new a11(c11Var);
                agd agdVar2 = (agd) yfdVar3;
                agdVar2.c = c11Var.H.a();
                agdVar2.e = new com.yandex.go.address.address_map_picker.navigation.b(c3 == true ? 1 : 0, c11Var, a11Var);
                i2d.a.getClass();
                agdVar2.g = i2d.b;
                return zy11Var;
            case 21:
                final gl glVar = (gl) obj2;
                final View view2 = (View) obj;
                boolean z = glVar.a;
                lp00 lp00Var2 = (lp00) glVar.b;
                if (z) {
                    final int c4 = ((avj0) ((zuj0) glVar.x)).c(wtg0.pin_stem);
                    ru.yandex.taxi.map_common.map.intersection.a aVar7 = (ru.yandex.taxi.map_common.map.intersection.a) lp00Var2;
                    aVar7.a(Participant.PIN, new eft0(glVar, 2, view2));
                    aVar7.a(Participant.ONLY_STEM_OF_PIN, new muw() { // from class: v11
                        @Override // defpackage.muw
                        public final ro00 a() {
                            return ((to00) ((so00) gl.this.w)).b(c4, view2);
                        }
                    });
                }
                return zy11Var;
            case 22:
                ((o8k0) obj2).invoke();
                return zy11Var;
            case 23:
                wpb0 wpb0Var = (wpb0) obj;
                String str19 = ((s31) obj2).d.b;
                return Boolean.valueOf(str19 != null ? jl40.l(wpb0Var.p, str19) : true);
            case 24:
                e eVar = (e) obj2;
                com.yandex.go.preorder.source.altpins.b bVar = (com.yandex.go.preorder.source.altpins.b) obj;
                if (bVar instanceof Alternatives.MulticlassOptionDto) {
                    Alternatives.MulticlassOptionDto multiclassOptionDto = (Alternatives.MulticlassOptionDto) bVar;
                    String str20 = multiclassOptionDto.c;
                    if (str20 != null) {
                        return new Pair(multiclassOptionDto.a, str20);
                    }
                    return null;
                }
                if (bVar instanceof Alternatives.AltpinAOptionDto) {
                    Alternatives.AltpinAOptionDto altpinAOptionDto = (Alternatives.AltpinAOptionDto) bVar;
                    Iterator it = altpinAOptionDto.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            str16 = ((ServiceLevel) it.next()).S;
                            if (str16 == null || str16.length() == 0) {
                            }
                        } else {
                            str16 = null;
                        }
                    }
                    if (str16 != null) {
                        return new Pair(altpinAOptionDto.a, str16);
                    }
                    return null;
                }
                if (bVar instanceof Alternatives.AltpinBOptionDto) {
                    Alternatives.AltpinBOptionDto altpinBOptionDto = (Alternatives.AltpinBOptionDto) bVar;
                    Iterator it2 = altpinBOptionDto.b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            str15 = ((ServiceLevel) it2.next()).S;
                            if (str15 == null || str15.length() == 0) {
                            }
                        } else {
                            str15 = null;
                        }
                    }
                    if (str15 != null) {
                        return new Pair(altpinBOptionDto.a, str15);
                    }
                    return null;
                }
                if (bVar instanceof Alternatives.PlusPromoOptionDto) {
                    Alternatives.PlusPromoOptionDto plusPromoOptionDto = (Alternatives.PlusPromoOptionDto) bVar;
                    Iterator it3 = plusPromoOptionDto.b.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            str14 = ((ServiceLevel) it3.next()).S;
                            if (str14 == null || str14.length() == 0) {
                            }
                        } else {
                            str14 = null;
                        }
                    }
                    if (str14 != null) {
                        return new Pair(plusPromoOptionDto.a, str14);
                    }
                    return null;
                }
                if (bVar instanceof Alternatives.RequirementOptionDto) {
                    Alternatives.RequirementOptionDto requirementOptionDto = (Alternatives.RequirementOptionDto) bVar;
                    Iterator it4 = requirementOptionDto.b.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            str13 = ((ServiceLevel) it4.next()).S;
                            if (str13 == null || str13.length() == 0) {
                            }
                        } else {
                            str13 = null;
                        }
                    }
                    if (str13 != null) {
                        return new Pair(requirementOptionDto.a, str13);
                    }
                    return null;
                }
                if (bVar instanceof Alternatives.TariffSelectorOptionDto) {
                    Alternatives.TariffSelectorOptionDto tariffSelectorOptionDto = (Alternatives.TariffSelectorOptionDto) bVar;
                    Iterator it5 = tariffSelectorOptionDto.b.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            str12 = ((ServiceLevel) it5.next()).S;
                            if (str12 == null || str12.length() == 0) {
                            }
                        } else {
                            str12 = null;
                        }
                    }
                    if (str12 != null) {
                        return new Pair(tariffSelectorOptionDto.a, str12);
                    }
                    return null;
                }
                if (bVar instanceof Alternatives.CreateYandexCardOptionDto) {
                    Alternatives.CreateYandexCardOptionDto createYandexCardOptionDto = (Alternatives.CreateYandexCardOptionDto) bVar;
                    Iterator it6 = createYandexCardOptionDto.b.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            str11 = ((ServiceLevel) it6.next()).S;
                            if (str11 == null || str11.length() == 0) {
                            }
                        } else {
                            str11 = null;
                        }
                    }
                    if (str11 != null) {
                        return new Pair(createYandexCardOptionDto.a, str11);
                    }
                    return null;
                }
                if (bVar instanceof Alternatives.MarketplaceOptionDto) {
                    Alternatives.MarketplaceOptionDto marketplaceOptionDto = (Alternatives.MarketplaceOptionDto) bVar;
                    Iterator it7 = marketplaceOptionDto.c.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            str10 = ((ServiceLevel) it7.next()).S;
                            if (str10 == null || str10.length() == 0) {
                            }
                        } else {
                            str10 = null;
                        }
                    }
                    if (str10 != null) {
                        return new Pair(marketplaceOptionDto.a, str10);
                    }
                    return null;
                }
                if (bVar instanceof Alternatives.AltPaymentMethodOptionDto) {
                    Alternatives.AltPaymentMethodOptionDto altPaymentMethodOptionDto = (Alternatives.AltPaymentMethodOptionDto) bVar;
                    Iterator it8 = altPaymentMethodOptionDto.b.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            str9 = ((ServiceLevel) it8.next()).S;
                            if (str9 == null || str9.length() == 0) {
                            }
                        } else {
                            str9 = null;
                        }
                    }
                    if (str9 != null) {
                        return new Pair(altPaymentMethodOptionDto.a, str9);
                    }
                    return null;
                }
                if (bVar instanceof Alternatives.DeeplinkOptionDto) {
                    Alternatives.DeeplinkOptionDto deeplinkOptionDto = (Alternatives.DeeplinkOptionDto) bVar;
                    Iterator it9 = deeplinkOptionDto.b.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            str8 = ((ServiceLevel) it9.next()).S;
                            if (str8 == null || str8.length() == 0) {
                            }
                        } else {
                            str8 = null;
                        }
                    }
                    if (str8 != null) {
                        return new Pair(deeplinkOptionDto.a, str8);
                    }
                    return null;
                }
                if (bVar instanceof Alternatives.ComboOptionDto) {
                    Alternatives.ComboOptionDto comboOptionDto = (Alternatives.ComboOptionDto) bVar;
                    Iterator it10 = comboOptionDto.b.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            str7 = ((ServiceLevel) it10.next()).S;
                            if (str7 == null || str7.length() == 0) {
                            }
                        } else {
                            str7 = null;
                        }
                    }
                    if (str7 != null) {
                        return new Pair(comboOptionDto.a, str7);
                    }
                    return null;
                }
                if (bVar instanceof Alternatives.MultimodalOptionDto) {
                    Alternatives.MultimodalOptionDto multimodalOptionDto = (Alternatives.MultimodalOptionDto) bVar;
                    Iterator it11 = multimodalOptionDto.b.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            str6 = ((ServiceLevel) it11.next()).S;
                            if (str6 == null || str6.length() == 0) {
                            }
                        } else {
                            str6 = null;
                        }
                    }
                    if (str6 != null) {
                        return new Pair(multimodalOptionDto.a, str6);
                    }
                    return null;
                }
                if (bVar instanceof Alternatives.PlusSubscriptionOptionDto) {
                    Alternatives.PlusSubscriptionOptionDto plusSubscriptionOptionDto = (Alternatives.PlusSubscriptionOptionDto) bVar;
                    Iterator it12 = plusSubscriptionOptionDto.c.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            str5 = ((ServiceLevel) it12.next()).S;
                            if (str5 == null || str5.length() == 0) {
                            }
                        } else {
                            str5 = null;
                        }
                    }
                    if (str5 != null) {
                        return new Pair(plusSubscriptionOptionDto.a, str5);
                    }
                    return null;
                }
                if (bVar instanceof Alternatives.PlusDummySubscriptionOptionDto) {
                    Alternatives.PlusDummySubscriptionOptionDto plusDummySubscriptionOptionDto = (Alternatives.PlusDummySubscriptionOptionDto) bVar;
                    Iterator it13 = plusDummySubscriptionOptionDto.c.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            str4 = ((ServiceLevel) it13.next()).S;
                            if (str4 == null || str4.length() == 0) {
                            }
                        } else {
                            str4 = null;
                        }
                    }
                    if (str4 != null) {
                        return new Pair(plusDummySubscriptionOptionDto.a, str4);
                    }
                    return null;
                }
                if (!(bVar instanceof Alternatives.CommonOptionLegacyDto)) {
                    w511.b();
                    return null;
                }
                Alternatives.CommonOptionLegacyDto commonOptionLegacyDto = (Alternatives.CommonOptionLegacyDto) bVar;
                Alternatives.OptionTypeLegacy optionTypeLegacy = commonOptionLegacyDto.a;
                switch (u41.a[optionTypeLegacy.ordinal()]) {
                    case 1:
                        str3 = null;
                        if (str3 == null) {
                            return new Pair(((xnt) eVar.a).e(optionTypeLegacy, Alternatives.OptionTypeLegacy.Companion.serializer()), str3);
                        }
                        return null;
                    case 2:
                        str3 = commonOptionLegacyDto.i;
                        if (str3 == null) {
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        Iterator it14 = commonOptionLegacyDto.b.iterator();
                        while (it14.hasNext()) {
                            str3 = ((ServiceLevel) it14.next()).S;
                            if (str3 != null && str3.length() != 0) {
                                if (str3 == null) {
                                }
                            }
                        }
                        str3 = null;
                        if (str3 == null) {
                        }
                        break;
                    default:
                        w511.b();
                        return null;
                }
            case 25:
                newbiesInputListeners$lambda$0 = AddressSearchView.setNewbiesInputListeners$lambda$0((AddressSearchView) obj2, (String) obj);
                return newbiesInputListeners$lambda$0;
            case 26:
                x61 x61Var = (x61) obj2;
                mnq0 mnq0Var2 = (mnq0) obj;
                boolean z2 = x61Var.e;
                String str21 = x61Var.c;
                CharSequence charSequence = x61Var.d;
                if (z2) {
                    str17 = ((Object) charSequence) + Extension.FIX_SPACE + (str21 != null ? str21 : "");
                } else {
                    str17 = (str21 != null ? str21 : "") + Extension.FIX_SPACE + ((Object) charSequence);
                }
                androidx.compose.ui.semantics.f.l(mnq0Var2, str17);
                return zy11Var;
            case 27:
                SourceDestinationComponent sourceDestinationComponent = new SourceDestinationComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                sourceDestinationComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                sourceDestinationComponent.setSourceDestinationListener((hc31) obj2);
                return sourceDestinationComponent;
            case 28:
                descriptionHtml$lambda$0 = AgreementModalView.setDescriptionHtml$lambda$0((AgreementModalView) obj2, (String) obj);
                return descriptionHtml$lambda$0;
            default:
                Iterator it15 = (Iterator) obj2;
                return it15.hasNext() ? (CharSequence) it15.next() : ((w610) obj).a.group();
        }
    }
}
