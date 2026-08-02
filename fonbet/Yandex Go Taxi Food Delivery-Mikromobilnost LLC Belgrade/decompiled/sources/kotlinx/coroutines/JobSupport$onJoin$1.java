package kotlinx.coroutines;

import defpackage.e9x;
import defpackage.fcq0;
import defpackage.iqv;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class JobSupport$onJoin$1 extends FunctionReferenceImpl implements zls {
    public static final JobSupport$onJoin$1 b = new JobSupport$onJoin$1(3, 0, c.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V");

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object N;
        zy11 zy11Var;
        c cVar = (c) obj;
        fcq0 fcq0Var = (fcq0) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.a;
        do {
            N = cVar.N();
            boolean z = N instanceof iqv;
            zy11Var = zy11.a;
            if (!z) {
                ((kotlinx.coroutines.selects.b) fcq0Var).x = zy11Var;
                return zy11Var;
            }
        } while (cVar.e0(N) < 0);
        ((kotlinx.coroutines.selects.b) fcq0Var).c = a.o(cVar, true, new e9x(cVar, fcq0Var));
        return zy11Var;
    }
}
