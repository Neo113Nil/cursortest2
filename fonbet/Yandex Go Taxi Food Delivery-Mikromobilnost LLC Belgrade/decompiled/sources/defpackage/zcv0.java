package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryExpandingState;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes6.dex */
public abstract class zcv0 {
    public static final SummaryAnalytics$SummaryExpandingState a(SummaryStateTracker.SolidSummaryState solidSummaryState) {
        int i = ycv0.a[solidSummaryState.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return SummaryAnalytics$SummaryExpandingState.Expanded;
            }
            if (i == 4) {
                return SummaryAnalytics$SummaryExpandingState.Collapsed;
            }
            w511.b();
            return null;
        }
        return SummaryAnalytics$SummaryExpandingState.Collapsed;
    }
}
