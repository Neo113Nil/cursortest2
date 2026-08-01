package L1;

/* renamed from: L1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012m extends D1.j implements C1.p {

    /* renamed from: c, reason: collision with root package name */
    public static final C0012m f568c = new C0012m(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final C0012m f569d = new C0012m(2, 1);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f570b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0012m(int i, int i2) {
        super(i);
        this.f570b = i2;
    }

    @Override // C1.p
    public final Object d(Object obj, Object obj2) {
        switch (this.f570b) {
            case 0:
                return ((v1.i) obj).f((v1.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((v1.i) obj).f((v1.g) obj2);
        }
    }
}
