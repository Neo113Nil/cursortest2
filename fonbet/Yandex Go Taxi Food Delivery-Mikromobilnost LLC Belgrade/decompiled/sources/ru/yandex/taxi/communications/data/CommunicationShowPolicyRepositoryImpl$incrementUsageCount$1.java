package ru.yandex.taxi.communications.data;

import defpackage.cne0;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.communications.data.CommunicationShowPolicyRepositoryImpl$incrementUsageCount$1", f = "CommunicationShowPolicyRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CommunicationShowPolicyRepositoryImpl$incrementUsageCount$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommunicationShowPolicyRepositoryImpl$incrementUsageCount$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CommunicationShowPolicyRepositoryImpl$incrementUsageCount$1(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CommunicationShowPolicyRepositoryImpl$incrementUsageCount$1 communicationShowPolicyRepositoryImpl$incrementUsageCount$1 = (CommunicationShowPolicyRepositoryImpl$incrementUsageCount$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        communicationShowPolicyRepositoryImpl$incrementUsageCount$1.invokeSuspend(zy11Var);
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
        cne0 cne0Var = this.this$0.c;
        String o = g8e.o("pref_usage_count", this.$id);
        a aVar = this.this$0;
        String str = this.$id;
        cne0Var.p(aVar.c.i("pref_usage_count" + str, 0) + 1, o);
        n0 n0Var = this.this$0.e;
        zy11 zy11Var = zy11.a;
        n0Var.g(zy11Var);
        return zy11Var;
    }
}
