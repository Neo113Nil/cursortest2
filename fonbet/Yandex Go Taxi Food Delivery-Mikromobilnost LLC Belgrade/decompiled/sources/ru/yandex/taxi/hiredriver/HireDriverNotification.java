package ru.yandex.taxi.hiredriver;

import android.content.Context;
import defpackage.bdc;
import defpackage.mrg0;
import defpackage.qku;
import defpackage.tje;
import defpackage.tp11;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/hiredriver/HireDriverNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "", "title", "subtitle", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "getNotificationId", "()Ljava/lang/String;", "notificationId", "Companion", "qku", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class HireDriverNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final qku Companion = new qku();
    public static final String NOTIFICATION_ID = "HireDriverNotification";

    public HireDriverNotification(Context context, String str, String str2) {
        super(context, null, 0, 6, null);
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTitle(str);
        Boolean bool = tp11.a;
        tp11.b(3, listItemComponent.title());
        listItemComponent.setSubtitle(str2);
        listItemComponent.setSubtitleTextColor(new bdc(xng0.textMain));
        listItemComponent.setSubtitleTextSizePx(tje.r(mrg0.component_text_size_body, context));
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return NOTIFICATION_ID;
    }
}
