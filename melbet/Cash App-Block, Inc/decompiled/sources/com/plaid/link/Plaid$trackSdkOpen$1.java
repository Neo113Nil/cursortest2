package com.plaid.link;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.C0252p0;
import com.plaid.internal.C0308v3;
import com.plaid.internal.C0326x3;
import com.plaid.internal.EnumC0170g;
import com.plaid.internal.N2;
import com.plaid.internal.X4;
import com.plaid.internal.Z2;
import com.plaid.internal.core.protos.link.api.ClientEventOuterClass$ClientEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.plaid.link.Plaid$trackSdkOpen$1", f = "Plaid.kt", l = {EnumC0170g.SDK_ASSET_HEADER_SHIELD_VALUE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class Plaid$trackSdkOpen$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C0326x3 $workflowAnalytics;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$trackSdkOpen$1(C0326x3 c0326x3, Continuation<? super Plaid$trackSdkOpen$1> continuation) {
        super(2, continuation);
        this.$workflowAnalytics = c0326x3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Plaid$trackSdkOpen$1(this.$workflowAnalytics, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Plaid$trackSdkOpen$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        X4 x4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            x4 = Plaid.component;
            if (x4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("component");
                throw null;
            }
            Z2 z2 = (Z2) ((C0252p0) x4).f.get();
            this.label = 1;
            obj = z2.a(this);
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
        N2 n2 = (N2) obj;
        boolean z = n2 instanceof N2.k;
        C0326x3 c0326x3 = this.$workflowAnalytics;
        GlobalScope globalScope = GlobalScope.INSTANCE;
        if (z) {
            N2.k kVar = (N2.k) n2;
            String str = kVar.b;
            String str2 = kVar.g;
            c0326x3.getClass();
            str.getClass();
            str2.getClass();
            ClientEventOuterClass$ClientEvent build = C0326x3.a().a(ClientEventOuterClass$ClientEvent.LinkSdkOpen.newBuilder().a(str)).build();
            build.getClass();
            JobKt.launch$default(globalScope, null, null, new C0308v3(c0326x3, str2, build, null), 3);
        } else {
            String g = n2.g();
            c0326x3.getClass();
            g.getClass();
            ClientEventOuterClass$ClientEvent build2 = C0326x3.a().a(ClientEventOuterClass$ClientEvent.LinkSdkOpen.newBuilder().a(g)).build();
            build2.getClass();
            JobKt.launch$default(globalScope, null, null, new C0308v3(c0326x3, "", build2, null), 3);
        }
        return Unit.INSTANCE;
    }
}
