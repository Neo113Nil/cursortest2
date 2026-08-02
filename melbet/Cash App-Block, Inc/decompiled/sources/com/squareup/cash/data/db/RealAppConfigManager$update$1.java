package com.squareup.cash.data.db;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealAppConfigManager$update$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Mutex L$0;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RealAppConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealAppConfigManager$update$1(RealAppConfigManager realAppConfigManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = realAppConfigManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.update(false, this);
    }
}
