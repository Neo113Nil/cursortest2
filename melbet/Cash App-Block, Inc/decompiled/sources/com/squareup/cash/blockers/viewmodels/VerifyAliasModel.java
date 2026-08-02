package com.squareup.cash.blockers.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class VerifyAliasModel {
    public final boolean clearInput;
    public final String headline;
    public final boolean isLoading;
    public final NavigationButton navigationButton;
    public final ResendCodeButtonState resendCodeButtonState;
    public final String title;
    public final String verificationCode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class NavigationButton {
        public static final /* synthetic */ NavigationButton[] $VALUES;
        public static final NavigationButton BACK;
        public static final NavigationButton CLOSE;
        public static final NavigationButton NONE;

        static {
            NavigationButton navigationButton = new NavigationButton("NONE", 0);
            NONE = navigationButton;
            NavigationButton navigationButton2 = new NavigationButton("BACK", 1);
            BACK = navigationButton2;
            NavigationButton navigationButton3 = new NavigationButton("CLOSE", 2);
            CLOSE = navigationButton3;
            $VALUES = new NavigationButton[]{navigationButton, navigationButton2, navigationButton3};
        }

        public static NavigationButton valueOf(String str) {
            return (NavigationButton) Enum.valueOf(NavigationButton.class, str);
        }

        public static NavigationButton[] values() {
            return (NavigationButton[]) $VALUES.clone();
        }
    }

    public interface ResendCodeButtonState {

        /* loaded from: classes7.dex */
        public final class Disabled implements ResendCodeButtonState {
            public final int remainingSecondsToEnable;

            public Disabled(int i) {
                this.remainingSecondsToEnable = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Disabled) && this.remainingSecondsToEnable == ((Disabled) obj).remainingSecondsToEnable;
            }

            public final int hashCode() {
                return Integer.hashCode(this.remainingSecondsToEnable);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.remainingSecondsToEnable, "Disabled(remainingSecondsToEnable=", ")");
            }
        }

        public final class Enabled implements ResendCodeButtonState {
            public static final Enabled INSTANCE = new Enabled();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Enabled);
            }

            public final int hashCode() {
                return -249469334;
            }

            public final String toString() {
                return "Enabled";
            }
        }
    }

    public VerifyAliasModel(String str, String str2, boolean z, boolean z2, String str3, NavigationButton navigationButton, ResendCodeButtonState resendCodeButtonState) {
        str2.getClass();
        this.headline = str;
        this.title = str2;
        this.isLoading = z;
        this.clearInput = z2;
        this.verificationCode = str3;
        this.navigationButton = navigationButton;
        this.resendCodeButtonState = resendCodeButtonState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyAliasModel)) {
            return false;
        }
        VerifyAliasModel verifyAliasModel = (VerifyAliasModel) obj;
        return Intrinsics.areEqual(this.headline, verifyAliasModel.headline) && Intrinsics.areEqual(this.title, verifyAliasModel.title) && this.isLoading == verifyAliasModel.isLoading && this.clearInput == verifyAliasModel.clearInput && this.verificationCode.equals(verifyAliasModel.verificationCode) && this.navigationButton == verifyAliasModel.navigationButton && this.resendCodeButtonState.equals(verifyAliasModel.resendCodeButtonState);
    }

    public final int hashCode() {
        String str = this.headline;
        return this.resendCodeButtonState.hashCode() + ((this.navigationButton.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.isLoading), 31, this.clearInput), 31, this.verificationCode)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("VerifyAliasModel(headline=", this.headline, ", title=", this.title, ", isLoading=");
        re$$ExternalSyntheticOutline0.m(m, this.isLoading, ", clearInput=", this.clearInput, ", verificationCode=");
        m.append(this.verificationCode);
        m.append(", navigationButton=");
        m.append(this.navigationButton);
        m.append(", resendCodeButtonState=");
        m.append(this.resendCodeButtonState);
        m.append(")");
        return m.toString();
    }
}
