package U1;

/* loaded from: classes.dex */
public final class c extends S1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3246b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i) {
        super(str, 0);
        this.f3246b = i;
    }

    @Override // S1.a
    public final void b(Object obj, float f6) {
        switch (this.f3246b) {
            case 0:
                ((e) obj).g(f6);
                break;
            case 1:
                ((e) obj).f3261E = f6;
                break;
            case 2:
                ((e) obj).f3262F = f6;
                break;
            case 3:
                ((e) obj).f3268u = f6;
                break;
            default:
                ((e) obj).f3269v = f6;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3246b) {
            case 0:
                return Float.valueOf(((e) obj).f3267n);
            case 1:
                return Float.valueOf(((e) obj).f3261E);
            case 2:
                return Float.valueOf(((e) obj).f3262F);
            case 3:
                return Float.valueOf(((e) obj).f3268u);
            default:
                return Float.valueOf(((e) obj).f3269v);
        }
    }
}
