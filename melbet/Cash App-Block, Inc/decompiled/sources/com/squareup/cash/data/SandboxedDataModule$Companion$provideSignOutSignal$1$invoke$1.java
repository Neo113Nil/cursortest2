package com.squareup.cash.data;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class SandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SandboxedDataModule$Companion$provideSignOutSignal$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SandboxedDataModule$Companion$provideSignOutSignal$1$invoke$1(SandboxedDataModule$Companion$provideSignOutSignal$1 sandboxedDataModule$Companion$provideSignOutSignal$1, Continuation continuation) {
        super(continuation);
        this.this$0 = sandboxedDataModule$Companion$provideSignOutSignal$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.invoke((Continuation) this);
    }
}
