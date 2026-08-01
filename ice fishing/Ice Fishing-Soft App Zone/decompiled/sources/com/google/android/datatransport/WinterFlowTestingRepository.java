package com.google.android.datatransport;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final /* synthetic */ class WinterFlowTestingRepository implements WinterFlowQueueFramework {
    public final /* synthetic */ Object WinterFlowHookDataSource;
    public final /* synthetic */ int WinterFlowRouterStructure;

    public /* synthetic */ WinterFlowTestingRepository(int i, Object obj) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = obj;
    }

    @Override // com.google.android.datatransport.WinterFlowQueueFramework
    public final Bundle WinterFlowRouterStructure() {
        WinterFlowServerPlatform[] winterFlowServerPlatformArr;
        int i = this.WinterFlowRouterStructure;
        Object obj = this.WinterFlowHookDataSource;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                int i2 = ComponentActivity.WinterFlowBackendCacheManager;
                Bundle bundle = new Bundle();
                WinterFlowResolverProcess winterFlowResolverProcess = ((ComponentActivity) obj).WinterFlowThreadListener;
                winterFlowResolverProcess.getClass();
                LinkedHashMap linkedHashMap = winterFlowResolverProcess.WinterFlowHookDataSource;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(winterFlowResolverProcess.WinterFlowArrayNetwork));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(winterFlowResolverProcess.WinterFlowUnitTestResponse));
                return bundle;
            case 1:
                Map WinterFlowVariableVersionControl = ((WinterFlowParserSystem) obj).WinterFlowVariableVersionControl();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : WinterFlowVariableVersionControl.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            default:
                WinterFlowRequestEngine winterFlowRequestEngine = (WinterFlowRequestEngine) obj;
                for (Map.Entry entry2 : WinterFlowDataSourceUtility.WinterFlowSessionManagerInterface((LinkedHashMap) winterFlowRequestEngine.WinterFlowRouterRouter).entrySet()) {
                    winterFlowRequestEngine.WinterFlowThreadListener(((WinterFlowHandlerPlatform) entry2.getValue()).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : WinterFlowDataSourceUtility.WinterFlowSessionManagerInterface((LinkedHashMap) winterFlowRequestEngine.WinterFlowTransactionManagerStrategy).entrySet()) {
                    winterFlowRequestEngine.WinterFlowThreadListener(((WinterFlowQueueFramework) entry3.getValue()).WinterFlowRouterStructure(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) winterFlowRequestEngine.WinterFlowVariableVersionControl;
                if (linkedHashMap2.isEmpty()) {
                    winterFlowServerPlatformArr = new WinterFlowServerPlatform[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new WinterFlowServerPlatform((String) entry4.getKey(), entry4.getValue()));
                    }
                    winterFlowServerPlatformArr = (WinterFlowServerPlatform[]) arrayList.toArray(new WinterFlowServerPlatform[0]);
                }
                return WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(winterFlowServerPlatformArr, winterFlowServerPlatformArr.length));
        }
    }
}
