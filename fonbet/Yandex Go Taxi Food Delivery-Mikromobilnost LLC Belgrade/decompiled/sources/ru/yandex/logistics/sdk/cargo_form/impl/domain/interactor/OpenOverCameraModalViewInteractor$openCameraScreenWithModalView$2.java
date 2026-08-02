package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import defpackage.c9x0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qhw0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$2", f = "OpenOverCameraModalViewInteractor.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$2 extends SuspendLambda implements wls {
    final /* synthetic */ c9x0 $action;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$2(j jVar, c9x0 c9x0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$action = c9x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$2(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$2$result$1 openOverCameraModalViewInteractor$openCameraScreenWithModalView$2$result$1 = new OpenOverCameraModalViewInteractor$openCameraScreenWithModalView$2$result$1(this.this$0, this.$action, null);
            this.label = 1;
            obj = kotlinx.coroutines.a.w(10000L, openOverCameraModalViewInteractor$openCameraScreenWithModalView$2$result$1, this);
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
        if (!jl40.l((Boolean) obj, Boolean.TRUE)) {
            j jVar = this.this$0;
            String str = jVar.l;
            if (str != null) {
                jVar.h.c.b.a(str);
                jVar.l = null;
            }
            qhw0 qhw0Var = jVar.j;
            if (qhw0Var != null) {
                qhw0Var.a(null);
            }
            jVar.j = null;
            qhw0 qhw0Var2 = jVar.k;
            if (qhw0Var2 != null) {
                qhw0Var2.a(null);
            }
            jVar.k = null;
            jVar.e.b();
        }
        return zy11.a;
    }
}
