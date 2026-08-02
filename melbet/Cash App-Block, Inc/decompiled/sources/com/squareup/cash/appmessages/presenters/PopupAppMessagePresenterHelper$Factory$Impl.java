package com.squareup.cash.appmessages.presenters;

import app.cash.local.worker.LocalActivitySetupTeardown;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class PopupAppMessagePresenterHelper$Factory$Impl {
    public final LocalActivitySetupTeardown.MetroFactory delegateFactory;

    public PopupAppMessagePresenterHelper$Factory$Impl(LocalActivitySetupTeardown.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final CardStudioPresenter create(Flow flow, BetterNavigator.ScreenNavigator screenNavigator) {
        LocalActivitySetupTeardown.MetroFactory metroFactory = this.delegateFactory;
        RealAppMessageActionPresenterHelper realAppMessageActionPresenterHelper = (RealAppMessageActionPresenterHelper) metroFactory.appForegroundStateProvider.invoke();
        AppMessageClientService appMessageClientService = (AppMessageClientService) metroFactory.sessionManager.invoke();
        RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl = (RealAppMessageActionPerformer$Factory$Impl) metroFactory.syncValueReader.invoke();
        CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) metroFactory.shortlinkHandler.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) metroFactory.ioDispatcher.invoke();
        realAppMessageActionPresenterHelper.getClass();
        appMessageClientService.getClass();
        realAppMessageActionPerformer$Factory$Impl.getClass();
        cashAccountDatabaseImpl.getClass();
        coroutineContext.getClass();
        return new CardStudioPresenter(realAppMessageActionPresenterHelper, appMessageClientService, realAppMessageActionPerformer$Factory$Impl, cashAccountDatabaseImpl, coroutineContext, flow, screenNavigator);
    }
}
