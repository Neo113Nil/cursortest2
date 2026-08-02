package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes13.dex */
public final class xgm0 implements zo31 {
    public final FrameLayout a;
    public final qzm b;
    public final nzm c;

    public xgm0(FrameLayout frameLayout, qzm qzmVar, nzm nzmVar) {
        this.a = frameLayout;
        this.b = qzmVar;
        this.c = nzmVar;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
