package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.kycesia.internal.domain.b;
import com.ybsdk.feature.kycesia.internal.screens.browser.OpenEsiaParams;
import com.ybsdk.feature.kycesia.internal.screens.browser.a;

/* loaded from: classes3.dex */
public final class q570 implements o570 {
    public final dt20 a;

    public q570(dt20 dt20Var) {
        this.a = dt20Var;
    }

    public final a a(OpenEsiaParams openEsiaParams) {
        dt20 dt20Var = this.a;
        return new a(openEsiaParams, (tfl0) ((byf) dt20Var.b).get(), (com.ybsdk.di.modules.features.kyc.a) ((byf) dt20Var.c).get(), (b) ((qrb) dt20Var.w).get(), (AppAnalyticsReporter) ((byf) dt20Var.x).get());
    }
}
