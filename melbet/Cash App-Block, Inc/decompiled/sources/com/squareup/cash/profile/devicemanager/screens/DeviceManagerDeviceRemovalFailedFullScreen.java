package com.squareup.cash.profile.devicemanager.screens;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedScreen;
import com.squareup.cash.profile.screens.OpenSourceScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class DeviceManagerDeviceRemovalFailedFullScreen implements DeviceManagerDeviceRemovalFailedScreen {
    public static final Parcelable.Creator<DeviceManagerDeviceRemovalFailedFullScreen> CREATOR = new OpenSourceScreen.Creator(1);
    public final int devicesAttemptedToRemove;
    public final DeviceManagerDeviceRemovalFailedScreen.ErrorReason errorReason;
    public final List failedTokens;
    public final boolean isRemoveAll;
    public final int removeAttemptCount;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ DeviceManagerDeviceRemovalFailedFullScreen(java.util.List r7, int r8, com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedScreen.ErrorReason r9, int r10, int r11) {
        /*
            r6 = this;
            r0 = r11 & 4
            if (r0 == 0) goto L5
            r9 = 0
        L5:
            r3 = r9
            r9 = r11 & 8
            r0 = 0
            if (r9 == 0) goto Ld
            r4 = r0
            goto Lf
        Ld:
            r9 = 1
            r4 = r9
        Lf:
            r9 = r11 & 16
            if (r9 == 0) goto L18
            r5 = r0
            r1 = r7
            r2 = r8
            r0 = r6
            goto L1c
        L18:
            r5 = r10
            r0 = r6
            r1 = r7
            r2 = r8
        L1c:
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedFullScreen.<init>(java.util.List, int, com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedScreen$ErrorReason, int, int):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceManagerDeviceRemovalFailedFullScreen)) {
            return false;
        }
        DeviceManagerDeviceRemovalFailedFullScreen deviceManagerDeviceRemovalFailedFullScreen = (DeviceManagerDeviceRemovalFailedFullScreen) obj;
        return Intrinsics.areEqual(this.failedTokens, deviceManagerDeviceRemovalFailedFullScreen.failedTokens) && this.removeAttemptCount == deviceManagerDeviceRemovalFailedFullScreen.removeAttemptCount && this.errorReason == deviceManagerDeviceRemovalFailedFullScreen.errorReason && this.isRemoveAll == deviceManagerDeviceRemovalFailedFullScreen.isRemoveAll && this.devicesAttemptedToRemove == deviceManagerDeviceRemovalFailedFullScreen.devicesAttemptedToRemove;
    }

    @Override // com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedScreen
    public final int getDevicesAttemptedToRemove() {
        return this.devicesAttemptedToRemove;
    }

    @Override // com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedScreen
    public final DeviceManagerDeviceRemovalFailedScreen.ErrorReason getErrorReason() {
        return this.errorReason;
    }

    @Override // com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedScreen
    public final List getFailedTokens() {
        return this.failedTokens;
    }

    @Override // com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedScreen
    public final int getRemoveAttemptCount() {
        return this.removeAttemptCount;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.removeAttemptCount, this.failedTokens.hashCode() * 31, 31);
        DeviceManagerDeviceRemovalFailedScreen.ErrorReason errorReason = this.errorReason;
        return Integer.hashCode(this.devicesAttemptedToRemove) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (errorReason == null ? 0 : errorReason.hashCode())) * 31, 31, this.isRemoveAll);
    }

    @Override // com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedScreen
    public final boolean isRemoveAll() {
        return this.isRemoveAll;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceManagerDeviceRemovalFailedFullScreen(failedTokens=");
        sb.append(this.failedTokens);
        sb.append(", removeAttemptCount=");
        sb.append(this.removeAttemptCount);
        sb.append(", errorReason=");
        sb.append(this.errorReason);
        sb.append(", isRemoveAll=");
        sb.append(this.isRemoveAll);
        sb.append(", devicesAttemptedToRemove=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.devicesAttemptedToRemove, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeStringList(this.failedTokens);
        parcel.writeInt(this.removeAttemptCount);
        DeviceManagerDeviceRemovalFailedScreen.ErrorReason errorReason = this.errorReason;
        if (errorReason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(errorReason.name());
        }
        parcel.writeInt(this.isRemoveAll ? 1 : 0);
        parcel.writeInt(this.devicesAttemptedToRemove);
    }

    public DeviceManagerDeviceRemovalFailedFullScreen(List list, int i, DeviceManagerDeviceRemovalFailedScreen.ErrorReason errorReason, boolean z, int i2) {
        list.getClass();
        this.failedTokens = list;
        this.removeAttemptCount = i;
        this.errorReason = errorReason;
        this.isRemoveAll = z;
        this.devicesAttemptedToRemove = i2;
    }
}
