package ru.yandex.logistics.care.ui;

import defpackage.ds31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.ui.CareWebViewViewModelImpl$createWebViewCallback$1$onReload$2", f = "CareWebViewViewModel.kt", l = {456}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareWebViewViewModelImpl$createWebViewCallback$1$onReload$2 extends SuspendLambda implements wls {
    final /* synthetic */ sls $reloadWebView;
    int label;
    final /* synthetic */ l this$0;
    final /* synthetic */ i this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareWebViewViewModelImpl$createWebViewCallback$1$onReload$2(sls slsVar, l lVar, i iVar, Continuation continuation) {
        super(2, continuation);
        this.$reloadWebView = slsVar;
        this.this$0 = lVar;
        this.this$1 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CareWebViewViewModelImpl$createWebViewCallback$1$onReload$2(this.$reloadWebView, this.this$0, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareWebViewViewModelImpl$createWebViewCallback$1$onReload$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
            if (kotlinx.coroutines.a.i(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.$reloadWebView.invoke();
        l lVar = this.this$0;
        i iVar = this.this$1;
        l lVar2 = iVar.a;
        lVar.F = tje.N(ds31.a(lVar2), null, null, new CareWebViewViewModelImpl$createWebViewCallback$1$runWaitingJob$1(lVar2, "Loading timeout exceeded during reload", iVar.b, null), 3);
        return zy11.a;
    }
}
