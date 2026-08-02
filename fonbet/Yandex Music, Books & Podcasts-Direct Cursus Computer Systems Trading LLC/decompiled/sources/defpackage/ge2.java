package defpackage;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class ge2 {
    public static AutofillValue a(String str) {
        return AutofillValue.forText(str);
    }

    public static void b(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public static void c(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    public static void d(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    public static void e(ViewStructure viewStructure, AutofillValue autofillValue) {
        viewStructure.setAutofillValue(autofillValue);
    }

    public static void f(ViewStructure viewStructure) {
        viewStructure.setDataIsSensitive(true);
    }

    public static void g(ViewStructure viewStructure) {
        viewStructure.setInputType(129);
    }
}
