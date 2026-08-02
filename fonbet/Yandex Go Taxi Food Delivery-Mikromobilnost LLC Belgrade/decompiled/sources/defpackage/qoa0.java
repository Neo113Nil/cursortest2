package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class qoa0 implements zo31 {
    public final ConstraintLayout a;
    public final View b;
    public final xpa0 c;
    public final ConstraintLayout d;
    public final ConstraintLayout e;
    public final TextView f;

    public qoa0(ConstraintLayout constraintLayout, View view, xpa0 xpa0Var, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TextView textView) {
        this.a = constraintLayout;
        this.b = view;
        this.c = xpa0Var;
        this.d = constraintLayout2;
        this.e = constraintLayout3;
        this.f = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
