package J3;

import O.C0328b;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import m.Z;

/* loaded from: classes2.dex */
public final class D extends C0328b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f1456d;

    public D(TextInputLayout textInputLayout) {
        this.f1456d = textInputLayout;
    }

    @Override // O.C0328b
    public final void d(View view, P.k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2150a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2340a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f1456d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z6 = textInputLayout.f36875V0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z9 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        A a9 = textInputLayout.f36896u;
        Z z10 = a9.f1445u;
        if (z10.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(z10);
            accessibilityNodeInfo.setTraversalAfter(z10);
        } else {
            accessibilityNodeInfo.setTraversalAfter(a9.f1447w);
        }
        if (!isEmpty) {
            kVar.l(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            kVar.l(charSequence);
            if (!z6 && placeholderText != null) {
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
        Z z11 = textInputLayout.f36838C.f1562y;
        if (z11 != null) {
            accessibilityNodeInfo.setLabelFor(z11);
        }
        textInputLayout.f36898v.b().n(kVar);
    }

    @Override // O.C0328b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f1456d.f36898v.b().o(accessibilityEvent);
    }
}
