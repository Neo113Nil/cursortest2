package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ybsdk.widgets.common.FrameLayoutAddViewAware;

/* loaded from: classes4.dex */
public final class s861 implements zo31 {
    public final FrameLayout a;
    public final FrameLayout b;
    public final View c;
    public final nzm d;
    public final ImageView e;
    public final View f;
    public final FrameLayoutAddViewAware g;
    public final FrameLayout h;
    public final View i;

    public s861(FrameLayout frameLayout, FrameLayout frameLayout2, View view, nzm nzmVar, ImageView imageView, View view2, FrameLayoutAddViewAware frameLayoutAddViewAware, FrameLayout frameLayout3, View view3) {
        this.a = frameLayout;
        this.b = frameLayout2;
        this.c = view;
        this.d = nzmVar;
        this.e = imageView;
        this.f = view2;
        this.g = frameLayoutAddViewAware;
        this.h = frameLayout3;
        this.i = view3;
    }

    public static s861 o(View view) {
        View O;
        View O2;
        View O3;
        View O4;
        int i = jah0.childNavigationContainer;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, view);
        if (frameLayout != null && (O = cma1.O((i = jah0.fullViewportStubView), view)) != null && (O2 = cma1.O((i = jah0.grip), view)) != null) {
            nzm nzmVar = new nzm(O2, 15, O2);
            FrameLayout frameLayout2 = (FrameLayout) view;
            i = jah0.slideableViewBackButton;
            ImageView imageView = (ImageView) cma1.O(i, view);
            if (imageView != null && (O3 = cma1.O((i = jah0.ybSdkTooltipFromDeeplinkAnchor), view)) != null) {
                i = fch0.ybsdkBottomSheetDialogContainer;
                FrameLayoutAddViewAware frameLayoutAddViewAware = (FrameLayoutAddViewAware) cma1.O(i, view);
                if (frameLayoutAddViewAware != null) {
                    i = fch0.ybsdkPlusSdkBottomSheetContainer;
                    FrameLayout frameLayout3 = (FrameLayout) cma1.O(i, view);
                    if (frameLayout3 != null && (O4 = cma1.O((i = fch0.ybsdkSnackbarAnchor), view)) != null) {
                        return new s861(frameLayout2, frameLayout, O, nzmVar, imageView, O3, frameLayoutAddViewAware, frameLayout3, O4);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
