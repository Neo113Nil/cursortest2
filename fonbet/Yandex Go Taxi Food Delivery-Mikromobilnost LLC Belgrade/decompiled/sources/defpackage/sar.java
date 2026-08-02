package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes12.dex */
public final class sar implements zo31 {
    public final ConstraintLayout a;
    public final View b;
    public final TextView c;

    public sar(ConstraintLayout constraintLayout, View view, TextView textView) {
        this.a = constraintLayout;
        this.b = view;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
