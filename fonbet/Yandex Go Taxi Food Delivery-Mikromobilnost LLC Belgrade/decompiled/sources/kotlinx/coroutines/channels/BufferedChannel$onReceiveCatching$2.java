package kotlinx.coroutines.channels;

import defpackage.kq6;
import defpackage.mi9;
import defpackage.ni9;
import defpackage.oi9;
import defpackage.zls;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class BufferedChannel$onReceiveCatching$2 extends FunctionReferenceImpl implements zls {
    public static final BufferedChannel$onReceiveCatching$2 b = new BufferedChannel$onReceiveCatching$2(3, 0, a.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;");

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.w;
        aVar.getClass();
        if (obj3 == kq6.l) {
            ni9 ni9Var = oi9.b;
            obj3 = new mi9(aVar.u());
        } else {
            ni9 ni9Var2 = oi9.b;
        }
        return new oi9(obj3);
    }
}
