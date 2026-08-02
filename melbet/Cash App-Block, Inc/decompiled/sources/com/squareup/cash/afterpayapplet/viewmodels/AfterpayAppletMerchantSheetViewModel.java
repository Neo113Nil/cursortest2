package com.squareup.cash.afterpayapplet.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletAnalyticsEventsSpec;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes5.dex */
public interface AfterpayAppletMerchantSheetViewModel {

    public final class Error implements AfterpayAppletMerchantSheetViewModel {
        public final String buttonText;
        public final String title;

        public Error(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.buttonText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.title, error.title) && Intrinsics.areEqual(this.buttonText, error.buttonText);
        }

        public final int hashCode() {
            return this.buttonText.hashCode() + (this.title.hashCode() * 961);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Error(title=", this.title, ", subtitle=, buttonText=", this.buttonText, ")");
        }
    }

    public final class Loaded implements AfterpayAppletMerchantSheetViewModel {
        public final AfterpayAppletAnalyticsEventsSpec analyticsAppearEvent;
        public final AfterpayAppletAnalyticsEventsSpec analyticsDismissEvent;
        public final StackedAvatarViewModel.Avatar avatar;
        public final ButtonModel button;
        public final List linesToCopy;
        public final String subtitle;
        public final String title;

        public final class ButtonModel {
            public final ButtonProminence buttonProminence;
            public final Tap tapAction;
            public final String title;

            public ButtonModel(String str, Tap tap, ButtonProminence buttonProminence) {
                buttonProminence.getClass();
                this.title = str;
                this.tapAction = tap;
                this.buttonProminence = buttonProminence;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ButtonModel)) {
                    return false;
                }
                ButtonModel buttonModel = (ButtonModel) obj;
                return this.title.equals(buttonModel.title) && this.tapAction.equals(buttonModel.tapAction) && this.buttonProminence == buttonModel.buttonProminence;
            }

            public final int hashCode() {
                return this.buttonProminence.hashCode() + ((this.tapAction.hashCode() + (this.title.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "ButtonModel(title=" + this.title + ", tapAction=" + this.tapAction + ", buttonProminence=" + this.buttonProminence + ")";
            }
        }

        public Loaded(String str, String str2, StackedAvatarViewModel.Avatar avatar, ButtonModel buttonModel, List list, AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec, AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec2) {
            avatar.getClass();
            list.getClass();
            this.title = str;
            this.subtitle = str2;
            this.avatar = avatar;
            this.button = buttonModel;
            this.linesToCopy = list;
            this.analyticsAppearEvent = afterpayAppletAnalyticsEventsSpec;
            this.analyticsDismissEvent = afterpayAppletAnalyticsEventsSpec2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.title.equals(loaded.title) && this.subtitle.equals(loaded.subtitle) && Intrinsics.areEqual(this.avatar, loaded.avatar) && this.button.equals(loaded.button) && Intrinsics.areEqual(this.linesToCopy, loaded.linesToCopy) && Intrinsics.areEqual(this.analyticsAppearEvent, loaded.analyticsAppearEvent) && Intrinsics.areEqual(this.analyticsDismissEvent, loaded.analyticsDismissEvent);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m((this.button.hashCode() + ((this.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle)) * 31)) * 31, 31, this.linesToCopy);
            AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec = this.analyticsAppearEvent;
            int hashCode = (m + (afterpayAppletAnalyticsEventsSpec == null ? 0 : afterpayAppletAnalyticsEventsSpec.hashCode())) * 31;
            AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec2 = this.analyticsDismissEvent;
            return hashCode + (afterpayAppletAnalyticsEventsSpec2 != null ? afterpayAppletAnalyticsEventsSpec2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(title=", this.title, ", subtitle=", this.subtitle, ", avatar=");
            m.append(this.avatar);
            m.append(", button=");
            m.append(this.button);
            m.append(", linesToCopy=");
            m.append(this.linesToCopy);
            m.append(", analyticsAppearEvent=");
            m.append(this.analyticsAppearEvent);
            m.append(", analyticsDismissEvent=");
            m.append(this.analyticsDismissEvent);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements AfterpayAppletMerchantSheetViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1116730006;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
