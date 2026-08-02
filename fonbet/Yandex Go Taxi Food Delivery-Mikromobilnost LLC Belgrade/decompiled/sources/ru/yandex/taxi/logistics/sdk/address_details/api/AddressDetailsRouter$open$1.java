package ru.yandex.taxi.logistics.sdk.address_details.api;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "<unused var>", "Lvu0;", "", "<anonymous>", "(ILvu0;)Z"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.address_details.api.AddressDetailsRouter$open$1", f = "AddressDetailsRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressDetailsRouter$open$1 extends SuspendLambda implements zls {
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        new AddressDetailsRouter$open$1(3, (Continuation) obj3).invokeSuspend(zy11.a);
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
