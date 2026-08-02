package defpackage;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes14.dex */
public final class v2y implements zo31 {
    public final GoLinearLayout a;
    public final GoImageView b;
    public final GoImageView c;
    public final ViewPager2 d;
    public final ButtonComponent e;

    public v2y(GoLinearLayout goLinearLayout, GoImageView goImageView, GoImageView goImageView2, ViewPager2 viewPager2, ButtonComponent buttonComponent) {
        this.a = goLinearLayout;
        this.b = goImageView;
        this.c = goImageView2;
        this.d = viewPager2;
        this.e = buttonComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
