package yads;

import android.app.Dialog;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import defpackage.gs71;
import defpackage.nga1;

/* loaded from: classes7.dex */
public final class mb implements View.OnClickListener {
    public final Dialog a;
    public final gs71 b;

    public mb(Dialog dialog, gs71 gs71Var) {
        this.a = dialog;
        this.b = gs71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.getClass();
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        nga1.c(this.a);
    }
}
