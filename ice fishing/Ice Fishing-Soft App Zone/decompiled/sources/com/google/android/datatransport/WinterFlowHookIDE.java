package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHookIDE {
    public final WinterFlowVersionControlMechanism WinterFlowArrayNetwork;
    public final String WinterFlowCacheManagerAgent;
    public final String WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;
    public final int WinterFlowVariableVersionControl;

    public WinterFlowHookIDE(String str, String str2, String str3, WinterFlowVersionControlMechanism winterFlowVersionControlMechanism, int i) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = str2;
        this.WinterFlowCacheManagerAgent = str3;
        this.WinterFlowArrayNetwork = winterFlowVersionControlMechanism;
        this.WinterFlowVariableVersionControl = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowHookIDE)) {
            return false;
        }
        WinterFlowHookIDE winterFlowHookIDE = (WinterFlowHookIDE) obj;
        String str = winterFlowHookIDE.WinterFlowRouterStructure;
        String str2 = this.WinterFlowRouterStructure;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = winterFlowHookIDE.WinterFlowHookDataSource;
        String str4 = this.WinterFlowHookDataSource;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = winterFlowHookIDE.WinterFlowCacheManagerAgent;
        String str6 = this.WinterFlowCacheManagerAgent;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        WinterFlowVersionControlMechanism winterFlowVersionControlMechanism = winterFlowHookIDE.WinterFlowArrayNetwork;
        WinterFlowVersionControlMechanism winterFlowVersionControlMechanism2 = this.WinterFlowArrayNetwork;
        if (winterFlowVersionControlMechanism2 == null) {
            if (winterFlowVersionControlMechanism != null) {
                return false;
            }
        } else if (!winterFlowVersionControlMechanism2.equals(winterFlowVersionControlMechanism)) {
            return false;
        }
        int i = winterFlowHookIDE.WinterFlowVariableVersionControl;
        int i2 = this.WinterFlowVariableVersionControl;
        return i2 == 0 ? i == 0 : WinterFlowResolverBackend.WinterFlowRouterStructure(i2, i);
    }

    public final int hashCode() {
        String str = this.WinterFlowRouterStructure;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.WinterFlowHookDataSource;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.WinterFlowCacheManagerAgent;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        WinterFlowVersionControlMechanism winterFlowVersionControlMechanism = this.WinterFlowArrayNetwork;
        int hashCode4 = (hashCode3 ^ (winterFlowVersionControlMechanism == null ? 0 : winterFlowVersionControlMechanism.hashCode())) * 1000003;
        int i = this.WinterFlowVariableVersionControl;
        return hashCode4 ^ (i != 0 ? WinterFlowResolverBackend.WinterFlowRouterAdapter(i) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", fid=");
        sb.append(this.WinterFlowHookDataSource);
        sb.append(", refreshToken=");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append(", authToken=");
        sb.append(this.WinterFlowArrayNetwork);
        sb.append(", responseCode=");
        int i = this.WinterFlowVariableVersionControl;
        sb.append(i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
