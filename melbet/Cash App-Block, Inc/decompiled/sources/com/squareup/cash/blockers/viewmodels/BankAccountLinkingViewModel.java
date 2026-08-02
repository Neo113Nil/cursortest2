package com.squareup.cash.blockers.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.versioned.Versioned;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class BankAccountLinkingViewModel {
    public final BottomButton bottomButton;
    public final Versioned errorMessage;
    public final String hint;
    public final String inputMask;
    public final boolean loading;
    public final int maxDigits;
    public final int minDigits;
    public final Mode mode;
    public final String prefill;
    public final String subTitle;
    public final String title;
    public final Versioned valid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BottomButton {
        public static final /* synthetic */ BottomButton[] $VALUES;
        public static final BottomButton HELP;
        public static final BottomButton NONE;
        public static final BottomButton SKIP;

        static {
            BottomButton bottomButton = new BottomButton("NONE", 0);
            NONE = bottomButton;
            BottomButton bottomButton2 = new BottomButton("HELP", 1);
            HELP = bottomButton2;
            BottomButton bottomButton3 = new BottomButton("SKIP", 2);
            SKIP = bottomButton3;
            $VALUES = new BottomButton[]{bottomButton, bottomButton2, bottomButton3};
        }

        public static BottomButton valueOf(String str) {
            return (BottomButton) Enum.valueOf(BottomButton.class, str);
        }

        public static BottomButton[] values() {
            return (BottomButton[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Mode {
        public static final /* synthetic */ Mode[] $VALUES;
        public static final Mode ACCOUNT;
        public static final Mode BSB;
        public static final Mode INSTITUTION;
        public static final Mode ROUTING;
        public static final Mode SORT_CODE;
        public static final Mode TRANSIT;
        public static final Mode VERIFY_ACCOUNT;

        static {
            Mode mode = new Mode("ROUTING", 0);
            ROUTING = mode;
            Mode mode2 = new Mode("TRANSIT", 1);
            TRANSIT = mode2;
            Mode mode3 = new Mode("INSTITUTION", 2);
            INSTITUTION = mode3;
            Mode mode4 = new Mode("BSB", 3);
            BSB = mode4;
            Mode mode5 = new Mode("SORT_CODE", 4);
            SORT_CODE = mode5;
            Mode mode6 = new Mode("ACCOUNT", 5);
            ACCOUNT = mode6;
            Mode mode7 = new Mode("VERIFY_ACCOUNT", 6);
            VERIFY_ACCOUNT = mode7;
            $VALUES = new Mode[]{mode, mode2, mode3, mode4, mode5, mode6, mode7};
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public BankAccountLinkingViewModel(Mode mode, String str, String str2, String str3, int i, int i2, String str4, String str5, Versioned versioned, boolean z, Versioned versioned2, BottomButton bottomButton) {
        mode.getClass();
        this.mode = mode;
        this.title = str;
        this.subTitle = str2;
        this.hint = str3;
        this.minDigits = i;
        this.maxDigits = i2;
        this.inputMask = str4;
        this.prefill = str5;
        this.errorMessage = versioned;
        this.loading = z;
        this.valid = versioned2;
        this.bottomButton = bottomButton;
    }

    public static BankAccountLinkingViewModel copy$default(BankAccountLinkingViewModel bankAccountLinkingViewModel, Mode mode, String str, String str2, String str3, int i, int i2, String str4, String str5, Versioned versioned, boolean z, Versioned versioned2, int i3) {
        if ((i3 & 1) != 0) {
            mode = bankAccountLinkingViewModel.mode;
        }
        Mode mode2 = mode;
        if ((i3 & 2) != 0) {
            str = bankAccountLinkingViewModel.title;
        }
        String str6 = str;
        String str7 = (i3 & 4) != 0 ? bankAccountLinkingViewModel.subTitle : str2;
        String str8 = (i3 & 8) != 0 ? bankAccountLinkingViewModel.hint : str3;
        int i4 = (i3 & 16) != 0 ? bankAccountLinkingViewModel.minDigits : i;
        int i5 = (i3 & 32) != 0 ? bankAccountLinkingViewModel.maxDigits : i2;
        String str9 = (i3 & 64) != 0 ? bankAccountLinkingViewModel.inputMask : str4;
        bankAccountLinkingViewModel.getClass();
        String str10 = (i3 & 256) != 0 ? bankAccountLinkingViewModel.prefill : str5;
        Versioned versioned3 = (i3 & 512) != 0 ? bankAccountLinkingViewModel.errorMessage : versioned;
        boolean z2 = (i3 & 1024) != 0 ? bankAccountLinkingViewModel.loading : z;
        Versioned versioned4 = (i3 & 2048) != 0 ? bankAccountLinkingViewModel.valid : versioned2;
        BottomButton bottomButton = bankAccountLinkingViewModel.bottomButton;
        bankAccountLinkingViewModel.getClass();
        mode2.getClass();
        return new BankAccountLinkingViewModel(mode2, str6, str7, str8, i4, i5, str9, str10, versioned3, z2, versioned4, bottomButton);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankAccountLinkingViewModel)) {
            return false;
        }
        BankAccountLinkingViewModel bankAccountLinkingViewModel = (BankAccountLinkingViewModel) obj;
        return this.mode == bankAccountLinkingViewModel.mode && Intrinsics.areEqual(this.title, bankAccountLinkingViewModel.title) && Intrinsics.areEqual(this.subTitle, bankAccountLinkingViewModel.subTitle) && Intrinsics.areEqual(this.hint, bankAccountLinkingViewModel.hint) && this.minDigits == bankAccountLinkingViewModel.minDigits && this.maxDigits == bankAccountLinkingViewModel.maxDigits && Intrinsics.areEqual(this.inputMask, bankAccountLinkingViewModel.inputMask) && Intrinsics.areEqual(this.prefill, bankAccountLinkingViewModel.prefill) && this.errorMessage.equals(bankAccountLinkingViewModel.errorMessage) && this.loading == bankAccountLinkingViewModel.loading && this.valid.equals(bankAccountLinkingViewModel.valid) && this.bottomButton == bankAccountLinkingViewModel.bottomButton;
    }

    public final int hashCode() {
        int hashCode = this.mode.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subTitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hint;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxDigits, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minDigits, (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        String str4 = this.inputMask;
        int hashCode4 = (Character.hashCode('X') + ((m + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.prefill;
        return this.bottomButton.hashCode() + ((this.valid.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.errorMessage.hashCode() + ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31)) * 31, 31, this.loading)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BankAccountLinkingViewModel(mode=");
        sb.append(this.mode);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subTitle=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.subTitle, ", hint=", this.hint, ", minDigits=");
        Recorder$$ExternalSyntheticOutline1.m105m(this.minDigits, this.maxDigits, ", maxDigits=", ", inputMask=", sb);
        Boxes$$ExternalSyntheticOutline1.m(sb, this.inputMask, ", inputMaskChar=X, prefill=", this.prefill, ", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(", loading=");
        sb.append(this.loading);
        sb.append(", valid=");
        sb.append(this.valid);
        sb.append(", bottomButton=");
        sb.append(this.bottomButton);
        sb.append(")");
        return sb.toString();
    }
}
