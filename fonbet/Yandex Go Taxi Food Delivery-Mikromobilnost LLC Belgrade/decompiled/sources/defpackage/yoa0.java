package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class yoa0 implements zo31 {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final LinearLayout d;

    public yoa0(ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, LinearLayout linearLayout) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = linearLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
