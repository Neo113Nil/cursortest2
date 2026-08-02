package kotlinx.coroutines;

import defpackage.d9x;
import defpackage.fcq0;
import defpackage.ffx;
import defpackage.iqv;
import defpackage.tzc;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class JobSupport$onAwaitInternal$1 extends FunctionReferenceImpl implements zls {
    public static final JobSupport$onAwaitInternal$1 b = new JobSupport$onAwaitInternal$1(3, 0, c.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V");

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c cVar = (c) obj;
        fcq0 fcq0Var = (fcq0) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.a;
        while (true) {
            Object N = cVar.N();
            if (!(N instanceof iqv)) {
                if (!(N instanceof tzc)) {
                    N = ffx.g0(N);
                }
                ((kotlinx.coroutines.selects.b) fcq0Var).x = N;
            } else if (cVar.e0(N) >= 0) {
                ((kotlinx.coroutines.selects.b) fcq0Var).c = a.o(cVar, true, new d9x(cVar, fcq0Var));
                break;
            }
        }
        return zy11.a;
    }
}
