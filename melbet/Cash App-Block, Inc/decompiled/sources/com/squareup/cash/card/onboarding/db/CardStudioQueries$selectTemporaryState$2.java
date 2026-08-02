package com.squareup.cash.card.onboarding.db;

import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioQueries$selectTemporaryState$2 extends FunctionReferenceImpl implements Function4 {
    public static final CardStudioQueries$selectTemporaryState$2 INSTANCE = new CardStudioQueries$selectTemporaryState$2(4, CardStudio.class, "<init>", "<init>(JLcom/squareup/protos/franklin/cards/TouchData;Lcom/squareup/protos/franklin/cards/CardTheme;Z)V", 0);

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return new CardStudio(((Number) obj).longValue(), (TouchData) obj2, (CardTheme) obj3, ((Boolean) obj4).booleanValue());
    }
}
