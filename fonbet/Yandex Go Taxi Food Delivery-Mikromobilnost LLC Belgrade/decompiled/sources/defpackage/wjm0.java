package defpackage;

import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class wjm0 implements g18 {
    public final jp2 a;
    public GoFrameLayout b;

    public wjm0(jp2 jp2Var) {
        this.a = jp2Var;
    }

    @Override // defpackage.g18
    public final void cancel() {
        GoFrameLayout goFrameLayout = this.b;
        if (goFrameLayout != null) {
            WeakHashMap weakHashMap = b.a;
            ViewCompat$Api21Impl.o(goFrameLayout, null);
        }
        this.b = null;
    }
}
