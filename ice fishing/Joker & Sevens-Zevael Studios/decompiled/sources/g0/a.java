package g0;

import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends k implements oc.a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f2411h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f2412i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2413g;

    static {
        int i10 = 0;
        f2411h = new a(i10, 0);
        f2412i = new a(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f2413g = i11;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f2413g) {
            case 0:
                return null;
            default:
                return d.f2418b;
        }
    }
}
