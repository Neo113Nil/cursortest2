package nd;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5078g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f5079h;

    public /* synthetic */ a(int i10, long j3) {
        this.f5078g = i10;
        this.f5079h = j3;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        g5.k kVar = (g5.k) obj;
        switch (this.f5078g) {
            case 0:
                pc.j.e(kVar, "$this$execute");
                kVar.e(0, Long.valueOf(this.f5079h));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                pc.j.e(kVar, "$this$execute");
                kVar.e(0, Long.valueOf(this.f5079h));
                break;
            default:
                pc.j.e(kVar, "$this$execute");
                kVar.e(0, Long.valueOf(this.f5079h));
                break;
        }
        return ac.o.f277a;
    }
}
