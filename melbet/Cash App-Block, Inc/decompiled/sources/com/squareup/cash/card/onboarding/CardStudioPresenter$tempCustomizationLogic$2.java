package com.squareup.cash.card.onboarding;

import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.db.LocalTabContentQueries;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.squareup.cash.card.onboarding.db.CardStudio;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda3;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardStudioPresenter$tempCustomizationLogic$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CardTheme $cardTheme;
    public final /* synthetic */ boolean $isShowingCashtag;
    public final /* synthetic */ boolean $isShowingCashtagButton;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TouchData $touchData;
    public final /* synthetic */ MoleculePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardStudioPresenter$tempCustomizationLogic$2(MoleculePresenter moleculePresenter, boolean z, boolean z2, CardTheme cardTheme, TouchData touchData, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$isShowingCashtagButton = z;
        this.$isShowingCashtag = z2;
        this.$cardTheme = cardTheme;
        this.$touchData = touchData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MoleculePresenter moleculePresenter = this.this$0;
        switch (i) {
            case 0:
                return new CardStudioPresenter$tempCustomizationLogic$2((CardStudioPresenter) moleculePresenter, this.$isShowingCashtagButton, this.$isShowingCashtag, this.$cardTheme, this.$touchData, continuation, 0);
            default:
                return new CardStudioPresenter$tempCustomizationLogic$2((CardStudioPresenter) moleculePresenter, this.$isShowingCashtagButton, this.$isShowingCashtag, this.$cardTheme, this.$touchData, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardStudioPresenter$tempCustomizationLogic$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MoleculePresenter moleculePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                final CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) moleculePresenter;
                LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) cardStudioPresenter.cardStudioQueries;
                final int i2 = 0;
                final boolean z = this.$isShowingCashtagButton;
                final boolean z2 = this.$isShowingCashtag;
                final CardTheme cardTheme = this.$cardTheme;
                final TouchData touchData = this.$touchData;
                localTabContentQueries.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.card.onboarding.CardStudioPresenter$tempCustomizationLogic$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i3 = i2;
                        boolean z3 = z2;
                        boolean z4 = z;
                        CardStudioPresenter cardStudioPresenter2 = (CardStudioPresenter) cardStudioPresenter;
                        switch (i3) {
                            case 0:
                                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) cardStudioPresenter2.cardStudioQueries;
                                localTabContentQueries2.driver.execute(-1433167982, "INSERT OR REPLACE INTO cardStudio (_id, cashtag_enabled, card_theme, touch_data) VALUES (2, ?, ?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(z4 ? z3 : ((CardStudio) localTabContentQueries2.select$2().executeAsOne()).cashtag_enabled, cardTheme, touchData, localTabContentQueries2, 7));
                                localTabContentQueries2.notifyQueries(-1433167982, new CardStudioQueries$$ExternalSyntheticLambda3(7));
                                break;
                            default:
                                LocalTabContentQueries localTabContentQueries3 = (LocalTabContentQueries) cardStudioPresenter2.cardStudioQueries;
                                localTabContentQueries3.driver.execute(-1433167982, "INSERT OR REPLACE INTO cardStudio (_id, cashtag_enabled, card_theme, touch_data) VALUES (2, ?, ?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(z4 ? z3 : ((CardStudio) localTabContentQueries3.select$2().executeAsOne()).cashtag_enabled, cardTheme, touchData, localTabContentQueries3, 7));
                                localTabContentQueries3.notifyQueries(-1433167982, new CardStudioQueries$$ExternalSyntheticLambda3(7));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                final CardStudioPresenter cardStudioPresenter2 = (CardStudioPresenter) moleculePresenter;
                LocalTabContentQueries localTabContentQueries2 = (LocalTabContentQueries) cardStudioPresenter2.cardStudioQueries;
                final int i3 = 1;
                final boolean z3 = this.$isShowingCashtagButton;
                final boolean z4 = this.$isShowingCashtag;
                final CardTheme cardTheme2 = this.$cardTheme;
                final TouchData touchData2 = this.$touchData;
                localTabContentQueries2.transactionWithWrapper(new Function1() { // from class: com.squareup.cash.card.onboarding.CardStudioPresenter$tempCustomizationLogic$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i32 = i3;
                        boolean z32 = z4;
                        boolean z42 = z3;
                        CardStudioPresenter cardStudioPresenter22 = (CardStudioPresenter) cardStudioPresenter2;
                        switch (i32) {
                            case 0:
                                LocalTabContentQueries localTabContentQueries22 = (LocalTabContentQueries) cardStudioPresenter22.cardStudioQueries;
                                localTabContentQueries22.driver.execute(-1433167982, "INSERT OR REPLACE INTO cardStudio (_id, cashtag_enabled, card_theme, touch_data) VALUES (2, ?, ?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(z42 ? z32 : ((CardStudio) localTabContentQueries22.select$2().executeAsOne()).cashtag_enabled, cardTheme2, touchData2, localTabContentQueries22, 7));
                                localTabContentQueries22.notifyQueries(-1433167982, new CardStudioQueries$$ExternalSyntheticLambda3(7));
                                break;
                            default:
                                LocalTabContentQueries localTabContentQueries3 = (LocalTabContentQueries) cardStudioPresenter22.cardStudioQueries;
                                localTabContentQueries3.driver.execute(-1433167982, "INSERT OR REPLACE INTO cardStudio (_id, cashtag_enabled, card_theme, touch_data) VALUES (2, ?, ?, ?)", new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(z42 ? z32 : ((CardStudio) localTabContentQueries3.select$2().executeAsOne()).cashtag_enabled, cardTheme2, touchData2, localTabContentQueries3, 7));
                                localTabContentQueries3.notifyQueries(-1433167982, new CardStudioQueries$$ExternalSyntheticLambda3(7));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                break;
        }
        return Unit.INSTANCE;
    }
}
