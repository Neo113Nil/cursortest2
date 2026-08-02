package ru.yandex.taxi.main.map.autofs;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\"\u0010\u0004\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "", "Lzuo0;", "Lcom/yandex/go/scooters/api/domain/PrevAndNewPair;", "it", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.main.map.autofs.AutoFsSessionExternalEventsBridge$onAppCreated$3", f = "AutoFsSessionExternalEventsBridge.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class AutoFsSessionExternalEventsBridge$onAppCreated$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoFsSessionExternalEventsBridge$onAppCreated$3(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoFsSessionExternalEventsBridge$onAppCreated$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AutoFsSessionExternalEventsBridge$onAppCreated$3 autoFsSessionExternalEventsBridge$onAppCreated$3 = (AutoFsSessionExternalEventsBridge$onAppCreated$3) create((Pair) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        autoFsSessionExternalEventsBridge$onAppCreated$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.a.b();
        return zy11.a;
    }
}
