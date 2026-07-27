package O0;

import K0.C0044u;
import K0.InterfaceC0033i;
import K0.Q;
import K0.a0;
import P0.u;

/* loaded from: classes.dex */
public final class q extends E0.j implements D0.p {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n f840g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f840g = nVar;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        v0.g gVar = (v0.g) obj2;
        v0.h key = gVar.getKey();
        v0.g i2 = this.f840g.f834j.i(key);
        if (key != C0044u.f534g) {
            return Integer.valueOf(gVar != i2 ? Integer.MIN_VALUE : intValue + 1);
        }
        Q q2 = (Q) i2;
        Q q3 = (Q) gVar;
        while (true) {
            if (q3 != null) {
                if (q3 == q2 || !(q3 instanceof u)) {
                    break;
                }
                InterfaceC0033i interfaceC0033i = (InterfaceC0033i) a0.f499g.get((a0) q3);
                q3 = interfaceC0033i != null ? interfaceC0033i.getParent() : null;
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
