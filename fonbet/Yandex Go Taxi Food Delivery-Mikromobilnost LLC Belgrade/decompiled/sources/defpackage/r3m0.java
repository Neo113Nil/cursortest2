package defpackage;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.savings.internal.screens.close.deposit.SavingsAccountCloseDepositParams;

/* loaded from: classes3.dex */
public final class r3m0 implements h3m0 {
    public final wrr a;

    public r3m0(wrr wrrVar) {
        this.a = wrrVar;
    }

    public final q3m0 a(SavingsAccountCloseDepositParams savingsAccountCloseDepositParams) {
        wrr wrrVar = this.a;
        return new q3m0(savingsAccountCloseDepositParams, (tfl0) ((g7g) wrrVar.b).get(), (Context) ((k6g) wrrVar.c).get(), (AppAnalyticsReporter) ((g7g) wrrVar.w).get(), (w2m0) ((xvf0) wrrVar.x).get(), (fdm0) ((g7g) wrrVar.y).get(), (w3m0) ((x3m0) wrrVar.z).get(), (mdm0) ((g7g) wrrVar.A).get());
    }
}
