package com.squareup.cash.card.onboarding;

import com.squareup.cash.card.onboarding.db.CardStudio;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import com.squareup.util.Quadruple;
import java.util.Map;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardPreviewPresenter$initialModel$3 extends AdaptedFunctionReference implements Function5 {
    public static final CardPreviewPresenter$initialModel$3 INSTANCE = new CardPreviewPresenter$initialModel$3(5, Quadruple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return new Quadruple((CardStudio) obj, (String) obj2, (Map) obj3, (CardPresentationStyle) obj4);
    }
}
