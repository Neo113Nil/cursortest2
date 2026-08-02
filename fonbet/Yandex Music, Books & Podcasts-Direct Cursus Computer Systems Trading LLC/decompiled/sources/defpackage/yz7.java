package defpackage;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class yz7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ b08 a;

    public yz7(b08 b08Var) {
        this.a = b08Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        b08 b08Var = this.a;
        b08Var.getDialog().setContentView(b08Var.A(false));
        b08Var.H(b08Var.q);
    }
}
