package Z0;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f3996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3997c;

    public /* synthetic */ n(v vVar, String str, int i) {
        this.f3995a = i;
        this.f3996b = vVar;
        this.f3997c = str;
    }

    @Override // Z0.u
    public final void run() {
        switch (this.f3995a) {
            case 0:
                this.f3996b.r(this.f3997c);
                break;
            case 1:
                this.f3996b.q(this.f3997c);
                break;
            default:
                this.f3996b.t(this.f3997c);
                break;
        }
    }
}
