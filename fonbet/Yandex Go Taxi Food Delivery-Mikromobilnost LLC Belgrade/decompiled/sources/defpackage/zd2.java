package defpackage;

import android.view.animation.Interpolator;
import ru.yandex.taxi.animation.AnimUtils$shake$1;

/* loaded from: classes5.dex */
public final /* synthetic */ class zd2 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float onAnimationEnd$lambda$0;
        onAnimationEnd$lambda$0 = AnimUtils$shake$1.onAnimationEnd$lambda$0(f);
        return onAnimationEnd$lambda$0;
    }
}
