package x0;

import java.util.List;
import m0.r;
import m6.i;
import n0.j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements j0, fc.g {

    /* renamed from: h, reason: collision with root package name */
    public static final i f7962h = new i(17);

    /* renamed from: g, reason: collision with root package name */
    public final r f7963g;

    public b(r rVar) {
        this.f7963g = rVar;
    }

    @Override // n0.j0
    public final List c(Integer num) {
        return this.f7963g.F();
    }

    @Override // fc.i
    public final fc.i d(fc.i iVar) {
        return v6.a.K(this, iVar);
    }

    @Override // fc.i
    public final fc.i g(fc.h hVar) {
        return v6.a.J(this, hVar);
    }

    @Override // fc.g
    public final fc.h getKey() {
        return f7962h;
    }

    @Override // fc.i
    public final Object i(Object obj, oc.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // fc.i
    public final fc.g v(fc.h hVar) {
        return v6.a.D(this, hVar);
    }
}
