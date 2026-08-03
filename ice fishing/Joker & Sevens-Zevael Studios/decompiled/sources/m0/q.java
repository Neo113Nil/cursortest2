package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4712b;

    public /* synthetic */ q(int i10, Object obj) {
        this.f4711a = i10;
        this.f4712b = obj;
    }

    public final void a() {
        switch (this.f4711a) {
            case 0:
                r rVar = (r) this.f4712b;
                rVar.A--;
                break;
            default:
                w0.s sVar = (w0.s) this.f4712b;
                sVar.f7603j--;
                break;
        }
    }

    public final void b() {
        switch (this.f4711a) {
            case 0:
                ((r) this.f4712b).A++;
                break;
            default:
                ((w0.s) this.f4712b).f7603j++;
                break;
        }
    }
}
