package U1;

/* loaded from: classes.dex */
public final class c extends S1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3168b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i) {
        super(str, 0);
        this.f3168b = i;
    }

    @Override // S1.a
    public final void b(Object obj, float f3) {
        switch (this.f3168b) {
            case 0:
                ((e) obj).g(f3);
                break;
            case 1:
                ((e) obj).f3183E = f3;
                break;
            case 2:
                ((e) obj).f3184F = f3;
                break;
            case 3:
                ((e) obj).f3190u = f3;
                break;
            default:
                ((e) obj).f3191v = f3;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3168b) {
            case 0:
                return Float.valueOf(((e) obj).f3189n);
            case 1:
                return Float.valueOf(((e) obj).f3183E);
            case 2:
                return Float.valueOf(((e) obj).f3184F);
            case 3:
                return Float.valueOf(((e) obj).f3190u);
            default:
                return Float.valueOf(((e) obj).f3191v);
        }
    }
}
