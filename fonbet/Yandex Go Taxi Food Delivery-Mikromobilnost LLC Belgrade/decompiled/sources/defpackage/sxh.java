package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes5.dex */
public final class sxh implements zo31 {
    public final View a;
    public final FrameLayout b;

    public sxh(ViewGroup viewGroup, FrameLayout frameLayout) {
        this.a = viewGroup;
        this.b = frameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
