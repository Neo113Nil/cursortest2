package ru.yandex.taxi.scooters.presentation.feedback;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.kyh0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\b\u0003\u0010\u0007\u001a\u00020\b:\u0002\b\t\u001a\u0002\b\f¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/scooters/presentation/feedback/ScootersFeedbackSubmittedNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "Landroidx/annotation/AttrRes;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/jvm/JvmOverloads;", "notificationId", "", "getNotificationId", "()Ljava/lang/String;", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ScootersFeedbackSubmittedNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public ScootersFeedbackSubmittedNotification(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTitle(kyh0.scooters_feedback_submitted_notification_title);
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return "SCOOTERS_FEEDBACK_SUBMITTED_NOTIFICATION_ID";
    }

    public ScootersFeedbackSubmittedNotification(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ScootersFeedbackSubmittedNotification(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ScootersFeedbackSubmittedNotification(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
