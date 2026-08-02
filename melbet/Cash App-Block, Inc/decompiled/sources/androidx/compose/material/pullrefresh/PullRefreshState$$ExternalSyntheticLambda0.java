package androidx.compose.material.pullrefresh;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class PullRefreshState$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PullRefreshState f$0;

    public /* synthetic */ PullRefreshState$$ExternalSyntheticLambda0(PullRefreshState pullRefreshState, int i) {
        this.$r8$classId = i;
        this.f$0 = pullRefreshState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PullRefreshState pullRefreshState = this.f$0;
        switch (i) {
            case 0:
                return Float.valueOf(pullRefreshState.distancePulled$delegate.getFloatValue() * 0.5f);
            default:
                return Float.valueOf(pullRefreshState.getAdjustedDistancePulled() / pullRefreshState._threshold$delegate.getFloatValue() < 1.0f ? 0.3f : 1.0f);
        }
    }
}
