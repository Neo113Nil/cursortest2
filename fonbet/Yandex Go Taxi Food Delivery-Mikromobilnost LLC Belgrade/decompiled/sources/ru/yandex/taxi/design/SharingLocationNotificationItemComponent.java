package ru.yandex.taxi.design;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.mqr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/design/SharingLocationNotificationItemComponent;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "Lzy11;", "setTitle", "(Ljava/lang/String;)V", "getNotificationId", "()Ljava/lang/String;", "notificationId", "Companion", "mqr0", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SharingLocationNotificationItemComponent extends NotificationTimedItemComponent<ListItemComponent> {
    public static final mqr0 Companion = new mqr0();
    public static final String NOTIFICATION_ID = "SHARING_LOCATION";

    public SharingLocationNotificationItemComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setBackground(null);
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return NOTIFICATION_ID;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTitle(String title) {
        ListItemComponent listItemComponent = (ListItemComponent) getChild();
        if (listItemComponent != null) {
            listItemComponent.setTitle(title);
        }
    }

    public SharingLocationNotificationItemComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SharingLocationNotificationItemComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ SharingLocationNotificationItemComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
