package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.D6;
import com.plaid.link.Plaid;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.link.LinkActivityViewModel$onActivityReady$1", f = "LinkActivityViewModel.kt", l = {64, 65, 70}, m = "invokeSuspend")
/* renamed from: com.plaid.internal.h2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0182h2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ D6 b;
    public final /* synthetic */ C0200j2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0182h2(D6 d6, C0200j2 c0200j2, Continuation<? super C0182h2> continuation) {
        super(2, continuation);
        this.b = d6;
        this.c = c0200j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0182h2(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C0182h2(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r8.b(r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (r8.awaitPreload$link_sdk_release(r7) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        if (r1.a(r8, r7) == r0) goto L32;
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
            D6 d6 = this.b;
            if (d6 == null) {
                Plaid plaid = Plaid.INSTANCE;
                this.a = 1;
            } else {
                if (d6 instanceof D6.e) {
                    return Unit.INSTANCE;
                }
                InterfaceC0298u2 interfaceC0298u2 = this.c.c;
                if (interfaceC0298u2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("controller");
                    throw null;
                }
                this.a = 3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        InterfaceC0298u2 interfaceC0298u22 = this.c.c;
        if (interfaceC0298u22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("controller");
            throw null;
        }
        this.a = 2;
    }
}
