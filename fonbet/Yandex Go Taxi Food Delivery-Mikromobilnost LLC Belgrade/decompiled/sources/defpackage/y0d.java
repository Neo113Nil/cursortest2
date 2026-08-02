package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.yandex.taxi.design.ChipsComponent;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class y0d implements zo31 {
    public final ChipsComponent a;
    public final ConstraintLayout b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;
    public final PlaceholderView e;
    public final RobotoTextView f;
    public final AppCompatImageView g;
    public final RobotoTextView h;

    public y0d(ChipsComponent chipsComponent, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, PlaceholderView placeholderView, RobotoTextView robotoTextView, AppCompatImageView appCompatImageView3, RobotoTextView robotoTextView2) {
        this.a = chipsComponent;
        this.b = constraintLayout;
        this.c = appCompatImageView;
        this.d = appCompatImageView2;
        this.e = placeholderView;
        this.f = robotoTextView;
        this.g = appCompatImageView3;
        this.h = robotoTextView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
