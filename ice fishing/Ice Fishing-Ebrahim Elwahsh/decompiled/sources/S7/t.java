package S7;

import O7.C0396v;
import O7.InterfaceC0385j;
import O7.Y;
import O7.h0;
import v7.InterfaceC5136g;
import v7.InterfaceC5137h;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.i implements E7.p {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f3023n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q qVar) {
        super(2);
        this.f3023n = qVar;
    }

    @Override // E7.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        InterfaceC5136g interfaceC5136g = (InterfaceC5136g) obj2;
        InterfaceC5137h key = interfaceC5136g.getKey();
        InterfaceC5136g i = this.f3023n.f3017u.i(key);
        if (key != C0396v.f2634u) {
            return Integer.valueOf(interfaceC5136g != i ? Integer.MIN_VALUE : intValue + 1);
        }
        Y y6 = (Y) i;
        Y y8 = (Y) interfaceC5136g;
        while (true) {
            if (y8 != null) {
                if (y8 == y6 || !(y8 instanceof T7.s)) {
                    break;
                }
                InterfaceC0385j interfaceC0385j = (InterfaceC0385j) h0.f2607u.get((h0) y8);
                y8 = interfaceC0385j != null ? interfaceC0385j.getParent() : null;
            } else {
                y8 = null;
                break;
            }
        }
        if (y8 == y6) {
            if (y6 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + y8 + ", expected child of " + y6 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
