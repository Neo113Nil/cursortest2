package E1;

import A1.C0019u;
import A1.InterfaceC0008i;
import A1.S;
import A1.b0;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.j implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f340e = nVar;
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        l1.g gVar = (l1.g) obj2;
        l1.h key = gVar.getKey();
        l1.g m2 = this.f340e.f334e.m(key);
        if (key != C0019u.f73b) {
            return Integer.valueOf(gVar != m2 ? Integer.MIN_VALUE : intValue + 1);
        }
        S s2 = (S) m2;
        S s3 = (S) gVar;
        while (true) {
            if (s3 != null) {
                if (s3 == s2 || !(s3 instanceof F1.t)) {
                    break;
                }
                InterfaceC0008i interfaceC0008i = (InterfaceC0008i) b0.f39b.get((b0) s3);
                s3 = interfaceC0008i != null ? interfaceC0008i.getParent() : null;
            } else {
                s3 = null;
                break;
            }
        }
        if (s3 == s2) {
            if (s2 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + s3 + ", expected child of " + s2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
