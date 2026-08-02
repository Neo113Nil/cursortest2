package androidx.activity;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.i implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4379n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f4380u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(G g9, int i) {
        super(0);
        this.f4379n = i;
        this.f4380u = g9;
    }

    @Override // I7.a
    public final Object invoke() {
        switch (this.f4379n) {
            case 0:
                this.f4380u.c();
                break;
            case 1:
                this.f4380u.b();
                break;
            default:
                this.f4380u.c();
                break;
        }
        return u7.v.f41073a;
    }
}
