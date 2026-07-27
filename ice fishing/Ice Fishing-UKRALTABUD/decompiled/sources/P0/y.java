package P0;

import K0.h0;

/* loaded from: classes.dex */
public final class y extends E0.j implements D0.p {

    /* renamed from: h, reason: collision with root package name */
    public static final y f908h = new y(2, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final y f909i = new y(2, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final y f910j = new y(2, 2);

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f911g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i2, int i3) {
        super(i2);
        this.f911g = i3;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        switch (this.f911g) {
            case 0:
                v0.g gVar = (v0.g) obj2;
                if (!(gVar instanceof h0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? gVar : Integer.valueOf(intValue + 1);
            case 1:
                h0 h0Var = (h0) obj;
                v0.g gVar2 = (v0.g) obj2;
                if (h0Var != null) {
                    return h0Var;
                }
                if (gVar2 instanceof h0) {
                    return (h0) gVar2;
                }
                return null;
            default:
                return (A) obj;
        }
    }
}
