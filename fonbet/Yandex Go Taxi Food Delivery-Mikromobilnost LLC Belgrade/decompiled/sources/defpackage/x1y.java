package defpackage;

import android.view.View;
import android.view.ViewStub;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes13.dex */
public final class x1y implements zo31 {
    public final GoFrameLayout a;
    public final GoImageView b;
    public final GoFrameLayout c;
    public final y1y d;
    public final GoImageView e;
    public final z1y f;
    public final View g;
    public final ViewStub h;
    public final GoFrameLayout i;
    public final GoImageView j;
    public final RobotoTextView k;
    public final ShimmeringBar l;
    public final GoLinearLayout m;

    public x1y(GoFrameLayout goFrameLayout, GoImageView goImageView, GoFrameLayout goFrameLayout2, y1y y1yVar, GoImageView goImageView2, z1y z1yVar, View view, ViewStub viewStub, GoFrameLayout goFrameLayout3, GoImageView goImageView3, RobotoTextView robotoTextView, ShimmeringBar shimmeringBar, GoLinearLayout goLinearLayout) {
        this.a = goFrameLayout;
        this.b = goImageView;
        this.c = goFrameLayout2;
        this.d = y1yVar;
        this.e = goImageView2;
        this.f = z1yVar;
        this.g = view;
        this.h = viewStub;
        this.i = goFrameLayout3;
        this.j = goImageView3;
        this.k = robotoTextView;
        this.l = shimmeringBar;
        this.m = goLinearLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
