package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.gsq0;
import defpackage.hxe;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.q6f;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CreatePaymentResponse;", "", "Companion", "Status", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/e0", "q6f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CreatePaymentResponse {
    public static final q6f Companion = new q6f();
    public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hxe(17))};
    public final String a;
    public final Status b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CreatePaymentResponse$Status;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/f0", "Processing", "Failure", "Success", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Status {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final f0 Companion;
        public static final Status Failure;
        public static final Status Processing;
        public static final Status Success;

        static {
            Status status = new Status("Processing", 0);
            Processing = status;
            Status status2 = new Status("Failure", 1);
            Failure = status2;
            Status status3 = new Status("Success", 2);
            Success = status3;
            Status[] statusArr = {status, status2, status3};
            $VALUES = statusArr;
            $ENTRIES = kotlin.enums.a.a(statusArr);
            Companion = new f0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new hxe(18));
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    public /* synthetic */ CreatePaymentResponse(int i, String str, Status status) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = Status.Success;
        } else {
            this.b = status;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePaymentResponse)) {
            return false;
        }
        CreatePaymentResponse createPaymentResponse = (CreatePaymentResponse) obj;
        return jl40.l(this.a, createPaymentResponse.a) && this.b == createPaymentResponse.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CreatePaymentResponse(paymentId=" + this.a + ", status=" + this.b + Extension.C_BRAKE;
    }

    public CreatePaymentResponse() {
        Status status = Status.Success;
        this.a = "";
        this.b = status;
    }
}
