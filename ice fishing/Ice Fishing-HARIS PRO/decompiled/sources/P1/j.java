package P1;

import C1.p;
import L1.C0016q;
import L1.K;

/* loaded from: classes.dex */
public final class j extends D1.j implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f925b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar) {
        super(2);
        this.f925b = gVar;
    }

    @Override // C1.p
    public final Object d(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        v1.g gVar = (v1.g) obj2;
        v1.h key = gVar.getKey();
        v1.g e = this.f925b.e.e(key);
        if (key != C0016q.f576b) {
            return Integer.valueOf(gVar != e ? Integer.MIN_VALUE : intValue + 1);
        }
        K k2 = (K) e;
        K k3 = (K) gVar;
        if (k3 == k2) {
            if (k2 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + k3 + ", expected child of " + k2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
