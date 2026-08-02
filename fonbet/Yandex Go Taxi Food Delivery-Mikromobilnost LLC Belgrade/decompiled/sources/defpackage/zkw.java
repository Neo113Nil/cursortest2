package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes14.dex */
public final class zkw implements zo31 {
    public final FrameLayout a;
    public final ImageView b;
    public final ImageView c;
    public final ho4 d;
    public final TextView e;
    public final TextView f;
    public final ImageView g;

    public zkw(FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ho4 ho4Var, TextView textView, TextView textView2, ImageView imageView3) {
        this.a = frameLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = ho4Var;
        this.e = textView;
        this.f = textView2;
        this.g = imageView3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
