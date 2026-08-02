package ru.yandex.taxi.preorder.source.userposition;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.UserLocationInteractorImpl", f = "UserLocationInteractorImpl.kt", l = {HProv.PP_BIO_STATISTICA_LEN, 102}, m = "noLocationPermissionFallback", v = 2)
/* loaded from: classes6.dex */
final class UserLocationInteractorImpl$noLocationPermissionFallback$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLocationInteractorImpl$noLocationPermissionFallback$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.b(this.this$0, this);
    }
}
