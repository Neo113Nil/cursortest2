package o6;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class u extends i7.b {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f5349d;

    public u(v vVar) {
        this.f5349d = new WeakReference(vVar);
    }

    @Override // i7.b
    public final void H() {
        v vVar = (v) this.f5349d.get();
        if (vVar == null) {
            return;
        }
        v.f(vVar);
    }
}
