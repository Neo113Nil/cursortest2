package ru.yandex.taxi.routestats.prefetch;

import ru.yandex.taxi.routestats.prefetch.RouteStatsPrefetchExperiment;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class d {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RouteStatsPrefetchExperiment.PrefetchMode.values().length];
        try {
            iArr[RouteStatsPrefetchExperiment.PrefetchMode.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RouteStatsPrefetchExperiment.PrefetchMode.ONLY_FIRST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RouteStatsPrefetchExperiment.PrefetchMode.ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[RouteStatsPrefetchExperiment.PrefetchMode.FIRST_TWO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
