package ru.yandex.taxi.notification;

import android.content.Context;
import defpackage.fcl0;
import defpackage.sls;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/notification/SavedToFavoriteNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "", "notificationTitle", "notificationSubtitle", "", "icon", "notificationId", "Lkotlin/Function0;", "Lzy11;", "clickAction", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lsls;)V", "Ljava/lang/String;", "getNotificationId", "()Ljava/lang/String;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SavedToFavoriteNotification extends NotificationTimedItemComponent<ListItemComponent> {
    private final String notificationId;

    public SavedToFavoriteNotification(Context context, String str, String str2, int i, String str3, sls slsVar) {
        super(context, null, 0, 6, null);
        this.notificationId = str3;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTitle(str);
        listItemComponent.setSubtitle(str2);
        listItemComponent.setTrailMode(2);
        listItemComponent.setDebounceClickListener(new fcl0(2, slsVar));
        listItemComponent.setLeadImage(i);
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return this.notificationId;
    }
}
