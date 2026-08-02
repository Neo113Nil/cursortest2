package defpackage;

import android.view.View;
import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class he8 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ pe8 b;
    public final /* synthetic */ gc8 c;
    public final /* synthetic */ xzb d;
    public final /* synthetic */ View e;
    public final /* synthetic */ szb f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ he8(e23 e23Var, gc8 gc8Var, pe8 pe8Var, szb szbVar, xzb xzbVar, View view, List list) {
        this.f = szbVar;
        this.c = gc8Var;
        this.d = xzbVar;
        this.b = pe8Var;
        this.g = e23Var;
        this.e = view;
        this.h = list;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                e23 e23Var = (e23) this.g;
                List list = (List) this.h;
                q6k.h(view, this.f, this.c.getInputFocusTracker$div_release(), this.d);
                this.b.a.d(e23Var, this.e, list, "click");
                break;
            default:
                bd8 bd8Var = (bd8) this.g;
                j6e j6eVar = (j6e) this.h;
                pe8 pe8Var = this.b;
                yb8 yb8Var = pe8Var.b;
                gc8 gc8Var = this.c;
                xzb xzbVar = this.d;
                View view2 = this.e;
                yb8Var.b(gc8Var, xzbVar, view2, bd8Var);
                pe8Var.c.b(bd8Var, xzbVar);
                q6k.h(view, this.f, gc8Var.getInputFocusTracker$div_release(), xzbVar);
                new ol(27, j6eVar).onClick(view2);
                break;
        }
    }

    public /* synthetic */ he8(pe8 pe8Var, gc8 gc8Var, xzb xzbVar, View view, bd8 bd8Var, szb szbVar, j6e j6eVar) {
        this.b = pe8Var;
        this.c = gc8Var;
        this.d = xzbVar;
        this.e = view;
        this.g = bd8Var;
        this.f = szbVar;
        this.h = j6eVar;
    }
}
