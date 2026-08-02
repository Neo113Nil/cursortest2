package ru.yandex.taxi.controller.compat;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.controller.compat.StartNextControllerDelegate$startNextController$1", f = "StartNextControllerDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class StartNextControllerDelegate$startNextController$1 extends SuspendLambda implements tls {
    int label;

    public StartNextControllerDelegate$startNextController$1() {
        super(1, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new StartNextControllerDelegate$startNextController$1(1, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        StartNextControllerDelegate$startNextController$1 startNextControllerDelegate$startNextController$1 = (StartNextControllerDelegate$startNextController$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        startNextControllerDelegate$startNextController$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.b(obj);
            return zy11.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
