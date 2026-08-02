package pl.droidsonroids.gif;

/* loaded from: classes2.dex */
public final class b extends f {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f39997u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ c f39998v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, c cVar2, int i) {
        super(cVar2);
        this.f39998v = cVar;
        this.f39997u = i;
    }

    @Override // pl.droidsonroids.gif.f
    public final void a() {
        c cVar = this.f39998v;
        int i = this.f39997u;
        cVar.f40015z.q(cVar.f40014y, i);
        this.f40017n.f40004F.sendEmptyMessageAtTime(-1, 0L);
    }
}
