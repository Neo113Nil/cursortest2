package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089t implements L {

    /* renamed from: b, reason: collision with root package name */
    public static final C0089t f1498b = new C0089t(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1499a;

    public /* synthetic */ C0089t(int i2) {
        this.f1499a = i2;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean a(Class cls) {
        switch (this.f1499a) {
            case 0:
                return AbstractC0092w.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final V b(Class cls) {
        switch (this.f1499a) {
            case 0:
                if (!AbstractC0092w.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (V) AbstractC0092w.f(cls.asSubclass(AbstractC0092w.class)).e(3);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
