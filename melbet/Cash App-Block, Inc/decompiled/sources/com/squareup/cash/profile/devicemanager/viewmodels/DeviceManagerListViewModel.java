package com.squareup.cash.profile.devicemanager.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerListViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DeviceManagerListViewModel {
    public final boolean isInProgress;
    public final List sections;
    public final String subtitle;
    public final String title;

    public final class DeviceAction {
        public final String title;

        public DeviceAction(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceAction) || !Intrinsics.areEqual(this.title, ((DeviceAction) obj).title)) {
                return false;
            }
            DeviceManagerListViewEvent.RequestRemoveAll requestRemoveAll = DeviceManagerListViewEvent.RequestRemoveAll.INSTANCE;
            return requestRemoveAll.equals(requestRemoveAll);
        }

        public final int hashCode() {
            return (this.title.hashCode() * 31) - 1632712245;
        }

        public final String toString() {
            return "DeviceAction(title=" + this.title + ", eventType=" + DeviceManagerListViewEvent.RequestRemoveAll.INSTANCE + ")";
        }
    }

    public final class DeviceListSection {
        public final DeviceAction action;
        public final ArrayList devices;
        public final String sectionHeader;

        public DeviceListSection(String str, ArrayList arrayList, DeviceAction deviceAction) {
            str.getClass();
            this.sectionHeader = str;
            this.devices = arrayList;
            this.action = deviceAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceListSection)) {
                return false;
            }
            DeviceListSection deviceListSection = (DeviceListSection) obj;
            return Intrinsics.areEqual(this.sectionHeader, deviceListSection.sectionHeader) && this.devices.equals(deviceListSection.devices) && Intrinsics.areEqual(this.action, deviceListSection.action);
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.devices, this.sectionHeader.hashCode() * 31, 31);
            DeviceAction deviceAction = this.action;
            return m + (deviceAction == null ? 0 : deviceAction.hashCode());
        }

        public final String toString() {
            StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.devices, "DeviceListSection(sectionHeader=", this.sectionHeader, ", devices=", ", action=");
            m.append(this.action);
            m.append(")");
            return m.toString();
        }
    }

    public DeviceManagerListViewModel(String str, String str2, List list, boolean z) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
        this.title = str;
        this.subtitle = str2;
        this.sections = list;
        this.isInProgress = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceManagerListViewModel)) {
            return false;
        }
        DeviceManagerListViewModel deviceManagerListViewModel = (DeviceManagerListViewModel) obj;
        return Intrinsics.areEqual(this.title, deviceManagerListViewModel.title) && Intrinsics.areEqual(this.subtitle, deviceManagerListViewModel.subtitle) && Intrinsics.areEqual(this.sections, deviceManagerListViewModel.sections) && this.isInProgress == deviceManagerListViewModel.isInProgress;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isInProgress) + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.sections);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeviceManagerListViewModel(title=", this.title, ", subtitle=", this.subtitle, ", sections=");
        m.append(this.sections);
        m.append(", isInProgress=");
        m.append(this.isInProgress);
        m.append(")");
        return m.toString();
    }
}
