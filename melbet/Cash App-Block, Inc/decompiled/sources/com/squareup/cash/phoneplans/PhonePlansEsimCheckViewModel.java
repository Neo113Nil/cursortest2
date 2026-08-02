package com.squareup.cash.phoneplans;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PhonePlansEsimCheckViewModel {
    public final String body;
    public final Cta helpCta;
    public final Cta primaryCta;
    public final Cta secondaryCta;
    public final StatusAvatar statusAvatar;
    public final String title;
    public final ToolbarButton toolbarButton;

    public final class Cta {
        public final String action;
        public final String label;

        public Cta(String str, String str2) {
            str.getClass();
            this.label = str;
            this.action = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.areEqual(this.label, cta.label) && this.action.equals(cta.action);
        }

        public final int hashCode() {
            return this.action.hashCode() + (this.label.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Cta(label=", this.label, ", action=", this.action, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class StatusAvatar {
        public static final /* synthetic */ StatusAvatar[] $VALUES;
        public static final StatusAvatar Failure;
        public static final StatusAvatar Loading;
        public static final StatusAvatar Success;

        static {
            StatusAvatar statusAvatar = new StatusAvatar("Loading", 0);
            Loading = statusAvatar;
            StatusAvatar statusAvatar2 = new StatusAvatar("Success", 1);
            Success = statusAvatar2;
            StatusAvatar statusAvatar3 = new StatusAvatar("Failure", 2);
            Failure = statusAvatar3;
            $VALUES = new StatusAvatar[]{statusAvatar, statusAvatar2, statusAvatar3};
        }

        public static StatusAvatar valueOf(String str) {
            return (StatusAvatar) Enum.valueOf(StatusAvatar.class, str);
        }

        public static StatusAvatar[] values() {
            return (StatusAvatar[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class ToolbarButton {
        public static final /* synthetic */ ToolbarButton[] $VALUES;
        public static final ToolbarButton Back;
        public static final ToolbarButton Close;
        public static final ToolbarButton None;

        static {
            ToolbarButton toolbarButton = new ToolbarButton("None", 0);
            None = toolbarButton;
            ToolbarButton toolbarButton2 = new ToolbarButton(Constants.META_BACK_BUTTON, 1);
            Back = toolbarButton2;
            ToolbarButton toolbarButton3 = new ToolbarButton(Constants.META_CLOSE, 2);
            Close = toolbarButton3;
            $VALUES = new ToolbarButton[]{toolbarButton, toolbarButton2, toolbarButton3};
        }

        public static ToolbarButton valueOf(String str) {
            return (ToolbarButton) Enum.valueOf(ToolbarButton.class, str);
        }

        public static ToolbarButton[] values() {
            return (ToolbarButton[]) $VALUES.clone();
        }
    }

    public PhonePlansEsimCheckViewModel(ToolbarButton toolbarButton, StatusAvatar statusAvatar, String str, String str2, Cta cta, Cta cta2, Cta cta3) {
        this.toolbarButton = toolbarButton;
        this.statusAvatar = statusAvatar;
        this.title = str;
        this.body = str2;
        this.primaryCta = cta;
        this.secondaryCta = cta2;
        this.helpCta = cta3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhonePlansEsimCheckViewModel)) {
            return false;
        }
        PhonePlansEsimCheckViewModel phonePlansEsimCheckViewModel = (PhonePlansEsimCheckViewModel) obj;
        return this.toolbarButton == phonePlansEsimCheckViewModel.toolbarButton && this.statusAvatar == phonePlansEsimCheckViewModel.statusAvatar && Intrinsics.areEqual(this.title, phonePlansEsimCheckViewModel.title) && Intrinsics.areEqual(this.body, phonePlansEsimCheckViewModel.body) && Intrinsics.areEqual(this.primaryCta, phonePlansEsimCheckViewModel.primaryCta) && Intrinsics.areEqual(this.secondaryCta, phonePlansEsimCheckViewModel.secondaryCta) && Intrinsics.areEqual(this.helpCta, phonePlansEsimCheckViewModel.helpCta);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.statusAvatar.hashCode() + (this.toolbarButton.hashCode() * 31)) * 31, 31, this.title);
        String str = this.body;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        Cta cta = this.primaryCta;
        int hashCode2 = (hashCode + (cta == null ? 0 : cta.hashCode())) * 31;
        Cta cta2 = this.secondaryCta;
        int hashCode3 = (hashCode2 + (cta2 == null ? 0 : cta2.hashCode())) * 31;
        Cta cta3 = this.helpCta;
        return hashCode3 + (cta3 != null ? cta3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhonePlansEsimCheckViewModel(toolbarButton=");
        sb.append(this.toolbarButton);
        sb.append(", statusAvatar=");
        sb.append(this.statusAvatar);
        sb.append(", title=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", body=", this.body, ", primaryCta=");
        sb.append(this.primaryCta);
        sb.append(", secondaryCta=");
        sb.append(this.secondaryCta);
        sb.append(", helpCta=");
        sb.append(this.helpCta);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ PhonePlansEsimCheckViewModel(StatusAvatar statusAvatar, String str, String str2) {
        this(ToolbarButton.None, statusAvatar, str, str2, null, null, null);
    }
}
