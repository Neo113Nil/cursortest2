package ru.yandex.taxi.logistics.sdk.core;

import defpackage.l7i;
import defpackage.m7i;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.experiments.d;
import ru.yandex.taxi.logistics.sdk.f;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.logistics.sdk.core.NetworkModule$provideDefaultRetrofit$1", f = "NetworkModule.kt", l = {65}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class NetworkModule$provideDefaultRetrofit$1 extends SuspendLambda implements tls {
    final /* synthetic */ l7i $deliveryEnabledRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkModule$provideDefaultRetrofit$1(l7i l7iVar, Continuation continuation) {
        super(1, continuation);
        this.$deliveryEnabledRepository = l7iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new NetworkModule$provideDefaultRetrofit$1(this.$deliveryEnabledRepository, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((NetworkModule$provideDefaultRetrofit$1) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        f fVar = new f(d.b(((m7i) this.$deliveryEnabledRepository).a));
        this.label = 1;
        Object y = e.y(fVar, this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
