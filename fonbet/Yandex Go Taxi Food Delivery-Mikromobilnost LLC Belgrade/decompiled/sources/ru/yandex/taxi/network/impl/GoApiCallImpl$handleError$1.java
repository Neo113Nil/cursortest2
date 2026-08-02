package ru.yandex.taxi.network.impl;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.network.impl.GoApiCallImpl", f = "GoApiCallImpl.kt", l = {HProv.PROV_GOST_2001_DH, HProv.ALG_SID_SHA3_224, 82, HProv.ALG_SID_NO_HASH, HProv.PP_RESERVED1, HProv.PP_SET_PIN}, m = "handleError", v = 2)
/* loaded from: classes9.dex */
final class GoApiCallImpl$handleError$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoApiCallImpl$handleError$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, false, this);
    }
}
