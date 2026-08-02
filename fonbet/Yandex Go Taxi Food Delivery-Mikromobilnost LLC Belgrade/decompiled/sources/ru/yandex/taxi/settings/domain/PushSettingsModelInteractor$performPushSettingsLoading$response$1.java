package ru.yandex.taxi.settings.domain;

import defpackage.bdr0;
import defpackage.jst;
import defpackage.l4g0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qbr0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lbdr0;", "<anonymous>", "(Ltse;)Lbdr0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.domain.PushSettingsModelInteractor$performPushSettingsLoading$response$1", f = "PushSettingsModelInteractor.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PushSettingsModelInteractor$performPushSettingsLoading$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ qbr0 $params;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushSettingsModelInteractor$performPushSettingsLoading$response$1(e eVar, qbr0 qbr0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$params = qbr0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PushSettingsModelInteractor$performPushSettingsLoading$response$1(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PushSettingsModelInteractor$performPushSettingsLoading$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                l4g0 l4g0Var = this.this$0.e;
                qbr0 qbr0Var = this.$params;
                this.label = 1;
                obj = ru.yandex.taxi.network.api.a.a(l4g0Var.a.a(qbr0Var), null, this);
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
            return (bdr0) obj;
        } catch (Throwable unused) {
            jst.e.getClass();
            return null;
        }
    }
}
