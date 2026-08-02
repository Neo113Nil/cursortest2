package com.squareup.cash.card.onboarding.core;

import com.datadog.android.rum.internal.utils.WriteOperation;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.swampgl.components.Transform;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class CardScene$updateCard$1 extends ContinuationImpl {
    public CardModelView.ViewModel L$0;
    public Quat L$1;
    public Vector4 L$2;
    public EquatableBitmap L$3;
    public WriteOperation L$4;
    public Transform L$5;
    public CardMaterial L$7;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CardScene this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardScene$updateCard$1(CardScene cardScene, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cardScene;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.updateCard(null, null, null, null, this);
    }
}
