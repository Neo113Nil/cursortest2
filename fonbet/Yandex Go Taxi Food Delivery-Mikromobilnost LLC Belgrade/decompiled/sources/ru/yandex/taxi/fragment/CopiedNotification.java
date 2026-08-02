package ru.yandex.taxi.fragment;

import android.content.Context;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\tH\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/fragment/CopiedNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "context", "Landroid/content/Context;", "titleStringId", "", "textForAccessibilityStringId", "notificationId", "", "<init>", "(Landroid/content/Context;IILjava/lang/String;)V", "getTitleStringId", "()I", "getTextForAccessibilityStringId", "getNotificationId", "()Ljava/lang/String;", "provideTextForAccessibilityAnnounce", "taxi_design", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CopiedNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final int $stable = 8;
    private final String notificationId;
    private final int textForAccessibilityStringId;
    private final int titleStringId;

    public CopiedNotification(Context context, int i, int i2, String str) {
        super(context, null, 0, 6, null);
        this.titleStringId = i;
        this.textForAccessibilityStringId = i2;
        this.notificationId = str;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTitle(getContext().getString(i));
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return this.notificationId;
    }

    public final int getTextForAccessibilityStringId() {
        return this.textForAccessibilityStringId;
    }

    public final int getTitleStringId() {
        return this.titleStringId;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent
    public String provideTextForAccessibilityAnnounce() {
        return getContext().getString(this.textForAccessibilityStringId);
    }
}
