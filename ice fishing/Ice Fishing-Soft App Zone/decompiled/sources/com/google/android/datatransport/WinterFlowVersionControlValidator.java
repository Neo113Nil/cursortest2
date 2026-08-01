package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionControlValidator {
    public final ArrayList WinterFlowArrayNetwork;
    public final String WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;
    public final ArrayList WinterFlowVariableVersionControl;

    public WinterFlowVersionControlValidator(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = str2;
        this.WinterFlowCacheManagerAgent = str3;
        this.WinterFlowArrayNetwork = arrayList;
        this.WinterFlowVariableVersionControl = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowVersionControlValidator)) {
            return false;
        }
        WinterFlowVersionControlValidator winterFlowVersionControlValidator = (WinterFlowVersionControlValidator) obj;
        if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowVersionControlValidator.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowVersionControlValidator.WinterFlowHookDataSource) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowCacheManagerAgent, winterFlowVersionControlValidator.WinterFlowCacheManagerAgent) && this.WinterFlowArrayNetwork.equals(winterFlowVersionControlValidator.WinterFlowArrayNetwork)) {
            return this.WinterFlowVariableVersionControl.equals(winterFlowVersionControlValidator.WinterFlowVariableVersionControl);
        }
        return false;
    }

    public final int hashCode() {
        return this.WinterFlowVariableVersionControl.hashCode() + ((this.WinterFlowArrayNetwork.hashCode() + ((this.WinterFlowCacheManagerAgent.hashCode() + ((this.WinterFlowHookDataSource.hashCode() + (this.WinterFlowRouterStructure.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return WinterFlowEventUtility.WinterFlowRouterAdapter(WinterFlowEventUtility.WinterFlowSerializerStructure("\n            |ForeignKey {\n            |   referenceTable = '" + this.WinterFlowRouterStructure + "',\n            |   onDelete = '" + this.WinterFlowHookDataSource + "',\n            |   onUpdate = '" + this.WinterFlowCacheManagerAgent + "',\n            |   columnNames = {" + WinterFlowConfigurationException.WinterFlowUnitTestResponse(WinterFlowSerializerUtility.WinterFlowTestingTransactionManager(this.WinterFlowArrayNetwork)) + "\n            |   referenceColumnNames = {" + WinterFlowConfigurationException.WinterFlowTransactionManagerStrategy(WinterFlowSerializerUtility.WinterFlowTestingTransactionManager(this.WinterFlowVariableVersionControl)) + "\n            |}\n        "));
    }
}
