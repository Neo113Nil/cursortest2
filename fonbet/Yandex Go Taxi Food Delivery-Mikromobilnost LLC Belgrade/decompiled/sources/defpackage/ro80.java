package defpackage;

import android.view.View;
import android.view.ViewStub;
import com.yandex.go.design.view.GoFrameLayout;

/* loaded from: classes13.dex */
public final class ro80 implements zo31 {
    public final GoFrameLayout a;
    public final ViewStub b;
    public final GoFrameLayout c;

    public ro80(GoFrameLayout goFrameLayout, ViewStub viewStub, GoFrameLayout goFrameLayout2) {
        this.a = goFrameLayout;
        this.b = viewStub;
        this.c = goFrameLayout2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
