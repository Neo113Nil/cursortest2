package u0;

import m0.r1;
import m0.u1;
import m0.z2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i extends r0.c implements r1 {

    /* renamed from: j, reason: collision with root package name */
    public static final i f6678j = new i(r0.k.f5916e, 0);

    public final i b(u1 u1Var, z2 z2Var) {
        e3.j u10 = this.f5902g.u(u1Var.hashCode(), 0, u1Var, z2Var);
        return u10 == null ? this : new i((r0.k) u10.f2092c, this.f5903h + u10.f2091b);
    }

    @Override // r0.c, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof u1) {
            return super.containsKey((u1) obj);
        }
        return false;
    }

    @Override // bc.f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof z2) {
            return super.containsValue((z2) obj);
        }
        return false;
    }

    @Override // r0.c, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof u1) {
            return (z2) super.get((u1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof u1) ? obj2 : (z2) super.getOrDefault((u1) obj, (z2) obj2);
    }
}
