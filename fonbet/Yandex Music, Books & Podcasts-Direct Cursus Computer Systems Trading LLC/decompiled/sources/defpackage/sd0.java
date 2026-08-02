package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class sd0 extends le2 implements kfp, soc {
    public final ke2 a;
    public final tfp b;
    public final AndroidComposeView c;
    public final znn d;
    public final String e;
    public final Rect f = new Rect();
    public final AutofillId g;
    public final toi h;
    public boolean i;

    public sd0(ke2 ke2Var, tfp tfpVar, AndroidComposeView androidComposeView, znn znnVar, String str) {
        this.a = ke2Var;
        this.b = tfpVar;
        this.c = androidComposeView;
        this.d = znnVar;
        this.e = str;
        androidComposeView.setImportantForAutofill(1);
        ke2 p = hag.p(androidComposeView);
        AutofillId autofillId = p != null ? (AutofillId) p.a : null;
        if (autofillId == null) {
            throw ouj.f("Required value was null.");
        }
        this.g = autofillId;
        this.h = new toi();
    }

    public final void a(SparseArray sparseArray) {
        jfp w;
        Function1 function1;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue f = wb8.f(sparseArray.get(keyAt));
            if (f.isText()) {
                mpf mpfVar = (mpf) this.b.c.b(keyAt);
                if (mpfVar != null && (w = mpfVar.w()) != null) {
                    Object g = w.a.g(hfp.g);
                    if (g == null) {
                        g = null;
                    }
                    sa saVar = (sa) g;
                    if (saVar != null && (function1 = (Function1) saVar.b) != null) {
                    }
                }
            } else if (f.isDate()) {
                Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
            } else if (f.isList()) {
                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
            } else if (f.isToggle()) {
                Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
            }
        }
    }
}
