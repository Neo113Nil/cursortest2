package hd;

import android.content.Context;
import pc.t;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements yb.c {

    /* renamed from: a, reason: collision with root package name */
    public final g f2885a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2886b;

    public f(g gVar, int i10) {
        this.f2885a = gVar;
        this.f2886b = i10;
    }

    @Override // zb.a
    public final Object get() {
        g gVar = this.f2885a;
        int i10 = this.f2886b;
        if (i10 == 0) {
            od.b bVar = (od.b) gVar.f2890d.get();
            pc.j.e(bVar, "database");
            nd.k kVar = bVar.f5389b;
            if (kVar != null) {
                return new id.i(kVar);
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
        if (i10 == 1) {
            g5.j jVar = (g5.j) gVar.f2889c.get();
            pc.j.e(jVar, "sqlDriver");
            t.a(od.b.class);
            return new od.b(jVar);
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return new md.a((od.b) gVar.f2890d.get());
            }
            throw new AssertionError(i10);
        }
        Context context = gVar.f2887a.f5771a;
        t.a(od.b.class);
        return new g5.j(new i4.g(context, "game_v2.db", new g5.e(new f5.a[0]), false, false), null, 20);
    }
}
