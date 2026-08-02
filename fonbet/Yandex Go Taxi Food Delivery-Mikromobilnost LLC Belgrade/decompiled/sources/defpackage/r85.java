package defpackage;

import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;

/* loaded from: classes6.dex */
public final class r85 {
    public static NotificationShareData.a a(wnt wntVar, Map map) {
        String str = (String) map.get("type");
        String str2 = (String) map.get("id");
        td51 td51Var = (td51) c(wntVar, (String) map.get("xiva"), td51.Companion.serializer());
        String str3 = td51Var != null ? td51Var.a : null;
        NotificationShareData.a aVar = new NotificationShareData.a();
        aVar.b = str2;
        aVar.c = str3;
        aVar.e = str;
        if (str3 != null && !evu0.J(str3)) {
            aVar.a = str3.hashCode();
            return aVar;
        }
        if (str2 != null && !evu0.J(str2)) {
            aVar.a = str2.hashCode();
        }
        return aVar;
    }

    public static long b(Map map) {
        Long m;
        Object obj = map.get("expiration_interval");
        return TimeUnit.SECONDS.toMillis(obj instanceof Number ? ((Number) obj).longValue() : (!(obj instanceof String) || (m = bvu0.m(10, (String) obj)) == null) ? 0L : m.longValue());
    }

    public static Object c(wnt wntVar, String str, KSerializer kSerializer) {
        if (str != null && str.length() != 0) {
            try {
                return ((xnt) wntVar).c(str, kSerializer);
            } catch (SerializationException e) {
                jst.e.k(e, String.format("Failed to parse '%s' from gcm message", Arrays.copyOf(new Object[]{str}, 1)));
            }
        }
        return null;
    }

    public static i5p d(wnt wntVar, Map map) {
        return (i5p) c(wntVar, (String) map.get("extra"), i5p.Companion.serializer());
    }

    public static void e(h3y h3yVar, Map map) {
        String str = (String) map.get("id");
        if (str != null) {
            ((p1g0) h3yVar.get()).a(str, null);
            xby.l(jst.e, "PUSH_ACK:ERROR:NO_CHANNEL_ID", null, null, "Failed to handle push with payload ".concat(a.X(iw00.x(map), null, null, null, null, 63)), 2);
        }
    }

    public static void f(Exception exc, String str, String str2) {
        xby.l(jst.e, "PUSH_ACK:ERROR:".concat(str), null, exc, str2, 2);
    }

    public static void h(h3y h3yVar, Map map) {
        String str = (String) map.get("id");
        if (str != null) {
            ((com.yandex.go.notifications.acknowledge.domain.a) ((p1g0) h3yVar.get()).a.get()).b(str, PushAckStatus.HIDDEN);
        }
    }
}
