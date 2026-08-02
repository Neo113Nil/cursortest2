package com.squareup.cash.activity.backend.loader;

import com.google.crypto.tink.KeysetHandle;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public final class DefaultGetRequestHandler$requestItem$1 extends ContinuationImpl {
    public KeysetHandle L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ KeysetHandle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultGetRequestHandler$requestItem$1(KeysetHandle keysetHandle, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = keysetHandle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return KeysetHandle.requestItem$suspendImpl(this.this$0, null, null, this);
    }
}
