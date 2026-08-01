package V0;

import O.C0026b;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import m.C0245b0;

/* loaded from: classes.dex */
public final class A extends C0026b {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f1258d;

    public A(TextInputLayout textInputLayout) {
        this.f1258d = textInputLayout;
    }

    @Override // O.C0026b
    public final void d(View view, P.f fVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f785a;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f891a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f1258d;
        EditText editText = textInputLayout.getEditText();
        Editable text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z2 = textInputLayout.f2652u0;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        boolean z3 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String charSequence = !isEmpty2 ? hint.toString() : "";
        y yVar = textInputLayout.f2617b;
        C0245b0 c0245b0 = yVar.f1365b;
        if (c0245b0.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(c0245b0);
            accessibilityNodeInfo.setTraversalAfter(c0245b0);
        } else {
            accessibilityNodeInfo.setTraversalAfter(yVar.f1367d);
        }
        if (!isEmpty) {
            accessibilityNodeInfo.setText(text);
        } else if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setText(charSequence);
            if (!z2 && placeholderText != null) {
                accessibilityNodeInfo.setText(charSequence + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            accessibilityNodeInfo.setText(placeholderText);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            accessibilityNodeInfo.setHintText(charSequence);
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z3) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C0245b0 c0245b02 = textInputLayout.j.f1350y;
        if (c0245b02 != null) {
            accessibilityNodeInfo.setLabelFor(c0245b02);
        }
        textInputLayout.f2619c.b().n(fVar);
    }

    @Override // O.C0026b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f1258d.f2619c.b().o(accessibilityEvent);
    }
}
