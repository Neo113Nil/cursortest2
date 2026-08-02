package W1;

/* loaded from: classes.dex */
public final class d extends U1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3538b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(String str, int i) {
        super(str, 1);
        this.f3538b = i;
    }

    @Override // U1.a
    public final void a(int i, Object obj) {
        switch (this.f3538b) {
            case 0:
                ((e) obj).setAlpha(i);
                break;
            case 1:
                ((e) obj).f3564z = i;
                break;
            case 2:
                ((e) obj).f3551D = i;
                break;
            case 3:
                ((e) obj).f3548A = i;
                break;
            case 4:
                ((e) obj).f3549B = i;
                break;
            default:
                ((e) obj).f3550C = i;
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3538b) {
            case 0:
                return Integer.valueOf(((e) obj).f3555H);
            case 1:
                return Integer.valueOf(((e) obj).f3564z);
            case 2:
                return Integer.valueOf(((e) obj).f3551D);
            case 3:
                return Integer.valueOf(((e) obj).f3548A);
            case 4:
                return Integer.valueOf(((e) obj).f3549B);
            default:
                return Integer.valueOf(((e) obj).f3550C);
        }
    }
}
