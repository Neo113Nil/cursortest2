package defpackage;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.s0;
import androidx.core.app.t;
import androidx.core.app.v;
import com.yandex.messenger.websdk.api.Notification;
import com.yandex.messenger.websdk.api.NotificationChatInfo;
import com.yandex.messenger.websdk.api.NotificationClickIntentFactory;
import com.yandex.messenger.websdk.api.NotificationDecorator;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import org.json.JSONObject;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.messenger.domain.MessengerChatOwner;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;

/* loaded from: classes8.dex */
public final class vh60 implements Notification {
    public final Context a;
    public final SharedPreferences b;
    public final o6v c;
    public final ew2 d;
    public final yx1 e;
    public final e5g0 f;
    public final csz g;
    public final Handler h;
    public final Handler i;
    public boolean j;
    public final zg60 k;

    public vh60(qh41 qh41Var) {
        Context context = qh41Var.a;
        this.a = context;
        Looper looper = (Looper) qh41Var.n.getValue();
        this.b = (SharedPreferences) qh41Var.o.getValue();
        this.c = (o6v) qh41Var.q.getValue();
        this.d = qh41Var.r;
        NotificationClickIntentFactory notificationClickIntentFactory = qh41Var.c;
        NotificationDecorator notificationDecorator = qh41Var.d;
        this.e = qh41Var.u;
        this.f = (e5g0) qh41Var.h.getValue();
        this.g = new csz(18, this);
        this.h = new Handler(Looper.getMainLooper());
        this.i = new Handler(looper);
        this.j = true;
        this.k = notificationClickIntentFactory != null ? new zg60(context, notificationClickIntentFactory, notificationDecorator) : null;
    }

    public final boolean a(Map map) {
        zg60 zg60Var;
        PendingIntent a;
        JSONObject e;
        String str = (String) map.get("xiva");
        String g = (str == null || (e = hbb1.e(str)) == null) ? null : hbb1.g("transit_id", e);
        Map s = b.s(scc.h(g != null ? new Pair("transit_id", g) : null));
        ew2 ew2Var = this.d;
        ew2Var.c("wm_push_received", s);
        this.g.invoke();
        if (this.j && (zg60Var = this.k) != null) {
            HashMap hashMap = zg60Var.d;
            s0 s0Var = zg60Var.c;
            String str2 = (String) map.get("messenger");
            if (str2 != null) {
                JSONObject jSONObject = new JSONObject(str2);
                Context context = this.a;
                fh60 f = ltb1.f(context.getResources(), jSONObject);
                if (f == null) {
                    fj60 c = ntb1.c(jSONObject);
                    if (c == null) {
                        ew2Var.c("wm_push_parse_data_error", s);
                        return false;
                    }
                    ew2Var.c("wm_push_seen", s);
                    String a2 = c.a();
                    fj60 fj60Var = (fj60) hashMap.get(a2);
                    if (fj60Var != null && c.b() >= fj60Var.b()) {
                        s0Var.a(a2.hashCode(), null);
                    }
                    hashMap.put(a2, c);
                    return true;
                }
                ew2Var.c("wm_push_show", s);
                String a3 = f.a();
                fj60 fj60Var2 = (fj60) hashMap.get(a3);
                if (fj60Var2 != null && f.d() <= fj60Var2.b()) {
                    return true;
                }
                if (s0Var.b.getNotificationChannel("WebMessengerChannel") == null) {
                    NotificationChannel notificationChannel = new NotificationChannel("WebMessengerChannel", "Messenger", 4);
                    notificationChannel.setLightColor(DebugGraphView.DEFAULT_GRAPH_COLOR);
                    notificationChannel.enableVibration(true);
                    notificationChannel.enableLights(true);
                    notificationChannel.setShowBadge(false);
                    notificationChannel.setLockscreenVisibility(1);
                    s0Var.b(notificationChannel);
                }
                v vVar = new v(context, "WebMessengerChannel");
                vVar.h(16, true);
                vVar.x = "msg";
                vVar.h(8, false);
                vVar.I = 2;
                vVar.j(-16776961, 1000, 1000);
                vVar.A = 0;
                vVar.m(f.b());
                vVar.f(f.b());
                vVar.e(f.c());
                vVar.m = 1;
                NotificationClickIntentFactory notificationClickIntentFactory = zg60Var.a;
                NotificationChatInfo notificationChatInfo = new NotificationChatInfo(a3);
                n220 n220Var = (n220) notificationClickIntentFactory;
                MessengerChatOwner a4 = n220Var.e.a(notificationChatInfo.getA());
                int i = a4 == null ? -1 : m220.a[a4.ordinal()];
                if (i == 1) {
                    a = n220Var.a.a(context, notificationChatInfo.getA());
                } else if (i == 2) {
                    a = n220Var.b.a(context, notificationChatInfo.getA());
                } else if (i != 3) {
                    o120 o120Var = n220Var.d;
                    String a5 = notificationChatInfo.getA();
                    o120Var.getClass();
                    Application application = o120Var.a;
                    Intent action = new Intent(application, (Class<?>) o120Var.b.a(AndroidComponentRepository$Component.MAIN_ACTIVITY)).addFlags(SelfTester_JCP.IMITA).setAction("android.intent.action.VIEW");
                    Bundle bundle = new Bundle();
                    bundle.putString("ru.yandex.taxi.activity.MainActivity.MESSENGER_FALLBACK_TO_DISPLAY", a5);
                    action.putExtras(bundle);
                    a = PendingIntent.getActivity(application, 0, action, 201326592);
                } else {
                    a = n220Var.c.a(context, notificationChatInfo.getA());
                }
                vVar.h = a;
                t.b bVar = new t.b();
                bVar.e(f.c());
                vVar.l(bVar);
                vVar.K.icon = zg60Var.b != null ? g0h0.notification : xwg0.msg_notification_logo;
                s0Var.d(null, a3.hashCode(), vVar.b());
                hashMap.put(a3, new fj60(a3, f.d()));
                return true;
            }
        }
        return false;
    }
}
