package ru.yandex.logistics.care.ui;

import android.util.Log;
import defpackage.geh;
import defpackage.gr8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.or8;
import defpackage.tse;
import defpackage.wls;
import defpackage.zt8;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.webview.api.WebViewState;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.ui.CareWebViewViewModelImpl$createWebViewCallback$1$runWaitingJob$1", f = "CareWebViewViewModel.kt", l = {396}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareWebViewViewModelImpl$createWebViewCallback$1$runWaitingJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ or8 $analyticsReporter;
    final /* synthetic */ String $message;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareWebViewViewModelImpl$createWebViewCallback$1$runWaitingJob$1(l lVar, String str, or8 or8Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$message = str;
        this.$analyticsReporter = or8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CareWebViewViewModelImpl$createWebViewCallback$1$runWaitingJob$1(this.this$0, this.$message, this.$analyticsReporter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareWebViewViewModelImpl$createWebViewCallback$1$runWaitingJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.this$0.c.a.b;
            this.label = 1;
            if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        r0 r0Var = this.this$0.J;
        zt8 zt8Var = new zt8(WebViewState.ERROR);
        r0Var.getClass();
        r0Var.m(null, zt8Var);
        geh gehVar = this.this$0.A;
        String str = this.$message;
        gehVar.getClass();
        Log.e("Care_SDK", str);
        this.$analyticsReporter.k(new gr8("Timeout", this.$message));
        return zy11.a;
    }
}
