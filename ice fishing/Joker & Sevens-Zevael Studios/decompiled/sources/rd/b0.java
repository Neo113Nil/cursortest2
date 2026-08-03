package rd;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b0 extends hc.j implements oc.f {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ qd.h f6118g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ List f6119h;

    @Override // oc.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        b0 b0Var = new b0(3, (fc.d) obj3);
        b0Var.f6118g = (qd.h) obj;
        b0Var.f6119h = (List) obj2;
        return b0Var.invokeSuspend(ac.o.f277a);
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        v6.a.W(obj);
        return new ac.i(this.f6118g, this.f6119h);
    }
}
