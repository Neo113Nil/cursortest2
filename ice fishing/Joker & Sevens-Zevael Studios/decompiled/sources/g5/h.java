package g5;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h extends pc.k implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2528g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pc.k f2529h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(int i10, oc.c cVar) {
        super(1);
        this.f2528g = i10;
        switch (i10) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f2529h = (pc.k) cVar;
                super(1);
                break;
            default:
                this.f2529h = (pc.k) cVar;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [oc.c, pc.k] */
    /* JADX WARN: Type inference failed for: r3v4, types: [oc.c, pc.k] */
    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f2528g) {
            case 0:
                k kVar = (k) obj;
                pc.j.e(kVar, "$this$execute");
                return kVar.f(this.f2529h);
            default:
                return this.f2529h.invoke(Long.valueOf(((Number) obj).longValue()));
        }
    }
}
