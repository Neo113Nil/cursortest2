package com.google.android.datatransport;

import android.webkit.PermissionRequest;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionControlProcess {
    public final PermissionRequest WinterFlowRouterStructure;

    public WinterFlowVersionControlProcess(PermissionRequest permissionRequest) {
        this.WinterFlowRouterStructure = permissionRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WinterFlowVersionControlProcess) && WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowRouterStructure, ((WinterFlowVersionControlProcess) obj).WinterFlowRouterStructure);
    }

    public final int hashCode() {
        PermissionRequest permissionRequest = this.WinterFlowRouterStructure;
        if (permissionRequest == null) {
            return 0;
        }
        return permissionRequest.hashCode();
    }

    public final String toString() {
        return "PermissionRequestInfo(permissionRequest=" + this.WinterFlowRouterStructure + ")";
    }
}
