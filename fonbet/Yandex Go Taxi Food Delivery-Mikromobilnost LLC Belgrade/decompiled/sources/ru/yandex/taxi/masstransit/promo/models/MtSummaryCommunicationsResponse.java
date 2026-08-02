package ru.yandex.taxi.masstransit.promo.models;

import defpackage.b64;
import defpackage.c4v;
import defpackage.c540;
import defpackage.d540;
import defpackage.e540;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.nnm;
import defpackage.oyr;
import defpackage.um20;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.z530;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsResponse;", "", "Companion", "c540", "b", "c", "d", "a", "OfferAvailability", "ru/yandex/taxi/masstransit/promo/models/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class MtSummaryCommunicationsResponse {
    public static final c540 Companion = new c540();
    public static final MtSummaryCommunicationsResponse b = new MtSummaryCommunicationsResponse(0);
    public final b a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsResponse$OfferAvailability;", "", "Companion", "ru/yandex/taxi/masstransit/promo/models/t", "ALL", "ORIGINAL", "ALTERNATIVE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes6.dex */
    public static final class OfferAvailability {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ OfferAvailability[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final OfferAvailability ALL;
        public static final OfferAvailability ALTERNATIVE;
        public static final t Companion;
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
            Companion = new t();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z530(29));
        }

        public static OfferAvailability valueOf(String str) {
            return (OfferAvailability) Enum.valueOf(OfferAvailability.class, str);
        }

        public static OfferAvailability[] values() {
            return (OfferAvailability[]) $VALUES.clone();
        }
    }

    public /* synthetic */ MtSummaryCommunicationsResponse(int i, b bVar) {
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
        return (obj instanceof MtSummaryCommunicationsResponse) && jl40.l(this.a, ((MtSummaryCommunicationsResponse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MtSummaryCommunicationsResponse(offers=" + this.a + Extension.C_BRAKE;
    }

    public MtSummaryCommunicationsResponse() {
        this(0);
    }

    public MtSummaryCommunicationsResponse(int i) {
        this.a = new b(0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsResponse$b;", "", "Companion", "a", "ru/yandex/taxi/masstransit/promo/models/u", "ru/yandex/taxi/masstransit/promo/models/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class b {
        public static final v Companion = new v();
        public final c a;
        public final a b;

        public /* synthetic */ b(int i, c cVar, a aVar) {
            this.a = (i & 1) == 0 ? new c(0) : cVar;
            if ((i & 2) == 0) {
                this.b = new a(0);
            } else {
                this.b = aVar;
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
            return "Offers(promoBlock=" + this.a + ", objectsOverMap=" + this.b + Extension.C_BRAKE;
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsResponse$b$a;", "", "Companion", "ru/yandex/taxi/masstransit/promo/models/w", "ru/yandex/taxi/masstransit/promo/models/x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class a {
            public static final x Companion = new x();
            public static final i3y[] c;
            public final List a;
            public final List b;

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new um20(28)), kotlin.a.b(lazyThreadSafetyMode, new um20(29))};
            }

            public /* synthetic */ a(List list, List list2, int i) {
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
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return xvz.l("ObjectsOverMap(objectsItems=", this.a, ", priority=", this.b, Extension.C_BRAKE);
            }

            public a(int i) {
                EmptyList emptyList = EmptyList.a;
                this.a = emptyList;
                this.b = emptyList;
            }

            public a() {
                this(0);
            }
        }

        public b() {
            this(0);
        }

        public b(int i) {
            c cVar = new c(0);
            a aVar = new a(0);
            this.a = cVar;
            this.b = aVar;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsResponse$d;", "", "Companion", "ru/yandex/taxi/masstransit/promo/models/a0", "ru/yandex/taxi/masstransit/promo/models/b0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class d {
        public static final b0 Companion = new b0();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new e540(0))};
        public final String a;
        public final List b;

        public /* synthetic */ d(int i, String str, List list) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.a;
            } else {
                this.b = list;
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
            return nnm.h("PromoBlockPriority(routeId=", this.a, ", promoBlocksOrder=", Extension.C_BRAKE, this.b);
        }

        public d() {
            this.a = "";
            this.b = EmptyList.a;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsResponse$c;", "", "Companion", "ru/yandex/taxi/masstransit/promo/models/y", "ru/yandex/taxi/masstransit/promo/models/z", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class c {
        public static final z Companion = new z();
        public static final i3y[] c;
        public final List a;
        public final List b;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new d540(0)), kotlin.a.b(lazyThreadSafetyMode, new d540(1))};
        }

        public /* synthetic */ c(List list, List list2, int i) {
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
            return xvz.l("PromoBlock(items=", this.a, ", priority=", this.b, Extension.C_BRAKE);
        }

        public c(int i) {
            EmptyList emptyList = EmptyList.a;
            this.a = emptyList;
            this.b = emptyList;
        }

        public c() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsResponse$a;", "", "Companion", "a", "ru/yandex/taxi/masstransit/promo/models/p", "ru/yandex/taxi/masstransit/promo/models/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes6.dex */
    public static final /* data */ class a {
        public static final q Companion = new q();
        public static final i3y[] i = {null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z530(27))};
        public final String a;
        public final String b;
        public final FormattedText c;
        public final FormattedText d;
        public final c4v e;
        public final CommunicationItem.a f;
        public final C0107a g;
        public final Map h;

        public a(int i2, String str, String str2, FormattedText formattedText, FormattedText formattedText2, c4v c4vVar, CommunicationItem.a aVar, C0107a c0107a, Map map) {
            this.a = (i2 & 1) == 0 ? "" : str;
            String str3 = null;
            if ((i2 & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
            int i3 = 0;
            if ((i2 & 4) == 0) {
                this.c = new FormattedText(i3);
            } else {
                this.c = formattedText;
            }
            if ((i2 & 8) == 0) {
                this.d = new FormattedText(i3);
            } else {
                this.d = formattedText2;
            }
            if ((i2 & 16) == 0) {
                this.e = new c4v(str3, str3, 3);
            } else {
                this.e = c4vVar;
            }
            if ((i2 & 32) == 0) {
                CommunicationItem.a.Companion.getClass();
                this.f = CommunicationItem.a.j;
            } else {
                this.f = aVar;
            }
            if ((i2 & 64) == 0) {
                this.g = new C0107a(0);
            } else {
                this.g = c0107a;
            }
            if ((i2 & 128) == 0) {
                this.h = null;
            } else {
                this.h = map;
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
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && jl40.l(this.d, aVar.d) && jl40.l(this.e, aVar.e) && jl40.l(this.f, aVar.f) && jl40.l(this.g, aVar.g) && jl40.l(this.h, aVar.h);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.c(unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.a), 31, this.d.a)) * 31)) * 31)) * 31;
            Map map = this.h;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = b64.v("Item(id=", this.a, ", metaType=", this.b, ", title=");
            defpackage.n.C(v, this.c, ", text=", this.d, ", icon=");
            v.append(this.e);
            v.append(", widgets=");
            v.append(this.f);
            v.append(", showPolicy=");
            v.append(this.g);
            v.append(", analyticsPayload=");
            v.append(this.h);
            v.append(Extension.C_BRAKE);
            return v.toString();
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsResponse$a$a;", "", "Companion", "ru/yandex/taxi/masstransit/promo/models/r", "ru/yandex/taxi/masstransit/promo/models/s", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        /* renamed from: ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0107a {
            public static final s Companion = new s();
            public static final i3y[] d = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z530(28))};
            public final int a;
            public final int b;
            public final OfferAvailability c;

            public /* synthetic */ C0107a(int i, int i2, int i3, OfferAvailability offerAvailability) {
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

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0107a)) {
                    return false;
                }
                C0107a c0107a = (C0107a) obj;
                return this.a == c0107a.a && this.b == c0107a.b && this.c == c0107a.c;
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

            public C0107a() {
                this(0);
            }

            public C0107a(int i) {
                OfferAvailability offerAvailability = OfferAvailability.ORIGINAL;
                this.a = Integer.MAX_VALUE;
                this.b = Integer.MAX_VALUE;
                this.c = offerAvailability;
            }
        }

        public a() {
            int i2 = 0;
            FormattedText formattedText = new FormattedText(i2);
            FormattedText formattedText2 = new FormattedText(i2);
            String str = null;
            c4v c4vVar = new c4v(str, str, 3);
            CommunicationItem.a.Companion.getClass();
            CommunicationItem.a aVar = CommunicationItem.a.j;
            C0107a c0107a = new C0107a(0);
            this.a = "";
            this.b = null;
            this.c = formattedText;
            this.d = formattedText2;
            this.e = c4vVar;
            this.f = aVar;
            this.g = c0107a;
            this.h = null;
        }
    }
}
