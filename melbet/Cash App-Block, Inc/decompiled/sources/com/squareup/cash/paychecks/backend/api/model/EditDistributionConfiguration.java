package com.squareup.cash.paychecks.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EditDistributionConfiguration implements Parcelable {
    public static final Parcelable.Creator<EditDistributionConfiguration> CREATOR = new P2PListScreen.Creator(23);
    public final Money averageMonthlyPaycheck;
    public final PaychecksAlertUi exceededMaxDistributionAlertUi;
    public final ArrayList initialDestinationStates;
    public final int initiallySelectedDestinationIndex;

    public final class DestinationUiConfiguration implements Parcelable {
        public static final Parcelable.Creator<DestinationUiConfiguration> CREATOR = new P2PListScreen.Creator(24);
        public final String accessibilityLabel;
        public final AllocationDestination destination;
        public final SelectedStateUiElements selectedStateUiElements;
        public final long shareInBasisPoints;
        public final Color tint;

        public final class SelectedStateUiElements implements Parcelable {
            public static final Parcelable.Creator<SelectedStateUiElements> CREATOR = new P2PListScreen.Creator(27);
            public final String atmOptionAccessibilityHintTemplate;
            public final List atmPickerOptionsInBasisPoints;
            public final BackButtonBehavior backButtonBehavior;
            public final ConfigurationRow configurationRow;
            public final String customAmountAccessibilityHint;
            public final String customAmountSubtitle;
            public final BottomSheet explanation;
            public final String header;
            public final Button primaryButton;
            public final Button secondaryButton;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class BackButtonBehavior {
                public static final /* synthetic */ BackButtonBehavior[] $VALUES;
                public static final BackButtonBehavior DISMISS;
                public static final BackButtonBehavior DISMISS_ON_ERROR;
                public static final BackButtonBehavior SUBMIT;

                static {
                    BackButtonBehavior backButtonBehavior = new BackButtonBehavior("SUBMIT", 0);
                    SUBMIT = backButtonBehavior;
                    BackButtonBehavior backButtonBehavior2 = new BackButtonBehavior("DISMISS_ON_ERROR", 1);
                    DISMISS_ON_ERROR = backButtonBehavior2;
                    BackButtonBehavior backButtonBehavior3 = new BackButtonBehavior("DISMISS", 2);
                    DISMISS = backButtonBehavior3;
                    $VALUES = new BackButtonBehavior[]{backButtonBehavior, backButtonBehavior2, backButtonBehavior3};
                }

                public static BackButtonBehavior valueOf(String str) {
                    return (BackButtonBehavior) Enum.valueOf(BackButtonBehavior.class, str);
                }

                public static BackButtonBehavior[] values() {
                    return (BackButtonBehavior[]) $VALUES.clone();
                }
            }

            public final class Button implements Parcelable {
                public static final Parcelable.Creator<Button> CREATOR = new P2PListScreen.Creator(25);
                public final ButtonAction action;
                public final String label;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class ButtonAction {
                    public static final /* synthetic */ ButtonAction[] $VALUES;
                    public static final ButtonAction CONFIRM;
                    public static final ButtonAction DISABLE;

                    static {
                        ButtonAction buttonAction = new ButtonAction("CONFIRM", 0);
                        CONFIRM = buttonAction;
                        ButtonAction buttonAction2 = new ButtonAction("DISABLE", 1);
                        DISABLE = buttonAction2;
                        $VALUES = new ButtonAction[]{buttonAction, buttonAction2};
                    }

                    public static ButtonAction valueOf(String str) {
                        return (ButtonAction) Enum.valueOf(ButtonAction.class, str);
                    }

                    public static ButtonAction[] values() {
                        return (ButtonAction[]) $VALUES.clone();
                    }
                }

                public Button(ButtonAction buttonAction, String str) {
                    buttonAction.getClass();
                    str.getClass();
                    this.action = buttonAction;
                    this.label = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Button)) {
                        return false;
                    }
                    Button button = (Button) obj;
                    return this.action == button.action && Intrinsics.areEqual(this.label, button.label);
                }

                public final int hashCode() {
                    return this.label.hashCode() + (this.action.hashCode() * 31);
                }

                public final String toString() {
                    return "Button(action=" + this.action + ", label=" + this.label + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.action.name());
                    parcel.writeString(this.label);
                }
            }

            public final class ConfigurationRow implements Parcelable {
                public static final Parcelable.Creator<ConfigurationRow> CREATOR = new P2PListScreen.Creator(26);
                public final String accessibilityHint;
                public final String accessibilityLabel;
                public final String accessibilityValue;
                public final String actionLabel;
                public final Image image;
                public final String subtitle;
                public final String title;

                public ConfigurationRow(Image image, String str, String str2, String str3, String str4, String str5, String str6) {
                    re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                    this.image = image;
                    this.title = str;
                    this.subtitle = str2;
                    this.actionLabel = str3;
                    this.accessibilityLabel = str4;
                    this.accessibilityValue = str5;
                    this.accessibilityHint = str6;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ConfigurationRow)) {
                        return false;
                    }
                    ConfigurationRow configurationRow = (ConfigurationRow) obj;
                    return Intrinsics.areEqual(this.image, configurationRow.image) && Intrinsics.areEqual(this.title, configurationRow.title) && Intrinsics.areEqual(this.subtitle, configurationRow.subtitle) && Intrinsics.areEqual(this.actionLabel, configurationRow.actionLabel) && Intrinsics.areEqual(this.accessibilityLabel, configurationRow.accessibilityLabel) && Intrinsics.areEqual(this.accessibilityValue, configurationRow.accessibilityValue) && Intrinsics.areEqual(this.accessibilityHint, configurationRow.accessibilityHint);
                }

                public final int hashCode() {
                    Image image = this.image;
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((image == null ? 0 : image.hashCode()) * 31, 31, this.title), 31, this.subtitle), 31, this.actionLabel);
                    String str = this.accessibilityLabel;
                    int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.accessibilityValue;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.accessibilityHint;
                    return hashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.image, "ConfigurationRow(image=", ", title=", this.title, ", subtitle=");
                    Boxes$$ExternalSyntheticOutline1.m(m, this.subtitle, ", actionLabel=", this.actionLabel, ", accessibilityLabel=");
                    Boxes$$ExternalSyntheticOutline1.m(m, this.accessibilityLabel, ", accessibilityValue=", this.accessibilityValue, ", accessibilityHint=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.accessibilityHint, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeParcelable(this.image, i);
                    parcel.writeString(this.title);
                    parcel.writeString(this.subtitle);
                    parcel.writeString(this.actionLabel);
                    parcel.writeString(this.accessibilityLabel);
                    parcel.writeString(this.accessibilityValue);
                    parcel.writeString(this.accessibilityHint);
                }
            }

            public SelectedStateUiElements(String str, String str2, BackButtonBehavior backButtonBehavior, List list, Button button, Button button2, ConfigurationRow configurationRow, String str3, String str4, BottomSheet bottomSheet) {
                str.getClass();
                backButtonBehavior.getClass();
                list.getClass();
                button.getClass();
                this.header = str;
                this.customAmountSubtitle = str2;
                this.backButtonBehavior = backButtonBehavior;
                this.atmPickerOptionsInBasisPoints = list;
                this.primaryButton = button;
                this.secondaryButton = button2;
                this.configurationRow = configurationRow;
                this.atmOptionAccessibilityHintTemplate = str3;
                this.customAmountAccessibilityHint = str4;
                this.explanation = bottomSheet;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SelectedStateUiElements)) {
                    return false;
                }
                SelectedStateUiElements selectedStateUiElements = (SelectedStateUiElements) obj;
                return Intrinsics.areEqual(this.header, selectedStateUiElements.header) && Intrinsics.areEqual(this.customAmountSubtitle, selectedStateUiElements.customAmountSubtitle) && this.backButtonBehavior == selectedStateUiElements.backButtonBehavior && Intrinsics.areEqual(this.atmPickerOptionsInBasisPoints, selectedStateUiElements.atmPickerOptionsInBasisPoints) && Intrinsics.areEqual(this.primaryButton, selectedStateUiElements.primaryButton) && Intrinsics.areEqual(this.secondaryButton, selectedStateUiElements.secondaryButton) && Intrinsics.areEqual(this.configurationRow, selectedStateUiElements.configurationRow) && Intrinsics.areEqual(this.atmOptionAccessibilityHintTemplate, selectedStateUiElements.atmOptionAccessibilityHintTemplate) && Intrinsics.areEqual(this.customAmountAccessibilityHint, selectedStateUiElements.customAmountAccessibilityHint) && Intrinsics.areEqual(this.explanation, selectedStateUiElements.explanation);
            }

            public final int hashCode() {
                int hashCode = this.header.hashCode() * 31;
                String str = this.customAmountSubtitle;
                int hashCode2 = (this.primaryButton.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.backButtonBehavior.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.atmPickerOptionsInBasisPoints)) * 31;
                Button button = this.secondaryButton;
                int hashCode3 = (hashCode2 + (button == null ? 0 : button.hashCode())) * 31;
                ConfigurationRow configurationRow = this.configurationRow;
                int hashCode4 = (hashCode3 + (configurationRow == null ? 0 : configurationRow.hashCode())) * 31;
                String str2 = this.atmOptionAccessibilityHintTemplate;
                int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.customAmountAccessibilityHint;
                int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
                BottomSheet bottomSheet = this.explanation;
                return hashCode6 + (bottomSheet != null ? bottomSheet.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SelectedStateUiElements(header=", this.header, ", customAmountSubtitle=", this.customAmountSubtitle, ", backButtonBehavior=");
                m.append(this.backButtonBehavior);
                m.append(", atmPickerOptionsInBasisPoints=");
                m.append(this.atmPickerOptionsInBasisPoints);
                m.append(", primaryButton=");
                m.append(this.primaryButton);
                m.append(", secondaryButton=");
                m.append(this.secondaryButton);
                m.append(", configurationRow=");
                m.append(this.configurationRow);
                m.append(", atmOptionAccessibilityHintTemplate=");
                m.append(this.atmOptionAccessibilityHintTemplate);
                m.append(", customAmountAccessibilityHint=");
                m.append(this.customAmountAccessibilityHint);
                m.append(", explanation=");
                m.append(this.explanation);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.header);
                parcel.writeString(this.customAmountSubtitle);
                parcel.writeString(this.backButtonBehavior.name());
                Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.atmPickerOptionsInBasisPoints, parcel);
                while (m.hasNext()) {
                    parcel.writeLong(((Number) m.next()).longValue());
                }
                this.primaryButton.writeToParcel(parcel, i);
                Button button = this.secondaryButton;
                if (button == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    button.writeToParcel(parcel, i);
                }
                ConfigurationRow configurationRow = this.configurationRow;
                if (configurationRow == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    configurationRow.writeToParcel(parcel, i);
                }
                parcel.writeString(this.atmOptionAccessibilityHintTemplate);
                parcel.writeString(this.customAmountAccessibilityHint);
                BottomSheet bottomSheet = this.explanation;
                if (bottomSheet == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    bottomSheet.writeToParcel(parcel, i);
                }
            }
        }

        public DestinationUiConfiguration(AllocationDestination allocationDestination, long j, Color color, SelectedStateUiElements selectedStateUiElements, String str) {
            allocationDestination.getClass();
            color.getClass();
            this.destination = allocationDestination;
            this.shareInBasisPoints = j;
            this.tint = color;
            this.selectedStateUiElements = selectedStateUiElements;
            this.accessibilityLabel = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DestinationUiConfiguration)) {
                return false;
            }
            DestinationUiConfiguration destinationUiConfiguration = (DestinationUiConfiguration) obj;
            return Intrinsics.areEqual(this.destination, destinationUiConfiguration.destination) && this.shareInBasisPoints == destinationUiConfiguration.shareInBasisPoints && Intrinsics.areEqual(this.tint, destinationUiConfiguration.tint) && Intrinsics.areEqual(this.selectedStateUiElements, destinationUiConfiguration.selectedStateUiElements) && Intrinsics.areEqual(this.accessibilityLabel, destinationUiConfiguration.accessibilityLabel);
        }

        public final int hashCode() {
            int m = SVG$Unit$EnumUnboxingLocalUtility.m(this.tint, Recorder$$ExternalSyntheticOutline2.m(this.destination.hashCode() * 31, 31, this.shareInBasisPoints), 31);
            SelectedStateUiElements selectedStateUiElements = this.selectedStateUiElements;
            int hashCode = (m + (selectedStateUiElements == null ? 0 : selectedStateUiElements.hashCode())) * 31;
            String str = this.accessibilityLabel;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DestinationUiConfiguration(destination=");
            sb.append(this.destination);
            sb.append(", shareInBasisPoints=");
            sb.append(this.shareInBasisPoints);
            sb.append(", tint=");
            sb.append(this.tint);
            sb.append(", selectedStateUiElements=");
            sb.append(this.selectedStateUiElements);
            return Recorder$$ExternalSyntheticOutline2.m(sb, ", accessibilityLabel=", this.accessibilityLabel, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.destination, i);
            parcel.writeLong(this.shareInBasisPoints);
            parcel.writeParcelable(this.tint, i);
            SelectedStateUiElements selectedStateUiElements = this.selectedStateUiElements;
            if (selectedStateUiElements == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                selectedStateUiElements.writeToParcel(parcel, i);
            }
            parcel.writeString(this.accessibilityLabel);
        }
    }

    public EditDistributionConfiguration(ArrayList arrayList, int i, PaychecksAlertUi paychecksAlertUi, Money money) {
        paychecksAlertUi.getClass();
        this.initialDestinationStates = arrayList;
        this.initiallySelectedDestinationIndex = i;
        this.exceededMaxDistributionAlertUi = paychecksAlertUi;
        this.averageMonthlyPaycheck = money;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditDistributionConfiguration)) {
            return false;
        }
        EditDistributionConfiguration editDistributionConfiguration = (EditDistributionConfiguration) obj;
        return this.initialDestinationStates.equals(editDistributionConfiguration.initialDestinationStates) && this.initiallySelectedDestinationIndex == editDistributionConfiguration.initiallySelectedDestinationIndex && Intrinsics.areEqual(this.exceededMaxDistributionAlertUi, editDistributionConfiguration.exceededMaxDistributionAlertUi) && Intrinsics.areEqual(this.averageMonthlyPaycheck, editDistributionConfiguration.averageMonthlyPaycheck);
    }

    public final int hashCode() {
        int hashCode = (this.exceededMaxDistributionAlertUi.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.initiallySelectedDestinationIndex, this.initialDestinationStates.hashCode() * 31, 31)) * 31;
        Money money = this.averageMonthlyPaycheck;
        return hashCode + (money == null ? 0 : money.hashCode());
    }

    public final String toString() {
        return "EditDistributionConfiguration(initialDestinationStates=" + this.initialDestinationStates + ", initiallySelectedDestinationIndex=" + this.initiallySelectedDestinationIndex + ", exceededMaxDistributionAlertUi=" + this.exceededMaxDistributionAlertUi + ", averageMonthlyPaycheck=" + this.averageMonthlyPaycheck + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.initialDestinationStates, parcel);
        while (m.hasNext()) {
            ((DestinationUiConfiguration) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.initiallySelectedDestinationIndex);
        this.exceededMaxDistributionAlertUi.writeToParcel(parcel, i);
        parcel.writeParcelable(this.averageMonthlyPaycheck, i);
    }
}
