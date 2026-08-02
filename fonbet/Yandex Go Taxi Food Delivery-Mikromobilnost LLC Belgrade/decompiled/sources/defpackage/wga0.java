package defpackage;

import android.content.Context;
import android.net.Uri;
import com.yandex.payment.sdk.core.data.BrowserCard;
import com.yandex.payment.sdk.core.data.CardId;
import com.yandex.payment.sdk.core.data.MerchantInfo;
import com.yandex.payment.sdk.core.data.OrderDetails;
import com.yandex.payment.sdk.core.data.OrderInfo;
import com.yandex.payment.sdk.core.data.PayMethodMarkup;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.core.data.PaymentSettings;
import com.yandex.payment.sdk.core.data.a;
import com.yandex.xplat.payment.sdk.Acquirer;
import com.yandex.xplat.payment.sdk.BankName;
import com.yandex.xplat.payment.sdk.MerchantAddress;
import com.yandex.xplat.payment.sdk.NewCard;
import com.yandex.xplat.payment.sdk.PaymentDetails;
import com.yandex.xplat.payment.sdk.PaymentOptionNameForAnalytics;
import com.yandex.xplat.payment.sdk.PaymethodMarkup;
import com.yandex.xplat.payment.sdk.SbpPollingStrategy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class wga0 implements uv90, zrw {
    public final Context a;
    public final aia0 b;
    public final ox90 c;
    public final Payer d;
    public final OrderInfo e;
    public final xvt f;
    public final bt5 g;
    public final List h;
    public final sls i;
    public final rwo j;
    public final ex5 k;
    public PaymentDetails l;
    public PaymentMethod m;
    public ryj0 n;
    public String o;
    public ljh p;

    public wga0(Context context, aia0 aia0Var, ox90 ox90Var, Payer payer, OrderInfo orderInfo, xvt xvtVar, bt5 bt5Var, List list, sls slsVar, rwo rwoVar, ex5 ex5Var) {
        this.a = context;
        this.b = aia0Var;
        this.c = ox90Var;
        this.d = payer;
        this.e = orderInfo;
        this.f = xvtVar;
        this.g = bt5Var;
        this.h = list;
        this.i = slsVar;
        this.j = rwoVar;
        this.k = ex5Var;
    }

    public final void a(PaymentMethod.Card card, String str) {
        Object obj;
        String c = a8a0.c(card);
        boolean z = false;
        boolean x = cvu0.x(card.getId().getValue(), "browser-", false);
        int i = 7;
        int i2 = 11;
        aia0 aia0Var = this.b;
        ox90 ox90Var = this.c;
        if (!x) {
            d(aia0Var.g.g(new lf10(aia0Var, c, str, b(), card.getPayload(), new nw70(i2, ox90Var), new oy80(this, ox90Var, z, i), c(PaymentOptionNameForAnalytics.EXISTING_CARD), 2)));
            return;
        }
        Iterator it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            com.yandex.xplat.payment.sdk.PaymentMethod f = znb1.f((BrowserCard) next);
            if (jl40.l(f != null ? f.getIdentifier() : null, c)) {
                obj = next;
                break;
            }
        }
        BrowserCard browserCard = (BrowserCard) obj;
        if (browserCard != null) {
            d(aia0Var.g.g(new at5(aia0Var, new NewCard(browserCard.getNumber(), browserCard.getExpirationMonth(), browserCard.getExpirationYear(), str, false, BankName.UnknownBank), b(), new nw70(i2, ox90Var), new oy80(this, ox90Var, z, i), c(PaymentOptionNameForAnalytics.NEW_CARD))));
            return;
        }
        PaymentKitError.Companion.getClass();
        PaymentKitError d = a.d("Failed to pay. Couldn't find appropriate browser card");
        ryj0 ryj0Var = this.n;
        if (ryj0Var != null) {
            ryj0Var.i(d);
        }
    }

    public final String b() {
        String str = this.o;
        return str == null ? this.d.getEmail() : str;
    }

    public final String c(PaymentOptionNameForAnalytics paymentOptionNameForAnalytics) {
        String uid = this.d.getUid();
        if (uid == null) {
            uid = "";
        }
        String a = this.k.a(this.a, uid);
        if (a != null) {
            qv90.a.getClass();
            ((y22) this.j).a(sv90.d(a, paymentOptionNameForAnalytics));
        }
        return a;
    }

    public final void d(md51 md51Var) {
        md51Var.h(new sga0(this, 3)).c(new sga0(this, 4));
    }

    public final ArrayList e() {
        PaymentDetails paymentDetails = this.l;
        if (paymentDetails == null) {
            paymentDetails = null;
        }
        return wme.c(paymentDetails.getMethods());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(PaymentMethod paymentMethod, String str, ryj0 ryj0Var) {
        String total;
        OrderDetails strict;
        this.m = paymentMethod;
        this.n = ryj0Var;
        this.o = str;
        boolean z = paymentMethod instanceof PaymentMethod.Card;
        boolean z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        ox90 ox90Var = this.c;
        if (z) {
            PaymentDetails paymentDetails = this.l;
            PaymentMethod.Card card = (PaymentMethod.Card) paymentMethod;
            com.yandex.xplat.payment.sdk.PaymentMethod b = zf91.b((paymentDetails != null ? paymentDetails : null).getMethods(), card.getId().toString());
            if (b != null) {
                if (b.getVerifyCvv()) {
                    ox90Var.f();
                    return;
                } else {
                    a(card, "");
                    return;
                }
            }
            if (cvu0.x(card.getId().getValue(), "browser-", false)) {
                ox90Var.f();
                return;
            }
            a aVar = PaymentKitError.Companion;
            String str2 = "Failed to pay. Couldn't find card with id " + card.getId().getValue() + Extension.DOT_CHAR;
            aVar.getClass();
            ryj0Var.i(a.d(str2));
            return;
        }
        boolean z3 = paymentMethod instanceof PaymentMethod.YBMethod;
        int i = 7;
        aia0 aia0Var = this.b;
        if (z3) {
            PaymentMethod.YBMethod yBMethod = (PaymentMethod.YBMethod) paymentMethod;
            d(aia0Var.g.g(new lf10(aia0Var, yBMethod.getId(), "", b(), yBMethod.getPayload(), new nw70(11, ox90Var), new oy80(this, ox90Var, z2, i), c(PaymentOptionNameForAnalytics.YB), 2)));
            return;
        }
        if (paymentMethod.equals(PaymentMethod.GooglePay.INSTANCE)) {
            PaymentDetails paymentDetails2 = this.l;
            if (paymentDetails2 == null) {
                paymentDetails2 = null;
            }
            if (!paymentDetails2.getMethods().getIsGooglePayAvailable()) {
                PaymentKitError.Companion.getClass();
                ryj0Var.i(a.b(a.c()));
                return;
            }
            OrderInfo orderInfo = this.e;
            if (orderInfo == null || (strict = orderInfo.getOrderDetails()) == null) {
                PaymentDetails paymentDetails3 = this.l;
                if (paymentDetails3 == null) {
                    paymentDetails3 = null;
                }
                String currency = paymentDetails3.getSettings().getCurrency();
                PaymentDetails paymentDetails4 = this.l;
                if (paymentDetails4 == null) {
                    paymentDetails4 = null;
                }
                PaymethodMarkup payMethodMarkup = paymentDetails4.getSettings().getPayMethodMarkup();
                if (payMethodMarkup == null || (total = payMethodMarkup.getCard()) == null) {
                    PaymentDetails paymentDetails5 = this.l;
                    if (paymentDetails5 == null) {
                        paymentDetails5 = null;
                    }
                    total = paymentDetails5.getSettings().getTotal();
                }
                strict = new OrderDetails.Strict(currency, new BigDecimal(total), null, null, 12, null);
            }
            d(ymx.j(this.f.a(strict), new sga0(this, objArr3 == true ? 1 : 0), null, 5));
            return;
        }
        if (paymentMethod.equals(PaymentMethod.NewCard.INSTANCE)) {
            ox90Var.g();
            return;
        }
        if (paymentMethod.equals(PaymentMethod.Sbp.INSTANCE)) {
            ljh ljhVar = this.p;
            if (ljhVar != null) {
                d(aia0Var.g.g(new at5(aia0Var, SbpPollingStrategy.resolveOnSuccess, b(), new yj70(ljhVar), new oy80(this, ox90Var, objArr2 == true ? 1 : 0, i), c(PaymentOptionNameForAnalytics.SBP))));
                return;
            } else {
                PaymentKitError.Companion.getClass();
                ryj0Var.i(a.d("Failed to pay. Sbp called without actual sbp handler set"));
                return;
            }
        }
        if (paymentMethod.equals(PaymentMethod.NewSbpToken.INSTANCE)) {
            ljh ljhVar2 = this.p;
            if (ljhVar2 != null) {
                d(aia0Var.g.g(new u50((Object) aia0Var, b(), (Object) new aq80(ljhVar2), (Object) new oy80(this, ox90Var, objArr == true ? 1 : 0, i), (Object) c(PaymentOptionNameForAnalytics.NEW_SBP_TOKEN), 17)));
                return;
            } else {
                PaymentKitError.Companion.getClass();
                ryj0Var.i(a.d("Failed to pay. Sbp called without actual sbp handler set"));
                return;
            }
        }
        a aVar2 = PaymentKitError.Companion;
        String str3 = "Failed to pay. Couldn't handle payment method " + paymentMethod.getClass().getSimpleName() + Extension.DOT_CHAR;
        aVar2.getClass();
        PaymentKitError d = a.d(str3);
        ryj0 ryj0Var2 = this.n;
        if (ryj0Var2 != null) {
            ryj0Var2.i(d);
        }
    }

    public final PaymentSettings g() {
        MerchantInfo merchantInfo;
        PaymentDetails paymentDetails = this.l;
        if (paymentDetails == null) {
            paymentDetails = null;
        }
        com.yandex.xplat.payment.sdk.PaymentSettings settings = paymentDetails.getSettings();
        Acquirer acquirer = settings.getAcquirer();
        com.yandex.payment.sdk.core.data.Acquirer acquirer2 = (acquirer == null ? -1 : vme.h[acquirer.ordinal()]) == 1 ? com.yandex.payment.sdk.core.data.Acquirer.kassa : null;
        com.yandex.xplat.payment.sdk.MerchantInfo merchantInfo2 = settings.getMerchantInfo();
        if (merchantInfo2 != null) {
            MerchantAddress merchantAddress = merchantInfo2.getMerchantAddress();
            merchantInfo = new MerchantInfo(merchantInfo2.getName(), merchantInfo2.getScheduleText(), merchantInfo2.getOgrn(), merchantAddress != null ? new com.yandex.payment.sdk.core.data.MerchantAddress(merchantAddress.getCountry(), merchantAddress.getCity(), merchantAddress.getStreet(), merchantAddress.getHome(), merchantAddress.getZip()) : null);
        } else {
            merchantInfo = null;
        }
        PaymethodMarkup payMethodMarkup = settings.getPayMethodMarkup();
        return new PaymentSettings(settings.getTotal(), settings.getCurrency(), Uri.parse(settings.getLicenseURL()), acquirer2, settings.getEnvironment(), merchantInfo, new PayMethodMarkup(payMethodMarkup != null ? payMethodMarkup.getCard() : null), settings.getCreditFormUrl(), settings.getPayload());
    }

    public final boolean h(CardId cardId) {
        PaymentDetails paymentDetails = this.l;
        if (paymentDetails == null) {
            paymentDetails = null;
        }
        com.yandex.xplat.payment.sdk.PaymentMethod b = zf91.b(paymentDetails.getMethods(), cardId.toString());
        if (b != null) {
            return b.getVerifyCvv();
        }
        return false;
    }
}
