package md;

import bc.a0;
import c5.c;
import h2.m;
import nd.d;
import nd.h;
import nd.k;
import od.b;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f4970a;

    public a(b bVar) {
        j.e(bVar, "database");
        this.f4970a = bVar;
    }

    public final String a() {
        c c3 = a0.c(-1438461650, new String[]{"stored_uuid"}, (g5.j) this.f4970a.f5389b.f1234a, "getStoredUuid", "SELECT uuid FROM stored_uuid WHERE id = 1", new m(27));
        return (String) c3.a(new c5.a(c3, 0)).f2315b;
    }

    public final void b(String str) {
        j.e(str, "uuid");
        k kVar = this.f4970a.f5389b;
        kVar.getClass();
        ((g5.j) kVar.f1234a).a(950097453, "INSERT OR REPLACE INTO stored_uuid(id, uuid)\nVALUES (1, ?)", new h(str, 1));
        kVar.b(new d(4));
    }
}
