package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.savings.internal.screens.goal.SavingsAccountGoalParams;

/* loaded from: classes3.dex */
public final class q6m0 implements k6m0 {
    public final v920 a;

    public q6m0(v920 v920Var) {
        this.a = v920Var;
    }

    public final p6m0 a(SavingsAccountGoalParams savingsAccountGoalParams) {
        v920 v920Var = this.a;
        return new p6m0(savingsAccountGoalParams, (tfl0) ((g7g) v920Var.a).get(), (mdm0) ((g7g) v920Var.b).get(), (w2m0) ((xvf0) v920Var.c).get(), (AppAnalyticsReporter) ((g7g) v920Var.w).get(), (w530) ((g7g) v920Var.x).get(), (u6m0) ((jpf0) v920Var.y).get());
    }
}
