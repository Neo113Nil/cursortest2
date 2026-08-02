package defpackage;

import com.ybsdk.persistence.b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes8.dex */
public final class q820 implements p8w {
    public static final Set c;
    public final csu a;
    public final a7j0 b;

    static {
        String str = yu50.a;
        c = j73.f0(new String[]{yu50.f, "Authorization"});
    }

    public q820(csu csuVar, a7j0 a7j0Var) {
        this.a = csuVar;
        this.b = a7j0Var;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        String a;
        zci0 zci0Var = (zci0) m8wVar;
        d5j0 d5j0Var = zci0Var.e;
        if (!this.a.a(d5j0Var.a.d)) {
            return zci0Var.b(d5j0Var);
        }
        t4j0 b = d5j0Var.b();
        a7j0 a7j0Var = this.b;
        a7j0Var.getClass();
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(ExtFunctionsKt.HEADER_USER_AGENT, a7j0Var.b.a());
        mapBuilder.put("Accept-Language", a7j0Var.c.a());
        mapBuilder.put("Content-Type", "application/json;charset=utf-8");
        mapBuilder.put(GlideBitmapDownloader.ACCEPT_HEADER, "application/json");
        mapBuilder.put(yu50.c, TimeZone.getDefault().getID());
        mapBuilder.put(yu50.b, "SYSTEM");
        String str = a7j0Var.a.f;
        if (str != null && !evu0.J(str)) {
            mapBuilder.put(yu50.f, str);
        }
        String str2 = a7j0Var.d.d;
        if (str2 == null) {
            str2 = null;
        }
        if (str2 != null && !evu0.J(str2)) {
            mapBuilder.put("Authorization", "Bearer ".concat(str2));
        }
        ew2 ew2Var = a7j0Var.e.j;
        kgx kgxVar = b.l[7];
        if (ew2Var.a().booleanValue()) {
            mapBuilder.put("X-Request-Time", mpb1.b(System.currentTimeMillis()));
        }
        Iterator it = ((vf00) mapBuilder.j().entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (!c.contains(str3) || (a = d5j0Var.c.a(str3)) == null || evu0.J(a)) {
                b.d(str3, str4);
            }
        }
        b.e(d5j0Var.b, d5j0Var.d);
        return zci0Var.b(new d5j0(b));
    }
}
