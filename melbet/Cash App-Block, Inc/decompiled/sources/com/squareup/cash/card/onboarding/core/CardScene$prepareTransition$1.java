package com.squareup.cash.card.onboarding.core;

import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.graphics.swampgl.components.Transform;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CardScene$prepareTransition$1 extends ContinuationImpl {
    public CardModelView.ViewModel L$0;
    public EquatableBitmap L$1;
    public Transform L$3;
    public CardMaterial L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardScene this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardScene$prepareTransition$1(CardScene cardScene, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cardScene;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.prepareTransition(null, this);
    }
}
