package ru.yandex.taxi.settings.domain;

import defpackage.bdr0;
import defpackage.l4g0;
import defpackage.m4g0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lbdr0;", "<anonymous>", "(Ltse;)Lbdr0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.domain.PushSettingsResponseInteractor$getStoredSettingsResponse$2", f = "PushSettingsResponseInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PushSettingsResponseInteractor$getStoredSettingsResponse$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ l4g0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushSettingsResponseInteractor$getStoredSettingsResponse$2(l4g0 l4g0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = l4g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PushSettingsResponseInteractor$getStoredSettingsResponse$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PushSettingsResponseInteractor$getStoredSettingsResponse$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        m4g0 m4g0Var = this.this$0.e;
        String str = (String) m4g0Var.a.getValue(m4g0Var, m4g0.b[0]);
        if (str == null) {
            return null;
        }
        return (bdr0) ((xnt) this.this$0.b).c(str, bdr0.Companion.serializer());
    }
}
