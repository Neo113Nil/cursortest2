package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.testpayment.internal.domain.b;
import com.ybsdk.feature.testpayment.internal.presentation.TestPaymentArguments;
import com.ybsdk.feature.testpayment.internal.presentation.a;

/* loaded from: classes3.dex */
public final class qhy0 implements ohy0 {
    public final hlx0 a;

    public qhy0(hlx0 hlx0Var) {
        this.a = hlx0Var;
    }

    public final a a(TestPaymentArguments testPaymentArguments) {
        hlx0 hlx0Var = this.a;
        return new a(testPaymentArguments, (b) ((z6x0) hlx0Var.b).get(), (ehy0) ((hag) hlx0Var.c).get(), (tfl0) ((hag) hlx0Var.w).get(), (AppAnalyticsReporter) ((hag) hlx0Var.x).get(), (vhy0) ((xvf0) hlx0Var.y).get());
    }
}
