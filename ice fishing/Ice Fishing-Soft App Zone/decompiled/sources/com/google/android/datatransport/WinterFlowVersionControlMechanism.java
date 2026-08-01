package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionControlMechanism {
    public final int WinterFlowCacheManagerAgent;
    public final long WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;

    public WinterFlowVersionControlMechanism(String str, long j, int i) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = j;
        this.WinterFlowCacheManagerAgent = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowVersionControlMechanism)) {
            return false;
        }
        WinterFlowVersionControlMechanism winterFlowVersionControlMechanism = (WinterFlowVersionControlMechanism) obj;
        String str = winterFlowVersionControlMechanism.WinterFlowRouterStructure;
        String str2 = this.WinterFlowRouterStructure;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.WinterFlowHookDataSource != winterFlowVersionControlMechanism.WinterFlowHookDataSource) {
            return false;
        }
        int i = winterFlowVersionControlMechanism.WinterFlowCacheManagerAgent;
        int i2 = this.WinterFlowCacheManagerAgent;
        return i2 == 0 ? i == 0 : WinterFlowResolverBackend.WinterFlowRouterStructure(i2, i);
    }

    public final int hashCode() {
        String str = this.WinterFlowRouterStructure;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.WinterFlowHookDataSource;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.WinterFlowCacheManagerAgent;
        return i ^ (i2 != 0 ? WinterFlowResolverBackend.WinterFlowRouterAdapter(i2) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.WinterFlowHookDataSource);
        sb.append(", responseCode=");
        int i = this.WinterFlowCacheManagerAgent;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
