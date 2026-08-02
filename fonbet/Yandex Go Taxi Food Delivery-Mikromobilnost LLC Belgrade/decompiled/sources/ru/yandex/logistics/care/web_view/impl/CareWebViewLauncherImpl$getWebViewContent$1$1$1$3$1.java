package ru.yandex.logistics.care.web_view.impl;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vt8;
import defpackage.wls;
import defpackage.wm41;
import defpackage.xw4;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.web_view.impl.CareWebViewLauncherImpl$getWebViewContent$1$1$1$3$1", f = "CareWebViewLauncherImpl.kt", l = {142}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareWebViewLauncherImpl$getWebViewContent$1$1$1$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ wm41 $webView;
    final /* synthetic */ vt8 $webViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareWebViewLauncherImpl$getWebViewContent$1$1$1$3$1(vt8 vt8Var, wm41 wm41Var, Continuation continuation) {
        super(2, continuation);
        this.$webViewModel = vt8Var;
        this.$webView = wm41Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CareWebViewLauncherImpl$getWebViewContent$1$1$1$3$1(this.$webViewModel, this.$webView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareWebViewLauncherImpl$getWebViewContent$1$1$1$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n0 Z = this.$webViewModel.Z();
            xw4 xw4Var = new xw4(22, this.$webView);
            this.label = 1;
            Z.getClass();
            if (n0.m(Z, xw4Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
