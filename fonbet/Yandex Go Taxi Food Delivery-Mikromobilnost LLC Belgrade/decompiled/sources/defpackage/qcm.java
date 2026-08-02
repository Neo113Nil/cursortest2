package defpackage;

import java.util.HashMap;
import java.util.Map;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* loaded from: classes12.dex */
public final class qcm implements pcm {
    public final lx4 a;

    public qcm(lx4 lx4Var) {
        this.a = lx4Var;
    }

    public final void a(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("source", str);
        }
        b("drive_tariff_opened", hashMap);
    }

    public final void b(String str, Map map) {
        i d = ((j) this.a).d("DriveSDK.".concat(str));
        d.a.putAll(map);
        d.m();
    }
}
