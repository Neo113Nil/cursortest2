package defpackage;

import android.content.Context;
import ru.yandex.taxi.notifications.local.LocalNotificationItemComponent;

/* loaded from: classes12.dex */
public final class rwz {
    public final Context a;
    public final tj60 b;

    public rwz(tj60 tj60Var, Context context) {
        this.a = context;
        this.b = tj60Var;
    }

    public final LocalNotificationItemComponent a(String str, String str2) {
        LocalNotificationItemComponent localNotificationItemComponent = new LocalNotificationItemComponent(this.a, null, 0, 6, null);
        x3z x3zVar = new x3z();
        x3zVar.d = str;
        x3zVar.a = str2;
        x3zVar.c = f1h0.ic_exclamation;
        localNotificationItemComponent.init(x3zVar.a());
        localNotificationItemComponent.setExpiresListener(new qwz(this, str, 1));
        return localNotificationItemComponent;
    }

    public final void b(String str) {
        String string;
        boolean l = jl40.l(str, "birbonus");
        Context context = this.a;
        if (l) {
            string = context.getString(kyh0.loyalty_notification_success_log_in);
        } else if (!jl40.l(str, "plus")) {
            return;
        } else {
            string = context.getString(kyh0.loyalty_notification_success_log_in_yango_plus);
        }
        String o = g8e.o("accept_program_loyalty_success:", str);
        LocalNotificationItemComponent localNotificationItemComponent = new LocalNotificationItemComponent(this.a, null, 0, 6, null);
        x3z x3zVar = new x3z();
        x3zVar.d = o;
        x3zVar.a = string;
        x3zVar.c = f1h0.ic_success_change;
        localNotificationItemComponent.init(x3zVar.a());
        localNotificationItemComponent.setExpiresListener(new qwz(this, o, 0));
        localNotificationItemComponent.startExpiresTimer(5000L);
        this.b.e(localNotificationItemComponent);
    }
}
