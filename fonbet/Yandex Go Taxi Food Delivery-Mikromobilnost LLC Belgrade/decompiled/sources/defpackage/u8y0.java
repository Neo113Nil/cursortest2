package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;

/* loaded from: classes6.dex */
public final class u8y0 implements zo31 {
    public final GoFrameLayout a;
    public final GoImageView b;

    public u8y0(GoFrameLayout goFrameLayout, GoImageView goImageView) {
        this.a = goFrameLayout;
        this.b = goImageView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
