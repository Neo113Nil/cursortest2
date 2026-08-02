package com.squareup.cash.blockers.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.versioned.Versioned;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.common.countries.Country;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class InputCardInfoViewModel {

    public final class InitialLoading extends InputCardInfoViewModel {
        public static final InitialLoading INSTANCE = new InitialLoading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitialLoading);
        }

        public final int hashCode() {
            return 224000750;
        }

        public final String toString() {
            return "InitialLoading";
        }
    }

    public final class Loading extends InputCardInfoViewModel {
        public final String loadingMessage;

        public Loading(String str) {
            this.loadingMessage = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.loadingMessage, ((Loading) obj).loadingMessage);
        }

        public final int hashCode() {
            String str = this.loadingMessage;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(loadingMessage=", this.loadingMessage, ")");
        }
    }

    /* loaded from: classes5.dex */
    public final class Ready extends InputCardInfoViewModel {
        public final String cardNumberHint;
        public final int clearCardEditor;
        public final Versioned failureField;
        public final boolean showBackButton;
        public final boolean showNameField;
        public final boolean showPostalCodeField;
        public final boolean showScanCardIcon;
        public final TextContent textContent;

        public Ready(TextContent textContent, boolean z, String str, int i, Versioned versioned, boolean z2, boolean z3, boolean z4) {
            str.getClass();
            versioned.getClass();
            this.textContent = textContent;
            this.showBackButton = z;
            this.cardNumberHint = str;
            this.clearCardEditor = i;
            this.failureField = versioned;
            this.showNameField = z2;
            this.showPostalCodeField = z3;
            this.showScanCardIcon = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return this.textContent.equals(ready.textContent) && this.showBackButton == ready.showBackButton && Intrinsics.areEqual(this.cardNumberHint, ready.cardNumberHint) && this.clearCardEditor == ready.clearCardEditor && Intrinsics.areEqual(this.failureField, ready.failureField) && this.showNameField == ready.showNameField && this.showPostalCodeField == ready.showPostalCodeField && this.showScanCardIcon == ready.showScanCardIcon;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.showScanCardIcon) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.failureField.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.clearCardEditor, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.textContent.hashCode() * 31, 31, this.showBackButton), 31, this.cardNumberHint), 31)) * 31, 31, this.showNameField), 31, this.showPostalCodeField);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ready(textContent=");
            sb.append(this.textContent);
            sb.append(", showBackButton=");
            sb.append(this.showBackButton);
            sb.append(", cardNumberHint=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.cardNumberHint, ", clearCardEditor=", this.clearCardEditor, ", failureField=");
            sb.append(this.failureField);
            sb.append(", showNameField=");
            sb.append(this.showNameField);
            sb.append(", showPostalCodeField=");
            return Request$Priority$EnumUnboxingLocalUtility.m(sb, this.showPostalCodeField, ", showScanCardIcon=", this.showScanCardIcon, ")");
        }
    }

    /* loaded from: classes5.dex */
    public final class TextContent {
        public final Country countryCode;
        public final String postcode;
        public final String primaryButtonText;
        public final String secondaryButtonText;
        public final String securityFooterText;
        public final String subtitle;
        public final String title;

        public TextContent(String str, String str2, String str3, String str4, String str5, String str6, Country country) {
            re$$ExternalSyntheticOutline0.m1432m(str3, str5, str6);
            this.title = str;
            this.subtitle = str2;
            this.postcode = str3;
            this.secondaryButtonText = str4;
            this.primaryButtonText = str5;
            this.securityFooterText = str6;
            this.countryCode = country;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextContent)) {
                return false;
            }
            TextContent textContent = (TextContent) obj;
            return this.title.equals(textContent.title) && Intrinsics.areEqual(this.subtitle, textContent.subtitle) && Intrinsics.areEqual(this.postcode, textContent.postcode) && Intrinsics.areEqual(this.secondaryButtonText, textContent.secondaryButtonText) && Intrinsics.areEqual(this.primaryButtonText, textContent.primaryButtonText) && Intrinsics.areEqual(this.securityFooterText, textContent.securityFooterText) && this.countryCode == textContent.countryCode;
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.postcode);
            String str2 = this.secondaryButtonText;
            return this.countryCode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.primaryButtonText), 31, this.securityFooterText);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextContent(title=", this.title, ", subtitle=", this.subtitle, ", postcode=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.postcode, ", secondaryButtonText=", this.secondaryButtonText, ", primaryButtonText=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.primaryButtonText, ", securityFooterText=", this.securityFooterText, ", countryCode=");
            m.append(this.countryCode);
            m.append(")");
            return m.toString();
        }
    }
}
