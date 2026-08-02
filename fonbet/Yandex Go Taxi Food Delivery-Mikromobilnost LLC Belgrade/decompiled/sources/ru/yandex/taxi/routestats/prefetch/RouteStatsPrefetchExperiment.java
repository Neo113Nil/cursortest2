package ru.yandex.taxi.routestats.prefetch;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ibl0;
import defpackage.k4o;
import defpackage.mbl0;
import defpackage.w96;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/routestats/prefetch/RouteStatsPrefetchExperiment;", "Lw96;", "Companion", "PrefetchMode", "mbl0", "ru/yandex/taxi/routestats/prefetch/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RouteStatsPrefetchExperiment extends w96 {
    public static final mbl0 Companion = new mbl0();
    public static final i3y[] h = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ibl0(5)), null, null, null, null};
    public static final RouteStatsPrefetchExperiment i = new RouteStatsPrefetchExperiment(62);
    public final boolean b;
    public final PrefetchMode c;
    public final int d;
    public final boolean e;
    public final long f;
    public final boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/routestats/prefetch/RouteStatsPrefetchExperiment$PrefetchMode;", "", "Companion", "ru/yandex/taxi/routestats/prefetch/b", "DISABLED", "ONLY_FIRST", "FIRST_TWO", "ALL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class PrefetchMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ PrefetchMode[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final PrefetchMode ALL;
        public static final b Companion;
        public static final PrefetchMode DISABLED;
        public static final PrefetchMode FIRST_TWO;
        public static final PrefetchMode ONLY_FIRST;

        static {
            PrefetchMode prefetchMode = new PrefetchMode("DISABLED", 0);
            DISABLED = prefetchMode;
            PrefetchMode prefetchMode2 = new PrefetchMode("ONLY_FIRST", 1);
            ONLY_FIRST = prefetchMode2;
            PrefetchMode prefetchMode3 = new PrefetchMode("FIRST_TWO", 2);
            FIRST_TWO = prefetchMode3;
            PrefetchMode prefetchMode4 = new PrefetchMode("ALL", 3);
            ALL = prefetchMode4;
            PrefetchMode[] prefetchModeArr = {prefetchMode, prefetchMode2, prefetchMode3, prefetchMode4};
            $VALUES = prefetchModeArr;
            $ENTRIES = kotlin.enums.a.a(prefetchModeArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ibl0(6));
        }

        public static PrefetchMode valueOf(String str) {
            return (PrefetchMode) Enum.valueOf(PrefetchMode.class, str);
        }

        public static PrefetchMode[] values() {
            return (PrefetchMode[]) $VALUES.clone();
        }
    }

    public /* synthetic */ RouteStatsPrefetchExperiment(int i2, boolean z, PrefetchMode prefetchMode, int i3, boolean z2, long j, boolean z3) {
        if ((i2 & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i2 & 2) == 0) {
            this.c = PrefetchMode.DISABLED;
        } else {
            this.c = prefetchMode;
        }
        if ((i2 & 4) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
        }
        if ((i2 & 8) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i2 & 16) == 0) {
            this.f = 1000L;
        } else {
            this.f = j;
        }
        if ((i2 & 32) == 0) {
            this.g = false;
        } else {
            this.g = z3;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public RouteStatsPrefetchExperiment() {
        this(63);
    }

    public RouteStatsPrefetchExperiment(int i2) {
        PrefetchMode prefetchMode = PrefetchMode.DISABLED;
        this.b = false;
        this.c = prefetchMode;
        this.d = 0;
        this.e = false;
        this.f = 1000L;
        this.g = false;
    }
}
