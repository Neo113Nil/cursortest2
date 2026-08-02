package defpackage;

import android.view.View;
import android.view.ViewStub;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.mainscreen.superapp.impl.foundation.presentation.sidepager.MainSidePager;

/* loaded from: classes.dex */
public final class r1w0 implements zo31 {
    public final GoFrameLayout a;
    public final GoFrameLayout b;
    public final GoFrameLayout c;
    public final GoFrameLayout d;
    public final MainSidePager e;
    public final ViewStub f;
    public final GoFrameLayout g;

    public r1w0(GoFrameLayout goFrameLayout, GoFrameLayout goFrameLayout2, GoFrameLayout goFrameLayout3, GoFrameLayout goFrameLayout4, MainSidePager mainSidePager, ViewStub viewStub, GoFrameLayout goFrameLayout5) {
        this.a = goFrameLayout;
        this.b = goFrameLayout2;
        this.c = goFrameLayout3;
        this.d = goFrameLayout4;
        this.e = mainSidePager;
        this.f = viewStub;
        this.g = goFrameLayout5;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
