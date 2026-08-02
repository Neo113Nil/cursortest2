package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.mediators.a;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderScreenParams;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.b;

/* loaded from: classes3.dex */
public final class vcg0 implements ocg0 {
    public final bu0 a;

    public vcg0(bu0 bu0Var) {
        this.a = bu0Var;
    }

    public final b a(QrReaderScreenParams qrReaderScreenParams) {
        bu0 bu0Var = this.a;
        return new b((a) ((p5g) bu0Var.a).get(), (xcg0) ((kxb0) bu0Var.b).get(), (AppAnalyticsReporter) ((p5g) bu0Var.c).get(), (tfl0) ((p5g) bu0Var.d).get(), (a7g0) ((p5g) bu0Var.e).get(), (l7g0) ((p5g) bu0Var.f).get(), (jdg0) ((p5g) bu0Var.g).get(), qrReaderScreenParams, (ubg0) ((p5g) bu0Var.h).get(), (com.ybsdk.feature.qr.api.domain.a) ((p5g) bu0Var.i).get());
    }
}
