package G0;

import android.text.TextUtils;
import com.yandex.varioqub.config.VarioqubSettings;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class d {
    public static VarioqubSettings a(H0.d dVar) {
        String str = dVar.f657a;
        if (str == null) {
            throw new IllegalArgumentException("Client id must not be null");
        }
        VarioqubSettings.Builder builder = new VarioqubSettings.Builder(str);
        if (!TextUtils.isEmpty(dVar.f658b)) {
            builder.withUrl(dVar.f658b);
        }
        Long l2 = dVar.f659c;
        if (l2 != null) {
            builder.withThrottleInterval(l2.longValue());
        }
        Boolean bool = dVar.f661e;
        if (bool != null && bool.booleanValue()) {
            builder.withLogs();
        }
        Boolean bool2 = dVar.f662f;
        if (bool2 != null) {
            builder.withActivateEvent(bool2.booleanValue());
        }
        Map map = dVar.f660d;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                builder.withClientFeature((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return builder.build();
    }
}
