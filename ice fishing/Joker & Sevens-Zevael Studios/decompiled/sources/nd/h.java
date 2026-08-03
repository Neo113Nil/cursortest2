package nd;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5092g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f5093h;

    public /* synthetic */ h(String str, int i10) {
        this.f5092g = i10;
        this.f5093h = str;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        g5.k kVar = (g5.k) obj;
        switch (this.f5092g) {
            case 0:
                pc.j.e(kVar, "$this$execute");
                kVar.c(this.f5093h, 0);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                pc.j.e(kVar, "$this$execute");
                kVar.c(this.f5093h, 0);
                break;
            default:
                pc.j.e(kVar, "$this$execute");
                kVar.c(this.f5093h, 0);
                break;
        }
        return ac.o.f277a;
    }
}
