package ru.yandex.taxi.logistics.safe_flow;

import android.content.Context;
import defpackage.k7x0;
import defpackage.lbm;
import defpackage.lni;
import defpackage.m7x0;
import defpackage.nac;
import defpackage.pav;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B9\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/safe_flow/DeliverySafeFlowNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "", "text", "imageTag", "<init>", "(Landroid/content/Context;Lpav;Lk7x0;Ljava/lang/String;Ljava/lang/String;)V", "provideTextForAccessibilityAnnounce", "()Ljava/lang/String;", "Ljava/lang/String;", "getNotificationId", "notificationId", "Companion", "lni", "deliveries"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliverySafeFlowNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final lni Companion = new lni();
    public static final String NOTIFICATION_ID = "delivery_safe_flow";
    private final String text;

    public DeliverySafeFlowNotification(Context context, pav pavVar, k7x0 k7x0Var, String str, String str2) {
        super(context, null, 0, 6, null);
        this.text = str;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTitle(str);
        if (str2 != null) {
            lbm a = pavVar.a(listItemComponent.getLeadImageView());
            DeliverySafeFlowNotification$1$1 deliverySafeFlowNotification$1$1 = new DeliverySafeFlowNotification$1$1(0, listItemComponent, ListItemComponent.class, "clearLeadView", "clearLeadView()V", 0);
            listItemComponent = listItemComponent;
            nac nacVar = (nac) a;
            nacVar.i = deliverySafeFlowNotification$1$1;
            nacVar.c(((m7x0) k7x0Var).a(str2));
        }
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId */
    public String getUid() {
        return NOTIFICATION_ID;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent
    /* renamed from: provideTextForAccessibilityAnnounce, reason: from getter */
    public String getText() {
        return this.text;
    }
}
