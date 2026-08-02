package defpackage;

import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ycv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SummaryStateTracker.SolidSummaryState.values().length];
        try {
            iArr[SummaryStateTracker.SolidSummaryState.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SummaryStateTracker.SolidSummaryState.COLLAPSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SummaryStateTracker.SolidSummaryState.EXPANDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SummaryStateTracker.SolidSummaryState.TRANSITIONING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
