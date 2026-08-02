package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public final class ch4 extends FrameLayout {
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        parent.getClass();
        ((ViewGroup) parent).isShown();
    }
}
