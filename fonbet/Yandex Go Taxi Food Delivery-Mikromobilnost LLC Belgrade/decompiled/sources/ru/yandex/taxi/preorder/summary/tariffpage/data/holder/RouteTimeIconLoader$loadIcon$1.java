package ru.yandex.taxi.preorder.summary.tariffpage.data.holder;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.data.holder.RouteTimeIconLoader", f = "RouteTimeIconLoader.kt", l = {HProv.ALG_SID_NO_HASH}, m = "loadIcon", v = 2)
/* loaded from: classes6.dex */
final class RouteTimeIconLoader$loadIcon$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteTimeIconLoader$loadIcon$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return d.a(this.this$0, null, this);
    }
}
