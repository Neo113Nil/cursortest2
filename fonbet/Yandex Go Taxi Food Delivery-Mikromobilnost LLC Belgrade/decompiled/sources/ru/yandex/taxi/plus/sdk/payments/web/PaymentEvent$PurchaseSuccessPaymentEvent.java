package ru.yandex.taxi.plus.sdk.payments.web;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nk90;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.wz90;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/plus/sdk/payments/web/PaymentEvent$PurchaseSuccessPaymentEvent", "Lru/yandex/taxi/plus/sdk/payments/web/o;", "Companion", "Scenario", "ru/yandex/taxi/plus/sdk/payments/web/i", "wz90", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PaymentEvent$PurchaseSuccessPaymentEvent extends o {
    public static final wz90 Companion = new wz90();
    public static final i3y[] f = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(18)), null, null, null, null};
    public final Scenario a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/plus/sdk/payments/web/PaymentEvent$PurchaseSuccessPaymentEvent$Scenario;", "", "Companion", "ru/yandex/taxi/plus/sdk/payments/web/j", "BUNDLE", "PURCHASE", "SUBSCRIPTION", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Scenario {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Scenario[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Scenario BUNDLE;
        public static final j Companion;
        public static final Scenario PURCHASE;
        public static final Scenario SUBSCRIPTION;
        public static final Scenario UNKNOWN;

        static {
            Scenario scenario = new Scenario("BUNDLE", 0);
            BUNDLE = scenario;
            Scenario scenario2 = new Scenario("PURCHASE", 1);
            PURCHASE = scenario2;
            Scenario scenario3 = new Scenario("SUBSCRIPTION", 2);
            SUBSCRIPTION = scenario3;
            Scenario scenario4 = new Scenario("UNKNOWN", 3);
            UNKNOWN = scenario4;
            Scenario[] scenarioArr = {scenario, scenario2, scenario3, scenario4};
            $VALUES = scenarioArr;
            $ENTRIES = kotlin.enums.a.a(scenarioArr);
            Companion = new j();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(19));
        }

        public static Scenario valueOf(String str) {
            return (Scenario) Enum.valueOf(Scenario.class, str);
        }

        public static Scenario[] values() {
            return (Scenario[]) $VALUES.clone();
        }
    }

    public PaymentEvent$PurchaseSuccessPaymentEvent(int i, Scenario scenario, String str, boolean z, boolean z2, String str2) {
        this.a = (i & 1) == 0 ? Scenario.UNKNOWN : scenario;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = true;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentEvent$PurchaseSuccessPaymentEvent)) {
            return false;
        }
        PaymentEvent$PurchaseSuccessPaymentEvent paymentEvent$PurchaseSuccessPaymentEvent = (PaymentEvent$PurchaseSuccessPaymentEvent) obj;
        return this.a == paymentEvent$PurchaseSuccessPaymentEvent.a && jl40.l(this.b, paymentEvent$PurchaseSuccessPaymentEvent.b) && this.c == paymentEvent$PurchaseSuccessPaymentEvent.c && this.d == paymentEvent$PurchaseSuccessPaymentEvent.d && jl40.l(this.e, paymentEvent$PurchaseSuccessPaymentEvent.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = unr0.e(unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchaseSuccessPaymentEvent(scenario=");
        sb.append(this.a);
        sb.append(", monetizationModel=");
        sb.append(this.b);
        sb.append(", userStateSynchronized=");
        nnm.v(", isTrial=", ", subscriptionType=", sb, this.c, this.d);
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public PaymentEvent$PurchaseSuccessPaymentEvent() {
        this.a = Scenario.UNKNOWN;
        this.b = null;
        this.c = true;
        this.d = false;
        this.e = null;
    }
}
