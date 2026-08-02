package com.squareup.cash.profile.devicemanager.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DeviceViewModel {
    public final String appToken;
    public final boolean isThisDevice;
    public final LastActive lastActive;
    public final String location;
    public final String name;

    /* renamed from: type, reason: collision with root package name */
    public final DeviceType f1188type;

    public final class LastActive {
        public final String activeTime;
        public final boolean shouldHighlight;

        public LastActive(String str, boolean z) {
            str.getClass();
            this.activeTime = str;
            this.shouldHighlight = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LastActive)) {
                return false;
            }
            LastActive lastActive = (LastActive) obj;
            return Intrinsics.areEqual(this.activeTime, lastActive.activeTime) && this.shouldHighlight == lastActive.shouldHighlight;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.shouldHighlight) + (this.activeTime.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("LastActive(activeTime=", this.activeTime, ", shouldHighlight=", ")", this.shouldHighlight);
        }
    }

    public DeviceViewModel(String str, String str2, String str3, DeviceType deviceType, boolean z, LastActive lastActive) {
        str2.getClass();
        this.appToken = str;
        this.name = str2;
        this.location = str3;
        this.f1188type = deviceType;
        this.isThisDevice = z;
        this.lastActive = lastActive;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceViewModel)) {
            return false;
        }
        DeviceViewModel deviceViewModel = (DeviceViewModel) obj;
        return this.appToken.equals(deviceViewModel.appToken) && Intrinsics.areEqual(this.name, deviceViewModel.name) && this.location.equals(deviceViewModel.location) && this.f1188type == deviceViewModel.f1188type && this.isThisDevice == deviceViewModel.isThisDevice && this.lastActive.equals(deviceViewModel.lastActive);
    }

    public final int hashCode() {
        return this.lastActive.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.f1188type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.appToken.hashCode() * 31, 31, this.name), 31, this.location)) * 31, 31, this.isThisDevice);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeviceViewModel(appToken=", this.appToken, ", name=", this.name, ", location=");
        m.append(this.location);
        m.append(", type=");
        m.append(this.f1188type);
        m.append(", isThisDevice=");
        m.append(this.isThisDevice);
        m.append(", lastActive=");
        m.append(this.lastActive);
        m.append(")");
        return m.toString();
    }
}
