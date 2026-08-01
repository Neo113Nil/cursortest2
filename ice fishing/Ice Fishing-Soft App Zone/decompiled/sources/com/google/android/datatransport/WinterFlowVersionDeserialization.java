package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowVersionDeserialization extends WinterFlowDataSourceWorker {
    public final byte[] WinterFlowArrayNetwork;
    public final long WinterFlowCacheManagerAgent;
    public final Integer WinterFlowHookDataSource;
    public final long WinterFlowRouterStructure;
    public final long WinterFlowTransactionManagerStrategy;
    public final WinterFlowJavaHook WinterFlowUnitTestResponse;
    public final String WinterFlowVariableVersionControl;

    public WinterFlowVersionDeserialization(long j, Integer num, long j2, byte[] bArr, String str, long j3, WinterFlowJavaHook winterFlowJavaHook) {
        this.WinterFlowRouterStructure = j;
        this.WinterFlowHookDataSource = num;
        this.WinterFlowCacheManagerAgent = j2;
        this.WinterFlowArrayNetwork = bArr;
        this.WinterFlowVariableVersionControl = str;
        this.WinterFlowTransactionManagerStrategy = j3;
        this.WinterFlowUnitTestResponse = winterFlowJavaHook;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof WinterFlowDataSourceWorker) {
            WinterFlowDataSourceWorker winterFlowDataSourceWorker = (WinterFlowDataSourceWorker) obj;
            WinterFlowVersionDeserialization winterFlowVersionDeserialization = (WinterFlowVersionDeserialization) winterFlowDataSourceWorker;
            if (this.WinterFlowRouterStructure == winterFlowVersionDeserialization.WinterFlowRouterStructure) {
                Integer num = winterFlowVersionDeserialization.WinterFlowHookDataSource;
                Integer num2 = this.WinterFlowHookDataSource;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.WinterFlowCacheManagerAgent == winterFlowVersionDeserialization.WinterFlowCacheManagerAgent) {
                        if (Arrays.equals(this.WinterFlowArrayNetwork, winterFlowDataSourceWorker instanceof WinterFlowVersionDeserialization ? ((WinterFlowVersionDeserialization) winterFlowDataSourceWorker).WinterFlowArrayNetwork : winterFlowVersionDeserialization.WinterFlowArrayNetwork)) {
                            String str = winterFlowVersionDeserialization.WinterFlowVariableVersionControl;
                            String str2 = this.WinterFlowVariableVersionControl;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (this.WinterFlowTransactionManagerStrategy == winterFlowVersionDeserialization.WinterFlowTransactionManagerStrategy) {
                                    WinterFlowJavaHook winterFlowJavaHook = winterFlowVersionDeserialization.WinterFlowUnitTestResponse;
                                    WinterFlowJavaHook winterFlowJavaHook2 = this.WinterFlowUnitTestResponse;
                                    if (winterFlowJavaHook2 != null ? winterFlowJavaHook2.equals(winterFlowJavaHook) : winterFlowJavaHook == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.WinterFlowRouterStructure;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.WinterFlowHookDataSource;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.WinterFlowCacheManagerAgent;
        int hashCode2 = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.WinterFlowArrayNetwork)) * 1000003;
        String str = this.WinterFlowVariableVersionControl;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.WinterFlowTransactionManagerStrategy;
        int i2 = (hashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        WinterFlowJavaHook winterFlowJavaHook = this.WinterFlowUnitTestResponse;
        return i2 ^ (winterFlowJavaHook != null ? winterFlowJavaHook.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.WinterFlowRouterStructure + ", eventCode=" + this.WinterFlowHookDataSource + ", eventUptimeMs=" + this.WinterFlowCacheManagerAgent + ", sourceExtension=" + Arrays.toString(this.WinterFlowArrayNetwork) + ", sourceExtensionJsonProto3=" + this.WinterFlowVariableVersionControl + ", timezoneOffsetSeconds=" + this.WinterFlowTransactionManagerStrategy + ", networkConnectionInfo=" + this.WinterFlowUnitTestResponse + "}";
    }
}
