package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import ru.yandex.taxi.widget.ButtonsView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class xws implements zo31 {
    public final LinearLayout a;
    public final ButtonsView b;
    public final ImageView c;
    public final ImageView d;
    public final RobotoTextView e;
    public final AppCompatImageView f;
    public final View g;
    public final NestedScrollView h;
    public final ImageView i;

    public xws(LinearLayout linearLayout, ButtonsView buttonsView, ImageView imageView, ImageView imageView2, RobotoTextView robotoTextView, AppCompatImageView appCompatImageView, View view, NestedScrollView nestedScrollView, ImageView imageView3) {
        this.a = linearLayout;
        this.b = buttonsView;
        this.c = imageView;
        this.d = imageView2;
        this.e = robotoTextView;
        this.f = appCompatImageView;
        this.g = view;
        this.h = nestedScrollView;
        this.i = imageView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
