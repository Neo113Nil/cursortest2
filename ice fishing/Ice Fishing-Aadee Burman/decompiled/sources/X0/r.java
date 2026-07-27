package X0;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f3656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3658c;

    public /* synthetic */ r(v vVar, int i, int i6) {
        this.f3656a = vVar;
        this.f3657b = i;
        this.f3658c = i6;
    }

    @Override // X0.u
    public final void run() {
        v vVar = this.f3656a;
        i iVar = vVar.f3690n;
        int i = this.f3657b;
        int i6 = this.f3658c;
        if (iVar == null) {
            vVar.f3706y.add(new r(vVar, i, i6));
        } else {
            vVar.f3698u.p(i, i6 + 0.99f);
        }
    }
}
