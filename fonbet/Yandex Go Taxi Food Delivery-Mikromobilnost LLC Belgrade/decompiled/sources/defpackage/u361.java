package defpackage;

import android.view.View;
import android.widget.TextView;
import com.ybsdk.widgets.common.NumberOptionView;

/* loaded from: classes4.dex */
public final class u361 implements zo31 {
    public final NumberOptionView a;
    public final TextView b;
    public final TextView c;

    public u361(NumberOptionView numberOptionView, TextView textView, TextView textView2) {
        this.a = numberOptionView;
        this.b = textView;
        this.c = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
