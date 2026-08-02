package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import ru.yandex.taxi.design.NotificationStackComponent;

/* loaded from: classes5.dex */
public final /* synthetic */ class qj60 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationStackComponent b;
    public final /* synthetic */ View c;

    public /* synthetic */ qj60(NotificationStackComponent notificationStackComponent, View view, int i) {
        this.a = i;
        this.b = notificationStackComponent;
        this.c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        View view = this.c;
        NotificationStackComponent notificationStackComponent = this.b;
        switch (i) {
            case 0:
                NotificationStackComponent.getItemOutOfScreenVerticallyAnimator$lambda$0(notificationStackComponent, view, valueAnimator);
                break;
            case 1:
                NotificationStackComponent.moveItemToCanonicalPositionY$lambda$0(notificationStackComponent, view, valueAnimator);
                break;
            case 2:
                NotificationStackComponent.moveItemToCanonicalPositionX$lambda$0(notificationStackComponent, view, valueAnimator);
                break;
            default:
                NotificationStackComponent.getItemOutOfScreenHorizontallyAnimator$lambda$0(notificationStackComponent, view, valueAnimator);
                break;
        }
    }
}
