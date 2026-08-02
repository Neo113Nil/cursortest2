package com.squareup.cash.appmessages.overlay;

import com.google.zxing.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class MutexProtected$access$1 extends ContinuationImpl {
    public Function1 L$0;
    public MutexImpl L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Result this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutexProtected$access$1(Result result, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = result;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.access(null, this);
    }
}
