package com.squareup.cash.moneybot.views.home;

import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class PreviewActionCardPlugin extends ClientRenderablePlugin {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PreviewActionCardPlugin(int i) {
        this.$r8$classId = i;
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final MoleculeCallbackPresenter createPresenter(Object obj, Object obj2, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        switch (this.$r8$classId) {
            case 0:
                function2.getClass();
                throw new IllegalStateException("Not used in preview");
            default:
                function2.getClass();
                throw new IllegalStateException("Not used in preview");
        }
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final ClientRenderableUi createUi() {
        switch (this.$r8$classId) {
            case 0:
                return new Error.Code.Companion(4);
            default:
                return new WorkCookieJar(4);
        }
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final Object extractMetadata(ClientRenderable clientRenderable, PluginContext pluginContext) {
        int i = this.$r8$classId;
        clientRenderable.getClass();
        switch (i) {
            case 0:
                throw new IllegalStateException("Not used in preview");
            default:
                throw new IllegalStateException("Not used in preview");
        }
    }
}
