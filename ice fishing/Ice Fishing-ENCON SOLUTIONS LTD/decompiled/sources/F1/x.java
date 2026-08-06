package F1;

import A1.i0;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.j implements t1.p {

    /* renamed from: f, reason: collision with root package name */
    public static final x f634f = new x(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final x f635g = new x(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final x f636h = new x(2, 2);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f637e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i2, int i3) {
        super(i2);
        this.f637e = i3;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f637e) {
            case 0:
                l1.g gVar = (l1.g) obj2;
                if (!(gVar instanceof i0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? gVar : Integer.valueOf(intValue + 1);
            case 1:
                i0 i0Var = (i0) obj;
                l1.g gVar2 = (l1.g) obj2;
                if (i0Var != null) {
                    return i0Var;
                }
                if (gVar2 instanceof i0) {
                    return (i0) gVar2;
                }
                return null;
            default:
                return (z) obj;
        }
    }
}
