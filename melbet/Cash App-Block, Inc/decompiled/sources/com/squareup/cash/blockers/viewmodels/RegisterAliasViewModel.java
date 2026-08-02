package com.squareup.cash.blockers.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.common.countries.Country;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class RegisterAliasViewModel {
    public final ColorModel accentColor;
    public final boolean canSwitchMode;
    public final Country customerCountry;
    public final String headline;
    public final boolean helpButtonVisible;
    public final String hint;
    public final boolean isError;
    public final boolean isLoading;
    public final LoadingDirection loadingDirection;
    public final Mode mode;
    public final String nextButtonLabel;
    public final String prefillCountryCode;
    public final boolean secondaryButtonVisible;
    public final boolean showCloseButton;
    public final boolean showUpdatedTerms;
    public final String terms;
    public final String title;
    public final boolean useSmsEditorV2;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LoadingDirection {
        public static final /* synthetic */ LoadingDirection[] $VALUES;
        public static final LoadingDirection BACKWARD;
        public static final LoadingDirection FORWARD;

        static {
            LoadingDirection loadingDirection = new LoadingDirection("BACKWARD", 0);
            BACKWARD = loadingDirection;
            LoadingDirection loadingDirection2 = new LoadingDirection("FORWARD", 1);
            FORWARD = loadingDirection2;
            $VALUES = new LoadingDirection[]{loadingDirection, loadingDirection2};
        }

        public static LoadingDirection valueOf(String str) {
            return (LoadingDirection) Enum.valueOf(LoadingDirection.class, str);
        }

        public static LoadingDirection[] values() {
            return (LoadingDirection[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Mode {
        public static final /* synthetic */ Mode[] $VALUES;
        public static final Mode EMAIL;
        public static final Mode SMS;

        static {
            Mode mode = new Mode("SMS", 0);
            SMS = mode;
            Mode mode2 = new Mode("EMAIL", 1);
            EMAIL = mode2;
            $VALUES = new Mode[]{mode, mode2};
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public RegisterAliasViewModel(String str, String str2, String str3, Mode mode, boolean z, String str4, boolean z2, LoadingDirection loadingDirection, boolean z3, String str5, String str6, ColorModel colorModel, boolean z4, boolean z5, boolean z6, Country country, boolean z7, boolean z8) {
        str2.getClass();
        str3.getClass();
        str6.getClass();
        country.getClass();
        this.headline = str;
        this.title = str2;
        this.hint = str3;
        this.mode = mode;
        this.canSwitchMode = z;
        this.prefillCountryCode = str4;
        this.isLoading = z2;
        this.loadingDirection = loadingDirection;
        this.isError = z3;
        this.terms = str5;
        this.nextButtonLabel = str6;
        this.accentColor = colorModel;
        this.helpButtonVisible = z4;
        this.secondaryButtonVisible = z5;
        this.useSmsEditorV2 = z6;
        this.customerCountry = country;
        this.showCloseButton = z7;
        this.showUpdatedTerms = z8;
    }

    public static RegisterAliasViewModel copy$default(RegisterAliasViewModel registerAliasViewModel, String str, String str2, Mode mode, boolean z, boolean z2, boolean z3, String str3, boolean z4, boolean z5, int i) {
        boolean z6;
        boolean z7;
        String str4 = registerAliasViewModel.headline;
        String str5 = (i & 2) != 0 ? registerAliasViewModel.title : str;
        String str6 = (i & 4) != 0 ? registerAliasViewModel.hint : str2;
        Mode mode2 = (i & 8) != 0 ? registerAliasViewModel.mode : mode;
        boolean z8 = (i & 16) != 0 ? registerAliasViewModel.canSwitchMode : z;
        registerAliasViewModel.getClass();
        registerAliasViewModel.getClass();
        String str7 = str5;
        String str8 = str6;
        Mode mode3 = mode2;
        boolean z9 = z8;
        String str9 = registerAliasViewModel.prefillCountryCode;
        boolean z10 = (i & 256) != 0 ? registerAliasViewModel.isLoading : z2;
        LoadingDirection loadingDirection = registerAliasViewModel.loadingDirection;
        boolean z11 = (i & 1024) != 0 ? registerAliasViewModel.isError : z3;
        String str10 = (i & 2048) != 0 ? registerAliasViewModel.terms : str3;
        String str11 = registerAliasViewModel.nextButtonLabel;
        boolean z12 = z10;
        boolean z13 = z11;
        String str12 = str10;
        ColorModel colorModel = registerAliasViewModel.accentColor;
        boolean z14 = registerAliasViewModel.helpButtonVisible;
        boolean z15 = (i & 32768) != 0 ? registerAliasViewModel.secondaryButtonVisible : z4;
        boolean z16 = registerAliasViewModel.useSmsEditorV2;
        Country country = registerAliasViewModel.customerCountry;
        boolean z17 = registerAliasViewModel.showCloseButton;
        if ((i & PKIFailureInfo.signerNotTrusted) != 0) {
            z6 = z17;
            z7 = registerAliasViewModel.showUpdatedTerms;
        } else {
            z6 = z17;
            z7 = z5;
        }
        registerAliasViewModel.getClass();
        str7.getClass();
        str8.getClass();
        mode3.getClass();
        loadingDirection.getClass();
        str11.getClass();
        country.getClass();
        return new RegisterAliasViewModel(str4, str7, str8, mode3, z9, str9, z12, loadingDirection, z13, str12, str11, colorModel, z14, z15, z16, country, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterAliasViewModel)) {
            return false;
        }
        RegisterAliasViewModel registerAliasViewModel = (RegisterAliasViewModel) obj;
        return Intrinsics.areEqual(this.headline, registerAliasViewModel.headline) && Intrinsics.areEqual(this.title, registerAliasViewModel.title) && Intrinsics.areEqual(this.hint, registerAliasViewModel.hint) && this.mode == registerAliasViewModel.mode && this.canSwitchMode == registerAliasViewModel.canSwitchMode && Intrinsics.areEqual(this.prefillCountryCode, registerAliasViewModel.prefillCountryCode) && this.isLoading == registerAliasViewModel.isLoading && this.loadingDirection == registerAliasViewModel.loadingDirection && this.isError == registerAliasViewModel.isError && Intrinsics.areEqual(this.terms, registerAliasViewModel.terms) && Intrinsics.areEqual(this.nextButtonLabel, registerAliasViewModel.nextButtonLabel) && Intrinsics.areEqual(this.accentColor, registerAliasViewModel.accentColor) && this.helpButtonVisible == registerAliasViewModel.helpButtonVisible && this.secondaryButtonVisible == registerAliasViewModel.secondaryButtonVisible && this.useSmsEditorV2 == registerAliasViewModel.useSmsEditorV2 && this.customerCountry == registerAliasViewModel.customerCountry && this.showCloseButton == registerAliasViewModel.showCloseButton && this.showUpdatedTerms == registerAliasViewModel.showUpdatedTerms;
    }

    public final int hashCode() {
        String str = this.headline;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.mode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.hint)) * 31, 29791, this.canSwitchMode);
        String str2 = this.prefillCountryCode;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.loadingDirection.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isLoading)) * 31, 31, this.isError);
        String str3 = this.terms;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.nextButtonLabel);
        ColorModel colorModel = this.accentColor;
        return Boolean.hashCode(this.showUpdatedTerms) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.customerCountry.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m3 + (colorModel != null ? colorModel.hashCode() : 0)) * 31, 31, this.helpButtonVisible), 31, this.secondaryButtonVisible), 31, this.useSmsEditorV2)) * 31, 31, this.showCloseButton);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RegisterAliasViewModel(headline=", this.headline, ", title=", this.title, ", hint=");
        m.append(this.hint);
        m.append(", mode=");
        m.append(this.mode);
        m.append(", canSwitchMode=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.canSwitchMode, ", detectedPhoneNumber=null, detectedEmailAddresses=null, prefillCountryCode=", this.prefillCountryCode, ", isLoading=");
        m.append(this.isLoading);
        m.append(", loadingDirection=");
        m.append(this.loadingDirection);
        m.append(", isError=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.isError, ", terms=", this.terms, ", nextButtonLabel=");
        m.append(this.nextButtonLabel);
        m.append(", accentColor=");
        m.append(this.accentColor);
        m.append(", helpButtonVisible=");
        re$$ExternalSyntheticOutline0.m(m, this.helpButtonVisible, ", secondaryButtonVisible=", this.secondaryButtonVisible, ", useSmsEditorV2=");
        m.append(this.useSmsEditorV2);
        m.append(", customerCountry=");
        m.append(this.customerCountry);
        m.append(", showCloseButton=");
        return Request$Priority$EnumUnboxingLocalUtility.m(m, this.showCloseButton, ", showUpdatedTerms=", this.showUpdatedTerms, ")");
    }

    public /* synthetic */ RegisterAliasViewModel(String str, String str2, String str3, Mode mode, boolean z, String str4, String str5, String str6, ColorModel colorModel, boolean z2, boolean z3, boolean z4, Country country, boolean z5, boolean z6) {
        this(str, str2, str3, mode, z, str4, false, LoadingDirection.FORWARD, false, str5, str6, colorModel, z2, z3, z4, country, z5, z6);
    }
}
