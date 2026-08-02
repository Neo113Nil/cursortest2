package com.squareup.cash.profile.devicemanager.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DeviceRemovalFailedViewModel {
    public final String description;
    public final String title;

    public DeviceRemovalFailedViewModel(String str, String str2) {
        str2.getClass();
        this.title = str;
        this.description = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceRemovalFailedViewModel)) {
            return false;
        }
        DeviceRemovalFailedViewModel deviceRemovalFailedViewModel = (DeviceRemovalFailedViewModel) obj;
        return this.title.equals(deviceRemovalFailedViewModel.title) && Intrinsics.areEqual(this.description, deviceRemovalFailedViewModel.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("DeviceRemovalFailedViewModel(title=", this.title, ", description=", this.description, ")");
    }
}
