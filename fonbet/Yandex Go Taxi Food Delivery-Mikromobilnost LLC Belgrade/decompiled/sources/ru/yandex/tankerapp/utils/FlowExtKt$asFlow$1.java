package ru.yandex.tankerapp.utils;

import defpackage.bdp;
import defpackage.loe;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o3a0;
import defpackage.p3a0;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ly6f0;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.tankerapp.utils.FlowExtKt$asFlow$1", f = "FlowExt.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FlowExtKt$asFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ o3a0 $this_asFlow;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$asFlow$1(o3a0 o3a0Var, Continuation continuation) {
        super(2, continuation);
        this.$this_asFlow = o3a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowExtKt$asFlow$1 flowExtKt$asFlow$1 = new FlowExtKt$asFlow$1(this.$this_asFlow, continuation);
        flowExtKt$asFlow$1.L$0 = obj;
        return flowExtKt$asFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowExtKt$asFlow$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            p3a0 p3a0Var = new p3a0(new loe(y6f0Var, 2));
            this.$this_asFlow.a.g(p3a0Var);
            bdp bdpVar = new bdp(8, this.$this_asFlow, p3a0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, bdpVar, this) == coroutineSingletons) {
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
