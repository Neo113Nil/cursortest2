package defpackage;

import android.animation.ValueAnimator;
import ru.yandex.taxi.zalogin.LinkAccountsFullscreen;

/* loaded from: classes6.dex */
public final /* synthetic */ class ujy implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkAccountsFullscreen b;

    public /* synthetic */ ujy(LinkAccountsFullscreen linkAccountsFullscreen, int i) {
        this.a = i;
        this.b = linkAccountsFullscreen;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        LinkAccountsFullscreen linkAccountsFullscreen = this.b;
        switch (i) {
            case 0:
                LinkAccountsFullscreen.startAppearingAnimation$lambda$0(linkAccountsFullscreen, valueAnimator);
                break;
            case 1:
                LinkAccountsFullscreen.startAppearingAnimation$lambda$1(linkAccountsFullscreen, valueAnimator);
                break;
            case 2:
                LinkAccountsFullscreen.startAppearingAnimation$lambda$2(linkAccountsFullscreen, valueAnimator);
                break;
            case 3:
                LinkAccountsFullscreen.startAppearingAnimation$lambda$3(linkAccountsFullscreen, valueAnimator);
                break;
            case 4:
                LinkAccountsFullscreen.initAnimation$lambda$0(linkAccountsFullscreen, valueAnimator);
                break;
            default:
                LinkAccountsFullscreen.initAnimation$lambda$1(linkAccountsFullscreen, valueAnimator);
                break;
        }
    }
}
