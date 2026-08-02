package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes5.dex */
public final class r9i implements zo31 {
    public final FrameLayout a;
    public final FrameLayout b;

    public r9i(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.b = frameLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
