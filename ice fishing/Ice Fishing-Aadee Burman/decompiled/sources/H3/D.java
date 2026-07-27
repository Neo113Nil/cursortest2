package H3;

import O.C0323b;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import m.Z;

/* loaded from: classes2.dex */
public final class D extends C0323b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f1100d;

    public D(TextInputLayout textInputLayout) {
        this.f1100d = textInputLayout;
    }

    @Override // O.C0323b
    public final void d(View view, P.k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2062a;
        AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2409a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f1100d;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z3 = textInputLayout.f36113a1;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z6 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        A a9 = textInputLayout.f36129u;
        Z z9 = a9.f1089u;
        if (z9.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(z9);
            accessibilityNodeInfo.setTraversalAfter(z9);
        } else {
            accessibilityNodeInfo.setTraversalAfter(a9.f1091w);
        }
        if (!isEmpty) {
            kVar.l(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            kVar.l(charSequence);
            if (!z3 && placeholderText != null) {
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
        if (z6) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        Z z10 = textInputLayout.f36070C.f1206y;
        if (z10 != null) {
            accessibilityNodeInfo.setLabelFor(z10);
        }
        textInputLayout.f36131v.b().n(kVar);
    }

    @Override // O.C0323b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f1100d.f36131v.b().o(accessibilityEvent);
    }
}
