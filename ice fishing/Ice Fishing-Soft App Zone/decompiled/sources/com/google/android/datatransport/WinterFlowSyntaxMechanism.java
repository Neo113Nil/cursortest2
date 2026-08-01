package com.google.android.datatransport;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSyntaxMechanism extends WinterFlowTransactionVariable {
    public final WinterFlowHandlerPlatform WinterFlowArrayNetwork;
    public final String WinterFlowCacheManagerAgent = "PREF_UNLOCKED_";
    public final SharedPreferences WinterFlowHookDataSource;
    public final WinterFlowHandlerPlatform WinterFlowRouterRouter;
    public final WinterFlowIDEFramework WinterFlowSyntax;
    public final WinterFlowHandlerPlatform WinterFlowTransactionManagerStrategy;
    public final WinterFlowIDEFramework WinterFlowUnitTestResponse;
    public final WinterFlowIDEFramework WinterFlowVariableVersionControl;

    public WinterFlowSyntaxMechanism(SharedPreferences sharedPreferences) {
        this.WinterFlowHookDataSource = sharedPreferences;
        WinterFlowHandlerPlatform WinterFlowCacheManagerAgent = WinterFlowTestingCloud.WinterFlowCacheManagerAgent(Integer.valueOf(sharedPreferences.getInt("PREF_USER_POINTS", 0)));
        this.WinterFlowArrayNetwork = WinterFlowCacheManagerAgent;
        this.WinterFlowVariableVersionControl = new WinterFlowIDEFramework(WinterFlowCacheManagerAgent);
        String string = sharedPreferences.getString("PREF_SELECTED_DIFFICULTY", "EASY");
        WinterFlowHandlerPlatform WinterFlowCacheManagerAgent2 = WinterFlowTestingCloud.WinterFlowCacheManagerAgent(WinterFlowJavaManager.valueOf(string != null ? string : "EASY"));
        this.WinterFlowTransactionManagerStrategy = WinterFlowCacheManagerAgent2;
        this.WinterFlowUnitTestResponse = new WinterFlowIDEFramework(WinterFlowCacheManagerAgent2);
        WinterFlowJavaManager[] winterFlowJavaManagerArr = {WinterFlowJavaManager.WinterFlowRouterRouter};
        LinkedHashSet linkedHashSet = new LinkedHashSet(WinterFlowDataSourceUtility.WinterFlowFrameworkTransaction(1));
        linkedHashSet.add(winterFlowJavaManagerArr[0]);
        Iterator it = WinterFlowJavaManager.WinterFlowResponseEngine.iterator();
        while (it.hasNext()) {
            WinterFlowJavaManager winterFlowJavaManager = (WinterFlowJavaManager) it.next();
            if (this.WinterFlowHookDataSource.getBoolean(this.WinterFlowCacheManagerAgent + winterFlowJavaManager.name(), false)) {
                linkedHashSet.add(winterFlowJavaManager);
            }
        }
        WinterFlowHandlerPlatform WinterFlowCacheManagerAgent3 = WinterFlowTestingCloud.WinterFlowCacheManagerAgent(linkedHashSet);
        this.WinterFlowRouterRouter = WinterFlowCacheManagerAgent3;
        this.WinterFlowSyntax = new WinterFlowIDEFramework(WinterFlowCacheManagerAgent3);
    }

    public final void WinterFlowVariableVersionControl(WinterFlowJavaManager winterFlowJavaManager) {
        if (((Set) this.WinterFlowRouterRouter.getValue()).contains(winterFlowJavaManager)) {
            this.WinterFlowTransactionManagerStrategy.WinterFlowTransactionAgent(null, winterFlowJavaManager);
            SharedPreferences.Editor edit = this.WinterFlowHookDataSource.edit();
            edit.getClass();
            edit.putString("PREF_SELECTED_DIFFICULTY", winterFlowJavaManager.name());
            edit.apply();
        }
    }
}
