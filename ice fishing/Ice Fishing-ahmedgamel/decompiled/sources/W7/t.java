package W7;

import S7.C0403v;
import S7.InterfaceC0392j;
import S7.Y;
import S7.h0;
import z7.InterfaceC5270g;
import z7.InterfaceC5271h;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.i implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f3457n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q qVar) {
        super(2);
        this.f3457n = qVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        InterfaceC5270g interfaceC5270g = (InterfaceC5270g) obj2;
        InterfaceC5271h key = interfaceC5270g.getKey();
        InterfaceC5270g m4 = this.f3457n.f3451u.m(key);
        if (key != C0403v.f2998u) {
            return Integer.valueOf(interfaceC5270g != m4 ? Integer.MIN_VALUE : intValue + 1);
        }
        Y y7 = (Y) m4;
        Y y9 = (Y) interfaceC5270g;
        while (true) {
            if (y9 != null) {
                if (y9 == y7 || !(y9 instanceof X7.s)) {
                    break;
                }
                InterfaceC0392j interfaceC0392j = (InterfaceC0392j) h0.f2971u.get((h0) y9);
                y9 = interfaceC0392j != null ? interfaceC0392j.getParent() : null;
            } else {
                y9 = null;
                break;
            }
        }
        if (y9 == y7) {
            if (y7 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + y9 + ", expected child of " + y7 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
