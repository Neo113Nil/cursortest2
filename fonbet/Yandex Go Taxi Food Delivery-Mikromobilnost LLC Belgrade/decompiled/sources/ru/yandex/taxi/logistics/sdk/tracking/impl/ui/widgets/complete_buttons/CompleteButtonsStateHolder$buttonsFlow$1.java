package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.complete_buttons;

import defpackage.gri;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t701;
import defpackage.zls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<unused var>", "Lt701;", Constants.KEY_DATA, "Luzc;", "<anonymous>", "(ZLt701;)Luzc;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.complete_buttons.CompleteButtonsStateHolder$buttonsFlow$1", f = "CompleteButtonsStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CompleteButtonsStateHolder$buttonsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).getClass();
        CompleteButtonsStateHolder$buttonsFlow$1 completeButtonsStateHolder$buttonsFlow$1 = new CompleteButtonsStateHolder$buttonsFlow$1(3, (Continuation) obj3);
        completeButtonsStateHolder$buttonsFlow$1.L$0 = (t701) obj2;
        return completeButtonsStateHolder$buttonsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        t701 t701Var = (t701) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        gri griVar = t701Var.a;
        if (griVar.b.c) {
            return griVar.r;
        }
        return null;
    }
}
