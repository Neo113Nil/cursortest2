package b0;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m0 extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f854g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f855h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f856i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f857j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ oc.e f858k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(Object obj, Object obj2, oc.e eVar, int i10, int i11) {
        super(2);
        this.f854g = i11;
        this.f856i = obj;
        this.f857j = obj2;
        this.f858k = eVar;
        this.f855h = i10;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f854g;
        m0.r rVar = (m0.r) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                ((n0) this.f856i).a(this.f857j, this.f858k, rVar, m0.z.y(this.f855h | 1));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((h5.d) this.f856i).c((u0.d) this.f857j, (u0.d) this.f858k, rVar, m0.z.y(this.f855h | 1));
                break;
            default:
                ((j5.b) this.f856i).c((u0.d) this.f857j, (u0.d) this.f858k, rVar, m0.z.y(this.f855h | 1));
                break;
        }
        return ac.o.f277a;
    }
}
