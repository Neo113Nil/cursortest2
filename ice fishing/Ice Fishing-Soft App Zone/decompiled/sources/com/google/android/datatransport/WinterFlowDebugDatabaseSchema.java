package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDebugDatabaseSchema extends WinterFlowAdapterAPI {
    public static final Parcelable.Creator<WinterFlowDebugDatabaseSchema> CREATOR = new WinterFlowStackFramework(20);
    public final boolean WinterFlowRouterRouter;
    public final int WinterFlowTransactionManagerStrategy;
    public final long WinterFlowUnitTestResponse;
    public final String WinterFlowVariableVersionControl;

    public WinterFlowDebugDatabaseSchema(String str, int i, long j, boolean z) {
        this.WinterFlowVariableVersionControl = str;
        this.WinterFlowTransactionManagerStrategy = i;
        this.WinterFlowUnitTestResponse = j;
        this.WinterFlowRouterRouter = z;
    }

    public final long WinterFlowRouterStructure() {
        long j = this.WinterFlowUnitTestResponse;
        return j == -1 ? this.WinterFlowTransactionManagerStrategy : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WinterFlowDebugDatabaseSchema) {
            WinterFlowDebugDatabaseSchema winterFlowDebugDatabaseSchema = (WinterFlowDebugDatabaseSchema) obj;
            if (WinterFlowHandlerWebsocket.WinterFlowVariableBandwidth(this.WinterFlowVariableVersionControl, winterFlowDebugDatabaseSchema.WinterFlowVariableVersionControl) && WinterFlowRouterStructure() == winterFlowDebugDatabaseSchema.WinterFlowRouterStructure() && this.WinterFlowRouterRouter == winterFlowDebugDatabaseSchema.WinterFlowRouterRouter) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.WinterFlowVariableVersionControl, Long.valueOf(WinterFlowRouterStructure()), Boolean.valueOf(this.WinterFlowRouterRouter)});
    }

    public final String toString() {
        WinterFlowAlgorithmArray winterFlowAlgorithmArray = new WinterFlowAlgorithmArray(this);
        winterFlowAlgorithmArray.WinterFlowSyntax(this.WinterFlowVariableVersionControl, "name");
        winterFlowAlgorithmArray.WinterFlowSyntax(Long.valueOf(WinterFlowRouterStructure()), "version");
        winterFlowAlgorithmArray.WinterFlowSyntax(Boolean.valueOf(this.WinterFlowRouterRouter), "is_fully_rolled_out");
        return winterFlowAlgorithmArray.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 1, this.WinterFlowVariableVersionControl);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 2, 4);
        parcel.writeInt(this.WinterFlowTransactionManagerStrategy);
        long WinterFlowRouterStructure = WinterFlowRouterStructure();
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 3, 8);
        parcel.writeLong(WinterFlowRouterStructure);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 4, 4);
        parcel.writeInt(this.WinterFlowRouterRouter ? 1 : 0);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }

    public WinterFlowDebugDatabaseSchema(String str) {
        this(str, -1, 1L, false);
    }
}
