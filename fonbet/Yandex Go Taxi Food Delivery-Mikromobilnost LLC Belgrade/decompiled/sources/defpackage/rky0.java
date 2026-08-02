package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes5.dex */
public final class rky0 implements zo31 {
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final GoImageView c;
    public final ImageView d;
    public final RobotoTextView e;
    public final RobotoTextView f;
    public final FrameLayout g;

    public rky0(ConstraintLayout constraintLayout, LinearLayout linearLayout, GoImageView goImageView, ImageView imageView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, FrameLayout frameLayout) {
        this.a = constraintLayout;
        this.b = linearLayout;
        this.c = goImageView;
        this.d = imageView;
        this.e = robotoTextView;
        this.f = robotoTextView2;
        this.g = frameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
