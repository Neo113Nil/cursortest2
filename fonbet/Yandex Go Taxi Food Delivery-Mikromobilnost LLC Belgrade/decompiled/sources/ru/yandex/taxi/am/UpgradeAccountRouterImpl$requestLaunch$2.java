package ru.yandex.taxi.am;

import defpackage.evx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.owx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ldvx;", "<anonymous>", "(Ltse;)Ldvx;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.UpgradeAccountRouterImpl$requestLaunch$2", f = "UpgradeAccountRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class UpgradeAccountRouterImpl$requestLaunch$2 extends SuspendLambda implements wls {
    final /* synthetic */ owx $launchResponse;
    int label;
    final /* synthetic */ s0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeAccountRouterImpl$requestLaunch$2(s0 s0Var, owx owxVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s0Var;
        this.$launchResponse = owxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpgradeAccountRouterImpl$requestLaunch$2(this.this$0, this.$launchResponse, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeAccountRouterImpl$requestLaunch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.g.d(this.$launchResponse);
        evx evxVar = this.this$0.m;
        String str = this.$launchResponse.g;
        if (str != null) {
            return evxVar.a(str);
        }
        ny61.r("Missing user id in launch response");
        return null;
    }
}
