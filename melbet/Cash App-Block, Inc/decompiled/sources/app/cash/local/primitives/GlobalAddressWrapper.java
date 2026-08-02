package app.cash.local.primitives;

import com.squareup.protos.common.location.GlobalAddress;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class GlobalAddressWrapper {
    public final GlobalAddress globalAddress;
    public final String placeId;

    public GlobalAddressWrapper(GlobalAddress globalAddress, String str) {
        globalAddress.getClass();
        this.globalAddress = globalAddress;
        this.placeId = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalAddressWrapper)) {
            return false;
        }
        GlobalAddressWrapper globalAddressWrapper = (GlobalAddressWrapper) obj;
        return Intrinsics.areEqual(this.globalAddress, globalAddressWrapper.globalAddress) && Intrinsics.areEqual(this.placeId, globalAddressWrapper.placeId);
    }

    public final int hashCode() {
        int hashCode = this.globalAddress.hashCode() * 31;
        String str = this.placeId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "GlobalAddressWrapper(globalAddress=" + this.globalAddress + ", placeId=" + this.placeId + ")";
    }
}
