package w;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k0 extends pc.k implements oc.a {

    /* renamed from: h, reason: collision with root package name */
    public static final k0 f7451h;

    /* renamed from: i, reason: collision with root package name */
    public static final k0 f7452i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7453g;

    static {
        int i10 = 0;
        f7451h = new k0(i10, 0);
        f7452i = new k0(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i10, int i11) {
        super(i10);
        this.f7453g = i11;
    }

    @Override // oc.a
    public final Object invoke() {
        switch (this.f7453g) {
            case 0:
                return v.f7515a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new u0();
            default:
                return new b1(0);
        }
    }
}
