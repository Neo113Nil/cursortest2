package ru.yandex.taxi.logistics.sdk.network;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.network.ApiCallAdapterFactory$1", f = "ApiCallAdapterFactory.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class ApiCallAdapterFactory$1 extends SuspendLambda implements tls {
    int label;

    public ApiCallAdapterFactory$1() {
        super(1, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ApiCallAdapterFactory$1(1, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((ApiCallAdapterFactory$1) create((Continuation) obj)).invokeSuspend(zy11.a);
        return Boolean.TRUE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.TRUE;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
