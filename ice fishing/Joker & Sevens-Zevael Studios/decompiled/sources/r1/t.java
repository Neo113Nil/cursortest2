package r1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hc.j f5993a;

    /* JADX WARN: Multi-variable type inference failed */
    public t(oc.e eVar) {
        this.f5993a = (hc.j) eVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof t)) {
            return false;
        }
        return this.f5993a.equals(((t) obj).f5993a);
    }

    public final int hashCode() {
        return this.f5993a.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hc.j, oc.e] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(r rVar, fc.d dVar) {
        return this.f5993a.invoke(rVar, dVar);
    }
}
