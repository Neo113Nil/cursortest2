package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;

/* loaded from: classes6.dex */
public final class swk0 implements zo31 {
    public final GoFrameLayout a;
    public final GoImageView b;

    public swk0(GoFrameLayout goFrameLayout, GoImageView goImageView) {
        this.a = goFrameLayout;
        this.b = goImageView;
    }

    public static swk0 o(LayoutInflater layoutInflater, GoFrameLayout goFrameLayout) {
        layoutInflater.inflate(zrh0.rotatable_float_button, goFrameLayout);
        int i = agh0.image;
        GoImageView goImageView = (GoImageView) cma1.O(i, goFrameLayout);
        if (goImageView != null) {
            return new swk0(goFrameLayout, goImageView);
        }
        ny61.t("Missing required view with ID: ".concat(goFrameLayout.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
