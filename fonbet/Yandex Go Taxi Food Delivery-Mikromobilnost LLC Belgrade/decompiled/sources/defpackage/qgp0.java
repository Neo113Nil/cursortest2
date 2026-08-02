package defpackage;

import android.os.Build;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.android.FlutterView;

/* loaded from: classes4.dex */
public final class qgp0 {
    public final InputMethodManager a;
    public final FlutterView b;

    public qgp0(FlutterView flutterView, InputMethodManager inputMethodManager, pgp0 pgp0Var) {
        if (Build.VERSION.SDK_INT >= 33) {
            flutterView.setAutoHandwritingEnabled(false);
        }
        this.b = flutterView;
        this.a = inputMethodManager;
        pgp0Var.a = this;
    }
}
