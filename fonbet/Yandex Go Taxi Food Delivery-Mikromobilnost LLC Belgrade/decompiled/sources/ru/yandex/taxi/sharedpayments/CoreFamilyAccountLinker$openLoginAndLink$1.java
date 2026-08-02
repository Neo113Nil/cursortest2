package ru.yandex.taxi.sharedpayments;

import android.view.ViewGroup;
import defpackage.dhv;
import defpackage.mvg;
import defpackage.nf3;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;
import ru.yandex.taxi.zalogin.e;
import ru.yandex.taxi.zalogin.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.sharedpayments.CoreFamilyAccountLinker$openLoginAndLink$1", f = "CoreFamilyAccountLinker.kt", l = {HProv.PP_ENUM_LOG}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CoreFamilyAccountLinker$openLoginAndLink$1 extends SuspendLambda implements wls {
    final /* synthetic */ Runnable $onLinkageSucceedAction;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreFamilyAccountLinker$openLoginAndLink$1(c cVar, Runnable runnable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$onLinkageSucceedAction = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoreFamilyAccountLinker$openLoginAndLink$1(this.this$0, this.$onLinkageSucceedAction, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreFamilyAccountLinker$openLoginAndLink$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoreFamilyAccountLinker$openLoginAndLink$1 coreFamilyAccountLinker$openLoginAndLink$1;
        Object g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            j jVar = cVar.b;
            y50 y50Var = cVar.x;
            g gVar = cVar.w;
            Events$Zalogin$LinkageContext events$Zalogin$LinkageContext = Events$Zalogin$LinkageContext.FAMILY_ACCOUNT;
            this.label = 1;
            coreFamilyAccountLinker$openLoginAndLink$1 = this;
            g = jVar.g(y50Var, gVar, events$Zalogin$LinkageContext, null, coreFamilyAccountLinker$openLoginAndLink$1);
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
            coreFamilyAccountLinker$openLoginAndLink$1 = this;
        }
        if (!(g instanceof Result.Failure)) {
            c cVar2 = coreFamilyAccountLinker$openLoginAndLink$1.this$0;
            Runnable runnable = coreFamilyAccountLinker$openLoginAndLink$1.$onLinkageSucceedAction;
            cVar2.getClass();
            yes0 yes0Var = SimpleSpinnerModalView.Companion;
            ViewGroup viewGroup = (ViewGroup) cVar2.c.requireViewById(teh0.top_fullscreen_modal_views_container);
            yes0Var.getClass();
            cVar2.D = yes0.c(viewGroup, false, false);
            sjy sjyVar = cVar2.y;
            sjyVar.b(cVar2.H);
            sjyVar.a.a(new e(sjyVar, Events$Zalogin$LinkageContext.FAMILY_ACCOUNT, new nf3(2, runnable)), new dhv(21, sjyVar));
        }
        return zy11.a;
    }
}
