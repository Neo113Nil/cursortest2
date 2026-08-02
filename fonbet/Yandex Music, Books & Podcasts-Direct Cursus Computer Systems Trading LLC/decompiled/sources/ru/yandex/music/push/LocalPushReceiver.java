package ru.yandex.music.push;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.core.app.d0;
import androidx.core.app.f0;
import defpackage.bdt;
import defpackage.bfj;
import defpackage.cxb;
import defpackage.emg;
import defpackage.fmg;
import defpackage.g3o;
import defpackage.hag;
import defpackage.l18;
import defpackage.lg3;
import defpackage.ndb;
import defpackage.pcg;
import defpackage.qdc;
import defpackage.v7g;
import defpackage.xgd;
import defpackage.y7g;
import defpackage.yd5;
import java.util.HashMap;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.entry.EntryScreenActivity;

/* loaded from: classes6.dex */
public final class LocalPushReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Intent intent2 = new Intent(intent.getAction());
        intent2.putExtras(intent);
        l18 l18Var = l18.b;
        bdt I = hag.I(fmg.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        fmg fmgVar = (fmg) qdcVar.C(I);
        String action = intent2.getAction();
        if (action != null && action.hashCode() == -289361205 && action.equals("action.auth.push.alarm")) {
            synchronized (fmgVar) {
                SharedPreferences sharedPreferences = fmgVar.a.getSharedPreferences("prefs.pushService", 0);
                sharedPreferences.getClass();
                sharedPreferences.edit().remove("key.auth_push_time").apply();
                fmgVar.a();
                if (fmgVar.c.a()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("type", "local");
                    hashMap.put("local_notification_type", "authenticate_reminder");
                    lg3.e0("Push_Notification", hashMap);
                    String b = g3o.b(R.string.auth_notification_month_trial_title);
                    String b2 = g3o.b(R.string.auth_notification_month_trial);
                    int i = EntryScreenActivity.y;
                    Intent y = yd5.y(fmgVar.a, new ndb(true));
                    Intent putExtra = y.putExtra("extra.localPush", cxb.K(new Pair("extra.localPush.type", emg.a), new Pair("extra.localPush.title", b2)));
                    putExtra.getClass();
                    PendingIntent Q = pcg.Q(putExtra, fmgVar.a, 10002, 134217728);
                    Intent putExtra2 = y.putExtra("extra.localPush", cxb.K(new Pair("extra.localPush.type", emg.b)));
                    putExtra2.getClass();
                    PendingIntent Q2 = pcg.Q(putExtra2, fmgVar.a, 10003, 134217728);
                    Context context2 = fmgVar.a;
                    bfj bfjVar = bfj.d;
                    f0 f0Var = new f0(context2, "ru.yandex.music.notifications.other");
                    f0Var.e = f0.c(b);
                    f0Var.f = f0.c(b2);
                    f0Var.K.icon = 2131232117;
                    f0Var.f(-1);
                    f0Var.g(16, true);
                    d0 d0Var = new d0();
                    d0Var.b = f0.c(b2);
                    f0Var.k(d0Var);
                    f0Var.g = Q;
                    f0Var.b.add(new xgd(2131231503, fmgVar.a.getString(R.string.push_action_login), Q2).c());
                    Notification o = v7g.o(f0Var);
                    NotificationManager notificationManager = (NotificationManager) fmgVar.d.getValue();
                    if (notificationManager != null) {
                        y7g.K(notificationManager, 12001, o);
                    }
                }
            }
        }
    }
}
