package ru.yandex.taxi.summary.promotions.models;

import defpackage.b64;
import defpackage.bnv0;
import defpackage.c4v;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.knv0;
import defpackage.ly3;
import defpackage.m0e;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.qos0;
import defpackage.t0e;
import defpackage.uiv0;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse;", "", "Companion", "knv0", "b", "d", "e", "f", "a", "g", "OfferAvailability", "DisplayOnType", "c", "ru/yandex/taxi/summary/promotions/models/o", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SummaryPromotionsResponse {
    public static final knv0 Companion = new knv0();
    public static final SummaryPromotionsResponse b = new SummaryPromotionsResponse(0);
    public final b a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse$DisplayOnType;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/p", "SUMMARY", "TARIFF_CARD", "ORDER_BUTTON", "PROMOBLOCK", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class DisplayOnType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ DisplayOnType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final p Companion;
        public static final DisplayOnType ORDER_BUTTON;
        public static final DisplayOnType PROMOBLOCK;
        public static final DisplayOnType SUMMARY;
        public static final DisplayOnType TARIFF_CARD;

        static {
            DisplayOnType displayOnType = new DisplayOnType("SUMMARY", 0);
            SUMMARY = displayOnType;
            DisplayOnType displayOnType2 = new DisplayOnType("TARIFF_CARD", 1);
            TARIFF_CARD = displayOnType2;
            DisplayOnType displayOnType3 = new DisplayOnType("ORDER_BUTTON", 2);
            ORDER_BUTTON = displayOnType3;
            DisplayOnType displayOnType4 = new DisplayOnType("PROMOBLOCK", 3);
            PROMOBLOCK = displayOnType4;
            DisplayOnType[] displayOnTypeArr = {displayOnType, displayOnType2, displayOnType3, displayOnType4};
            $VALUES = displayOnTypeArr;
            $ENTRIES = kotlin.enums.a.a(displayOnTypeArr);
            Companion = new p();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new uiv0(14));
        }

        public static DisplayOnType valueOf(String str) {
            return (DisplayOnType) Enum.valueOf(DisplayOnType.class, str);
        }

        public static DisplayOnType[] values() {
            return (DisplayOnType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse$OfferAvailability;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/i0", "ALL", "ORIGINAL", "ALTERNATIVE", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes6.dex */
    public static final class OfferAvailability {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ OfferAvailability[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final OfferAvailability ALL;
        public static final OfferAvailability ALTERNATIVE;
        public static final i0 Companion;
        public static final OfferAvailability ORIGINAL;

        static {
            OfferAvailability offerAvailability = new OfferAvailability("ALL", 0);
            ALL = offerAvailability;
            OfferAvailability offerAvailability2 = new OfferAvailability("ORIGINAL", 1);
            ORIGINAL = offerAvailability2;
            OfferAvailability offerAvailability3 = new OfferAvailability("ALTERNATIVE", 2);
            ALTERNATIVE = offerAvailability3;
            OfferAvailability[] offerAvailabilityArr = {offerAvailability, offerAvailability2, offerAvailability3};
            $VALUES = offerAvailabilityArr;
            $ENTRIES = kotlin.enums.a.a(offerAvailabilityArr);
            Companion = new i0();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bnv0(6));
        }

        public static OfferAvailability valueOf(String str) {
            return (OfferAvailability) Enum.valueOf(OfferAvailability.class, str);
        }

        public static OfferAvailability[] values() {
            return (OfferAvailability[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SummaryPromotionsResponse(int i, b bVar) {
        if ((i & 1) == 0) {
            this.a = new b(0);
        } else {
            this.a = bVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SummaryPromotionsResponse) && jl40.l(this.a, ((SummaryPromotionsResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SummaryPromotionsResponse(offers=" + this.a + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse$a;", "", "Companion", "a", "b", "c", "d", "ru/yandex/taxi/summary/promotions/models/d0", "ru/yandex/taxi/summary/promotions/models/q", "ru/yandex/taxi/summary/promotions/models/t", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes6.dex */
    public static final /* data */ class a {
        public static final t Companion = new t();
        public static final i3y[] q;
        public final String a;
        public final String b;
        public final FormattedText c;
        public final FormattedText d;
        public final c4v e;
        public final CommunicationItem.a f;
        public final c g;
        public final C0118a h;
        public final b i;
        public final d j;
        public final d0 k;
        public final boolean l;
        public final jsq0 m;
        public final t0e n;
        public final List o;
        public final Map p;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            q = new i3y[]{null, null, null, null, null, null, null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new bnv0(2)), null, kotlin.a.b(lazyThreadSafetyMode, new bnv0(3)), kotlin.a.b(lazyThreadSafetyMode, new bnv0(4))};
        }

        public a(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2, c4v c4vVar, CommunicationItem.a aVar, c cVar, C0118a c0118a, b bVar, d dVar, d0 d0Var, boolean z, jsq0 jsq0Var, t0e t0eVar, List list, Map map) {
            this.a = (i & 1) == 0 ? "" : str;
            String str3 = null;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            int i2 = 0;
            if ((i & 4) == 0) {
                this.c = new FormattedText(i2);
            } else {
                this.c = formattedText;
            }
            if ((i & 8) == 0) {
                this.d = new FormattedText(i2);
            } else {
                this.d = formattedText2;
            }
            if ((i & 16) == 0) {
                this.e = new c4v(str3, str3, 3);
            } else {
                this.e = c4vVar;
            }
            if ((i & 32) == 0) {
                CommunicationItem.a.Companion.getClass();
                this.f = CommunicationItem.a.j;
            } else {
                this.f = aVar;
            }
            if ((i & 64) == 0) {
                this.g = new c(0);
            } else {
                this.g = cVar;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = c0118a;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = bVar;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = dVar;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = d0Var;
            }
            if ((i & 2048) == 0) {
                this.l = false;
            } else {
                this.l = z;
            }
            if ((i & 4096) == 0) {
                this.m = null;
            } else {
                this.m = jsq0Var;
            }
            this.n = (i & 8192) == 0 ? new m0e(0) : t0eVar;
            this.o = (i & 16384) == 0 ? EmptyList.a : list;
            if ((i & 32768) == 0) {
                this.p = null;
            } else {
                this.p = map;
            }
        }

        public static a a(a aVar, FormattedText formattedText, FormattedText formattedText2, CommunicationItem.a aVar2, int i) {
            return new a(aVar.a, aVar.b, (i & 4) != 0 ? aVar.c : formattedText, (i & 8) != 0 ? aVar.d : formattedText2, aVar.e, (i & 32) != 0 ? aVar.f : aVar2, aVar.g, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.m, aVar.n, aVar.o, aVar.p);
        }

        /* renamed from: b, reason: from getter */
        public final Map getP() {
            return this.p;
        }

        /* renamed from: c, reason: from getter */
        public final t0e getN() {
            return this.n;
        }

        /* renamed from: d, reason: from getter */
        public final jsq0 getM() {
            return this.m;
        }

        /* renamed from: e, reason: from getter */
        public final c4v getE() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g) && jl40.l(this.h, aVar.h) && jl40.l(this.i, aVar.i) && jl40.l(this.j, aVar.j) && jl40.l(this.k, aVar.k) && this.l == aVar.l && jl40.l(this.m, aVar.m) && jl40.l(this.n, aVar.n) && jl40.l(this.o, aVar.o) && jl40.l(this.p, aVar.p);
        }

        /* renamed from: f, reason: from getter */
        public final String getA() {
            return this.a;
        }

        /* renamed from: g, reason: from getter */
        public final c getG() {
            return this.g;
        }

        /* renamed from: h, reason: from getter */
        public final d getJ() {
            return this.j;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.c(unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.a), 31, this.d.a)) * 31)) * 31)) * 31;
            C0118a c0118a = this.h;
            int hashCode3 = (hashCode2 + (c0118a == null ? 0 : Integer.hashCode(c0118a.a))) * 31;
            b bVar = this.i;
            int hashCode4 = (hashCode3 + (bVar == null ? 0 : Integer.hashCode(bVar.a))) * 31;
            d dVar = this.j;
            int hashCode5 = (hashCode4 + (dVar == null ? 0 : dVar.a.hashCode())) * 31;
            d0 d0Var = this.k;
            int e = unr0.e((hashCode5 + (d0Var == null ? 0 : d0Var.hashCode())) * 31, 31, this.l);
            jsq0 jsq0Var = this.m;
            int c2 = unr0.c((this.n.hashCode() + ((e + (jsq0Var == null ? 0 : jsq0Var.a.hashCode())) * 31)) * 31, 31, this.o);
            Map map = this.p;
            return c2 + (map != null ? map.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final FormattedText getD() {
            return this.d;
        }

        /* renamed from: j, reason: from getter */
        public final FormattedText getC() {
            return this.c;
        }

        /* renamed from: k, reason: from getter */
        public final CommunicationItem.a getF() {
            return this.f;
        }

        public final String toString() {
            StringBuilder v = b64.v("Item(id=", this.a, ", metaType=", this.b, ", title=");
            defpackage.n.C(v, this.c, ", text=", this.d, ", icon=");
            v.append(this.e);
            v.append(", widgets=");
            v.append(this.f);
            v.append(", showPolicy=");
            v.append(this.g);
            v.append(", cashBack=");
            v.append(this.h);
            v.append(", options=");
            v.append(this.i);
            v.append(", tariffIconOverride=");
            v.append(this.j);
            v.append(", tapAction=");
            v.append(this.k);
            v.append(", interceptOnFirstContact=");
            v.append(this.l);
            v.append(", displayOnType=");
            v.append(this.m);
            v.append(", configuration=");
            v.append(this.n);
            v.append(", supportedVerticals=");
            v.append(this.o);
            v.append(", analyticsPayload=");
            v.append(this.p);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse$a$d;", "", "Companion", "a", "ru/yandex/taxi/summary/promotions/models/e0", "ru/yandex/taxi/summary/promotions/models/f0", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final /* data */ class d {
            public static final f0 Companion = new f0();
            public final C0119a a;

            public /* synthetic */ d(int i, C0119a c0119a) {
                if ((i & 1) == 0) {
                    this.a = new C0119a(0);
                } else {
                    this.a = c0119a;
                }
            }

            /* renamed from: a, reason: from getter */
            public final C0119a getA() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && jl40.l(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "TariffIconOverride(image=" + this.a + Extension.C_BRAKE;
            }

            @gsq0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse$a$d$a;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/g0", "ru/yandex/taxi/summary/promotions/models/h0", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
            /* renamed from: ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse$a$d$a, reason: collision with other inner class name */
            public static final /* data */ class C0119a {
                public static final h0 Companion = new h0();
                public final String a;

                public /* synthetic */ C0119a(int i, String str) {
                    if ((i & 1) == 0) {
                        this.a = null;
                    } else {
                        this.a = str;
                    }
                }

                /* renamed from: a, reason: from getter */
                public final String getA() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0119a) && jl40.l(this.a, ((C0119a) obj).a);
                }

                public final int hashCode() {
                    String str = this.a;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return oyr.p("Image(tag=", this.a, Extension.C_BRAKE);
                }

                public C0119a(int i) {
                    this.a = null;
                }

                public C0119a() {
                    this(0);
                }
            }

            public d() {
                this.a = new C0119a(0);
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse$a$a;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/r", "ru/yandex/taxi/summary/promotions/models/s", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
        /* renamed from: ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0118a {
            public static final s Companion = new s();
            public final int a;

            public /* synthetic */ C0118a(int i, int i2) {
                if ((i & 1) == 0) {
                    this.a = 0;
                } else {
                    this.a = i2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0118a) && this.a == ((C0118a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return oyr.j(this.a, "CashBack(amount=", Extension.C_BRAKE);
            }

            public C0118a() {
                this.a = 0;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse$a$b;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/u", "ru/yandex/taxi/summary/promotions/models/v", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class b {
            public static final v Companion = new v();
            public final int a;

            public /* synthetic */ b(int i, int i2) {
                if ((i & 1) == 0) {
                    this.a = 0;
                } else {
                    this.a = i2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return oyr.j(this.a, "Options(priority=", Extension.C_BRAKE);
            }

            public b() {
                this.a = 0;
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse$a$c;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/w", "ru/yandex/taxi/summary/promotions/models/x", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class c {
            public static final x Companion = new x();
            public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bnv0(5))};
            public final int a;
            public final int b;
            public final OfferAvailability c;

            public /* synthetic */ c(int i, int i2, int i3, OfferAvailability offerAvailability) {
                if ((i & 1) == 0) {
                    this.a = Integer.MAX_VALUE;
                } else {
                    this.a = i2;
                }
                if ((i & 2) == 0) {
                    this.b = Integer.MAX_VALUE;
                } else {
                    this.b = i3;
                }
                if ((i & 4) == 0) {
                    this.c = OfferAvailability.ORIGINAL;
                } else {
                    this.c = offerAvailability;
                }
            }

            /* renamed from: a, reason: from getter */
            public final int getA() {
                return this.a;
            }

            /* renamed from: b, reason: from getter */
            public final int getB() {
                return this.b;
            }

            /* renamed from: c, reason: from getter */
            public final OfferAvailability getC() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                StringBuilder s = b64.s(this.a, this.b, "PromoblockShowPolicy(maxShowCount=", ", maxUsageCount=", ", offerAvailability=");
                s.append(this.c);
                s.append(Extension.C_BRAKE);
                return s.toString();
            }

            public c() {
                this(0);
            }

            public c(int i) {
                OfferAvailability offerAvailability = OfferAvailability.ORIGINAL;
                this.a = Integer.MAX_VALUE;
                this.b = Integer.MAX_VALUE;
                this.c = offerAvailability;
            }
        }

        public a(String str, String str2, FormattedText formattedText, FormattedText formattedText2, c4v c4vVar, CommunicationItem.a aVar, c cVar, C0118a c0118a, b bVar, d dVar, d0 d0Var, boolean z, jsq0 jsq0Var, t0e t0eVar, List list, Map map) {
            this.a = str;
            this.b = str2;
            this.c = formattedText;
            this.d = formattedText2;
            this.e = c4vVar;
            this.f = aVar;
            this.g = cVar;
            this.h = c0118a;
            this.i = bVar;
            this.j = dVar;
            this.k = d0Var;
            this.l = z;
            this.m = jsq0Var;
            this.n = t0eVar;
            this.o = list;
            this.p = map;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a() {
            this("", null, r3, r4, r5, CommunicationItem.a.j, new c(0), null, null, null, null, false, null, new m0e(0), EmptyList.a, null);
            int i = 0;
            FormattedText formattedText = new FormattedText(i);
            FormattedText formattedText2 = new FormattedText(i);
            String str = null;
            c4v c4vVar = new c4v(str, str, 3);
            CommunicationItem.a.Companion.getClass();
        }
    }

    public SummaryPromotionsResponse() {
        this(0);
    }

    public SummaryPromotionsResponse(b bVar) {
        this.a = bVar;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse$g;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/c1", "ru/yandex/taxi/summary/promotions/models/d1", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class g {
        public static final d1 Companion = new d1();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bnv0(15))};
        public final String a;
        public final List b;

        public /* synthetic */ g(int i, String str, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
            }
        }

        /* renamed from: a, reason: from getter */
        public final List getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return jl40.l(this.a, gVar.a) && jl40.l(this.b, gVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return nnm.h("TariffPromos(tariffClass=", this.a, ", ids=", Extension.C_BRAKE, this.b);
        }

        public g() {
            this.a = "";
            this.b = EmptyList.a;
        }
    }

    public /* synthetic */ SummaryPromotionsResponse(int i) {
        this(new b(0));
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse$d;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/n0", "ru/yandex/taxi/summary/promotions/models/o0", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class d {
        public static final o0 Companion = new o0();
        public static final i3y[] c;
        public final List a;
        public final List b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new uiv0(15)), kotlin.a.b(lazyThreadSafetyMode, new uiv0(16))};
        }

        public /* synthetic */ d(List list, List list2, int i) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.a = emptyList;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = emptyList;
            } else {
                this.b = list2;
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
            return jl40.l(this.a, dVar.a) && jl40.l(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return xvz.l("PromoBlock(items=", this.a, ", tariffPromos=", this.b, Extension.C_BRAKE);
        }

        public d(List list, List list2) {
            this.a = list;
            this.b = list2;
        }

        public d() {
            this(0);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ d(int i) {
            this(r1, r1);
            EmptyList emptyList = EmptyList.a;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse$e;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/z0", "ru/yandex/taxi/summary/promotions/models/p0", "ru/yandex/taxi/summary/promotions/models/q0", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class e {
        public static final q0 Companion = new q0();
        public static final i3y[] c;
        public final List a;
        public final List b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new uiv0(17)), kotlin.a.b(lazyThreadSafetyMode, new uiv0(18))};
        }

        public /* synthetic */ e(List list, List list2, int i) {
            int i2 = i & 1;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.a = emptyList;
            } else {
                this.a = list;
            }
            if ((i & 2) == 0) {
                this.b = emptyList;
            } else {
                this.b = list2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return jl40.l(this.a, eVar.a) && jl40.l(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return xvz.l("PromoModalWindows(items=", this.a, ", priorities=", this.b, Extension.C_BRAKE);
        }

        public e(int i) {
            EmptyList emptyList = EmptyList.a;
            this.a = emptyList;
            this.b = emptyList;
        }

        public e() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse$b;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/j0", "ru/yandex/taxi/summary/promotions/models/k0", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {
        public static final k0 Companion = new k0();
        public final d a;
        public final e b;

        public /* synthetic */ b(int i, d dVar, e eVar) {
            this.a = (i & 1) == 0 ? new d(0) : dVar;
            if ((i & 2) == 0) {
                this.b = new e(0);
            } else {
                this.b = eVar;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Offers(promoBlock=" + this.a + ", promoModalWindows=" + this.b + Extension.C_BRAKE;
        }

        public b() {
            this(0);
        }

        public b(d dVar, e eVar) {
            this.a = dVar;
            this.b = eVar;
        }

        public /* synthetic */ b(int i) {
            this(new d(0), new e(0));
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse$f;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/a1", "ru/yandex/taxi/summary/promotions/models/b1", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class f {
        public static final b1 Companion = new b1();
        public static final i3y[] d;
        public final List a;
        public final qos0 b;
        public final List c;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new bnv0(13)), null, kotlin.a.b(lazyThreadSafetyMode, new bnv0(14))};
        }

        public /* synthetic */ f(int i, List list, qos0 qos0Var, List list2) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = qos0Var;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = list2;
            }
        }

        /* renamed from: a, reason: from getter */
        public final List getA() {
            return this.a;
        }

        /* renamed from: b, reason: from getter */
        public final qos0 getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return jl40.l(this.a, fVar.a) && jl40.l(this.b, fVar.b) && jl40.l(this.c, fVar.c);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            qos0 qos0Var = this.b;
            int hashCode2 = (hashCode + (qos0Var == null ? 0 : qos0Var.hashCode())) * 31;
            List list = this.c;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PromotionWidgets(actionButtons=");
            sb.append(this.a);
            sb.append(", slider=");
            sb.append(this.b);
            sb.append(", stickyActionButtons=");
            return ly3.s(sb, this.c, Extension.C_BRAKE);
        }

        public f(int i) {
            this.a = EmptyList.a;
            this.b = null;
            this.c = null;
        }

        public f() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsResponse$c;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/l0", "ru/yandex/taxi/summary/promotions/models/m0", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class c {
        public static final m0 Companion = new m0();
        public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bnv0(7))};
        public final String a;
        public final String b;
        public final List c;

        public /* synthetic */ c(int i, String str, String str2, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.a;
            } else {
                this.c = list;
            }
        }

        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: b, reason: from getter */
        public final List getC() {
            return this.c;
        }

        /* renamed from: c, reason: from getter */
        public final String getA() {
            return this.a;
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
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return ly3.s(b64.v("Priority(tariffClass=", this.a, ", alternativeType=", this.b, ", ids="), this.c, Extension.C_BRAKE);
        }

        public c() {
            this.a = "";
            this.b = null;
            this.c = EmptyList.a;
        }
    }
}
