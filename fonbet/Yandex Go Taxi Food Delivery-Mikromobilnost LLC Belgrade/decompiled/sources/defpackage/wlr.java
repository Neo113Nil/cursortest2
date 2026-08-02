package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;

/* loaded from: classes12.dex */
public final class wlr implements zo31 {
    public final GoFrameLayout a;
    public final GoFrameLayout b;

    public wlr(GoFrameLayout goFrameLayout, GoFrameLayout goFrameLayout2) {
        this.a = goFrameLayout;
        this.b = goFrameLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
