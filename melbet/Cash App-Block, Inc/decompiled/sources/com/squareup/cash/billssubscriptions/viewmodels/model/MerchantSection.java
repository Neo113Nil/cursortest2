package com.squareup.cash.billssubscriptions.viewmodels.model;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class MerchantSection {
    public final List merchants;
    public final String title;

    public MerchantSection(String str, List list) {
        list.getClass();
        this.title = str;
        this.merchants = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MerchantSection)) {
            return false;
        }
        MerchantSection merchantSection = (MerchantSection) obj;
        return this.title.equals(merchantSection.title) && Intrinsics.areEqual(this.merchants, merchantSection.merchants);
    }

    public final int hashCode() {
        return this.merchants.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("MerchantSection(title=", this.title, ", merchants=", ")", this.merchants);
    }
}
