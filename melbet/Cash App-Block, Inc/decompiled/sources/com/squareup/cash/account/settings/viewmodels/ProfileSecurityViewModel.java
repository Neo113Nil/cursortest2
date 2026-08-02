package com.squareup.cash.account.settings.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.TrustedContactSettingViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface ProfileSecurityViewModel {

    /* loaded from: classes7.dex */
    public final class Loading implements ProfileSecurityViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1442523088;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* loaded from: classes7.dex */
    public final class Ready implements ProfileSecurityViewModel {
        public final ProfileSecurityReadyViewModel$AuthenticatorViewModel authenticatorViewModel;
        public final CashPinViewModel cashPinViewModel;
        public final ProfilePasscodeSectionViewModel passcodeSectionViewModel;
        public final ProfileSecurityReadyViewModel$PasswordViewModel passwordViewModel;
        public final Anchor scrollAnchor;
        public final TrustedContactSettingViewModel trustedContactViewModel;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Anchor {
            public static final /* synthetic */ Anchor[] $VALUES;
            public static final Anchor CASHTAG;
            public static final Anchor INVESTING;
            public static final Anchor REQUESTS;
            public static final Anchor SECURITY;
            public static final Anchor TAXES;

            static {
                Anchor anchor = new Anchor("SECURITY", 0);
                SECURITY = anchor;
                Anchor anchor2 = new Anchor("CASHTAG", 1);
                CASHTAG = anchor2;
                Anchor anchor3 = new Anchor("REQUESTS", 2);
                REQUESTS = anchor3;
                Anchor anchor4 = new Anchor("INVESTING", 3);
                INVESTING = anchor4;
                Anchor anchor5 = new Anchor("TAXES", 4);
                TAXES = anchor5;
                $VALUES = new Anchor[]{anchor, anchor2, anchor3, anchor4, anchor5};
            }

            public static Anchor valueOf(String str) {
                return (Anchor) Enum.valueOf(Anchor.class, str);
            }

            public static Anchor[] values() {
                return (Anchor[]) $VALUES.clone();
            }
        }

        public final class CashPinViewModel {
            public final boolean hasPin;

            public CashPinViewModel(boolean z) {
                this.hasPin = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CashPinViewModel) && this.hasPin == ((CashPinViewModel) obj).hasPin;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.hasPin);
            }

            public final String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("CashPinViewModel(hasPin=", ")", this.hasPin);
            }
        }

        public Ready(ProfileSecurityReadyViewModel$PasswordViewModel profileSecurityReadyViewModel$PasswordViewModel, ProfileSecurityReadyViewModel$AuthenticatorViewModel profileSecurityReadyViewModel$AuthenticatorViewModel, TrustedContactSettingViewModel trustedContactSettingViewModel, ProfilePasscodeSectionViewModel profilePasscodeSectionViewModel, Anchor anchor, CashPinViewModel cashPinViewModel) {
            this.passwordViewModel = profileSecurityReadyViewModel$PasswordViewModel;
            this.authenticatorViewModel = profileSecurityReadyViewModel$AuthenticatorViewModel;
            this.trustedContactViewModel = trustedContactSettingViewModel;
            this.passcodeSectionViewModel = profilePasscodeSectionViewModel;
            this.scrollAnchor = anchor;
            this.cashPinViewModel = cashPinViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return this.passwordViewModel.equals(ready.passwordViewModel) && this.authenticatorViewModel.equals(ready.authenticatorViewModel) && Intrinsics.areEqual(this.trustedContactViewModel, ready.trustedContactViewModel) && Intrinsics.areEqual(this.passcodeSectionViewModel, ready.passcodeSectionViewModel) && this.scrollAnchor == ready.scrollAnchor && Intrinsics.areEqual(this.cashPinViewModel, ready.cashPinViewModel);
        }

        public final int hashCode() {
            int hashCode = (this.authenticatorViewModel.hashCode() + (this.passwordViewModel.hashCode() * 31)) * 31;
            TrustedContactSettingViewModel trustedContactSettingViewModel = this.trustedContactViewModel;
            int hashCode2 = (hashCode + (trustedContactSettingViewModel == null ? 0 : trustedContactSettingViewModel.hashCode())) * 31;
            ProfilePasscodeSectionViewModel profilePasscodeSectionViewModel = this.passcodeSectionViewModel;
            int hashCode3 = (hashCode2 + (profilePasscodeSectionViewModel == null ? 0 : profilePasscodeSectionViewModel.hashCode())) * 31;
            Anchor anchor = this.scrollAnchor;
            int hashCode4 = (hashCode3 + (anchor == null ? 0 : anchor.hashCode())) * 31;
            CashPinViewModel cashPinViewModel = this.cashPinViewModel;
            return hashCode4 + (cashPinViewModel != null ? Boolean.hashCode(cashPinViewModel.hasPin) : 0);
        }

        public final String toString() {
            return "Ready(passwordViewModel=" + this.passwordViewModel + ", authenticatorViewModel=" + this.authenticatorViewModel + ", trustedContactViewModel=" + this.trustedContactViewModel + ", passcodeSectionViewModel=" + this.passcodeSectionViewModel + ", scrollAnchor=" + this.scrollAnchor + ", cashPinViewModel=" + this.cashPinViewModel + ")";
        }
    }
}
