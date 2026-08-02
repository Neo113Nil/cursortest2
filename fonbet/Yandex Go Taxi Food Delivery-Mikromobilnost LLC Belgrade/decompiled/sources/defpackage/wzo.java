package defpackage;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes13.dex */
public final class wzo extends AccessibilityDelegateCompat {
    public final String a;
    public final boolean b;
    public final boolean c;
    public Boolean w;

    public wzo(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final void a(Boolean bool) {
        this.w = bool;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        String str = this.a;
        if (str.length() > 0) {
            whVar.p(str);
        }
        whVar.a.setHeading(this.b);
        if (this.c) {
            whVar.m(true);
            Boolean bool = this.w;
            if (bool != null) {
                whVar.o(bool.booleanValue());
            }
        }
    }
}
