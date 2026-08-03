package d1;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k extends pc.k implements oc.c {

    /* renamed from: h, reason: collision with root package name */
    public static final k f1584h;

    /* renamed from: i, reason: collision with root package name */
    public static final k f1585i;

    /* renamed from: j, reason: collision with root package name */
    public static final k f1586j;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1587g;

    static {
        int i10 = 1;
        f1584h = new k(i10, 0);
        f1585i = new k(i10, 1);
        f1586j = new k(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11) {
        super(i10);
        this.f1587g = i11;
    }

    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f1587g) {
            case 0:
                return ac.o.f277a;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return ac.o.f277a;
            default:
                return Boolean.valueOf(((r) obj).v0(7));
        }
    }
}
