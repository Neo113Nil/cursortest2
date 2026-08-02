package ru.yandex.taxi;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.SuperappAuthorizerImpl", f = "SuperappAuthorizerImpl.kt", l = {HProv.PP_VERSION_EX}, m = "injectAuthorizationCookieIfNeeded", v = 2)
/* loaded from: classes5.dex */
final class SuperappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappAuthorizerImpl$injectAuthorizationCookieIfNeeded$1(n nVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return n.a(this.this$0, null, false, this);
    }
}
