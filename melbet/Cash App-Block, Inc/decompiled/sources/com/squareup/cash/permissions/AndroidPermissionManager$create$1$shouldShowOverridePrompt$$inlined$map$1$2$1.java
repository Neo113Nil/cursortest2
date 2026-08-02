package com.squareup.cash.permissions;

import com.squareup.util.coroutines.ThrottleFirstKt$throttleFirst$1$1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes8.dex */
public final class AndroidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ThrottleFirstKt$throttleFirst$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPermissionManager$create$1$shouldShowOverridePrompt$$inlined$map$1$2$1(ThrottleFirstKt$throttleFirst$1$1 throttleFirstKt$throttleFirst$1$1, Continuation continuation) {
        super(continuation);
        this.this$0 = throttleFirstKt$throttleFirst$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit(null, this);
    }
}
