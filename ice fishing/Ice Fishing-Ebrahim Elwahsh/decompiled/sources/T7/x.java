package T7;

import O7.p0;
import v7.InterfaceC5136g;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.i implements E7.p {

    /* renamed from: u, reason: collision with root package name */
    public static final x f3172u = new x(2, 0);

    /* renamed from: v, reason: collision with root package name */
    public static final x f3173v = new x(2, 1);

    /* renamed from: w, reason: collision with root package name */
    public static final x f3174w = new x(2, 2);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3175n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, int i4) {
        super(i);
        this.f3175n = i4;
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3175n) {
            case 0:
                InterfaceC5136g interfaceC5136g = (InterfaceC5136g) obj2;
                if (!(interfaceC5136g instanceof p0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC5136g : Integer.valueOf(intValue + 1);
            case 1:
                p0 p0Var = (p0) obj;
                InterfaceC5136g interfaceC5136g2 = (InterfaceC5136g) obj2;
                if (p0Var != null) {
                    return p0Var;
                }
                if (interfaceC5136g2 instanceof p0) {
                    return (p0) interfaceC5136g2;
                }
                return null;
            default:
                return (z) obj;
        }
    }
}
