package com.squareup.cash.blockers.views.navigation;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.backstack.api.BackStack$ScreenEntry;
import com.squareup.cash.backstack.real.RealBackStack;
import com.squareup.cash.backstack.real.RealBackStackEditor;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAliasPickerScreen;

/* loaded from: classes.dex */
public final class AccountPickerHandler implements BackStackHandler {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AccountPickerHandler(int i) {
        this.$r8$classId = i;
    }

    @Override // com.squareup.cash.blockers.views.navigation.BackStackHandler
    public final boolean handleAndContinue(RealBackStackEditor realBackStackEditor, Screen screen) {
        switch (this.$r8$classId) {
            case 0:
                screen.getClass();
                if (screen instanceof OnboardingAccountPickerScreen) {
                    realBackStackEditor.clear();
                    break;
                }
                break;
            default:
                RealBackStack realBackStack = realBackStackEditor.view;
                screen.getClass();
                if ((screen instanceof BlockersScreens) && !(screen instanceof BlockersScreens.ChildBlockersScreens) && ((BlockersScreens) screen).getBlockersData().flow == BlockersData.Flow.ONBOARDING) {
                    if (!realBackStack.isCurrentFlowScreensEmpty()) {
                        BackStack$ScreenEntry peekScreenInCurrentFlow = realBackStack.peekScreenInCurrentFlow();
                        peekScreenInCurrentFlow.getClass();
                        if (OnboardingAccountPickerScreen.class.isAssignableFrom(peekScreenInCurrentFlow.args.getClass())) {
                        }
                    }
                    if (!realBackStack.isCurrentFlowScreensEmpty()) {
                        BackStack$ScreenEntry peekScreenInCurrentFlow2 = realBackStack.peekScreenInCurrentFlow();
                        peekScreenInCurrentFlow2.getClass();
                        if (OnboardingAliasPickerScreen.class.isAssignableFrom(peekScreenInCurrentFlow2.args.getClass())) {
                        }
                    }
                    realBackStackEditor.clear();
                    break;
                }
                break;
        }
        return false;
    }
}
