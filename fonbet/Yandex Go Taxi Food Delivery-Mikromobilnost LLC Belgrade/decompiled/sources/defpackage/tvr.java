package defpackage;

import android.widget.EditText;

/* loaded from: classes15.dex */
public interface tvr {
    EditText d();

    default void s() {
        d().requestFocus();
        d().setSelection(d().length());
    }
}
