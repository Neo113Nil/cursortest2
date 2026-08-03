package y1;

import android.view.Choreographer;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k0 implements Choreographer.FrameCallback {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yc.g f8577g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ oc.c f8578h;

    public k0(yc.g gVar, m0.n1 n1Var, oc.c cVar) {
        this.f8577g = gVar;
        this.f8578h = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        Object s10;
        try {
            s10 = this.f8578h.invoke(Long.valueOf(j3));
        } catch (Throwable th) {
            s10 = v6.a.s(th);
        }
        this.f8577g.resumeWith(s10);
    }
}
