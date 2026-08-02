package com.squareup.cash;

import android.app.Application;
import app.cash.util.leakdetector.api.LeakDetector;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class CashApp$runSandboxedComponentStateFlow$1 extends ContinuationImpl {
    public CoroutineScope L$0;
    public LeakDetector L$1;
    public Application L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CashApp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashApp$runSandboxedComponentStateFlow$1(CashApp cashApp, Continuation continuation) {
        super(continuation);
        this.this$0 = cashApp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.runSandboxedComponentStateFlow(null, null, null, this);
    }
}
