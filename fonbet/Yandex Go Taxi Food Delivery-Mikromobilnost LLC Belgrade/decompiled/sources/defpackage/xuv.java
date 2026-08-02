package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.adjust.sdk.AdjustConfig;
import com.yandex.go.address.models.Address;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.xplat.payment.sdk.Acquirer;
import com.yandex.xplat.payment.sdk.MerchantInfo;
import com.yandex.xplat.payment.sdk.PaymethodMarkup;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputFragment;
import com.ybsdk.widgets.common.g;
import flex.engine.a;
import java.util.Locale;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes2.dex */
public final /* synthetic */ class xuv implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ xuv(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        wj00 wj00Var;
        wj00 wj00Var2;
        wj00 wj00Var3;
        wj00 wj00Var4;
        wj00 wj00Var5;
        wj00 wj00Var6;
        MerchantInfo merchantInfo;
        PaymethodMarkup paymethodMarkup;
        wj00 a;
        wj00 a2;
        wj00 wj00Var7;
        g render$lambda$17$lambda$16;
        int i = this.a;
        int i2 = 9;
        int i3 = 10;
        zy11 zy11Var = zy11.a;
        r11 = null;
        Long l = null;
        switch (i) {
            case 0:
                wj00 b = ((y3x) obj).b();
                y3x d = b.d("verification_intent_info");
                if (d == null || (wj00Var = d.a()) == null) {
                    wj00Var = null;
                }
                wj00 b2 = b.l("tokenization_context").b();
                y3x d2 = b.d("integration_profile");
                if (d2 == null || (wj00Var2 = d2.a()) == null) {
                    wj00Var2 = null;
                }
                y3x d3 = b.d("card_info");
                if (d3 == null || (wj00Var3 = d3.a()) == null) {
                    wj00Var3 = null;
                }
                return new yuv(b2, wj00Var2 == null ? null : (q7w) mbb1.d(wj00Var2, new xuv(i3)).d(), wj00Var == null ? null : (g831) mbb1.d(wj00Var, new mr21(18)).d(), wj00Var3 != null ? (s89) mbb1.d(wj00Var3, new jv8(11)).d() : null);
            case 1:
                y3x y3xVar = (y3x) obj;
                wj00 b3 = y3xVar.b();
                String p = b3.p("paysystem");
                String p2 = b3.p(AuthSdkActivity.RESPONSE_TYPE_TOKEN);
                String h = b3.h("license_url");
                String h2 = b3.h("acquirer");
                if (jl40.l(h2, "")) {
                    h2 = null;
                }
                Acquirer acquirer = Acquirer.kassa;
                Acquirer acquirer2 = jl40.l(h2, acquirer.getValue()) ? acquirer : null;
                String h3 = b3.h(WebViewActivity.KEY_ENVIRONMENT);
                if (h3 == null) {
                    h3 = AdjustConfig.ENVIRONMENT_PRODUCTION;
                }
                String str = h3;
                String p3 = b3.p("total");
                String p4 = b3.p("currency");
                y3x d4 = b3.d("merchant");
                if (d4 == null || (wj00Var4 = d4.a()) == null) {
                    wj00Var4 = null;
                }
                y3x d5 = b3.d("paymethod_markup");
                if (d5 == null || (wj00Var5 = d5.a()) == null) {
                    wj00Var5 = null;
                }
                String h4 = b3.h("credit_form_url");
                int i4 = 21;
                x9i0 x9i0Var = (x9i0) mbb1.d(y3xVar, new cbg0(i4)).d();
                y3x d6 = b3.d("tokenization_context");
                wj00 wj00Var8 = (d6 == null || (a2 = d6.a()) == null) ? null : a2;
                Boolean f = b3.f("legal_for_sbp_qr");
                boolean booleanValue = f != null ? f.booleanValue() : false;
                y3x d7 = b3.d("integration_profile");
                if (d7 == null || (wj00Var6 = d7.a()) == null) {
                    wj00Var6 = null;
                }
                if (wj00Var4 == null) {
                    merchantInfo = null;
                } else {
                    MerchantInfo.Companion.getClass();
                    merchantInfo = (MerchantInfo) mbb1.d(wj00Var4, new ws00(i4)).d();
                }
                if (wj00Var5 == null) {
                    paymethodMarkup = null;
                } else {
                    PaymethodMarkup.Companion.getClass();
                    paymethodMarkup = (PaymethodMarkup) mbb1.d(wj00Var5, new dia0(4)).d();
                }
                y3x d8 = b3.d("meta_json");
                return new fvv(x9i0Var.a, p, p2, h, acquirer2, str, p3, p4, merchantInfo, paymethodMarkup, h4, wj00Var8, x9i0Var.b, x9i0Var.c, x9i0Var.d, x9i0Var.e, booleanValue, (d8 == null || (a = d8.a()) == null) ? null : a, x9i0Var.f, wj00Var6 != null ? (q7w) mbb1.d(wj00Var6, new xuv(i3)).d() : null);
            case 2:
                wj00 b4 = ((y3x) obj).b();
                wj00 b5 = b4.l("tokenization_context").b();
                y3x d9 = b4.d("integration_profile");
                if (d9 == null || (wj00Var7 = d9.a()) == null) {
                    wj00Var7 = null;
                }
                return new mvv(b5, wj00Var7 != null ? (q7w) mbb1.d(wj00Var7, new xuv(i3)).d() : null);
            case 3:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 4:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 5:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 6:
                char charValue = ((Character) obj).charValue();
                if (charValue != 'T' && charValue != 't') {
                    r10 = false;
                }
                return Boolean.valueOf(r10);
            case 7:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 8:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 9:
                char charValue2 = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= charValue2 && charValue2 < ':');
            case 10:
                wj00 b6 = ((y3x) obj).b();
                return new q7w(b6.p("diehard_instance_id"), b6.p("diehard_api_url"));
            case 11:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                int u = tje.u(16, listItemComponent.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMargins(u, 0, u, 0);
                listItemComponent.setLayoutParams(marginLayoutParams);
                listItemComponent.setLeadFrameMinimumWidth(tje.u(56, listItemComponent.getContext()));
                listItemComponent.setBackgroundResource(dzg0.bg_transparent_ripple);
                return listItemComponent;
            case 12:
                ListItemComponent listItemComponent2 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                listItemComponent2.setBackgroundResource(dzg0.bg_transparent_ripple);
                return listItemComponent2;
            case 13:
                return ((String) obj).toLowerCase(Locale.ROOT);
            case 14:
                return ((zzs) obj).toString();
            case 15:
                return ((Address) obj).D1();
            case 16:
                ((pfw) obj).a.r(new qu(i2));
                return zy11Var;
            case 17:
                ((tdw) ((odw) ((jew) obj).a.J.get())).a.r(new qu(i2));
                return zy11Var;
            case 18:
                jew jewVar = (jew) obj;
                a.q(jewVar.a.H, jewVar.b, null, true, 2);
                return zy11Var;
            case 19:
                com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g gVar = ((qfw) obj).a.e0;
                (gVar != null ? gVar : null).Tg();
                return zy11Var;
            case 20:
                return ((fnx0) obj).c.b;
            case 21:
                sfw sfwVar = (sfw) obj;
                com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g gVar2 = sfwVar.a.e0;
                (gVar2 != null ? gVar2 : null).Rg(sfwVar.b.o());
                return zy11Var;
            case 22:
                sfw sfwVar2 = (sfw) obj;
                com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g gVar3 = sfwVar2.a.e0;
                (gVar3 != null ? gVar3 : null).Rg(sfwVar2.b.o());
                return zy11Var;
            case 23:
                omw omwVar = (omw) obj;
                omwVar.a.r(new vsq(omwVar.b, 13));
                return zy11Var;
            case 24:
                ListItemComponent listItemComponent3 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                lob1.c(listItemComponent3, 3);
                return listItemComponent3;
            case 25:
                return new uj5((ListItemComponent) obj, 1);
            case 26:
                ull0 T0 = ((oll0) obj).T0("SELECT next_internal_id FROM internal_id");
                try {
                    if (T0.q() && !T0.isNull(0)) {
                        l = Long.valueOf(T0.getLong(0));
                    }
                    return l;
                } finally {
                    T0.close();
                }
            case 27:
                return kp50.i();
            case 28:
                render$lambda$17$lambda$16 = InternetPaymentFormInputFragment.render$lambda$17$lambda$16((g) obj);
                return render$lambda$17$lambda$16;
            default:
                return new pbv((String) obj, (ccv) null, rev.o, (dcv) null, (vfv) null, 58);
        }
    }
}
