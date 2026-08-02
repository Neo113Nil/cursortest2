package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.go.design.view.GoFrameLayout;

/* loaded from: classes14.dex */
public final class vjw implements zo31 {
    public final GoFrameLayout a;
    public final ImageView b;
    public final ho4 c;
    public final TextView d;
    public final TextView e;

    public vjw(GoFrameLayout goFrameLayout, ImageView imageView, ho4 ho4Var, TextView textView, TextView textView2) {
        this.a = goFrameLayout;
        this.b = imageView;
        this.c = ho4Var;
        this.d = textView;
        this.e = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
