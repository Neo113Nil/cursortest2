package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d0 extends hc.j implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ float f6818g;

    @Override // hc.a
    public final fc.d create(Object obj, fc.d dVar) {
        d0 d0Var = new d0(2, dVar);
        d0Var.f6818g = ((Number) obj).floatValue();
        return d0Var;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create(Float.valueOf(((Number) obj).floatValue()), (fc.d) obj2)).invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        v6.a.W(obj);
        return Boolean.valueOf(this.f6818g > 0.0f);
    }
}
