package ru.yandex.logistics.care.ui;

import defpackage.bt8;
import defpackage.gt8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzy11;", "it", "Lkotlin/Result;", "", "<anonymous>", "(V)Lkotlin/Result;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.ui.CareWebViewViewModelImpl$createConfig$urlWithHeaders$2", f = "CareWebViewViewModel.kt", l = {283}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareWebViewViewModelImpl$createConfig$urlWithHeaders$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareWebViewViewModelImpl$createConfig$urlWithHeaders$2(Continuation continuation, l lVar) {
        super(2, continuation);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CareWebViewViewModelImpl$createConfig$urlWithHeaders$2(continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareWebViewViewModelImpl$createConfig$urlWithHeaders$2) create((zy11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            l lVar = this.this$0;
            b bVar = lVar.b;
            String str = ((bt8) lVar.C.getValue()).a;
            gt8 gt8Var = this.this$0.c;
            this.label = 1;
            a = bVar.a(str, gt8Var, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
