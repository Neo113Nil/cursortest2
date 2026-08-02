package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes2.dex */
public final class yq31 extends AccessibilityDelegateCompat {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;

    public yq31(View view, int i) {
        this.a = view;
        this.b = i;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        this.a.setImportantForAccessibility(this.b);
        return super.performAccessibilityAction(view, i, bundle);
    }
}
