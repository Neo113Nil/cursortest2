package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.I2;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.workflow.panes.WorkflowViewModel$next$1", f = "WorkflowViewModel.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class t8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C0217l1 c;
    public final /* synthetic */ Pane$PaneOutput.a d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(List list, C0217l1 c0217l1, Pane$PaneOutput.a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.b = list;
        this.c = c0217l1;
        this.d = aVar;
        this.e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new t8(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t8) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function2<LinkEvent, I2, Unit> linkEventListenerInternal$link_sdk_release;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            List<Common$SDKEvent> list = this.b;
            if (list != null) {
                this.c.getClass();
                for (Common$SDKEvent common$SDKEvent : list) {
                    if (!Intrinsics.areEqual(common$SDKEvent, Common$SDKEvent.getDefaultInstance()) && (linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release()) != null) {
                        linkEventListenerInternal$link_sdk_release.invoke(S6.a(common$SDKEvent), I2.d.a);
                    }
                }
            }
            C0217l1 c0217l1 = this.c;
            InterfaceC0298u2 interfaceC0298u2 = c0217l1.c;
            if (interfaceC0298u2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("linkController");
                throw null;
            }
            Pane$PaneOutput build = this.d.b(c0217l1.a.b).a(this.e).build();
            build.getClass();
            Pane$PaneOutput[] pane$PaneOutputArr = {build};
            this.a = 1;
            if (interfaceC0298u2.a(pane$PaneOutputArr, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
