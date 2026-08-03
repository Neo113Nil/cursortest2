package o6;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p extends e7.d {

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f5317d;

    public p(s sVar) {
        this.f5317d = new WeakReference(sVar);
    }

    @Override // e7.e
    public final void a(e7.h hVar) {
        s sVar = (s) this.f5317d.get();
        if (sVar == null) {
            return;
        }
        y yVar = sVar.f5326g;
        m mVar = new m(sVar, sVar, hVar);
        t tVar = yVar.f5377h;
        tVar.sendMessage(tVar.obtainMessage(1, mVar));
    }
}
