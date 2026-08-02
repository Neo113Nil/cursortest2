package W7;

import S7.C0407v;
import S7.InterfaceC0396j;
import S7.Y;
import S7.h0;
import z7.InterfaceC5243g;
import z7.InterfaceC5244h;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.i implements I7.p {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f3619n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q qVar) {
        super(2);
        this.f3619n = qVar;
    }

    @Override // I7.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        InterfaceC5243g interfaceC5243g = (InterfaceC5243g) obj2;
        InterfaceC5244h key = interfaceC5243g.getKey();
        InterfaceC5243g m9 = this.f3619n.f3613u.m(key);
        if (key != C0407v.f3081u) {
            return Integer.valueOf(interfaceC5243g != m9 ? Integer.MIN_VALUE : intValue + 1);
        }
        Y y7 = (Y) m9;
        Y y9 = (Y) interfaceC5243g;
        while (true) {
            if (y9 != null) {
                if (y9 == y7 || !(y9 instanceof X7.s)) {
                    break;
                }
                InterfaceC0396j interfaceC0396j = (InterfaceC0396j) h0.f3054u.get((h0) y9);
                y9 = interfaceC0396j != null ? interfaceC0396j.getParent() : null;
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
