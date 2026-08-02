package ru.yandex.taxi.zalogin;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import defpackage.a60;
import defpackage.fhz;
import defpackage.jst;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rx2;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.y50;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lkj;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.zalogin.LinkAccountsController$openLinkAccountLoginActivity$2", f = "LinkAccountsController.kt", l = {Constants.VPN_TRAFFIC}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class LinkAccountsController$openLinkAccountLoginActivity$2 extends SuspendLambda implements wls {
    final /* synthetic */ y50 $activityRouter;
    final /* synthetic */ kj $linkageAccount;
    final /* synthetic */ Events$Zalogin$LinkageContext $linkageContext;
    final /* synthetic */ tpr $resultFlow;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkAccountsController$openLinkAccountLoginActivity$2(j jVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, y50 y50Var, kj kjVar, tpr tprVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$linkageContext = events$Zalogin$LinkageContext;
        this.$activityRouter = y50Var;
        this.$linkageAccount = kjVar;
        this.$resultFlow = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LinkAccountsController$openLinkAccountLoginActivity$2(this.this$0, this.$linkageContext, this.$activityRouter, this.$linkageAccount, this.$resultFlow, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LinkAccountsController$openLinkAccountLoginActivity$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            j jVar = this.this$0;
            fhz fhzVar = jVar.d;
            kj kjVar = jVar.f;
            Events$Zalogin$LinkageContext events$Zalogin$LinkageContext = this.$linkageContext;
            rx2 rx2Var = fhzVar.e;
            String name = events$Zalogin$LinkageContext.name();
            Long valueOf = kjVar != null ? Long.valueOf(fhzVar.b.x.a().a) : null;
            Long valueOf2 = kjVar != null ? Long.valueOf(kjVar.a) : null;
            rx2Var.getClass();
            HashMap hashMap = new HashMap();
            if (valueOf != null) {
                hashMap.put("phone_uid", valueOf);
            }
            if (valueOf2 != null) {
                hashMap.put("portal_uid", valueOf2);
            }
            if (name != null) {
                hashMap.put("context", name);
            }
            rx2Var.a.a("Zalogin.SelectAnotherAccount", hashMap, 1, new HashMap());
            y50 y50Var = this.$activityRouter;
            Intent b = this.this$0.b.b(this.$linkageAccount);
            a60 a60Var = (a60) y50Var;
            a60Var.getClass();
            try {
                a60Var.e(HProv.PP_CACHE_SIZE, b);
            } catch (ActivityNotFoundException unused) {
            }
            tpr tprVar = this.$resultFlow;
            this.label = 1;
            obj = kotlinx.coroutines.flow.e.y(tprVar, this);
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
        j jVar2 = this.this$0;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext2 = this.$linkageContext;
        if (!(value instanceof Result.Failure)) {
            kj kjVar2 = (kj) value;
            fhz fhzVar2 = jVar2.d;
            if (kjVar2 != null) {
                rx2 rx2Var2 = fhzVar2.e;
                String name2 = events$Zalogin$LinkageContext2.name();
                long j = fhzVar2.b.x.a().a;
                long j2 = kjVar2.a;
                Long valueOf3 = Long.valueOf(j);
                Long valueOf4 = Long.valueOf(j2);
                rx2Var2.getClass();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("phone_uid", valueOf3);
                hashMap2.put("portal_uid", valueOf4);
                if (name2 != null) {
                    hashMap2.put("context", name2);
                }
                rx2Var2.a.a("Zalogin.LoginPortalSuccess", hashMap2, 1, new HashMap());
            } else {
                fhzVar2.j("Linkage candidate is null after load from am", events$Zalogin$LinkageContext2);
            }
        }
        Throwable a = Result.a(value);
        if (a != null) {
            jst.e.k(a, "Failed to open link account activity");
        }
        return new Result(value);
    }
}
