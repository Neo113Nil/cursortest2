package ru.yandex.taxi.preorder.source.userposition.repository;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.repository.FusedLocationApiCachingFactoryImpl", f = "FusedLocationApiCachingFactoryImpl.kt", l = {HProv.ALG_SID_SHA3_384, 37, 43}, m = "getOrCreateLocationApiHelper", v = 2)
/* loaded from: classes9.dex */
final class FusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FusedLocationApiCachingFactoryImpl$getOrCreateLocationApiHelper$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
