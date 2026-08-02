package com.squareup.cash.education.stories.views;

import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.TransitionFactory;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.education.stories.screens.EducationStoryScreen;

/* loaded from: classes.dex */
public final class EducationStoryTransitionFactory implements TransitionFactory {
    @Override // app.cash.broadway.ui.TransitionFactory
    public final TransitionFactory.Transition createTransition(Screen screen, Screen screen2, boolean z, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8) {
        screen2.getClass();
        boolean z2 = screen instanceof EducationStoryScreen;
        boolean z3 = false;
        boolean z4 = z2 && (screen2 instanceof EducationStoryScreen);
        boolean z5 = z && z2 && !(screen2 instanceof EducationStoryScreen);
        boolean z6 = (z || z2 || !(screen2 instanceof EducationStoryScreen)) ? false : true;
        boolean z7 = (z || !z2 || (screen2 instanceof EducationStoryScreen)) ? false : true;
        if (z && !z2 && (screen2 instanceof EducationStoryScreen)) {
            z3 = true;
        }
        if (z4) {
            return TransitionFactory.StandardTransition.PushLeft.INSTANCE;
        }
        if (!z6) {
            if (!z5) {
                if (!z7) {
                    if (!z3) {
                        return null;
                    }
                }
            }
            return TransitionFactory.StandardTransition.OutToBottom.INSTANCE;
        }
        return TransitionFactory.StandardTransition.InFromBottom.INSTANCE;
    }
}
