package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.design.ClickableImageView;

/* loaded from: classes13.dex */
public final class zuq0 implements zo31 {
    public final /* synthetic */ int a;
    public final GoFrameLayout b;
    public final ClickableImageView c;

    public /* synthetic */ zuq0(GoFrameLayout goFrameLayout, ClickableImageView clickableImageView, int i) {
        this.a = i;
        this.b = goFrameLayout;
        this.c = clickableImageView;
    }

    public static zuq0 o(View view) {
        int i = s7h0.back_button;
        ClickableImageView clickableImageView = (ClickableImageView) cma1.O(i, view);
        if (clickableImageView != null) {
            return new zuq0((GoFrameLayout) view, clickableImageView, 0);
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }
}
