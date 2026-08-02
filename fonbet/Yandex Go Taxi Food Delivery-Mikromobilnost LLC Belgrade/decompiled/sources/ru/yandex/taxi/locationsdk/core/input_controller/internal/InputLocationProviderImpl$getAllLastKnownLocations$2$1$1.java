package ru.yandex.taxi.locationsdk.core.input_controller.internal;

import defpackage.jdt0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "", "Lq6z;", "Lk7z;", "<anonymous>", "(Ltse;)Ljava/util/Map;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.core.input_controller.internal.InputLocationProviderImpl$getAllLastKnownLocations$2$1$1", f = "InputLocationProvider.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class InputLocationProviderImpl$getAllLastKnownLocations$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ jdt0 $provider;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputLocationProviderImpl$getAllLastKnownLocations$2$1$1(d dVar, jdt0 jdt0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$provider = jdt0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InputLocationProviderImpl$getAllLastKnownLocations$2$1$1(this.this$0, this.$provider, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InputLocationProviderImpl$getAllLastKnownLocations$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        jdt0 jdt0Var = this.$provider;
        this.label = 1;
        Object a = d.a(dVar, jdt0Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
