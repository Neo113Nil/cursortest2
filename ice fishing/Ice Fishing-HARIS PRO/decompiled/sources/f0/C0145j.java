package f0;

/* renamed from: f0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145j extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D1.l f2940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D1.l f2941c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f2942d;
    public final /* synthetic */ boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u1.e f2943f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0145j(D1.l lVar, D1.l lVar2, z zVar, boolean z2, u1.e eVar) {
        super(1);
        this.f2940b = lVar;
        this.f2941c = lVar2;
        this.f2942d = zVar;
        this.e = z2;
        this.f2943f = eVar;
    }

    @Override // C1.l
    public final Object g(Object obj) {
        C0141f c0141f = (C0141f) obj;
        D1.i.e(c0141f, "entry");
        this.f2940b.f167a = true;
        this.f2941c.f167a = true;
        this.f2942d.q(c0141f, this.e, this.f2943f);
        return t1.i.f4388c;
    }
}
