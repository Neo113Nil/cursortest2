package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.R;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.blockers.EarnerEnrollmentSuccessBlocker;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class EarnerEnrollmentSuccessBlockerPresenter implements MoleculePresenter {
    public final BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs args;
    public final EarnerOnboardingAnalytics earnerOnboardingAnalytics;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;
    public final AndroidStringManager stringManager;

    public EarnerEnrollmentSuccessBlockerPresenter(AndroidStringManager androidStringManager, RealRouter$Factory$Impl realRouter$Factory$Impl, EarnerOnboardingAnalytics earnerOnboardingAnalytics, BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs earnerEnrollmentSuccessBlockerScreenArgs, BetterNavigator.ScreenNavigator screenNavigator) {
        this.stringManager = androidStringManager;
        this.earnerOnboardingAnalytics = earnerOnboardingAnalytics;
        this.args = earnerEnrollmentSuccessBlockerScreenArgs;
        this.navigator = screenNavigator;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1872676337);
        BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs earnerEnrollmentSuccessBlockerScreenArgs = this.args;
        EarnerEnrollmentSuccessBlocker.Action action = (EarnerEnrollmentSuccessBlocker.Action) CollectionsKt.firstOrNull((List) earnerEnrollmentSuccessBlockerScreenArgs.getBlocker().actions);
        String str2 = earnerEnrollmentSuccessBlockerScreenArgs.getBlockersData().flowToken;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(str2);
        Object rememberedValue = gapComposer.rememberedValue();
        Object[] objArr = 0;
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new InteractiveCardView$flingTo$1.AnonymousClass2((Object) this, (Object) str2, (Continuation) (objArr == true ? 1 : 0), 6);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Updater.LaunchedEffect(gapComposer, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, this, str2, action, 22));
        EarnerEnrollmentSuccessBlocker blocker = earnerEnrollmentSuccessBlockerScreenArgs.getBlocker();
        Image image = blocker.banner_image;
        if (image == null || (str = image.light_url) == null) {
            str = image != null ? image.dark_url : null;
            if (str == null) {
                str = "";
            }
        }
        String str3 = blocker.title;
        String str4 = str3 == null ? "" : str3;
        String str5 = blocker.body;
        String str6 = str5 == null ? "" : str5;
        String str7 = action != null ? action.text : null;
        String str8 = str7 != null ? str7 : "";
        String str9 = blocker.primary_button_title;
        if (str9 == null) {
            str9 = this.stringManager.get(R.string.blockers_done);
        }
        EarnerEnrollmentBlockerViewModel.Success success = new EarnerEnrollmentBlockerViewModel.Success(str, str4, str6, str8, str9);
        gapComposer.end(false);
        return success;
    }
}
