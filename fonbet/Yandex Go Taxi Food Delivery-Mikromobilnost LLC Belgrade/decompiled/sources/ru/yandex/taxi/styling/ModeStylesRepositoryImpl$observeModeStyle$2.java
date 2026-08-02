package ru.yandex.taxi.styling;

import defpackage.e430;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le430;", "it", "Lzy11;", "<anonymous>", "(Le430;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.styling.ModeStylesRepositoryImpl$observeModeStyle$2", f = "ModeStylesRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class ModeStylesRepositoryImpl$observeModeStyle$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModeStylesRepositoryImpl$observeModeStyle$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ModeStylesRepositoryImpl$observeModeStyle$2 modeStylesRepositoryImpl$observeModeStyle$2 = new ModeStylesRepositoryImpl$observeModeStyle$2(this.this$0, continuation);
        modeStylesRepositoryImpl$observeModeStyle$2.L$0 = obj;
        return modeStylesRepositoryImpl$observeModeStyle$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ModeStylesRepositoryImpl$observeModeStyle$2 modeStylesRepositoryImpl$observeModeStyle$2 = (ModeStylesRepositoryImpl$observeModeStyle$2) create((e430) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        modeStylesRepositoryImpl$observeModeStyle$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e430 e430Var = (e430) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.d.l(e430Var);
        return zy11.a;
    }
}
