package ru.yandex.taxi.order.view;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.n4h0;
import defpackage.nl70;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/order/view/OrderCancelSupportNotifiedNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "Companion", "nl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderCancelSupportNotifiedNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final int $stable = 8;
    public static final nl70 Companion = new nl70();
    private static final String ID = "OrderCancelSupportNotifiedNotification";

    public OrderCancelSupportNotifiedNotification(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setLeadImage(n4h0.check);
        listItemComponent.setLeadTintColorRes(mqg0.component_green_normal);
        listItemComponent.setTitle(getContext().getString(kyh0.order_cancel_feedback_is_sent));
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return ID;
    }

    public OrderCancelSupportNotifiedNotification(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OrderCancelSupportNotifiedNotification(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ OrderCancelSupportNotifiedNotification(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
