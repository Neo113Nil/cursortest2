package X7;

import S7.p0;
import z7.InterfaceC5243g;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.i implements I7.p {

    /* renamed from: u, reason: collision with root package name */
    public static final w f3818u = new w(2, 0);

    /* renamed from: v, reason: collision with root package name */
    public static final w f3819v = new w(2, 1);

    /* renamed from: w, reason: collision with root package name */
    public static final w f3820w = new w(2, 2);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3821n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, int i4) {
        super(i);
        this.f3821n = i4;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3821n) {
            case 0:
                InterfaceC5243g interfaceC5243g = (InterfaceC5243g) obj2;
                if (!(interfaceC5243g instanceof p0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC5243g : Integer.valueOf(intValue + 1);
            case 1:
                p0 p0Var = (p0) obj;
                InterfaceC5243g interfaceC5243g2 = (InterfaceC5243g) obj2;
                if (p0Var != null) {
                    return p0Var;
                }
                if (interfaceC5243g2 instanceof p0) {
                    return (p0) interfaceC5243g2;
                }
                return null;
            default:
                return (y) obj;
        }
    }
}
