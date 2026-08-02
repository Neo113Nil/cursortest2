package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public final class v061 implements zo31 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public v061(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
