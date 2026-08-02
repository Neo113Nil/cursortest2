package app.cash.local.viewmodels;

import app.cash.local.primitives.PaymentMethodToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalCheckoutPaymentMethodViewModel {
    public final Icon icon;
    public final String subtitle;
    public final String title;
    public final String token;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Icon {
        public static final /* synthetic */ Icon[] $VALUES;
        public static final Icon AMERICAN_EXPRESS;
        public static final Icon CASH_APP;
        public static final Icon DISCOVER;
        public static final Icon DISCOVER_DINERS;
        public static final Icon GOOGLE_PAY;
        public static final Icon MASTERCARD;
        public static final Icon NEW_CARD;
        public static final Icon VISA;

        static {
            Icon icon = new Icon("CASH_APP", 0);
            CASH_APP = icon;
            Icon icon2 = new Icon("GOOGLE_PAY", 1);
            GOOGLE_PAY = icon2;
            Icon icon3 = new Icon("VISA", 2);
            VISA = icon3;
            Icon icon4 = new Icon("MASTERCARD", 3);
            MASTERCARD = icon4;
            Icon icon5 = new Icon("AMERICAN_EXPRESS", 4);
            AMERICAN_EXPRESS = icon5;
            Icon icon6 = new Icon("DISCOVER", 5);
            DISCOVER = icon6;
            Icon icon7 = new Icon("DISCOVER_DINERS", 6);
            DISCOVER_DINERS = icon7;
            Icon icon8 = new Icon("NEW_CARD", 7);
            NEW_CARD = icon8;
            $VALUES = new Icon[]{icon, icon2, icon3, icon4, icon5, icon6, icon7, icon8};
        }

        public static Icon valueOf(String str) {
            return (Icon) Enum.valueOf(Icon.class, str);
        }

        public static Icon[] values() {
            return (Icon[]) $VALUES.clone();
        }
    }

    public LocalCheckoutPaymentMethodViewModel(String str, Icon icon, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.token = str;
        this.icon = icon;
        this.title = str2;
        this.subtitle = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalCheckoutPaymentMethodViewModel)) {
            return false;
        }
        LocalCheckoutPaymentMethodViewModel localCheckoutPaymentMethodViewModel = (LocalCheckoutPaymentMethodViewModel) obj;
        return Intrinsics.areEqual(this.token, localCheckoutPaymentMethodViewModel.token) && this.icon == localCheckoutPaymentMethodViewModel.icon && Intrinsics.areEqual(this.title, localCheckoutPaymentMethodViewModel.title) && Intrinsics.areEqual(this.subtitle, localCheckoutPaymentMethodViewModel.subtitle);
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode() * 31;
        Icon icon = this.icon;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.title);
        String str = this.subtitle;
        return m + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String m1282toStringimpl = PaymentMethodToken.m1282toStringimpl(this.token);
        StringBuilder sb = new StringBuilder("LocalCheckoutPaymentMethodViewModel(token=");
        sb.append(m1282toStringimpl);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", title=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.title, ", subtitle=", this.subtitle, ")");
    }
}
