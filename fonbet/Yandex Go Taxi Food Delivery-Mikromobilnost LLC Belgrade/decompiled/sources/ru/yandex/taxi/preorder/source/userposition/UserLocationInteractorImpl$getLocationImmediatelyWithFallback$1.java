package ru.yandex.taxi.preorder.source.userposition;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.UserLocationInteractorImpl", f = "UserLocationInteractorImpl.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "getLocationImmediatelyWithFallback", v = 2)
/* loaded from: classes6.dex */
final class UserLocationInteractorImpl$getLocationImmediatelyWithFallback$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLocationInteractorImpl$getLocationImmediatelyWithFallback$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(this);
    }
}
