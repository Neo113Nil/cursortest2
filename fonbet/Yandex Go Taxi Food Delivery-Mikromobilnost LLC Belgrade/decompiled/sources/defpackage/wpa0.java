package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class wpa0 implements zo31 {
    public final LinearLayout a;
    public final ImageView b;
    public final ConstraintLayout c;
    public final FrameLayout d;

    public wpa0(LinearLayout linearLayout, ImageView imageView, ConstraintLayout constraintLayout, FrameLayout frameLayout) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = constraintLayout;
        this.d = frameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
