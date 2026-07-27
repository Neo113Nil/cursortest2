package K0;

/* renamed from: K0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041q extends E0.j implements D0.p {

    /* renamed from: h, reason: collision with root package name */
    public static final C0041q f526h = new C0041q(2, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C0041q f527i = new C0041q(2, 1);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f528g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0041q(int i2, int i3) {
        super(i2);
        this.f528g = i3;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        switch (this.f528g) {
            case 0:
                return ((v0.i) obj).f((v0.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((v0.i) obj).f((v0.g) obj2);
        }
    }
}
