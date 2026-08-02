package defpackage;

import android.view.View;
import androidx.core.view.a;

/* loaded from: classes3.dex */
public final class o1c extends a {
    public final String d;
    public final boolean e;
    public final boolean f;
    public Boolean g;

    public o1c(String str, boolean z, boolean z2) {
        this.d = str;
        this.e = z;
        this.f = z2;
    }

    @Override // androidx.core.view.a
    public final void d(View view, vb vbVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, vbVar.a);
        String str = this.d;
        if (str.length() > 0) {
            vbVar.n(str);
        }
        vbVar.s(this.e);
        if (this.f) {
            vbVar.l(true);
            Boolean bool = this.g;
            if (bool != null) {
                vbVar.m(bool.booleanValue());
            }
        }
    }
}
