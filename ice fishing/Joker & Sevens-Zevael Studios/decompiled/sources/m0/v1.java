package m0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f4784a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4785b;

    /* renamed from: c, reason: collision with root package name */
    public final r2 f4786c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4787d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4788e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4789f = true;

    public v1(u1 u1Var, Object obj, boolean z10, r2 r2Var, boolean z11) {
        this.f4784a = u1Var;
        this.f4785b = z10;
        this.f4786c = r2Var;
        this.f4787d = z11;
        this.f4788e = obj;
    }

    public final Object a() {
        if (this.f4785b) {
            return null;
        }
        Object obj = this.f4788e;
        if (obj != null) {
            return obj;
        }
        t.d("Unexpected form of a provided value");
        throw new ac.d();
    }
}
