package com.squareup.cash.moneybot.components.plugins;

import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.presenters.TransferOptionPickerResolver;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.mappers.clientrenderable.TemplateCardMappersKt;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TemplateCard;
import com.squareup.cash.moneybot.components.api.ClientRenderablePlugin;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.components.api.PluginContext;
import com.squareup.cash.moneybot.presenters.plugins.TemplateCardPresenter;
import com.squareup.cash.moneybot.presenters.plugins.TemplateCardPresenter$Factory$Impl;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.pools.presenters.PoolDetailsPresenter$MetroFactory;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.cash.kgoose.api.v3.ClientRenderable;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class TemplateCardPlugin extends ClientRenderablePlugin implements HasObservability {
    public final ErrorReporter errorReporter;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final TemplateCardPresenter$Factory$Impl presenterFactory;

    public TemplateCardPlugin(TemplateCardPresenter$Factory$Impl templateCardPresenter$Factory$Impl, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.presenterFactory = templateCardPresenter$Factory$Impl;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final MoleculeCallbackPresenter createPresenter(Object obj, Object obj2, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        function2.getClass();
        PoolDetailsPresenter$MetroFactory poolDetailsPresenter$MetroFactory = this.presenterFactory.delegateFactory;
        poolDetailsPresenter$MetroFactory.getClass();
        RealMoneybotAnalyticsService realMoneybotAnalyticsService = (RealMoneybotAnalyticsService) poolDetailsPresenter$MetroFactory.moneyFormatterFactory.invoke();
        ChatManager chatManager = (ChatManager) poolDetailsPresenter$MetroFactory.poolsRepository.invoke();
        RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) poolDetailsPresenter$MetroFactory.launcher.invoke();
        RealInstrumentManager realInstrumentManager = (RealInstrumentManager) poolDetailsPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
        SyncValueReader syncValueReader = (SyncValueReader) ((DoubleCheck) poolDetailsPresenter$MetroFactory.blockersNavigator).getValue();
        PiggybankAppService piggybankAppService = (PiggybankAppService) ((DoubleCheck) poolDetailsPresenter$MetroFactory.analytics).getValue();
        TransferOptionPickerResolver transferOptionPickerResolver = (TransferOptionPickerResolver) poolDetailsPresenter$MetroFactory.defaultActivityItemEventHandlerFactory.invoke();
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) poolDetailsPresenter$MetroFactory.clock.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) poolDetailsPresenter$MetroFactory.stringManager).lambda.invoke();
        RealSessionFlags realSessionFlags = (RealSessionFlags) poolDetailsPresenter$MetroFactory.uuidGenerator.invoke();
        ErrorReporter errorReporter = (ErrorReporter) ((LambdaProvider) poolDetailsPresenter$MetroFactory.sessionManager).lambda.invoke();
        SampleStrategy sampleStrategy = (SampleStrategy) poolDetailsPresenter$MetroFactory.featureFlagManager.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) poolDetailsPresenter$MetroFactory.activitiesCacheManager.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) ((LambdaProvider) poolDetailsPresenter$MetroFactory.dateFormatManager).lambda.invoke();
        realMoneybotAnalyticsService.getClass();
        chatManager.getClass();
        realBalanceSnapshotManager.getClass();
        realInstrumentManager.getClass();
        syncValueReader.getClass();
        piggybankAppService.getClass();
        transferOptionPickerResolver.getClass();
        factory.getClass();
        androidStringManager.getClass();
        realSessionFlags.getClass();
        errorReporter.getClass();
        sampleStrategy.getClass();
        realRouter$Factory$Impl.getClass();
        coroutineContext.getClass();
        return new TemplateCardPresenter(realMoneybotAnalyticsService, chatManager, realBalanceSnapshotManager, realInstrumentManager, syncValueReader, piggybankAppService, transferOptionPickerResolver, factory, androidStringManager, realSessionFlags, errorReporter, sampleStrategy, realRouter$Factory$Impl, coroutineContext, (TemplateCard) obj, pluginContext, screenNavigator);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final ClientRenderableUi createUi() {
        return new WorkCookieJar(2);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderablePlugin
    public final Object extractMetadata(ClientRenderable clientRenderable, PluginContext pluginContext) {
        com.squareup.protos.cash.kgoose.api.v3.TemplateCard value;
        clientRenderable.getClass();
        ClientRenderable.Component component = clientRenderable.component;
        ClientRenderable.Component.TemplateCard templateCard = component instanceof ClientRenderable.Component.TemplateCard ? (ClientRenderable.Component.TemplateCard) component : null;
        if (templateCard == null || (value = templateCard.getValue()) == null) {
            return null;
        }
        String requestId = pluginContext.getRequestId();
        Integer num = clientRenderable.version;
        return TemplateCardMappersKt.toTemplateCard$default(this, value, requestId, num != null ? num.intValue() : 0);
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }
}
