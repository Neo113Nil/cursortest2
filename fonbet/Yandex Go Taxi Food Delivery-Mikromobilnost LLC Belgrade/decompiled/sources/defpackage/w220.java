package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import androidx.core.app.s0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.sequences.b;

/* loaded from: classes15.dex */
public final class w220 {
    public final Context a;
    public final x22 b;
    public final String c;
    public final ch60 d;
    public final h3y e;
    public final ume f;
    public final s0 g;

    public w220(Context context, x22 x22Var, String str, ch60 ch60Var, h3y h3yVar, l420 l420Var, ume umeVar) {
        this.a = context;
        this.b = x22Var;
        this.c = str;
        this.d = ch60Var;
        this.e = h3yVar;
        this.f = umeVar;
        this.g = new s0(context);
    }

    public final void a(int i, String str) {
        String str2 = this.c;
        int i2 = 24;
        String a = new uj60(str2, i2, str, true).a();
        s0 s0Var = this.g;
        s0Var.a(i, a);
        s0Var.a(i, new uj60(str2, i2, str, false).a());
        s5r s5rVar = new s5r(b.g(b.g(new h73(1, c()), new ii8(i, 10)), new rv10(13)));
        while (s5rVar.hasNext()) {
            wyf0 wyf0Var = (wyf0) s5rVar.next();
            s0Var.a(wyf0Var.b, wyf0Var.d);
        }
    }

    public final pnt0 b() {
        pnt0 pnt0Var = new pnt0((Object) null);
        Iterator it = c().iterator();
        while (it.hasNext()) {
            wyf0 wyf0Var = (wyf0) it.next();
            pnt0Var.d(wyf0Var.b, wyf0Var.d);
        }
        return pnt0Var;
    }

    public final ArrayList c() {
        StatusBarNotification[] statusBarNotificationArr;
        uj60 b;
        Object systemService = this.a.getSystemService("notification");
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager == null || (statusBarNotificationArr = notificationManager.getActiveNotifications()) == null) {
            statusBarNotificationArr = new StatusBarNotification[0];
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
            if ((statusBarNotification.getId() == -1 || (b = otb1.b(statusBarNotification)) == null) ? false : evu0.y(b.b, "messenger-chat-v2", false)) {
                arrayList.add(statusBarNotification);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new wyf0((StatusBarNotification) it.next()));
        }
        return arrayList2;
    }
}
