package com.google.android.datatransport;

import java.util.ArrayList;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowProcessorJava extends WinterFlowSingletonMechanism {
    public final Integer WinterFlowArrayNetwork;
    public final WinterFlowMiddleware WinterFlowCacheManagerAgent;
    public final long WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;
    public final ArrayList WinterFlowTransactionManagerStrategy;
    public final String WinterFlowVariableVersionControl;

    public WinterFlowProcessorJava(long j, long j2, WinterFlowMiddleware winterFlowMiddleware, Integer num, String str, ArrayList arrayList) {
        WinterFlowDeserializationSubsystem winterFlowDeserializationSubsystem = WinterFlowDeserializationSubsystem.WinterFlowVariableVersionControl;
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = j2;
        this.WinterFlowCacheManagerAgent = winterFlowMiddleware;
        this.WinterFlowArrayNetwork = num;
        this.WinterFlowVariableVersionControl = str;
        this.WinterFlowTransactionManagerStrategy = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowSingletonMechanism)) {
            return false;
        }
        WinterFlowProcessorJava winterFlowProcessorJava = (WinterFlowProcessorJava) ((WinterFlowSingletonMechanism) obj);
        if (this.WinterFlowRouterStructure != winterFlowProcessorJava.WinterFlowRouterStructure || this.WinterFlowHookDataSource != winterFlowProcessorJava.WinterFlowHookDataSource || !this.WinterFlowCacheManagerAgent.equals(winterFlowProcessorJava.WinterFlowCacheManagerAgent)) {
            return false;
        }
        Integer num = winterFlowProcessorJava.WinterFlowArrayNetwork;
        Integer num2 = this.WinterFlowArrayNetwork;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = winterFlowProcessorJava.WinterFlowVariableVersionControl;
        String str2 = this.WinterFlowVariableVersionControl;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.WinterFlowTransactionManagerStrategy.equals(winterFlowProcessorJava.WinterFlowTransactionManagerStrategy)) {
            return false;
        }
        Object obj2 = WinterFlowDeserializationSubsystem.WinterFlowVariableVersionControl;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.WinterFlowRouterStructure;
        long j2 = this.WinterFlowHookDataSource;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.WinterFlowCacheManagerAgent.hashCode()) * 1000003;
        Integer num = this.WinterFlowArrayNetwork;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.WinterFlowVariableVersionControl;
        return ((this.WinterFlowTransactionManagerStrategy.hashCode() ^ ((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ WinterFlowDeserializationSubsystem.WinterFlowVariableVersionControl.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.WinterFlowRouterStructure + ", requestUptimeMs=" + this.WinterFlowHookDataSource + ", clientInfo=" + this.WinterFlowCacheManagerAgent + ", logSource=" + this.WinterFlowArrayNetwork + ", logSourceName=" + this.WinterFlowVariableVersionControl + ", logEvents=" + this.WinterFlowTransactionManagerStrategy + ", qosTier=" + WinterFlowDeserializationSubsystem.WinterFlowVariableVersionControl + "}";
    }
}
