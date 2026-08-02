package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.tariffcard.ui.adapter.header.multiclass.MulticlassHeaderMapView;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringRobotoTextView;

/* loaded from: classes14.dex */
public final class wcx0 implements zo31 {
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final RobotoTextView c;
    public final MulticlassHeaderMapView d;
    public final PlaceholderView e;
    public final PlaceholderView f;
    public final Flow g;
    public final RobotoTextView h;
    public final AppCompatImageView i;
    public final ShimmeringRobotoTextView j;
    public final ShimmeringRobotoTextView k;
    public final ShimmeringRobotoTextView l;
    public final RobotoTextView m;
    public final PlaceholderView n;

    public wcx0(ConstraintLayout constraintLayout, LinearLayout linearLayout, RobotoTextView robotoTextView, MulticlassHeaderMapView multiclassHeaderMapView, PlaceholderView placeholderView, PlaceholderView placeholderView2, Flow flow, RobotoTextView robotoTextView2, AppCompatImageView appCompatImageView, ShimmeringRobotoTextView shimmeringRobotoTextView, ShimmeringRobotoTextView shimmeringRobotoTextView2, ShimmeringRobotoTextView shimmeringRobotoTextView3, RobotoTextView robotoTextView3, PlaceholderView placeholderView3) {
        this.a = constraintLayout;
        this.b = linearLayout;
        this.c = robotoTextView;
        this.d = multiclassHeaderMapView;
        this.e = placeholderView;
        this.f = placeholderView2;
        this.g = flow;
        this.h = robotoTextView2;
        this.i = appCompatImageView;
        this.j = shimmeringRobotoTextView;
        this.k = shimmeringRobotoTextView2;
        this.l = shimmeringRobotoTextView3;
        this.m = robotoTextView3;
        this.n = placeholderView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
