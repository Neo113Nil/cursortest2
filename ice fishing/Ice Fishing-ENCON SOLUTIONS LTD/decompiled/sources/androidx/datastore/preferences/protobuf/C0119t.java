package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119t implements L {

    /* renamed from: b, reason: collision with root package name */
    public static final C0119t f2458b = new C0119t(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2459a;

    public /* synthetic */ C0119t(int i2) {
        this.f2459a = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean a(Class cls) {
        switch (this.f2459a) {
            case 0:
                return AbstractC0122w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final V b(Class cls) {
        switch (this.f2459a) {
            case 0:
                if (!AbstractC0122w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (V) AbstractC0122w.f(cls.asSubclass(AbstractC0122w.class)).e(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
