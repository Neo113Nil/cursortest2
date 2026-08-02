package ru.yandex.taxi.favorites.notification;

import android.content.Context;
import defpackage.tje;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\b\u0001\u0010\f\u001a\u00020\r:\u0002\b\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/favorites/notification/FavoriteNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "context", "Landroid/content/Context;", "id", "", "title", "", "subtitle", "withChevron", "", "iconRes", "", "Landroidx/annotation/DrawableRes;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZI)V", "notificationId", "getNotificationId", "()Ljava/lang/String;", "impl", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FavoriteNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final int $stable = 8;
    private final String id;

    public FavoriteNotification(Context context, String str, CharSequence charSequence, CharSequence charSequence2, boolean z, int i) {
        super(context, null, 0, 6, null);
        this.id = str;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTitle(charSequence);
        listItemComponent.setSubtitle(charSequence2);
        if (z) {
            listItemComponent.setTrailMode(2);
        }
        listItemComponent.setLeadImage(tje.y(i, context));
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return this.id;
    }
}
