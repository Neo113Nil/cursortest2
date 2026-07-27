package X0;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3646a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f3647b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3648c;

    public /* synthetic */ o(v vVar, int i, int i6) {
        this.f3646a = i6;
        this.f3647b = vVar;
        this.f3648c = i;
    }

    @Override // X0.u
    public final void run() {
        switch (this.f3646a) {
            case 0:
                this.f3647b.p(this.f3648c);
                break;
            case 1:
                this.f3647b.s(this.f3648c);
                break;
            default:
                this.f3647b.o(this.f3648c);
                break;
        }
    }
}
