package com.squareup.cash.profile.devicemanager.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DeviceManagerRemovedSuccessViewModel {
    public final String message;
    public final SecurityOption securityOption;

    public final class SecurityOption {
        public final String actionName;
        public final String description;
        public final String title;

        public SecurityOption(String str, String str2, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.title = str;
            this.description = str2;
            this.actionName = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SecurityOption)) {
                return false;
            }
            SecurityOption securityOption = (SecurityOption) obj;
            return Intrinsics.areEqual(this.title, securityOption.title) && Intrinsics.areEqual(this.description, securityOption.description) && Intrinsics.areEqual(this.actionName, securityOption.actionName);
        }

        public final int hashCode() {
            return this.actionName.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SecurityOption(title=", this.title, ", description=", this.description, ", actionName="), this.actionName, ")");
        }
    }

    public DeviceManagerRemovedSuccessViewModel(String str, SecurityOption securityOption) {
        this.message = str;
        this.securityOption = securityOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceManagerRemovedSuccessViewModel)) {
            return false;
        }
        DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel = (DeviceManagerRemovedSuccessViewModel) obj;
        return this.message.equals(deviceManagerRemovedSuccessViewModel.message) && this.securityOption.equals(deviceManagerRemovedSuccessViewModel.securityOption);
    }

    public final int hashCode() {
        return this.securityOption.hashCode() + (this.message.hashCode() * 31);
    }

    public final String toString() {
        return "DeviceManagerRemovedSuccessViewModel(message=" + this.message + ", securityOption=" + this.securityOption + ")";
    }
}
