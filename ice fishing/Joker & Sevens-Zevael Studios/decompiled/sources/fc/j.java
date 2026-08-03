package fc;

import java.io.Serializable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final j f2348g = new j();

    @Override // fc.i
    public final i d(i iVar) {
        pc.j.e(iVar, "context");
        return iVar;
    }

    @Override // fc.i
    public final i g(h hVar) {
        pc.j.e(hVar, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // fc.i
    public final g v(h hVar) {
        pc.j.e(hVar, "key");
        return null;
    }

    @Override // fc.i
    public final Object i(Object obj, oc.e eVar) {
        return obj;
    }
}
