package com.squareup.cash.card.onboarding;

import com.squareup.cash.card.onboarding.CardPreviewViewEvent;
import com.squareup.cash.card.onboarding.db.CardStudio;
import java.util.Map;
import kotlin.Triple;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardPreviewPresenter$orderLogic$3 extends AdaptedFunctionReference implements Function4 {
    public static final CardPreviewPresenter$orderLogic$3 INSTANCE = new CardPreviewPresenter$orderLogic$3(4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return new Triple((CardPreviewViewEvent.OrderCard) obj, (CardStudio) obj2, (Map) obj3);
    }
}
