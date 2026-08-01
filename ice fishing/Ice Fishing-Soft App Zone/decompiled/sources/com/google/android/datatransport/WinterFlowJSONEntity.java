package com.google.android.datatransport;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowJSONEntity {
    public final /* synthetic */ ComponentActivity WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowJSONEntity(ComponentActivity componentActivity) {
        this.WinterFlowRouterStructure = componentActivity;
    }

    public final void WinterFlowRouterStructure(Context context) {
        int i = ComponentActivity.WinterFlowBackendCacheManager;
        context.getClass();
        ComponentActivity componentActivity = this.WinterFlowRouterStructure;
        Bundle WinterFlowServiceUtility = ((WinterFlowAlgorithmArray) componentActivity.WinterFlowRouterRouter.WinterFlowUnitTestResponse).WinterFlowServiceUtility("android:support:activity-result");
        if (WinterFlowServiceUtility != null) {
            WinterFlowResolverProcess winterFlowResolverProcess = componentActivity.WinterFlowThreadListener;
            LinkedHashMap linkedHashMap = winterFlowResolverProcess.WinterFlowHookDataSource;
            LinkedHashMap linkedHashMap2 = winterFlowResolverProcess.WinterFlowRouterStructure;
            Bundle bundle = winterFlowResolverProcess.WinterFlowUnitTestResponse;
            ArrayList<Integer> integerArrayList = WinterFlowServiceUtility.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = WinterFlowServiceUtility.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = WinterFlowServiceUtility.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                winterFlowResolverProcess.WinterFlowArrayNetwork.addAll(stringArrayList2);
            }
            Bundle bundle2 = WinterFlowServiceUtility.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        WinterFlowUnitTestLibrary.WinterFlowSyntax(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i2);
                num2.getClass();
                int intValue = num2.intValue();
                String str2 = stringArrayList.get(i2);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                winterFlowResolverProcess.WinterFlowHookDataSource.put(str3, Integer.valueOf(intValue));
            }
        }
    }
}
