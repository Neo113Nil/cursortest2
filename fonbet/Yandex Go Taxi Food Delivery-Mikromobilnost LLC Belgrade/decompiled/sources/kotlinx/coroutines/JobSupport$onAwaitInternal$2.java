package kotlinx.coroutines;

import defpackage.tzc;
import defpackage.zls;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class JobSupport$onAwaitInternal$2 extends FunctionReferenceImpl implements zls {
    public static final JobSupport$onAwaitInternal$2 b = new JobSupport$onAwaitInternal$2(3, 0, c.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;");

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.a;
        ((c) obj).getClass();
        if (obj3 instanceof tzc) {
            throw ((tzc) obj3).a;
        }
        return obj3;
    }
}
