package com.squareup.cash.blockers.views.navigation;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.backstack.real.RealBackStackEditor;

/* loaded from: classes.dex */
public interface BackStackHandler {
    boolean handleAndContinue(RealBackStackEditor realBackStackEditor, Screen screen);
}
