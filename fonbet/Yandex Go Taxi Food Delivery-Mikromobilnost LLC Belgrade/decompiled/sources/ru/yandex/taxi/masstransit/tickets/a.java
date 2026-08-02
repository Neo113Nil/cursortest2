package ru.yandex.taxi.masstransit.tickets;

import android.content.Context;
import com.yandex.go.masstransit.design.ui_components.IconNotificationComponent;
import defpackage.dzg0;
import defpackage.k3c;
import defpackage.tje;
import defpackage.tse;
import defpackage.u8b1;
import defpackage.y50;
import ru.yandex.taxi.design.NotificationStackComponent;

/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final tse b;
    public final k3c c;
    public final y50 d;
    public final NotificationStackComponent e;

    public a(Context context, tse tseVar, k3c k3cVar, y50 y50Var, NotificationStackComponent notificationStackComponent) {
        this.a = context;
        this.b = tseVar;
        this.c = k3cVar;
        this.d = y50Var;
        this.e = notificationStackComponent;
    }

    public final void a(CharSequence charSequence) {
        int i = dzg0.ic_check;
        Context context = this.a;
        tje.N(this.b, null, null, new MtTicketsHostBridgeImpl$showActivationSuccessNotification$1(this, new IconNotificationComponent(context, null, u8b1.h(i, context), charSequence, null, 18, null), null), 3);
    }
}
