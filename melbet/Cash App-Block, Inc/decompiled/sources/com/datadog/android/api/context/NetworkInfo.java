package com.datadog.android.api.context;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class NetworkInfo {
    public final Long carrierId;
    public final String carrierName;
    public final String cellularTechnology;
    public final int connectivity;
    public final Long downKbps;
    public final Long strength;
    public final Long upKbps;

    public /* synthetic */ NetworkInfo(int i, String str, Long l, Long l2, Long l3, Long l4, String str2, int i2) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : l2, (i2 & 16) != 0 ? null : l3, (i2 & 32) != 0 ? null : l4, (i2 & 64) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkInfo)) {
            return false;
        }
        NetworkInfo networkInfo = (NetworkInfo) obj;
        return this.connectivity == networkInfo.connectivity && Intrinsics.areEqual(this.carrierName, networkInfo.carrierName) && Intrinsics.areEqual(this.carrierId, networkInfo.carrierId) && Intrinsics.areEqual(this.upKbps, networkInfo.upKbps) && Intrinsics.areEqual(this.downKbps, networkInfo.downKbps) && Intrinsics.areEqual(this.strength, networkInfo.strength) && Intrinsics.areEqual(this.cellularTechnology, networkInfo.cellularTechnology);
    }

    public final int hashCode() {
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.connectivity) * 31;
        String str = this.carrierName;
        int hashCode = (ordinal + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.carrierId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.upKbps;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.downKbps;
        int hashCode4 = (hashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.strength;
        int hashCode5 = (hashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.cellularTechnology;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("NetworkInfo(connectivity=");
        switch (this.connectivity) {
            case 1:
                str = "NETWORK_NOT_CONNECTED";
                break;
            case 2:
                str = "NETWORK_ETHERNET";
                break;
            case 3:
                str = "NETWORK_WIFI";
                break;
            case 4:
                str = "NETWORK_WIMAX";
                break;
            case 5:
                str = "NETWORK_BLUETOOTH";
                break;
            case 6:
                str = "NETWORK_2G";
                break;
            case 7:
                str = "NETWORK_3G";
                break;
            case 8:
                str = "NETWORK_4G";
                break;
            case 9:
                str = "NETWORK_5G";
                break;
            case 10:
                str = "NETWORK_MOBILE_OTHER";
                break;
            case 11:
                str = "NETWORK_CELLULAR";
                break;
            case 12:
                str = "NETWORK_OTHER";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", carrierName=");
        sb.append(this.carrierName);
        sb.append(", carrierId=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.carrierId, ", upKbps=", this.upKbps, ", downKbps=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.downKbps, ", strength=", this.strength, ", cellularTechnology=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.cellularTechnology, ")");
    }

    public NetworkInfo(int i, String str, Long l, Long l2, Long l3, Long l4, String str2) {
        if (i != 0) {
            this.connectivity = i;
            this.carrierName = str;
            this.carrierId = l;
            this.upKbps = l2;
            this.downKbps = l3;
            this.strength = l4;
            this.cellularTechnology = str2;
            return;
        }
        throw null;
    }
}
