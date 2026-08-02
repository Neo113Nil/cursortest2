package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes5.dex */
public final class yj80 implements zo31 {
    public final GoFrameLayout a;
    public final GoFrameLayout b;
    public final GoImageView c;
    public final ShimmeringBar d;
    public final GoImageView e;

    public yj80(GoFrameLayout goFrameLayout, GoFrameLayout goFrameLayout2, GoImageView goImageView, ShimmeringBar shimmeringBar, GoImageView goImageView2) {
        this.a = goFrameLayout;
        this.b = goFrameLayout2;
        this.c = goImageView;
        this.d = shimmeringBar;
        this.e = goImageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
