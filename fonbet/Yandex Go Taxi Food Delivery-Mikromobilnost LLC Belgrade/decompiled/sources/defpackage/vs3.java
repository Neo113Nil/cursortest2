package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;

/* loaded from: classes3.dex */
public final class vs3 implements v7p {
    public final /* synthetic */ int a;
    public final hag b;

    public /* synthetic */ vs3(hag hagVar, int i) {
        this.a = i;
        this.b = hagVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        hag hagVar = this.b;
        switch (i) {
            case 0:
                return new us3((AppAnalyticsReporter) hagVar.get());
            case 1:
                return new m04((AppAnalyticsReporter) hagVar.get());
            case 2:
                return new f42((AppAnalyticsReporter) hagVar.get(), 7);
            case 3:
                return new m04((AppAnalyticsReporter) hagVar.get());
            case 4:
                return new us3((AppAnalyticsReporter) hagVar.get());
            case 5:
                return new m04((AppAnalyticsReporter) hagVar.get());
            case 6:
                return new us3((AppAnalyticsReporter) hagVar.get());
            case 7:
                return new us3((AppAnalyticsReporter) hagVar.get());
            default:
                return new sb6((AppAnalyticsReporter) hagVar.get());
        }
    }
}
