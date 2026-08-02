package ru.yandex.taxi.masstransit.paymentcards;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.dzg0;
import defpackage.u8b1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/masstransit/paymentcards/MtTransportCardNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "Lzy11;", "setTitle", "(Ljava/lang/String;)V", "", "provideDurationTime", "()J", "getNotificationId", "()Ljava/lang/String;", "notificationId", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtTransportCardNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final int $stable = 8;

    public MtTransportCardNotification(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setLeadImage(u8b1.h(dzg0.ic_check, context));
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return "MtTransportCardVerticalNotification";
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent
    /* renamed from: provideDurationTime */
    public long getDuration() {
        return 3000L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setTitle(String title) {
        ListItemComponent listItemComponent = (ListItemComponent) getChild();
        if (listItemComponent != null) {
            listItemComponent.setTitle(title);
        }
    }

    public /* synthetic */ MtTransportCardNotification(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
