package bd;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f1127g;

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        n nVar = new n(2, dVar);
        nVar.f1127g = ((Number) obj).intValue();
        return nVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create(Integer.valueOf(((Number) obj).intValue()), (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        v6.a.W(obj);
        return Boolean.valueOf(this.f1127g > 0);
    }
}
