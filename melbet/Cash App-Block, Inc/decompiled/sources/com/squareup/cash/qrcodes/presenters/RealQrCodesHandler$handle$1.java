package com.squareup.cash.qrcodes.presenters;

import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes9.dex */
public final class RealQrCodesHandler$handle$1 extends ContinuationImpl {
    public BetterNavigator.ScreenNavigator L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AssetPublicSuffixList this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealQrCodesHandler$handle$1(AssetPublicSuffixList assetPublicSuffixList, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = assetPublicSuffixList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.handle(null, null, this);
    }
}
