package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.feature.passes.widget.api.presentation.PassesWidgetErrorView;

/* loaded from: classes3.dex */
public final class y361 implements zo31 {
    public final FrameLayout a;
    public final YbDivView b;
    public final FrameLayout c;
    public final PassesWidgetErrorView d;
    public final DivSkeletonsView e;

    public y361(FrameLayout frameLayout, YbDivView ybDivView, FrameLayout frameLayout2, PassesWidgetErrorView passesWidgetErrorView, DivSkeletonsView divSkeletonsView) {
        this.a = frameLayout;
        this.b = ybDivView;
        this.c = frameLayout2;
        this.d = passesWidgetErrorView;
        this.e = divSkeletonsView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
