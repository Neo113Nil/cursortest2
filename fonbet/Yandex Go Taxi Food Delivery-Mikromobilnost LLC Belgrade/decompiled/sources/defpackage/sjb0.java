package defpackage;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.kyc.internal.interactor.a;
import com.ybsdk.feature.kyc.internal.screens.photov3.PhotoParams;
import com.ybsdk.feature.kyc.internal.screens.photov3.b;

/* loaded from: classes3.dex */
public final class sjb0 implements pjb0 {
    public final wrr a;

    public sjb0(wrr wrrVar) {
        this.a = wrrVar;
    }

    public final b a(PhotoParams photoParams) {
        wrr wrrVar = this.a;
        return new b(photoParams, (tfl0) ((u1g) wrrVar.b).get(), (Context) ((u1g) wrrVar.c).get(), (a) ((prq) wrrVar.w).get(), (opx) ((u1g) wrrVar.x).get(), (g5) ((u1g) wrrVar.y).get(), (AppAnalyticsReporter) ((u1g) wrrVar.z).get(), (akb0) ((xvf0) wrrVar.A).get());
    }
}
