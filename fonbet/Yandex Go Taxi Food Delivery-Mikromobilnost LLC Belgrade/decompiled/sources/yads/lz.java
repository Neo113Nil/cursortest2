package yads;

import android.view.View;
import defpackage.b571;
import defpackage.ew81;

/* loaded from: classes7.dex */
public abstract class lz implements View.OnClickListener {
    public final b571 a;
    public final ew81 b;

    public lz(b571 b571Var, ew81 ew81Var) {
        this.a = b571Var;
        this.b = ew81Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ew81 ew81Var = this.b;
        if (ew81Var != null) {
            ew81Var.a();
            ew81Var.e = false;
        }
        b571 b571Var = this.a;
        if (b571Var.c) {
            b571Var.a("first_click_on_controls");
            b571Var.c = false;
        }
    }
}
