package yc;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y1 extends u {

    /* renamed from: i, reason: collision with root package name */
    public static final y1 f8920i = new y1();

    @Override // yc.u
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // yc.u
    public final void w(fc.i iVar, Runnable runnable) {
        c2 c2Var = (c2) iVar.v(c2.f8838i);
        if (c2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c2Var.f8839h = true;
    }
}
