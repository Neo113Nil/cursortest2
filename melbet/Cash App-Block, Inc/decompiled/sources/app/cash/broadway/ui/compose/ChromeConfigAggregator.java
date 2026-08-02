package app.cash.broadway.ui.compose;

import androidx.compose.animation.EnterExitState;
import app.cash.broadway.ui.UpdatesWindowFlags$TabConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ChromeConfigAggregator {
    public Function0 configChangedCallback;
    public final ArrayList nodes = new ArrayList();

    public final ChromeConfig$Merged getMergedConfig() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.nodes.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ChromeConfigNode) next).targetVisibilityState == EnterExitState.Visible) {
                arrayList.add(next);
            }
        }
        ChromeConfig$Merged chromeConfig$Merged = new ChromeConfig$Merged(null, null, null, null, null, null, null);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ChromeConfigNode chromeConfigNode = (ChromeConfigNode) it2.next();
            chromeConfigNode.getClass();
            Float f = chromeConfig$Merged.bottomNavigationVisibilityPercent;
            ToolbarConfig toolbarConfig = chromeConfig$Merged.toolbarConfig;
            Boolean bool = chromeConfig$Merged.bottomNavigationVisible;
            UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig = chromeConfig$Merged.tabConfig;
            Boolean bool2 = chromeConfig$Merged.enforceTransparentSystemNavigationBar;
            ChromeSystemIconColor chromeSystemIconColor = chromeConfig$Merged.navigationBarIconColor;
            ChromeSystemIconColor chromeSystemIconColor2 = chromeConfig$Merged.statusBarIconColor;
            if (chromeSystemIconColor2 == null || chromeSystemIconColor == null || bool2 == null || updatesWindowFlags$TabConfig == null || bool == null || toolbarConfig == null || f == null) {
                if (updatesWindowFlags$TabConfig == null) {
                    updatesWindowFlags$TabConfig = chromeConfigNode.tabConfig;
                }
                UpdatesWindowFlags$TabConfig updatesWindowFlags$TabConfig2 = updatesWindowFlags$TabConfig;
                if (chromeSystemIconColor2 == null) {
                    chromeSystemIconColor2 = chromeConfigNode.statusBarIconColor;
                }
                ChromeSystemIconColor chromeSystemIconColor3 = chromeSystemIconColor2;
                if (chromeSystemIconColor == null) {
                    chromeSystemIconColor = chromeConfigNode.navigationBarIconColor;
                }
                ChromeSystemIconColor chromeSystemIconColor4 = chromeSystemIconColor;
                if (bool2 == null) {
                    bool2 = chromeConfigNode.enforceTransparentSystemNavigationBar;
                }
                Boolean bool3 = bool2;
                if (bool == null) {
                    bool = chromeConfigNode.bottomNavigationVisible;
                }
                Boolean bool4 = bool;
                if (toolbarConfig == null) {
                    toolbarConfig = chromeConfigNode.toolbarConfig;
                }
                ToolbarConfig toolbarConfig2 = toolbarConfig;
                if (f == null) {
                    f = chromeConfigNode.bottomNavigationVisibilityPercent;
                }
                chromeConfig$Merged = new ChromeConfig$Merged(updatesWindowFlags$TabConfig2, chromeSystemIconColor3, chromeSystemIconColor4, bool3, bool4, toolbarConfig2, f);
            }
        }
        return chromeConfig$Merged;
    }
}
