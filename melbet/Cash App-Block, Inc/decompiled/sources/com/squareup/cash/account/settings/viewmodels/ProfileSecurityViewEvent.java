package com.squareup.cash.account.settings.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ProfileSecurityViewEvent {

    public final class ManageSecurityLock implements ProfileSecurityViewEvent {
        public static final ManageSecurityLock INSTANCE = new ManageSecurityLock();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ManageSecurityLock);
        }

        public final int hashCode() {
            return 422735979;
        }

        public final String toString() {
            return "ManageSecurityLock";
        }
    }

    public final class ManageTaxesPassword implements ProfileSecurityViewEvent {
        public static final ManageTaxesPassword INSTANCE = new ManageTaxesPassword();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ManageTaxesPassword);
        }

        public final int hashCode() {
            return 1226874740;
        }

        public final String toString() {
            return "ManageTaxesPassword";
        }
    }

    public final class NavBack implements ProfileSecurityViewEvent {
        public static final NavBack INSTANCE = new NavBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NavBack);
        }

        public final int hashCode() {
            return 945591727;
        }

        public final String toString() {
            return "NavBack";
        }
    }

    public final class PasscodeEventWrapper implements ProfileSecurityViewEvent {
        public final ProfilePasscodeSectionViewEvent event;

        public PasscodeEventWrapper(ProfilePasscodeSectionViewEvent profilePasscodeSectionViewEvent) {
            profilePasscodeSectionViewEvent.getClass();
            this.event = profilePasscodeSectionViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PasscodeEventWrapper) && Intrinsics.areEqual(this.event, ((PasscodeEventWrapper) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "PasscodeEventWrapper(event=" + this.event + ")";
        }
    }

    public final class ToggleAuthenticator implements ProfileSecurityViewEvent {
        public final boolean checked;

        public ToggleAuthenticator(boolean z) {
            this.checked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleAuthenticator) && this.checked == ((ToggleAuthenticator) obj).checked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.checked);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("ToggleAuthenticator(checked=", ")", this.checked);
        }
    }

    public final class TrustedContactViewEventWrapper implements ProfileSecurityViewEvent {
        public final TrustedContactSettingViewEvent event;

        public TrustedContactViewEventWrapper(TrustedContactSettingViewEvent trustedContactSettingViewEvent) {
            trustedContactSettingViewEvent.getClass();
            this.event = trustedContactSettingViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TrustedContactViewEventWrapper) && Intrinsics.areEqual(this.event, ((TrustedContactViewEventWrapper) obj).event);
        }

        public final int hashCode() {
            return this.event.hashCode();
        }

        public final String toString() {
            return "TrustedContactViewEventWrapper(event=" + this.event + ")";
        }
    }
}
