package ru.yandex.taxi.layers.presentation.mapnotification;

import android.content.Context;
import android.graphics.Bitmap;
import defpackage.tls;
import defpackage.uhx;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationItemComponent;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/layers/presentation/mapnotification/MapNotificationComponent;", "Lru/yandex/taxi/design/NotificationItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "", "title", "subtitle", "Landroid/graphics/Bitmap;", "image", "", "notificationId", "Lkotlin/Function1;", "Lzy11;", "onDismissedByUser", "<init>", "(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Ljava/lang/String;Ltls;)V", "Ljava/lang/String;", "getNotificationId", "()Ljava/lang/String;", "Ltls;", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MapNotificationComponent extends NotificationItemComponent<ListItemComponent> {
    private final String notificationId;
    private final tls onDismissedByUser;

    public MapNotificationComponent(Context context, CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap, String str, tls tlsVar) {
        super(context, null, 0, 6, null);
        this.notificationId = str;
        this.onDismissedByUser = tlsVar;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTitle(charSequence);
        listItemComponent.setSubtitle(charSequence2);
        if (bitmap != null) {
            listItemComponent.setLeadImage(bitmap);
        }
        setChild(listItemComponent);
        setDetachListener(new uhx(5, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(MapNotificationComponent mapNotificationComponent, boolean z) {
        if (z) {
            mapNotificationComponent.onDismissedByUser.invoke(mapNotificationComponent.getNotificationId());
        }
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return this.notificationId;
    }
}
