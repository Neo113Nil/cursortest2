package com.squareup.cash.blockers.views;

import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.TransitionFactory;
import app.cash.history.screens.HistoryScreens;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.db.StorageLinkQueries$$ExternalSyntheticLambda8;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.protos.cash.plasma.flows.Flow$Type;

/* loaded from: classes.dex */
public final class BlockersTransitionFactory implements TransitionFactory {
    public static final TransitionFactory.StandardTransition.FadeIn fadeIn = new TransitionFactory.StandardTransition.FadeIn(TransitionFactory.Interpolator.EaseOut, 150);

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual((r3 == null || (r1 = r3.blockersData) == null) ? null : r1.blockerId, "PAYMENT_DECISION_GENERIC_BLOCKER_ID") != false) goto L41;
     */
    @Override // app.cash.broadway.ui.TransitionFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TransitionFactory.Transition createTransition(Screen screen, Screen screen2, boolean z, StorageLinkQueries$$ExternalSyntheticLambda8 storageLinkQueries$$ExternalSyntheticLambda8) {
        screen2.getClass();
        if ((screen2 instanceof BlockersScreens.WebViewBlockerScreen) && (screen instanceof BlockersScreens.WebViewBlockerScreen)) {
            return TransitionFactory.StandardTransition.Immediate.INSTANCE;
        }
        if ((screen2 instanceof BlockersScreens.OnboardingInternalRouteScreen) || (screen instanceof BlockersScreens.OnboardingInternalRouteScreen)) {
            return new TransitionFactory.StandardTransition.Push(z);
        }
        boolean z2 = screen instanceof BlockersScreens.PaymentPlanDataBlockerScreen;
        TransitionFactory.StandardTransition.OutToBottom outToBottom = TransitionFactory.StandardTransition.OutToBottom.INSTANCE;
        if (z2 && (screen2 instanceof HistoryScreens)) {
            return outToBottom;
        }
        boolean z3 = screen2 instanceof BlockersScreens.FormScreen;
        if (!z3 || ((BlockersScreens.FormScreen) screen2).blockersData.flowType != Flow$Type.FAMILY_ACCOUNT_STATE) {
            if ((screen2 instanceof ProfileScreens.FamilyEligibilityLoadingScreen) || (screen instanceof BlockersScreens.U13CelebrationBlockerScreen)) {
                return outToBottom;
            }
            if (screen instanceof BlockersScreens.StartFlowEntryPointScreen) {
                BlockersScreens.FormScreen formScreen = z3 ? (BlockersScreens.FormScreen) screen2 : null;
            }
            return null;
        }
        return fadeIn;
    }
}
