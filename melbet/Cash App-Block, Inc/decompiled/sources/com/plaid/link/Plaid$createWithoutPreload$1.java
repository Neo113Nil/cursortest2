package com.plaid.link;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0095a6;
import com.plaid.internal.EnumC0170g;
import com.plaid.link.configuration.LinkTokenConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.plaid.link.Plaid$createWithoutPreload$1", f = "Plaid.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class Plaid$createWithoutPreload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LinkTokenConfiguration $linkTokenConfiguration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$createWithoutPreload$1(LinkTokenConfiguration linkTokenConfiguration, Continuation<? super Plaid$createWithoutPreload$1> continuation) {
        super(2, continuation);
        this.$linkTokenConfiguration = linkTokenConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Plaid$createWithoutPreload$1(this.$linkTokenConfiguration, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Plaid$createWithoutPreload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object linkConfiguration;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Plaid plaid = Plaid.INSTANCE;
            LinkTokenConfiguration linkTokenConfiguration = this.$linkTokenConfiguration;
            this.label = 1;
            linkConfiguration = plaid.setLinkConfiguration(linkTokenConfiguration, this);
            if (linkConfiguration == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        C0095a6.a.getClass();
        C0095a6.a.a("Link token configuration stored to disk", true);
        return Unit.INSTANCE;
    }
}
