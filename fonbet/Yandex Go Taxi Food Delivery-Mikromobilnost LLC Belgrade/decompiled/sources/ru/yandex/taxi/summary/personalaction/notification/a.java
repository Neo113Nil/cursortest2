package ru.yandex.taxi.summary.personalaction.notification;

import android.content.Context;
import defpackage.aq80;
import defpackage.c4r0;
import defpackage.qpt0;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.summary.topnotification.a;

/* loaded from: classes6.dex */
public final class a extends a.AbstractC0120a {
    public final Context a;
    public final aq80 b;
    public final ru.yandex.taxi.personalstate.data.remote.a c;
    public final c4r0 d;
    public final qpt0 e;

    public a(Context context, aq80 aq80Var, ru.yandex.taxi.personalstate.data.remote.a aVar, c4r0 c4r0Var, qpt0 qpt0Var) {
        this.a = context;
        this.b = aq80Var;
        this.c = aVar;
        this.d = c4r0Var;
        this.e = qpt0Var;
    }

    @Override // ru.yandex.taxi.summary.topnotification.a.AbstractC0120a
    public final NotificationItemComponent a() {
        return new PersonalActionNotificationComponent(this.a, new PersonalActionNotificationComponentFactory$create$1(1, this, a.class, "onClicked", "onClicked(Lru/yandex/taxi/summary/personalaction/notification/PersonalActionNotificationViewModel;)V", 0), new PersonalActionNotificationComponentFactory$create$2(1, this, a.class, "onDismissed", "onDismissed(Lru/yandex/taxi/summary/personalaction/notification/PersonalActionNotificationViewModel;)V", 0));
    }
}
