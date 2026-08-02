package com.squareup.cash.paychecks.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.paychecks.backend.api.model.BottomSheet;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewEvent;
import com.squareup.cash.paychecks.viewmodels.common.ColorTheme;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface EditDistributionViewModel {

    public final class Content implements EditDistributionViewModel {
        public final ArrayList atmPickerOptions;
        public final ColorTheme colorTheme;
        public final Configuration configuration;
        public final BottomSheet explanation;
        public final InfoButton infoButton;
        public final NavigationButton navigationButton;
        public final Action primaryAction;
        public final String title;
        public final Function3 updateWheelViewModel;
        public final DistributionWheelViewModel wheelViewModel;

        public final class Action {
            public final EditDistributionViewEvent action;
            public final boolean enabled;
            public final String text;

            public Action(String str, EditDistributionViewEvent editDistributionViewEvent, boolean z) {
                str.getClass();
                this.text = str;
                this.action = editDistributionViewEvent;
                this.enabled = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Action)) {
                    return false;
                }
                Action action = (Action) obj;
                return Intrinsics.areEqual(this.text, action.text) && this.action.equals(action.action) && this.enabled == action.enabled;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.enabled) + ((this.action.hashCode() + (this.text.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Action(text=");
                sb.append(this.text);
                sb.append(", action=");
                sb.append(this.action);
                sb.append(", enabled=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.enabled, ")");
            }
        }

        public abstract class AtmPickerOption extends AmountSelectorWidgetModel.Item {

            public final class CustomValue extends AtmPickerOption {
                public final String accessibilityHint;
                public final String accessibilityLabel;
                public final AmountSelectorWidgetModel.Item.Icon icon = AmountSelectorWidgetModel.Item.Icon.PENDING;
                public final boolean isSelected;

                public CustomValue(String str, String str2, boolean z) {
                    this.isSelected = z;
                    this.accessibilityLabel = str;
                    this.accessibilityHint = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CustomValue)) {
                        return false;
                    }
                    CustomValue customValue = (CustomValue) obj;
                    return this.isSelected == customValue.isSelected && Intrinsics.areEqual(this.accessibilityLabel, customValue.accessibilityLabel) && Intrinsics.areEqual(this.accessibilityHint, customValue.accessibilityHint);
                }

                @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
                public final String getAccessibilityHint() {
                    return this.accessibilityHint;
                }

                @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
                public final String getAccessibilityLabel() {
                    return this.accessibilityLabel;
                }

                @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
                public final AmountSelectorWidgetModel.Item.Icon getIcon() {
                    return this.icon;
                }

                @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
                public final String getLabel() {
                    return "";
                }

                public final int hashCode() {
                    int hashCode = Boolean.hashCode(this.isSelected) * 31;
                    String str = this.accessibilityLabel;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.accessibilityHint;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
                public final boolean isSelected() {
                    return this.isSelected;
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("CustomValue(isSelected=", ", accessibilityLabel=", this.accessibilityLabel, ", accessibilityHint=", this.isSelected), this.accessibilityHint, ")");
                }
            }

            public final class Percentage extends AtmPickerOption {
                public final String accessibilityHint;
                public final String accessibilityLabel;
                public final boolean isSelected;
                public final String label;
                public final float value;

                public Percentage(float f, String str, String str2, String str3, boolean z) {
                    this.value = f;
                    this.label = str;
                    this.isSelected = z;
                    this.accessibilityLabel = str2;
                    this.accessibilityHint = str3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Percentage)) {
                        return false;
                    }
                    Percentage percentage = (Percentage) obj;
                    return Float.compare(this.value, percentage.value) == 0 && this.label.equals(percentage.label) && this.isSelected == percentage.isSelected && this.accessibilityLabel.equals(percentage.accessibilityLabel) && Intrinsics.areEqual(this.accessibilityHint, percentage.accessibilityHint);
                }

                @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
                public final String getAccessibilityHint() {
                    return this.accessibilityHint;
                }

                @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
                public final String getAccessibilityLabel() {
                    return this.accessibilityLabel;
                }

                @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
                public final String getLabel() {
                    return this.label;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Float.hashCode(this.value) * 31, 31, this.label), 31, this.isSelected), 31, this.accessibilityLabel);
                    String str = this.accessibilityHint;
                    return m + (str == null ? 0 : str.hashCode());
                }

                @Override // com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel.Item
                public final boolean isSelected() {
                    return this.isSelected;
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Percentage(value=");
                    sb.append(this.value);
                    sb.append(", label=");
                    sb.append(this.label);
                    sb.append(", isSelected=");
                    NavAction$$ExternalSyntheticOutline0.m(sb, this.isSelected, ", accessibilityLabel=", this.accessibilityLabel, ", accessibilityHint=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.accessibilityHint, ")");
                }
            }
        }

        public final class Configuration {
            public final String accessibilityActionLabel;
            public final String accessibilityLabel;
            public final Action action;
            public final Image image;
            public final String subtitle;
            public final String title;

            public Configuration(Image image, String str, String str2, Action action, String str3, String str4) {
                str.getClass();
                str2.getClass();
                this.image = image;
                this.title = str;
                this.subtitle = str2;
                this.action = action;
                this.accessibilityLabel = str3;
                this.accessibilityActionLabel = str4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Configuration)) {
                    return false;
                }
                Configuration configuration = (Configuration) obj;
                return Intrinsics.areEqual(this.image, configuration.image) && Intrinsics.areEqual(this.title, configuration.title) && Intrinsics.areEqual(this.subtitle, configuration.subtitle) && this.action.equals(configuration.action) && this.accessibilityLabel.equals(configuration.accessibilityLabel) && Intrinsics.areEqual(this.accessibilityActionLabel, configuration.accessibilityActionLabel);
            }

            public final int hashCode() {
                Image image = this.image;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((image == null ? 0 : image.hashCode()) * 31, 31, this.title), 31, this.subtitle)) * 31, 31, this.accessibilityLabel);
                String str = this.accessibilityActionLabel;
                return m + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.image, "Configuration(image=", ", title=", this.title, ", subtitle=");
                m.append(this.subtitle);
                m.append(", action=");
                m.append(this.action);
                m.append(", accessibilityLabel=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.accessibilityLabel, ", accessibilityActionLabel=", this.accessibilityActionLabel, ")");
            }
        }

        public final class InfoButton {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InfoButton)) {
                    return false;
                }
                EditDistributionViewEvent.TapInfoButton tapInfoButton = EditDistributionViewEvent.TapInfoButton.INSTANCE;
                return tapInfoButton.equals(tapInfoButton);
            }

            public final int hashCode() {
                return -1119242998;
            }

            public final String toString() {
                return "InfoButton(event=" + EditDistributionViewEvent.TapInfoButton.INSTANCE + ")";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class NavigationButton {
            public static final /* synthetic */ NavigationButton[] $VALUES;
            public static final NavigationButton BACK;
            public static final NavigationButton CLOSE;

            static {
                NavigationButton navigationButton = new NavigationButton("CLOSE", 0);
                CLOSE = navigationButton;
                NavigationButton navigationButton2 = new NavigationButton("BACK", 1);
                BACK = navigationButton2;
                $VALUES = new NavigationButton[]{navigationButton, navigationButton2};
            }

            public static NavigationButton valueOf(String str) {
                return (NavigationButton) Enum.valueOf(NavigationButton.class, str);
            }

            public static NavigationButton[] values() {
                return (NavigationButton[]) $VALUES.clone();
            }
        }

        public Content(String str, NavigationButton navigationButton, DistributionWheelViewModel distributionWheelViewModel, ArrayList arrayList, Configuration configuration, Action action, ColorTheme colorTheme, InfoButton infoButton, BottomSheet bottomSheet, Function3 function3) {
            str.getClass();
            function3.getClass();
            this.title = str;
            this.navigationButton = navigationButton;
            this.wheelViewModel = distributionWheelViewModel;
            this.atmPickerOptions = arrayList;
            this.configuration = configuration;
            this.primaryAction = action;
            this.colorTheme = colorTheme;
            this.infoButton = infoButton;
            this.explanation = bottomSheet;
            this.updateWheelViewModel = function3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.title, content.title) && this.navigationButton == content.navigationButton && this.wheelViewModel.equals(content.wheelViewModel) && this.atmPickerOptions.equals(content.atmPickerOptions) && Intrinsics.areEqual(this.configuration, content.configuration) && this.primaryAction.equals(content.primaryAction) && this.colorTheme == content.colorTheme && Intrinsics.areEqual(this.infoButton, content.infoButton) && Intrinsics.areEqual(this.explanation, content.explanation) && Intrinsics.areEqual(this.updateWheelViewModel, content.updateWheelViewModel);
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.atmPickerOptions, (this.wheelViewModel.hashCode() + ((this.navigationButton.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31, 31);
            Configuration configuration = this.configuration;
            int hashCode = (((this.colorTheme.hashCode() + ((this.primaryAction.hashCode() + ((m + (configuration == null ? 0 : configuration.hashCode())) * 31)) * 31)) * 31) + (this.infoButton == null ? 0 : -1119242998)) * 31;
            BottomSheet bottomSheet = this.explanation;
            return this.updateWheelViewModel.hashCode() + ((hashCode + (bottomSheet != null ? bottomSheet.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Content(title=" + this.title + ", navigationButton=" + this.navigationButton + ", wheelViewModel=" + this.wheelViewModel + ", atmPickerOptions=" + this.atmPickerOptions + ", configuration=" + this.configuration + ", primaryAction=" + this.primaryAction + ", colorTheme=" + this.colorTheme + ", infoButton=" + this.infoButton + ", explanation=" + this.explanation + ", updateWheelViewModel=" + this.updateWheelViewModel + ")";
        }
    }

    public final class Loading implements EditDistributionViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -21583982;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
