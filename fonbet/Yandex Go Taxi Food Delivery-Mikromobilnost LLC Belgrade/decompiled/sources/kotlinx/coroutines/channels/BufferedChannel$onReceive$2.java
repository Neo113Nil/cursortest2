package kotlinx.coroutines.channels;

import defpackage.kq6;
import defpackage.zls;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class BufferedChannel$onReceive$2 extends FunctionReferenceImpl implements zls {
    public static final BufferedChannel$onReceive$2 b = new BufferedChannel$onReceive$2(3, 0, a.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;");

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.w;
        aVar.getClass();
        if (obj3 != kq6.l) {
            return obj3;
        }
        throw aVar.v();
    }
}
