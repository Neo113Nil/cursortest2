package com.squareup.cash.paychecks.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DistributionWheelViewModel {
    public final String accessibilityText;
    public final ArrayList allocations;
    public final boolean animateChange;
    public final Content content;
    public final boolean desaturateNotSelectedAllocations;
    public final boolean interactable;
    public final boolean tintAllocations;

    public interface Allocation {

        public interface Treatment {

            public final class Default implements Treatment {
                public static final Default INSTANCE = new Default();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Default);
                }

                public final int hashCode() {
                    return 1983230412;
                }

                public final String toString() {
                    return "Default";
                }
            }

            public final class InteractableNotSelected implements Treatment {
                public static final InteractableNotSelected INSTANCE = new InteractableNotSelected();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof InteractableNotSelected);
                }

                public final int hashCode() {
                    return -1862373015;
                }

                public final String toString() {
                    return "InteractableNotSelected";
                }
            }

            public final class InteractableSelected implements Treatment {
                public final float maxAllocation;

                public InteractableSelected(float f) {
                    this.maxAllocation = f;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof InteractableSelected) && Float.compare(this.maxAllocation, ((InteractableSelected) obj).maxAllocation) == 0 && Float.compare(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == 0;
                }

                public final int hashCode() {
                    return Float.hashCode(RecyclerView.DECELERATION_RATE) + (Float.hashCode(this.maxAllocation) * 31);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxAllocation, "InteractableSelected(maxAllocation=", ", minAllocation=0.0)");
                }
            }
        }

        String getAccessibilityLabel();

        float getPercentage();

        Treatment getTreatment();
    }

    public final class AllocationGroup implements Allocation {
        public final float percentage;
        public final ArrayList subAllocations;
        public final Allocation.Treatment treatment;

        public AllocationGroup(Allocation.Treatment treatment, ArrayList arrayList) {
            this.treatment = treatment;
            this.subAllocations = arrayList;
            double d = 0.0d;
            while (arrayList.iterator().hasNext()) {
                d += ((SingleAllocation) r5.next()).percentage;
            }
            this.percentage = (float) d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AllocationGroup)) {
                return false;
            }
            AllocationGroup allocationGroup = (AllocationGroup) obj;
            return this.treatment.equals(allocationGroup.treatment) && this.subAllocations.equals(allocationGroup.subAllocations);
        }

        @Override // com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel.Allocation
        public final String getAccessibilityLabel() {
            return null;
        }

        @Override // com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel.Allocation
        public final float getPercentage() {
            return this.percentage;
        }

        @Override // com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel.Allocation
        public final Allocation.Treatment getTreatment() {
            return this.treatment;
        }

        public final int hashCode() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(this.subAllocations, this.treatment.hashCode() * 31, 31);
        }

        public final String toString() {
            return "AllocationGroup(treatment=" + this.treatment + ", subAllocations=" + this.subAllocations + ", accessibilityLabel=null)";
        }
    }

    public interface Content {

        public final class ActiveDistributionSection implements Content {
            public final TitleConfiguration subtitle;
            public final TitleConfiguration title;

            public ActiveDistributionSection(Color color, String str, String str2) {
                str.getClass();
                color.getClass();
                TitleConfiguration titleConfiguration = new TitleConfiguration(str, TextTreatment.HEADER3, new TextColor.Tinted(color));
                TitleConfiguration titleConfiguration2 = new TitleConfiguration(str2, TextTreatment.CAPTION, TextColor.SecondaryLabel.INSTANCE);
                this.title = titleConfiguration;
                this.subtitle = titleConfiguration2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActiveDistributionSection)) {
                    return false;
                }
                ActiveDistributionSection activeDistributionSection = (ActiveDistributionSection) obj;
                return Intrinsics.areEqual(this.title, activeDistributionSection.title) && Intrinsics.areEqual(this.subtitle, activeDistributionSection.subtitle);
            }

            public final int hashCode() {
                return this.subtitle.hashCode() + (this.title.hashCode() * 31);
            }

            public final String toString() {
                return "ActiveDistributionSection(title=" + this.title + ", subtitle=" + this.subtitle + ")";
            }
        }

        public final class DistributePaycheckScreen implements Content {
            public final String percentage;

            public DistributePaycheckScreen(String str) {
                str.getClass();
                this.percentage = str;
            }
        }

        public final class EditSingleDistributionScreen implements Content {
            public final WheelIcon icon;
            public final String monthlyAmount;
            public final String percentage;
            public final boolean showInfoButton;

            public interface WheelIcon {

                public final class Emoji implements WheelIcon {
                    public final String iconId;

                    public Emoji(String str) {
                        str.getClass();
                        this.iconId = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Emoji) && Intrinsics.areEqual(this.iconId, ((Emoji) obj).iconId);
                    }

                    public final int hashCode() {
                        return this.iconId.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Emoji(iconId=", this.iconId, ")");
                    }
                }

                public final class Image implements WheelIcon {
                    public final com.squareup.protos.cash.ui.Image image;

                    public Image(com.squareup.protos.cash.ui.Image image) {
                        image.getClass();
                        this.image = image;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Image) && Intrinsics.areEqual(this.image, ((Image) obj).image);
                    }

                    public final int hashCode() {
                        return this.image.hashCode();
                    }

                    public final String toString() {
                        return SVG$Unit$EnumUnboxingLocalUtility.m(this.image, "Image(image=", ")");
                    }
                }
            }

            public EditSingleDistributionScreen(String str, String str2, boolean z, WheelIcon wheelIcon) {
                str.getClass();
                this.percentage = str;
                this.monthlyAmount = str2;
                this.showInfoButton = z;
                this.icon = wheelIcon;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EditSingleDistributionScreen)) {
                    return false;
                }
                EditSingleDistributionScreen editSingleDistributionScreen = (EditSingleDistributionScreen) obj;
                return Intrinsics.areEqual(this.percentage, editSingleDistributionScreen.percentage) && Intrinsics.areEqual(this.monthlyAmount, editSingleDistributionScreen.monthlyAmount) && this.showInfoButton == editSingleDistributionScreen.showInfoButton && Intrinsics.areEqual(this.icon, editSingleDistributionScreen.icon);
            }

            public final int hashCode() {
                int hashCode = this.percentage.hashCode() * 31;
                String str = this.monthlyAmount;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.showInfoButton);
                WheelIcon wheelIcon = this.icon;
                return m + (wheelIcon != null ? wheelIcon.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EditSingleDistributionScreen(percentage=", this.percentage, ", monthlyAmount=", this.monthlyAmount, ", showInfoButton=");
                m.append(this.showInfoButton);
                m.append(", icon=");
                m.append(this.icon);
                m.append(")");
                return m.toString();
            }
        }

        public final class IconsConfiguration {
            public final List icons;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Placement {
                public static final /* synthetic */ Placement[] $VALUES;
                public static final Placement RECEIPT;

                static {
                    Placement placement = new Placement("RECEIPT", 0);
                    RECEIPT = placement;
                    $VALUES = new Placement[]{placement};
                }

                public static Placement valueOf(String str) {
                    return (Placement) Enum.valueOf(Placement.class, str);
                }

                public static Placement[] values() {
                    return (Placement[]) $VALUES.clone();
                }
            }

            public IconsConfiguration(List list) {
                Placement placement = Placement.RECEIPT;
                list.getClass();
                this.icons = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof IconsConfiguration) || !Intrinsics.areEqual(this.icons, ((IconsConfiguration) obj).icons)) {
                    return false;
                }
                Placement placement = Placement.RECEIPT;
                return true;
            }

            public final int hashCode() {
                return Placement.RECEIPT.hashCode() + (this.icons.hashCode() * 31);
            }

            public final String toString() {
                return "IconsConfiguration(icons=" + this.icons + ", placement=" + Placement.RECEIPT + ")";
            }
        }

        public final class MultipleAllocationsScreen implements Content {
            public final String monthlyAmount;
            public final String percentage;
            public final boolean showInfoButton;

            public MultipleAllocationsScreen(String str, String str2, boolean z) {
                str.getClass();
                this.percentage = str;
                this.monthlyAmount = str2;
                this.showInfoButton = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MultipleAllocationsScreen)) {
                    return false;
                }
                MultipleAllocationsScreen multipleAllocationsScreen = (MultipleAllocationsScreen) obj;
                return Intrinsics.areEqual(this.percentage, multipleAllocationsScreen.percentage) && Intrinsics.areEqual(this.monthlyAmount, multipleAllocationsScreen.monthlyAmount) && this.showInfoButton == multipleAllocationsScreen.showInfoButton;
            }

            public final int hashCode() {
                int hashCode = this.percentage.hashCode() * 31;
                String str = this.monthlyAmount;
                return Boolean.hashCode(this.showInfoButton) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MultipleAllocationsScreen(percentage=", this.percentage, ", monthlyAmount=", this.monthlyAmount, ", showInfoButton="), this.showInfoButton, ")");
            }
        }

        public final class ReceiptScreen implements Content {
            public final IconsConfiguration icons;
            public final TitleConfiguration subtitle;
            public final TitleConfiguration title;

            public ReceiptScreen(String str, String str2, List list) {
                str.getClass();
                list.getClass();
                TitleConfiguration titleConfiguration = new TitleConfiguration(str, TextTreatment.BIG_MONEY, TextColor.Label.INSTANCE);
                TitleConfiguration titleConfiguration2 = new TitleConfiguration(str2, TextTreatment.TITLE, TextColor.SecondaryLabel.INSTANCE);
                IconsConfiguration.Placement placement = IconsConfiguration.Placement.RECEIPT;
                IconsConfiguration iconsConfiguration = new IconsConfiguration(list);
                this.title = titleConfiguration;
                this.subtitle = titleConfiguration2;
                this.icons = iconsConfiguration;
            }
        }

        public final class TitleConfiguration {
            public final TextColor color;
            public final String text;
            public final TextTreatment treatment;

            public TitleConfiguration(String str, TextTreatment textTreatment, TextColor textColor) {
                str.getClass();
                this.text = str;
                this.treatment = textTreatment;
                this.color = textColor;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TitleConfiguration)) {
                    return false;
                }
                TitleConfiguration titleConfiguration = (TitleConfiguration) obj;
                return Intrinsics.areEqual(this.text, titleConfiguration.text) && this.treatment == titleConfiguration.treatment && this.color.equals(titleConfiguration.color);
            }

            public final int hashCode() {
                return Integer.hashCode(1) + ((this.color.hashCode() + ((this.treatment.hashCode() + (this.text.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "TitleConfiguration(text=" + this.text + ", treatment=" + this.treatment + ", color=" + this.color + ", maxLines=1)";
            }
        }
    }

    public interface TextColor {

        public final class Label implements TextColor {
            public static final Label INSTANCE = new Label();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Label);
            }

            public final int hashCode() {
                return 1360956397;
            }

            public final String toString() {
                return "Label";
            }
        }

        public final class SecondaryLabel implements TextColor {
            public static final SecondaryLabel INSTANCE = new SecondaryLabel();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SecondaryLabel);
            }

            public final int hashCode() {
                return 1774608647;
            }

            public final String toString() {
                return "SecondaryLabel";
            }
        }

        public final class Tinted implements TextColor {
            public final Color color;

            public Tinted(Color color) {
                color.getClass();
                this.color = color;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Tinted) && Intrinsics.areEqual(this.color, ((Tinted) obj).color);
            }

            public final int hashCode() {
                return this.color.hashCode();
            }

            public final String toString() {
                return "Tinted(color=" + this.color + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class TextTreatment {
        public static final /* synthetic */ TextTreatment[] $VALUES;
        public static final TextTreatment BIG_MONEY;
        public static final TextTreatment CAPTION;
        public static final TextTreatment HEADER3;
        public static final TextTreatment TITLE;

        static {
            TextTreatment textTreatment = new TextTreatment("TITLE", 0);
            TITLE = textTreatment;
            TextTreatment textTreatment2 = new TextTreatment("CAPTION", 1);
            CAPTION = textTreatment2;
            TextTreatment textTreatment3 = new TextTreatment("HEADER2", 2);
            TextTreatment textTreatment4 = new TextTreatment("HEADER3", 3);
            HEADER3 = textTreatment4;
            TextTreatment textTreatment5 = new TextTreatment("BIG_MONEY", 4);
            BIG_MONEY = textTreatment5;
            $VALUES = new TextTreatment[]{textTreatment, textTreatment2, textTreatment3, textTreatment4, textTreatment5, new TextTreatment("SMALL_BODY", 5)};
        }

        public static TextTreatment valueOf(String str) {
            return (TextTreatment) Enum.valueOf(TextTreatment.class, str);
        }

        public static TextTreatment[] values() {
            return (TextTreatment[]) $VALUES.clone();
        }
    }

    public /* synthetic */ DistributionWheelViewModel(ArrayList arrayList, Content content, int i) {
        this(arrayList, false, (i & 4) == 0, (i & 8) != 0, false, content, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistributionWheelViewModel)) {
            return false;
        }
        DistributionWheelViewModel distributionWheelViewModel = (DistributionWheelViewModel) obj;
        return Intrinsics.areEqual(this.allocations, distributionWheelViewModel.allocations) && this.animateChange == distributionWheelViewModel.animateChange && this.interactable == distributionWheelViewModel.interactable && this.tintAllocations == distributionWheelViewModel.tintAllocations && this.desaturateNotSelectedAllocations == distributionWheelViewModel.desaturateNotSelectedAllocations && Intrinsics.areEqual(this.content, distributionWheelViewModel.content) && Intrinsics.areEqual(this.accessibilityText, distributionWheelViewModel.accessibilityText);
    }

    public final int hashCode() {
        int hashCode = (this.content.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.allocations.hashCode() * 31, 31, this.animateChange), 31, this.interactable), 31, this.tintAllocations), 31, this.desaturateNotSelectedAllocations)) * 31;
        String str = this.accessibilityText;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DistributionWheelViewModel(allocations=");
        sb.append(this.allocations);
        sb.append(", animateChange=");
        sb.append(this.animateChange);
        sb.append(", interactable=");
        re$$ExternalSyntheticOutline0.m(sb, this.interactable, ", tintAllocations=", this.tintAllocations, ", desaturateNotSelectedAllocations=");
        sb.append(this.desaturateNotSelectedAllocations);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", accessibilityText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.accessibilityText, ")");
    }

    public final class SingleAllocation implements Allocation {
        public final String accessibilityLabel;
        public final Color color;
        public final float percentage;
        public final Allocation.Treatment treatment;

        public SingleAllocation(Color color, float f, Allocation.Treatment treatment, String str) {
            color.getClass();
            this.color = color;
            this.percentage = f;
            this.treatment = treatment;
            this.accessibilityLabel = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SingleAllocation)) {
                return false;
            }
            SingleAllocation singleAllocation = (SingleAllocation) obj;
            return Intrinsics.areEqual(this.color, singleAllocation.color) && Float.compare(this.percentage, singleAllocation.percentage) == 0 && Intrinsics.areEqual(this.treatment, singleAllocation.treatment) && Intrinsics.areEqual(this.accessibilityLabel, singleAllocation.accessibilityLabel);
        }

        @Override // com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel.Allocation
        public final String getAccessibilityLabel() {
            return this.accessibilityLabel;
        }

        @Override // com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel.Allocation
        public final float getPercentage() {
            return this.percentage;
        }

        @Override // com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel.Allocation
        public final Allocation.Treatment getTreatment() {
            return this.treatment;
        }

        public final int hashCode() {
            int hashCode = (this.treatment.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.percentage, this.color.hashCode() * 31, 31)) * 31;
            String str = this.accessibilityLabel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "SingleAllocation(color=" + this.color + ", percentage=" + this.percentage + ", treatment=" + this.treatment + ", accessibilityLabel=" + this.accessibilityLabel + ")";
        }

        public /* synthetic */ SingleAllocation(float f, Color color) {
            this(color, f, Allocation.Treatment.Default.INSTANCE, null);
        }
    }

    public DistributionWheelViewModel(ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, Content content, String str) {
        this.allocations = arrayList;
        this.animateChange = z;
        this.interactable = z2;
        this.tintAllocations = z3;
        this.desaturateNotSelectedAllocations = z4;
        this.content = content;
        this.accessibilityText = str;
    }
}
