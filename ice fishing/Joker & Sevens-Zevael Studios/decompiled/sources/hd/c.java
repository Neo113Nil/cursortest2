package hd;

import java.util.Collections;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements ub.a, ub.g, xb.a, n {

    /* renamed from: a, reason: collision with root package name */
    public final g f2880a;

    /* renamed from: b, reason: collision with root package name */
    public final e f2881b;

    public c(g gVar, e eVar) {
        this.f2880a = gVar;
        this.f2881b = eVar;
    }

    public final yb.b a() {
        b4.l lVar = new b4.l(2);
        Boolean bool = Boolean.TRUE;
        LinkedHashMap linkedHashMap = lVar.f997a;
        linkedHashMap.put("sd.k", bool);
        linkedHashMap.put("rd.d0", bool);
        linkedHashMap.put("td.f", bool);
        linkedHashMap.put("be.a", bool);
        linkedHashMap.put("ud.i", bool);
        linkedHashMap.put("vd.q", bool);
        linkedHashMap.put("yd.a", bool);
        linkedHashMap.put("zd.f", bool);
        return new yb.b(linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap));
    }
}
