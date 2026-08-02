package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoView;

/* loaded from: classes12.dex */
public final class zjf0 implements zo31 {
    public final GoFrameLayout a;
    public final GoImageView b;
    public final GoView c;
    public final GoView d;

    public zjf0(GoFrameLayout goFrameLayout, GoImageView goImageView, GoView goView, GoView goView2) {
        this.a = goFrameLayout;
        this.b = goImageView;
        this.c = goView;
        this.d = goView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
