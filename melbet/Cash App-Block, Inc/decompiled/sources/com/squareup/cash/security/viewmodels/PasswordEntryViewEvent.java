package com.squareup.cash.security.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.security.screens.PasswordDialogScreen;
import com.squareup.protos.franklin.api.BlockerAction;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface PasswordEntryViewEvent {

    public final class ActionButtonClick implements PasswordEntryViewEvent {
        public final PasswordSubmitData passwordSubmitData;
        public final boolean savePasswordWithBiometrics;

        public final class PasswordSubmitData {
            public final String password;
            public final String passwordToken;

            public PasswordSubmitData(String str, String str2, int i) {
                str = (i & 1) != 0 ? null : str;
                str2 = (i & 2) != 0 ? null : str2;
                this.passwordToken = str;
                this.password = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PasswordSubmitData)) {
                    return false;
                }
                PasswordSubmitData passwordSubmitData = (PasswordSubmitData) obj;
                return Intrinsics.areEqual(this.passwordToken, passwordSubmitData.passwordToken) && Intrinsics.areEqual(this.password, passwordSubmitData.password);
            }

            public final int hashCode() {
                String str = this.passwordToken;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.password;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("PasswordSubmitData(passwordToken=", this.passwordToken, ", password=", this.password, ")");
            }
        }

        public ActionButtonClick(boolean z, PasswordSubmitData passwordSubmitData) {
            this.savePasswordWithBiometrics = z;
            this.passwordSubmitData = passwordSubmitData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionButtonClick)) {
                return false;
            }
            ActionButtonClick actionButtonClick = (ActionButtonClick) obj;
            return this.savePasswordWithBiometrics == actionButtonClick.savePasswordWithBiometrics && this.passwordSubmitData.equals(actionButtonClick.passwordSubmitData);
        }

        public final int hashCode() {
            return this.passwordSubmitData.hashCode() + (Boolean.hashCode(this.savePasswordWithBiometrics) * 31);
        }

        public final String toString() {
            return "ActionButtonClick(savePasswordWithBiometrics=" + this.savePasswordWithBiometrics + ", passwordSubmitData=" + this.passwordSubmitData + ")";
        }
    }

    public final class BiometricsCheckboxToggle implements PasswordEntryViewEvent {
        public final boolean isChecked;

        public BiometricsCheckboxToggle(boolean z) {
            this.isChecked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BiometricsCheckboxToggle) && this.isChecked == ((BiometricsCheckboxToggle) obj).isChecked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isChecked);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("BiometricsCheckboxToggle(isChecked=", ")", this.isChecked);
        }
    }

    public final class CloseScreen implements PasswordEntryViewEvent {
        public static final CloseScreen INSTANCE = new CloseScreen();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -2076355465;
        }

        public final String toString() {
            return "CloseScreen";
        }
    }

    public final class DialogClickEvent implements PasswordEntryViewEvent {
        public final PasswordDialogScreen.PasswordDialog.Button button;

        public DialogClickEvent(PasswordDialogScreen.PasswordDialog.Button button) {
            button.getClass();
            this.button = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DialogClickEvent) && Intrinsics.areEqual(this.button, ((DialogClickEvent) obj).button);
        }

        public final int hashCode() {
            return this.button.hashCode();
        }

        public final String toString() {
            return "DialogClickEvent(button=" + this.button + ")";
        }
    }

    public final class ForgotPasswordClick implements PasswordEntryViewEvent {
        public static final ForgotPasswordClick INSTANCE = new ForgotPasswordClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ForgotPasswordClick);
        }

        public final int hashCode() {
            return -711540163;
        }

        public final String toString() {
            return "ForgotPasswordClick";
        }
    }

    public final class HelpMenuClick implements PasswordEntryViewEvent {
        public static final HelpMenuClick INSTANCE = new HelpMenuClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpMenuClick);
        }

        public final int hashCode() {
            return -235593637;
        }

        public final String toString() {
            return "HelpMenuClick";
        }
    }

    public final class HelpMenuItemClick implements PasswordEntryViewEvent {
        public final BlockerAction blockerAction;

        public HelpMenuItemClick(BlockerAction blockerAction) {
            blockerAction.getClass();
            this.blockerAction = blockerAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelpMenuItemClick) && Intrinsics.areEqual(this.blockerAction, ((HelpMenuItemClick) obj).blockerAction);
        }

        public final int hashCode() {
            return this.blockerAction.hashCode();
        }

        public final String toString() {
            return Matcher$$ExternalSyntheticOutline0.m("HelpMenuItemClick(blockerAction=", this.blockerAction, ")");
        }
    }

    public final class PasswordTextVisibilityClick implements PasswordEntryViewEvent {
        public final boolean visible;

        public PasswordTextVisibilityClick(boolean z) {
            this.visible = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PasswordTextVisibilityClick) && this.visible == ((PasswordTextVisibilityClick) obj).visible;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.visible);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("PasswordTextVisibilityClick(visible=", ")", this.visible);
        }
    }

    public final class UseBiometrics implements PasswordEntryViewEvent {
        public static final UseBiometrics INSTANCE = new UseBiometrics();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UseBiometrics);
        }

        public final int hashCode() {
            return 2074714837;
        }

        public final String toString() {
            return "UseBiometrics";
        }
    }
}
