package defpackage;

import ru.yandex.taxi.logistics.sdk.LogisticsTimedNotification;
import ru.yandex.taxi.logistics.sdk.l;

/* loaded from: classes14.dex */
public final class uhz implements xj60 {
    public final /* synthetic */ l a;
    public final /* synthetic */ LogisticsTimedNotification b;
    public final /* synthetic */ ci60 c;

    public uhz(l lVar, LogisticsTimedNotification logisticsTimedNotification, ci60 ci60Var) {
        this.a = lVar;
        this.b = logisticsTimedNotification;
        this.c = ci60Var;
    }

    @Override // defpackage.xj60
    public final void a() {
        LogisticsTimedNotification logisticsTimedNotification = this.b;
        this.a.d.c(logisticsTimedNotification.getNotificationId());
        logisticsTimedNotification.getNotificationId();
        this.c.b.T(new dj60());
    }
}
