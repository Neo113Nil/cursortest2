package yads;

import android.content.Context;
import android.view.View;
import defpackage.dc81;
import defpackage.ep81;
import defpackage.m671;
import defpackage.ps81;
import defpackage.q191;
import defpackage.ro81;
import defpackage.tp81;
import kotlin.collections.b;

/* loaded from: classes7.dex */
public final class us0 implements View.OnClickListener {
    public final tp81 a;
    public final ro81 b;
    public final ep81 c;
    public final ps81 d;
    public final q191 e;

    public us0(tp81 tp81Var, ro81 ro81Var, ep81 ep81Var, ps81 ps81Var, q191 q191Var) {
        this.a = tp81Var;
        this.b = ro81Var;
        this.c = ep81Var;
        this.d = ps81Var;
        this.e = q191Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.d.a("feedback");
        this.e.a(this.a.b(), b.f());
        tp81 tp81Var = this.a;
        if (tp81Var instanceof m671) {
            this.b.b(view, (m671) tp81Var);
            return;
        }
        if (tp81Var instanceof dc81) {
            ep81 ep81Var = this.c;
            Context context = view.getContext();
            dc81 dc81Var = (dc81) tp81Var;
            if (ep81.d) {
                return;
            }
            ep81Var.a(ep81Var.b.w(context, dc81Var));
        }
    }
}
