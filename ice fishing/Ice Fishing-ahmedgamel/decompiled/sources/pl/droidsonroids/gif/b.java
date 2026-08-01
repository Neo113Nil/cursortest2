package pl.droidsonroids.gif;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f39950u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f39951v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, c cVar2, int i) {
        super(cVar2);
        this.f39951v = cVar;
        this.f39950u = i;
    }

    @Override // pl.droidsonroids.gif.f
    public final void a() {
        c cVar = this.f39951v;
        int i = this.f39950u;
        cVar.f39968z.q(cVar.f39967y, i);
        this.f39970n.f39957F.sendEmptyMessageAtTime(-1, 0L);
    }
}
