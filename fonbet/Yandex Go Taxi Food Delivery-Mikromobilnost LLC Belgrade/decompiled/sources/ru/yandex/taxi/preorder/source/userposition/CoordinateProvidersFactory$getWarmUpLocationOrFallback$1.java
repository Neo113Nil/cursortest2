package ru.yandex.taxi.preorder.source.userposition;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.CoordinateProvidersFactory", f = "CoordinateProvidersFactory.kt", l = {HProv.PP_SAME_MEDIA}, m = "getWarmUpLocationOrFallback", v = 2)
/* loaded from: classes9.dex */
final class CoordinateProvidersFactory$getWarmUpLocationOrFallback$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinateProvidersFactory$getWarmUpLocationOrFallback$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.j(null, null, this);
    }
}
