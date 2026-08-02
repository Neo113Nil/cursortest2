package ru.yandex.taxi.am;

import defpackage.gtq0;
import defpackage.kj;
import defpackage.mrj0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.ClearUnLegalPortalAccountsInteractorImpl$clearUnLegalPortalAccounts$1", f = "ClearUnLegalPortalAccountsInteractorImpl.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ClearUnLegalPortalAccountsInteractorImpl$clearUnLegalPortalAccounts$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearUnLegalPortalAccountsInteractorImpl$clearUnLegalPortalAccounts$1(w wVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ClearUnLegalPortalAccountsInteractorImpl$clearUnLegalPortalAccounts$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ClearUnLegalPortalAccountsInteractorImpl$clearUnLegalPortalAccounts$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        kj kjVar = null;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                f0 f0Var = (f0) this.this$0.a.get();
                this.label = 1;
                f0Var.getClass();
                obj = f0.a(f0Var, this);
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
            kjVar = (kj) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gtq0.F("Failed to get account to clear UnLegal portal", null, th);
        }
        if (kjVar != null && !kjVar.m) {
            ((mrj0) this.this$0.b.get()).b(true);
        }
        return zy11.a;
    }
}
