package defpackage;

import androidx.constraintlayout.motion.widget.MotionLayout;
import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardFragmentV2;

/* loaded from: classes3.dex */
public final class tam0 extends ffh {
    public final /* synthetic */ SavingsDashboardFragmentV2 a;

    public tam0(SavingsDashboardFragmentV2 savingsDashboardFragmentV2) {
        this.a = savingsDashboardFragmentV2;
    }

    @Override // defpackage.ffh, defpackage.sa30
    public final void onTransitionCompleted(MotionLayout motionLayout, int i) {
        SavingsDashboardFragmentV2 savingsDashboardFragmentV2 = this.a;
        savingsDashboardFragmentV2.motionLayoutLastStateId = i;
        savingsDashboardFragmentV2.adjustSwipeRefreshEnabledState();
    }
}
