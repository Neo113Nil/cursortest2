package com.squareup.cash.crypto.common.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface BitcoinP2pConversionPercentageViewModel {

    public final class Content implements BitcoinP2pConversionPercentageViewModel {
        public final String accessibilityLabel;
        public final AlertModel exceededMaxAlert;
        public final String percentageDisplayText;
        public final String percentageSubtitleText;
        public final ArrayList pickerOptions;
        public final Action primaryAction;
        public final Action secondaryAction;
        public final long selectedPercentageBps;
        public final String title;

        public final class Action {
            public final BitcoinP2pConversionPercentageViewEvent event;
            public final String text;

            public Action(String str, BitcoinP2pConversionPercentageViewEvent bitcoinP2pConversionPercentageViewEvent) {
                this.text = str;
                this.event = bitcoinP2pConversionPercentageViewEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Action)) {
                    return false;
                }
                Action action = (Action) obj;
                return this.text.equals(action.text) && this.event.equals(action.event);
            }

            public final int hashCode() {
                return Boolean.hashCode(true) + ((this.event.hashCode() + (this.text.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "Action(text=" + this.text + ", event=" + this.event + ", enabled=true)";
            }
        }

        public final class AlertModel {
            public final String acknowledgeText;
            public final String detail;
            public final String title;

            public AlertModel(String str, String str2, String str3) {
                this.title = str;
                this.detail = str2;
                this.acknowledgeText = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AlertModel)) {
                    return false;
                }
                AlertModel alertModel = (AlertModel) obj;
                return this.title.equals(alertModel.title) && this.detail.equals(alertModel.detail) && this.acknowledgeText.equals(alertModel.acknowledgeText);
            }

            public final int hashCode() {
                return this.acknowledgeText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.detail);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AlertModel(title=", this.title, ", detail=", this.detail, ", acknowledgeText="), this.acknowledgeText, ")");
            }
        }

        public final class PickerOption {
            public final String accessibilityHint;
            public final long bps;
            public final boolean isCustom;
            public final boolean isSelected;
            public final String label;

            public PickerOption(String str, long j, boolean z, boolean z2, String str2) {
                str.getClass();
                this.label = str;
                this.bps = j;
                this.isSelected = z;
                this.isCustom = z2;
                this.accessibilityHint = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PickerOption)) {
                    return false;
                }
                PickerOption pickerOption = (PickerOption) obj;
                return Intrinsics.areEqual(this.label, pickerOption.label) && this.bps == pickerOption.bps && this.isSelected == pickerOption.isSelected && this.isCustom == pickerOption.isCustom && Intrinsics.areEqual(this.accessibilityHint, pickerOption.accessibilityHint);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.label.hashCode() * 31, 31, this.bps), 31, this.isSelected), 31, this.isCustom);
                String str = this.accessibilityHint;
                return m + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder m = re$$ExternalSyntheticOutline0.m("PickerOption(label=", this.label, ", bps=", this.bps);
                m.append(", isSelected=");
                m.append(this.isSelected);
                m.append(", isCustom=");
                m.append(this.isCustom);
                return Recorder$$ExternalSyntheticOutline2.m(m, ", accessibilityHint=", this.accessibilityHint, ")");
            }
        }

        public Content(String str, long j, String str2, String str3, ArrayList arrayList, Action action, Action action2, AlertModel alertModel, String str4) {
            str3.getClass();
            this.title = str;
            this.selectedPercentageBps = j;
            this.percentageDisplayText = str2;
            this.percentageSubtitleText = str3;
            this.pickerOptions = arrayList;
            this.primaryAction = action;
            this.secondaryAction = action2;
            this.exceededMaxAlert = alertModel;
            this.accessibilityLabel = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.title.equals(content.title) && this.selectedPercentageBps == content.selectedPercentageBps && this.percentageDisplayText.equals(content.percentageDisplayText) && Intrinsics.areEqual(this.percentageSubtitleText, content.percentageSubtitleText) && this.pickerOptions.equals(content.pickerOptions) && Intrinsics.areEqual(this.primaryAction, content.primaryAction) && Intrinsics.areEqual(this.secondaryAction, content.secondaryAction) && Intrinsics.areEqual(this.exceededMaxAlert, content.exceededMaxAlert) && Intrinsics.areEqual(this.accessibilityLabel, content.accessibilityLabel);
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.pickerOptions, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.title.hashCode() * 31, 31, this.selectedPercentageBps), 31, this.percentageDisplayText), 31, this.percentageSubtitleText), 31);
            Action action = this.primaryAction;
            int hashCode = (m + (action == null ? 0 : action.hashCode())) * 31;
            Action action2 = this.secondaryAction;
            int hashCode2 = (hashCode + (action2 == null ? 0 : action2.hashCode())) * 31;
            AlertModel alertModel = this.exceededMaxAlert;
            int hashCode3 = (hashCode2 + (alertModel == null ? 0 : alertModel.hashCode())) * 31;
            String str = this.accessibilityLabel;
            return hashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = re$$ExternalSyntheticOutline0.m("Content(title=", this.title, ", selectedPercentageBps=", this.selectedPercentageBps);
            Boxes$$ExternalSyntheticOutline1.m(m, ", percentageDisplayText=", this.percentageDisplayText, ", percentageSubtitleText=", this.percentageSubtitleText);
            m.append(", pickerOptions=");
            m.append(this.pickerOptions);
            m.append(", primaryAction=");
            m.append(this.primaryAction);
            m.append(", secondaryAction=");
            m.append(this.secondaryAction);
            m.append(", exceededMaxAlert=");
            m.append(this.exceededMaxAlert);
            return Recorder$$ExternalSyntheticOutline2.m(m, ", accessibilityLabel=", this.accessibilityLabel, ")");
        }
    }

    public final class Loading implements BitcoinP2pConversionPercentageViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1632804059;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
