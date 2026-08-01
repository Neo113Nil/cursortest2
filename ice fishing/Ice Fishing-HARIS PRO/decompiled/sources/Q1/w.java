package Q1;

import L1.Z;

/* loaded from: classes.dex */
public final class w extends D1.j implements C1.p {

    /* renamed from: c, reason: collision with root package name */
    public static final w f975c = new w(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final w f976d = new w(2, 1);
    public static final w e = new w(2, 2);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f977b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, int i2) {
        super(i);
        this.f977b = i2;
    }

    @Override // C1.p
    public final Object d(Object obj, Object obj2) {
        switch (this.f977b) {
            case 0:
                v1.g gVar = (v1.g) obj2;
                if (!(gVar instanceof Z)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? gVar : Integer.valueOf(intValue + 1);
            case 1:
                Z z2 = (Z) obj;
                v1.g gVar2 = (v1.g) obj2;
                if (z2 != null) {
                    return z2;
                }
                if (gVar2 instanceof Z) {
                    return (Z) gVar2;
                }
                return null;
            default:
                return (y) obj;
        }
    }
}
