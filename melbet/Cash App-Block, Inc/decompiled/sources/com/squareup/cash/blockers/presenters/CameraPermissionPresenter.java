package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.launcher.IntentLauncher;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class CameraPermissionPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId;
    public final IntentLauncher intentLauncher;
    public final BetterNavigator.ScreenNavigator navigator;

    public /* synthetic */ CameraPermissionPresenter(IntentLauncher intentLauncher, BetterNavigator.ScreenNavigator screenNavigator, int i) {
        this.$r8$classId = i;
        this.intentLauncher = intentLauncher;
        this.navigator = screenNavigator;
    }

    /* renamed from: models, reason: collision with other method in class */
    public final void m3422models(Flow flow, Composer composer, int i) {
        int i2;
        int i3;
        int i4 = this.$r8$classId;
        Continuation continuation = null;
        flow.getClass();
        switch (i4) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(-1696233534);
                if ((i & 6) == 0) {
                    i2 = i | (gapComposer.changedInstance(flow) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= gapComposer.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer, flow, new CashtagPresenter$models$2$1(flow, continuation, this, 8));
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, 19);
                    break;
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(-256283710);
                if ((i & 6) == 0) {
                    i3 = i | (gapComposer2.changedInstance(flow) ? 4 : 2);
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= gapComposer2.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer2, flow, new PasscodePresenter$models$1$2(flow, continuation, this, 17));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, 28);
                    break;
                }
                break;
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final /* bridge */ /* synthetic */ Object models(Flow flow, Composer composer, int i) {
        switch (this.$r8$classId) {
            case 0:
                m3422models(flow, composer, i);
                break;
            default:
                m3422models(flow, composer, i);
                break;
        }
        return Unit.INSTANCE;
    }
}
