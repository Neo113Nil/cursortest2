package X0;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f3712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3714c;

    public /* synthetic */ r(v vVar, int i, int i4) {
        this.f3712a = vVar;
        this.f3713b = i;
        this.f3714c = i4;
    }

    @Override // X0.u
    public final void run() {
        v vVar = this.f3712a;
        i iVar = vVar.f3746n;
        int i = this.f3713b;
        int i4 = this.f3714c;
        if (iVar == null) {
            vVar.f3762y.add(new r(vVar, i, i4));
        } else {
            vVar.f3754u.p(i, i4 + 0.99f);
        }
    }
}
