package ru.yandex.taxi.zalogin;

import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import defpackage.cne0;
import defpackage.eky;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qeb1;
import defpackage.uch0;
import defpackage.wls;
import defpackage.xjy;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkj;", "account", "Lzy11;", "<anonymous>", "(Lkj;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.zalogin.LinkAccountsInstantLinkHolderImpl$loadLinkDataAndShow$1", f = "LinkAccountsInstantLinkHolderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LinkAccountsInstantLinkHolderImpl$loadLinkDataAndShow$1 extends SuspendLambda implements wls {
    final /* synthetic */ Events$Zalogin$LinkageContext $context;
    final /* synthetic */ Runnable $dismissAction;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountsInstantLinkHolderImpl$loadLinkDataAndShow$1(l lVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, Runnable runnable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$context = events$Zalogin$LinkageContext;
        this.$dismissAction = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LinkAccountsInstantLinkHolderImpl$loadLinkDataAndShow$1 linkAccountsInstantLinkHolderImpl$loadLinkDataAndShow$1 = new LinkAccountsInstantLinkHolderImpl$loadLinkDataAndShow$1(this.this$0, this.$context, this.$dismissAction, continuation);
        linkAccountsInstantLinkHolderImpl$loadLinkDataAndShow$1.L$0 = obj;
        return linkAccountsInstantLinkHolderImpl$loadLinkDataAndShow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LinkAccountsInstantLinkHolderImpl$loadLinkDataAndShow$1 linkAccountsInstantLinkHolderImpl$loadLinkDataAndShow$1 = (LinkAccountsInstantLinkHolderImpl$loadLinkDataAndShow$1) create((kj) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        linkAccountsInstantLinkHolderImpl$loadLinkDataAndShow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LinkAccountsFullscreen a;
        kj kjVar = (kj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (kjVar != null) {
            l lVar = this.this$0;
            Events$Zalogin$LinkageContext events$Zalogin$LinkageContext = this.$context;
            Runnable runnable = this.$dismissAction;
            Activity activity = lVar.f;
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(uch0.content_frame);
            if (viewGroup == null) {
                viewGroup = (ViewGroup) activity.requireViewById(R.id.content);
            }
            a = ((xjy) lVar.h.get()).a(r4, false, qeb1.b(lVar.f), events$Zalogin$LinkageContext);
            a.setDismissAction(runnable);
            viewGroup.addView(a);
            lVar.e.h(kjVar);
            eky ekyVar = lVar.b;
            ((cne0) ekyVar.b).u(ekyVar.w, true);
        } else {
            Runnable runnable2 = this.$dismissAction;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        return zy11.a;
    }
}
