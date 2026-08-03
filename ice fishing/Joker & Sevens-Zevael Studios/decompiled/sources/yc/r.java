package yc;

import com.onesignal.inAppMessages.internal.display.impl.a;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class r extends pc.k implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public static final r f8893h;

    /* renamed from: i, reason: collision with root package name */
    public static final r f8894i;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8895g;

    static {
        int i10 = 2;
        f8893h = new r(i10, 0);
        f8894i = new r(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i10, int i11) {
        super(i10);
        this.f8895g = i11;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8895g) {
            case 0:
                return ((fc.i) obj).d((fc.g) obj2);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((fc.i) obj).d((fc.g) obj2);
        }
    }
}
