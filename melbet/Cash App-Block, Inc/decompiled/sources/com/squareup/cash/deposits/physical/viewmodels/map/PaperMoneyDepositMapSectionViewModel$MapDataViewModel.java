package com.squareup.cash.deposits.physical.viewmodels.map;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.google.android.gms.common.api.internal.TaskUtil;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PaperMoneyDepositMapSectionViewModel$MapDataViewModel extends TaskUtil {
    public final List retailerLocations;

    public PaperMoneyDepositMapSectionViewModel$MapDataViewModel(List list) {
        list.getClass();
        this.retailerLocations = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaperMoneyDepositMapSectionViewModel$MapDataViewModel) && Intrinsics.areEqual(this.retailerLocations, ((PaperMoneyDepositMapSectionViewModel$MapDataViewModel) obj).retailerLocations);
    }

    public final int hashCode() {
        return this.retailerLocations.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("MapDataViewModel(retailerLocations=", ")", this.retailerLocations);
    }
}
