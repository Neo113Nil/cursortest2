package m5;

import ac.o;
import m0.i0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4870g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f4871h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i10) {
        super(0);
        this.f4870g = i10;
        this.f4871h = cVar;
    }

    @Override // oc.a
    public final Object invoke() {
        c cVar;
        switch (this.f4870g) {
            case 0:
                k5.a aVar = (k5.a) ((i0) this.f4871h.f4881d.f1819d).getValue();
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("Navigator has no screen");
            default:
                c cVar2 = this.f4871h;
                pc.j.e((k5.a) cVar2.f4883f.getValue(), "it");
                if (!cVar2.c() && (cVar = cVar2.f4880c) != null) {
                    cVar.c();
                }
                return o.f277a;
        }
    }
}
