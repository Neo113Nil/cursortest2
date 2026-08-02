package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class t161 implements zo31 {
    public final FrameLayout a;
    public final FrameLayout b;
    public final TextView c;

    public t161(FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView) {
        this.a = frameLayout;
        this.b = frameLayout2;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
