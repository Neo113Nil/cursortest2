package ru.yandex.taxi.summary.topnotification.plus;

import android.content.Context;
import android.widget.FrameLayout;
import defpackage.ag60;
import defpackage.frd;
import defpackage.g1a0;
import defpackage.hg;
import defpackage.z0a0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lru/yandex/taxi/summary/topnotification/plus/CompositePaymentNotificationComponent;", "Lru/yandex/taxi/design/NotificationItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lz0a0;", "paymentImageLoader", "Ljava/lang/Runnable;", "onClickRunnable", "onDismissManuallyRunnable", "<init>", "(Landroid/content/Context;Lz0a0;Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "Lag60;", "notification", "Lzy11;", "updateNotification", "(Lag60;)V", "", "removedManually", "onDetachNotification", "(Z)V", "Ljava/lang/Runnable;", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "", "getNotificationPriority", "()I", "notificationPriority", "Companion", "frd", "topnotification"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositePaymentNotificationComponent extends NotificationItemComponent<ListItemComponent> {
    public static final frd Companion = new frd();
    public static final String NOTIFICATION_ID = "CompositePaymentNotificationComponent";
    private final Runnable onDismissManuallyRunnable;

    public CompositePaymentNotificationComponent(Context context, z0a0 z0a0Var, Runnable runnable, Runnable runnable2) {
        super(context, null, 0, 6, null);
        this.onDismissManuallyRunnable = runnable2;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setBackgroundColor(0);
        ((g1a0) z0a0Var).e(listItemComponent.getLeadImageView(), PaymentMethod$Type.PERSONAL_WALLET);
        listItemComponent.setTrailMode(2);
        listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        listItemComponent.setDebounceClickListener(runnable);
        setChild(listItemComponent);
        setFocusable(true);
        hg.a(this);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId */
    public String getId() {
        return NOTIFICATION_ID;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public int getNotificationPriority() {
        return 3;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public void onDetachNotification(boolean removedManually) {
        super.onDetachNotification(removedManually);
        if (removedManually) {
            this.onDismissManuallyRunnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateNotification(ag60 notification) {
        ListItemComponent listItemComponent = (ListItemComponent) getChild();
        if (listItemComponent == null) {
            return;
        }
        listItemComponent.setTitle(notification.a);
        listItemComponent.setSubtitle(notification.b);
    }
}
