package yads;

import android.view.View;
import defpackage.bi61;
import defpackage.s071;

/* loaded from: classes7.dex */
public final class bi0 implements View.OnClickListener {
    public final bi61 a;
    public final s071 b;

    public bi0(bi61 bi61Var, s071 s071Var) {
        this.a = bi61Var;
        this.b = s071Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null) {
            this.a.a(this.b.a, view);
        }
    }
}
