package com.squareup.cash.benefits.components.presenters;

import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.family.navigation.RealFamilyNavigator$MetroFactory;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.data.IssuedCardManager;

/* loaded from: classes.dex */
public final class BenefitsComparisonTablePresenter$Factory$Impl {
    public final RealFamilyNavigator$MetroFactory delegateFactory;

    public BenefitsComparisonTablePresenter$Factory$Impl(RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory) {
        this.delegateFactory = realFamilyNavigator$MetroFactory;
    }

    public final BenefitsComparisonTablePresenter create(String str) {
        RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory = this.delegateFactory;
        AndroidStringManager androidStringManager = (AndroidStringManager) realFamilyNavigator$MetroFactory.analytics.invoke();
        SyncValueReader syncValueReader = (SyncValueReader) realFamilyNavigator$MetroFactory.sessionManager.invoke();
        IssuedCardManager issuedCardManager = (IssuedCardManager) realFamilyNavigator$MetroFactory.supportNavigator.invoke();
        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) realFamilyNavigator$MetroFactory.stringManager.invoke();
        androidStringManager.getClass();
        syncValueReader.getClass();
        issuedCardManager.getClass();
        factory.getClass();
        return new BenefitsComparisonTablePresenter(androidStringManager, syncValueReader, issuedCardManager, factory, str);
    }
}
