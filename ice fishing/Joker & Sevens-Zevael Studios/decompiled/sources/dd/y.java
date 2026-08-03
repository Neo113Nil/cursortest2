package dd;

import com.onesignal.inAppMessages.internal.display.impl.a;
import yc.t1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class y extends pc.k implements oc.e {

    /* renamed from: h, reason: collision with root package name */
    public static final y f1889h;

    /* renamed from: i, reason: collision with root package name */
    public static final y f1890i;

    /* renamed from: j, reason: collision with root package name */
    public static final y f1891j;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1892g;

    static {
        int i10 = 2;
        f1889h = new y(i10, 0);
        f1890i = new y(i10, 1);
        f1891j = new y(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i10, int i11) {
        super(i10);
        this.f1892g = i11;
    }

    @Override // oc.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1892g) {
            case 0:
                fc.g gVar = (fc.g) obj2;
                if (!(gVar instanceof t1)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? gVar : Integer.valueOf(intValue + 1);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                t1 t1Var = (t1) obj;
                fc.g gVar2 = (fc.g) obj2;
                if (t1Var != null) {
                    return t1Var;
                }
                if (gVar2 instanceof t1) {
                    return (t1) gVar2;
                }
                return null;
            default:
                return (a0) obj;
        }
    }
}
