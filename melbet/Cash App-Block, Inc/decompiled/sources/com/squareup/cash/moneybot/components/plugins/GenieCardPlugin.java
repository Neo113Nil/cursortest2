package com.squareup.cash.moneybot.components.plugins;

import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.genie.backend.real.GenieLogger;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.presenters.plugins.GenieCardPresenter;
import com.squareup.cash.moneybot.presenters.plugins.GenieCardPresenter$Factory$Impl;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import com.squareup.protos.cash.kgoose.api.v3.GenieCard;
import com.squareup.scannerview.SizeMap;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class GenieCardPlugin extends ClientRenderablePlugin {
    public final GenieLogger genieLogger;
    public final GenieCardPresenter$Factory$Impl presenterFactory;

    public GenieCardPlugin(GenieCardPresenter$Factory$Impl genieCardPresenter$Factory$Impl, GenieLogger genieLogger) {
        this.presenterFactory = genieCardPresenter$Factory$Impl;
        this.genieLogger = genieLogger;
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final MoleculeCallbackPresenter createPresenter(Object obj, Object obj2, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        function2.getClass();
        return new GenieCardPresenter((EglCore) ((RealGlobalConfigManager.MetroFactory) this.presenterFactory.delegateFactory.adapter).invoke(), (GenieCard) obj, pluginContext, screenNavigator, function2);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final ClientRenderableUi createUi() {
        return new SizeMap(this.genieLogger, 23);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final Object extractMetadata(ClientRenderable clientRenderable, PluginContext pluginContext) {
        clientRenderable.getClass();
        ClientRenderable.Component component = clientRenderable.component;
        if (component != null) {
            ClientRenderable.Component.GenieCard genieCard = component instanceof ClientRenderable.Component.GenieCard ? (ClientRenderable.Component.GenieCard) component : null;
            if (genieCard != null) {
                return genieCard.getValue();
            }
        }
        return null;
    }
}
