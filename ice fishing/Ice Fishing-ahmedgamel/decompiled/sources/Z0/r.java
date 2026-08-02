package Z0;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f4008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4010c;

    public /* synthetic */ r(v vVar, int i, int i4) {
        this.f4008a = vVar;
        this.f4009b = i;
        this.f4010c = i4;
    }

    @Override // Z0.u
    public final void run() {
        v vVar = this.f4008a;
        i iVar = vVar.f4046n;
        int i = this.f4009b;
        int i4 = this.f4010c;
        if (iVar == null) {
            vVar.f4057y.add(new r(vVar, i, i4));
        } else {
            vVar.f4053u.p(i, i4 + 0.99f);
        }
    }
}
