package ru.yandex.taxi.masstransit.geopayment.checkout.network.model;

import defpackage.b64;
import defpackage.eua;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ief;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.klj;
import defpackage.ly3;
import defpackage.oez0;
import defpackage.oyr;
import defpackage.qlb;
import defpackage.rlb;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse;", "", "Companion", "StopsSelector", "TransportItem", "b", "d", "c", "a", "CheckoutPaymentMethods", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/a", "rlb", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CheckoutResponse {
    public static final rlb Companion = new rlb();
    public final String a;
    public final String b;
    public final String c;
    public final c d;
    public final klj e;
    public final String f;
    public final StopsSelector g;
    public final TransportItem h;
    public final b i;
    public final d j;
    public final a k;
    public final FormattedText l;
    public final Object m;
    public final CheckoutPaymentMethods n;
    public final boolean o;

    public CheckoutResponse(int i, String str, String str2, String str3, c cVar, klj kljVar, String str4, StopsSelector stopsSelector, TransportItem transportItem, b bVar, d dVar, a aVar, FormattedText formattedText, Object obj, CheckoutPaymentMethods checkoutPaymentMethods, boolean z) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = cVar;
        }
        if ((i & 16) == 0) {
            klj.Companion.getClass();
            this.e = klj.d;
        } else {
            this.e = kljVar;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = stopsSelector;
        }
        if ((i & 128) == 0) {
            this.h = new TransportItem(0);
        } else {
            this.h = transportItem;
        }
        if ((i & 256) == 0) {
            this.i = new b(0);
        } else {
            this.i = bVar;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = dVar;
        }
        if ((i & 1024) == 0) {
            this.k = new a(0);
        } else {
            this.k = aVar;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = formattedText;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = obj;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = checkoutPaymentMethods;
        }
        if ((i & 16384) == 0) {
            this.o = false;
        } else {
            this.o = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutResponse)) {
            return false;
        }
        CheckoutResponse checkoutResponse = (CheckoutResponse) obj;
        return jl40.l(this.a, checkoutResponse.a) && jl40.l(this.b, checkoutResponse.b) && jl40.l(this.c, checkoutResponse.c) && jl40.l(this.d, checkoutResponse.d) && jl40.l(this.e, checkoutResponse.e) && jl40.l(this.f, checkoutResponse.f) && jl40.l(this.g, checkoutResponse.g) && jl40.l(this.h, checkoutResponse.h) && jl40.l(this.i, checkoutResponse.i) && jl40.l(this.j, checkoutResponse.j) && jl40.l(this.k, checkoutResponse.k) && jl40.l(this.l, checkoutResponse.l) && jl40.l(this.m, checkoutResponse.m) && jl40.l(this.n, checkoutResponse.n) && this.o == checkoutResponse.o;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        c cVar = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31;
        String str3 = this.f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StopsSelector stopsSelector = this.g;
        int hashCode6 = (this.i.hashCode() + ((this.h.hashCode() + ((hashCode5 + (stopsSelector == null ? 0 : stopsSelector.hashCode())) * 31)) * 31)) * 31;
        d dVar = this.j;
        int hashCode7 = (this.k.hashCode() + ((hashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        FormattedText formattedText = this.l;
        int hashCode8 = (hashCode7 + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        Object obj = this.m;
        int hashCode9 = (hashCode8 + (obj == null ? 0 : obj.hashCode())) * 31;
        CheckoutPaymentMethods checkoutPaymentMethods = this.n;
        return Boolean.hashCode(this.o) + ((hashCode9 + (checkoutPaymentMethods != null ? checkoutPaymentMethods.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CheckoutResponse(id=", this.a, ", startingStopId=", this.b, ", destinationStopId=");
        v.append(this.c);
        v.append(", price=");
        v.append(this.d);
        v.append(", directionSelector=");
        v.append(this.e);
        v.append(", directionId=");
        v.append(this.f);
        v.append(", stopsSelector=");
        v.append(this.g);
        v.append(", transportItem=");
        v.append(this.h);
        v.append(", counterItem=");
        v.append(this.i);
        v.append(", priceItem=");
        v.append(this.j);
        v.append(", buttonItem=");
        v.append(this.k);
        v.append(", userAgreement=");
        v.append(this.l);
        v.append(", metaPaymentInfo=");
        v.append(this.m);
        v.append(", paymentMethods=");
        v.append(this.n);
        v.append(", footerIsHidden=");
        return x4e.i(v, this.o, Extension.C_BRAKE);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$TransportItem;", "", "Companion", "a", "b", "TransportType", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/x", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/a0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class TransportItem {
        public static final a0 Companion = new a0();
        public static final i3y[] e = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(5)), null};
        public final String a;
        public final a b;
        public final TransportType c;
        public final Object d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$TransportItem$TransportType;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/d0", "BUS", "TRAM", "TROLLEYBUS", "ELECTROBUS", "WATER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class TransportType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ TransportType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final TransportType BUS;
            public static final d0 Companion;
            public static final TransportType ELECTROBUS;
            public static final TransportType TRAM;
            public static final TransportType TROLLEYBUS;
            public static final TransportType WATER;

            static {
                TransportType transportType = new TransportType("BUS", 0);
                BUS = transportType;
                TransportType transportType2 = new TransportType("TRAM", 1);
                TRAM = transportType2;
                TransportType transportType3 = new TransportType("TROLLEYBUS", 2);
                TROLLEYBUS = transportType3;
                TransportType transportType4 = new TransportType("ELECTROBUS", 3);
                ELECTROBUS = transportType4;
                TransportType transportType5 = new TransportType("WATER", 4);
                WATER = transportType5;
                TransportType[] transportTypeArr = {transportType, transportType2, transportType3, transportType4, transportType5};
                $VALUES = transportTypeArr;
                $ENTRIES = kotlin.enums.a.a(transportTypeArr);
                Companion = new d0();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(6));
            }

            public static TransportType valueOf(String str) {
                return (TransportType) Enum.valueOf(TransportType.class, str);
            }

            public static TransportType[] values() {
                return (TransportType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ TransportItem(int i, String str, a aVar, TransportType transportType, Object obj) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = aVar;
            }
            if ((i & 4) == 0) {
                this.c = TransportType.BUS;
            } else {
                this.c = transportType;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = obj;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransportItem)) {
                return false;
            }
            TransportItem transportItem = (TransportItem) obj;
            return jl40.l(this.a, transportItem.a) && jl40.l(this.b, transportItem.b) && this.c == transportItem.c && jl40.l(this.d, transportItem.d);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            a aVar = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
            Object obj = this.d;
            return hashCode2 + (obj != null ? obj.hashCode() : 0);
        }

        public final String toString() {
            return "TransportItem(id=" + this.a + ", cardItem=" + this.b + ", transportType=" + this.c + ", metaCheckoutInfo=" + this.d + Extension.C_BRAKE;
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$TransportItem$b;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/b0", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/c0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class b {
            public static final c0 Companion = new c0();
            public final String a;
            public final String b;

            public /* synthetic */ b(int i, String str, String str2) {
                this.a = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return unr0.p("Trail(registrationNumber=", this.a, ", icon=", this.b, Extension.C_BRAKE);
            }

            public b(int i) {
                this.a = "";
                this.b = null;
            }

            public b() {
                this(0);
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$TransportItem$a;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/y", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class a {
            public static final z Companion = new z();
            public final FormattedText a;
            public final FormattedText b;
            public final b c;

            public /* synthetic */ a(int i, FormattedText formattedText, FormattedText formattedText2, b bVar) {
                this.a = (i & 1) == 0 ? new FormattedText(0) : formattedText;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = formattedText2;
                }
                if ((i & 4) == 0) {
                    this.c = new b(0);
                } else {
                    this.c = bVar;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
            }

            public final int hashCode() {
                int hashCode = this.a.a.hashCode() * 31;
                FormattedText formattedText = this.b;
                return this.c.hashCode() + ((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder r = defpackage.n.r("CardItem(title=", this.a, ", subtitle=", this.b, ", trail=");
                r.append(this.c);
                r.append(Extension.C_BRAKE);
                return r.toString();
            }

            public a() {
                FormattedText formattedText = new FormattedText(0);
                b bVar = new b(0);
                this.a = formattedText;
                this.b = null;
                this.c = bVar;
            }
        }

        public TransportItem() {
            this(0);
        }

        public TransportItem(int i) {
            TransportType transportType = TransportType.BUS;
            this.a = "";
            this.b = null;
            this.c = transportType;
            this.d = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$b;", "", "Companion", "a", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/g", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class b {
        public static final h Companion = new h();
        public final FormattedText a;
        public final a b;
        public final boolean c;

        public /* synthetic */ b(int i, FormattedText formattedText, a aVar, boolean z) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = new a(0);
            } else {
                this.b = aVar;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CounterItem(title=");
            sb.append(this.a);
            sb.append(", data=");
            sb.append(this.b);
            sb.append(", isHidden=");
            return x4e.i(sb, this.c, Extension.C_BRAKE);
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$b$a;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/i", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class a {
            public static final j Companion = new j();
            public final int a;
            public final Integer b;
            public final Double c;

            public /* synthetic */ a(int i, int i2, Integer num, Double d) {
                this.a = (i & 1) == 0 ? 1 : i2;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = num;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = d;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.a) * 31;
                Integer num = this.b;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Double d = this.c;
                return hashCode2 + (d != null ? d.hashCode() : 0);
            }

            public final String toString() {
                return "Data(maxAmount=" + this.a + ", currentAmount=" + this.b + ", debounce=" + this.c + Extension.C_BRAKE;
            }

            public a(int i) {
                this.a = 1;
                this.b = null;
                this.c = null;
            }

            public a() {
                this(0);
            }
        }

        public b() {
            this(0);
        }

        public b(int i) {
            FormattedText formattedText = FormattedText.c;
            a aVar = new a(0);
            this.a = formattedText;
            this.b = aVar;
            this.c = false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$CheckoutPaymentMethods;", "", "Companion", "Source", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/d", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CheckoutPaymentMethods {
        public static final e Companion = new e();
        public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eua(29)), null, null};
        public final Source a;
        public final String b;
        public final String c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$CheckoutPaymentMethods$Source;", "", "", "key", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/f", "DEFAULT", "MOSMETRO", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class Source {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Source[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final f Companion;
            public static final Source DEFAULT;
            public static final Source MOSMETRO;
            private final String key;

            static {
                Source source = new Source("DEFAULT", 0, "default");
                DEFAULT = source;
                Source source2 = new Source("MOSMETRO", 1, "mosmetro");
                MOSMETRO = source2;
                Source[] sourceArr = {source, source2};
                $VALUES = sourceArr;
                $ENTRIES = kotlin.enums.a.a(sourceArr);
                Companion = new f();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(0));
            }

            public Source(String str, int i, String str2) {
                this.key = str2;
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) $VALUES.clone();
            }

            /* renamed from: b, reason: from getter */
            public final String getKey() {
                return this.key;
            }
        }

        public /* synthetic */ CheckoutPaymentMethods(int i, Source source, String str, String str2) {
            this.a = (i & 1) == 0 ? Source.DEFAULT : source;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckoutPaymentMethods)) {
                return false;
            }
            CheckoutPaymentMethods checkoutPaymentMethods = (CheckoutPaymentMethods) obj;
            return this.a == checkoutPaymentMethods.a && jl40.l(this.b, checkoutPaymentMethods.b) && jl40.l(this.c, checkoutPaymentMethods.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CheckoutPaymentMethods(source=");
            sb.append(this.a);
            sb.append(", cardsDescription=");
            sb.append(this.b);
            sb.append(", noCardsDescription=");
            return oyr.t(sb, this.c, Extension.C_BRAKE);
        }

        public CheckoutPaymentMethods() {
            this.a = Source.DEFAULT;
            this.b = null;
            this.c = null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$StopsSelector;", "", "Companion", "b", "c", "a", "StopState", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/o", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class StopsSelector {
        public static final p Companion = new p();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(1))};
        public final boolean a;
        public final b b;
        public final List c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$StopsSelector$StopState;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/u", "PASSED", "UPCOMING", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class StopState {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ StopState[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final u Companion;
            public static final StopState PASSED;
            public static final StopState UPCOMING;

            static {
                StopState stopState = new StopState("PASSED", 0);
                PASSED = stopState;
                StopState stopState2 = new StopState("UPCOMING", 1);
                UPCOMING = stopState2;
                StopState[] stopStateArr = {stopState, stopState2};
                $VALUES = stopStateArr;
                $ENTRIES = kotlin.enums.a.a(stopStateArr);
                Companion = new u();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(4));
            }

            public static StopState valueOf(String str) {
                return (StopState) Enum.valueOf(StopState.class, str);
            }

            public static StopState[] values() {
                return (StopState[]) $VALUES.clone();
            }
        }

        public /* synthetic */ StopsSelector(int i, boolean z, b bVar, List list) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = new b(0);
            } else {
                this.b = bVar;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StopsSelector)) {
                return false;
            }
            StopsSelector stopsSelector = (StopsSelector) obj;
            return this.a == stopsSelector.a && jl40.l(this.b, stopsSelector.b) && jl40.l(this.c, stopsSelector.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StopsSelector(startingStopIsSelectable=");
            sb.append(this.a);
            sb.append(", items=");
            sb.append(this.b);
            sb.append(", stops=");
            return ly3.s(sb, this.c, Extension.C_BRAKE);
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$StopsSelector$c;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/v", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/w", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class c {
            public static final w Companion = new w();
            public final String a;
            public final FormattedText b;
            public final FormattedText c;

            public /* synthetic */ c(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = FormattedText.c;
                } else {
                    this.b = formattedText;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = formattedText2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c);
            }

            public final int hashCode() {
                String str = this.a;
                int c = unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b.a);
                FormattedText formattedText = this.c;
                return c + (formattedText != null ? formattedText.a.hashCode() : 0);
            }

            public final String toString() {
                return tse0.m(xvz.q("StopsSelectorText(icon=", this.a, ", title=", ", subtitle=", this.b), this.c, Extension.C_BRAKE);
            }

            public c() {
                this(0);
            }

            public c(int i) {
                FormattedText formattedText = FormattedText.c;
                this.a = null;
                this.b = formattedText;
                this.c = null;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$StopsSelector$b;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/s", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class b {
            public static final t Companion = new t();
            public final c a;
            public final c b;
            public final FormattedText c;

            public /* synthetic */ b(int i, c cVar, c cVar2, FormattedText formattedText) {
                this.a = (i & 1) == 0 ? new c(0) : cVar;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = cVar2;
                }
                if ((i & 4) == 0) {
                    this.c = FormattedText.c;
                } else {
                    this.c = formattedText;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                c cVar = this.b;
                return this.c.a.hashCode() + ((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("StopSelectorItems(startingItem=");
                sb.append(this.a);
                sb.append(", destinationItem=");
                sb.append(this.b);
                sb.append(", selectorTitle=");
                return tse0.m(sb, this.c, Extension.C_BRAKE);
            }

            public b() {
                this(0);
            }

            public b(int i) {
                c cVar = new c(0);
                FormattedText formattedText = FormattedText.c;
                this.a = cVar;
                this.b = null;
                this.c = formattedText;
            }
        }

        public StopsSelector() {
            b bVar = new b(0);
            this.a = false;
            this.b = bVar;
            this.c = EmptyList.a;
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$StopsSelector$a;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/q", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class a {
            public static final r Companion = new r();
            public static final i3y[] f;
            public final String a;
            public final StopState b;
            public final StopState c;
            public final FormattedText d;
            public final FormattedText e;

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new qlb(2)), kotlin.a.b(lazyThreadSafetyMode, new qlb(3)), null, null};
            }

            public /* synthetic */ a(int i, String str, StopState stopState, StopState stopState2, FormattedText formattedText, FormattedText formattedText2) {
                this.a = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.b = StopState.PASSED;
                } else {
                    this.b = stopState;
                }
                if ((i & 4) == 0) {
                    this.c = StopState.PASSED;
                } else {
                    this.c = stopState2;
                }
                if ((i & 8) == 0) {
                    this.d = FormattedText.c;
                } else {
                    this.d = formattedText;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = formattedText2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return jl40.l(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e);
            }

            public final int hashCode() {
                int c = unr0.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d.a);
                FormattedText formattedText = this.e;
                return c + (formattedText == null ? 0 : formattedText.a.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Stop(id=");
                sb.append(this.a);
                sb.append(", startingStopState=");
                sb.append(this.b);
                sb.append(", state=");
                sb.append(this.c);
                sb.append(", title=");
                sb.append(this.d);
                sb.append(", subtitle=");
                return tse0.m(sb, this.e, Extension.C_BRAKE);
            }

            public a() {
                StopState stopState = StopState.PASSED;
                FormattedText formattedText = FormattedText.c;
                this.a = "";
                this.b = stopState;
                this.c = stopState;
                this.d = formattedText;
                this.e = null;
            }
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$c;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/k", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class c {
        public static final l Companion = new l();
        public final double a;
        public final ief b;
        public final Double c;

        public /* synthetic */ c(int i, double d, ief iefVar, Double d2) {
            this.a = (i & 1) == 0 ? 0.0d : d;
            if ((i & 2) == 0) {
                this.b = new ief(null, null, null, null);
            } else {
                this.b = iefVar;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = d2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Double.compare(this.a, cVar.a) == 0 && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Double.hashCode(this.a) * 31)) * 31;
            Double d = this.c;
            return hashCode + (d == null ? 0 : d.hashCode());
        }

        public final String toString() {
            return "Price(value=" + this.a + ", currencyRules=" + this.b + ", discountValue=" + this.c + Extension.C_BRAKE;
        }

        public c() {
            ief iefVar = new ief(null, null, null, null);
            this.a = 0.0d;
            this.b = iefVar;
            this.c = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$d;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/m", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class d {
        public static final n Companion = new n();
        public final FormattedText a;
        public final FormattedText b;
        public final FormattedText c;

        public /* synthetic */ d(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
            int i2 = 0;
            this.a = (i & 1) == 0 ? new FormattedText(i2) : formattedText;
            if ((i & 2) == 0) {
                this.b = new FormattedText(i2);
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = formattedText3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b) && jl40.l(this.c, dVar.c);
        }

        public final int hashCode() {
            int c = unr0.c(this.a.a.hashCode() * 31, 31, this.b.a);
            FormattedText formattedText = this.c;
            return c + (formattedText == null ? 0 : formattedText.a.hashCode());
        }

        public final String toString() {
            return tse0.m(defpackage.n.r("PriceItem(leadTitle=", this.a, ", trailTitle=", this.b, ", discountTrailTitle="), this.c, Extension.C_BRAKE);
        }

        public d() {
            int i = 0;
            FormattedText formattedText = new FormattedText(i);
            FormattedText formattedText2 = new FormattedText(i);
            this.a = formattedText;
            this.b = formattedText2;
            this.c = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/checkout/network/model/CheckoutResponse$a;", "", "Companion", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/b", "ru/yandex/taxi/masstransit/geopayment/checkout/network/model/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final ru.yandex.taxi.masstransit.geopayment.checkout.network.model.c Companion = new ru.yandex.taxi.masstransit.geopayment.checkout.network.model.c();
        public final FormattedText a;
        public final boolean b;
        public final boolean c;
        public final oez0 d;

        public /* synthetic */ a(int i, FormattedText formattedText, boolean z, boolean z2, oez0 oez0Var) {
            this.a = (i & 1) == 0 ? new FormattedText(0) : formattedText;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = oez0Var;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && jl40.l(this.d, aVar.d);
        }

        public final int hashCode() {
            int e = unr0.e(unr0.e(this.a.a.hashCode() * 31, 31, this.b), 31, this.c);
            oez0 oez0Var = this.d;
            return e + (oez0Var == null ? 0 : oez0Var.hashCode());
        }

        public final String toString() {
            return "ButtonItem(title=" + this.a + ", isEnabled=" + this.b + ", isHidden=" + this.c + ", timerStateUpdate=" + this.d + Extension.C_BRAKE;
        }

        public a() {
            this(0);
        }

        public a(int i) {
            this.a = new FormattedText(0);
            this.b = false;
            this.c = false;
            this.d = null;
        }
    }

    public CheckoutResponse() {
        klj.Companion.getClass();
        klj kljVar = klj.d;
        TransportItem transportItem = new TransportItem(0);
        b bVar = new b(0);
        a aVar = new a(0);
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = kljVar;
        this.f = null;
        this.g = null;
        this.h = transportItem;
        this.i = bVar;
        this.j = null;
        this.k = aVar;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = false;
    }
}
