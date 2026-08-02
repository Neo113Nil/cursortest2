package defpackage;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class r261 implements zo31 {
    public final TextView a;
    public final TextView b;

    public r261(TextView textView, TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
