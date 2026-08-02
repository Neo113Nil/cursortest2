package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.pin.internal.domain.a;
import com.ybsdk.feature.pin.internal.screens.biometry.BiometricScreenParams;
import com.ybsdk.feature.pin.internal.screens.biometry.b;

/* loaded from: classes3.dex */
public final class sy5 implements qy5 {
    public final bc a;

    public sy5(bc bcVar) {
        this.a = bcVar;
    }

    public final b a(BiometricScreenParams biometricScreenParams) {
        bc bcVar = this.a;
        return new b(biometricScreenParams, (AppAnalyticsReporter) ((l5g) bcVar.a).get(), (ux5) ((xvf0) bcVar.b).get(), (a) ((f380) bcVar.c).get(), (com.ybsdk.feature.pin.internal.domain.b) ((fy30) bcVar.w).get(), (tfl0) ((p5g) bcVar.x).get());
    }
}
