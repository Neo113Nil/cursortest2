package com.squareup.cash.afterpayapplet.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes5.dex */
public interface AfterpayAppletRetroOrderSelectionViewModel {

    public final class Error implements AfterpayAppletRetroOrderSelectionViewModel {
        public final String buttonText;
        public final String subtitleText;
        public final String titleText;

        public Error(String str, String str2, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.titleText = str;
            this.subtitleText = str2;
            this.buttonText = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.titleText, error.titleText) && Intrinsics.areEqual(this.subtitleText, error.subtitleText) && Intrinsics.areEqual(this.buttonText, error.buttonText);
        }

        public final int hashCode() {
            return this.buttonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.titleText.hashCode() * 31, 31, this.subtitleText);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(titleText=", this.titleText, ", subtitleText=", this.subtitleText, ", buttonText="), this.buttonText, ")");
        }
    }

    public final class Loaded implements AfterpayAppletRetroOrderSelectionViewModel, AfterpayAppletItemViewed {
        public final String bottomText;
        public final TappableIcon headerIcon;
        public final List impressionEvent;
        public final RetroOrderSection orderSection;
        public final StackedAvatarViewModel.Single stackedAvatar;
        public final String subtitle;
        public final String title;

        public Loaded(TappableIcon tappableIcon, StackedAvatarViewModel.Single single, String str, String str2, RetroOrderSection retroOrderSection, String str3, List list) {
            str.getClass();
            retroOrderSection.getClass();
            this.headerIcon = tappableIcon;
            this.stackedAvatar = single;
            this.title = str;
            this.subtitle = str2;
            this.orderSection = retroOrderSection;
            this.bottomText = str3;
            this.impressionEvent = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.headerIcon, loaded.headerIcon) && Intrinsics.areEqual(this.stackedAvatar, loaded.stackedAvatar) && Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.subtitle, loaded.subtitle) && Intrinsics.areEqual(this.orderSection, loaded.orderSection) && Intrinsics.areEqual(this.bottomText, loaded.bottomText) && Intrinsics.areEqual(this.impressionEvent, loaded.impressionEvent);
        }

        @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed
        public final List getImpressionEvent() {
            return this.impressionEvent;
        }

        public final int hashCode() {
            TappableIcon tappableIcon = this.headerIcon;
            int hashCode = (tappableIcon == null ? 0 : tappableIcon.hashCode()) * 31;
            StackedAvatarViewModel.Single single = this.stackedAvatar;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (single == null ? 0 : single.avatar.hashCode())) * 31, 31, this.title);
            String str = this.subtitle;
            int hashCode2 = (this.orderSection.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            String str2 = this.bottomText;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List list = this.impressionEvent;
            return hashCode3 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(headerIcon=");
            sb.append(this.headerIcon);
            sb.append(", stackedAvatar=");
            sb.append(this.stackedAvatar);
            sb.append(", title=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.title, ", subtitle=", this.subtitle, ", orderSection=");
            sb.append(this.orderSection);
            sb.append(", bottomText=");
            sb.append(this.bottomText);
            sb.append(", impressionEvent=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.impressionEvent, ")");
        }
    }

    public final class Loading implements AfterpayAppletRetroOrderSelectionViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -286721755;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public interface RetroOrderSection {

        public final class EligibleTransactions implements RetroOrderSection {
            public final ImmutableList retroTransactions;

            public EligibleTransactions(ImmutableList immutableList) {
                immutableList.getClass();
                this.retroTransactions = immutableList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EligibleTransactions) && Intrinsics.areEqual(this.retroTransactions, ((EligibleTransactions) obj).retroTransactions);
            }

            public final int hashCode() {
                return this.retroTransactions.hashCode();
            }

            public final String toString() {
                return "EligibleTransactions(retroTransactions=" + this.retroTransactions + ")";
            }
        }

        public final class EmptyEligibleTransactions implements RetroOrderSection {
            public final DisplayStyle displayStyle;
            public final ImmutableList lineItems;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class DisplayStyle {
                public static final /* synthetic */ DisplayStyle[] $VALUES;
                public static final DisplayStyle ORDERED;
                public static final DisplayStyle UNORDERED;

                static {
                    DisplayStyle displayStyle = new DisplayStyle("ORDERED", 0);
                    ORDERED = displayStyle;
                    DisplayStyle displayStyle2 = new DisplayStyle("UNORDERED", 1);
                    UNORDERED = displayStyle2;
                    $VALUES = new DisplayStyle[]{displayStyle, displayStyle2};
                }

                public static DisplayStyle valueOf(String str) {
                    return (DisplayStyle) Enum.valueOf(DisplayStyle.class, str);
                }

                public static DisplayStyle[] values() {
                    return (DisplayStyle[]) $VALUES.clone();
                }
            }

            public EmptyEligibleTransactions(ImmutableList immutableList, DisplayStyle displayStyle) {
                immutableList.getClass();
                this.lineItems = immutableList;
                this.displayStyle = displayStyle;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EmptyEligibleTransactions)) {
                    return false;
                }
                EmptyEligibleTransactions emptyEligibleTransactions = (EmptyEligibleTransactions) obj;
                return Intrinsics.areEqual(this.lineItems, emptyEligibleTransactions.lineItems) && this.displayStyle == emptyEligibleTransactions.displayStyle;
            }

            public final int hashCode() {
                return this.displayStyle.hashCode() + (this.lineItems.hashCode() * 31);
            }

            public final String toString() {
                return "EmptyEligibleTransactions(lineItems=" + this.lineItems + ", displayStyle=" + this.displayStyle + ")";
            }
        }
    }
}
