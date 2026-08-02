package kotlinx.coroutines.flow.internal;

import defpackage.vpr;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements zls {
    public static final SafeCollectorKt$emitFun$1 b = new SafeCollectorKt$emitFun$1(3, 0, vpr.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((vpr) obj).emit(obj2, (Continuation) obj3);
    }
}
