package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class x261 implements zo31 {
    public final LinearLayout a;
    public final TextView b;
    public final TextView c;

    public x261(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
