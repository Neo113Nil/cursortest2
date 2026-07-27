package F3;

import O.C0336b;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import m.Z;

/* loaded from: classes2.dex */
public final class E extends C0336b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f1013d;

    public E(TextInputLayout textInputLayout) {
        this.f1013d = textInputLayout;
    }

    @Override // O.C0336b
    public final void d(View view, P.k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2248a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2675a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f1013d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z8 = textInputLayout.f36278a1;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z9 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        A a9 = textInputLayout.f36294u;
        Z z10 = a9.f1000u;
        if (z10.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(z10);
            accessibilityNodeInfo.setTraversalAfter(z10);
        } else {
            accessibilityNodeInfo.setTraversalAfter(a9.f1002w);
        }
        if (!isEmpty) {
            kVar.l(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            kVar.l(charSequence);
            if (!z8 && placeholderText != null) {
                kVar.l(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            kVar.l(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                kVar.k(charSequence);
            } else {
                if (!isEmpty) {
                    charSequence = ((Object) text) + ", " + charSequence;
                }
                kVar.l(charSequence);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                kVar.h(4, isEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z9) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        Z z11 = textInputLayout.f36235C.f1119y;
        if (z11 != null) {
            accessibilityNodeInfo.setLabelFor(z11);
        }
        textInputLayout.f36296v.b().n(kVar);
    }

    @Override // O.C0336b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f1013d.f36296v.b().o(accessibilityEvent);
    }
}
