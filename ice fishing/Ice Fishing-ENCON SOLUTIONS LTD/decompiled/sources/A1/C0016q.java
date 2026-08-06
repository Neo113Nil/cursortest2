package A1;

/* renamed from: A1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016q extends kotlin.jvm.internal.j implements t1.p {

    /* renamed from: f, reason: collision with root package name */
    public static final C0016q f65f = new C0016q(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C0016q f66g = new C0016q(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f67e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0016q(int i2, int i3) {
        super(i2);
        this.f67e = i3;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f67e) {
            case 0:
                return ((l1.i) obj).l((l1.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((l1.i) obj).l((l1.g) obj2);
        }
    }
}
