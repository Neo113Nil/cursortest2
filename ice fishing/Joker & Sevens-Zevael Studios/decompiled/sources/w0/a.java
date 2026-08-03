package w0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oc.c f7537g;

    public a(oc.c cVar) {
        this.f7537g = cVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        long j3;
        k kVar = (k) obj;
        synchronized (m.f7580c) {
            j3 = m.f7582e;
            m.f7582e = 1 + j3;
        }
        return new f(j3, kVar, this.f7537g);
    }
}
