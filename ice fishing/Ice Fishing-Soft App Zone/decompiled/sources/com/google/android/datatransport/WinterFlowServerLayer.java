package com.google.android.datatransport;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowServerLayer {
    public static final /* synthetic */ int WinterFlowSyntax = 0;
    public final WinterFlowRequestListener WinterFlowRouterRouter;
    public final WinterFlowListenerPlatform WinterFlowTransactionManagerStrategy;
    public WinterFlowSerializerMicroservice WinterFlowUnitTestResponse;
    public final String WinterFlowVariableVersionControl;

    static {
        new LinkedHashMap();
    }

    public WinterFlowServerLayer(WinterFlowRendererRenderer winterFlowRendererRenderer) {
        LinkedHashMap linkedHashMap = WinterFlowRouterTesting.WinterFlowHookDataSource;
        this.WinterFlowVariableVersionControl = WinterFlowSoftwareException.WinterFlowPackageIDE(winterFlowRendererRenderer.getClass());
        WinterFlowListenerPlatform winterFlowListenerPlatform = new WinterFlowListenerPlatform();
        winterFlowListenerPlatform.WinterFlowHookDataSource = this;
        winterFlowListenerPlatform.WinterFlowCacheManagerAgent = new ArrayList();
        winterFlowListenerPlatform.WinterFlowArrayNetwork = new LinkedHashMap();
        this.WinterFlowTransactionManagerStrategy = winterFlowListenerPlatform;
        this.WinterFlowRouterRouter = new WinterFlowRequestListener();
    }

    public WinterFlowLoaderValidator WinterFlowArrayNetwork(WinterFlowObjectPackage winterFlowObjectPackage) {
        boolean matches;
        WinterFlowListenerVersionControl winterFlowListenerVersionControl;
        WinterFlowStackProvider WinterFlowRouterStructure;
        WinterFlowListenerPlatform winterFlowListenerPlatform = this.WinterFlowTransactionManagerStrategy;
        LinkedHashMap linkedHashMap = (LinkedHashMap) winterFlowListenerPlatform.WinterFlowArrayNetwork;
        Uri uri = (Uri) winterFlowObjectPackage.WinterFlowTransactionManagerStrategy;
        ArrayList arrayList = (ArrayList) winterFlowListenerPlatform.WinterFlowCacheManagerAgent;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        WinterFlowLoaderValidator winterFlowLoaderValidator = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            WinterFlowPackageStructure winterFlowPackageStructure = (WinterFlowPackageStructure) obj;
            winterFlowPackageStructure.getClass();
            WinterFlowRendererNode winterFlowRendererNode = winterFlowPackageStructure.WinterFlowArrayNetwork;
            if (((WinterFlowListenerVersionControl) winterFlowRendererNode.getValue()) == null) {
                matches = true;
            } else if (uri == null) {
                matches = false;
            } else {
                WinterFlowListenerVersionControl winterFlowListenerVersionControl2 = (WinterFlowListenerVersionControl) winterFlowRendererNode.getValue();
                winterFlowListenerVersionControl2.getClass();
                String uri2 = uri.toString();
                uri2.getClass();
                matches = winterFlowListenerVersionControl2.WinterFlowVariableVersionControl.matcher(uri2).matches();
            }
            if (matches) {
                Bundle WinterFlowArrayNetwork = uri != null ? winterFlowPackageStructure.WinterFlowArrayNetwork(uri, linkedHashMap) : null;
                int WinterFlowHookDataSource = winterFlowPackageStructure.WinterFlowHookDataSource(uri);
                String str = (String) winterFlowObjectPackage.WinterFlowUnitTestResponse;
                boolean z = str != null && str.equals(null);
                if (WinterFlowArrayNetwork == null) {
                    if (z) {
                        Bundle WinterFlowOrchestrationSubsystem = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
                        if (uri != null && (winterFlowListenerVersionControl = (WinterFlowListenerVersionControl) winterFlowRendererNode.getValue()) != null && (WinterFlowRouterStructure = winterFlowListenerVersionControl.WinterFlowRouterStructure(uri.toString())) != null) {
                            winterFlowPackageStructure.WinterFlowVariableVersionControl(WinterFlowRouterStructure, WinterFlowOrchestrationSubsystem, linkedHashMap);
                            if (((Boolean) winterFlowPackageStructure.WinterFlowVariableVersionControl.getValue()).booleanValue()) {
                                winterFlowPackageStructure.WinterFlowTransactionManagerStrategy(uri, WinterFlowOrchestrationSubsystem, linkedHashMap);
                            }
                        }
                        if (WinterFlowUnitTestLibrary.WinterFlowSoftwareEngine(linkedHashMap, new WinterFlowSessionManagerInvoker(WinterFlowOrchestrationSubsystem, 1)).isEmpty()) {
                        }
                    }
                }
                WinterFlowLoaderValidator winterFlowLoaderValidator2 = new WinterFlowLoaderValidator((WinterFlowServerLayer) winterFlowListenerPlatform.WinterFlowHookDataSource, WinterFlowArrayNetwork, winterFlowPackageStructure.WinterFlowServerProtocol, WinterFlowHookDataSource, z);
                if (winterFlowLoaderValidator == null || winterFlowLoaderValidator2.compareTo(winterFlowLoaderValidator) > 0) {
                    winterFlowLoaderValidator = winterFlowLoaderValidator2;
                }
            }
        }
        return winterFlowLoaderValidator;
    }

    public final Map WinterFlowCacheManagerAgent() {
        return WinterFlowDataSourceUtility.WinterFlowSessionManagerInterface((LinkedHashMap) this.WinterFlowTransactionManagerStrategy.WinterFlowArrayNetwork);
    }

    public final Bundle WinterFlowRouterStructure(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.WinterFlowTransactionManagerStrategy.WinterFlowArrayNetwork;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle WinterFlowOrchestrationSubsystem = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getValue().getClass();
            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
            return null;
        }
        if (bundle != null) {
            WinterFlowOrchestrationSubsystem.putAll(bundle);
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                entry2.getValue().getClass();
                WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                return null;
            }
        }
        return WinterFlowOrchestrationSubsystem;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof WinterFlowServerLayer)) {
                WinterFlowListenerPlatform winterFlowListenerPlatform = this.WinterFlowTransactionManagerStrategy;
                ArrayList arrayList = (ArrayList) winterFlowListenerPlatform.WinterFlowCacheManagerAgent;
                WinterFlowServerLayer winterFlowServerLayer = (WinterFlowServerLayer) obj;
                WinterFlowRequestListener winterFlowRequestListener = winterFlowServerLayer.WinterFlowRouterRouter;
                WinterFlowListenerPlatform winterFlowListenerPlatform2 = winterFlowServerLayer.WinterFlowTransactionManagerStrategy;
                boolean equals = arrayList.equals((ArrayList) winterFlowListenerPlatform2.WinterFlowCacheManagerAgent);
                WinterFlowRequestListener winterFlowRequestListener2 = this.WinterFlowRouterRouter;
                if (winterFlowRequestListener2.WinterFlowArrayNetwork() == winterFlowRequestListener.WinterFlowArrayNetwork()) {
                    Iterator it = ((WinterFlowConfigurationFrontend) WinterFlowFrontendSubsystem.WinterFlowThreadListener(new WinterFlowIDEFrontend(winterFlowRequestListener2))).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowCloudStack.WinterFlowThreadListener(winterFlowRequestListener2, intValue), WinterFlowCloudStack.WinterFlowThreadListener(winterFlowRequestListener, intValue))) {
                        }
                    }
                    z = true;
                    if (WinterFlowCacheManagerAgent().size() == winterFlowServerLayer.WinterFlowCacheManagerAgent().size()) {
                        Set<Map.Entry> entrySet = WinterFlowCacheManagerAgent().entrySet();
                        entrySet.getClass();
                        for (Map.Entry entry : entrySet) {
                            if (winterFlowServerLayer.WinterFlowCacheManagerAgent().containsKey(entry.getKey()) && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowServerLayer.WinterFlowCacheManagerAgent().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                        z2 = true;
                        if (winterFlowListenerPlatform.WinterFlowRouterStructure == winterFlowListenerPlatform2.WinterFlowRouterStructure || !WinterFlowManagerRequest.WinterFlowThreadListener((String) winterFlowListenerPlatform.WinterFlowVariableVersionControl, (String) winterFlowListenerPlatform2.WinterFlowVariableVersionControl) || !equals || !z || !z2) {
                        }
                    }
                    z2 = false;
                    if (winterFlowListenerPlatform.WinterFlowRouterStructure == winterFlowListenerPlatform2.WinterFlowRouterStructure) {
                    }
                }
                z = false;
                if (WinterFlowCacheManagerAgent().size() == winterFlowServerLayer.WinterFlowCacheManagerAgent().size()) {
                }
                z2 = false;
                if (winterFlowListenerPlatform.WinterFlowRouterStructure == winterFlowListenerPlatform2.WinterFlowRouterStructure) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        WinterFlowListenerPlatform winterFlowListenerPlatform = this.WinterFlowTransactionManagerStrategy;
        int i = winterFlowListenerPlatform.WinterFlowRouterStructure * 31;
        String str = (String) winterFlowListenerPlatform.WinterFlowVariableVersionControl;
        int hashCode = i + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) winterFlowListenerPlatform.WinterFlowCacheManagerAgent;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            hashCode = (((WinterFlowPackageStructure) obj).WinterFlowRouterStructure.hashCode() + (hashCode * 31)) * 961;
        }
        WinterFlowRequestListener winterFlowRequestListener = this.WinterFlowRouterRouter;
        winterFlowRequestListener.getClass();
        if (winterFlowRequestListener.WinterFlowArrayNetwork() > 0) {
            winterFlowRequestListener.WinterFlowVariableVersionControl(0).getClass();
            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
            return 0;
        }
        for (String str2 : WinterFlowCacheManagerAgent().keySet()) {
            int hashCode2 = (str2.hashCode() + (hashCode * 31)) * 31;
            Object obj2 = WinterFlowCacheManagerAgent().get(str2);
            hashCode = (obj2 != null ? obj2.hashCode() : 0) + hashCode2;
        }
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("(0x");
        WinterFlowListenerPlatform winterFlowListenerPlatform = this.WinterFlowTransactionManagerStrategy;
        winterFlowListenerPlatform.getClass();
        sb.append(Integer.toHexString(winterFlowListenerPlatform.WinterFlowRouterStructure));
        sb.append(")");
        String str = (String) winterFlowListenerPlatform.WinterFlowVariableVersionControl;
        if (str != null && !WinterFlowFrameworkStrategy.WinterFlowArrayHelper(str)) {
            sb.append(" route=");
            sb.append((String) winterFlowListenerPlatform.WinterFlowVariableVersionControl);
        }
        return sb.toString();
    }
}
