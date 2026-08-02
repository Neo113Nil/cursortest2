package ru.yandex.taxi.plus.sdk.payments.web;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nk90;
import defpackage.oo31;
import defpackage.unr0;
import defpackage.vz90;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/plus/sdk/payments/web/PaymentEvent$OpenUrlPaymentEvent", "Lru/yandex/taxi/plus/sdk/payments/web/o;", "Companion", "UriInfo", "ru/yandex/taxi/plus/sdk/payments/web/e", "vz90", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PaymentEvent$OpenUrlPaymentEvent extends o {
    public static final vz90 Companion = new vz90();
    public final UriInfo a;
    public final UriInfo b;

    public PaymentEvent$OpenUrlPaymentEvent(int i, UriInfo uriInfo, UriInfo uriInfo2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = uriInfo;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = uriInfo2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentEvent$OpenUrlPaymentEvent)) {
            return false;
        }
        PaymentEvent$OpenUrlPaymentEvent paymentEvent$OpenUrlPaymentEvent = (PaymentEvent$OpenUrlPaymentEvent) obj;
        return jl40.l(this.a, paymentEvent$OpenUrlPaymentEvent.a) && jl40.l(this.b, paymentEvent$OpenUrlPaymentEvent.b);
    }

    public final int hashCode() {
        UriInfo uriInfo = this.a;
        int hashCode = (uriInfo == null ? 0 : uriInfo.hashCode()) * 31;
        UriInfo uriInfo2 = this.b;
        return hashCode + (uriInfo2 != null ? uriInfo2.hashCode() : 0);
    }

    public final String toString() {
        return "OpenUrlPaymentEvent(uriInfo=" + this.a + ", fallbackUriInfo=" + this.b + Extension.C_BRAKE;
    }

    public PaymentEvent$OpenUrlPaymentEvent() {
        this.a = null;
        this.b = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/plus/sdk/payments/web/PaymentEvent$OpenUrlPaymentEvent$UriInfo;", "", "Companion", "Type", "ru/yandex/taxi/plus/sdk/payments/web/f", "ru/yandex/taxi/plus/sdk/payments/web/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class UriInfo {
        public static final g Companion = new g();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(16))};
        public final String a;
        public final boolean b;
        public final Type c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/plus/sdk/payments/web/PaymentEvent$OpenUrlPaymentEvent$UriInfo$Type;", "", "Companion", "ru/yandex/taxi/plus/sdk/payments/web/h", "SYSTEM", "APP", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final Type APP;
            public static final h Companion;
            public static final Type SYSTEM;
            public static final Type UNKNOWN;

            static {
                Type type = new Type("SYSTEM", 0);
                SYSTEM = type;
                Type type2 = new Type("APP", 1);
                APP = type2;
                Type type3 = new Type("UNKNOWN", 2);
                UNKNOWN = type3;
                Type[] typeArr = {type, type2, type3};
                $VALUES = typeArr;
                $ENTRIES = kotlin.enums.a.a(typeArr);
                Companion = new h();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new nk90(17));
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public /* synthetic */ UriInfo(int i, String str, boolean z, Type type) {
            this.a = (i & 1) == 0 ? null : str;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = Type.UNKNOWN;
            } else {
                this.c = type;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UriInfo)) {
                return false;
            }
            UriInfo uriInfo = (UriInfo) obj;
            return jl40.l(this.a, uriInfo.a) && this.b == uriInfo.b && this.c == uriInfo.c;
        }

        public final int hashCode() {
            String str = this.a;
            return this.c.hashCode() + unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder l = oo31.l("UriInfo(uri=", this.a, ", isAuthRequired=", ", type=", this.b);
            l.append(this.c);
            l.append(Extension.C_BRAKE);
            return l.toString();
        }

        public UriInfo() {
            Type type = Type.UNKNOWN;
            this.a = null;
            this.b = false;
            this.c = type;
        }
    }
}
