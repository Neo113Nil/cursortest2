package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class wsv extends x0 {
    public static final /* synthetic */ kgx[] P = {new PropertyReference1Impl("titleTextView", 0, "getTitleTextView()Landroid/widget/TextView;", wsv.class), b64.x(qoi0.a, wsv.class, "valueTextView", "getValueTextView()Landroid/widget/TextView;", 0)};
    public final wv5 N;
    public final wv5 O;

    public wsv(View view) {
        super(view);
        this.N = new wv5(new sdg(view, x9h0.debug_info_title, 21));
        wv5 wv5Var = new wv5(new sdg(view, x9h0.debug_info_value, 22));
        this.O = wv5Var;
        bb1.L((TextView) wv5Var.a(P[1]), new vsn(15, view, this));
    }
}
