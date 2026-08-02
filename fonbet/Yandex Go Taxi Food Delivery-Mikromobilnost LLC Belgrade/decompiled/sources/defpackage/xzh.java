package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* loaded from: classes12.dex */
public final class xzh implements zo31 {
    public final LinearLayout a;
    public final FrameLayout b;
    public final FrameLayout c;

    public xzh(LinearLayout linearLayout, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.a = linearLayout;
        this.b = frameLayout;
        this.c = frameLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
