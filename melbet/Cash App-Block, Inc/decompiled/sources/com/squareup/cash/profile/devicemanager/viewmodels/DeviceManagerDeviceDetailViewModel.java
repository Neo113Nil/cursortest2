package com.squareup.cash.profile.devicemanager.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class DeviceManagerDeviceDetailViewModel {

    /* loaded from: classes6.dex */
    public final class Loaded extends DeviceManagerDeviceDetailViewModel {
        public final DeviceType deviceType;
        public final String deviceTypeName;
        public final boolean isThisDevice;
        public final String lastActiveTime;
        public final String locationDescription;
        public final String locationUrl;
        public final String name;
        public final boolean showRemoveButton;
        public final String verification;

        public Loaded(String str, DeviceType deviceType, String str2, boolean z, String str3, String str4, String str5, String str6, boolean z2) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str4);
            this.name = str;
            this.deviceType = deviceType;
            this.deviceTypeName = str2;
            this.isThisDevice = z;
            this.lastActiveTime = str3;
            this.locationDescription = str4;
            this.locationUrl = str5;
            this.verification = str6;
            this.showRemoveButton = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.name, loaded.name) && this.deviceType == loaded.deviceType && Intrinsics.areEqual(this.deviceTypeName, loaded.deviceTypeName) && this.isThisDevice == loaded.isThisDevice && this.lastActiveTime.equals(loaded.lastActiveTime) && Intrinsics.areEqual(this.locationDescription, loaded.locationDescription) && Intrinsics.areEqual(this.locationUrl, loaded.locationUrl) && Intrinsics.areEqual(this.verification, loaded.verification) && this.showRemoveButton == loaded.showRemoveButton;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.deviceType.hashCode() + (this.name.hashCode() * 31)) * 31, 31, this.deviceTypeName), 31, this.isThisDevice), 31, this.lastActiveTime), 31, this.locationDescription);
            String str = this.locationUrl;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.verification;
            return Boolean.hashCode(this.showRemoveButton) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(name=");
            sb.append(this.name);
            sb.append(", deviceType=");
            sb.append(this.deviceType);
            sb.append(", deviceTypeName=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.deviceTypeName, ", isThisDevice=", this.isThisDevice, ", lastActiveTime=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.lastActiveTime, ", locationDescription=", this.locationDescription, ", locationUrl=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.locationUrl, ", verification=", this.verification, ", showRemoveButton=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showRemoveButton, ")");
        }
    }

    /* loaded from: classes6.dex */
    public final class Loading extends DeviceManagerDeviceDetailViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1511212923;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* loaded from: classes6.dex */
    public final class NotFound extends DeviceManagerDeviceDetailViewModel {
        public static final NotFound INSTANCE = new NotFound();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotFound);
        }

        public final int hashCode() {
            return 104127046;
        }

        public final String toString() {
            return "NotFound";
        }
    }
}
