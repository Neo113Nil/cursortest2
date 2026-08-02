package ru.yandex.taxi.logistics.sdk.tracking.impl.show_content.ui;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.b6s0;
import defpackage.fo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.show_content.ui.ShowContentViewModel$1", f = "ShowContentViewModel.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ShowContentViewModel$1 extends SuspendLambda implements wls {
    final /* synthetic */ b6s0 $args;
    final /* synthetic */ pz40 $flow;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowContentViewModel$1(pz40 pz40Var, a aVar, b6s0 b6s0Var, Continuation continuation) {
        super(2, continuation);
        this.$flow = pz40Var;
        this.this$0 = aVar;
        this.$args = b6s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShowContentViewModel$1(this.$flow, this.this$0, this.$args, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShowContentViewModel$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pz40 pz40Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            pz40 pz40Var2 = this.$flow;
            a aVar = this.this$0;
            fo foVar = this.$args.b;
            this.L$0 = pz40Var2;
            this.label = 1;
            Object W = a.W(aVar, foVar, this);
            if (W == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = W;
            pz40Var = pz40Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pz40Var = (pz40) this.L$0;
            b.b(obj);
        }
        ((r0) pz40Var).l(obj);
        return zy11.a;
    }
}
