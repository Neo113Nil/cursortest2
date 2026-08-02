package com.squareup.cash.afterpayapplet.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.ui.arcade.elements.ButtonProminence;

/* loaded from: classes5.dex */
public final class AfterpayAppletUpsellCardViewModel {
    public final String actionUrl;
    public final CallToAction callToAction;
    public final String subtitle;
    public final List tapAnalyticsEventSpecs;
    public final String title;
    public final TrailingContent trailingContent;
    public final String viewAnalyticsEventSpec;

    public final class ButtonViewModel {
        public final String actionUrl;
        public final List analyticsEventSpecs;
        public final ButtonProminence prominence;
        public final String title;

        public ButtonViewModel(String str, ButtonProminence buttonProminence, String str2, List list) {
            buttonProminence.getClass();
            list.getClass();
            this.title = str;
            this.prominence = buttonProminence;
            this.actionUrl = str2;
            this.analyticsEventSpecs = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonViewModel)) {
                return false;
            }
            ButtonViewModel buttonViewModel = (ButtonViewModel) obj;
            return this.title.equals(buttonViewModel.title) && this.prominence == buttonViewModel.prominence && Intrinsics.areEqual(this.actionUrl, buttonViewModel.actionUrl) && Intrinsics.areEqual(this.analyticsEventSpecs, buttonViewModel.analyticsEventSpecs);
        }

        public final int hashCode() {
            int hashCode = (this.prominence.hashCode() + (this.title.hashCode() * 31)) * 31;
            String str = this.actionUrl;
            return this.analyticsEventSpecs.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "ButtonViewModel(title=" + this.title + ", prominence=" + this.prominence + ", actionUrl=" + this.actionUrl + ", analyticsEventSpecs=" + this.analyticsEventSpecs + ")";
        }
    }

    public interface CallToAction {

        public final class Button implements CallToAction {
            public final ButtonViewModel button;

            public Button(ButtonViewModel buttonViewModel) {
                this.button = buttonViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Button) && this.button.equals(((Button) obj).button);
            }

            public final int hashCode() {
                return this.button.hashCode();
            }

            public final String toString() {
                return "Button(button=" + this.button + ")";
            }
        }

        public final class Text implements CallToAction {
            public final String text;

            public Text(String str) {
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Text) && this.text.equals(((Text) obj).text);
            }

            public final int hashCode() {
                return this.text.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Text(text=", this.text, ")");
            }
        }
    }

    public interface TrailingContent {

        public final class LogoStack implements TrailingContent {
            public final ArrayList avatars;
            public final boolean showsBackground;

            public LogoStack(ArrayList arrayList, boolean z) {
                this.avatars = arrayList;
                this.showsBackground = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LogoStack)) {
                    return false;
                }
                LogoStack logoStack = (LogoStack) obj;
                return this.avatars.equals(logoStack.avatars) && this.showsBackground == logoStack.showsBackground;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.showsBackground) + (this.avatars.hashCode() * 31);
            }

            public final String toString() {
                return "LogoStack(avatars=" + this.avatars + ", showsBackground=" + this.showsBackground + ")";
            }
        }

        public final class TrailingImage implements TrailingContent {
            public final Image image;
            public final boolean showsBackground;

            public TrailingImage(Image image, boolean z) {
                this.image = image;
                this.showsBackground = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TrailingImage)) {
                    return false;
                }
                TrailingImage trailingImage = (TrailingImage) obj;
                return this.image.equals(trailingImage.image) && this.showsBackground == trailingImage.showsBackground;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.showsBackground) + (this.image.hashCode() * 31);
            }

            public final String toString() {
                return "TrailingImage(image=" + this.image + ", showsBackground=" + this.showsBackground + ")";
            }
        }
    }

    public AfterpayAppletUpsellCardViewModel(String str, String str2, CallToAction callToAction, TrailingContent trailingContent, String str3, List list, String str4) {
        list.getClass();
        this.title = str;
        this.subtitle = str2;
        this.callToAction = callToAction;
        this.trailingContent = trailingContent;
        this.actionUrl = str3;
        this.tapAnalyticsEventSpecs = list;
        this.viewAnalyticsEventSpec = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletUpsellCardViewModel)) {
            return false;
        }
        AfterpayAppletUpsellCardViewModel afterpayAppletUpsellCardViewModel = (AfterpayAppletUpsellCardViewModel) obj;
        return this.title.equals(afterpayAppletUpsellCardViewModel.title) && Intrinsics.areEqual(this.subtitle, afterpayAppletUpsellCardViewModel.subtitle) && Intrinsics.areEqual(this.callToAction, afterpayAppletUpsellCardViewModel.callToAction) && Intrinsics.areEqual(this.trailingContent, afterpayAppletUpsellCardViewModel.trailingContent) && Intrinsics.areEqual(this.actionUrl, afterpayAppletUpsellCardViewModel.actionUrl) && Intrinsics.areEqual(this.tapAnalyticsEventSpecs, afterpayAppletUpsellCardViewModel.tapAnalyticsEventSpecs) && Intrinsics.areEqual(this.viewAnalyticsEventSpec, afterpayAppletUpsellCardViewModel.viewAnalyticsEventSpec);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CallToAction callToAction = this.callToAction;
        int hashCode3 = (hashCode2 + (callToAction == null ? 0 : callToAction.hashCode())) * 31;
        TrailingContent trailingContent = this.trailingContent;
        int hashCode4 = (hashCode3 + (trailingContent == null ? 0 : trailingContent.hashCode())) * 31;
        String str2 = this.actionUrl;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.tapAnalyticsEventSpecs);
        String str3 = this.viewAnalyticsEventSpec;
        return m + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayAppletUpsellCardViewModel(title=", this.title, ", subtitle=", this.subtitle, ", callToAction=");
        m.append(this.callToAction);
        m.append(", trailingContent=");
        m.append(this.trailingContent);
        m.append(", actionUrl=");
        NavAction$$ExternalSyntheticOutline0.m(this.actionUrl, ", tapAnalyticsEventSpecs=", ", viewAnalyticsEventSpec=", m, this.tapAnalyticsEventSpecs);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.viewAnalyticsEventSpec, ")");
    }
}
