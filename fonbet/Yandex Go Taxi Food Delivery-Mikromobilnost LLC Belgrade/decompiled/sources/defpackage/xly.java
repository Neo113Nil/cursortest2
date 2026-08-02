package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import androidx.core.app.v;
import com.adjust.sdk.Constants;
import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import com.yandex.go.notifications.acknowledge.domain.a;
import java.util.Map;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;
import ru.yandex.taxi.startup.launch.c;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;
import ru.yandex.taxi.vendor_api.google.push.FcmNotificationService;

/* loaded from: classes6.dex */
public final class xly implements v1g0 {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final wnt f;

    public xly(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, wnt wntVar) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = h3yVar4;
        this.e = h3yVar5;
        this.f = wntVar;
    }

    @Override // defpackage.v1g0
    public final boolean a(Map map) {
        String str = (String) map.get(Constants.DEEPLINK);
        String str2 = (String) map.get(FcmNotificationService.KEY_TITLE);
        String str3 = (String) map.get(FcmNotificationService.KEY_BODY);
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str3;
        if (str != null && !evu0.J(str)) {
            Uri a = ((f) this.a.get()).a(Uri.parse(str));
            if ("linkedorder".equalsIgnoreCase(a != null ? a.getAuthority() : null)) {
                ((c) this.b.get()).b("LinkedOrder.RefreshLaunchFromDeeplink", true);
                if (!((MainUiAvailabilityMonitor) this.c.get()).a()) {
                    String str5 = (String) map.get("id");
                    if (str5 != null) {
                        ((a) ((p1g0) this.e.get()).a.get()).b(str5, PushAckStatus.HIDDEN);
                    }
                    return true;
                }
                long b = r85.b(map);
                xk60 xk60Var = (xk60) this.d.get();
                NotificationShareData.a a2 = r85.a(this.f, map);
                xk60Var.getClass();
                PendingIntent activity = PendingIntent.getActivity(xk60Var.a, 0, xk60Var.c(a, a2.a()), 201326592);
                v i = xk60Var.i(str4, str2, null, "order", activity, b);
                i.m = 1;
                a2.a = activity.hashCode();
                xk60Var.l(a2, i);
                return true;
            }
        }
        return false;
    }
}
