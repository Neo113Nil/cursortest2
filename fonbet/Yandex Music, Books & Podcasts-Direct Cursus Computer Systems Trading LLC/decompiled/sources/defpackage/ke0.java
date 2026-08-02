package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.a;

/* loaded from: classes.dex */
public final class ke0 extends a {
    public final /* synthetic */ AndroidComposeView d;
    public final /* synthetic */ mpf e;
    public final /* synthetic */ AndroidComposeView f;

    public ke0(AndroidComposeView androidComposeView, mpf mpfVar, AndroidComposeView androidComposeView2) {
        this.d = androidComposeView;
        this.e = mpfVar;
        this.f = androidComposeView2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4.intValue() == r8.getSemanticsOwner().a().g) goto L19;
     */
    @Override // androidx.core.view.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(View view, vb vbVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = vbVar.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        AndroidComposeView androidComposeView = this.d;
        ye0 ye0Var = androidComposeView.p;
        if (ye0Var.u()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        mpf mpfVar = this.e;
        mpf u = mpfVar.u();
        while (true) {
            if (u == null) {
                u = null;
                break;
            } else if (u.F.M(8)) {
                break;
            } else {
                u = u.u();
            }
        }
        Integer valueOf = u != null ? Integer.valueOf(u.b) : null;
        if (valueOf != null) {
        }
        valueOf = -1;
        int intValue = valueOf.intValue();
        vbVar.b = intValue;
        AndroidComposeView androidComposeView2 = this.f;
        accessibilityNodeInfo.setParent(androidComposeView2, intValue);
        int i = mpfVar.b;
        int d = ye0Var.E.d(i);
        if (d != -1) {
            oj0 q0 = bkp.q0(androidComposeView.getAndroidViewsHandler$ui_release(), d);
            if (q0 != null) {
                accessibilityNodeInfo.setTraversalBefore(q0);
            } else {
                accessibilityNodeInfo.setTraversalBefore(androidComposeView2, d);
            }
            AndroidComposeView.b(androidComposeView, i, accessibilityNodeInfo, ye0Var.G);
        }
        int d2 = ye0Var.F.d(i);
        if (d2 != -1) {
            oj0 q02 = bkp.q0(androidComposeView.getAndroidViewsHandler$ui_release(), d2);
            if (q02 != null) {
                accessibilityNodeInfo.setTraversalAfter(q02);
            } else {
                accessibilityNodeInfo.setTraversalAfter(androidComposeView2, d2);
            }
            AndroidComposeView.b(androidComposeView, i, accessibilityNodeInfo, ye0Var.H);
        }
    }
}
