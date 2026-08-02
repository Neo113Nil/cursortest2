package com.squareup.cash.card.onboarding.core.instancing;

import com.squareup.cash.card.onboarding.core.CardGeometry;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CardDesignLibraryScene$initializeGeometryAndSpacing$1 extends ContinuationImpl {
    public CardGeometry L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardDesignLibraryScene this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDesignLibraryScene$initializeGeometryAndSpacing$1(CardDesignLibraryScene cardDesignLibraryScene, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cardDesignLibraryScene;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return CardDesignLibraryScene.access$initializeGeometryAndSpacing(this.this$0, this);
    }
}
