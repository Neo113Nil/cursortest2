package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSoftwareXML {
    public final Object WinterFlowArrayNetwork;
    public final WinterFlowControllerScript WinterFlowCacheManagerAgent;
    public final WinterFlowProxyStructure WinterFlowHookDataSource;
    public final Object WinterFlowRouterStructure;
    public final Throwable WinterFlowVariableVersionControl;

    public /* synthetic */ WinterFlowSoftwareXML(Object obj, WinterFlowProxyStructure winterFlowProxyStructure, WinterFlowControllerScript winterFlowControllerScript, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : winterFlowProxyStructure, (i & 4) != 0 ? null : winterFlowControllerScript, (Object) null, (i & 16) != 0 ? null : th);
    }

    public static WinterFlowSoftwareXML WinterFlowRouterStructure(WinterFlowSoftwareXML winterFlowSoftwareXML, WinterFlowProxyStructure winterFlowProxyStructure, Throwable th, int i) {
        Object obj = winterFlowSoftwareXML.WinterFlowRouterStructure;
        if ((i & 2) != 0) {
            winterFlowProxyStructure = winterFlowSoftwareXML.WinterFlowHookDataSource;
        }
        WinterFlowProxyStructure winterFlowProxyStructure2 = winterFlowProxyStructure;
        WinterFlowControllerScript winterFlowControllerScript = winterFlowSoftwareXML.WinterFlowCacheManagerAgent;
        Object obj2 = winterFlowSoftwareXML.WinterFlowArrayNetwork;
        if ((i & 16) != 0) {
            th = winterFlowSoftwareXML.WinterFlowVariableVersionControl;
        }
        return new WinterFlowSoftwareXML(obj, winterFlowProxyStructure2, winterFlowControllerScript, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowSoftwareXML)) {
            return false;
        }
        WinterFlowSoftwareXML winterFlowSoftwareXML = (WinterFlowSoftwareXML) obj;
        return WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, winterFlowSoftwareXML.WinterFlowRouterStructure) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowHookDataSource, winterFlowSoftwareXML.WinterFlowHookDataSource) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowCacheManagerAgent, winterFlowSoftwareXML.WinterFlowCacheManagerAgent) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowArrayNetwork, winterFlowSoftwareXML.WinterFlowArrayNetwork) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowVariableVersionControl, winterFlowSoftwareXML.WinterFlowVariableVersionControl);
    }

    public final int hashCode() {
        Object obj = this.WinterFlowRouterStructure;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        WinterFlowProxyStructure winterFlowProxyStructure = this.WinterFlowHookDataSource;
        int hashCode2 = (hashCode + (winterFlowProxyStructure == null ? 0 : winterFlowProxyStructure.hashCode())) * 31;
        WinterFlowControllerScript winterFlowControllerScript = this.WinterFlowCacheManagerAgent;
        int hashCode3 = (hashCode2 + (winterFlowControllerScript == null ? 0 : winterFlowControllerScript.hashCode())) * 31;
        Object obj2 = this.WinterFlowArrayNetwork;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.WinterFlowVariableVersionControl;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.WinterFlowRouterStructure + ", cancelHandler=" + this.WinterFlowHookDataSource + ", onCancellation=" + this.WinterFlowCacheManagerAgent + ", idempotentResume=" + this.WinterFlowArrayNetwork + ", cancelCause=" + this.WinterFlowVariableVersionControl + ')';
    }

    public WinterFlowSoftwareXML(Object obj, WinterFlowProxyStructure winterFlowProxyStructure, WinterFlowControllerScript winterFlowControllerScript, Object obj2, Throwable th) {
        this.WinterFlowRouterStructure = obj;
        this.WinterFlowHookDataSource = winterFlowProxyStructure;
        this.WinterFlowCacheManagerAgent = winterFlowControllerScript;
        this.WinterFlowArrayNetwork = obj2;
        this.WinterFlowVariableVersionControl = th;
    }
}
