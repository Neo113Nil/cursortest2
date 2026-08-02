package defpackage;

import android.animation.ValueAnimator;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.progressbar.SearchProgressBar;

/* loaded from: classes6.dex */
public final /* synthetic */ class xvp0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchProgressBar b;

    public /* synthetic */ xvp0(SearchProgressBar searchProgressBar, int i) {
        this.a = i;
        this.b = searchProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        SearchProgressBar searchProgressBar = this.b;
        switch (i) {
            case 0:
                SearchProgressBar.startFirstAnimation$lambda$0$0(searchProgressBar, valueAnimator);
                break;
            case 1:
                SearchProgressBar.startAnimation$lambda$0$0(searchProgressBar, valueAnimator);
                break;
            default:
                SearchProgressBar.defaultAnimator$lambda$0$0(searchProgressBar, valueAnimator);
                break;
        }
    }
}
