package g5;

import ac.o;
import com.onesignal.inAppMessages.internal.display.impl.a;
import v1.i0;
import v1.j0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2517g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2518h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f2519i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11, Object obj) {
        super(1);
        this.f2517g = i11;
        this.f2519i = obj;
        this.f2518h = i10;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f2517g) {
            case 0:
                h4.e eVar = (h4.e) obj;
                pc.j.e(eVar, "it");
                eVar.n(this.f2518h + 1, ((Long) this.f2519i).longValue());
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                h4.e eVar2 = (h4.e) obj;
                pc.j.e(eVar2, "it");
                String str = (String) this.f2519i;
                int i10 = this.f2518h + 1;
                if (str == null) {
                    eVar2.h(i10);
                } else {
                    eVar2.c(str, i10);
                }
                break;
            default:
                i0.g((i0) obj, (j0) this.f2519i, 0, -this.f2518h);
                break;
        }
        return o.f277a;
    }
}
