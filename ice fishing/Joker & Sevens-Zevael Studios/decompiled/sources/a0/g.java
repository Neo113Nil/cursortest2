package a0;

import b0.q0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f45g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f46h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f47i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, int i11, Object obj) {
        super(2);
        this.f45g = i11;
        this.f47i = obj;
        this.f46h = i10;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f45g) {
            case 0:
                m0.r rVar = (m0.r) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar.B()) {
                    rVar.S();
                } else {
                    i iVar = (i) this.f47i;
                    q0 q0Var = iVar.f53b.f44a;
                    int i10 = this.f46h;
                    b0.h d10 = q0Var.d(i10);
                    ((u0.d) d10.f827c.f8291h).d(iVar.f54c, Integer.valueOf(i10 - d10.f825a), rVar, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                h5.d.i((h5.d) this.f47i, (m0.r) obj, m0.z.y(this.f46h | 1));
                break;
        }
        return ac.o.f277a;
    }
}
