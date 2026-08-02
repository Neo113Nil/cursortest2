package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.yandex.go.taxi.order.bubble.AnimatedBubbleView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class se2 implements zo31 {
    public final AnimatedBubbleView a;

    public se2(AnimatedBubbleView animatedBubbleView, RobotoTextView robotoTextView, ImageView imageView) {
        this.a = animatedBubbleView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
