package defpackage;

import com.yandex.messaging.views.BadgeView;

/* loaded from: classes15.dex */
public final /* synthetic */ class tm4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ BadgeView b;

    public /* synthetic */ tm4(BadgeView badgeView, int i) {
        this.a = i;
        this.b = badgeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        BadgeView badgeView = this.b;
        switch (i) {
            case 0:
                badgeView.isAnimationShowPlaying = false;
                break;
            default:
                BadgeView.hideWithScaleAnimation$lambda$2(badgeView);
                break;
        }
    }
}
