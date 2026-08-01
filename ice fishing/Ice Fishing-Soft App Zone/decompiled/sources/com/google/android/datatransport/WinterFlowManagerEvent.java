package com.google.android.datatransport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerEvent {
    public static final /* synthetic */ int WinterFlowRouterRouter = 0;
    public final String WinterFlowArrayNetwork;
    public final String WinterFlowCacheManagerAgent;
    public final int WinterFlowHookDataSource;
    public final String WinterFlowRouterStructure;
    public final long WinterFlowTransactionManagerStrategy;
    public final String WinterFlowUnitTestResponse;
    public final long WinterFlowVariableVersionControl;

    static {
        byte b = (byte) (((byte) (0 | 2)) | 1);
        if (b == 3) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        WinterFlowCompilerMechanism.WinterFlowRouterRouter(sb, "Missing required properties:");
    }

    public WinterFlowManagerEvent(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.WinterFlowRouterStructure = str;
        this.WinterFlowHookDataSource = i;
        this.WinterFlowCacheManagerAgent = str2;
        this.WinterFlowArrayNetwork = str3;
        this.WinterFlowVariableVersionControl = j;
        this.WinterFlowTransactionManagerStrategy = j2;
        this.WinterFlowUnitTestResponse = str4;
    }

    public final WinterFlowValidatorDatabaseSchema WinterFlowRouterStructure() {
        WinterFlowValidatorDatabaseSchema winterFlowValidatorDatabaseSchema = new WinterFlowValidatorDatabaseSchema();
        winterFlowValidatorDatabaseSchema.WinterFlowRouterStructure = this.WinterFlowRouterStructure;
        winterFlowValidatorDatabaseSchema.WinterFlowHookDataSource = this.WinterFlowHookDataSource;
        winterFlowValidatorDatabaseSchema.WinterFlowCacheManagerAgent = this.WinterFlowCacheManagerAgent;
        winterFlowValidatorDatabaseSchema.WinterFlowArrayNetwork = this.WinterFlowArrayNetwork;
        winterFlowValidatorDatabaseSchema.WinterFlowVariableVersionControl = this.WinterFlowVariableVersionControl;
        winterFlowValidatorDatabaseSchema.WinterFlowTransactionManagerStrategy = this.WinterFlowTransactionManagerStrategy;
        winterFlowValidatorDatabaseSchema.WinterFlowUnitTestResponse = this.WinterFlowUnitTestResponse;
        winterFlowValidatorDatabaseSchema.WinterFlowRouterRouter = (byte) 3;
        return winterFlowValidatorDatabaseSchema;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WinterFlowManagerEvent)) {
            return false;
        }
        WinterFlowManagerEvent winterFlowManagerEvent = (WinterFlowManagerEvent) obj;
        String str = winterFlowManagerEvent.WinterFlowRouterStructure;
        String str2 = this.WinterFlowRouterStructure;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!WinterFlowResolverBackend.WinterFlowRouterStructure(this.WinterFlowHookDataSource, winterFlowManagerEvent.WinterFlowHookDataSource)) {
            return false;
        }
        String str3 = winterFlowManagerEvent.WinterFlowCacheManagerAgent;
        String str4 = this.WinterFlowCacheManagerAgent;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = winterFlowManagerEvent.WinterFlowArrayNetwork;
        String str6 = this.WinterFlowArrayNetwork;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        if (this.WinterFlowVariableVersionControl != winterFlowManagerEvent.WinterFlowVariableVersionControl || this.WinterFlowTransactionManagerStrategy != winterFlowManagerEvent.WinterFlowTransactionManagerStrategy) {
            return false;
        }
        String str7 = winterFlowManagerEvent.WinterFlowUnitTestResponse;
        String str8 = this.WinterFlowUnitTestResponse;
        return str8 == null ? str7 == null : str8.equals(str7);
    }

    public final int hashCode() {
        String str = this.WinterFlowRouterStructure;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ WinterFlowResolverBackend.WinterFlowRouterAdapter(this.WinterFlowHookDataSource)) * 1000003;
        String str2 = this.WinterFlowCacheManagerAgent;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.WinterFlowArrayNetwork;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.WinterFlowVariableVersionControl;
        int i = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.WinterFlowTransactionManagerStrategy;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.WinterFlowUnitTestResponse;
        return i2 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.WinterFlowRouterStructure);
        sb.append(", registrationStatus=");
        int i = this.WinterFlowHookDataSource;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION");
        sb.append(", authToken=");
        sb.append(this.WinterFlowCacheManagerAgent);
        sb.append(", refreshToken=");
        sb.append(this.WinterFlowArrayNetwork);
        sb.append(", expiresInSecs=");
        sb.append(this.WinterFlowVariableVersionControl);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.WinterFlowTransactionManagerStrategy);
        sb.append(", fisError=");
        sb.append(this.WinterFlowUnitTestResponse);
        sb.append("}");
        return sb.toString();
    }
}
