package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.taxi.intercity.dashboard.impl.feedback.presentation.modal.IntercityDashboardFeedbackModalView;

/* loaded from: classes14.dex */
public final class rcw extends RecyclerView.g {
    public final /* synthetic */ IntercityDashboardFeedbackModalView a;

    public rcw(IntercityDashboardFeedbackModalView intercityDashboardFeedbackModalView) {
        this.a = intercityDashboardFeedbackModalView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.a.updateBottomElevation();
    }
}
