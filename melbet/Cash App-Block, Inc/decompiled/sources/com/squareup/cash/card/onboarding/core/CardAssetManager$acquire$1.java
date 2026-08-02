package com.squareup.cash.card.onboarding.core;

import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CardAssetManager$acquire$1 extends ContinuationImpl {
    public LayoutCompat_androidKt L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardAssetManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardAssetManager$acquire$1(CardAssetManager cardAssetManager, Continuation continuation) {
        super(continuation);
        this.this$0 = cardAssetManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.acquire(null, this);
    }
}
