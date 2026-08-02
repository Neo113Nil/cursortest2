package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;

/* loaded from: classes3.dex */
public final class qm01 implements v7p {
    public final /* synthetic */ int a;
    public final hag b;

    public /* synthetic */ qm01(hag hagVar, int i) {
        this.a = i;
        this.b = hagVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        hag hagVar = this.b;
        switch (i) {
        }
        return new us3((AppAnalyticsReporter) hagVar.get());
    }
}
