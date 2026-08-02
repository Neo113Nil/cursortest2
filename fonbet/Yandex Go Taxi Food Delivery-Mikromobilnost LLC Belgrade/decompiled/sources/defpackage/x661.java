package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.ybsdk.widgets.common.ErrorView;

/* loaded from: classes3.dex */
public final class x661 implements zo31 {
    public final FrameLayout a;
    public final ErrorView b;
    public final CircularProgressIndicator c;

    public x661(FrameLayout frameLayout, ErrorView errorView, CircularProgressIndicator circularProgressIndicator) {
        this.a = frameLayout;
        this.b = errorView;
        this.c = circularProgressIndicator;
    }

    public static x661 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(coh0.ybsdk_screen_empty_link_resolver, viewGroup, false);
        int i = sbh0.errorView;
        ErrorView errorView = (ErrorView) cma1.O(i, inflate);
        if (errorView != null) {
            i = sbh0.progressView;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) cma1.O(i, inflate);
            if (circularProgressIndicator != null) {
                return new x661((FrameLayout) inflate, errorView, circularProgressIndicator);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
