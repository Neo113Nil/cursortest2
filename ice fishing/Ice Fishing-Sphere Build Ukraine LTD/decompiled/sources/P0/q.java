package P0;

import L0.C0062u;
import L0.InterfaceC0051i;
import L0.Q;
import L0.a0;
import Q0.u;

/* loaded from: classes.dex */
public final class q extends E0.j implements D0.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f859f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f859f = nVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        v0.g gVar = (v0.g) obj2;
        v0.h key = gVar.getKey();
        v0.g i2 = this.f859f.f853i.i(key);
        if (key != C0062u.f682f) {
            return Integer.valueOf(gVar != i2 ? Integer.MIN_VALUE : intValue + 1);
        }
        Q q2 = (Q) i2;
        Q q3 = (Q) gVar;
        while (true) {
            if (q3 != null) {
                if (q3 == q2 || !(q3 instanceof u)) {
                    break;
                }
                InterfaceC0051i interfaceC0051i = (InterfaceC0051i) a0.f647f.get((a0) q3);
                q3 = interfaceC0051i != null ? interfaceC0051i.getParent() : null;
            } else {
                q3 = null;
                break;
            }
        }
        if (q3 == q2) {
            if (q2 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + q3 + ", expected child of " + q2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
