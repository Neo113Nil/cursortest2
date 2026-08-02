package com.squareup.cash.blockers.presenters;

import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.savings.presenters.TransferInPresenter$MetroFactory;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class ContactsPermissionExplanationSheetPresenter$Factory$Impl {
    public final TransferInPresenter$MetroFactory delegateFactory;

    public ContactsPermissionExplanationSheetPresenter$Factory$Impl(TransferInPresenter$MetroFactory transferInPresenter$MetroFactory) {
        this.delegateFactory = transferInPresenter$MetroFactory;
    }

    public final LocalPosCheckInPresenter create(BlockersScreens.ContactsPermissionExplanationSheet contactsPermissionExplanationSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        TransferInPresenter$MetroFactory transferInPresenter$MetroFactory = this.delegateFactory;
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) transferInPresenter$MetroFactory.moneyFormatterFactory.invoke();
        AppConfigManager appConfigManager = (AppConfigManager) transferInPresenter$MetroFactory.analytics.getValue();
        CoroutineContext coroutineContext = (CoroutineContext) transferInPresenter$MetroFactory.stringManager.lambda.invoke();
        realRouter$Factory$Impl.getClass();
        appConfigManager.getClass();
        coroutineContext.getClass();
        return new LocalPosCheckInPresenter(realRouter$Factory$Impl, appConfigManager, coroutineContext, contactsPermissionExplanationSheet, screenNavigator);
    }
}
