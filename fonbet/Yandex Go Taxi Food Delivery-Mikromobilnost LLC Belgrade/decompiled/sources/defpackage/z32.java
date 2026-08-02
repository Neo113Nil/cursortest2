package defpackage;

import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class z32 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuperappSuggestExperiment.SearchScaffoldStyle.values().length];
        try {
            iArr[SuperappSuggestExperiment.SearchScaffoldStyle.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperappSuggestExperiment.SearchScaffoldStyle.FLOATING_INPUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
