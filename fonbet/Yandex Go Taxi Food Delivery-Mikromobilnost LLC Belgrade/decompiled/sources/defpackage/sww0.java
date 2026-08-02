package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;

/* loaded from: classes6.dex */
public final class sww0 implements v1g0 {
    public final wnt a;
    public final h3y b;
    public final h3y c;

    public sww0(wnt wntVar, h3y h3yVar, h3y h3yVar2) {
        this.a = wntVar;
        this.b = h3yVar;
        this.c = h3yVar2;
    }

    @Override // defpackage.v1g0
    public final boolean a(Map map) {
        NotificationShareData.a aVar;
        boolean z;
        PendingIntent activity;
        if ("survey".equals((String) map.get("type"))) {
            String str = (String) map.get("extra");
            KSerializer serializer = qww0.Companion.serializer();
            wnt wntVar = this.a;
            qww0 qww0Var = (qww0) r85.c(wntVar, str, serializer);
            if (qww0Var != null) {
                String str2 = (String) map.get("local_channel_id");
                boolean z2 = true;
                if (str2 == null) {
                    r85.e(this.c, map);
                    return true;
                }
                xk60 xk60Var = (xk60) this.b.get();
                NotificationShareData.a a = r85.a(wntVar, map);
                xk60Var.getClass();
                a.a = 17533;
                NotificationShareData a2 = a.a();
                Application application = xk60Var.a;
                v vVar = new v(application, str2);
                vVar.e = v.d(qww0Var.b);
                vVar.f = v.d(qww0Var.c);
                vVar.h(16, true);
                vVar.h(2, false);
                int i = xk60.n;
                vVar.K.icon = i;
                vVar.z = ((avj0) xk60Var.c).a(rqg0.notification_tint_color);
                vVar.g(-1);
                if (a2 != null) {
                    aVar = new NotificationShareData.a();
                    aVar.e = a2.getType();
                    aVar.b = a2.getPushId();
                    aVar.c = a2.getTransitId();
                    aVar.a = a2.getId();
                    aVar.d = a2.getTag();
                    Map<String, String> params = a2.getParams();
                    if (params != null) {
                        aVar.g = new HashMap(params);
                    }
                } else {
                    aVar = new NotificationShareData.a();
                }
                Iterator it = qww0Var.d.iterator();
                while (it.hasNext()) {
                    qy6 qy6Var = (qy6) it.next();
                    String str3 = qy6Var.b;
                    aVar.f = str3;
                    String str4 = qww0Var.a;
                    String str5 = qy6Var.a;
                    String str6 = qy6Var.c;
                    Uri parse = str6 != null ? Uri.parse(str6) : null;
                    NotificationShareData a3 = aVar.a();
                    boolean z3 = z2;
                    rww0 rww0Var = (rww0) xk60Var.e.get();
                    qww0 qww0Var2 = qww0Var;
                    Iterator it2 = it;
                    if (parse == null) {
                        rww0Var.getClass();
                        Intent data = new Intent(application, (Class<?>) rww0Var.a.a(AndroidComponentRepository$Component.SURVEY_DEEPLINK_SERVICE)).putExtra("SURVEY_ID", str4).putExtra("BUTTON_ID", str3).setData(Uri.fromParts("buttonid", str3, null));
                        data.putExtra("notification_share_data_extra", a3);
                        z = false;
                        activity = PendingIntent.getService(application, 0, data, 201326592);
                    } else {
                        z = false;
                        Intent c = xk60Var.c(xk60Var.b.a(parse), a3);
                        rww0Var.getClass();
                        activity = PendingIntent.getActivity(application, 0, c.putExtra("SURVEY_ID", str4).putExtra("BUTTON_ID", str3), 201326592);
                    }
                    vVar.b.add(new zf0(i, str5, activity).a());
                    z2 = z3;
                    qww0Var = qww0Var2;
                    it = it2;
                }
                boolean z4 = z2;
                xk60Var.l(a, vVar);
                return z4;
            }
        }
        return false;
    }
}
