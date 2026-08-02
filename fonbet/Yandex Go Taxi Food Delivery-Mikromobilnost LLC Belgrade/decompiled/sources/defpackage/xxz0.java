package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.screens.notice.domain.entities.TopupValueEntity;
import com.ybsdk.screens.notice.presentation.a;

/* loaded from: classes3.dex */
public final class xxz0 implements wxz0 {
    public final hlx0 a;

    public xxz0(hlx0 hlx0Var) {
        this.a = hlx0Var;
    }

    public final a a(TopupValueEntity topupValueEntity, sls slsVar) {
        hlx0 hlx0Var = this.a;
        return new a((tfl0) ((xvf0) hlx0Var.b).get(), (com.ybsdk.screens.notice.data.a) ((ibz0) hlx0Var.c).get(), (AppAnalyticsReporter) ((xvf0) hlx0Var.w).get(), (a3h) ((xvf0) hlx0Var.x).get(), topupValueEntity, slsVar, (j3h) ((xvf0) hlx0Var.y).get());
    }
}
