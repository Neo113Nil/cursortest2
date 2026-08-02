package ru.yandex.taxi.preorder.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.interactor.MakeAccurateSourcePointInteractor", f = "MakeAccurateSourcePointInteractor.kt", l = {HProv.ALG_SID_KECCAK_224, HProv.PP_HASHOID, HProv.PP_SIGNATUREOID}, m = "getNewAccurateAddress", v = 2)
/* loaded from: classes6.dex */
final class MakeAccurateSourcePointInteractor$getNewAccurateAddress$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MakeAccurateSourcePointInteractor$getNewAccurateAddress$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return g.a(this.this$0, null, this);
    }
}
