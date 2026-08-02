package ru.yandex.taxi.communications.api.dto;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.iqx;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kt4;
import defpackage.oo31;
import defpackage.q03;
import defpackage.tt4;
import defpackage.unr0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u000f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/communications/api/dto/BannerWidgets;", "", "Companion", "b", "OnCloseEffect", "f", "e", "g", "d", "h", "a", "vt4", "ActionType", "c", "NamedActionType", "fu4", "kt4", "ru/yandex/taxi/communications/api/dto/a", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class BannerWidgets {
    public static final kt4 Companion = new kt4();
    public static final i3y[] i = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new q03(14)), null, null, null, null, null};
    public static final BannerWidgets j = new BannerWidgets(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255);
    public final e a;
    public final e b;
    public List c;
    public final iqx d;
    public final f e;
    public final d f;
    public final h g;
    public final g h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/communications/api/dto/BannerWidgets$ActionType;", "", "", "analyticsName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "ru/yandex/taxi/communications/api/dto/h", "DEEPLINK", "WEB_VIEW", "CLIPBOARD_COPY", "NAMED", "SAVE_BENEFIT", "DEACTIVATE_PROMO", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ActionType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ActionType CLIPBOARD_COPY;
        public static final ru.yandex.taxi.communications.api.dto.h Companion;
        public static final ActionType DEACTIVATE_PROMO;
        public static final ActionType DEEPLINK;
        public static final ActionType NAMED;
        public static final ActionType SAVE_BENEFIT;
        public static final ActionType WEB_VIEW;
        private final String analyticsName;

        static {
            ActionType actionType = new ActionType("DEEPLINK", 0, "DEEPLINK");
            DEEPLINK = actionType;
            ActionType actionType2 = new ActionType("WEB_VIEW", 1, "WEB_VIEW");
            WEB_VIEW = actionType2;
            ActionType actionType3 = new ActionType("CLIPBOARD_COPY", 2, "CLIPBOARD_COPY");
            CLIPBOARD_COPY = actionType3;
            ActionType actionType4 = new ActionType("NAMED", 3, "NAMED");
            NAMED = actionType4;
            ActionType actionType5 = new ActionType("SAVE_BENEFIT", 4, "SAVE_BENEFIT");
            SAVE_BENEFIT = actionType5;
            ActionType actionType6 = new ActionType("DEACTIVATE_PROMO", 5, "DEACTIVATE_PROMO");
            DEACTIVATE_PROMO = actionType6;
            ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5, actionType6};
            $VALUES = actionTypeArr;
            $ENTRIES = kotlin.enums.a.a(actionTypeArr);
            Companion = new ru.yandex.taxi.communications.api.dto.h();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new q03(20));
        }

        public ActionType(String str, int i, String str2) {
            this.analyticsName = str2;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }

        /* renamed from: b, reason: from getter */
        public final String getAnalyticsName() {
            return this.analyticsName;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/communications/api/dto/BannerWidgets$NamedActionType;", "", "Companion", "ru/yandex/taxi/communications/api/dto/o", "SCOOTERS_USE", "TAXI_USE", "EMPTY", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class NamedActionType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ NamedActionType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final o Companion;
        public static final NamedActionType EMPTY;
        public static final NamedActionType SCOOTERS_USE;
        public static final NamedActionType TAXI_USE;

        static {
            NamedActionType namedActionType = new NamedActionType("SCOOTERS_USE", 0);
            SCOOTERS_USE = namedActionType;
            NamedActionType namedActionType2 = new NamedActionType("TAXI_USE", 1);
            TAXI_USE = namedActionType2;
            NamedActionType namedActionType3 = new NamedActionType("EMPTY", 2);
            EMPTY = namedActionType3;
            NamedActionType[] namedActionTypeArr = {namedActionType, namedActionType2, namedActionType3};
            $VALUES = namedActionTypeArr;
            $ENTRIES = kotlin.enums.a.a(namedActionTypeArr);
            Companion = new o();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new q03(21));
        }

        public static NamedActionType valueOf(String str) {
            return (NamedActionType) Enum.valueOf(NamedActionType.class, str);
        }

        public static NamedActionType[] values() {
            return (NamedActionType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ BannerWidgets(int i2, e eVar, e eVar2, List list, iqx iqxVar, f fVar, d dVar, h hVar, g gVar) {
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = eVar;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = eVar2;
        }
        if ((i2 & 4) == 0) {
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = iqxVar;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = fVar;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = dVar;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = hVar;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = gVar;
        }
    }

    public final int a() {
        List list = this.c;
        return this.e == null ? list.size() : list.size() + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerWidgets)) {
            return false;
        }
        BannerWidgets bannerWidgets = (BannerWidgets) obj;
        return jl40.l(this.a, bannerWidgets.a) && jl40.l(this.b, bannerWidgets.b) && jl40.l(this.c, bannerWidgets.c) && jl40.l(this.d, bannerWidgets.d) && jl40.l(this.e, bannerWidgets.e) && jl40.l(this.f, bannerWidgets.f) && jl40.l(this.g, bannerWidgets.g) && jl40.l(this.h, bannerWidgets.h);
    }

    public final int hashCode() {
        e eVar = this.a;
        int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        e eVar2 = this.b;
        int c2 = unr0.c((hashCode + (eVar2 == null ? 0 : eVar2.hashCode())) * 31, 31, this.c);
        iqx iqxVar = this.d;
        int hashCode2 = (c2 + (iqxVar == null ? 0 : iqxVar.hashCode())) * 31;
        f fVar = this.e;
        int hashCode3 = (hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        d dVar = this.f;
        int hashCode4 = (hashCode3 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        h hVar = this.g;
        int hashCode5 = (hashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        g gVar = this.h;
        return hashCode5 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "BannerWidgets(closeButton=" + this.a + ", menuButton=" + this.b + ", actionButtons=" + this.c + ", label=" + this.d + ", link=" + this.e + ", arrowButton=" + this.f + ", switchButton=" + this.g + ", pager=" + this.h + Extension.C_BRAKE;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/BannerWidgets$e;", "", "Companion", "ru/yandex/taxi/communications/api/dto/k", "ru/yandex/taxi/communications/api/dto/l", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class e {
        public static final l Companion = new l();
        public final String a;

        public /* synthetic */ e(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public e(String str) {
            this.a = str;
        }

        public e() {
            this("");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/communications/api/dto/BannerWidgets$OnCloseEffect;", "", "Companion", "Type", "ru/yandex/taxi/communications/api/dto/p", "ru/yandex/taxi/communications/api/dto/q", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final /* data */ class OnCloseEffect {
        public static final q Companion = new q();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tt4(2))};
        public final long a;
        public final Type b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/BannerWidgets$OnCloseEffect$Type;", "", "Companion", "ru/yandex/taxi/communications/api/dto/r", "RUN_COUPONS_LIST_BEFORE_ROUTESTATS", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        /* loaded from: classes5.dex */
        public static final class Type {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final r Companion;
            public static final Type RUN_COUPONS_LIST_BEFORE_ROUTESTATS;

            static {
                Type type = new Type("RUN_COUPONS_LIST_BEFORE_ROUTESTATS", 0);
                RUN_COUPONS_LIST_BEFORE_ROUTESTATS = type;
                Type[] typeArr = {type};
                $VALUES = typeArr;
                $ENTRIES = kotlin.enums.a.a(typeArr);
                Companion = new r();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tt4(3));
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public /* synthetic */ OnCloseEffect(int i, long j, Type type) {
            this.a = (i & 1) == 0 ? 0L : j;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = type;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCloseEffect)) {
                return false;
            }
            OnCloseEffect onCloseEffect = (OnCloseEffect) obj;
            return this.a == onCloseEffect.a && this.b == onCloseEffect.b;
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.a) * 31;
            Type type = this.b;
            return hashCode + (type == null ? 0 : type.hashCode());
        }

        public final String toString() {
            return "OnCloseEffect(delayMs=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
        }

        public OnCloseEffect() {
            this.a = 0L;
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/BannerWidgets$a;", "", "Companion", "ru/yandex/taxi/communications/api/dto/b", "ru/yandex/taxi/communications/api/dto/c", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final ru.yandex.taxi.communications.api.dto.c Companion = new ru.yandex.taxi.communications.api.dto.c();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new q03(15)), null};
        public final ActionType a;
        public final c b;

        public /* synthetic */ a(int i, ActionType actionType, c cVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = actionType;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = cVar;
            }
        }

        public a(ActionType actionType, c cVar) {
            this.a = actionType;
            this.b = cVar;
        }

        public a() {
            this(null, null);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/BannerWidgets$g;", "", "Companion", "ru/yandex/taxi/communications/api/dto/s", "ru/yandex/taxi/communications/api/dto/t", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class g {
        public static final t Companion = new t();
        public final String a;
        public final String b;

        public /* synthetic */ g(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public g() {
            this.a = null;
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/BannerWidgets$h;", "", "Companion", "ru/yandex/taxi/communications/api/dto/u", "ru/yandex/taxi/communications/api/dto/v", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class h {
        public static final v Companion = new v();
        public final String a;
        public final String b;

        public /* synthetic */ h(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        public h() {
            this.a = null;
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/BannerWidgets$d;", "", "Companion", "ru/yandex/taxi/communications/api/dto/i", "ru/yandex/taxi/communications/api/dto/j", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class d {
        public static final j Companion = new j();
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ d(int i, String str, String str2, String str3) {
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
                this.c = null;
            } else {
                this.c = str3;
            }
        }

        public d() {
            this.a = "";
            this.b = "";
            this.c = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/BannerWidgets$f;", "", "Companion", "ru/yandex/taxi/communications/api/dto/m", "ru/yandex/taxi/communications/api/dto/n", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class f {
        public static final n Companion = new n();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public /* synthetic */ f(int i, String str, String str2, String str3, String str4) {
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

        public f() {
            this.a = "";
            this.b = null;
            this.c = null;
            this.d = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BannerWidgets() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255);
    }

    public BannerWidgets(e eVar, e eVar2, List list, iqx iqxVar, f fVar, d dVar, h hVar, g gVar) {
        this.a = eVar;
        this.b = eVar2;
        this.c = list;
        this.d = iqxVar;
        this.e = fVar;
        this.f = dVar;
        this.g = hVar;
        this.h = gVar;
    }

    public /* synthetic */ BannerWidgets(e eVar, e eVar2, List list, int i2) {
        this((i2 & 1) != 0 ? null : eVar, (i2 & 2) != 0 ? null : eVar2, (i2 & 4) != 0 ? EmptyList.a : list, null, null, null, null, null);
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/BannerWidgets$c;", "", "Companion", "ru/yandex/taxi/communications/api/dto/f", "ru/yandex/taxi/communications/api/dto/g", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class c {
        public static final ru.yandex.taxi.communications.api.dto.g Companion = new ru.yandex.taxi.communications.api.dto.g();
        public static final i3y[] k = {null, null, null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new q03(19))};
        public final String a;
        public final boolean b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final NamedActionType j;

        public /* synthetic */ c(int i, String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, NamedActionType namedActionType) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
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
            if ((i & 32) == 0) {
                this.f = "";
            } else {
                this.f = str5;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = str6;
            }
            if ((i & 128) == 0) {
                this.h = null;
            } else {
                this.h = str7;
            }
            if ((i & 256) == 0) {
                this.i = null;
            } else {
                this.i = str8;
            }
            if ((i & 512) == 0) {
                this.j = NamedActionType.EMPTY;
            } else {
                this.j = namedActionType;
            }
        }

        public static c a(c cVar, String str, String str2) {
            String str3 = cVar.a;
            boolean z = cVar.b;
            String str4 = cVar.c;
            String str5 = cVar.d;
            String str6 = cVar.e;
            String str7 = cVar.f;
            String str8 = cVar.g;
            NamedActionType namedActionType = cVar.j;
            cVar.getClass();
            return new c(str3, z, str4, str5, str6, str7, str8, str, str2, namedActionType);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return jl40.l(this.a, cVar.a) && this.b == cVar.b && jl40.l(this.c, cVar.c) && jl40.l(this.d, cVar.d) && jl40.l(this.e, cVar.e) && jl40.l(this.f, cVar.f) && jl40.l(this.g, cVar.g) && jl40.l(this.h, cVar.h) && jl40.l(this.i, cVar.i) && this.j == cVar.j;
        }

        public final int hashCode() {
            int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int b = unr0.b(unr0.b(unr0.b((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
            String str2 = this.g;
            int hashCode = (b + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.h;
            int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.i;
            return this.j.hashCode() + ((hashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder l = oo31.l("ActionPayload(content=", this.a, ", isNeedAuthorization=", ", textToCopy=", this.b);
            g8e.D(l, this.c, ", activatedText=", this.d, ", coupon=");
            g8e.D(l, this.e, ", activatedDeeplink=", this.f, ", inactiveTitle=");
            g8e.D(l, this.g, ", title=", this.h, ", subtitle=");
            l.append(this.i);
            l.append(", name=");
            l.append(this.j);
            l.append(Extension.C_BRAKE);
            return l.toString();
        }

        public c() {
            this(null, false, 1023);
        }

        public c(String str, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, String str8, NamedActionType namedActionType) {
            this.a = str;
            this.b = z;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.j = namedActionType;
        }

        public /* synthetic */ c(String str, boolean z, int i) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, null, "", "", "", null, null, null, NamedActionType.EMPTY);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/api/dto/BannerWidgets$b;", "", "Companion", "ru/yandex/taxi/communications/api/dto/d", "ru/yandex/taxi/communications/api/dto/e", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class b {
        public static final ru.yandex.taxi.communications.api.dto.e Companion = new ru.yandex.taxi.communications.api.dto.e();
        public static final i3y[] m;
        public final String a;
        public final Set b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final a g;
        public final List h;
        public final boolean i;
        public final Map j;
        public final OnCloseEffect k;
        public final boolean l;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            m = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new q03(16)), null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new q03(17)), null, kotlin.a.b(lazyThreadSafetyMode, new q03(18)), null};
        }

        public /* synthetic */ b(int i, String str, Set set, String str2, String str3, String str4, String str5, a aVar, List list, boolean z, Map map, OnCloseEffect onCloseEffect) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = EmptySet.a;
            } else {
                this.b = set;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = str4;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str5;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = aVar;
            }
            if ((i & 128) == 0) {
                this.h = EmptyList.a;
            } else {
                this.h = list;
            }
            if ((i & 256) == 0) {
                this.i = true;
            } else {
                this.i = z;
            }
            if ((i & 512) == 0) {
                this.j = null;
            } else {
                this.j = map;
            }
            if ((i & 1024) == 0) {
                this.k = null;
            } else {
                this.k = onCloseEffect;
            }
            this.l = false;
        }

        public static b a(b bVar, String str, a aVar, boolean z, boolean z2, int i) {
            String str2 = bVar.a;
            Set set = bVar.b;
            String str3 = bVar.d;
            String str4 = bVar.e;
            String str5 = bVar.f;
            if ((i & 64) != 0) {
                aVar = bVar.g;
            }
            a aVar2 = aVar;
            List list = bVar.h;
            Map map = bVar.j;
            OnCloseEffect onCloseEffect = bVar.k;
            boolean z3 = (i & 2048) != 0 ? bVar.l : z2;
            bVar.getClass();
            return new b(str2, set, str, str3, str4, str5, aVar2, list, z, map, onCloseEffect, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && jl40.l(this.c, bVar.c) && jl40.l(this.d, bVar.d) && jl40.l(this.e, bVar.e) && jl40.l(this.f, bVar.f) && jl40.l(this.g, bVar.g) && jl40.l(this.h, bVar.h) && this.i == bVar.i && jl40.l(this.j, bVar.j) && jl40.l(this.k, bVar.k) && this.l == bVar.l;
        }

        public final int hashCode() {
            int e = g8e.e(this.b, this.a.hashCode() * 31, 31);
            String str = this.c;
            int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            a aVar = this.g;
            int e2 = unr0.e(unr0.c((hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.h), 31, this.i);
            Map map = this.j;
            int hashCode5 = (e2 + (map == null ? 0 : map.hashCode())) * 31;
            OnCloseEffect onCloseEffect = this.k;
            return Boolean.hashCode(this.l) + ((hashCode5 + (onCloseEffect != null ? onCloseEffect.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActionButton(deeplink=");
            sb.append(this.a);
            sb.append(", trackingUrls=");
            sb.append(this.b);
            sb.append(", text=");
            g8e.D(sb, this.c, ", target=", this.d, ", color=");
            g8e.D(sb, this.e, ", textColor=", this.f, ", action=");
            sb.append(this.g);
            sb.append(", extraActions=");
            sb.append(this.h);
            sb.append(", enabled=");
            sb.append(this.i);
            sb.append(", elementPayload=");
            sb.append(this.j);
            sb.append(", onCloseEffect=");
            sb.append(this.k);
            sb.append(", loading=");
            sb.append(this.l);
            sb.append(Extension.C_BRAKE);
            return sb.toString();
        }

        public b() {
            this(null, null, null, null, null, null, 4095);
        }

        public b(String str, Set set, String str2, String str3, String str4, String str5, a aVar, List list, boolean z, Map map, OnCloseEffect onCloseEffect, boolean z2) {
            this.a = str;
            this.b = set;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = aVar;
            this.h = list;
            this.i = z;
            this.j = map;
            this.k = onCloseEffect;
            this.l = z2;
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, a aVar, int i) {
            this((i & 1) != 0 ? "" : str, (Set) EmptySet.a, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : aVar, (List) EmptyList.a, (i & 256) != 0, (Map) null, (OnCloseEffect) null, false);
        }
    }
}
