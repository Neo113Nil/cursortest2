package n5;

import ac.o;
import m0.r;
import m0.z;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f5057g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m5.a f5058h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z10, m5.a aVar, int i10) {
        super(2);
        this.f5057g = z10;
        this.f5058h = aVar;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int y10 = z.y(1);
        v6.a.a(this.f5057g, this.f5058h, (r) obj, y10);
        return o.f277a;
    }
}
