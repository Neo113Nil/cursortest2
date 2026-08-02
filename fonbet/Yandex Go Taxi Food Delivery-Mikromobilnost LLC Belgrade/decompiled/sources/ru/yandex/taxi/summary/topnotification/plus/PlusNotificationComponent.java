package ru.yandex.taxi.summary.topnotification.plus;

import android.content.Context;
import android.widget.FrameLayout;
import defpackage.ag60;
import defpackage.g1a0;
import defpackage.hg;
import defpackage.nac;
import defpackage.pav;
import defpackage.q6d0;
import defpackage.z0a0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lru/yandex/taxi/summary/topnotification/plus/PlusNotificationComponent;", "Lru/yandex/taxi/design/NotificationItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lz0a0;", "paymentIconLoader", "Ljava/lang/Runnable;", "onClickRunnable", "onDismissManuallyRunnable", "<init>", "(Landroid/content/Context;Lpav;Lz0a0;Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "Lag60;", "notification", "", "iconUrl", "Lzy11;", "updateNotification", "(Lag60;Ljava/lang/String;)V", "", "removedManually", "onDetachNotification", "(Z)V", "Lpav;", "Lz0a0;", "Ljava/lang/Runnable;", "getNotificationId", "()Ljava/lang/String;", "notificationId", "", "getNotificationPriority", "()I", "notificationPriority", "Companion", "q6d0", "topnotification"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlusNotificationComponent extends NotificationItemComponent<ListItemComponent> {
    public static final q6d0 Companion = new q6d0();
    public static final String NOTIFICATION_ID = "PlusNotificationComponent";
    private final pav imageLoader;
    private final Runnable onDismissManuallyRunnable;
    private final z0a0 paymentIconLoader;

    public PlusNotificationComponent(Context context, pav pavVar, z0a0 z0a0Var, Runnable runnable, Runnable runnable2) {
        super(context, null, 0, 6, null);
        this.imageLoader = pavVar;
        this.paymentIconLoader = z0a0Var;
        this.onDismissManuallyRunnable = runnable2;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setBackgroundColor(0);
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
    public final void updateNotification(ag60 notification, String iconUrl) {
        ListItemComponent listItemComponent = (ListItemComponent) getChild();
        if (listItemComponent == null) {
            return;
        }
        listItemComponent.setTitle(notification.a);
        listItemComponent.setSubtitle(notification.b);
        if (iconUrl != null && iconUrl.length() != 0) {
            ((nac) this.imageLoader.a(listItemComponent.getLeadImageView())).c(iconUrl);
            return;
        }
        ((g1a0) this.paymentIconLoader).e(listItemComponent.getLeadImageView(), PaymentMethod$Type.PERSONAL_WALLET);
    }
}
