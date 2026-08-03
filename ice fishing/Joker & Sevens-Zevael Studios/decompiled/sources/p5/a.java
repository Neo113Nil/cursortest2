package p5;

import ac.o;
import oc.g;
import pc.j;
import pc.k;
import u.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends k implements g {

    /* renamed from: h, reason: collision with root package name */
    public static final a f5522h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f5523i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5524g;

    static {
        int i10 = 4;
        f5522h = new a(i10, 0);
        f5523i = new a(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f5524g = i11;
    }

    @Override // oc.g
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f5524g) {
            case 0:
                k5.a aVar = (k5.a) obj2;
                ((Number) obj4).intValue();
                j.e((r) obj, "$this$null");
                j.e(aVar, "it");
                aVar.c((m0.r) obj3);
                break;
            default:
                k5.a aVar2 = (k5.a) obj2;
                ((Number) obj4).intValue();
                j.e((r) obj, "$this$null");
                j.e(aVar2, "it");
                aVar2.c((m0.r) obj3);
                break;
        }
        return o.f277a;
    }
}
