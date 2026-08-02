package com.squareup.cash.appmessages.presenters;

import app.cash.broadway.navigation.Navigator;
import app.cash.local.worker.LocalActivitySetupTeardown;
import com.squareup.cash.appmessages.treehouse.AndroidAppMessagingService;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class InlineAppMessagePresenterHelper$Factory$Impl {
    public final LocalActivitySetupTeardown.MetroFactory delegateFactory;

    public InlineAppMessagePresenterHelper$Factory$Impl(LocalActivitySetupTeardown.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final DisclosurePresenter create(Flow flow, Navigator navigator) {
        navigator.getClass();
        LocalActivitySetupTeardown.MetroFactory metroFactory = this.delegateFactory;
        CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) metroFactory.appForegroundStateProvider.invoke();
        AppMessageClientService appMessageClientService = (AppMessageClientService) metroFactory.sessionManager.invoke();
        RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl = (RealAppMessageActionPerformer$Factory$Impl) metroFactory.syncValueReader.invoke();
        RealAppMessageActionPresenterHelper realAppMessageActionPresenterHelper = new RealAppMessageActionPresenterHelper();
        AndroidAppMessagingService androidAppMessagingService = (AndroidAppMessagingService) metroFactory.shortlinkHandler.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) metroFactory.ioDispatcher.invoke();
        cashAccountDatabaseImpl.getClass();
        appMessageClientService.getClass();
        realAppMessageActionPerformer$Factory$Impl.getClass();
        androidAppMessagingService.getClass();
        coroutineContext.getClass();
        return new DisclosurePresenter(cashAccountDatabaseImpl, appMessageClientService, realAppMessageActionPerformer$Factory$Impl, realAppMessageActionPresenterHelper, androidAppMessagingService, coroutineContext, flow, navigator);
    }
}
