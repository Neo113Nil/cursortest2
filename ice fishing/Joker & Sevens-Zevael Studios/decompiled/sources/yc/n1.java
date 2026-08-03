package yc;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class n1 extends fc.a implements b1 {

    /* renamed from: h, reason: collision with root package name */
    public static final n1 f8880h = new n1(v.f8910h);

    @Override // yc.b1
    public final boolean b() {
        return true;
    }

    @Override // yc.b1
    public final b1 getParent() {
        return null;
    }

    @Override // yc.b1
    public final Object j(fc.d dVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // yc.b1
    public final k0 k(oc.c cVar) {
        return o1.f8887g;
    }

    @Override // yc.b1
    public final CancellationException m() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // yc.b1
    public final k0 o(boolean z10, boolean z11, d1.q qVar) {
        return o1.f8887g;
    }

    @Override // yc.b1
    public final j r(k1 k1Var) {
        return o1.f8887g;
    }

    @Override // yc.b1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // yc.b1, ad.t
    public final void a(CancellationException cancellationException) {
    }
}
