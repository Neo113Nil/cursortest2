package defpackage;

import android.view.View;
import java.util.List;

/* loaded from: classes3.dex */
public final class xz8 implements View.OnFocusChangeListener {
    public final e23 a;
    public op8 b;
    public op8 c;
    public List d;
    public List e;
    public final /* synthetic */ znk f;

    public xz8(znk znkVar, e23 e23Var) {
        this.f = znkVar;
        this.a = e23Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        op8 op8Var = this.b;
        znk znkVar = this.f;
        e23 e23Var = this.a;
        if (z) {
            znk.t(e23Var, op8Var, view);
            List list = this.d;
            if (list != null) {
                ((qg8) znkVar.b).d(e23Var, view, list, "focus");
                return;
            }
            return;
        }
        if (op8Var != null) {
            znk.t(e23Var, this.c, view);
        }
        List list2 = this.e;
        if (list2 != null) {
            ((qg8) znkVar.b).d(e23Var, view, list2, "blur");
        }
    }
}
