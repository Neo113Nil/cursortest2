package defpackage;

import android.view.View;
import android.view.ViewStub;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes13.dex */
public final class tl80 implements zo31 {
    public final GoFrameLayout a;
    public final ViewStub b;
    public final ViewStub c;
    public final GoView d;
    public final ButtonComponent e;
    public final GoFrameLayout f;
    public final ShimmeringFrameLayout g;
    public final GoLinearLayout h;

    public tl80(GoFrameLayout goFrameLayout, ViewStub viewStub, ViewStub viewStub2, GoView goView, ButtonComponent buttonComponent, GoFrameLayout goFrameLayout2, ShimmeringFrameLayout shimmeringFrameLayout, GoLinearLayout goLinearLayout) {
        this.a = goFrameLayout;
        this.b = viewStub;
        this.c = viewStub2;
        this.d = goView;
        this.e = buttonComponent;
        this.f = goFrameLayout2;
        this.g = shimmeringFrameLayout;
        this.h = goLinearLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
