package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class yc30 implements zo31 {
    public final ConstraintLayout a;
    public final LinearLayout b;
    public final GoImageView c;
    public final FrameLayout d;
    public final RobotoTextView e;
    public final RobotoTextView f;
    public final RobotoTextView g;

    public yc30(ConstraintLayout constraintLayout, LinearLayout linearLayout, GoImageView goImageView, FrameLayout frameLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.a = constraintLayout;
        this.b = linearLayout;
        this.c = goImageView;
        this.d = frameLayout;
        this.e = robotoTextView;
        this.f = robotoTextView2;
        this.g = robotoTextView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
