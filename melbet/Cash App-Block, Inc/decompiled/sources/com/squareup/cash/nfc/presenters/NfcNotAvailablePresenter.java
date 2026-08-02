package com.squareup.cash.nfc.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.nfc.backend.real.RealNfcPaymentsManager;
import com.squareup.cash.nfc.screens.NfcNotAvailableScreen;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.util.compose.LifecycleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class NfcNotAvailablePresenter implements MoleculePresenter {
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealNfcPaymentsManager nfcManager;
    public final NfcNotAvailableScreen screen;

    public NfcNotAvailablePresenter(IntentLauncher intentLauncher, RealNfcPaymentsManager realNfcPaymentsManager, BetterNavigator.ScreenNavigator screenNavigator, NfcNotAvailableScreen nfcNotAvailableScreen) {
        nfcNotAvailableScreen.getClass();
        this.launcher = intentLauncher;
        this.nfcManager = realNfcPaymentsManager;
        this.navigator = screenNavigator;
        this.screen = nfcNotAvailableScreen;
    }

    /* renamed from: models, reason: collision with other method in class */
    public final void m3669models(Flow flow, Composer composer, int i) {
        int i2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-155618982);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(flow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = {Unit.INSTANCE};
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InviteErrorPresenter$models$1$1(this, null, 6);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LifecycleKt.LifecycleLaunchedEffect(objArr, null, null, (Function2) rememberedValue, gapComposer, 0);
            Updater.LaunchedEffect(gapComposer, flow, new RealMRIFactory$sign$2(flow, (Continuation) null, this, 7));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(this, flow, i, 6);
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final /* bridge */ /* synthetic */ Object models(Flow flow, Composer composer, int i) {
        m3669models(flow, composer, i);
        return Unit.INSTANCE;
    }
}
