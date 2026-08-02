package com.squareup.cash.family.navigation;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import io.noties.markwon.MarkwonConfiguration;

/* loaded from: classes.dex */
public final class RealFamilyNavigator$Factory$Impl {
    public final RealFamilyNavigator$MetroFactory delegateFactory;

    public RealFamilyNavigator$Factory$Impl(RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory) {
        this.delegateFactory = realFamilyNavigator$MetroFactory;
    }

    public final MarkwonConfiguration create$1(Navigator navigator) {
        navigator.getClass();
        RealFamilyNavigator$MetroFactory realFamilyNavigator$MetroFactory = this.delegateFactory;
        Analytics analytics = (Analytics) realFamilyNavigator$MetroFactory.analytics.invoke();
        SessionManager sessionManager = (SessionManager) realFamilyNavigator$MetroFactory.sessionManager.invoke();
        RealSupportNavigator realSupportNavigator = (RealSupportNavigator) realFamilyNavigator$MetroFactory.supportNavigator.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) realFamilyNavigator$MetroFactory.stringManager.invoke();
        analytics.getClass();
        sessionManager.getClass();
        realSupportNavigator.getClass();
        androidStringManager.getClass();
        return new MarkwonConfiguration(analytics, sessionManager, realSupportNavigator, androidStringManager, navigator);
    }
}
