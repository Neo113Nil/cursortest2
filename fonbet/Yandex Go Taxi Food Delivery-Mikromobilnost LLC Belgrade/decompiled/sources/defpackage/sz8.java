package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;
import java.util.HashMap;
import java.util.Map;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.perf.b;

/* loaded from: classes14.dex */
public final class sz8 {
    public final kf00 a;
    public final x3j0 b;
    public final c c;
    public final b d;

    public sz8(kf00 kf00Var, x3j0 x3j0Var, c cVar, b bVar) {
        this.a = kf00Var;
        this.b = x3j0Var;
        this.c = cVar;
        this.d = bVar;
    }

    public final void a() {
        Screen b = this.c.b();
        b.getClass();
        if (b == Screen.NONE || b == Screen.UNSUPPORTED) {
            return;
        }
        x3j0 x3j0Var = this.b;
        if (x3j0Var.a.contains(b)) {
            return;
        }
        Map d = this.d.d();
        Object obj = d.get("app_launch_type");
        Double d2 = null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = d.get("timeSinceAppLaunch");
        Double valueOf = obj2 instanceof Number ? Double.valueOf(((Number) obj2).doubleValue()) : obj2 instanceof String ? avu0.i((String) obj2) : null;
        Object obj3 = d.get("time_since_app_launch_sec");
        if (obj3 instanceof Number) {
            d2 = Double.valueOf(((Number) obj3).doubleValue());
        } else if (obj3 instanceof String) {
            d2 = avu0.i((String) obj3);
        }
        String b2 = b.b();
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("app_launch_type", str);
        }
        if (valueOf != null) {
            hashMap.put("time_since_app_launch", valueOf);
        }
        if (d2 != null) {
            hashMap.put("time_since_app_launch_sec", d2);
        }
        if (b2 != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, b2);
        }
        this.a.a.a("Map.CarPictureAppeared", hashMap, 1, new HashMap());
        x3j0Var.a.add(b);
    }
}
