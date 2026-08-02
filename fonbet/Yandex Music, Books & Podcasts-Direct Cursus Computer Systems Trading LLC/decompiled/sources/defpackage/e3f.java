package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final /* synthetic */ class e3f extends ezc implements pyc {
    public static final e3f a = new e3f(3, h3f.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h3f h3fVar = (h3f) obj;
        acp acpVar = (acp) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h3f.a;
        h3fVar.getClass();
        while (true) {
            Object obj4 = h3f.a.get(h3fVar);
            if (!(obj4 instanceof iie)) {
                if (!(obj4 instanceof sm5)) {
                    obj4 = i3f.a(obj4);
                }
                acpVar.e = obj4;
            } else if (h3fVar.g0(obj4) >= 0) {
                acpVar.c = saf.W(h3fVar, true, new d3f(h3fVar, acpVar, 0));
                break;
            }
        }
        return Unit.a;
    }
}
