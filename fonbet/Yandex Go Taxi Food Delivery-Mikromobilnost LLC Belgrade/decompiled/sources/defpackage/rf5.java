package defpackage;

import android.os.PowerManager;
import java.util.HashMap;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes14.dex */
public final class rf5 {
    public final o61 a;
    public final bg5 b;
    public final PowerManager c;

    public rf5(o61 o61Var, bg5 bg5Var, PowerManager powerManager) {
        this.a = o61Var;
        this.b = bg5Var;
        this.c = powerManager;
    }

    public final void a(String str) {
        bg5 bg5Var = this.b;
        int b = bg5Var.b();
        String title = bg5Var.c().getTitle();
        boolean isPowerSaveMode = this.c.isPowerSaveMode();
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("level", Integer.valueOf(b));
        mapBuilder.put(ClidProvider.STATE, title);
        mapBuilder.put("low_power_mode", Boolean.valueOf(isPowerSaveMode));
        MapBuilder j = mapBuilder.j();
        o61 o61Var = this.a;
        o61Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("battery", j);
        hashMap.put("trigger", str);
        o61Var.a.a("battery_report", hashMap, 1, new HashMap());
    }

    public final void b() {
        a("order_sent");
    }
}
