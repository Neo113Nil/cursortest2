package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public final class z461 implements zo31 {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;

    public z461(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
