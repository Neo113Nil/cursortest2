package com.squareup.cash.initialscreenloader.views;

import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.TransitionFactory;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.initialscreenloader.screens.InitialScreenPlaceholder;

/* loaded from: classes.dex */
public final class InitialScreenPlaceholderTransitionFactory implements TransitionFactory {
    @Override // app.cash.broadway.ui.TransitionFactory
    public final TransitionFactory.Transition createTransition(Screen screen, Screen screen2, boolean z, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8) {
        screen2.getClass();
        if ((screen instanceof InitialScreenPlaceholder) && (((InitialScreenPlaceholder) screen).triggeredBy instanceof InitialScreenPlaceholder.TriggeredBy.ActivityLaunch)) {
            return TransitionFactory.StandardTransition.Immediate.INSTANCE;
        }
        return null;
    }
}
