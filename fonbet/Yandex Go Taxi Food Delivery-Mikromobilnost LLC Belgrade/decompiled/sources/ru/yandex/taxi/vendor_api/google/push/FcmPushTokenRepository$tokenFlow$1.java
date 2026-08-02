package ru.yandex.taxi.vendor_api.google.push;

import defpackage.d8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wjp;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.vendor_api.google.push.FcmPushTokenRepository$tokenFlow$1", f = "FcmPushTokenRepository.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class FcmPushTokenRepository$tokenFlow$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FcmPushTokenRepository$tokenFlow$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FcmPushTokenRepository$tokenFlow$1 fcmPushTokenRepository$tokenFlow$1 = new FcmPushTokenRepository$tokenFlow$1(this.this$0, continuation);
        fcmPushTokenRepository$tokenFlow$1.L$0 = obj;
        return fcmPushTokenRepository$tokenFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FcmPushTokenRepository$tokenFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            wjp wjpVar = this.this$0.a;
            wjpVar.getClass();
            tpr t = e.t(com.yandex.go.coroutines.b.d(e.g(new FcmPushTokenStorage$tokenFlow$$inlined$simpleCallbackApiToFlow$1(new d8(23, wjpVar), null)), new FcmPushTokenStorage$tokenFlow$$inlined$start$1(null, wjpVar)));
            this.L$0 = null;
            this.label = 1;
            if (e.u(t, vprVar, this) == coroutineSingletons) {
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
