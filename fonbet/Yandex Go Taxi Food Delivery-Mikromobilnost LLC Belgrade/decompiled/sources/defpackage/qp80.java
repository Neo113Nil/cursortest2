package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.PlaceholderView;

/* loaded from: classes13.dex */
public final class qp80 implements zo31 {
    public final View a;
    public final PlaceholderView b;
    public final LinearLayout c;
    public final PlaceholderView d;
    public final PlaceholderView e;
    public final PlaceholderView f;
    public final LinearLayout g;
    public final PlaceholderView h;
    public final LinearLayout i;
    public final PlaceholderView j;

    public qp80(GoLinearLayout goLinearLayout, PlaceholderView placeholderView, LinearLayout linearLayout, PlaceholderView placeholderView2, PlaceholderView placeholderView3, PlaceholderView placeholderView4, LinearLayout linearLayout2, PlaceholderView placeholderView5, LinearLayout linearLayout3, PlaceholderView placeholderView6) {
        this.a = goLinearLayout;
        this.b = placeholderView;
        this.c = linearLayout;
        this.d = placeholderView2;
        this.e = placeholderView3;
        this.f = placeholderView4;
        this.g = linearLayout2;
        this.h = placeholderView5;
        this.i = linearLayout3;
        this.j = placeholderView6;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
