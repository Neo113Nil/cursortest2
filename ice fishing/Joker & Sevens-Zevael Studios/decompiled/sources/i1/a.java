package i1;

import ac.o;
import f1.q;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends pc.k implements oc.c {

    /* renamed from: h, reason: collision with root package name */
    public static final a f3008h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f3009i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3010g;

    static {
        int i10 = 1;
        f3008h = new a(i10, 0);
        f3009i = new a(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f3010g = i11;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f3010g) {
            case 0:
                break;
            default:
                h1.d.l((h1.d) obj, q.f2282g, 0L, 126);
                break;
        }
        return o.f277a;
    }
}
