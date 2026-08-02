package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public abstract class d46 {
    public static final js3 a = new js3("CLOSED", 2);

    public static final Object a(yap yapVar, long j, Function2 function2) {
        while (true) {
            if (yapVar.c >= j && !yapVar.d()) {
                return yapVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e46.a;
            Object obj = atomicReferenceFieldUpdater.get(yapVar);
            js3 js3Var = a;
            if (obj == js3Var) {
                return js3Var;
            }
            yap yapVar2 = (yap) ((e46) obj);
            if (yapVar2 == null) {
                yapVar2 = (yap) function2.invoke(Long.valueOf(yapVar.c + 1), yapVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(yapVar, null, yapVar2)) {
                    if (atomicReferenceFieldUpdater.get(yapVar) != null) {
                        break;
                    }
                }
                if (yapVar.d()) {
                    yapVar.e();
                }
            }
            yapVar = yapVar2;
        }
    }
}
