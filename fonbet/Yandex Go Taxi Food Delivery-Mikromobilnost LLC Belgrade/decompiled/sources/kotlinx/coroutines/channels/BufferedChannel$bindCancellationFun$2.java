package kotlinx.coroutines.channels;

import defpackage.fse;
import defpackage.sub1;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class BufferedChannel$bindCancellationFun$2 extends FunctionReferenceImpl implements zls {
    public BufferedChannel$bindCancellationFun$2(a aVar) {
        super(3, aVar, a.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        sub1.a(((a) this.receiver).b, obj2, (fse) obj3);
        return zy11.a;
    }
}
