package com.gamericefishpro.space.na;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.gamericefishpro.space.n.i0;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends com.gamericefishpro.space.d4.b {
    public final TextInputLayout v;

    public y(TextInputLayout textInputLayout) {
        this.v = textInputLayout;
    }

    @Override // com.gamericefishpro.space.d4.b
    public final void d(View view, com.gamericefishpro.space.e4.h hVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.a;
        this.d.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.v;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.O0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        v vVar = textInputLayout.e;
        i0 i0Var = vVar.e;
        if (i0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(i0Var);
            accessibilityNodeInfo.setTraversalAfter(i0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(vVar.v);
        }
        if (!zIsEmpty) {
            hVar.k(text);
        } else if (!TextUtils.isEmpty(string)) {
            hVar.k(string);
            if (!z && placeholderText != null) {
                hVar.k(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            hVar.k(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setHintText(string);
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        i0 i0Var2 = textInputLayout.D.y;
        if (i0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(i0Var2);
        }
        textInputLayout.i.b().m(hVar);
    }

    @Override // com.gamericefishpro.space.d4.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.v.i.b().n(accessibilityEvent);
    }
}
