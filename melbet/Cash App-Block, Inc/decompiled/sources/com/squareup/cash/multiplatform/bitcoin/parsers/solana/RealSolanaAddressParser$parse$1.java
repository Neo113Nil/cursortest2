package com.squareup.cash.multiplatform.bitcoin.parsers.solana;

import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.scannerview.SizeMap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealSolanaAddressParser$parse$1 extends ContinuationImpl {
    public String L$0;
    public SizeMap L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WorkCookieJar this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSolanaAddressParser$parse$1(WorkCookieJar workCookieJar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = workCookieJar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.parse(null, this);
    }
}
