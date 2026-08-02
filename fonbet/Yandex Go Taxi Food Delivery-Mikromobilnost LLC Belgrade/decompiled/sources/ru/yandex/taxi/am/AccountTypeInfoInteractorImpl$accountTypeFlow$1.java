package ru.yandex.taxi.am;

import com.yandex.go.analytics.AccountType;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wwg;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkj;", "cachedAccount", "", "hasAccountUpgradeTokenError", "Lcom/yandex/go/analytics/AccountType;", "<anonymous>", "(Lkj;Z)Lcom/yandex/go/analytics/AccountType;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.AccountTypeInfoInteractorImpl$accountTypeFlow$1", f = "AccountTypeInfoInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class AccountTypeInfoInteractorImpl$accountTypeFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        AccountTypeInfoInteractorImpl$accountTypeFlow$1 accountTypeInfoInteractorImpl$accountTypeFlow$1 = new AccountTypeInfoInteractorImpl$accountTypeFlow$1(3, (Continuation) obj3);
        accountTypeInfoInteractorImpl$accountTypeFlow$1.L$0 = (kj) obj;
        accountTypeInfoInteractorImpl$accountTypeFlow$1.Z$0 = booleanValue;
        return accountTypeInfoInteractorImpl$accountTypeFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kj kjVar = (kj) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return z ? AccountType.None : wwg.d(kjVar);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
