package ru.yandex.taxi.sdc.route.presentation;

import defpackage.bmp0;
import defpackage.d0l0;
import defpackage.jst;
import defpackage.kmp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzk0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.sdc.route.presentation.SdcPreorderRouteController$setRoute$1", f = "SdcPreorderRouteController.kt", l = {82}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SdcPreorderRouteController$setRoute$1 extends SuspendLambda implements wls {
    final /* synthetic */ d0l0 $route;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdcPreorderRouteController$setRoute$1(f fVar, d0l0 d0l0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$route = d0l0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdcPreorderRouteController$setRoute$1(this.this$0, this.$route, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdcPreorderRouteController$setRoute$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f fVar;
        d0l0 d0l0Var;
        f fVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                fVar = this.this$0;
                d0l0 d0l0Var2 = this.$route;
                try {
                    ru.yandex.taxi.sdc.route.repository.a aVar = fVar.d;
                    zzk0 zzk0Var = d0l0.Companion;
                    List d = d0l0Var2.d(false, false);
                    this.L$0 = fVar;
                    this.L$1 = fVar;
                    this.L$2 = d0l0Var2;
                    this.label = 1;
                    Object a = aVar.a(d, this);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    d0l0Var = d0l0Var2;
                    obj = a;
                    fVar2 = fVar;
                } catch (Throwable th) {
                    th = th;
                    d0l0Var = d0l0Var2;
                    jst.e.s(th);
                    bmp0 bmp0Var = fVar.e;
                    zzk0 zzk0Var2 = d0l0.Companion;
                    bmp0Var.c(d0l0Var.d(false, false));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d0l0Var = (d0l0) this.L$2;
                fVar = (f) this.L$1;
                fVar2 = (f) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.s(th);
                    bmp0 bmp0Var2 = fVar.e;
                    zzk0 zzk0Var22 = d0l0.Companion;
                    bmp0Var2.c(d0l0Var.d(false, false));
                    return zy11.a;
                }
            }
            kmp0 kmp0Var = (kmp0) obj;
            fVar2.e.b(kmp0Var.b, kmp0Var.a);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
