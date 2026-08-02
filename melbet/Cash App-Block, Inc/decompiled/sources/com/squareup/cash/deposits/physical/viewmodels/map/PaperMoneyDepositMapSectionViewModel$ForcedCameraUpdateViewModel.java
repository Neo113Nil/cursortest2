package com.squareup.cash.deposits.physical.viewmodels.map;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.android.gms.common.api.internal.TaskUtil;

/* loaded from: classes6.dex */
public abstract class PaperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel extends TaskUtil {

    public abstract class CenterOnSelectedLocationViewModel extends PaperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel {
    }

    public final class LocationUpdateViewModel extends PaperMoneyDepositMapSectionViewModel$ForcedCameraUpdateViewModel {
        public static final LocationUpdateViewModel DEFAULT_LOCATION_VIEW_MODEL = new LocationUpdateViewModel();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LocationUpdateViewModel) && Double.compare(39.8097343d, 39.8097343d) == 0 && Double.compare(-98.5556199d, -98.5556199d) == 0 && Float.compare(3.5f, 3.5f) == 0;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + CameraState$Type$EnumUnboxingLocalUtility.m(3.5f, Fragment$5$$ExternalSyntheticOutline0.m(-98.5556199d, Fragment$5$$ExternalSyntheticOutline0.m(39.8097343d, Boolean.hashCode(false) * 31, 31), 31), 31);
        }

        public final String toString() {
            return "LocationUpdateViewModel(locationPermissionEnabled=false, lat=39.8097343, lng=-98.5556199, zoom=3.5, animated=false)";
        }
    }
}
