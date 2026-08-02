package W1;

/* loaded from: classes.dex */
public final class c extends U1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3537b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i) {
        super(str, 0);
        this.f3537b = i;
    }

    @Override // U1.a
    public final void b(Object obj, float f2) {
        switch (this.f3537b) {
            case 0:
                ((e) obj).g(f2);
                break;
            case 1:
                ((e) obj).f3552E = f2;
                break;
            case 2:
                ((e) obj).f3553F = f2;
                break;
            case 3:
                ((e) obj).f3559u = f2;
                break;
            default:
                ((e) obj).f3560v = f2;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3537b) {
            case 0:
                return Float.valueOf(((e) obj).f3558n);
            case 1:
                return Float.valueOf(((e) obj).f3552E);
            case 2:
                return Float.valueOf(((e) obj).f3553F);
            case 3:
                return Float.valueOf(((e) obj).f3559u);
            default:
                return Float.valueOf(((e) obj).f3560v);
        }
    }
}
