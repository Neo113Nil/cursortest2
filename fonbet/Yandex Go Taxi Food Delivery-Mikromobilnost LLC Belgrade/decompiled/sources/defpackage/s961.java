package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public final class s961 implements zo31 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;

    public s961(ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
