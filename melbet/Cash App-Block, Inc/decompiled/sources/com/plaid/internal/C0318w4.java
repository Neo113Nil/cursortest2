package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.workflow.webview.OutOfProcessWebviewViewModel$clearSessionState$1", f = "OutOfProcessWebviewViewModel.kt", l = {EnumC0170g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.w4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0318w4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ C0345z4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0318w4(C0345z4 c0345z4, Continuation<? super C0318w4> continuation) {
        super(2, continuation);
        this.b = c0345z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0318w4(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C0318w4(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r7.b(r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r7.a((kotlin.coroutines.jvm.internal.SuspendLambda) r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0031, code lost:
    
        if (r7.a(r6) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            InterfaceC0320w6 interfaceC0320w6 = this.b.c;
            if (interfaceC0320w6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readChannelInfo");
                throw null;
            }
            this.a = 1;
        } else if (i == 1) {
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            InterfaceC0347z6 interfaceC0347z6 = this.b.e;
            if (interfaceC0347z6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readPreCompletionResult");
                throw null;
            }
            this.a = 3;
        }
        B6 b6 = this.b.d;
        if (b6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readWebviewFallbackId");
            throw null;
        }
        this.a = 2;
    }
}
