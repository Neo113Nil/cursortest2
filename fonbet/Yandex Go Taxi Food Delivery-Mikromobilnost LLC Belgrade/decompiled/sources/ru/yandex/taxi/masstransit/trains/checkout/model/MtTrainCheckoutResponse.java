package ru.yandex.taxi.masstransit.trains.checkout.model;

import defpackage.e540;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.rb40;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/trains/checkout/model/MtTrainCheckoutResponse;", "", "Companion", "ResponseStatus", "ru/yandex/taxi/masstransit/trains/checkout/model/a", "rb40", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MtTrainCheckoutResponse {
    public static final rb40 Companion = new rb40();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new e540(10)), null};
    public final ResponseStatus a;
    public final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/masstransit/trains/checkout/model/MtTrainCheckoutResponse$ResponseStatus;", "", "Companion", "ru/yandex/taxi/masstransit/trains/checkout/model/b", "PROCESSING", "SUCCESS", "FAILURE", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ResponseStatus {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ResponseStatus[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final ResponseStatus FAILURE;
        public static final ResponseStatus PROCESSING;
        public static final ResponseStatus SUCCESS;
        public static final ResponseStatus UNKNOWN;

        static {
            ResponseStatus responseStatus = new ResponseStatus("PROCESSING", 0);
            PROCESSING = responseStatus;
            ResponseStatus responseStatus2 = new ResponseStatus("SUCCESS", 1);
            SUCCESS = responseStatus2;
            ResponseStatus responseStatus3 = new ResponseStatus("FAILURE", 2);
            FAILURE = responseStatus3;
            ResponseStatus responseStatus4 = new ResponseStatus("UNKNOWN", 3);
            UNKNOWN = responseStatus4;
            ResponseStatus[] responseStatusArr = {responseStatus, responseStatus2, responseStatus3, responseStatus4};
            $VALUES = responseStatusArr;
            $ENTRIES = kotlin.enums.a.a(responseStatusArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new e540(11));
        }

        public static ResponseStatus valueOf(String str) {
            return (ResponseStatus) Enum.valueOf(ResponseStatus.class, str);
        }

        public static ResponseStatus[] values() {
            return (ResponseStatus[]) $VALUES.clone();
        }
    }

    public /* synthetic */ MtTrainCheckoutResponse(int i, ResponseStatus responseStatus, String str) {
        this.a = (i & 1) == 0 ? ResponseStatus.UNKNOWN : responseStatus;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtTrainCheckoutResponse)) {
            return false;
        }
        MtTrainCheckoutResponse mtTrainCheckoutResponse = (MtTrainCheckoutResponse) obj;
        return this.a == mtTrainCheckoutResponse.a && jl40.l(this.b, mtTrainCheckoutResponse.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MtTrainCheckoutResponse(status=" + this.a + ", successUrl=" + this.b + Extension.C_BRAKE;
    }

    public MtTrainCheckoutResponse() {
        this.a = ResponseStatus.UNKNOWN;
        this.b = null;
    }
}
