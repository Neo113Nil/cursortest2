package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.ybsdk.widgets.common.AdLabelView;
import com.ybsdk.widgets.common.ScrollableNestedScrollView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView;

/* loaded from: classes4.dex */
public final class y061 implements zo31 {
    public final CommunicationFullScreenView a;
    public final ScrollableNestedScrollView b;
    public final FrameLayout c;
    public final AdLabelView d;
    public final YbButtonViewGroup e;

    public y061(CommunicationFullScreenView communicationFullScreenView, ScrollableNestedScrollView scrollableNestedScrollView, FrameLayout frameLayout, AdLabelView adLabelView, YbButtonViewGroup ybButtonViewGroup) {
        this.a = communicationFullScreenView;
        this.b = scrollableNestedScrollView;
        this.c = frameLayout;
        this.d = adLabelView;
        this.e = ybButtonViewGroup;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
