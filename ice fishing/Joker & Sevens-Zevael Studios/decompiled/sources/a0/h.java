package a0;

import com.onesignal.inAppMessages.internal.display.impl.a;
import v.e1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends pc.k implements oc.e {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f48g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f49h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f50i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f51j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i10, i iVar, Object obj) {
        super(2);
        this.f49h = iVar;
        this.f50i = i10;
        this.f51j = obj;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48g) {
            case 0:
                ((Number) obj2).intValue();
                i iVar = (i) this.f49h;
                int y10 = m0.z.y(1);
                iVar.a(this.f50i, this.f51j, (m0.r) obj, y10);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                m0.r rVar = (m0.r) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar.B()) {
                    rVar.S();
                } else {
                    ((i) this.f49h).a(this.f50i, this.f51j, rVar, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                e1 e1Var = (e1) this.f49h;
                int y11 = m0.z.y(this.f50i | 1);
                e1Var.a(this.f51j, (m0.r) obj, y11);
                break;
        }
        return ac.o.f277a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, int i10, Object obj, int i11) {
        super(2);
        this.f49h = iVar;
        this.f50i = i10;
        this.f51j = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e1 e1Var, Object obj, int i10) {
        super(2);
        this.f49h = e1Var;
        this.f51j = obj;
        this.f50i = i10;
    }
}
