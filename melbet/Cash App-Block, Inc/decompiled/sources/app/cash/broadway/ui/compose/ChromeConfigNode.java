package app.cash.broadway.ui.compose;

import androidx.compose.animation.EnterExitState;
import app.cash.broadway.ui.UpdatesWindowFlags$TabConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ChromeConfigNode {
    public Float bottomNavigationVisibilityPercent;
    public Boolean bottomNavigationVisible;
    public Function0 configChangedCallback;
    public Boolean enforceTransparentSystemNavigationBar;
    public ChromeSystemIconColor navigationBarIconColor;
    public ChromeSystemIconColor statusBarIconColor;
    public UpdatesWindowFlags$TabConfig tabConfig;
    public EnterExitState targetVisibilityState;
    public ToolbarConfig toolbarConfig;

    public ChromeConfigNode(EnterExitState enterExitState, UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig, ChromeSystemIconColor chromeSystemIconColor, ChromeSystemIconColor chromeSystemIconColor2, Boolean bool, Boolean bool2, ToolbarConfig toolbarConfig, Float f) {
        enterExitState.getClass();
        this.targetVisibilityState = enterExitState;
        this.tabConfig = updatesWindowFlags$TabConfig;
        this.statusBarIconColor = chromeSystemIconColor;
        this.navigationBarIconColor = chromeSystemIconColor2;
        this.enforceTransparentSystemNavigationBar = bool;
        this.bottomNavigationVisible = bool2;
        this.toolbarConfig = toolbarConfig;
        this.bottomNavigationVisibilityPercent = f;
    }

    public final void update(EnterExitState enterExitState, UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig, ChromeSystemIconColor chromeSystemIconColor, ChromeSystemIconColor chromeSystemIconColor2, Boolean bool, Boolean bool2, ToolbarConfig toolbarConfig, Float f) {
        Function0 function0;
        enterExitState.getClass();
        boolean z = (this.targetVisibilityState == enterExitState && Intrinsics.areEqual(this.tabConfig, updatesWindowFlags$TabConfig) && this.statusBarIconColor == chromeSystemIconColor && this.navigationBarIconColor == chromeSystemIconColor2 && Intrinsics.areEqual(this.enforceTransparentSystemNavigationBar, bool) && Intrinsics.areEqual(this.bottomNavigationVisible, bool2) && Intrinsics.areEqual(this.toolbarConfig, toolbarConfig) && Intrinsics.areEqual(this.bottomNavigationVisibilityPercent, f)) ? false : true;
        this.targetVisibilityState = enterExitState;
        this.tabConfig = updatesWindowFlags$TabConfig;
        this.statusBarIconColor = chromeSystemIconColor;
        this.navigationBarIconColor = chromeSystemIconColor2;
        this.enforceTransparentSystemNavigationBar = bool;
        this.bottomNavigationVisible = bool2;
        this.toolbarConfig = toolbarConfig;
        this.bottomNavigationVisibilityPercent = f;
        if (!z || (function0 = this.configChangedCallback) == null) {
            return;
        }
        function0.invoke();
    }
}
