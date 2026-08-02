package ru.yandex.taxi.delegates;

import com.yandex.go.superapp.impl.interactor.c;
import defpackage.ck7;
import defpackage.gcn;
import defpackage.gvq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delegates.SuperAppServiceContextDelegate$requestContext$1", f = "SuperAppServiceContextDelegate.kt", l = {18}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SuperAppServiceContextDelegate$requestContext$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppServiceContextDelegate$requestContext$1(b bVar, gcn gcnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$callback = gcnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppServiceContextDelegate$requestContext$1(this.this$0, this.$callback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppServiceContextDelegate$requestContext$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0.a;
            this.label = 1;
            obj = cVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$callback.a(new ck7((gvq0) obj, null));
        return zy11.a;
    }
}
