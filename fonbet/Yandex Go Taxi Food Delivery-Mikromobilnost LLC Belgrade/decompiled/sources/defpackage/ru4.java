package defpackage;

import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class ru4 {
    public final o3h a;

    public ru4(o3h o3hVar) {
        this.a = o3hVar;
    }

    public final String a(Map map) {
        String p0 = evu0.p0(evu0.k0("promocode").toString(), '/');
        ((pux0) this.a).getClass();
        String p = g8e.p(pux0.c, "://", p0);
        return map.isEmpty() ? p : g8e.p(p, "?", a.X(map.entrySet(), "&", null, null, new at3(20), 30));
    }
}
