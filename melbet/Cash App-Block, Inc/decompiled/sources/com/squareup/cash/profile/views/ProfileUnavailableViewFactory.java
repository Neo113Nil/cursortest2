package com.squareup.cash.profile.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.ViewFactory;
import com.squareup.cash.profile.screens.ProfileUnavailableScreen;

/* loaded from: classes.dex */
public final class ProfileUnavailableViewFactory implements ViewFactory {
    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (!(screen instanceof ProfileUnavailableScreen)) {
            return null;
        }
        ProfileUnavailableDialog profileUnavailableDialog = new ProfileUnavailableDialog(context);
        return new ViewFactory.ScreenView(profileUnavailableDialog, profileUnavailableDialog);
    }
}
