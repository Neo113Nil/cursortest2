package ru.yandex.taxi.masstransit.experiment;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.k801;
import defpackage.tc01;
import defpackage.xn11;
import java.util.ArrayList;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/TransportOnSummaryExperiment;", "Lxn11;", "Lc6z;", "Companion", "d", "LiveTagsSettings", "e", "c", "f", "b", "a", "g", "ru/yandex/taxi/masstransit/experiment/l", "ru/yandex/taxi/masstransit/experiment/g", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransportOnSummaryExperiment implements xn11, c6z {
    public static final l Companion = new l();
    public static final i3y[] s;
    public final boolean b;
    public final Map c;
    public final boolean d;
    public final Map e;
    public final String f;
    public final String g;
    public final Map h;
    public final Long i;
    public final c j;
    public final f k;
    public final String l;
    public final String m;
    public final g n;
    public final String o;
    public final int p;
    public final long q;
    public final d r;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        s = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new k801(12)), null, kotlin.a.b(lazyThreadSafetyMode, new k801(13)), null, null, kotlin.a.b(lazyThreadSafetyMode, new k801(14)), null, null, null, null, null, null, null, null, null, null};
    }

    public TransportOnSummaryExperiment(int i, boolean z, Map map, boolean z2, Map map2, String str, String str2, Map map3, Long l, c cVar, f fVar, String str3, String str4, g gVar, String str5, int i2, long j, d dVar) {
        g gVar2;
        d dVar2;
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
        if ((i & 4) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 8) == 0) {
            this.e = kotlin.collections.b.f();
        } else {
            this.e = map2;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str2;
        }
        if ((i & 64) == 0) {
            this.h = kotlin.collections.b.f();
        } else {
            this.h = map3;
        }
        if ((i & 128) == 0) {
            this.i = null;
        } else {
            this.i = l;
        }
        if ((i & 256) == 0) {
            c.Companion.getClass();
            this.j = new c(0);
        } else {
            this.j = cVar;
        }
        if ((i & 512) == 0) {
            f.Companion.getClass();
            this.k = new f(0);
        } else {
            this.k = fVar;
        }
        if ((i & 1024) == 0) {
            this.l = "";
        } else {
            this.l = str3;
        }
        if ((i & 2048) == 0) {
            this.m = "";
        } else {
            this.m = str4;
        }
        if ((i & 4096) == 0) {
            g.Companion.getClass();
            gVar2 = new g(0);
        } else {
            gVar2 = gVar;
        }
        this.n = gVar2;
        if ((i & 8192) == 0) {
            this.o = "";
        } else {
            this.o = str5;
        }
        if ((i & 16384) == 0) {
            this.p = 0;
        } else {
            this.p = i2;
        }
        this.q = (32768 & i) == 0 ? 2000L : j;
        if ((i & 65536) == 0) {
            d.Companion.getClass();
            dVar2 = new d(0);
        } else {
            dVar2 = dVar;
        }
        this.r = dVar2;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/TransportOnSummaryExperiment$LiveTagsSettings;", "", "Companion", "LiveTagsFilterType", "ru/yandex/taxi/masstransit/experiment/p", "ru/yandex/taxi/masstransit/experiment/o", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class LiveTagsSettings {
        public static final p Companion = new p();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(16))};
        public final LiveTagsFilterType a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/TransportOnSummaryExperiment$LiveTagsSettings$LiveTagsFilterType;", "", "Companion", "ru/yandex/taxi/masstransit/experiment/q", "FIRST", "FULL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class LiveTagsFilterType {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ LiveTagsFilterType[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final q Companion;
            public static final LiveTagsFilterType FIRST;
            public static final LiveTagsFilterType FULL;

            static {
                LiveTagsFilterType liveTagsFilterType = new LiveTagsFilterType("FIRST", 0);
                FIRST = liveTagsFilterType;
                LiveTagsFilterType liveTagsFilterType2 = new LiveTagsFilterType("FULL", 1);
                FULL = liveTagsFilterType2;
                LiveTagsFilterType[] liveTagsFilterTypeArr = {liveTagsFilterType, liveTagsFilterType2};
                $VALUES = liveTagsFilterTypeArr;
                $ENTRIES = kotlin.enums.a.a(liveTagsFilterTypeArr);
                Companion = new q();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(17));
            }

            public static LiveTagsFilterType valueOf(String str) {
                return (LiveTagsFilterType) Enum.valueOf(LiveTagsFilterType.class, str);
            }

            public static LiveTagsFilterType[] values() {
                return (LiveTagsFilterType[]) $VALUES.clone();
            }
        }

        public /* synthetic */ LiveTagsSettings(int i, LiveTagsFilterType liveTagsFilterType) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = liveTagsFilterType;
            }
        }

        public LiveTagsSettings(int i) {
            this.a = null;
        }

        public LiveTagsSettings() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/TransportOnSummaryExperiment$e;", "", "Companion", "ru/yandex/taxi/masstransit/experiment/t", "ru/yandex/taxi/masstransit/experiment/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class e {
        public static final u Companion = new u();
        public final String a;

        public /* synthetic */ e(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        public e() {
            this.a = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/TransportOnSummaryExperiment$c;", "", "Companion", "ru/yandex/taxi/masstransit/experiment/n", "ru/yandex/taxi/masstransit/experiment/m", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class c {
        public static final n Companion = new n();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(15))};
        public final ArrayList a;

        public /* synthetic */ c(int i, ArrayList arrayList) {
            if ((i & 1) == 0) {
                this.a = new ArrayList();
            } else {
                this.a = arrayList;
            }
        }

        public c() {
            this(0);
        }

        public c(int i) {
            this.a = new ArrayList();
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/TransportOnSummaryExperiment$f;", "", "Companion", "ru/yandex/taxi/masstransit/experiment/w", "ru/yandex/taxi/masstransit/experiment/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class f {
        public static final w Companion = new w();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(18))};
        public final ArrayList a;

        public /* synthetic */ f(int i, ArrayList arrayList) {
            if ((i & 1) == 0) {
                this.a = new ArrayList();
            } else {
                this.a = arrayList;
            }
        }

        public f() {
            this(0);
        }

        public f(int i) {
            this.a = new ArrayList();
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/TransportOnSummaryExperiment$g;", "", "Companion", "ru/yandex/taxi/masstransit/experiment/y", "ru/yandex/taxi/masstransit/experiment/x", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class g {
        public static final y Companion = new y();
        public final boolean a;
        public final Integer b;
        public final Integer c;

        public /* synthetic */ g(int i, boolean z, Integer num, Integer num2) {
            this.a = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num2;
            }
        }

        public g(int i) {
            this.a = false;
            this.b = null;
            this.c = null;
        }

        public g() {
            this(0);
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/TransportOnSummaryExperiment$b;", "", "Companion", "ru/yandex/taxi/masstransit/experiment/k", "ru/yandex/taxi/masstransit/experiment/j", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class b {
        public static final k Companion = new k();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new tc01(28)), null};
        public final ExperimentAction a;
        public final a b;

        public b(int i, ExperimentAction experimentAction, a aVar) {
            this.a = (i & 1) == 0 ? ExperimentAction.UNKNOWN : experimentAction;
            if ((i & 2) != 0) {
                this.b = aVar;
            } else {
                a.Companion.getClass();
                this.b = new a(0);
            }
        }

        public b() {
            ExperimentAction experimentAction = ExperimentAction.UNKNOWN;
            a.Companion.getClass();
            a aVar = new a(0);
            this.a = experimentAction;
            this.b = aVar;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/TransportOnSummaryExperiment$d;", "", "Companion", "ru/yandex/taxi/masstransit/experiment/s", "ru/yandex/taxi/masstransit/experiment/r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class d {
        public static final s Companion = new s();
        public final boolean a;
        public final LiveTagsSettings b;

        public d(int i, boolean z, LiveTagsSettings liveTagsSettings) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) != 0) {
                this.b = liveTagsSettings;
            } else {
                LiveTagsSettings.Companion.getClass();
                this.b = new LiveTagsSettings(0);
            }
        }

        public d() {
            this(0);
        }

        public d(int i) {
            LiveTagsSettings.Companion.getClass();
            LiveTagsSettings liveTagsSettings = new LiveTagsSettings(0);
            this.a = false;
            this.b = liveTagsSettings;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/masstransit/experiment/TransportOnSummaryExperiment$a;", "", "Companion", "ru/yandex/taxi/masstransit/experiment/i", "ru/yandex/taxi/masstransit/experiment/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class a {
        public static final i Companion = new i();
        public final FormattedText a;
        public final FormattedText b;
        public final String c;

        public /* synthetic */ a(int i, String str, FormattedText formattedText, FormattedText formattedText2) {
            this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str;
            }
        }

        public a() {
            this(0);
        }

        public a(int i) {
            FormattedText formattedText = FormattedText.c;
            this.a = formattedText;
            this.b = formattedText;
            this.c = "";
        }
    }

    public TransportOnSummaryExperiment() {
        this(0);
    }

    public TransportOnSummaryExperiment(int i) {
        Map f2 = kotlin.collections.b.f();
        Map f3 = kotlin.collections.b.f();
        Map f4 = kotlin.collections.b.f();
        c.Companion.getClass();
        c cVar = new c(0);
        f.Companion.getClass();
        f fVar = new f(0);
        g.Companion.getClass();
        g gVar = new g(0);
        d.Companion.getClass();
        d dVar = new d(0);
        this.b = false;
        this.c = f2;
        this.d = false;
        this.e = f3;
        this.f = "";
        this.g = "";
        this.h = f4;
        this.i = null;
        this.j = cVar;
        this.k = fVar;
        this.l = "";
        this.m = "";
        this.n = gVar;
        this.o = "";
        this.p = 0;
        this.q = 2000L;
        this.r = dVar;
    }
}
