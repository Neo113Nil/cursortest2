package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f4572g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f4573h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pc.q f4574i;

    public e(d dVar, f fVar, pc.q qVar) {
        this.f4572g = dVar;
        this.f4573h = fVar;
        this.f4574i = qVar;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        int i10;
        d dVar = this.f4572g;
        dVar.f4544a = null;
        dVar.f4545b = null;
        u0.a aVar = this.f4573h.f4580j;
        int i11 = this.f4574i.f5681g;
        do {
            i10 = aVar.get();
        } while (!aVar.compareAndSet(i10, ((i10 >>> 27) & 15) == i11 ? i10 - 1 : i10));
        return ac.o.f277a;
    }
}
