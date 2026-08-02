package ru.yandex.logistics.care.web_view.impl;

import defpackage.ajs;
import defpackage.gci0;
import defpackage.jt8;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vt8;
import defpackage.wls;
import defpackage.ye;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.web_view.impl.CareWebViewLauncherImpl$getWebViewContent$1$1$1$2$1", f = "CareWebViewLauncherImpl.kt", l = {HProv.PP_INFO}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareWebViewLauncherImpl$getWebViewContent$1$1$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ ajs $fullScreenOverlayHost;
    final /* synthetic */ vt8 $webViewModel;
    int label;
    final /* synthetic */ jt8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CareWebViewLauncherImpl$getWebViewContent$1$1$1$2$1(vt8 vt8Var, jt8 jt8Var, ajs ajsVar, Continuation continuation) {
        super(2, continuation);
        this.$webViewModel = vt8Var;
        this.this$0 = jt8Var;
        this.$fullScreenOverlayHost = ajsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CareWebViewLauncherImpl$getWebViewContent$1$1$1$2$1(this.$webViewModel, this.this$0, this.$fullScreenOverlayHost, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareWebViewLauncherImpl$getWebViewContent$1$1$1$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            gci0 W = this.$webViewModel.W();
            ye yeVar = new ye(3, this.this$0, this.$fullScreenOverlayHost, this.$webViewModel);
            this.label = 1;
            if (W.a.collect(yeVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        ny61.A();
        return null;
    }
}
