package com.squareup.cash.initialscreenloader.presenters;

import androidx.compose.animation.core.Transition$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.initialscreenloader.backend.OpenTheAppUserJourney;
import com.squareup.cash.initialscreenloader.screens.InitialScreenPlaceholder;
import com.squareup.util.android.AndroidActivityFinisher;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class InitialScreenLoaderPresenter implements MoleculePresenter {
    public final AndroidActivityFinisher activityFinisher;
    public final Lazy initialScreenLoader$delegate;
    public final BetterNavigator.ScreenNavigator navigator;
    public final OpenTheAppUserJourney openTheAppUserJourney;
    public final InitialScreenPlaceholder screen;

    public InitialScreenLoaderPresenter(PrimitiveRegistry$$ExternalSyntheticLambda0 primitiveRegistry$$ExternalSyntheticLambda0, AndroidActivityFinisher androidActivityFinisher, OpenTheAppUserJourney openTheAppUserJourney, InitialScreenPlaceholder initialScreenPlaceholder, BetterNavigator.ScreenNavigator screenNavigator) {
        initialScreenPlaceholder.getClass();
        this.activityFinisher = androidActivityFinisher;
        this.openTheAppUserJourney = openTheAppUserJourney;
        this.screen = initialScreenPlaceholder;
        this.navigator = screenNavigator;
        this.initialScreenLoader$delegate = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(primitiveRegistry$$ExternalSyntheticLambda0, 20));
    }

    /* renamed from: models, reason: collision with other method in class */
    public final void m3575models(Flow flow, Composer composer, int i) {
        int i2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1119094094);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(flow) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(flow);
            Object rememberedValue = gapComposer.rememberedValue();
            Continuation continuation = null;
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealBoostSelector.AnonymousClass1(this, flow, continuation, 17);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, "load-initial-screen", (Function2) rememberedValue);
            Updater.LaunchedEffect(gapComposer, flow, new InitialScreenLoaderPresenter$models$1$1$1(flow, (Continuation) null, this));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Transition$$ExternalSyntheticLambda2(this, flow, i, 4);
        }
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final /* bridge */ /* synthetic */ Object models(Flow flow, Composer composer, int i) {
        m3575models(flow, composer, i);
        return Unit.INSTANCE;
    }
}
