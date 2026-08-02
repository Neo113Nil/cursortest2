package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;

/* loaded from: classes14.dex */
public final class rdw implements zo31 {
    public final GoFrameLayout a;
    public final GoFrameLayout b;
    public final View c;

    public rdw(GoFrameLayout goFrameLayout, GoFrameLayout goFrameLayout2, View view) {
        this.a = goFrameLayout;
        this.b = goFrameLayout2;
        this.c = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
