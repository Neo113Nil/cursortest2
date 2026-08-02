package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.workflow.panes.WorkflowViewModel$getPane$2", f = "WorkflowViewModel.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class s8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pane$PaneRendering>, Object> {
    public int a;
    public final /* synthetic */ u8 b;
    public final /* synthetic */ r8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(u8 u8Var, r8 r8Var, Continuation<? super s8> continuation) {
        super(2, continuation);
        this.b = u8Var;
        this.c = r8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new s8(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new s8(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            InterfaceC0338y6 b = this.b.b();
            r8 r8Var = this.c;
            this.a = 1;
            obj = b.a(r8Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        Pane$PaneRendering pane$PaneRendering = (Pane$PaneRendering) obj;
        if (pane$PaneRendering != null) {
            return pane$PaneRendering;
        }
        r8 r8Var2 = this.c;
        throw new F2("No pane rendering found for " + r8Var2 + ".first: " + r8Var2 + ".second");
    }
}
