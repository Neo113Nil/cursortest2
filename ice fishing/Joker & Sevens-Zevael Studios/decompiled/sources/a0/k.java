package a0;

import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.d1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends pc.k implements oc.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f57g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d1 f58h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(d1 d1Var, int i10) {
        super(0);
        this.f57g = i10;
        this.f58h = d1Var;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f57g) {
            case 0:
                return new f((oc.c) this.f58h.getValue());
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return (i) ((oc.a) this.f58h.getValue()).invoke();
            default:
                return (i0.f) this.f58h.getValue();
        }
    }
}
