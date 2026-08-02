package com.squareup.cash.passkeys.viewmodels;

import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class PasskeyManagementViewEvent {

    public final class BackButtonTapped extends PasskeyManagementViewEvent {
        public static final BackButtonTapped INSTANCE = new BackButtonTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackButtonTapped);
        }

        public final int hashCode() {
            return -88496921;
        }

        public final String toString() {
            return "BackButtonTapped";
        }
    }

    public final class ConfirmRemovePasskey extends PasskeyManagementViewEvent {
        public final String passkeyId;

        public ConfirmRemovePasskey(String str) {
            str.getClass();
            this.passkeyId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfirmRemovePasskey) && Intrinsics.areEqual(this.passkeyId, ((ConfirmRemovePasskey) obj).passkeyId);
        }

        public final int hashCode() {
            return this.passkeyId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConfirmRemovePasskey(passkeyId=", this.passkeyId, ")");
        }
    }

    public final class CreatePasskeyTapped extends PasskeyManagementViewEvent {
        public static final CreatePasskeyTapped INSTANCE = new CreatePasskeyTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CreatePasskeyTapped);
        }

        public final int hashCode() {
            return -540662788;
        }

        public final String toString() {
            return "CreatePasskeyTapped";
        }
    }

    public final class DismissCreatePasskey extends PasskeyManagementViewEvent {
        public static final DismissCreatePasskey INSTANCE = new DismissCreatePasskey();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissCreatePasskey);
        }

        public final int hashCode() {
            return 2083689130;
        }

        public final String toString() {
            return "DismissCreatePasskey";
        }
    }

    public final class DismissRemovePasskey extends PasskeyManagementViewEvent {
        public static final DismissRemovePasskey INSTANCE = new DismissRemovePasskey();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissRemovePasskey);
        }

        public final int hashCode() {
            return 1032663586;
        }

        public final String toString() {
            return "DismissRemovePasskey";
        }
    }

    public final class ManageDevicesTapped extends PasskeyManagementViewEvent {
        public static final ManageDevicesTapped INSTANCE = new ManageDevicesTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ManageDevicesTapped);
        }

        public final int hashCode() {
            return 1702589218;
        }

        public final String toString() {
            return "ManageDevicesTapped";
        }
    }

    public final class RemovePasskeyTapped extends PasskeyManagementViewEvent {
        public final PasskeyManagementViewModel.PasskeyItemViewModel passkey;

        public RemovePasskeyTapped(PasskeyManagementViewModel.PasskeyItemViewModel passkeyItemViewModel) {
            passkeyItemViewModel.getClass();
            this.passkey = passkeyItemViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemovePasskeyTapped) && Intrinsics.areEqual(this.passkey, ((RemovePasskeyTapped) obj).passkey);
        }

        public final int hashCode() {
            return this.passkey.hashCode();
        }

        public final String toString() {
            return "RemovePasskeyTapped(passkey=" + this.passkey + ")";
        }
    }

    public final class RetryCreatePasskey extends PasskeyManagementViewEvent {
        public static final RetryCreatePasskey INSTANCE = new RetryCreatePasskey();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryCreatePasskey);
        }

        public final int hashCode() {
            return -1116267572;
        }

        public final String toString() {
            return "RetryCreatePasskey";
        }
    }

    public final class RetryLoadPasskeys extends PasskeyManagementViewEvent {
        public static final RetryLoadPasskeys INSTANCE = new RetryLoadPasskeys();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RetryLoadPasskeys);
        }

        public final int hashCode() {
            return 1309090193;
        }

        public final String toString() {
            return "RetryLoadPasskeys";
        }
    }

    public final class RetryRemovePasskey extends PasskeyManagementViewEvent {
        public final String passkeyId;

        public RetryRemovePasskey(String str) {
            str.getClass();
            this.passkeyId = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RetryRemovePasskey) && Intrinsics.areEqual(this.passkeyId, ((RetryRemovePasskey) obj).passkeyId);
        }

        public final int hashCode() {
            return this.passkeyId.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RetryRemovePasskey(passkeyId=", this.passkeyId, ")");
        }
    }
}
