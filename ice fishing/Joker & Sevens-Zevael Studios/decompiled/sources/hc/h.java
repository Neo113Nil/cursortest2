package hc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class h extends a {
    public h(fc.d dVar) {
        super(dVar);
        if (dVar != null && dVar.getContext() != fc.j.f2348g) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // fc.d
    public final fc.i getContext() {
        return fc.j.f2348g;
    }
}
