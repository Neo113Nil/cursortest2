package ru.yandex.taxi.plus.sdk.micro_widget.websdk;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.plus.sdk.micro_widget.websdk.PlusWebSdkAuthAdapter", f = "PlusWebSdkAuthAdapter.kt", l = {HProv.PP_HASHOID}, m = "getAuthorizationUrl-gIAlu-s", v = 2)
/* loaded from: classes6.dex */
final class PlusWebSdkAuthAdapter$getAuthorizationUrl$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusWebSdkAuthAdapter$getAuthorizationUrl$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object h = this.this$0.h(null, this);
        return h == CoroutineSingletons.COROUTINE_SUSPENDED ? h : new Result(h);
    }
}
