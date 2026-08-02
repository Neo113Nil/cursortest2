package com.squareup.cash.clientrouting.routers.account;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.work.presenters.RealYouPresenter$MetroFactory;

/* loaded from: classes.dex */
public final class MultipleAccountsRouter$Factory$Impl {
    public final RealYouPresenter$MetroFactory delegateFactory;

    public MultipleAccountsRouter$Factory$Impl(RealYouPresenter$MetroFactory realYouPresenter$MetroFactory) {
        this.delegateFactory = realYouPresenter$MetroFactory;
    }

    public final MultipleAccountsRouter create(Navigator navigator) {
        navigator.getClass();
        RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = this.delegateFactory;
        RoutableAccountsProvider routableAccountsProvider = (RoutableAccountsProvider) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
        RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) realYouPresenter$MetroFactory.passcodeProvider.invoke();
        routableAccountsProvider.getClass();
        realFamilyProfileManager.getClass();
        androidStringManager.getClass();
        return new MultipleAccountsRouter(routableAccountsProvider, realFamilyProfileManager, androidStringManager, navigator);
    }
}
