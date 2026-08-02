package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes11.dex */
public final class t241 extends AccessibilityDelegateCompat {
    public final /* synthetic */ View a;
    public final /* synthetic */ AccessibilityDelegateCompat b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ int w;
    public final /* synthetic */ sls x;

    public t241(View view, AccessibilityDelegateCompat accessibilityDelegateCompat, sls slsVar, int i, sls slsVar2) {
        this.a = view;
        this.b = accessibilityDelegateCompat;
        this.c = slsVar;
        this.w = i;
        this.x = slsVar2;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            sls slsVar = this.c;
            View view2 = this.a;
            view2.post(new mbb(slsVar, view2, this.w, this.x, 7));
        }
        AccessibilityDelegateCompat accessibilityDelegateCompat = this.b;
        return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
