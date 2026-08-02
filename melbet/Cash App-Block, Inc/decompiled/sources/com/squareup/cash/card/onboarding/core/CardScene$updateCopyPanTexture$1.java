package com.squareup.cash.card.onboarding.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CardScene$updateCopyPanTexture$1 extends ContinuationImpl {
    public CardAssetManager$AssetKey$CopyPan L$2;
    public CompletableDeferredImpl L$3;
    public CardScene L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardScene this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardScene$updateCopyPanTexture$1(CardScene cardScene, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cardScene;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.updateCopyPanTexture(null, this);
    }
}
