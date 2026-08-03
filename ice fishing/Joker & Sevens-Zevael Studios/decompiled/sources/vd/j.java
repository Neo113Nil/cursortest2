package vd;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import r1.r;
import x.a0;
import x.k1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f7339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v.c f7340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oc.a f7341c;

    public j(boolean z10, v.c cVar, oc.a aVar) {
        this.f7339a = z10;
        this.f7340b = cVar;
        this.f7341c = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(r rVar, fc.d dVar) {
        boolean z10 = this.f7339a;
        ac.o oVar = ac.o.f277a;
        if (z10) {
            i iVar = new i(this.f7340b, this.f7341c, null);
            a0 a0Var = k1.f7836a;
            Object e10 = yc.a0.e(new c0.c(rVar, iVar, (fc.d) null, 14), dVar);
            gc.a aVar = gc.a.f2559g;
            if (e10 != aVar) {
                e10 = oVar;
            }
            if (e10 == aVar) {
                return e10;
            }
        }
        return oVar;
    }
}
