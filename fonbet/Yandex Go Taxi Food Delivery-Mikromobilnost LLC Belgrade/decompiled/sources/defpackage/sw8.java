package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.summary.requirements.list.carousel.view.CarouselButton;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class sw8 implements zo31 {
    public final CarouselButton a;
    public final GoImageView b;
    public final RobotoTextView c;

    public sw8(CarouselButton carouselButton, GoImageView goImageView, RobotoTextView robotoTextView) {
        this.a = carouselButton;
        this.b = goImageView;
        this.c = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
