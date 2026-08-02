package defpackage;

import android.content.Context;
import com.yandex.payment.sdk.core.data.AppInfo;
import com.yandex.payment.sdk.core.data.ConsoleLoggingMode;
import com.yandex.payment.sdk.core.data.GooglePayAllowedCardNetworks;
import com.yandex.payment.sdk.core.data.GooglePayData;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.MetricaInitMode;
import com.yandex.payment.sdk.core.data.OrderInfo;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentMethodsFilter;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.core.data.PaymentToken;
import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.common.c;
import com.yandex.xplat.payment.sdk.AvailableMethods;
import com.yandex.xplat.payment.sdk.BindCardApiVersionForAnalytics;
import com.yandex.xplat.payment.sdk.BindingServiceError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;
import com.yandex.xplat.payment.sdk.InstanceTypeForAnalytics;
import com.yandex.xplat.payment.sdk.NetworkServiceRetryingStrategy;
import com.yandex.xplat.payment.sdk.NewCard;
import com.yandex.xplat.payment.sdk.NspkMembersSource;
import com.yandex.xplat.payment.sdk.PartnerInfo;
import com.yandex.xplat.payment.sdk.PaymentDetails;
import com.yandex.xplat.payment.sdk.PaymentMethodType;
import com.yandex.xplat.payment.sdk.PaymentOptionNameForAnalytics;
import com.yandex.xplat.payment.sdk.ShowSbpTokensFlag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class yv90 implements vv90, asw {
    public final Context a;
    public final Payer b;
    public final String c;
    public final MetricaInitMode d;
    public final y22 e;
    public final rwo f;
    public final ex5 g;
    public final jwf h;
    public boj0 i;
    public final nu5 j;
    public final tut k;
    public final boolean l;

    public yv90(Context context, Payer payer, Merchant merchant, ox90 ox90Var, tw4 tw4Var, boolean z, String str, String str2, int i, GooglePayData googlePayData, boolean z2, boolean z3, String str3, String str4, boolean z4, AppInfo appInfo, List list, PaymentMethodsFilter paymentMethodsFilter, PaymentSdkEnvironment paymentSdkEnvironment, ConsoleLoggingMode consoleLoggingMode, String str5, GooglePayAllowedCardNetworks googlePayAllowedCardNetworks, MetricaInitMode metricaInitMode, y22 y22Var, y22 y22Var2, rwo rwoVar, vv50 vv50Var, String str6, String str7, Boolean bool, od51 od51Var, ex5 ex5Var) {
        km0 km0Var;
        km0 km0Var2 = y22Var.b;
        this.a = context;
        this.b = payer;
        this.c = str5;
        this.d = metricaInitMode;
        this.e = y22Var;
        this.f = rwoVar;
        this.g = ex5Var;
        ShowSbpTokensFlag showSbpTokensFlag = paymentMethodsFilter.isSbpTokenAvailable() ? ShowSbpTokensFlag.enabled : ShowSbpTokensFlag.disabled;
        showSbpTokensFlag.getClass();
        jwf jwfVar = new jwf(new ox4(), new bv5(), new hvt(), context, payer, merchant, ox90Var, tw4Var, showSbpTokensFlag, Boolean.valueOf(z), str4, Boolean.valueOf(z4), str2, str, Integer.valueOf(i), googlePayData, Boolean.valueOf(z2), Boolean.valueOf(z3), str3, appInfo, list, paymentMethodsFilter, googlePayAllowedCardNetworks, paymentSdkEnvironment, consoleLoggingMode, rwoVar, y22Var, vv50Var, od51Var, str6, str7, bool, ex5Var);
        this.h = jwfVar;
        this.j = (nu5) ((xvf0) jwfVar.M).get();
        this.k = (tut) ((xvf0) jwfVar.P).get();
        if (metricaInitMode == MetricaInitMode.CORE) {
            String uid = payer.getUid();
            if (uid != null) {
                km0Var = km0Var2;
                km0Var.b("uid", uid);
            } else {
                km0Var = km0Var2;
            }
            km0Var.b("service_token", merchant.getServiceToken());
            String uuid = UUID.randomUUID().toString();
            InstanceTypeForAnalytics instanceTypeForAnalytics = InstanceTypeForAnalytics.CORE;
            km0Var.b("api_instance_id", uuid);
            km0Var.b("api_instance_type", instanceTypeForAnalytics.getValue());
        }
        this.l = apa1.e(FeatureFlag.RESTORE_PAYMENT_API_FORBIDDEN);
    }

    public final void a(NewCard newCard) {
        int i;
        tls tlsVar;
        md51 j;
        Payer payer = this.b;
        String uid = payer.getUid();
        if (uid == null) {
            uid = "";
        }
        String a = this.g.a(this.a, uid);
        int i2 = 0;
        if (a != null) {
            qv90.a.getClass();
            wj00 wj00Var = new wj00(0);
            wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Отправка публичного ключа при привязке карты");
            wj00Var.k("device_pubkey", a);
            ((y22) this.f).a(y891.c("biometry_send_public_key_on_bind", wj00Var));
        }
        String firstName = payer.getFirstName();
        nu5 nu5Var = this.j;
        bx5 bx5Var = nu5Var.a.a;
        ox90 ox90Var = nu5Var.c;
        ryj0 ryj0Var = nu5Var.d;
        if (ryj0Var == null) {
            return;
        }
        nu5Var.d = null;
        int i3 = 26;
        int i4 = 5;
        if (apa1.e(FeatureFlag.BINDING_PSP_FLAG)) {
            ymu ymuVar = new ymu(i3, ox90Var, ryj0Var);
            String expirationMonth = newCard.getExpirationMonth();
            String o = g8e.o("20", newCard.getExpirationYear());
            String v = cvu0.v(newCard.getCardNumber(), " ", "", false);
            String cvn = newCard.getCvn();
            mnz0 mnz0Var = new mnz0(v, expirationMonth, o, firstName, cvn);
            sr4 sr4Var = new sr4(9, ymuVar);
            ArrayList arrayList = rp8.f;
            String cardPaymentSystem = q501.s(v).a.toString();
            boolean f = thb1.f(cvn);
            rwo rwoVar = bx5Var.l;
            qv90.a.getClass();
            String str = "Инициализация привязки новой карты " + cardPaymentSystem + " через Vera";
            if (f) {
                str = str.concat(", с пустым CVV");
            }
            wj00 wj00Var2 = new wj00(0);
            wj00Var2.i("empty_svv", f);
            wj00Var2.k("system", cardPaymentSystem);
            wj00Var2.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, str);
            iho c = y891.c("bind_new_card_psp", wj00Var2);
            md51 g = bx5Var.f.a.f(new wuv(bx5Var.h, bx5Var.i), new ps20(i2), NetworkServiceRetryingStrategy.retryOnce).g(new ax5(bx5Var, mnz0Var, this.c, f, cardPaymentSystem, a, sr4Var));
            ((y22) rwoVar).b(c, g);
            g.h(new pw5(ymuVar, 4)).c(new pw5(ymuVar, 5));
            return;
        }
        ymu ymuVar2 = new ymu(i3, ox90Var, ryj0Var);
        hh5 hh5Var = new hh5(i4, ymuVar2);
        y22 y22Var = (y22) bx5Var.l;
        y22Var.a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "deprecated Старый ивент при передачи карточных данных на привязку", "card_bound"));
        String d = sfb1.d(newCard.getCardNumber());
        ArrayList arrayList2 = rp8.f;
        String cardPaymentSystem2 = q501.s(newCard.getCardNumber()).a.toString();
        boolean f2 = thb1.f(newCard.getCvn());
        BindCardApiVersionForAnalytics bindCardApiVersionForAnalytics = BindCardApiVersionForAnalytics.v2;
        StringBuilder v2 = b64.v("Процесс добавления новой карты ", cardPaymentSystem2, " ", d, " через Trust ");
        v2.append(bindCardApiVersionForAnalytics);
        String sb = v2.toString();
        if (f2) {
            sb = sb.concat(", с пустым CVV");
        }
        sv90 sv90Var = qv90.a;
        wj00 wj00Var3 = new wj00(0);
        wj00Var3.k("value", d);
        wj00Var3.k("bind_version", bindCardApiVersionForAnalytics.getValue());
        wj00Var3.i("empty_svv", f2);
        wj00Var3.k("system", cardPaymentSystem2);
        wj00Var3.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, sb);
        iho c2 = y891.c("bind_new_card", wj00Var3);
        if (bx5Var.a.b == null) {
            j = zmx.c(new BindingServiceError(ExternalErrorKind.authorization, ExternalErrorTrigger.internal_sdk, null, null, "Unable to bind a new card: OAuth token is empty."));
        } else {
            wj00 wj00Var4 = new wj00(0);
            wj00Var4.k("cvn", newCard.getCvn());
            wj00Var4.k("card_number", newCard.getCardNumber());
            wj00Var4.k("expiration_year", newCard.getExpirationYear());
            wj00Var4.k("expiration_month", newCard.getExpirationMonth());
            tyj0 b = bx5Var.c.b(wj00Var4);
            if (!b.b()) {
                i = 5;
                tlsVar = null;
                md51 j2 = ymx.j(zmx.b(new sp5(28, (String) b.a(), bx5Var.d)), new kv5(7, bx5Var), null, 5);
                w04 w04Var = new w04(14, bx5Var, hh5Var);
                ymx ymxVar = (ymx) j2;
                ymxVar.getClass();
                j = ymx.j(ymxVar, w04Var, null, 5);
                y22Var.b(c2, j);
                ymx.l((ymx) j, new pw5(ymuVar2, i2), tlsVar, i).c(new pw5(ymuVar2, 1));
            }
            YSError ySError = b.b;
            c.b(ySError);
            j = zmx.c(ySError);
        }
        i = 5;
        tlsVar = null;
        y22Var.b(c2, j);
        ymx.l((ymx) j, new pw5(ymuVar2, i2), tlsVar, i).c(new pw5(ymuVar2, 1));
    }

    public final void b(ryj0 ryj0Var) {
        up4 up4Var = (up4) ((xvf0) this.h.Q).get();
        up4Var.getClass();
        up4Var.b.o(NspkMembersSource.qr).a(new sp4(ryj0Var, 0), new sp4(ryj0Var, 1));
    }

    public final String c() {
        wga0 h;
        fvv fvvVar;
        boj0 boj0Var = this.i;
        String str = null;
        if (boj0Var != null && (h = boj0Var.h()) != null && (fvvVar = h.b.a.l) != null) {
            str = fvvVar.h;
        }
        return str == null ? "" : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r6 = r6.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        wga0 h;
        boolean z;
        boj0 boj0Var = this.i;
        Boolean bool = null;
        PaymentDetails paymentDetails = null;
        bool = null;
        if (boj0Var != null && h != null) {
            try {
                PaymentDetails paymentDetails2 = h.l;
                if (paymentDetails2 != null) {
                    paymentDetails = paymentDetails2;
                }
                z = paymentDetails.getSettings().getLegalForSbpQr();
            } catch (Exception e) {
                rwo rwoVar = h.j;
                sv90 sv90Var = qv90.a;
                String valueOf = String.valueOf(e.getMessage());
                sv90Var.getClass();
                String concat = "Ошибка при получении поля legalForSbpQr: ".concat(valueOf);
                wj00 i = vfc.i(0, "field_name", "legalForSbpQr", "request", valueOf);
                i.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, concat);
                ((y22) rwoVar).a(y891.c("error_get_field", i));
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        return n891.o(bool);
    }

    public final boolean e() {
        wga0 h;
        boj0 boj0Var = this.i;
        if (boj0Var == null || (h = boj0Var.h()) == null) {
            return false;
        }
        return h.g.p;
    }

    public final void f(NewCard newCard) {
        wga0 h;
        boj0 boj0Var = this.i;
        if (boj0Var == null || (h = boj0Var.h()) == null || !(h.m instanceof PaymentMethod.NewCard)) {
            return;
        }
        aia0 aia0Var = h.b;
        NewCard newCard2 = new NewCard(cvu0.v(newCard.getCardNumber(), " ", "", false), newCard.getExpirationMonth(), newCard.getExpirationYear(), newCard.getCvn(), newCard.getShouldBeStored(), null, 32, null);
        String b = h.b();
        ox90 ox90Var = h.c;
        h.d(aia0Var.g.g(new at5(aia0Var, newCard2, b, new nw70(11, ox90Var), new oy80(h, ox90Var, false, 7), h.c(PaymentOptionNameForAnalytics.NEW_CARD))));
    }

    public final qyj0 g() {
        w9i0 w9i0Var = (w9i0) ((xvf0) this.h.f).get();
        nl60 nl60Var = new nl60(w9i0Var.b, 1);
        rwo rwoVar = w9i0Var.c;
        iho f = vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Получение методов оплаты, разрешенных для данной корзины", "get_raw_payment_methods");
        md51 g = w9i0Var.a.a.f(nl60Var, new rv10(24), NetworkServiceRetryingStrategy.retryOnce).h(new cbg0(20)).g(new odf0(11, w9i0Var));
        ((y22) rwoVar).b(f, g);
        qyj0 d = n891.d(g, 0L);
        if (d instanceof hyj0) {
            return new hyj0(((hyj0) d).a);
        }
        if (d instanceof kyj0) {
            return new kyj0(wme.c((AvailableMethods) ((kyj0) d).a));
        }
        w511.b();
        return null;
    }

    public final void h(String str) {
        wga0 h;
        boj0 boj0Var = this.i;
        if (boj0Var == null || (h = boj0Var.h()) == null) {
            return;
        }
        PaymentMethod paymentMethod = h.m;
        if (paymentMethod instanceof PaymentMethod.Card) {
            h.a((PaymentMethod.Card) paymentMethod, str);
            return;
        }
        if (paymentMethod instanceof PaymentMethod.YBMethod) {
            PaymentMethod.YBMethod yBMethod = (PaymentMethod.YBMethod) paymentMethod;
            aia0 aia0Var = h.b;
            String c = a8a0.c(yBMethod);
            String b = h.b();
            ox90 ox90Var = h.c;
            h.d(aia0Var.g.g(new lf10(aia0Var, c, str, b, yBMethod.getPayload(), new nw70(11, ox90Var), new oy80(h, ox90Var, false, 7), h.c(PaymentOptionNameForAnalytics.YB), 2)));
        }
    }

    public final void i(PaymentToken paymentToken, OrderInfo orderInfo, ryj0 ryj0Var) {
        final int i = 0;
        if (this.i != null) {
            ((y22) this.f).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Переиспользование данных о платеже", "reuse_get_payment_result"));
            if (vvb1.I && !this.l) {
                vvb1.I = false;
                return;
            }
            this.i = null;
        }
        jwf jwfVar = (jwf) this.h.k;
        Boolean bool = Boolean.FALSE;
        ak80 ak80Var = new ak80(11, this);
        ku90 ku90Var = new ku90();
        boj0 boj0Var = new boj0();
        boj0Var.b = n3w.a(paymentToken);
        n3w b = n3w.b(orderInfo);
        boj0Var.c = b;
        boj0Var.w = i5m.b(new lu90(ku90Var, (n3w) jwfVar.g, (n3w) jwfVar.t, (n3w) boj0Var.b, b, (xvf0) jwfVar.I, (xvf0) jwfVar.c, (xvf0) jwfVar.O, (xvf0) jwfVar.G, (n3w) jwfVar.o, (n3w) jwfVar.A, (xvf0) jwfVar.J, (xvf0) jwfVar.b));
        n3w a = n3w.a(bool);
        boj0Var.x = a;
        boj0Var.y = i5m.b(new o08(ku90Var, (xvf0) boj0Var.w, (xvf0) jwfVar.N, (xvf0) jwfVar.e, (n3w) jwfVar.E, (n3w) jwfVar.C, a, (n3w) jwfVar.o));
        boj0Var.z = i5m.b(new lu90((n3w) jwfVar.a, (xvf0) boj0Var.y, (n3w) jwfVar.B, (n3w) jwfVar.g, (n3w) boj0Var.c, (xvf0) jwfVar.N, (xvf0) boj0Var.w, (n3w) jwfVar.v, (n3w) boj0Var.x, n3w.a(ak80Var), (n3w) jwfVar.o, (n3w) jwfVar.F));
        if (this.d == MetricaInitMode.CORE) {
            this.e.b.b("payment_token", paymentToken.getToken());
        }
        wga0 h = boj0Var.h();
        p370 p370Var = new p370(21, this, boj0Var, ryj0Var);
        final aia0 aia0Var = h.b;
        final int i2 = 2;
        final int i3 = 1;
        md51 l = ymx.l(zmx.a(scc.i(aia0Var.g.h(new tls() { // from class: zha0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i4 = i2;
                boolean z = false;
                aia0 aia0Var2 = aia0Var;
                switch (i4) {
                    case 0:
                        return aia0Var2.d.a((AvailableMethods) obj);
                    case 1:
                        AvailableMethods availableMethods = (AvailableMethods) obj;
                        rwo rwoVar = aia0Var2.c;
                        qv90.a.getClass();
                        List<com.yandex.xplat.payment.sdk.PaymentMethod> paymentMethods = availableMethods.getPaymentMethods();
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = paymentMethods.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new ktu0(((com.yandex.xplat.payment.sdk.PaymentMethod) it.next()).getSystem()));
                        }
                        List<com.yandex.xplat.payment.sdk.PaymentMethod> paymentMethods2 = availableMethods.getPaymentMethods();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : paymentMethods2) {
                            if (((com.yandex.xplat.payment.sdk.PaymentMethod) obj2).getType() == PaymentMethodType.SbpToken) {
                                arrayList2.add(obj2);
                            }
                        }
                        int size = arrayList2.size();
                        List<com.yandex.xplat.payment.sdk.PaymentMethod> paymentMethods3 = availableMethods.getPaymentMethods();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : paymentMethods3) {
                            PartnerInfo partnerInfo = ((com.yandex.xplat.payment.sdk.PaymentMethod) obj3).getPartnerInfo();
                            if (partnerInfo != null ? partnerInfo.getIsYBCard() : false) {
                                arrayList3.add(obj3);
                            }
                        }
                        int size2 = arrayList3.size();
                        int size3 = availableMethods.getPaymentMethods().size();
                        List<com.yandex.xplat.payment.sdk.PaymentMethod> paymentMethods4 = availableMethods.getPaymentMethods();
                        ArrayList arrayList4 = new ArrayList();
                        Iterator<T> it2 = paymentMethods4.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((com.yandex.xplat.payment.sdk.PaymentMethod) it2.next()).getSystem());
                        }
                        String p = g8e.p(g8e.p(g8e.p(g8e.p(g8e.p(qv10.h(size2, qv10.h(size, g8e.p(oyr.i(size3, "Доступные методы оплаты: количество привязанных карт - "), "; платежные системы - ", a.X(arrayList4, Extension.FIX_SPACE, null, null, null, 62)), "; количество сохраненных СБП токенов - "), "; количество сохраненных счетов yb - "), "; оплата через ApplePay ", availableMethods.getIsApplePayAvailable() ? "доступна" : "не доступна"), "; оплата через GooglePay ", availableMethods.getIsGooglePayAvailable() ? "доступна" : "не доступна"), "; оплата через Систему Быстрых Платежей ", availableMethods.getIsSpbQrAvailable() ? "доступна" : "не доступна"), "; оплата через Систему Быстрых Платежей с возможностью привязки СБП токена ", availableMethods.getIsNewSbpTokenAvailable() ? "доступна" : "не доступна"), "; оплата наличными ", availableMethods.getIsCashAvailable() ? "доступна" : "не доступна");
                        sv90 sv90Var = qv90.a;
                        wj00 wj00Var = new wj00(0);
                        wj00Var.j(size3, "stored_cards_count");
                        wj00Var.b.put("stored_cards_systems", new n53(arrayList));
                        wj00Var.j(size, "stored_sbp_tokens_count");
                        wj00Var.j(size2, "stored_yb_count");
                        wj00Var.i("apple_pay_available", availableMethods.getIsApplePayAvailable());
                        wj00Var.i("google_pay_available", availableMethods.getIsGooglePayAvailable());
                        wj00Var.i("spb_qr_available", availableMethods.getIsSpbQrAvailable());
                        wj00Var.i("new_sbp_token_available", availableMethods.getIsNewSbpTokenAvailable());
                        wj00Var.i("cash_available", availableMethods.getIsCashAvailable());
                        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p);
                        ((y22) rwoVar).a(y891.c("resolved_available_methods", wj00Var));
                        return availableMethods;
                    default:
                        fvv fvvVar = (fvv) obj;
                        ArrayList arrayList5 = fvvVar.d;
                        if (fvvVar.c) {
                            aia0Var2.getClass();
                        }
                        if (fvvVar.b && aia0Var2.b != null) {
                            z = true;
                        }
                        return new AvailableMethods(arrayList5, false, z, xga1.f(fvvVar, "sbp_qr"), xga1.f(fvvVar, "sbp_token"), false);
                }
            }
        }).g(new tls() { // from class: zha0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i4 = i;
                boolean z = false;
                aia0 aia0Var2 = aia0Var;
                switch (i4) {
                    case 0:
                        return aia0Var2.d.a((AvailableMethods) obj);
                    case 1:
                        AvailableMethods availableMethods = (AvailableMethods) obj;
                        rwo rwoVar = aia0Var2.c;
                        qv90.a.getClass();
                        List<com.yandex.xplat.payment.sdk.PaymentMethod> paymentMethods = availableMethods.getPaymentMethods();
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = paymentMethods.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new ktu0(((com.yandex.xplat.payment.sdk.PaymentMethod) it.next()).getSystem()));
                        }
                        List<com.yandex.xplat.payment.sdk.PaymentMethod> paymentMethods2 = availableMethods.getPaymentMethods();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : paymentMethods2) {
                            if (((com.yandex.xplat.payment.sdk.PaymentMethod) obj2).getType() == PaymentMethodType.SbpToken) {
                                arrayList2.add(obj2);
                            }
                        }
                        int size = arrayList2.size();
                        List<com.yandex.xplat.payment.sdk.PaymentMethod> paymentMethods3 = availableMethods.getPaymentMethods();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : paymentMethods3) {
                            PartnerInfo partnerInfo = ((com.yandex.xplat.payment.sdk.PaymentMethod) obj3).getPartnerInfo();
                            if (partnerInfo != null ? partnerInfo.getIsYBCard() : false) {
                                arrayList3.add(obj3);
                            }
                        }
                        int size2 = arrayList3.size();
                        int size3 = availableMethods.getPaymentMethods().size();
                        List<com.yandex.xplat.payment.sdk.PaymentMethod> paymentMethods4 = availableMethods.getPaymentMethods();
                        ArrayList arrayList4 = new ArrayList();
                        Iterator<T> it2 = paymentMethods4.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((com.yandex.xplat.payment.sdk.PaymentMethod) it2.next()).getSystem());
                        }
                        String p = g8e.p(g8e.p(g8e.p(g8e.p(g8e.p(qv10.h(size2, qv10.h(size, g8e.p(oyr.i(size3, "Доступные методы оплаты: количество привязанных карт - "), "; платежные системы - ", a.X(arrayList4, Extension.FIX_SPACE, null, null, null, 62)), "; количество сохраненных СБП токенов - "), "; количество сохраненных счетов yb - "), "; оплата через ApplePay ", availableMethods.getIsApplePayAvailable() ? "доступна" : "не доступна"), "; оплата через GooglePay ", availableMethods.getIsGooglePayAvailable() ? "доступна" : "не доступна"), "; оплата через Систему Быстрых Платежей ", availableMethods.getIsSpbQrAvailable() ? "доступна" : "не доступна"), "; оплата через Систему Быстрых Платежей с возможностью привязки СБП токена ", availableMethods.getIsNewSbpTokenAvailable() ? "доступна" : "не доступна"), "; оплата наличными ", availableMethods.getIsCashAvailable() ? "доступна" : "не доступна");
                        sv90 sv90Var = qv90.a;
                        wj00 wj00Var = new wj00(0);
                        wj00Var.j(size3, "stored_cards_count");
                        wj00Var.b.put("stored_cards_systems", new n53(arrayList));
                        wj00Var.j(size, "stored_sbp_tokens_count");
                        wj00Var.j(size2, "stored_yb_count");
                        wj00Var.i("apple_pay_available", availableMethods.getIsApplePayAvailable());
                        wj00Var.i("google_pay_available", availableMethods.getIsGooglePayAvailable());
                        wj00Var.i("spb_qr_available", availableMethods.getIsSpbQrAvailable());
                        wj00Var.i("new_sbp_token_available", availableMethods.getIsNewSbpTokenAvailable());
                        wj00Var.i("cash_available", availableMethods.getIsCashAvailable());
                        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p);
                        ((y22) rwoVar).a(y891.c("resolved_available_methods", wj00Var));
                        return availableMethods;
                    default:
                        fvv fvvVar = (fvv) obj;
                        ArrayList arrayList5 = fvvVar.d;
                        if (fvvVar.c) {
                            aia0Var2.getClass();
                        }
                        if (fvvVar.b && aia0Var2.b != null) {
                            z = true;
                        }
                        return new AvailableMethods(arrayList5, false, z, xga1.f(fvvVar, "sbp_qr"), xga1.f(fvvVar, "sbp_token"), false);
                }
            }
        }).h(new tls() { // from class: zha0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i4 = i3;
                boolean z = false;
                aia0 aia0Var2 = aia0Var;
                switch (i4) {
                    case 0:
                        return aia0Var2.d.a((AvailableMethods) obj);
                    case 1:
                        AvailableMethods availableMethods = (AvailableMethods) obj;
                        rwo rwoVar = aia0Var2.c;
                        qv90.a.getClass();
                        List<com.yandex.xplat.payment.sdk.PaymentMethod> paymentMethods = availableMethods.getPaymentMethods();
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = paymentMethods.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new ktu0(((com.yandex.xplat.payment.sdk.PaymentMethod) it.next()).getSystem()));
                        }
                        List<com.yandex.xplat.payment.sdk.PaymentMethod> paymentMethods2 = availableMethods.getPaymentMethods();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : paymentMethods2) {
                            if (((com.yandex.xplat.payment.sdk.PaymentMethod) obj2).getType() == PaymentMethodType.SbpToken) {
                                arrayList2.add(obj2);
                            }
                        }
                        int size = arrayList2.size();
                        List<com.yandex.xplat.payment.sdk.PaymentMethod> paymentMethods3 = availableMethods.getPaymentMethods();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : paymentMethods3) {
                            PartnerInfo partnerInfo = ((com.yandex.xplat.payment.sdk.PaymentMethod) obj3).getPartnerInfo();
                            if (partnerInfo != null ? partnerInfo.getIsYBCard() : false) {
                                arrayList3.add(obj3);
                            }
                        }
                        int size2 = arrayList3.size();
                        int size3 = availableMethods.getPaymentMethods().size();
                        List<com.yandex.xplat.payment.sdk.PaymentMethod> paymentMethods4 = availableMethods.getPaymentMethods();
                        ArrayList arrayList4 = new ArrayList();
                        Iterator<T> it2 = paymentMethods4.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((com.yandex.xplat.payment.sdk.PaymentMethod) it2.next()).getSystem());
                        }
                        String p = g8e.p(g8e.p(g8e.p(g8e.p(g8e.p(qv10.h(size2, qv10.h(size, g8e.p(oyr.i(size3, "Доступные методы оплаты: количество привязанных карт - "), "; платежные системы - ", a.X(arrayList4, Extension.FIX_SPACE, null, null, null, 62)), "; количество сохраненных СБП токенов - "), "; количество сохраненных счетов yb - "), "; оплата через ApplePay ", availableMethods.getIsApplePayAvailable() ? "доступна" : "не доступна"), "; оплата через GooglePay ", availableMethods.getIsGooglePayAvailable() ? "доступна" : "не доступна"), "; оплата через Систему Быстрых Платежей ", availableMethods.getIsSpbQrAvailable() ? "доступна" : "не доступна"), "; оплата через Систему Быстрых Платежей с возможностью привязки СБП токена ", availableMethods.getIsNewSbpTokenAvailable() ? "доступна" : "не доступна"), "; оплата наличными ", availableMethods.getIsCashAvailable() ? "доступна" : "не доступна");
                        sv90 sv90Var = qv90.a;
                        wj00 wj00Var = new wj00(0);
                        wj00Var.j(size3, "stored_cards_count");
                        wj00Var.b.put("stored_cards_systems", new n53(arrayList));
                        wj00Var.j(size, "stored_sbp_tokens_count");
                        wj00Var.j(size2, "stored_yb_count");
                        wj00Var.i("apple_pay_available", availableMethods.getIsApplePayAvailable());
                        wj00Var.i("google_pay_available", availableMethods.getIsGooglePayAvailable());
                        wj00Var.i("spb_qr_available", availableMethods.getIsSpbQrAvailable());
                        wj00Var.i("new_sbp_token_available", availableMethods.getIsNewSbpTokenAvailable());
                        wj00Var.i("cash_available", availableMethods.getIsCashAvailable());
                        wj00Var.k(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, p);
                        ((y22) rwoVar).a(y891.c("resolved_available_methods", wj00Var));
                        return availableMethods;
                    default:
                        fvv fvvVar = (fvv) obj;
                        ArrayList arrayList5 = fvvVar.d;
                        if (fvvVar.c) {
                            aia0Var2.getClass();
                        }
                        if (fvvVar.b && aia0Var2.b != null) {
                            z = true;
                        }
                        return new AvailableMethods(arrayList5, false, z, xga1.f(fvvVar, "sbp_qr"), xga1.f(fvvVar, "sbp_token"), false);
                }
            }
        }).h(new bd90(25)), aia0Var.g.h(new bd90(28)).h(new bd90(26)))), new bd90(27), null, 5);
        ww90 ww90Var = new ww90(i2, h, p370Var);
        ymx ymxVar = (ymx) l;
        ymxVar.getClass();
        ymx.l(ymxVar, ww90Var, null, 5).c(new u290(22, p370Var));
    }

    public final void j(String str, String str2, boolean z) {
        wga0 h;
        boj0 boj0Var = this.i;
        if (boj0Var == null || (h = boj0Var.h()) == null) {
            return;
        }
        aia0 aia0Var = h.b;
        String email = h.d.getEmail();
        bt5 bt5Var = aia0Var.a;
        bt5Var.a(email).g(new cc2(z, str, str2, bt5Var, 1));
    }
}
