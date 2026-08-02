package com.squareup.cash.merchant.backend.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes6.dex */
public final class BlockedBusinessesUiConfig {
    public final String customerToken;
    public final ErrorMessage errorMessage;
    public final HelpButton helpButton;
    public final ArrayList sections;

    public final class ErrorMessage {
        public final String buttonTitle;
        public final String message;
        public final String title;

        public ErrorMessage(String str, String str2, String str3) {
            this.title = str;
            this.message = str2;
            this.buttonTitle = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorMessage)) {
                return false;
            }
            ErrorMessage errorMessage = (ErrorMessage) obj;
            return Intrinsics.areEqual(this.title, errorMessage.title) && this.message.equals(errorMessage.message) && Intrinsics.areEqual(this.buttonTitle, errorMessage.buttonTitle);
        }

        public final int hashCode() {
            String str = this.title;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.message);
            String str2 = this.buttonTitle;
            return m + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ErrorMessage(title=", this.title, ", message=", this.message, ", buttonTitle="), this.buttonTitle, ")");
        }
    }

    public final class HelpButton {
        public final String accessibilityText;
        public final String clientRoute;
        public final CdfEvent event;

        public HelpButton(String str, String str2, CdfEvent cdfEvent) {
            str.getClass();
            this.clientRoute = str;
            this.accessibilityText = str2;
            this.event = cdfEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HelpButton)) {
                return false;
            }
            HelpButton helpButton = (HelpButton) obj;
            return Intrinsics.areEqual(this.clientRoute, helpButton.clientRoute) && this.accessibilityText.equals(helpButton.accessibilityText) && Intrinsics.areEqual(this.event, helpButton.event);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.clientRoute.hashCode() * 31, 31, this.accessibilityText);
            CdfEvent cdfEvent = this.event;
            return m + (cdfEvent == null ? 0 : cdfEvent.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("HelpButton(clientRoute=", this.clientRoute, ", accessibilityText=", this.accessibilityText, ", event=");
            m.append(this.event);
            m.append(")");
            return m.toString();
        }
    }

    public final class SectionConfig {
        public final ArrayList merchants;
        public final String title;

        public final class MerchantRow {
            public final UiAvatar avatar;
            public final String buttonClientRoute;
            public final CdfEvent buttonEvent;
            public final String buttonTitle;
            public final Color buttonTitleColor;
            public final String clientRoute;
            public final String name;
            public final String token;

            public MerchantRow(String str, String str2, UiAvatar uiAvatar, String str3, String str4, Color color, String str5, CdfEvent cdfEvent) {
                str.getClass();
                str2.getClass();
                uiAvatar.getClass();
                str3.getClass();
                str5.getClass();
                this.token = str;
                this.name = str2;
                this.avatar = uiAvatar;
                this.clientRoute = str3;
                this.buttonTitle = str4;
                this.buttonTitleColor = color;
                this.buttonClientRoute = str5;
                this.buttonEvent = cdfEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MerchantRow)) {
                    return false;
                }
                MerchantRow merchantRow = (MerchantRow) obj;
                return Intrinsics.areEqual(this.token, merchantRow.token) && Intrinsics.areEqual(this.name, merchantRow.name) && Intrinsics.areEqual(this.avatar, merchantRow.avatar) && Intrinsics.areEqual(this.clientRoute, merchantRow.clientRoute) && this.buttonTitle.equals(merchantRow.buttonTitle) && Intrinsics.areEqual(this.buttonTitleColor, merchantRow.buttonTitleColor) && Intrinsics.areEqual(this.buttonClientRoute, merchantRow.buttonClientRoute) && Intrinsics.areEqual(this.buttonEvent, merchantRow.buttonEvent);
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name)) * 31, 31, this.clientRoute), 31, this.buttonTitle);
                Color color = this.buttonTitleColor;
                int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (color == null ? 0 : color.hashCode())) * 31, 31, this.buttonClientRoute);
                CdfEvent cdfEvent = this.buttonEvent;
                return m2 + (cdfEvent != null ? cdfEvent.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MerchantRow(token=", this.token, ", name=", this.name, ", avatar=");
                m.append(this.avatar);
                m.append(", clientRoute=");
                m.append(this.clientRoute);
                m.append(", buttonTitle=");
                m.append(this.buttonTitle);
                m.append(", buttonTitleColor=");
                m.append(this.buttonTitleColor);
                m.append(", buttonClientRoute=");
                m.append(this.buttonClientRoute);
                m.append(", buttonEvent=");
                m.append(this.buttonEvent);
                m.append(")");
                return m.toString();
            }
        }

        public SectionConfig(String str, ArrayList arrayList) {
            this.title = str;
            this.merchants = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionConfig)) {
                return false;
            }
            SectionConfig sectionConfig = (SectionConfig) obj;
            return this.title.equals(sectionConfig.title) && this.merchants.equals(sectionConfig.merchants);
        }

        public final int hashCode() {
            return this.merchants.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(this.merchants, "SectionConfig(title=", this.title, ", merchants=", ")");
        }
    }

    public BlockedBusinessesUiConfig(String str, ArrayList arrayList, HelpButton helpButton, ErrorMessage errorMessage) {
        str.getClass();
        this.customerToken = str;
        this.sections = arrayList;
        this.helpButton = helpButton;
        this.errorMessage = errorMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockedBusinessesUiConfig)) {
            return false;
        }
        BlockedBusinessesUiConfig blockedBusinessesUiConfig = (BlockedBusinessesUiConfig) obj;
        return Intrinsics.areEqual(this.customerToken, blockedBusinessesUiConfig.customerToken) && this.sections.equals(blockedBusinessesUiConfig.sections) && this.helpButton.equals(blockedBusinessesUiConfig.helpButton) && Intrinsics.areEqual(this.errorMessage, blockedBusinessesUiConfig.errorMessage);
    }

    public final int hashCode() {
        int hashCode = (this.helpButton.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.sections, this.customerToken.hashCode() * 31, 31)) * 31;
        ErrorMessage errorMessage = this.errorMessage;
        return hashCode + (errorMessage == null ? 0 : errorMessage.hashCode());
    }

    public final String toString() {
        StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.sections, "BlockedBusinessesUiConfig(customerToken=", this.customerToken, ", sections=", ", helpButton=");
        m.append(this.helpButton);
        m.append(", errorMessage=");
        m.append(this.errorMessage);
        m.append(")");
        return m.toString();
    }
}
