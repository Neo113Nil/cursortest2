package defpackage;

import java.util.Map;
import ru.yandex.taxi.jobs.b;
import ru.yandex.taxi.startup.launch.c;

/* loaded from: classes6.dex */
public final class zjs implements v1g0 {
    public final /* synthetic */ int a;
    public final h3y b;

    public /* synthetic */ zjs(h3y h3yVar, int i) {
        this.a = i;
        this.b = h3yVar;
    }

    @Override // defpackage.v1g0
    public final boolean a(Map map) {
        int i = this.a;
        h3y h3yVar = this.b;
        switch (i) {
            case 0:
                if (!map.containsKey("fetch_fullscreen")) {
                    return false;
                }
                ((b) h3yVar.get()).e(new w4j0("sync_promotions", 0L, null, null, null, false, false, 0L, null, 2046));
                return true;
            default:
                if (Boolean.parseBoolean((String) map.get("update_session"))) {
                    ((c) h3yVar.get()).b("LaunchUpdatePushHandler", true);
                }
                return false;
        }
    }
}
