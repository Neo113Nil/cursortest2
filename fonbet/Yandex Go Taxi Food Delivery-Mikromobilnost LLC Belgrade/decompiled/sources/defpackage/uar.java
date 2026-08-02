package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes12.dex */
public final class uar implements zo31 {
    public final FrameLayout a;
    public final FrameLayout b;

    public uar(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.b = frameLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
