package androidx.activity;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.i implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4411n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f4412u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(G g4, int i) {
        super(0);
        this.f4411n = i;
        this.f4412u = g4;
    }

    @Override // I7.a
    public final Object invoke() {
        switch (this.f4411n) {
            case 0:
                this.f4412u.c();
                break;
            case 1:
                this.f4412u.b();
                break;
            default:
                this.f4412u.c();
                break;
        }
        return u7.v.f41350a;
    }
}
