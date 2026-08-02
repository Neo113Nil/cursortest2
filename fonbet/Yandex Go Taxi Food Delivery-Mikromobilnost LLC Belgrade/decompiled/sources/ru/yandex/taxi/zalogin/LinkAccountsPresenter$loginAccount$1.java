package ru.yandex.taxi.zalogin;

import defpackage.dky;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.zalogin.LinkAccountsPresenter$loginAccount$1", f = "LinkAccountsPresenter.kt", l = {HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LinkAccountsPresenter$loginAccount$1 extends SuspendLambda implements wls {
    final /* synthetic */ kj $account;
    final /* synthetic */ Events$Zalogin$LinkageContext $context;
    int label;
    final /* synthetic */ dky this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountsPresenter$loginAccount$1(dky dkyVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, kj kjVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dkyVar;
        this.$context = events$Zalogin$LinkageContext;
        this.$account = kjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LinkAccountsPresenter$loginAccount$1(this.this$0, this.$context, this.$account, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LinkAccountsPresenter$loginAccount$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LinkAccountsPresenter$loginAccount$1 linkAccountsPresenter$loginAccount$1;
        Object g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            dky dkyVar = this.this$0;
            j jVar = dkyVar.x;
            y50 y50Var = dkyVar.z;
            ru.yandex.taxi.activity.g gVar = dkyVar.y;
            Events$Zalogin$LinkageContext events$Zalogin$LinkageContext = this.$context;
            kj kjVar = this.$account;
            this.label = 1;
            linkAccountsPresenter$loginAccount$1 = this;
            g = jVar.g(y50Var, gVar, events$Zalogin$LinkageContext, kjVar, linkAccountsPresenter$loginAccount$1);
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
            linkAccountsPresenter$loginAccount$1 = this;
        }
        if (!(g instanceof Result.Failure)) {
            kotlin.b.b(g);
            kj kjVar2 = (kj) g;
            dky.Kg(linkAccountsPresenter$loginAccount$1.this$0, kjVar2);
            if (kjVar2 != null) {
                linkAccountsPresenter$loginAccount$1.this$0.Lg(linkAccountsPresenter$loginAccount$1.$context);
            }
        }
        return zy11.a;
    }
}
