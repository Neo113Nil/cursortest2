package ru.yandex.taxi.summary.topnotification.mastercard;

import android.content.Context;
import android.widget.FrameLayout;
import defpackage.ag60;
import defpackage.hg;
import defpackage.l610;
import defpackage.nac;
import defpackage.pav;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationItemComponent;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lru/yandex/taxi/summary/topnotification/mastercard/MasterCardNotificationComponent;", "Lru/yandex/taxi/design/NotificationItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Ljava/lang/Runnable;", "onClickRunnable", "onDismissManuallyRunnable", "<init>", "(Landroid/content/Context;Lpav;Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "Lag60;", "notification", "", "iconUrl", "", "isTrailVisible", "Lzy11;", "updateNotification", "(Lag60;Ljava/lang/String;Z)V", "removedManually", "onDetachNotification", "(Z)V", "Lpav;", "Ljava/lang/Runnable;", "getNotificationId", "()Ljava/lang/String;", "notificationId", "", "getNotificationPriority", "()I", "notificationPriority", "Companion", "l610", "topnotification"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MasterCardNotificationComponent extends NotificationItemComponent<ListItemComponent> {
    public static final l610 Companion = new l610();
    public static final String NOTIFICATION_ID = "MasterCardNotificationComponent";
    private final pav imageLoader;
    private final Runnable onDismissManuallyRunnable;

    public MasterCardNotificationComponent(Context context, pav pavVar, Runnable runnable, Runnable runnable2) {
        super(context, null, 0, 6, null);
        this.imageLoader = pavVar;
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
    public String getUid() {
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
    public final void updateNotification(ag60 notification, String iconUrl, boolean isTrailVisible) {
        ListItemComponent listItemComponent = (ListItemComponent) getChild();
        if (listItemComponent == null) {
            return;
        }
        listItemComponent.setTitle(notification.a);
        listItemComponent.setSubtitle(notification.b);
        listItemComponent.setTrailMode(isTrailVisible ? 2 : 0);
        if (iconUrl == null || iconUrl.length() == 0) {
            return;
        }
        ((nac) this.imageLoader.a(listItemComponent.getLeadImageView())).c(iconUrl);
    }
}
