package ru.yandex.taxi.summary.promotions.models;

import com.yandex.go.analytics.AccountType;
import defpackage.b64;
import defpackage.bnv0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.ly3;
import defpackage.pf10;
import defpackage.qv10;
import defpackage.rfa0;
import defpackage.uiv0;
import defpackage.unr0;
import defpackage.w03;
import defpackage.w0v0;
import defpackage.xvz;
import defpackage.zmv0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsParam;", "", "Companion", "zmv0", "c", "ru/yandex/taxi/summary/promotions/models/i", "Type", "ymv0", "b", "a", "ru/yandex/taxi/summary/promotions/models/c", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SummaryPromotionsParam {
    public static final zmv0 Companion = new zmv0();
    public static final SummaryPromotionsParam k = new SummaryPromotionsParam(0);
    public final c a;
    public final w03 b;
    public final a c;
    public final pf10 d;
    public final rfa0 e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;
    public final String j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsParam$Type;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/n", "MAAS", "UNKNOWN", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final n Companion;
        public static final Type MAAS;
        public static final Type UNKNOWN;

        static {
            Type type = new Type("MAAS", 0);
            MAAS = type;
            Type type2 = new Type("UNKNOWN", 1);
            UNKNOWN = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
            Companion = new n();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new bnv0(1));
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ SummaryPromotionsParam(int i, c cVar, w03 w03Var, a aVar, pf10 pf10Var, rfa0 rfa0Var, String str, String str2, String str3, Integer num, String str4) {
        int i2 = 0;
        this.a = (i & 1) == 0 ? new c(i2) : cVar;
        if ((i & 2) == 0) {
            this.b = new w03(i2);
        } else {
            this.b = w03Var;
        }
        if ((i & 4) == 0) {
            this.c = new a(i2);
        } else {
            this.c = aVar;
        }
        if ((i & 8) == 0) {
            this.d = new pf10(i2);
        } else {
            this.d = pf10Var;
        }
        if ((i & 16) == 0) {
            this.e = new rfa0(PaymentMethod$Type.CASH, (String) null, (String) null, (Boolean) null, (List) null, 30);
        } else {
            this.e = rfa0Var;
        }
        if ((i & 32) == 0) {
            this.f = AccountType.None.getEventValue();
        } else {
            this.f = str;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = num;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryPromotionsParam)) {
            return false;
        }
        SummaryPromotionsParam summaryPromotionsParam = (SummaryPromotionsParam) obj;
        return jl40.l(this.a, summaryPromotionsParam.a) && jl40.l(this.b, summaryPromotionsParam.b) && jl40.l(this.c, summaryPromotionsParam.c) && jl40.l(this.d, summaryPromotionsParam.d) && jl40.l(this.e, summaryPromotionsParam.e) && jl40.l(this.f, summaryPromotionsParam.f) && jl40.l(this.g, summaryPromotionsParam.g) && jl40.l(this.h, summaryPromotionsParam.h) && jl40.l(this.i, summaryPromotionsParam.i) && jl40.l(this.j, summaryPromotionsParam.j);
    }

    public final int hashCode() {
        int b2 = unr0.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f);
        String str = this.g;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.i;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.j;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SummaryPromotionsParam(summaryState=");
        sb.append(this.a);
        sb.append(", applicationState=");
        sb.append(this.b);
        sb.append(", clientInfo=");
        sb.append(this.c);
        sb.append(", mediaSizeInfo=");
        sb.append(this.d);
        sb.append(", payment=");
        sb.append(this.e);
        sb.append(", accountType=");
        sb.append(this.f);
        sb.append(", ultimaMode=");
        g8e.D(sb, this.g, ", chooseUltimaAppearanceMode=", this.h, ", userPowerPrc=");
        sb.append(this.i);
        sb.append(", userPluggedState=");
        sb.append(this.j);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsParam$b;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/j", "ru/yandex/taxi/summary/promotions/models/k", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {
        public static final k Companion = new k();
        public final String a;
        public final Boolean b;

        public /* synthetic */ b(int i, String str, Boolean bool) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool;
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
            Boolean bool = this.b;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return "SkippedPromoModalWindow(id=" + this.a + ", skipped=" + this.b + Extension.C_BRAKE;
        }

        public b(String str, Boolean bool) {
            this.a = str;
            this.b = bool;
        }

        public b() {
            this("", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsParam$a;", "", "Companion", "a", "ru/yandex/taxi/summary/promotions/models/d", "ru/yandex/taxi/summary/promotions/models/e", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class a {
        public static final e Companion = new e();
        public static final i3y[] e;
        public final List a;
        public final List b;
        public final float c;
        public final float d;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new w0v0(24)), kotlin.a.b(lazyThreadSafetyMode, new w0v0(25)), null, null};
        }

        public /* synthetic */ a(int i, List list, List list2, float f, float f2) {
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
            if ((i & 4) == 0) {
                this.c = 0.0f;
            } else {
                this.c = f;
            }
            if ((i & 8) == 0) {
                this.d = 0.0f;
            } else {
                this.d = f2;
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
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && Float.compare(this.c, aVar.c) == 0 && Float.compare(this.d, aVar.d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.d) + g8e.c(this.c, unr0.c(this.a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            return ly3.q(qv10.v("ClientInfo(supportedConfigurations=", this.a, ", supportedFeatures=", this.b, ", mdashWidth="), this.c, ", ndashWidth=", this.d, Extension.C_BRAKE);
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsParam$a$a;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/f", "ru/yandex/taxi/summary/promotions/models/g", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
        /* renamed from: ru.yandex.taxi.summary.promotions.models.SummaryPromotionsParam$a$a, reason: collision with other inner class name */
        /* loaded from: classes10.dex */
        public static final /* data */ class C0117a {
            public static final g Companion = new g();
            public static final i3y[] d;
            public final String a;
            public final List b;
            public final List c;

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                d = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new uiv0(12)), kotlin.a.b(lazyThreadSafetyMode, new uiv0(13))};
            }

            public /* synthetic */ C0117a(int i, String str, List list, List list2) {
                this.a = (i & 1) == 0 ? "" : str;
                int i2 = i & 2;
                EmptyList emptyList = EmptyList.a;
                if (i2 == 0) {
                    this.b = emptyList;
                } else {
                    this.b = list;
                }
                if ((i & 4) == 0) {
                    this.c = emptyList;
                } else {
                    this.c = list2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0117a)) {
                    return false;
                }
                C0117a c0117a = (C0117a) obj;
                return jl40.l(this.a, c0117a.a) && jl40.l(this.b, c0117a.b) && jl40.l(this.c, c0117a.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return ly3.s(xvz.r("SupportedFeature(type=", this.a, ", widgets=", this.b, ", promoActions="), this.c, Extension.C_BRAKE);
            }

            public C0117a(String str, List list, List list2) {
                this.a = str;
                this.b = list;
                this.c = list2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public C0117a() {
                this("", r0, r0);
                EmptyList emptyList = EmptyList.a;
            }
        }

        public a() {
            this(0);
        }

        public a(List list, List list2, float f, float f2) {
            this.a = list;
            this.b = list2;
            this.c = f;
            this.d = f2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ a(int i) {
            this(r2, r2, 0.0f, 0.0f);
            EmptyList emptyList = EmptyList.a;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/summary/promotions/models/SummaryPromotionsParam$c;", "", "Companion", "ru/yandex/taxi/summary/promotions/models/l", "ru/yandex/taxi/summary/promotions/models/m", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class c {
        public static final m Companion = new m();
        public static final i3y[] f;
        public final List a;
        public final List b;
        public final kotlinx.serialization.json.b c;
        public final Set d;
        public final Map e;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            f = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new w0v0(27)), kotlin.a.b(lazyThreadSafetyMode, new w0v0(28)), null, kotlin.a.b(lazyThreadSafetyMode, new w0v0(29)), kotlin.a.b(lazyThreadSafetyMode, new bnv0(0))};
        }

        public /* synthetic */ c(int i, List list, List list2, kotlinx.serialization.json.b bVar, Set set, Map map) {
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
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = bVar;
            }
            if ((i & 8) == 0) {
                this.d = EmptySet.a;
            } else {
                this.d = set;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = map;
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
            return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c) && jl40.l(this.d, cVar.d) && jl40.l(this.e, cVar.e);
        }

        public final int hashCode() {
            int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
            kotlinx.serialization.json.b bVar = this.c;
            int e = g8e.e(this.d, (c + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
            Map map = this.e;
            return e + (map != null ? map.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder v = qv10.v("SummaryState(tariffClasses=", this.a, ", modes=", this.b, ", promoContext=");
            v.append(this.c);
            v.append(", alternativeOffers=");
            v.append(this.d);
            v.append(", promoModalWindowsDisplayInfo=");
            return b64.r(v, this.e, Extension.C_BRAKE);
        }

        public c() {
            this(0);
        }

        public c(List list, List list2, kotlinx.serialization.json.b bVar, Set set, Map map) {
            this.a = list;
            this.b = list2;
            this.c = bVar;
            this.d = set;
            this.e = map;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ c(int i) {
            this(r1, r1, null, EmptySet.a, null);
            EmptyList emptyList = EmptyList.a;
        }
    }

    public SummaryPromotionsParam() {
        this(0);
    }

    public SummaryPromotionsParam(c cVar, w03 w03Var, a aVar, pf10 pf10Var, rfa0 rfa0Var, String str, String str2, String str3, Integer num, String str4) {
        this.a = cVar;
        this.b = w03Var;
        this.c = aVar;
        this.d = pf10Var;
        this.e = rfa0Var;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = num;
        this.j = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ SummaryPromotionsParam(int i) {
        this(new c(r13), new w03(r13), new a(r13), new pf10(r13), new rfa0(PaymentMethod$Type.CASH, (String) null, (String) null, (Boolean) null, (List) null, 30), AccountType.None.getEventValue(), null, null, null, null);
        int i2 = 0;
    }
}
