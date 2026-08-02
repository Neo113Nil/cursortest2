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

@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$clearStoredState$1", f = "WebviewViewModel.kt", l = {EnumC0170g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class S7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ U7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7(U7 u7, Continuation<? super S7> continuation) {
        super(2, continuation);
        this.b = u7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new S7(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new S7(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r7.a(r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (r7.a(r6) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0031, code lost:
    
        if (r7.a((kotlin.coroutines.jvm.internal.SuspendLambda) r6) == r0) goto L26;
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
            B6 b6 = this.b.e;
            if (b6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readWebviewFallbackId");
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
            InterfaceC0320w6 interfaceC0320w6 = this.b.i;
            if (interfaceC0320w6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("readChannelInfo");
                throw null;
            }
            this.a = 3;
        }
        A6 a6 = this.b.f;
        if (a6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("readWebviewBackgroundTransparencyState");
            throw null;
        }
        this.a = 2;
    }
}
