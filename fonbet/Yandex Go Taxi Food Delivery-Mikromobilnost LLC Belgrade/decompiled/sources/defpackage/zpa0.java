package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class zpa0 implements zo31 {
    public final ConstraintLayout a;
    public final View b;
    public final TextView c;

    public zpa0(ConstraintLayout constraintLayout, View view, TextView textView) {
        this.a = constraintLayout;
        this.b = view;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
