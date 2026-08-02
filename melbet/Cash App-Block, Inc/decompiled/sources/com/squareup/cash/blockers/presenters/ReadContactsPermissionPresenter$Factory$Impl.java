package com.squareup.cash.blockers.presenters;

import com.squareup.cash.appmessages.views.InlineAppMessageView;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.launcher.IntentLauncher;

/* loaded from: classes.dex */
public final class ReadContactsPermissionPresenter$Factory$Impl {
    public final InlineAppMessageView.MetroFactory delegateFactory;

    public ReadContactsPermissionPresenter$Factory$Impl(InlineAppMessageView.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final CameraPermissionPresenter create(BetterNavigator.ScreenNavigator screenNavigator) {
        IntentLauncher intentLauncher = (IntentLauncher) this.delegateFactory.staticImageLoader.invoke();
        intentLauncher.getClass();
        return new CameraPermissionPresenter(intentLauncher, screenNavigator, 1);
    }
}
