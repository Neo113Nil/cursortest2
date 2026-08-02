package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.b;
import com.ybsdk.feature.card.internal.interactors.f;
import com.ybsdk.feature.card.internal.presentation.cardissue.CardIssueScreenArguments;
import com.ybsdk.feature.card.internal.presentation.cardissue.a;

/* loaded from: classes3.dex */
public final class wh8 implements th8 {
    public final v920 a;

    public wh8(v920 v920Var) {
        this.a = v920Var;
    }

    public final a a(CardIssueScreenArguments cardIssueScreenArguments) {
        v920 v920Var = this.a;
        f fVar = (f) ((xvf0) v920Var.a).get();
        ((pg5) v920Var.b).get();
        return new a(fVar, (cf8) ((eqh) v920Var.c).get(), (AppAnalyticsReporter) ((owf) v920Var.w).get(), (tfl0) ((owf) v920Var.x).get(), (b) ((owf) v920Var.y).get(), cardIssueScreenArguments);
    }
}
