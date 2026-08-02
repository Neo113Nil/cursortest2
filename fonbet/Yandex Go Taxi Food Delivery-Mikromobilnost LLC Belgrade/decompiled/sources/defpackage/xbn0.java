package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoImageView;

/* loaded from: classes6.dex */
public final class xbn0 implements zo31 {
    public final GoFrameLayout a;
    public final GoImageView b;
    public final GoImageButton c;

    public xbn0(GoFrameLayout goFrameLayout, GoImageView goImageView, GoImageButton goImageButton) {
        this.a = goFrameLayout;
        this.b = goImageView;
        this.c = goImageButton;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
