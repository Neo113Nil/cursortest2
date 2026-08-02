package ru.yandex.taxi.vendor_api.google.push;

import defpackage.ep90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y2g0;
import defpackage.zy11;
import defpackage.zzf;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.p0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.vendor_api.google.push.FcmNotificationService$onNewToken$1", f = "FcmNotificationService.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class FcmNotificationService$onNewToken$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ FcmNotificationService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FcmNotificationService$onNewToken$1(FcmNotificationService fcmNotificationService, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fcmNotificationService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FcmNotificationService$onNewToken$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FcmNotificationService$onNewToken$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y2g0 y2g0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            y2g0Var = this.this$0.dependencies;
            p0 p0Var = new p0((ep90) ((zzf) (y2g0Var != null ? y2g0Var : null)).S0.get());
            this.label = 1;
            if (p0Var.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
