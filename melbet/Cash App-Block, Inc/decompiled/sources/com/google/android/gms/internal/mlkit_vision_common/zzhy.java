package com.google.android.gms.internal.mlkit_vision_common;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class zzhy {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewMerchantProfile.deepLinkSpecs;
    }

    public static final boolean isConnected(NetworkInfo networkInfo) {
        networkInfo.getClass();
        return networkInfo.connectivity != 1;
    }

    public static final ErrorEvent.Connectivity toErrorConnectivity(NetworkInfo networkInfo) {
        List list;
        networkInfo.getClass();
        boolean isConnected = isConnected(networkInfo);
        String str = networkInfo.carrierName;
        int i = isConnected ? 1 : 2;
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
            case 0:
                list = EmptyList.INSTANCE;
                break;
            case 1:
                list = CollectionsKt__CollectionsJVMKt.listOf(ErrorEvent.Interface.ETHERNET);
                break;
            case 2:
                list = CollectionsKt__CollectionsJVMKt.listOf(ErrorEvent.Interface.WIFI);
                break;
            case 3:
                list = CollectionsKt__CollectionsJVMKt.listOf(ErrorEvent.Interface.WIMAX);
                break;
            case 4:
                list = CollectionsKt__CollectionsJVMKt.listOf(ErrorEvent.Interface.BLUETOOTH);
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                list = CollectionsKt__CollectionsJVMKt.listOf(ErrorEvent.Interface.CELLULAR);
                break;
            case 11:
                list = CollectionsKt__CollectionsJVMKt.listOf(ErrorEvent.Interface.OTHER);
                break;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
        String str2 = networkInfo.cellularTechnology;
        return new ErrorEvent.Connectivity(i, list, 0, (str2 == null && str == null) ? null : new ErrorEvent.Cellular(str2, str));
    }

    public static final int toErrorSchemaType(DeviceType deviceType) {
        deviceType.getClass();
        switch (deviceType.ordinal()) {
            case 0:
                return 1;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 2;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
        }
    }

    public static final int toErrorSessionPrecondition(int i) {
        if (i == 0) {
            throw null;
        }
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
        }
    }

    public static final int toSchemaSource(int i) {
        if (i == 0) {
            throw null;
        }
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i)) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
        }
    }

    public static final ActionEvent.ActionEventActionType toSchemaType(RumActionType rumActionType) {
        rumActionType.getClass();
        int ordinal = rumActionType.ordinal();
        if (ordinal == 0) {
            return ActionEvent.ActionEventActionType.TAP;
        }
        if (ordinal == 1) {
            return ActionEvent.ActionEventActionType.SCROLL;
        }
        if (ordinal == 2) {
            return ActionEvent.ActionEventActionType.SWIPE;
        }
        if (ordinal == 3) {
            return ActionEvent.ActionEventActionType.CLICK;
        }
        if (ordinal == 4) {
            return ActionEvent.ActionEventActionType.BACK;
        }
        if (ordinal == 5) {
            return ActionEvent.ActionEventActionType.CUSTOM;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
