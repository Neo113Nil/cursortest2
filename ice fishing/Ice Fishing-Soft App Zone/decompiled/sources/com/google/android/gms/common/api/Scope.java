package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.datatransport.WinterFlowAdapterAPI;
import com.google.android.datatransport.WinterFlowStackFramework;
import com.google.android.datatransport.WinterFlowUnitTestLibrary;
import com.google.android.datatransport.WinterFlowWorkerVersionControl;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class Scope extends WinterFlowAdapterAPI implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new WinterFlowStackFramework(23);
    public final String WinterFlowTransactionManagerStrategy;
    public final int WinterFlowVariableVersionControl;

    public Scope(String str, int i) {
        WinterFlowUnitTestLibrary.WinterFlowOrchestrationSubsystem(str, "scopeUri must not be null or empty");
        this.WinterFlowVariableVersionControl = i;
        this.WinterFlowTransactionManagerStrategy = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.WinterFlowTransactionManagerStrategy.equals(((Scope) obj).WinterFlowTransactionManagerStrategy);
    }

    public final int hashCode() {
        return this.WinterFlowTransactionManagerStrategy.hashCode();
    }

    public final String toString() {
        return this.WinterFlowTransactionManagerStrategy;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int WinterFlowConsumerUserManager = WinterFlowWorkerVersionControl.WinterFlowConsumerUserManager(parcel, 20293);
        WinterFlowWorkerVersionControl.WinterFlowResolverController(parcel, 1, 4);
        parcel.writeInt(this.WinterFlowVariableVersionControl);
        WinterFlowWorkerVersionControl.WinterFlowRouterAdapter(parcel, 2, this.WinterFlowTransactionManagerStrategy);
        WinterFlowWorkerVersionControl.WinterFlowBackendCacheManager(parcel, WinterFlowConsumerUserManager);
    }
}
