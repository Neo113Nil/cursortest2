package yads;

import android.view.View;
import defpackage.do61;
import defpackage.z081;

/* loaded from: classes7.dex */
public final class cw implements View.OnClickListener {
    public final do61 a;
    public final z081 b;

    public cw(do61 do61Var, z081 z081Var) {
        this.a = do61Var;
        this.b = z081Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.e();
        this.b.a(o30.c);
    }
}
