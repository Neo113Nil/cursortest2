package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import androidx.fragment.app.i;

/* loaded from: classes.dex */
public class h7w extends i {
    public final y18 g = (y18) sk3.I(y18.class);

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public void onAttach(Context context) {
        super.onAttach(context);
        this.g.getClass();
        a28.b(this);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onDetach() {
        super.onDetach();
        this.g.getClass();
        a28.c(this);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            Context context = getContext();
            if (window == null || context == null) {
                return;
            }
            hag.l(window, context, getTheme());
        }
    }
}
