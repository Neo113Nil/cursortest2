package pl.droidsonroids.gif;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f39947u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f39948v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, c cVar2, int i) {
        super(cVar2);
        this.f39948v = cVar;
        this.f39947u = i;
    }

    @Override // pl.droidsonroids.gif.f
    public final void a() {
        c cVar = this.f39948v;
        int i = this.f39947u;
        cVar.f39965z.q(cVar.f39964y, i);
        this.f39967n.f39954F.sendEmptyMessageAtTime(-1, 0L);
    }
}
