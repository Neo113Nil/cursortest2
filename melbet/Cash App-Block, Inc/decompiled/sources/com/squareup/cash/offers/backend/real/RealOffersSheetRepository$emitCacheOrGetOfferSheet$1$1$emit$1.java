package com.squareup.cash.offers.backend.real;

import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class RealOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1 extends ContinuationImpl {
    public OfferSheetKey L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MusicPresenter$models$1$1.AnonymousClass2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOffersSheetRepository$emitCacheOrGetOfferSheet$1$1$emit$1(MusicPresenter$models$1$1.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(continuation);
        this.this$0 = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= PKIFailureInfo.systemUnavail;
        return this.this$0.emit((Pair) null, (Continuation) this);
    }
}
