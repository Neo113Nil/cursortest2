package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.intercity.flex.dashboard.view.IntercityDashboardFlexSdkView;

/* loaded from: classes12.dex */
public final class qlr implements zo31 {
    public final IntercityDashboardFlexSdkView a;
    public final FrameLayout b;
    public final GoFrameLayout c;

    public qlr(IntercityDashboardFlexSdkView intercityDashboardFlexSdkView, FrameLayout frameLayout, GoFrameLayout goFrameLayout) {
        this.a = intercityDashboardFlexSdkView;
        this.b = frameLayout;
        this.c = goFrameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
