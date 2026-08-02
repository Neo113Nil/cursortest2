package ru.yandex.logistics.care.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sq8;
import defpackage.wls;
import defpackage.xt8;
import defpackage.yt8;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "", "it", "Lzy11;", "<anonymous>", "(Lkotlin/Result;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.ui.CareWebViewViewModelImpl$createConfig$urlWithHeaders$3", f = "CareWebViewViewModel.kt", l = {288}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareWebViewViewModelImpl$createConfig$urlWithHeaders$3 extends SuspendLambda implements wls {
    int I$0;
    long J$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareWebViewViewModelImpl$createConfig$urlWithHeaders$3(Continuation continuation, l lVar) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CareWebViewViewModelImpl$createConfig$urlWithHeaders$3 careWebViewViewModelImpl$createConfig$urlWithHeaders$3 = new CareWebViewViewModelImpl$createConfig$urlWithHeaders$3(continuation, this.this$0);
        careWebViewViewModelImpl$createConfig$urlWithHeaders$3.L$0 = ((Result) obj).getValue();
        return careWebViewViewModelImpl$createConfig$urlWithHeaders$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareWebViewViewModelImpl$createConfig$urlWithHeaders$3) create(new Result(((Result) obj).getValue()), (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        long currentTimeMillis = System.currentTimeMillis();
        l lVar = this.this$0;
        lVar.D = xt8.a(lVar.D, currentTimeMillis, 0L, 0L, 13);
        l lVar2 = this.this$0;
        lVar2.B.k(new sq8(currentTimeMillis - lVar2.D.a));
        l lVar3 = this.this$0;
        if (Result.a(obj2) != null) {
            r0 r0Var = lVar3.J;
            this.L$0 = null;
            this.L$1 = obj2;
            this.L$2 = null;
            this.J$0 = currentTimeMillis;
            this.I$0 = 0;
            this.label = 1;
            r0Var.emit(yt8.a, this);
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
