package X0;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f3644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3645c;

    public /* synthetic */ n(v vVar, String str, int i) {
        this.f3643a = i;
        this.f3644b = vVar;
        this.f3645c = str;
    }

    @Override // X0.u
    public final void run() {
        switch (this.f3643a) {
            case 0:
                this.f3644b.r(this.f3645c);
                break;
            case 1:
                this.f3644b.q(this.f3645c);
                break;
            default:
                this.f3644b.t(this.f3645c);
                break;
        }
    }
}
