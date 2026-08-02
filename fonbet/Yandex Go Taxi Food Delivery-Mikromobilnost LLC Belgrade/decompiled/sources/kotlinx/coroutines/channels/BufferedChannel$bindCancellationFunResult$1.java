package kotlinx.coroutines.channels;

import defpackage.fse;
import defpackage.oi9;
import defpackage.sub1;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class BufferedChannel$bindCancellationFunResult$1 extends FunctionReferenceImpl implements zls {
    public BufferedChannel$bindCancellationFunResult$1(a aVar) {
        super(3, aVar, a.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4 = ((oi9) obj2).a;
        sub1.a(((a) this.receiver).b, oi9.b(obj4), (fse) obj3);
        return zy11.a;
    }
}
