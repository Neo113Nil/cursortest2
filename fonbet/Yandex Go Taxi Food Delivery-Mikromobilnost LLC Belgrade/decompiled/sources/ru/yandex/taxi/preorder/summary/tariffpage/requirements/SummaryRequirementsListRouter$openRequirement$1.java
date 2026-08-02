package ru.yandex.taxi.preorder.summary.tariffpage.requirements;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oqv0;
import defpackage.tse;
import defpackage.upj0;
import defpackage.vqv0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.requirements.SummaryRequirementsListRouter$openRequirement$1", f = "SummaryRequirementsListRouter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SummaryRequirementsListRouter$openRequirement$1 extends SuspendLambda implements wls {
    final /* synthetic */ upj0 $redirect;
    final /* synthetic */ boolean $withAnimation;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryRequirementsListRouter$openRequirement$1(a aVar, upj0 upj0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$redirect = upj0Var;
        this.$withAnimation = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SummaryRequirementsListRouter$openRequirement$1(this.this$0, this.$redirect, this.$withAnimation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SummaryRequirementsListRouter$openRequirement$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vqv0 vqv0Var = this.this$0.i;
            oqv0 oqv0Var = new oqv0(this.$redirect, this.$withAnimation);
            this.label = 1;
            if (vqv0Var.a.emit(oqv0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
