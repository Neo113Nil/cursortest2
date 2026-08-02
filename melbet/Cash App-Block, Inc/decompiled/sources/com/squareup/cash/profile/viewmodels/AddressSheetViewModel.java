package com.squareup.cash.profile.viewmodels;

import com.squareup.protos.common.location.GlobalAddress;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AddressSheetViewModel {
    public final GlobalAddress address;

    public AddressSheetViewModel(GlobalAddress globalAddress) {
        globalAddress.getClass();
        this.address = globalAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddressSheetViewModel) && Intrinsics.areEqual(this.address, ((AddressSheetViewModel) obj).address);
    }

    public final int hashCode() {
        return this.address.hashCode();
    }

    public final String toString() {
        return "AddressSheetViewModel(address=" + this.address + ")";
    }
}
