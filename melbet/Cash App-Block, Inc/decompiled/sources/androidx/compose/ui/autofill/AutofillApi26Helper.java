package androidx.compose.ui.autofill;

import android.view.ViewStructure;
import android.view.autofill.AutofillValue;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes3.dex */
public final class AutofillApi26Helper {
    public static int addChildCount(ViewStructure viewStructure) {
        return viewStructure.addChildCount(1);
    }

    public static AutofillValue getAutofillTextValue(String str) {
        if (str.length() >= 5000) {
            str = (Character.isHighSurrogate(str.charAt(4999)) && Character.isLowSurrogate(str.charAt(5000))) ? StringsKt___StringsKt.take(4999, str) : StringsKt___StringsKt.take(5000, str);
        }
        return AutofillValue.forText(str);
    }

    public static AutofillValue getAutofillToggleValue(boolean z) {
        return AutofillValue.forToggle(z);
    }

    public static ViewStructure newChild(ViewStructure viewStructure, int i) {
        return viewStructure.newChild(i);
    }

    public static CharSequence textValue(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
