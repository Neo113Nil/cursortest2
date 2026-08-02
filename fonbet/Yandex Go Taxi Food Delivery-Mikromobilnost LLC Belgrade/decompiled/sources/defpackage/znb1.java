package defpackage;

import android.text.PrecomputedText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.payment.sdk.core.data.BrowserCard;
import com.yandex.payment.sdk.core.data.Payer;
import com.yandex.payment.sdk.core.data.PaymentMethodsFilter;
import com.yandex.xplat.payment.sdk.BankName;
import com.yandex.xplat.payment.sdk.CardPaymentSystem;
import com.yandex.xplat.payment.sdk.PaymentMethod;
import com.yandex.xplat.payment.sdk.PaymentMethodType;
import com.yandex.xplat.payment.sdk.YBCardType;
import jason.statham.interpreter.error.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class znb1 {
    public static PrecomputedText.Params a(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getTextMetricsParams();
    }

    public static Object b(Object obj, Object obj2) {
        if ((obj instanceof List) && (obj2 instanceof Long)) {
            int longValue = (int) ((Number) obj2).longValue();
            if (-1 < longValue) {
                List list = (List) obj;
                if (longValue < list.size()) {
                    return list.get(longValue);
                }
            }
            StringBuilder t = b64.t(longValue, "Index ", " out of bounds (list size ");
            t.append(((List) obj).size());
            t.append(')');
            throw a.a(t.toString());
        }
        if ((obj instanceof Map) && (obj2 instanceof String)) {
            Object obj3 = ((Map) obj).get(obj2);
            return obj3 == null ? seu.E : obj3;
        }
        throw a.i("Keyed access to " + obj + " by key " + obj2 + " is not defined");
    }

    public static void c(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void d(Object obj, Object obj2, Object obj3) {
        if ((obj instanceof List) && (obj2 instanceof Long)) {
            ym11.b(obj).set((int) ((Number) obj2).longValue(), obj3);
            return;
        }
        if (ym11.h(obj) && (obj2 instanceof String)) {
            ym11.c(obj).put(obj2, obj3);
            return;
        }
        throw a.i("Keyed access to " + obj + " by key " + obj2 + " is not defined");
    }

    public static final rp8 e(CardPaymentSystem cardPaymentSystem) {
        ArrayList arrayList = rp8.f;
        return q501.r(cardPaymentSystem, false);
    }

    public static final PaymentMethod f(BrowserCard browserCard) {
        String i = oyr.i(browserCard.getNumber().hashCode(), "browser-");
        String j = b64.j(cvu0.u(browserCard.getNumber().length() - 4, "*"), browserCard.getNumber().substring(browserCard.getNumber().length() - 4));
        gl8 gl8Var = gl8.a;
        String number = browserCard.getNumber();
        gl8Var.getClass();
        CardPaymentSystem a = gl8.a(number);
        if (a != CardPaymentSystem.UNKNOWN) {
            return new PaymentMethod(i, scc.i(i), j, a.getValue(), true, BankName.UnknownBank, null, null, null, PaymentMethodType.Card, null, null, null, null, null, null);
        }
        return null;
    }

    public static final String g(com.yandex.payment.sdk.core.data.CardPaymentSystem cardPaymentSystem) {
        switch (i430.a[cardPaymentSystem.ordinal()]) {
            case 11:
                return CardPaymentSystem.VISA.getValue();
            case 12:
                return CardPaymentSystem.VISA_ELECTRON.getValue();
            case 13:
                return CardPaymentSystem.UNKNOWN.getValue();
            default:
                return cardPaymentSystem.name();
        }
    }

    public static final rbh h(Payer payer) {
        String oauthToken = payer.getOauthToken();
        payer.getUid();
        return new rbh(oauthToken, payer.getEmail(), 6);
    }

    public static final laa0 i(PaymentMethodsFilter paymentMethodsFilter) {
        YBCardType yBCardType;
        boolean isStoredCardAvailable = paymentMethodsFilter.isStoredCardAvailable();
        boolean isGooglePayAvailable = paymentMethodsFilter.isGooglePayAvailable();
        boolean isSBPAvailable = paymentMethodsFilter.isSBPAvailable();
        boolean isNewSbpTokenAvailable = paymentMethodsFilter.isNewSbpTokenAvailable();
        boolean isSbpTokenAvailable = paymentMethodsFilter.isSbpTokenAvailable();
        boolean isYBAccountAvailable = paymentMethodsFilter.isYBAccountAvailable();
        Set<com.yandex.payment.sdk.core.data.YBCardType> availableYaCardTypes = paymentMethodsFilter.getAvailableYaCardTypes();
        ArrayList arrayList = new ArrayList(tcc.n(availableYaCardTypes, 10));
        Iterator<T> it = availableYaCardTypes.iterator();
        while (it.hasNext()) {
            int i = i430.b[((com.yandex.payment.sdk.core.data.YBCardType) it.next()).ordinal()];
            if (i == 1) {
                yBCardType = YBCardType.YB_PRO_CARD;
            } else if (i == 2) {
                yBCardType = YBCardType.YB_CREDIT_LIMIT_CARD;
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                yBCardType = YBCardType.YB_PLUS_CARD;
            }
            arrayList.add(yBCardType);
        }
        return new laa0(isStoredCardAvailable, false, isGooglePayAvailable, isSBPAvailable, isNewSbpTokenAvailable, isSbpTokenAvailable, isYBAccountAvailable, new ArrayList(arrayList));
    }

    public static final CardPaymentSystem j(com.yandex.payment.sdk.core.data.CardPaymentSystem cardPaymentSystem) {
        switch (i430.a[cardPaymentSystem.ordinal()]) {
            case 1:
                return CardPaymentSystem.AmericanExpress;
            case 2:
                return CardPaymentSystem.DinersClub;
            case 3:
                return CardPaymentSystem.DiscoverCard;
            case 4:
                return CardPaymentSystem.JCB;
            case 5:
                return CardPaymentSystem.HUMO;
            case 6:
                return CardPaymentSystem.Maestro;
            case 7:
                return CardPaymentSystem.MasterCard;
            case 8:
                return CardPaymentSystem.MIR;
            case 9:
                return CardPaymentSystem.UnionPay;
            case 10:
                return CardPaymentSystem.Uzcard;
            case 11:
                return CardPaymentSystem.VISA;
            case 12:
                return CardPaymentSystem.VISA_ELECTRON;
            case 13:
                return CardPaymentSystem.UNKNOWN;
            default:
                w511.b();
                return null;
        }
    }
}
