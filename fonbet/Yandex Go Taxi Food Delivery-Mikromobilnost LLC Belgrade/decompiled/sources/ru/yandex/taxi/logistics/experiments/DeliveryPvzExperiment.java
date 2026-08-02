package ru.yandex.taxi.logistics.experiments;

import defpackage.b64;
import defpackage.c6z;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ili;
import defpackage.jgi;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xn11;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/logistics/experiments/DeliveryPvzExperiment;", "Lxn11;", "Lc6z;", "Companion", "b", "RouteType", "c", "a", "AddressFlow", "ili", "ru/yandex/taxi/logistics/experiments/a", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class DeliveryPvzExperiment implements xn11, c6z {
    public static final ili Companion = new ili();
    public static final i3y[] u;
    public static final DeliveryPvzExperiment v;
    public final boolean b;
    public final Map c;
    public final List d;
    public final List e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final List r;
    public final Float s;
    public final a t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/experiments/DeliveryPvzExperiment$AddressFlow;", "", "Companion", "ru/yandex/taxi/logistics/experiments/b", "COURIER", "PICKUP_POINT", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class AddressFlow {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AddressFlow[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final AddressFlow COURIER;
        public static final ru.yandex.taxi.logistics.experiments.b Companion;
        public static final AddressFlow PICKUP_POINT;

        static {
            AddressFlow addressFlow = new AddressFlow("COURIER", 0);
            COURIER = addressFlow;
            AddressFlow addressFlow2 = new AddressFlow("PICKUP_POINT", 1);
            PICKUP_POINT = addressFlow2;
            AddressFlow[] addressFlowArr = {addressFlow, addressFlow2};
            $VALUES = addressFlowArr;
            $ENTRIES = kotlin.enums.a.a(addressFlowArr);
            Companion = new ru.yandex.taxi.logistics.experiments.b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(9));
        }

        public static AddressFlow valueOf(String str) {
            return (AddressFlow) Enum.valueOf(AddressFlow.class, str);
        }

        public static AddressFlow[] values() {
            return (AddressFlow[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/experiments/DeliveryPvzExperiment$RouteType;", "", "Companion", "ru/yandex/taxi/logistics/experiments/g", "SOURCE", "DESTINATION", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class RouteType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ RouteType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final g Companion;
        public static final RouteType DESTINATION;
        public static final RouteType SOURCE;

        static {
            RouteType routeType = new RouteType("SOURCE", 0);
            SOURCE = routeType;
            RouteType routeType2 = new RouteType("DESTINATION", 1);
            DESTINATION = routeType2;
            RouteType[] routeTypeArr = {routeType, routeType2};
            $VALUES = routeTypeArr;
            $ENTRIES = kotlin.enums.a.a(routeTypeArr);
            Companion = new g();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(12));
        }

        public static RouteType valueOf(String str) {
            return (RouteType) Enum.valueOf(RouteType.class, str);
        }

        public static RouteType[] values() {
            return (RouteType[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        u = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new jgi(5)), kotlin.a.b(lazyThreadSafetyMode, new jgi(6)), kotlin.a.b(lazyThreadSafetyMode, new jgi(7)), null, null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new jgi(8)), null, null};
        v = new DeliveryPvzExperiment(0);
    }

    public /* synthetic */ DeliveryPvzExperiment(int i, boolean z, Map map, List list, List list2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list3, Float f, a aVar) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.d = emptyList;
        } else {
            this.d = list;
        }
        if ((i & 8) == 0) {
            this.e = emptyList;
        } else {
            this.e = list2;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = str;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str2;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str3;
        }
        if ((i & 128) == 0) {
            this.i = "";
        } else {
            this.i = str4;
        }
        if ((i & 256) == 0) {
            this.j = "";
        } else {
            this.j = str5;
        }
        if ((i & 512) == 0) {
            this.k = "";
        } else {
            this.k = str6;
        }
        if ((i & 1024) == 0) {
            this.l = "";
        } else {
            this.l = str7;
        }
        if ((i & 2048) == 0) {
            this.m = "";
        } else {
            this.m = str8;
        }
        if ((i & 4096) == 0) {
            this.n = "";
        } else {
            this.n = str9;
        }
        if ((i & 8192) == 0) {
            this.o = "";
        } else {
            this.o = str10;
        }
        if ((i & 16384) == 0) {
            this.p = "";
        } else {
            this.p = str11;
        }
        if ((32768 & i) == 0) {
            this.q = "";
        } else {
            this.q = str12;
        }
        if ((65536 & i) == 0) {
            this.r = emptyList;
        } else {
            this.r = list3;
        }
        if ((131072 & i) == 0) {
            this.s = null;
        } else {
            this.s = f;
        }
        this.t = (i & 262144) == 0 ? new a(0) : aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPvzExperiment)) {
            return false;
        }
        DeliveryPvzExperiment deliveryPvzExperiment = (DeliveryPvzExperiment) obj;
        return this.b == deliveryPvzExperiment.b && jl40.l(this.c, deliveryPvzExperiment.c) && jl40.l(this.d, deliveryPvzExperiment.d) && jl40.l(this.e, deliveryPvzExperiment.e) && jl40.l(this.f, deliveryPvzExperiment.f) && jl40.l(this.g, deliveryPvzExperiment.g) && jl40.l(this.h, deliveryPvzExperiment.h) && jl40.l(this.i, deliveryPvzExperiment.i) && jl40.l(this.j, deliveryPvzExperiment.j) && jl40.l(this.k, deliveryPvzExperiment.k) && jl40.l(this.l, deliveryPvzExperiment.l) && jl40.l(this.m, deliveryPvzExperiment.m) && jl40.l(this.n, deliveryPvzExperiment.n) && jl40.l(this.o, deliveryPvzExperiment.o) && jl40.l(this.p, deliveryPvzExperiment.p) && jl40.l(this.q, deliveryPvzExperiment.q) && jl40.l(this.r, deliveryPvzExperiment.r) && jl40.l(this.s, deliveryPvzExperiment.s) && jl40.l(this.t, deliveryPvzExperiment.t);
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public final int hashCode() {
        int c2 = unr0.c(unr0.c(unr0.d(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int c3 = unr0.c(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(unr0.b((c2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r);
        Float f = this.s;
        return this.t.hashCode() + ((c3 + (f != null ? f.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder l = nnm.l("DeliveryPvzExperiment(enabled=", ", l10n=", ", tariffClasses=", this.c, this.b);
        nnm.w(l, this.d, ", tariffClassesTranslations=", this.e, ", shareMapButtonLink=");
        g8e.D(l, this.f, ", summarySourcePointAddressPrefixKey=", this.g, ", summaryDestinationPointAddressPrefixKey=");
        g8e.D(l, this.h, ", summarySourcePointSubtitleNotPvzKey=", this.i, ", summaryDestinationPointSubtitleNotPvzKey=");
        g8e.D(l, this.j, ", summarySourcePointSubtitlePvzKey=", this.k, ", summaryDestinationPointSubtitlePvzKey=");
        g8e.D(l, this.l, ", selectPvzButtonSubtitleKey=", this.m, ", bubbleUnavailableSendTextKey=");
        g8e.D(l, this.n, ", selectPointsTitleKey=", this.o, ", selectedPointTitleKey=");
        g8e.D(l, this.p, ", errorTryAnotherPvzKey=", this.q, ", routeSwitchButtons=");
        l.append(this.r);
        l.append(", initialZoomLevel=");
        l.append(this.s);
        l.append(", courierFlowSegment=");
        l.append(this.t);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/experiments/DeliveryPvzExperiment$b;", "", "Companion", "ru/yandex/taxi/logistics/experiments/e", "ru/yandex/taxi/logistics/experiments/f", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {
        public static final f Companion = new f();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(11)), null};
        public final RouteType a;
        public final String b;

        public /* synthetic */ b(int i, RouteType routeType, String str) {
            this.a = (i & 1) == 0 ? RouteType.DESTINATION : routeType;
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str;
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
            return this.a == bVar.a && jl40.l(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RouteSwitchButtonItem(type=" + this.a + ", titleKey=" + this.b + Extension.C_BRAKE;
        }

        public b() {
            this.a = RouteType.DESTINATION;
            this.b = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/experiments/DeliveryPvzExperiment$c;", "", "Companion", "ru/yandex/taxi/logistics/experiments/h", "ru/yandex/taxi/logistics/experiments/i", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class c {
        public static final i Companion = new i();
        public final String a;
        public final String b;

        public /* synthetic */ c(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
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
            return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("TariffClassesTranslations(tariffClass=", this.a, ", destinationHintKey=", this.b, Extension.C_BRAKE);
        }

        public c() {
            this.a = "";
            this.b = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/logistics/experiments/DeliveryPvzExperiment$a;", "", "Companion", "ru/yandex/taxi/logistics/experiments/c", "ru/yandex/taxi/logistics/experiments/d", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class a {
        public static final d Companion = new d();
        public static final i3y[] f = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jgi(10)), null, null};
        public final String a;
        public final String b;
        public final AddressFlow c;
        public final String d;
        public final String e;

        public /* synthetic */ a(int i, String str, String str2, AddressFlow addressFlow, String str3, String str4) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = AddressFlow.PICKUP_POINT;
            } else {
                this.c = addressFlow;
            }
            if ((i & 8) == 0) {
                this.d = "";
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = "";
            } else {
                this.e = str4;
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
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && this.c == aVar.c && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + unr0.b((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder v = b64.v("CourierFlowSegment(courierButtonTitleKey=", this.a, ", pickupPointButtonTitleKey=", this.b, ", defaultAddressFlow=");
            v.append(this.c);
            v.append(", pickupPointUriSubstring=");
            v.append(this.d);
            v.append(", courierPersuggestCurrentMode=");
            return oyr.t(v, this.e, Extension.C_BRAKE);
        }

        public a() {
            this(0);
        }

        public a(int i) {
            AddressFlow addressFlow = AddressFlow.PICKUP_POINT;
            this.a = "";
            this.b = "";
            this.c = addressFlow;
            this.d = "";
            this.e = "";
        }
    }

    public DeliveryPvzExperiment() {
        this(0);
    }

    public DeliveryPvzExperiment(int i) {
        Map f = kotlin.collections.b.f();
        a aVar = new a(0);
        this.b = false;
        this.c = f;
        EmptyList emptyList = EmptyList.a;
        this.d = emptyList;
        this.e = emptyList;
        this.f = null;
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = "";
        this.p = "";
        this.q = "";
        this.r = emptyList;
        this.s = null;
        this.t = aVar;
    }
}
