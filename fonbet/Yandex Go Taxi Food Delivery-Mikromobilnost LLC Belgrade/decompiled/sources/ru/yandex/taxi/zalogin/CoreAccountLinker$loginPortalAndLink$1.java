package ru.yandex.taxi.zalogin;

import android.view.ViewGroup;
import defpackage.dhv;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjy;
import defpackage.teh0;
import defpackage.tse;
import defpackage.wls;
import defpackage.y50;
import defpackage.yes0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.zalogin.CoreAccountLinker$loginPortalAndLink$1", f = "CoreAccountLinker.kt", l = {150}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CoreAccountLinker$loginPortalAndLink$1 extends SuspendLambda implements wls {
    final /* synthetic */ kj $account;
    final /* synthetic */ Events$Zalogin$LinkageContext $context;
    final /* synthetic */ Runnable $onLinkageSuccess;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreAccountLinker$loginPortalAndLink$1(d dVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, kj kjVar, Runnable runnable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$context = events$Zalogin$LinkageContext;
        this.$account = kjVar;
        this.$onLinkageSuccess = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoreAccountLinker$loginPortalAndLink$1(this.this$0, this.$context, this.$account, this.$onLinkageSuccess, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreAccountLinker$loginPortalAndLink$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoreAccountLinker$loginPortalAndLink$1 coreAccountLinker$loginPortalAndLink$1;
        Object g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j jVar = (j) this.this$0.d.get();
            d dVar = this.this$0;
            y50 y50Var = dVar.g;
            ru.yandex.taxi.activity.g gVar = dVar.j;
            Events$Zalogin$LinkageContext events$Zalogin$LinkageContext = this.$context;
            kj kjVar = this.$account;
            this.label = 1;
            coreAccountLinker$loginPortalAndLink$1 = this;
            g = jVar.g(y50Var, gVar, events$Zalogin$LinkageContext, kjVar, coreAccountLinker$loginPortalAndLink$1);
            if (g == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            g = ((Result) obj).getValue();
            coreAccountLinker$loginPortalAndLink$1 = this;
        }
        boolean z = g instanceof Result.Failure;
        if (!z) {
            if (((kj) (z ? null : g)) != null) {
                d dVar2 = coreAccountLinker$loginPortalAndLink$1.this$0;
                Events$Zalogin$LinkageContext events$Zalogin$LinkageContext2 = coreAccountLinker$loginPortalAndLink$1.$context;
                Runnable runnable = coreAccountLinker$loginPortalAndLink$1.$onLinkageSuccess;
                dVar2.getClass();
                yes0 yes0Var = SimpleSpinnerModalView.Companion;
                ViewGroup viewGroup = (ViewGroup) dVar2.e.requireViewById(teh0.top_fullscreen_modal_views_container);
                yes0Var.getClass();
                dVar2.o = yes0.c(viewGroup, false, false);
                sjy sjyVar = (sjy) dVar2.h.get();
                sjyVar.a.a(new e(sjyVar, events$Zalogin$LinkageContext2, runnable), new dhv(21, sjyVar));
            }
        }
        return zy11.a;
    }
}
