package Z0;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3998a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f3999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4000c;

    public /* synthetic */ o(v vVar, int i, int i4) {
        this.f3998a = i4;
        this.f3999b = vVar;
        this.f4000c = i;
    }

    @Override // Z0.u
    public final void run() {
        switch (this.f3998a) {
            case 0:
                this.f3999b.p(this.f4000c);
                break;
            case 1:
                this.f3999b.s(this.f4000c);
                break;
            default:
                this.f3999b.o(this.f4000c);
                break;
        }
    }
}
