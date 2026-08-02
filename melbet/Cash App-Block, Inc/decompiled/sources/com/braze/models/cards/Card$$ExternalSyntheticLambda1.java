package com.braze.models.cards;

import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.widget.BaseCardView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class Card$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Card f$0;

    public /* synthetic */ Card$$ExternalSyntheticLambda1(Card card, int i) {
        this.$r8$classId = i;
        this.f$0 = card;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String logClick$lambda$1;
        String logClick$lambda$2;
        String logClick$lambda$3;
        String logImpression$lambda$0;
        String logImpression$lambda$2;
        String logImpression$lambda$4;
        String logImpression$lambda$02;
        String logImpression$lambda$1;
        String handleCardClick$lambda$0;
        String handleCardClick$lambda$1;
        String handleCardClick$lambda$2;
        String handleCardClick$lambda$3;
        String handleCardClick$lambda$4;
        int i = this.$r8$classId;
        Card card = this.f$0;
        switch (i) {
            case 0:
                logClick$lambda$1 = Card.logClick$lambda$1(card);
                return logClick$lambda$1;
            case 1:
                logClick$lambda$2 = Card.logClick$lambda$2(card);
                return logClick$lambda$2;
            case 2:
                logClick$lambda$3 = Card.logClick$lambda$3(card);
                return logClick$lambda$3;
            case 3:
                logImpression$lambda$0 = Card.logImpression$lambda$0(card);
                return logImpression$lambda$0;
            case 4:
                logImpression$lambda$2 = Card.logImpression$lambda$2(card);
                return logImpression$lambda$2;
            case 5:
                logImpression$lambda$4 = Card.logImpression$lambda$4(card);
                return logImpression$lambda$4;
            case 6:
                logImpression$lambda$02 = ContentCardAdapter.logImpression$lambda$0(card);
                return logImpression$lambda$02;
            case 7:
                logImpression$lambda$1 = ContentCardAdapter.logImpression$lambda$1(card);
                return logImpression$lambda$1;
            case 8:
                handleCardClick$lambda$0 = BaseCardView.handleCardClick$lambda$0(card);
                return handleCardClick$lambda$0;
            case 9:
                handleCardClick$lambda$1 = BaseCardView.handleCardClick$lambda$1(card);
                return handleCardClick$lambda$1;
            case 10:
                handleCardClick$lambda$2 = BaseCardView.handleCardClick$lambda$2(card);
                return handleCardClick$lambda$2;
            case 11:
                handleCardClick$lambda$3 = BaseCardView.handleCardClick$lambda$3(card);
                return handleCardClick$lambda$3;
            default:
                handleCardClick$lambda$4 = BaseCardView.handleCardClick$lambda$4(card);
                return handleCardClick$lambda$4;
        }
    }
}
