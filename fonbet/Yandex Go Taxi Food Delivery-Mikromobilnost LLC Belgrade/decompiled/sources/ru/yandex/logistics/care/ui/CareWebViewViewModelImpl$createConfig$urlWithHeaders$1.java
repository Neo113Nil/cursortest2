package ru.yandex.logistics.care.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xt8;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.ui.CareWebViewViewModelImpl$createConfig$urlWithHeaders$1", f = "CareWebViewViewModel.kt", l = {281}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareWebViewViewModelImpl$createConfig$urlWithHeaders$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareWebViewViewModelImpl$createConfig$urlWithHeaders$1(Continuation continuation, l lVar) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CareWebViewViewModelImpl$createConfig$urlWithHeaders$1 careWebViewViewModelImpl$createConfig$urlWithHeaders$1 = new CareWebViewViewModelImpl$createConfig$urlWithHeaders$1(continuation, this.this$0);
        careWebViewViewModelImpl$createConfig$urlWithHeaders$1.L$0 = obj;
        return careWebViewViewModelImpl$createConfig$urlWithHeaders$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareWebViewViewModelImpl$createConfig$urlWithHeaders$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.D = new xt8(System.currentTimeMillis(), 14);
        this.L$0 = null;
        this.label = 1;
        return vprVar.emit(zy11Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
