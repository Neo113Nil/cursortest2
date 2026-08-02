package defpackage;

import com.yandex.go.intercity.flex.dashboard.view.IntercityDashboardFlexSdkView;
import java.util.List;

/* loaded from: classes12.dex */
public final class xew implements i3m {
    public final /* synthetic */ IntercityDashboardFlexSdkView a;

    public xew(IntercityDashboardFlexSdkView intercityDashboardFlexSdkView) {
        this.a = intercityDashboardFlexSdkView;
    }

    @Override // defpackage.i3m
    public final void dispose() {
    }

    @Override // defpackage.i3m
    public final void onDocumentApplied(l1o l1oVar, xzl xzlVar, List list) {
        this.a.setProgressVisibility(false);
    }

    @Override // defpackage.i3m
    public final void onDocumentLoadingFailed(l1o l1oVar, u1m u1mVar, Throwable th, List list) {
        this.a.setProgressVisibility(false);
    }
}
