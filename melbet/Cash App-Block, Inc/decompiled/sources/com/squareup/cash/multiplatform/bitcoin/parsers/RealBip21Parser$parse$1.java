package com.squareup.cash.multiplatform.bitcoin.parsers;

import com.squareup.scannerview.SizeMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.ConnectionPool;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealBip21Parser$parse$1 extends ContinuationImpl {
    public String L$0;
    public SizeMap L$2;
    public BitcoinAddress L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ConnectionPool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealBip21Parser$parse$1(ConnectionPool connectionPool, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = connectionPool;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.parse(null, this);
    }
}
