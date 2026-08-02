package com.squareup.cash.profile.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountsLoadingFailedViewModel;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.presenters.CashtagPresenter$models$2$1;
import com.squareup.cash.blockers.presenters.CheckmarkPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.presenters.PasscodePresenter$models$1$2;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.cashapplite.screens.LiteAddMoneyScreen;
import com.squareup.cash.cashapplite.viewmodels.AddMoneyRowId;
import com.squareup.cash.cashapplite.viewmodels.LiteAddMoneyViewModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$4$4;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.ContactSyncViewModel;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.work.screens.TimecardDetailScreen;
import com.squareup.cash.work.viewmodels.TimecardDetailViewModel;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class AddAliasPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final BetterNavigator.ScreenNavigator navigator;

    public AddAliasPresenter(TimecardDetailScreen timecardDetailScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 18;
        timecardDetailScreen.getClass();
        this.navigator = screenNavigator;
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m3724models(Flow flow, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.$r8$classId;
        int i18 = 24;
        int i19 = 15;
        int i20 = 20;
        int i21 = 11;
        int i22 = 27;
        Continuation continuation = null;
        int i23 = 18;
        int i24 = 19;
        flow.getClass();
        switch (i17) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(-1879557522);
                if ((i & 6) == 0) {
                    i2 = i | (gapComposer.changedInstance(flow) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= gapComposer.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer, flow, new PdfPreviewPresenter$models$1$1(flow, continuation, this, r11));
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(this, flow, i, i20);
                    break;
                }
                break;
            case 1:
            case 10:
            case 15:
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(-1180921878);
                if ((i & 6) == 0) {
                    i16 = i | (gapComposer2.changedInstance(flow) ? 4 : 2);
                } else {
                    i16 = i;
                }
                if ((i & 48) == 0) {
                    i16 |= gapComposer2.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer2.shouldExecute(i16 & 1, (i16 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer2, flow, new PdfPreviewPresenter$models$1$1(flow, continuation, this, 21));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new OpenSourceKt$$ExternalSyntheticLambda1(this, flow, i, 22);
                    break;
                }
                break;
            case 2:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(1251359937);
                if ((i & 6) == 0) {
                    i3 = i | (gapComposer3.changedInstance(flow) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer3.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer3, flow, new ToastKt$Toast$9$1(flow, continuation, this, i22));
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer3.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(this, flow, i, 26);
                    break;
                }
                break;
            case 3:
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startRestartGroup(1763871949);
                if ((i & 6) == 0) {
                    i4 = i | (gapComposer4.changedInstance(flow) ? 4 : 2);
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= gapComposer4.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer4.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer4, flow, new ToastKt$Toast$9$1(flow, continuation, this, 28));
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup4 = gapComposer4.endRestartGroup();
                if (endRestartGroup4 != null) {
                    endRestartGroup4.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(this, flow, i, i22);
                    break;
                }
                break;
            case 4:
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startRestartGroup(-1047089751);
                if ((i & 6) == 0) {
                    i5 = i | (gapComposer5.changedInstance(flow) ? 4 : 2);
                } else {
                    i5 = i;
                }
                if ((i & 48) == 0) {
                    i5 |= gapComposer5.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer5.shouldExecute(i5 & 1, (i5 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer5, flow, new AmountBlockerPresenter$models$1$2(flow, continuation, this, i22));
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup5 = gapComposer5.endRestartGroup();
                if (endRestartGroup5 != null) {
                    endRestartGroup5.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, i19);
                    break;
                }
                break;
            case 5:
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startRestartGroup(864423522);
                if ((i & 6) == 0) {
                    i6 = i | (gapComposer6.changedInstance(flow) ? 4 : 2);
                } else {
                    i6 = i;
                }
                if ((i & 48) == 0) {
                    i6 |= gapComposer6.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer6.shouldExecute(i6 & 1, (i6 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer6, flow, new CashtagPresenter$models$2$1(flow, continuation, this, 6));
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup6 = gapComposer6.endRestartGroup();
                if (endRestartGroup6 != null) {
                    endRestartGroup6.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, 17);
                    break;
                }
                break;
            case 6:
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startRestartGroup(1311384696);
                if ((i & 6) == 0) {
                    i7 = i | (gapComposer7.changedInstance(flow) ? 4 : 2);
                } else {
                    i7 = i;
                }
                if ((i & 48) == 0) {
                    i7 |= gapComposer7.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer7.shouldExecute(i7 & 1, (i7 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer7, flow, new CashtagPresenter$models$2$1(flow, continuation, this, 7));
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup7 = gapComposer7.endRestartGroup();
                if (endRestartGroup7 != null) {
                    endRestartGroup7.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, i23);
                    break;
                }
                break;
            case 7:
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startRestartGroup(-983433118);
                if ((i & 6) == 0) {
                    i8 = i | (gapComposer8.changedInstance(flow) ? 4 : 2);
                } else {
                    i8 = i;
                }
                if ((i & 48) == 0) {
                    i8 |= gapComposer8.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer8.shouldExecute(i8 & 1, (i8 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer8, flow, new CashtagPresenter$models$2$1(flow, continuation, this, 23));
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup8 = gapComposer8.endRestartGroup();
                if (endRestartGroup8 != null) {
                    endRestartGroup8.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, i18);
                    break;
                }
                break;
            case 8:
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startRestartGroup(-330661982);
                if ((i & 6) == 0) {
                    i9 = i | (gapComposer9.changedInstance(flow) ? 4 : 2);
                } else {
                    i9 = i;
                }
                if ((i & 48) == 0) {
                    i9 |= gapComposer9.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer9.shouldExecute(i9 & 1, (i9 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer9, flow, new CashtagPresenter$models$2$1(flow, continuation, this, i18));
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup9 = gapComposer9.endRestartGroup();
                if (endRestartGroup9 != null) {
                    endRestartGroup9.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, 25);
                    break;
                }
                break;
            case 9:
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startRestartGroup(1094345634);
                if ((i & 6) == 0) {
                    i10 = i | (gapComposer10.changedInstance(flow) ? 4 : 2);
                } else {
                    i10 = i;
                }
                if ((i & 48) == 0) {
                    i10 |= gapComposer10.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer10.shouldExecute(i10 & 1, (i10 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer10, flow, new PasscodePresenter$models$1$2(flow, continuation, this, i21));
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup10 = gapComposer10.endRestartGroup();
                if (endRestartGroup10 != null) {
                    endRestartGroup10.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, i22);
                    break;
                }
                break;
            case 11:
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startRestartGroup(221549923);
                if ((i & 6) == 0) {
                    i11 = i | (gapComposer11.changedInstance(flow) ? 4 : 2);
                } else {
                    i11 = i;
                }
                if ((i & 48) == 0) {
                    i11 |= gapComposer11.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer11.shouldExecute(i11 & 1, (i11 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer11, flow, new PasscodeDialogPresenter$models$1$1(flow, continuation, this, 9));
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup11 = gapComposer11.endRestartGroup();
                if (endRestartGroup11 != null) {
                    endRestartGroup11.block = new GooglePayPresenter$$ExternalSyntheticLambda0(this, flow, i, i21);
                    break;
                }
                break;
            case 12:
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startRestartGroup(-735096073);
                if ((i & 6) == 0) {
                    i12 = i | (gapComposer12.changedInstance(flow) ? 4 : 2);
                } else {
                    i12 = i;
                }
                if ((i & 48) == 0) {
                    i12 |= gapComposer12.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer12.shouldExecute(i12 & 1, (i12 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer12, flow, new PasscodeDialogPresenter$models$1$1(flow, continuation, this, 10));
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup12 = gapComposer12.endRestartGroup();
                if (endRestartGroup12 != null) {
                    endRestartGroup12.block = new GooglePayPresenter$$ExternalSyntheticLambda0(this, flow, i, 12);
                    break;
                }
                break;
            case 13:
                GapComposer gapComposer13 = (GapComposer) composer;
                gapComposer13.startRestartGroup(1412675922);
                if ((i & 6) == 0) {
                    i13 = i | (gapComposer13.changedInstance(flow) ? 4 : 2);
                } else {
                    i13 = i;
                }
                if ((i & 48) == 0) {
                    i13 |= gapComposer13.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer13.shouldExecute(i13 & 1, (i13 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer13, flow, new PasscodeDialogPresenter$models$1$1(flow, continuation, this, i24));
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup13 = gapComposer13.endRestartGroup();
                if (endRestartGroup13 != null) {
                    endRestartGroup13.block = new GooglePayPresenter$$ExternalSyntheticLambda0(this, flow, i, i19);
                    break;
                }
                break;
            case 14:
                GapComposer gapComposer14 = (GapComposer) composer;
                gapComposer14.startRestartGroup(-1359194254);
                if ((i & 6) == 0) {
                    i14 = i | (gapComposer14.changedInstance(flow) ? 4 : 2);
                } else {
                    i14 = i;
                }
                if ((i & 48) == 0) {
                    i14 |= gapComposer14.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer14.shouldExecute(i14 & 1, (i14 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer14, flow, new PasscodeDialogPresenter$models$1$1(flow, continuation, this, i20));
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup14 = gapComposer14.endRestartGroup();
                if (endRestartGroup14 != null) {
                    endRestartGroup14.block = new GooglePayPresenter$$ExternalSyntheticLambda0(this, flow, i, r11);
                    break;
                }
                break;
            case 16:
                GapComposer gapComposer15 = (GapComposer) composer;
                gapComposer15.startRestartGroup(-665869063);
                if ((i & 6) == 0) {
                    i15 = i | (gapComposer15.changedInstance(flow) ? 4 : 2);
                } else {
                    i15 = i;
                }
                if ((i & 48) == 0) {
                    i15 |= gapComposer15.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer15.shouldExecute(i15 & 1, (i15 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer15, flow, new PdfPreviewPresenter$models$1$1(flow, continuation, this, i21));
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup15 = gapComposer15.endRestartGroup();
                if (endRestartGroup15 != null) {
                    endRestartGroup15.block = new OpenSourceKt$$ExternalSyntheticLambda1(this, flow, i, i24);
                    break;
                }
                break;
        }
    }

    public AddAliasPresenter(BlockersScreens.FilesetUploadOptionsBottomSheet filesetUploadOptionsBottomSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 8;
        this.navigator = screenNavigator;
    }

    public /* synthetic */ AddAliasPresenter(BetterNavigator.ScreenNavigator screenNavigator, int i) {
        this.$r8$classId = i;
        this.navigator = screenNavigator;
    }

    public AddAliasPresenter(PaymentScreens.ContactSyncPermissionScreen contactSyncPermissionScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 15;
        contactSyncPermissionScreen.getClass();
        this.navigator = screenNavigator;
    }

    public AddAliasPresenter(LiteAddMoneyScreen liteAddMoneyScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 10;
        liteAddMoneyScreen.getClass();
        this.navigator = screenNavigator;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Continuation continuation = null;
        switch (this.$r8$classId) {
            case 0:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            case 1:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(1086241583);
                Updater.LaunchedEffect(gapComposer, flow, new EditProfilePresenter$models$2$1(flow, continuation, this, 3));
                AccountsLoadingFailedViewModel accountsLoadingFailedViewModel = new AccountsLoadingFailedViewModel();
                gapComposer.end(false);
                return accountsLoadingFailedViewModel;
            case 2:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            case 3:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            case 4:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            case 5:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            case 6:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            case 7:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            case 8:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            case 9:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            case 10:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-291703622);
                Updater.LaunchedEffect(gapComposer2, flow, new CardStudioPresenter$models$1$1(flow, continuation, this, 22));
                LiteAddMoneyViewModel liteAddMoneyViewModel = new LiteAddMoneyViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new AddMoneyRowId[]{AddMoneyRowId.USE_CLABE, AddMoneyRowId.DEPOSIT_USDC}));
                gapComposer2.end(false);
                return liteAddMoneyViewModel;
            case 11:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            case 12:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            case 13:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            case 14:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            case 15:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-175785471);
                Updater.LaunchedEffect(gapComposer3, flow, new MainPaymentPresenter$models$4$4(flow, continuation, this, 14));
                gapComposer3.end(false);
                return ContactSyncViewModel.INSTANCE;
            case 16:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            case 17:
                m3724models(flow, composer, i);
                return Unit.INSTANCE;
            default:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-415381350);
                Updater.LaunchedEffect(gapComposer4, flow, new WorkerWorkflow$render$1(flow, continuation, this, 5));
                TimecardDetailViewModel timecardDetailViewModel = new TimecardDetailViewModel(new TimecardDetailViewModel.HeroHeader(), new TimecardDetailViewModel.SummaryTable(), new TimecardDetailViewModel.Details());
                gapComposer4.end(false);
                return timecardDetailViewModel;
        }
    }
}
