package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.main.api.ui.DivListReporter$Screen;

/* loaded from: classes3.dex */
public final class qo10 implements v7p {
    public final /* synthetic */ int a;
    public final j3g b;

    public /* synthetic */ qo10(j3g j3gVar, int i) {
        this.a = i;
        this.b = j3gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        j3g j3gVar = this.b;
        switch (i) {
            case 0:
                return new c9v(24, (AppAnalyticsReporter) j3gVar.get());
            case 1:
                return new sb6((AppAnalyticsReporter) j3gVar.get());
            default:
                return new gzk(DivListReporter$Screen.MERCHANT_OFFERS, (AppAnalyticsReporter) j3gVar.get());
        }
    }
}
