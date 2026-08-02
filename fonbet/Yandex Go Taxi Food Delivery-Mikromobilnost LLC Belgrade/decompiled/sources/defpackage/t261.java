package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public final class t261 implements zo31 {
    public final ConstraintLayout a;
    public final TextView b;

    public t261(ConstraintLayout constraintLayout, TextView textView) {
        this.a = constraintLayout;
        this.b = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
