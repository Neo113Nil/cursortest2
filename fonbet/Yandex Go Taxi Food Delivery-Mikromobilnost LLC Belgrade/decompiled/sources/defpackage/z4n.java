package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes13.dex */
public final class z4n implements zo31 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ConstraintLayout c;
    public final ImageView d;
    public final LinearLayout e;
    public final AppCompatTextView f;
    public final ImageView g;

    public z4n(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, ImageView imageView2, LinearLayout linearLayout, AppCompatTextView appCompatTextView, ImageView imageView3) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = constraintLayout2;
        this.d = imageView2;
        this.e = linearLayout;
        this.f = appCompatTextView;
        this.g = imageView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
