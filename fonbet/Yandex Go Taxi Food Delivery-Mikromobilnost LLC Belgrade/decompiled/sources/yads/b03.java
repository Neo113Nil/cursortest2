package yads;

import android.view.View;
import defpackage.cz61;
import defpackage.g371;

/* loaded from: classes7.dex */
public final class b03 implements View.OnClickListener {
    public final cz61 a;
    public final g371 b;

    public b03(cz61 cz61Var) {
        g371 g371Var = new g371();
        this.a = cz61Var;
        this.b = g371Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.a(view.getContext(), this.a.a);
    }
}
