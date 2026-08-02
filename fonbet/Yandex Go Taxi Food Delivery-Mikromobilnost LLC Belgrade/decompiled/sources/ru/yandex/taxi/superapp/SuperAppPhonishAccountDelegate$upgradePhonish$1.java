package ru.yandex.taxi.superapp;

import com.yandex.passport.api.exception.PassportInvalidAccountTypeException;
import com.yandex.passport.api.exception.PassportUpdateInfoNeededException;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.s0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppPhonishAccountDelegate$upgradePhonish$1", f = "SuperAppPhonishAccountDelegate.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SuperAppPhonishAccountDelegate$upgradePhonish$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onFailure;
    final /* synthetic */ sls $onSuccess;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppPhonishAccountDelegate$upgradePhonish$1(l lVar, sls slsVar, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$onSuccess = slsVar;
        this.$onFailure = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppPhonishAccountDelegate$upgradePhonish$1(this.this$0, this.$onSuccess, this.$onFailure, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppPhonishAccountDelegate$upgradePhonish$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.am.j jVar = this.this$0.b;
            this.label = 1;
            h = ((s0) jVar).h(false, this);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            h = ((Result) obj).getValue();
        }
        sls slsVar = this.$onSuccess;
        if (!(h instanceof Result.Failure)) {
            slsVar.invoke();
        }
        l lVar = this.this$0;
        tls tlsVar = this.$onFailure;
        Throwable a = Result.a(h);
        if (a != null) {
            lVar.getClass();
            tlsVar.invoke((a instanceof PassportUpdateInfoNeededException ? new Object() { // from class: ru.yandex.taxi.superapp.SuperAppPhonishAccountDelegate$UpgradeResult$PassportUpdateInfoNeeded
                public boolean equals(Object other) {
                    return this == other || (other instanceof SuperAppPhonishAccountDelegate$UpgradeResult$PassportUpdateInfoNeeded);
                }

                public int hashCode() {
                    return 1978088038;
                }

                public String toString() {
                    return "PassportUpdateInfoNeeded";
                }
            } : a instanceof PassportInvalidAccountTypeException ? new Object() { // from class: ru.yandex.taxi.superapp.SuperAppPhonishAccountDelegate$UpgradeResult$WrongAccountType
                public boolean equals(Object other) {
                    return this == other || (other instanceof SuperAppPhonishAccountDelegate$UpgradeResult$WrongAccountType);
                }

                public int hashCode() {
                    return 1940428194;
                }

                public String toString() {
                    return "WrongAccountType";
                }
            } : new Object() { // from class: ru.yandex.taxi.superapp.SuperAppPhonishAccountDelegate$UpgradeResult$ErrorCodeUndefined
                public boolean equals(Object other) {
                    return this == other || (other instanceof SuperAppPhonishAccountDelegate$UpgradeResult$ErrorCodeUndefined);
                }

                public int hashCode() {
                    return -1793941181;
                }

                public String toString() {
                    return "ErrorCodeUndefined";
                }
            }).toString());
        }
        return zy11.a;
    }
}
