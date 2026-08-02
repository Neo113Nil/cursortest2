package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes12.dex */
public final class tar implements zo31 {
    public final FrameLayout a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final FrameLayout d;

    public tar(FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, FrameLayout frameLayout4) {
        this.a = frameLayout;
        this.b = frameLayout2;
        this.c = frameLayout3;
        this.d = frameLayout4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
