package com.squareup.cash.card.onboarding.core;

import com.datadog.android.rum.internal.utils.WriteOperation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobSupport;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class ContouredTextOverlay$updateTexture$1 extends ContinuationImpl {
    public CardAssetManager$AssetKey$ContouredText L$1;
    public CompletableDeferredImpl L$2;
    public JobSupport L$3;
    public WriteOperation L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WriteOperation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContouredTextOverlay$updateTexture$1(WriteOperation writeOperation, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = writeOperation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.updateTexture(null, this);
    }
}
