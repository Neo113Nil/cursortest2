package ru.yandex.taxi.logistics.sdk;

import android.content.Context;
import defpackage.ci60;
import defpackage.dj60;
import defpackage.fkz;
import defpackage.h2t;
import defpackage.k7x0;
import defpackage.lbm;
import defpackage.m7x0;
import defpackage.nac;
import defpackage.pav;
import kotlin.Metadata;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rBM\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/LogisticsTimedNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "", "notificationId", "text", "imageTag", "Lfkz;", "callback", "<init>", "(Landroid/content/Context;Lpav;Lk7x0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfkz;)V", "", "removedManually", "Lzy11;", "onDetachNotification", "(Z)V", "provideTextForAccessibilityAnnounce", "()Ljava/lang/String;", "Ljava/lang/String;", "getNotificationId", "Lfkz;", "deliveries"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LogisticsTimedNotification extends NotificationTimedItemComponent<ListItemComponent> {
    private final fkz callback;
    private final String notificationId;
    private final String text;

    public LogisticsTimedNotification(Context context, pav pavVar, k7x0 k7x0Var, String str, String str2, String str3, fkz fkzVar) {
        super(context, null, 0, 6, null);
        this.notificationId = str;
        this.text = str2;
        this.callback = fkzVar;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTitle(str2);
        if (str3 != null) {
            lbm a = pavVar.a(listItemComponent.getLeadImageView());
            LogisticsTimedNotification$1$1 logisticsTimedNotification$1$1 = new LogisticsTimedNotification$1$1(0, listItemComponent, ListItemComponent.class, "clearLeadView", "clearLeadView()V", 0);
            listItemComponent = listItemComponent;
            nac nacVar = (nac) a;
            nacVar.i = logisticsTimedNotification$1$1;
            nacVar.c(((m7x0) k7x0Var).a(str3));
        }
        setChild(listItemComponent);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public String getNotificationId() {
        return this.notificationId;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, ru.yandex.taxi.design.NotificationItemComponent
    public void onDetachNotification(boolean removedManually) {
        super.onDetachNotification(removedManually);
        ci60 ci60Var = (ci60) ((h2t) this.callback).a;
        ci60Var.a.getClass();
        ci60Var.b.T(new dj60());
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent
    /* renamed from: provideTextForAccessibilityAnnounce, reason: from getter */
    public String getText() {
        return this.text;
    }
}
