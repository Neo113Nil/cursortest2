package ru.yandex.taxi.logistics.sdk.address_details.impl.domain;

import defpackage.dci;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.address_details.impl.domain.AddressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1$result$1", f = "AddressDetailsStaticMapInteractor.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1$result$1 extends SuspendLambda implements tls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1$result$1(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AddressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1$result$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AddressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1$result$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        dci dciVar = this.this$0.a;
        String str = this.$url;
        this.label = 1;
        Object b = dciVar.b(str, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
