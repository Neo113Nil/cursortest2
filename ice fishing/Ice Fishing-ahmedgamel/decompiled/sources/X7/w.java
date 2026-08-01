package X7;

import S7.p0;
import z7.InterfaceC5270g;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.i implements I7.p {

    /* renamed from: u, reason: collision with root package name */
    public static final w f3863u = new w(2, 0);

    /* renamed from: v, reason: collision with root package name */
    public static final w f3864v = new w(2, 1);

    /* renamed from: w, reason: collision with root package name */
    public static final w f3865w = new w(2, 2);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3866n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, int i6) {
        super(i);
        this.f3866n = i6;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3866n) {
            case 0:
                InterfaceC5270g interfaceC5270g = (InterfaceC5270g) obj2;
                if (!(interfaceC5270g instanceof p0)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? interfaceC5270g : Integer.valueOf(intValue + 1);
            case 1:
                p0 p0Var = (p0) obj;
                InterfaceC5270g interfaceC5270g2 = (InterfaceC5270g) obj2;
                if (p0Var != null) {
                    return p0Var;
                }
                if (interfaceC5270g2 instanceof p0) {
                    return (p0) interfaceC5270g2;
                }
                return null;
            default:
                return (y) obj;
        }
    }
}
