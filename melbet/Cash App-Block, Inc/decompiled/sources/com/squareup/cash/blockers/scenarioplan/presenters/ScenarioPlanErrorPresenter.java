package com.squareup.cash.blockers.scenarioplan.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.blockers.scenarioplan.screens.ScenarioPlanScreens;
import com.squareup.cash.blockers.scenarioplan.viewmodels.ScenarioPlanErrorViewModel;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.formview.viewmodels.FormViewModel;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class ScenarioPlanErrorPresenter implements MoleculePresenter {
    public final ScenarioPlanScreens.ScenarioPlanErrorScreen args;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public ScenarioPlanErrorPresenter(ScenarioPlanScreens.ScenarioPlanErrorScreen scenarioPlanErrorScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager) {
        scenarioPlanErrorScreen.getClass();
        this.args = scenarioPlanErrorScreen;
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1731160268);
        Updater.LaunchedEffect(gapComposer, flow, new FileBlockerView$6$2$2(flow, (Continuation) null, this, 16));
        FormBlocker.Element element = new FormBlocker.Element("error-icon", new FormBlocker.Element.AbstractC0072Element.LocalImageElement(new FormBlocker.Element.LocalImageElement(FormBlocker.Element.LocalImageElement.Icon.SECURITY_WARNING, null, null, 6, null)), null, 4, null);
        ScenarioPlanScreens.ScenarioPlanErrorScreen scenarioPlanErrorScreen = this.args;
        ScenarioPlanErrorViewModel scenarioPlanErrorViewModel = new ScenarioPlanErrorViewModel(new FormViewModel(CollectionsKt__CollectionsKt.listOf((Object[]) new FormBlocker.Element[]{element, new FormBlocker.Element("title", new FormBlocker.Element.AbstractC0072Element.TextElement(new FormBlocker.Element.TextElement(scenarioPlanErrorScreen.errorMessage.title, null, FormBlocker.Element.TextElement.Size.LARGE, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null)), null, 4, null), new FormBlocker.Element("message", new FormBlocker.Element.AbstractC0072Element.TextElement(new FormBlocker.Element.TextElement(scenarioPlanErrorScreen.errorMessage.message, null, FormBlocker.Element.TextElement.Size.MEDIUM, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null)), null, 4, null), new FormBlocker.Element(null, new FormBlocker.Element.AbstractC0072Element.SpacerElement(new FormBlocker.Element.SpacerElement(null, null, 3, null)), null, 5, null)}), true, this.stringManager.get(R.string.ok), null, null, null, false, null, scenarioPlanErrorScreen.accentColor, false, null, null, null, null, null, null, null, null, false, null, 1046568));
        gapComposer.end(false);
        return scenarioPlanErrorViewModel;
    }
}
