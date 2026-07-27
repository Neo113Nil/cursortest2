package L0;

/* renamed from: L0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059q extends E0.j implements D0.p {

    /* renamed from: g, reason: collision with root package name */
    public static final C0059q f674g = new C0059q(2, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final C0059q f675h = new C0059q(2, 1);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f676f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0059q(int i2, int i3) {
        super(i2);
        this.f676f = i3;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        switch (this.f676f) {
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
