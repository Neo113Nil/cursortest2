package com.squareup.cash.card.onboarding;

import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.db.LocalTabContentQueries;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.card.onboarding.screens.CardStudioScreen;
import com.squareup.protos.franklin.cards.TouchData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioPresenter$doneLogic$2$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MoleculePresenter f$0;
    public final /* synthetic */ TouchData f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ CardStudioPresenter$doneLogic$2$$ExternalSyntheticLambda0(MoleculePresenter moleculePresenter, TouchData touchData, boolean z, boolean z2, int i) {
        this.$r8$classId = i;
        this.f$0 = moleculePresenter;
        this.f$1 = touchData;
        this.f$2 = z;
        this.f$3 = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 20;
        boolean z = this.f$3;
        boolean z2 = this.f$2;
        TouchData touchData = this.f$1;
        CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.f$0;
        switch (i) {
            case 0:
                CardStudioScreen cardStudioScreen = (CardStudioScreen) cardStudioPresenter.args;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) cardStudioPresenter.cardStudioQueries;
                if (cardStudioScreen.customizationEligible) {
                    localTabContentQueries.driver.execute(2068745921, "UPDATE cardStudio SET touch_data = ? WHERE _id = 1", new BorrowHomeKt$$ExternalSyntheticLambda1(i2, touchData, localTabContentQueries));
                    localTabContentQueries.notifyQueries(2068745921, new CardStudioQueries$$ExternalSyntheticLambda3(3));
                }
                if (z2) {
                    localTabContentQueries.updateCashtagState(z);
                }
                localTabContentQueries.deleteTemporaryState();
                break;
            default:
                CardStudioScreen cardStudioScreen2 = (CardStudioScreen) cardStudioPresenter.args;
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) cardStudioPresenter.cardStudioQueries;
                if (cardStudioScreen2.customizationEligible) {
                    localTabContentQueries2.driver.execute(2068745921, "UPDATE cardStudio SET touch_data = ? WHERE _id = 1", new BorrowHomeKt$$ExternalSyntheticLambda1(i2, touchData, localTabContentQueries2));
                    localTabContentQueries2.notifyQueries(2068745921, new CardStudioQueries$$ExternalSyntheticLambda3(3));
                }
                if (z2) {
                    localTabContentQueries2.updateCashtagState(z);
                }
                localTabContentQueries2.deleteTemporaryState();
                break;
        }
        return Unit.INSTANCE;
    }
}
