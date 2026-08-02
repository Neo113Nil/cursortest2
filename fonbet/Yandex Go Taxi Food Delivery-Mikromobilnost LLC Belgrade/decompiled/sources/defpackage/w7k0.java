package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.CheckBoxComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes13.dex */
public final class w7k0 implements zo31 {
    public final GoConstraintLayout a;
    public final RobotoTextView b;
    public final ShimmeringBar c;
    public final CheckBoxComponent d;
    public final ImageView e;
    public final RobotoTextView f;

    public w7k0(GoConstraintLayout goConstraintLayout, RobotoTextView robotoTextView, ShimmeringBar shimmeringBar, CheckBoxComponent checkBoxComponent, ImageView imageView, RobotoTextView robotoTextView2) {
        this.a = goConstraintLayout;
        this.b = robotoTextView;
        this.c = shimmeringBar;
        this.d = checkBoxComponent;
        this.e = imageView;
        this.f = robotoTextView2;
    }

    public static w7k0 o(View view) {
        int i = u7h0.eta;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, view);
        if (robotoTextView != null) {
            i = u7h0.eta_shimmer;
            ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i, view);
            if (shimmeringBar != null) {
                i = u7h0.selectionCheckBox;
                CheckBoxComponent checkBoxComponent = (CheckBoxComponent) cma1.O(i, view);
                if (checkBoxComponent != null) {
                    i = u7h0.subtitle_container;
                    if (((GoLinearLayout) cma1.O(i, view)) != null) {
                        i = u7h0.tariffBackground;
                        if (((ImageView) cma1.O(i, view)) != null) {
                            i = u7h0.tariffImage;
                            ImageView imageView = (ImageView) cma1.O(i, view);
                            if (imageView != null) {
                                i = u7h0.title;
                                RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, view);
                                if (robotoTextView2 != null) {
                                    return new w7k0((GoConstraintLayout) view, robotoTextView, shimmeringBar, checkBoxComponent, imageView, robotoTextView2);
                                }
                            }
                        }
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
