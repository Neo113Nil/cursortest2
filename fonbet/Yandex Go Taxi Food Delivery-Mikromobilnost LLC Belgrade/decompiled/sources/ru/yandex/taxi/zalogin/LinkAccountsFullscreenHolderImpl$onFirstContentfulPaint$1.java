package ru.yandex.taxi.zalogin;

import android.view.ViewGroup;
import com.yandex.go.splash.SplashComponent;
import defpackage.cne0;
import defpackage.dst0;
import defpackage.eky;
import defpackage.hrt0;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qeb1;
import defpackage.sc;
import defpackage.tse;
import defpackage.uch0;
import defpackage.wls;
import defpackage.xjy;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.zalogin.LinkAccountsFullscreenHolderImpl$onFirstContentfulPaint$1", f = "LinkAccountsFullscreenHolderImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LinkAccountsFullscreenHolderImpl$onFirstContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountsFullscreenHolderImpl$onFirstContentfulPaint$1(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LinkAccountsFullscreenHolderImpl$onFirstContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LinkAccountsFullscreenHolderImpl$onFirstContentfulPaint$1 linkAccountsFullscreenHolderImpl$onFirstContentfulPaint$1 = (LinkAccountsFullscreenHolderImpl$onFirstContentfulPaint$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        linkAccountsFullscreenHolderImpl$onFirstContentfulPaint$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LinkAccountsFullscreen a;
        dst0 dst0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k kVar = this.this$0;
        if (!kVar.i()) {
            kj kjVar = kVar.c.f;
            if (kjVar == null) {
                pzt0 pzt0Var = kVar.k;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
            } else {
                a = ((xjy) kVar.h.get()).a(r1, false, qeb1.b(kVar.f), Events$Zalogin$LinkageContext.PROMO);
                SplashComponent splashComponent = ((hrt0) kVar.i).f;
                if (splashComponent == null || (dst0Var = splashComponent.getSplashViewParams()) == null) {
                    dst0Var = new dst0();
                }
                a.setSplashViewParams(dst0Var);
                a.setOnAppearingListener(new sc(7, kVar));
                ((ViewGroup) kVar.f.requireViewById(uch0.splash_view_overlay)).addView(a);
                kVar.e.h(kjVar);
                eky ekyVar = kVar.b;
                ((cne0) ekyVar.b).u(ekyVar.c, true);
            }
        }
        return zy11.a;
    }
}
