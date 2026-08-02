package defpackage;

import androidx.constraintlayout.motion.widget.MotionLayout;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardFragmentV4;

/* loaded from: classes3.dex */
public final class yam0 extends ffh {
    public final /* synthetic */ SavingsDashboardFragmentV4 a;

    public yam0(SavingsDashboardFragmentV4 savingsDashboardFragmentV4) {
        this.a = savingsDashboardFragmentV4;
    }

    @Override // defpackage.ffh, defpackage.sa30
    public final void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f) {
        SavingsDashboardFragmentV4 savingsDashboardFragmentV4 = this.a;
        savingsDashboardFragmentV4.applyHeaderCornerRadius(f, SavingsDashboardFragmentV4.access$getBinding(savingsDashboardFragmentV4));
    }

    @Override // defpackage.ffh, defpackage.sa30
    public final void onTransitionCompleted(MotionLayout motionLayout, int i) {
        SavingsDashboardFragmentV4 savingsDashboardFragmentV4 = this.a;
        savingsDashboardFragmentV4.motionLayoutLastStateId = i;
        savingsDashboardFragmentV4.adjustSwipeRefreshEnabledState(SavingsDashboardFragmentV4.access$getBinding(savingsDashboardFragmentV4));
        savingsDashboardFragmentV4.applyHeaderCornerRadius(i == tbh0.end ? 1.0f : 0.0f, SavingsDashboardFragmentV4.access$getBinding(savingsDashboardFragmentV4));
    }
}
