package kotlinx.coroutines.channels;

import defpackage.fcq0;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class BufferedChannel$onReceiveCatching$1 extends FunctionReferenceImpl implements zls {
    public static final BufferedChannel$onReceiveCatching$1 b = new BufferedChannel$onReceiveCatching$1(3, 0, a.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V");

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.w;
        ((a) obj).M((fcq0) obj2);
        return zy11.a;
    }
}
