package com.google.android.datatransport;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectFrontend {
    public final long WinterFlowArrayNetwork;
    public final WinterFlowBatchSubsystem WinterFlowCacheManagerAgent;
    public final Integer WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;
    public final Map WinterFlowTransactionManagerStrategy;
    public final long WinterFlowVariableVersionControl;

    public WinterFlowObjectFrontend(String str, Integer num, WinterFlowBatchSubsystem winterFlowBatchSubsystem, long j, long j2, HashMap hashMap) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = num;
        this.WinterFlowCacheManagerAgent = winterFlowBatchSubsystem;
        this.WinterFlowArrayNetwork = j;
        this.WinterFlowVariableVersionControl = j2;
        this.WinterFlowTransactionManagerStrategy = hashMap;
    }

    public final WinterFlowSchedulerParser WinterFlowCacheManagerAgent() {
        WinterFlowSchedulerParser winterFlowSchedulerParser = new WinterFlowSchedulerParser();
        String str = this.WinterFlowRouterStructure;
        if (str == null) {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null transportName");
            return null;
        }
        winterFlowSchedulerParser.WinterFlowRouterStructure = str;
        winterFlowSchedulerParser.WinterFlowHookDataSource = this.WinterFlowHookDataSource;
        WinterFlowBatchSubsystem winterFlowBatchSubsystem = this.WinterFlowCacheManagerAgent;
        if (winterFlowBatchSubsystem == null) {
            WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("Null encodedPayload");
            return null;
        }
        winterFlowSchedulerParser.WinterFlowCacheManagerAgent = winterFlowBatchSubsystem;
        winterFlowSchedulerParser.WinterFlowArrayNetwork = Long.valueOf(this.WinterFlowArrayNetwork);
        winterFlowSchedulerParser.WinterFlowVariableVersionControl = Long.valueOf(this.WinterFlowVariableVersionControl);
        winterFlowSchedulerParser.WinterFlowTransactionManagerStrategy = new HashMap(this.WinterFlowTransactionManagerStrategy);
        return winterFlowSchedulerParser;
    }

    public final int WinterFlowHookDataSource(String str) {
        String str2 = (String) this.WinterFlowTransactionManagerStrategy.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final String WinterFlowRouterStructure(String str) {
        String str2 = (String) this.WinterFlowTransactionManagerStrategy.get(str);
        return str2 == null ? "" : str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WinterFlowObjectFrontend) {
            WinterFlowObjectFrontend winterFlowObjectFrontend = (WinterFlowObjectFrontend) obj;
            if (this.WinterFlowRouterStructure.equals(winterFlowObjectFrontend.WinterFlowRouterStructure)) {
                Integer num = winterFlowObjectFrontend.WinterFlowHookDataSource;
                Integer num2 = this.WinterFlowHookDataSource;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.WinterFlowCacheManagerAgent.equals(winterFlowObjectFrontend.WinterFlowCacheManagerAgent) && this.WinterFlowArrayNetwork == winterFlowObjectFrontend.WinterFlowArrayNetwork && this.WinterFlowVariableVersionControl == winterFlowObjectFrontend.WinterFlowVariableVersionControl && this.WinterFlowTransactionManagerStrategy.equals(winterFlowObjectFrontend.WinterFlowTransactionManagerStrategy)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.WinterFlowRouterStructure.hashCode() ^ 1000003) * 1000003;
        Integer num = this.WinterFlowHookDataSource;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.WinterFlowCacheManagerAgent.hashCode()) * 1000003;
        long j = this.WinterFlowArrayNetwork;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.WinterFlowVariableVersionControl;
        return this.WinterFlowTransactionManagerStrategy.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.WinterFlowRouterStructure + ", code=" + this.WinterFlowHookDataSource + ", encodedPayload=" + this.WinterFlowCacheManagerAgent + ", eventMillis=" + this.WinterFlowArrayNetwork + ", uptimeMillis=" + this.WinterFlowVariableVersionControl + ", autoMetadata=" + this.WinterFlowTransactionManagerStrategy + "}";
    }
}
