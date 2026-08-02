package ru.yandex.taxi.zalogin;

import defpackage.c90;
import defpackage.hst;
import defpackage.ib8;
import defpackage.jst;
import defpackage.kj;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.sjy;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.InternalLinkAccountRouter$CurrentAccountRemovedException;
import ru.yandex.taxi.am.InternalLinkAccountRouter$LinkAccountNotAuthorizedException;
import ru.yandex.taxi.am.InternalLinkAccountRouter$NoLinkableAccountsException;
import ru.yandex.taxi.am.InternalLinkAccountRouter$PortalAccountOldFormatException;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.zalogin.LinkAccountInteractor$performLinkage$1", f = "LinkAccountInteractor.kt", l = {65}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LinkAccountInteractor$performLinkage$1 extends SuspendLambda implements wls {
    final /* synthetic */ Events$Zalogin$LinkageContext $context;
    final /* synthetic */ Runnable $onLinkageSuccess;
    int label;
    final /* synthetic */ sjy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountInteractor$performLinkage$1(sjy sjyVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, Runnable runnable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = sjyVar;
        this.$context = events$Zalogin$LinkageContext;
        this.$onLinkageSuccess = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LinkAccountInteractor$performLinkage$1(this.this$0, this.$context, this.$onLinkageSuccess, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LinkAccountInteractor$performLinkage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kj kjVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.d.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            LinkAccountInteractor$performLinkage$1$accountLinkedResult$1 linkAccountInteractor$performLinkage$1$accountLinkedResult$1 = new LinkAccountInteractor$performLinkage$1$accountLinkedResult$1(this.this$0, this.$context, null);
            this.label = 1;
            obj = tje.k0(mdhVar, linkAccountInteractor$performLinkage$1$accountLinkedResult$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Object value = ((Result) obj).getValue();
        Runnable runnable = this.$onLinkageSuccess;
        sjy sjyVar = this.this$0;
        if (!(value instanceof Result.Failure)) {
            if (((Boolean) value).booleanValue()) {
                runnable.run();
                sjyVar.a(new c90(8));
            } else {
                sjyVar.a(new c90(9));
                sjyVar.a(new c90(10));
            }
        }
        sjy sjyVar2 = this.this$0;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext = this.$context;
        Runnable runnable2 = this.$onLinkageSuccess;
        Throwable a = Result.a(value);
        if (a != null) {
            hst hstVar = jst.e;
            hstVar.k(a, "Error while linking accounts");
            if (a instanceof InternalLinkAccountRouter$NoLinkableAccountsException) {
                sjyVar2.a(new c90(11));
            } else if (a instanceof InternalLinkAccountRouter$CurrentAccountRemovedException) {
                sjyVar2.a(new c90(12));
            } else {
                boolean z = a instanceof InternalLinkAccountRouter$LinkAccountNotAuthorizedException;
                if (z || (a instanceof InternalLinkAccountRouter$PortalAccountOldFormatException)) {
                    if (z) {
                        sjyVar2.c.getClass();
                        xby.l(hstVar, "Link Account", null, new Throwable("Relogin candidate from exception", a), "Get relogin candidate from exception", 2);
                        kjVar = ((InternalLinkAccountRouter$LinkAccountNotAuthorizedException) a).getAccount();
                    } else {
                        kjVar = sjyVar2.b.f;
                    }
                    sjyVar2.c.g(kjVar, events$Zalogin$LinkageContext, a.getMessage());
                    if (kjVar != null) {
                        sjyVar2.a(new ib8(1, kjVar, events$Zalogin$LinkageContext, runnable2));
                    }
                    sjyVar2.a(new c90(7));
                }
                sjyVar2.a(new c90(13));
                sjyVar2.a(new c90(14));
            }
        }
        return zy11.a;
    }
}
