package app.cash.broadway.ui.compose;

import app.cash.broadway.ui.UpdatesWindowFlags$TabConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ChromeConfig$Merged {
    public final Float bottomNavigationVisibilityPercent;
    public final Boolean bottomNavigationVisible;
    public final Boolean enforceTransparentSystemNavigationBar;
    public final ChromeSystemIconColor navigationBarIconColor;
    public final ChromeSystemIconColor statusBarIconColor;
    public final UpdatesWindowFlags$TabConfig tabConfig;
    public final ToolbarConfig toolbarConfig;

    public ChromeConfig$Merged(UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig, ChromeSystemIconColor chromeSystemIconColor, ChromeSystemIconColor chromeSystemIconColor2, Boolean bool, Boolean bool2, ToolbarConfig toolbarConfig, Float f) {
        this.tabConfig = updatesWindowFlags$TabConfig;
        this.statusBarIconColor = chromeSystemIconColor;
        this.navigationBarIconColor = chromeSystemIconColor2;
        this.enforceTransparentSystemNavigationBar = bool;
        this.bottomNavigationVisible = bool2;
        this.toolbarConfig = toolbarConfig;
        this.bottomNavigationVisibilityPercent = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChromeConfig$Merged)) {
            return false;
        }
        ChromeConfig$Merged chromeConfig$Merged = (ChromeConfig$Merged) obj;
        return Intrinsics.areEqual(this.tabConfig, chromeConfig$Merged.tabConfig) && this.statusBarIconColor == chromeConfig$Merged.statusBarIconColor && this.navigationBarIconColor == chromeConfig$Merged.navigationBarIconColor && Intrinsics.areEqual(this.enforceTransparentSystemNavigationBar, chromeConfig$Merged.enforceTransparentSystemNavigationBar) && Intrinsics.areEqual(this.bottomNavigationVisible, chromeConfig$Merged.bottomNavigationVisible) && Intrinsics.areEqual(this.toolbarConfig, chromeConfig$Merged.toolbarConfig) && Intrinsics.areEqual((Object) this.bottomNavigationVisibilityPercent, (Object) chromeConfig$Merged.bottomNavigationVisibilityPercent);
    }

    public final int hashCode() {
        UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig = this.tabConfig;
        int hashCode = (updatesWindowFlags$TabConfig == null ? 0 : updatesWindowFlags$TabConfig.hashCode()) * 31;
        ChromeSystemIconColor chromeSystemIconColor = this.statusBarIconColor;
        int hashCode2 = (hashCode + (chromeSystemIconColor == null ? 0 : chromeSystemIconColor.hashCode())) * 31;
        ChromeSystemIconColor chromeSystemIconColor2 = this.navigationBarIconColor;
        int hashCode3 = (hashCode2 + (chromeSystemIconColor2 == null ? 0 : chromeSystemIconColor2.hashCode())) * 31;
        Boolean bool = this.enforceTransparentSystemNavigationBar;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.bottomNavigationVisible;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ToolbarConfig toolbarConfig = this.toolbarConfig;
        int hashCode6 = (hashCode5 + (toolbarConfig == null ? 0 : toolbarConfig.hashCode())) * 31;
        Float f = this.bottomNavigationVisibilityPercent;
        return hashCode6 + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "Merged(tabConfig=" + this.tabConfig + ", statusBarIconColor=" + this.statusBarIconColor + ", navigationBarIconColor=" + this.navigationBarIconColor + ", enforceTransparentSystemNavigationBar=" + this.enforceTransparentSystemNavigationBar + ", bottomNavigationVisible=" + this.bottomNavigationVisible + ", toolbarConfig=" + this.toolbarConfig + ", bottomNavigationVisibilityPercent=" + this.bottomNavigationVisibilityPercent + ")";
    }
}
