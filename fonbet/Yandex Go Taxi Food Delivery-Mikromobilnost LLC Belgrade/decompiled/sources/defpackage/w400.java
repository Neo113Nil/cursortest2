package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;

/* loaded from: classes3.dex */
public final class w400 implements v7p {
    public final /* synthetic */ int a;
    public final u2g b;

    public /* synthetic */ w400(u2g u2gVar, int i) {
        this.a = i;
        this.b = u2gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        u2g u2gVar = this.b;
        switch (i) {
            case 0:
                return new sb6((AppAnalyticsReporter) u2gVar.get());
            default:
                return new krl0((AppAnalyticsReporter) u2gVar.get());
        }
    }
}
