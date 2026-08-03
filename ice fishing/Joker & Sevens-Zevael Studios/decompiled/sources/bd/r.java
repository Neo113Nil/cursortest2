package bd;

import yc.k0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r implements k0 {

    /* renamed from: g, reason: collision with root package name */
    public final t f1135g;

    /* renamed from: h, reason: collision with root package name */
    public final long f1136h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f1137i;

    /* renamed from: j, reason: collision with root package name */
    public final yc.g f1138j;

    public r(t tVar, long j3, Object obj, yc.g gVar) {
        this.f1135g = tVar;
        this.f1136h = j3;
        this.f1137i = obj;
        this.f1138j = gVar;
    }

    @Override // yc.k0
    public final void a() {
        t tVar = this.f1135g;
        synchronized (tVar) {
            if (this.f1136h < tVar.o()) {
                return;
            }
            Object[] objArr = tVar.f1149n;
            pc.j.b(objArr);
            long j3 = this.f1136h;
            if (objArr[((int) j3) & (objArr.length - 1)] != this) {
                return;
            }
            u.b(objArr, j3, u.f1154a);
            tVar.i();
        }
    }
}
