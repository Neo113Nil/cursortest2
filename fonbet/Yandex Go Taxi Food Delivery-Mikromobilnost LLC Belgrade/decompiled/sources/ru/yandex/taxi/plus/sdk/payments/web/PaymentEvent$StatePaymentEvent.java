package ru.yandex.taxi.plus.sdk.payments.web;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.nk90;
import defpackage.xz90;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/plus/sdk/payments/web/PaymentEvent$StatePaymentEvent", "Lru/yandex/taxi/plus/sdk/payments/web/o;", "Companion", "Status", "ru/yandex/taxi/plus/sdk/payments/web/k", "xz90", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PaymentEvent$StatePaymentEvent extends o {
    public static final xz90 Companion = new xz90();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(20))};
    public final Status a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/plus/sdk/payments/web/PaymentEvent$StatePaymentEvent$Status;", "", "Companion", "ru/yandex/taxi/plus/sdk/payments/web/l", "CLOSE", "LOADED", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final Status CLOSE;
        public static final l Companion;
        public static final Status LOADED;
        public static final Status UNKNOWN;

        static {
            Status status = new Status("CLOSE", 0);
            CLOSE = status;
            Status status2 = new Status("LOADED", 1);
            LOADED = status2;
            Status status3 = new Status("UNKNOWN", 2);
            UNKNOWN = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = kotlin.enums.a.a(statusArr);
            Companion = new l();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(21));
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public PaymentEvent$StatePaymentEvent(int i, Status status) {
        if ((i & 1) == 0) {
            this.a = Status.UNKNOWN;
        } else {
            this.a = status;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaymentEvent$StatePaymentEvent) && this.a == ((PaymentEvent$StatePaymentEvent) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StatePaymentEvent(status=" + this.a + Extension.C_BRAKE;
    }

    public PaymentEvent$StatePaymentEvent() {
        this.a = Status.UNKNOWN;
    }
}
