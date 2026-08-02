package ru.yandex.taxi.router;

import defpackage.k4y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s4y0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls4y0;", "content", "", "needClose", "<anonymous>", "(Ls4y0;Z)Ls4y0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.router.LiveLocationOptionsPopupRouter$show$1$dataFlow$1", f = "LiveLocationOptionsPopupRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LiveLocationOptionsPopupRouter$show$1$dataFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        LiveLocationOptionsPopupRouter$show$1$dataFlow$1 liveLocationOptionsPopupRouter$show$1$dataFlow$1 = new LiveLocationOptionsPopupRouter$show$1$dataFlow$1(3, (Continuation) obj3);
        liveLocationOptionsPopupRouter$show$1$dataFlow$1.L$0 = (s4y0) obj;
        liveLocationOptionsPopupRouter$show$1$dataFlow$1.Z$0 = booleanValue;
        return liveLocationOptionsPopupRouter$show$1$dataFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s4y0 s4y0Var = (s4y0) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return z ? k4y0.a : s4y0Var;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
