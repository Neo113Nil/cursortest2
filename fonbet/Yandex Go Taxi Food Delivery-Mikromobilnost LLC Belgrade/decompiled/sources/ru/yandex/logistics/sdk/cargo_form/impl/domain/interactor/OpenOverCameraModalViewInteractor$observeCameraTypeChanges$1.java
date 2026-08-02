package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import defpackage.c9x0;
import defpackage.ey4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.w670;
import defpackage.wls;
import defpackage.xur;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.OpenOverCameraModalViewInteractor$observeCameraTypeChanges$1", f = "OpenOverCameraModalViewInteractor.kt", l = {157}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class OpenOverCameraModalViewInteractor$observeCameraTypeChanges$1 extends SuspendLambda implements wls {
    final /* synthetic */ c9x0 $action;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenOverCameraModalViewInteractor$observeCameraTypeChanges$1(j jVar, c9x0 c9x0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$action = c9x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OpenOverCameraModalViewInteractor$observeCameraTypeChanges$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OpenOverCameraModalViewInteractor$observeCameraTypeChanges$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(new ey4(new w670(this.this$0.c.c, this.$action, 0), 17));
            xur xurVar = new xur(21, this.this$0, this.$action);
            this.label = 1;
            Object collect = t.collect(new r(xurVar, new Ref$IntRef()), this);
            if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                collect = zy11Var;
            }
            if (collect == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
