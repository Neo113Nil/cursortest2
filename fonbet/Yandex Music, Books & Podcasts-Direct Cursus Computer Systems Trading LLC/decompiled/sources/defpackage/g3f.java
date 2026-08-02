package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final /* synthetic */ class g3f extends ezc implements pyc {
    public static final g3f a = new g3f(3, h3f.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h3f h3fVar = (h3f) obj;
        acp acpVar = (acp) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h3f.a;
        h3fVar.getClass();
        while (true) {
            Object obj4 = h3f.a.get(h3fVar);
            if (!(obj4 instanceof iie)) {
                acpVar.e = Unit.a;
                break;
            }
            if (h3fVar.g0(obj4) >= 0) {
                acpVar.c = saf.W(h3fVar, true, new d3f(h3fVar, acpVar, 1));
                break;
            }
        }
        return Unit.a;
    }
}
