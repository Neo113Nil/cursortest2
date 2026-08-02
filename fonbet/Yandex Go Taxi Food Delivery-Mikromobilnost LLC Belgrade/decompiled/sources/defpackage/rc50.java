package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class rc50 implements zo31 {
    public final GoFrameLayout a;
    public final RobotoTextView b;

    public rc50(GoFrameLayout goFrameLayout, RobotoTextView robotoTextView) {
        this.a = goFrameLayout;
        this.b = robotoTextView;
    }

    public static rc50 o(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(fuh0.navigator_layout_route_summary_balloon, (ViewGroup) null, false);
        int i = z5h0.textview;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
        if (robotoTextView != null) {
            return new rc50((GoFrameLayout) inflate, robotoTextView);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
