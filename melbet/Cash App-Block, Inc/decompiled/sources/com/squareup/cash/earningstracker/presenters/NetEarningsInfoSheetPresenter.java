package com.squareup.cash.earningstracker.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.bitcoin.viewmodels.roundups.BitcoinRoundUpsCardUpsellViewModel;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda1;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class NetEarningsInfoSheetPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;

    public NetEarningsInfoSheetPresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.navigator = screenNavigator;
                this.router = realRouter$Factory$Impl.create$1(screenNavigator);
                break;
            default:
                this.navigator = screenNavigator;
                this.router = realRouter$Factory$Impl.create$1(screenNavigator);
                break;
        }
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m3524models(Flow flow, Composer composer, int i) {
        int i2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-23097440);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(flow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Updater.LaunchedEffect(gapComposer, flow, new EarningsHomePresenter$models$3$1(flow, (Continuation) null, this, 7));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda1(this, flow, i, 17);
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        switch (this.$r8$classId) {
            case 0:
                m3524models(flow, composer, i);
                return Unit.INSTANCE;
            default:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1481871270);
                Updater.LaunchedEffect(gapComposer, flow, new AmountBlockerPresenter$models$1$2(flow, (Continuation) null, this, 15));
                gapComposer.end(false);
                return BitcoinRoundUpsCardUpsellViewModel.INSTANCE;
        }
    }
}
