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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.settings.domain.PushSettingsResponseInteractor$storeSettingsResponse$2", f = "PushSettingsResponseInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PushSettingsResponseInteractor$storeSettingsResponse$2 extends SuspendLambda implements wls {
    final /* synthetic */ bdr0 $response;
    int label;
    final /* synthetic */ l4g0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushSettingsResponseInteractor$storeSettingsResponse$2(l4g0 l4g0Var, bdr0 bdr0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = l4g0Var;
        this.$response = bdr0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PushSettingsResponseInteractor$storeSettingsResponse$2(this.this$0, this.$response, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PushSettingsResponseInteractor$storeSettingsResponse$2 pushSettingsResponseInteractor$storeSettingsResponse$2 = (PushSettingsResponseInteractor$storeSettingsResponse$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        pushSettingsResponseInteractor$storeSettingsResponse$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        l4g0 l4g0Var = this.this$0;
        m4g0 m4g0Var = l4g0Var.e;
        m4g0Var.a.setValue(m4g0Var, m4g0.b[0], ((xnt) l4g0Var.b).e(this.$response, bdr0.Companion.serializer()));
        return zy11.a;
    }
}
