package ru.yandex.taxi.persuggest.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j5v0;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.w0v0;
import defpackage.xn11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/persuggest/experiments/SuggestHeuristicsExperiment;", "Lxn11;", "Companion", "Heuristic", "j5v0", "i5v0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SuggestHeuristicsExperiment implements xn11 {
    public static final j5v0 Companion = new j5v0();
    public static final i3y[] e;
    public static final SuggestHeuristicsExperiment f;
    public final boolean b;
    public final jsq0 c;
    public final jsq0 d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/persuggest/experiments/SuggestHeuristicsExperiment$Heuristic;", "", "Companion", "ru/yandex/taxi/persuggest/experiments/a", "SESSION_TIME", "RESULT_SEEN_FULLY", "EVENT_NUMBER", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes6.dex */
    public static final class Heuristic {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Heuristic[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final a Companion;
        public static final Heuristic EVENT_NUMBER;
        public static final Heuristic RESULT_SEEN_FULLY;
        public static final Heuristic SESSION_TIME;

        static {
            Heuristic heuristic = new Heuristic("SESSION_TIME", 0);
            SESSION_TIME = heuristic;
            Heuristic heuristic2 = new Heuristic("RESULT_SEEN_FULLY", 1);
            RESULT_SEEN_FULLY = heuristic2;
            Heuristic heuristic3 = new Heuristic("EVENT_NUMBER", 2);
            EVENT_NUMBER = heuristic3;
            Heuristic[] heuristicArr = {heuristic, heuristic2, heuristic3};
            $VALUES = heuristicArr;
            $ENTRIES = kotlin.enums.a.a(heuristicArr);
            Companion = new a();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0v0(9));
        }

        public static Heuristic valueOf(String str) {
            return (Heuristic) Enum.valueOf(Heuristic.class, str);
        }

        public static Heuristic[] values() {
            return (Heuristic[]) $VALUES.clone();
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new w0v0(7)), kotlin.a.b(lazyThreadSafetyMode, new w0v0(8))};
        f = new SuggestHeuristicsExperiment(0);
    }

    public /* synthetic */ SuggestHeuristicsExperiment(int i, boolean z, jsq0 jsq0Var, jsq0 jsq0Var2) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = jsq0Var;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = jsq0Var2;
        }
    }

    public SuggestHeuristicsExperiment(int i) {
        this.b = false;
        this.c = null;
        this.d = null;
    }

    public SuggestHeuristicsExperiment() {
        this(0);
    }
}
