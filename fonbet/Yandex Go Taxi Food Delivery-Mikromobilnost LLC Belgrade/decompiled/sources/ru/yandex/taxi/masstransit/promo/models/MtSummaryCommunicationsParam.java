package ru.yandex.taxi.masstransit.promo.models;

import defpackage.a540;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.ly3;
import defpackage.nnm;
import defpackage.pf10;
import defpackage.srx;
import defpackage.tse0;
import defpackage.uc4;
import defpackage.unr0;
import defpackage.xvz;
import defpackage.z530;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsParam;", "", "Companion", "a", "CommunicationState", "ru/yandex/taxi/masstransit/promo/models/a", "a540", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MtSummaryCommunicationsParam {
    public static final a540 Companion = new a540();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z530(16)), null};
    public final a a;
    public final jsq0 b;
    public final CommunicationState c;

    public /* synthetic */ MtSummaryCommunicationsParam(int i, a aVar, jsq0 jsq0Var, CommunicationState communicationState) {
        this.a = (i & 1) == 0 ? new a(0) : aVar;
        this.b = (i & 2) == 0 ? ksq0.a : jsq0Var;
        if ((i & 4) == 0) {
            this.c = new CommunicationState(null, null, null, null, null, null, null, null, null, null, null, null, null, 16383);
        } else {
            this.c = communicationState;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MtSummaryCommunicationsParam)) {
            return false;
        }
        MtSummaryCommunicationsParam mtSummaryCommunicationsParam = (MtSummaryCommunicationsParam) obj;
        return jl40.l(this.a, mtSummaryCommunicationsParam.a) && jl40.l(this.b, mtSummaryCommunicationsParam.b) && jl40.l(this.c, mtSummaryCommunicationsParam.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return "MtSummaryCommunicationsParam(clientInfo=" + this.a + ", communicationTypes=" + this.b + ", state=" + this.c + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsParam$CommunicationState;", "", "Companion", "MtScreenType", "b", "a", "c", "ru/yandex/taxi/masstransit/promo/models/f", "ru/yandex/taxi/masstransit/promo/models/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class CommunicationState {
        public static final g Companion = new g();
        public static final i3y[] o;
        public final MtScreenType a;
        public final String b;
        public final Integer c;
        public final uc4 d;
        public final zzs e;
        public final String f;
        public final zzs g;
        public final List h;
        public final String i;
        public final List j;
        public final String k;
        public final srx l;
        public final List m;
        public final b n;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsParam$CommunicationState$MtScreenType;", "", "Companion", "ru/yandex/taxi/masstransit/promo/models/h", "MASSTRANSIT_MAIN", "MASSTRANSIT_SUMMARY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes15.dex */
        public static final class MtScreenType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ MtScreenType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final h Companion;
            public static final MtScreenType MASSTRANSIT_MAIN;
            public static final MtScreenType MASSTRANSIT_SUMMARY;

            static {
                MtScreenType mtScreenType = new MtScreenType("MASSTRANSIT_MAIN", 0);
                MASSTRANSIT_MAIN = mtScreenType;
                MtScreenType mtScreenType2 = new MtScreenType("MASSTRANSIT_SUMMARY", 1);
                MASSTRANSIT_SUMMARY = mtScreenType2;
                MtScreenType[] mtScreenTypeArr = {mtScreenType, mtScreenType2};
                $VALUES = mtScreenTypeArr;
                $ENTRIES = kotlin.enums.a.a(mtScreenTypeArr);
                Companion = new h();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z530(24));
            }

            public static MtScreenType valueOf(String str) {
                return (MtScreenType) Enum.valueOf(MtScreenType.class, str);
            }

            public static MtScreenType[] values() {
                return (MtScreenType[]) $VALUES.clone();
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            o = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new z530(20)), null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new z530(21)), null, kotlin.a.b(lazyThreadSafetyMode, new z530(22)), null, null, kotlin.a.b(lazyThreadSafetyMode, new z530(23)), null};
        }

        public CommunicationState(MtScreenType mtScreenType, String str, Integer num, uc4 uc4Var, zzs zzsVar, String str2, zzs zzsVar2, List list, String str3, List list2, String str4, srx srxVar, b bVar, int i) {
            MtScreenType mtScreenType2 = (i & 1) != 0 ? MtScreenType.MASSTRANSIT_SUMMARY : mtScreenType;
            String str5 = (i & 2) != 0 ? null : str;
            Integer num2 = (i & 4) != 0 ? null : num;
            uc4 uc4Var2 = (i & 8) != 0 ? null : uc4Var;
            zzs zzsVar3 = (i & 16) != 0 ? null : zzsVar;
            String str6 = (i & 32) != 0 ? null : str2;
            zzs zzsVar4 = (i & 64) != 0 ? null : zzsVar2;
            List list3 = (i & 128) != 0 ? null : list;
            String str7 = (i & 256) != 0 ? null : str3;
            int i2 = i & 512;
            EmptyList emptyList = EmptyList.a;
            List list4 = i2 != 0 ? emptyList : list2;
            String str8 = (i & 1024) != 0 ? null : str4;
            srx srxVar2 = (i & 2048) != 0 ? new srx(null, null) : srxVar;
            b bVar2 = (i & 8192) == 0 ? bVar : null;
            this.a = mtScreenType2;
            this.b = str5;
            this.c = num2;
            this.d = uc4Var2;
            this.e = zzsVar3;
            this.f = str6;
            this.g = zzsVar4;
            this.h = list3;
            this.i = str7;
            this.j = list4;
            this.k = str8;
            this.l = srxVar2;
            this.m = emptyList;
            this.n = bVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommunicationState)) {
                return false;
            }
            CommunicationState communicationState = (CommunicationState) obj;
            return this.a == communicationState.a && jl40.l(this.b, communicationState.b) && jl40.l(this.c, communicationState.c) && jl40.l(this.d, communicationState.d) && jl40.l(this.e, communicationState.e) && jl40.l(this.f, communicationState.f) && jl40.l(this.g, communicationState.g) && jl40.l(this.h, communicationState.h) && jl40.l(this.i, communicationState.i) && jl40.l(this.j, communicationState.j) && jl40.l(this.k, communicationState.k) && jl40.l(this.l, communicationState.l) && jl40.l(this.m, communicationState.m) && jl40.l(this.n, communicationState.n);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            uc4 uc4Var = this.d;
            int hashCode4 = (hashCode3 + (uc4Var == null ? 0 : uc4Var.hashCode())) * 31;
            zzs zzsVar = this.e;
            int hashCode5 = (hashCode4 + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31;
            String str2 = this.f;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            zzs zzsVar2 = this.g;
            int hashCode7 = (hashCode6 + (zzsVar2 == null ? 0 : zzsVar2.hashCode())) * 31;
            List list = this.h;
            int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            String str3 = this.i;
            int c2 = unr0.c((hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.j);
            String str4 = this.k;
            int c3 = unr0.c((this.l.hashCode() + ((c2 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.m);
            b bVar = this.n;
            return c3 + (bVar != null ? bVar.a.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CommunicationState(screenType=");
            sb.append(this.a);
            sb.append(", appearanceMode=");
            sb.append(this.b);
            sb.append(", accuracy=");
            sb.append(this.c);
            sb.append(", bbox=");
            sb.append(this.d);
            sb.append(", location=");
            sb.append(this.e);
            sb.append(", updateTime=");
            sb.append(this.f);
            sb.append(", pointAPosition=");
            sb.append(this.g);
            sb.append(", fields=");
            sb.append(this.h);
            sb.append(", selectedClass=");
            tse0.x(this.i, ", knownOrders=", ", zoneName=", sb, this.j);
            sb.append(this.k);
            sb.append(", l10N=");
            sb.append(this.l);
            sb.append(", shownObjectsOverMap=");
            sb.append(this.m);
            sb.append(", routeSelector=");
            sb.append(this.n);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsParam$CommunicationState$b;", "", "Companion", "ru/yandex/taxi/masstransit/promo/models/k", "ru/yandex/taxi/masstransit/promo/models/l", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class b {
            public static final l Companion = new l();
            public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z530(26))};
            public final List a;

            public /* synthetic */ b(int i, List list) {
                if ((i & 1) == 0) {
                    this.a = EmptyList.a;
                } else {
                    this.a = list;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && jl40.l(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tse0.k("RouteSelector(routes=", Extension.C_BRAKE, this.a);
            }

            public b(List list) {
                this.a = list;
            }

            public b() {
                this(EmptyList.a);
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsParam$CommunicationState$a;", "", "Companion", "ru/yandex/taxi/masstransit/promo/models/i", "ru/yandex/taxi/masstransit/promo/models/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class a {
            public static final j Companion = new j();
            public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z530(25))};
            public final String a;
            public final List b;

            public /* synthetic */ a(int i, String str, List list) {
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
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
            }

            public final int hashCode() {
                String str = this.a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return nnm.h("Route(id=", this.a, ", vehicles=", Extension.C_BRAKE, this.b);
            }

            public a(String str, List list) {
                this.a = str;
                this.b = list;
            }

            public a() {
                this("", EmptyList.a);
            }
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsParam$CommunicationState$c;", "", "Companion", "ru/yandex/taxi/masstransit/promo/models/m", "ru/yandex/taxi/masstransit/promo/models/n", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class c {
            public static final n Companion = new n();
            public final String a;
            public final String b;
            public final String c;
            public final String d;

            public /* synthetic */ c(int i, String str, String str2, String str3, String str4) {
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
                    this.d = str4;
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
                return jl40.l(this.a, cVar.a) && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c) && jl40.l(this.d, cVar.d);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.d;
                return hashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                return g8e.r(b64.v("Vehicle(type=", this.a, ", startingStopId=", this.b, ", destinationStopId="), this.c, ", lineId=", this.d, Extension.C_BRAKE);
            }

            public c(String str, String str2, String str3, String str4) {
                this.a = str;
                this.b = str2;
                this.c = str3;
                this.d = str4;
            }

            public c() {
                this("", null, null, null);
            }
        }

        public /* synthetic */ CommunicationState(int i, MtScreenType mtScreenType, String str, Integer num, uc4 uc4Var, zzs zzsVar, String str2, zzs zzsVar2, List list, String str3, List list2, String str4, srx srxVar, List list3, b bVar) {
            this.a = (i & 1) == 0 ? MtScreenType.MASSTRANSIT_SUMMARY : mtScreenType;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = uc4Var;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = zzsVar;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str2;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = zzsVar2;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = list;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = str3;
            }
            int i2 = i & 512;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.j = emptyList;
            } else {
                this.j = list2;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = str4;
            }
            if ((i & 2048) == 0) {
                this.l = new srx(null, null);
            } else {
                this.l = srxVar;
            }
            if ((i & 4096) == 0) {
                this.m = emptyList;
            } else {
                this.m = list3;
            }
            if ((i & 8192) == 0) {
                this.n = null;
            } else {
                this.n = bVar;
            }
        }

        public CommunicationState() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, 16383);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsParam$a;", "", "Companion", "a", "ru/yandex/taxi/masstransit/promo/models/b", "ru/yandex/taxi/masstransit/promo/models/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class a {
        public static final c Companion = new c();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z530(17)), null};
        public final List a;
        public final pf10 b;

        public /* synthetic */ a(int i, List list, pf10 pf10Var) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = new pf10(0);
            } else {
                this.b = pf10Var;
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
            return "ClientInfo(supportedFeatures=" + this.a + ", mediaSizeInfo=" + this.b + Extension.C_BRAKE;
        }

        public a() {
            this(0);
        }

        public a(List list, pf10 pf10Var) {
            this.a = list;
            this.b = pf10Var;
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/promo/models/MtSummaryCommunicationsParam$a$a;", "", "Companion", "ru/yandex/taxi/masstransit/promo/models/d", "ru/yandex/taxi/masstransit/promo/models/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        /* renamed from: ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0106a {
            public static final e Companion = new e();
            public static final i3y[] d;
            public final List a;
            public final String b;
            public final List c;

            static {
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                d = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new z530(18)), null, kotlin.a.b(lazyThreadSafetyMode, new z530(19))};
            }

            public /* synthetic */ C0106a(int i, String str, List list, List list2) {
                int i2 = i & 1;
                EmptyList emptyList = EmptyList.a;
                if (i2 == 0) {
                    this.a = emptyList;
                } else {
                    this.a = list;
                }
                this.b = (i & 2) == 0 ? "" : str;
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
                if (!(obj instanceof C0106a)) {
                    return false;
                }
                C0106a c0106a = (C0106a) obj;
                return jl40.l(this.a, c0106a.a) && jl40.l(this.b, c0106a.b) && jl40.l(this.c, c0106a.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return ly3.s(xvz.s("SupportedFeature(promoActions=", this.a, ", type=", this.b, ", widgets="), this.c, Extension.C_BRAKE);
            }

            public C0106a(List list, String str, List list2) {
                this.a = list;
                this.b = str;
                this.c = list2;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public C0106a() {
                this(r0, "", r0);
                EmptyList emptyList = EmptyList.a;
            }
        }

        public /* synthetic */ a(int i) {
            this(EmptyList.a, new pf10(0));
        }
    }

    public MtSummaryCommunicationsParam(a aVar, jsq0 jsq0Var, CommunicationState communicationState) {
        this.a = aVar;
        this.b = jsq0Var;
        this.c = communicationState;
    }

    public MtSummaryCommunicationsParam() {
        this(new a(0), ksq0.a, new CommunicationState(null, null, null, null, null, null, null, null, null, null, null, null, null, 16383));
    }
}
