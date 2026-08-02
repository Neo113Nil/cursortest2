package ru.yandex.taxi.scooters.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.ksq0;
import defpackage.n6r;
import defpackage.t9r;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/scooters/experiments/FinishCard;", "", "Companion", "a", "Section", "Statistics", "ru/yandex/taxi/scooters/experiments/a", "t9r", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FinishCard {
    public static final t9r Companion = new t9r();
    public static final i3y[] g;
    public final a a;
    public final jsq0 b;
    public final Statistics c;
    public final boolean d;
    public final boolean e;
    public final List f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/scooters/experiments/FinishCard$Section;", "", "Companion", "ru/yandex/taxi/scooters/experiments/b", "FEEDBACK", "SHORTCUTS", "INFO", "STATISTICS", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Section {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Section[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final b Companion;
        public static final Section FEEDBACK;
        public static final Section INFO;
        public static final Section SHORTCUTS;
        public static final Section STATISTICS;

        static {
            Section section = new Section("FEEDBACK", 0);
            FEEDBACK = section;
            Section section2 = new Section("SHORTCUTS", 1);
            SHORTCUTS = section2;
            Section section3 = new Section("INFO", 2);
            INFO = section3;
            Section section4 = new Section("STATISTICS", 3);
            STATISTICS = section4;
            Section[] sectionArr = {section, section2, section3, section4};
            $VALUES = sectionArr;
            $ENTRIES = kotlin.enums.a.a(sectionArr);
            Companion = new b();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new n6r(14));
        }

        public static Section valueOf(String str) {
            return (Section) Enum.valueOf(Section.class, str);
        }

        public static Section[] values() {
            return (Section[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new n6r(12)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new n6r(13))};
    }

    public /* synthetic */ FinishCard(int i, a aVar, jsq0 jsq0Var, Statistics statistics, boolean z, boolean z2, List list) {
        this.a = (i & 1) == 0 ? new a(0) : aVar;
        if ((i & 2) == 0) {
            this.b = ksq0.a;
        } else {
            this.b = jsq0Var;
        }
        if ((i & 4) == 0) {
            this.c = new Statistics(0);
        } else {
            this.c = statistics;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        if ((i & 32) == 0) {
            this.f = EmptyList.a;
        } else {
            this.f = list;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/experiments/FinishCard$a;", "", "Companion", "ru/yandex/taxi/scooters/experiments/c", "ru/yandex/taxi/scooters/experiments/d", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final d Companion = new d();
        public final boolean a;

        public /* synthetic */ a(int i, boolean z) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
        }

        public a(int i) {
            this.a = false;
        }

        public a() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/experiments/FinishCard$Statistics;", "", "Companion", "StatisticsItem", "ru/yandex/taxi/scooters/experiments/e", "ru/yandex/taxi/scooters/experiments/f", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class Statistics {
        public static final f Companion = new f();
        public static final i3y[] c = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new n6r(15))};
        public final boolean a;
        public final jsq0 b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/scooters/experiments/FinishCard$Statistics$StatisticsItem;", "", "Companion", "ru/yandex/taxi/scooters/experiments/g", "DISTANCE", "SPEED", "DURATION", "PRICE", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
        @gsq0
        public static final class StatisticsItem {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ StatisticsItem[] $VALUES;
            private static final i3y $cachedSerializer$delegate;
            public static final g Companion;
            public static final StatisticsItem DISTANCE;
            public static final StatisticsItem DURATION;
            public static final StatisticsItem PRICE;
            public static final StatisticsItem SPEED;

            static {
                StatisticsItem statisticsItem = new StatisticsItem("DISTANCE", 0);
                DISTANCE = statisticsItem;
                StatisticsItem statisticsItem2 = new StatisticsItem("SPEED", 1);
                SPEED = statisticsItem2;
                StatisticsItem statisticsItem3 = new StatisticsItem("DURATION", 2);
                DURATION = statisticsItem3;
                StatisticsItem statisticsItem4 = new StatisticsItem("PRICE", 3);
                PRICE = statisticsItem4;
                StatisticsItem[] statisticsItemArr = {statisticsItem, statisticsItem2, statisticsItem3, statisticsItem4};
                $VALUES = statisticsItemArr;
                $ENTRIES = kotlin.enums.a.a(statisticsItemArr);
                Companion = new g();
                $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new n6r(16));
            }

            public static StatisticsItem valueOf(String str) {
                return (StatisticsItem) Enum.valueOf(StatisticsItem.class, str);
            }

            public static StatisticsItem[] values() {
                return (StatisticsItem[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Statistics(int i, boolean z, jsq0 jsq0Var) {
            this.a = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.b = ksq0.a;
            } else {
                this.b = jsq0Var;
            }
        }

        public Statistics() {
            this(0);
        }

        public Statistics(int i) {
            jsq0 jsq0Var = ksq0.a;
            this.a = false;
            this.b = jsq0Var;
        }
    }

    public FinishCard() {
        a aVar = new a(0);
        jsq0 jsq0Var = ksq0.a;
        Statistics statistics = new Statistics(0);
        this.a = aVar;
        this.b = jsq0Var;
        this.c = statistics;
        this.d = false;
        this.e = false;
        this.f = EmptyList.a;
    }
}
