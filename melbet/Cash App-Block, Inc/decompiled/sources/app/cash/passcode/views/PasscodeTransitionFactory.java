package app.cash.passcode.views;

import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.TransitionFactory;
import app.cash.passcode.screens.EndAppLock;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;

/* loaded from: classes.dex */
public final class PasscodeTransitionFactory implements TransitionFactory {
    @Override // app.cash.broadway.ui.TransitionFactory
    public final TransitionFactory.Transition createTransition(Screen screen, Screen screen2, boolean z, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8) {
        screen2.getClass();
        if (screen2 instanceof EndAppLock) {
            return TransitionFactory.StandardTransition.FadeOutThenIn.INSTANCE;
        }
        return null;
    }
}
