package com.squareup.cash.prepurchasecashcard.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.credentials.Credential;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes7.dex */
public interface PrepurchaseCashCardPlanningViewModel {

    /* loaded from: classes6.dex */
    public interface ButtonAction {

        public final class ClientRoute implements ButtonAction {
            public final boolean dismissSheet;
            public final String url;

            public ClientRoute(String str, boolean z) {
                this.url = str;
                this.dismissSheet = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ClientRoute)) {
                    return false;
                }
                ClientRoute clientRoute = (ClientRoute) obj;
                return this.url.equals(clientRoute.url) && this.dismissSheet == clientRoute.dismissSheet;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.dismissSheet) + (this.url.hashCode() * 31);
            }

            public final String toString() {
                return Request$Priority$EnumUnboxingLocalUtility.m("ClientRoute(url=", this.url, ", dismissSheet=", ")", this.dismissSheet);
            }
        }

        public final class Dismiss implements ButtonAction {
            public static final Dismiss INSTANCE = new Dismiss();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Dismiss);
            }

            public final int hashCode() {
                return 77363884;
            }

            public final String toString() {
                return "Dismiss";
            }
        }

        public final class Toggle implements ButtonAction {
            public final String buttonId;
            public final boolean dismissSheet;
            public final ByteString opaqueRequestData;

            public Toggle(String str, ByteString byteString, boolean z) {
                this.buttonId = str;
                this.opaqueRequestData = byteString;
                this.dismissSheet = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Toggle)) {
                    return false;
                }
                Toggle toggle = (Toggle) obj;
                return this.buttonId.equals(toggle.buttonId) && Intrinsics.areEqual(this.opaqueRequestData, toggle.opaqueRequestData) && this.dismissSheet == toggle.dismissSheet;
            }

            public final int hashCode() {
                int hashCode = this.buttonId.hashCode() * 31;
                ByteString byteString = this.opaqueRequestData;
                return Boolean.hashCode(this.dismissSheet) + ((hashCode + (byteString == null ? 0 : byteString.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Toggle(buttonId=");
                sb.append(this.buttonId);
                sb.append(", opaqueRequestData=");
                sb.append(this.opaqueRequestData);
                sb.append(", dismissSheet=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.dismissSheet, ")");
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface LoadableButton {

        public final class Loaded implements LoadableButton {
            public final ButtonAction action;
            public final String text;

            public Loaded(String str, ButtonAction buttonAction) {
                str.getClass();
                this.text = str;
                this.action = buttonAction;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) obj;
                return Intrinsics.areEqual(this.text, loaded.text) && this.action.equals(loaded.action);
            }

            public final int hashCode() {
                return this.action.hashCode() + (this.text.hashCode() * 31);
            }

            public final String toString() {
                return "Loaded(text=" + this.text + ", action=" + this.action + ")";
            }
        }

        public final class Loading implements LoadableButton {
            public static final Loading INSTANCE = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 1512721384;
            }

            public final String toString() {
                return "Loading";
            }
        }

        public final class Waiting implements LoadableButton {
            public static final Waiting INSTANCE = new Waiting();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Waiting);
            }

            public final int hashCode() {
                return -2002583303;
            }

            public final String toString() {
                return "Waiting";
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface LoadableText {

        public final class Loaded implements LoadableText {
            public final String text;

            public Loaded(String str) {
                str.getClass();
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && Intrinsics.areEqual(this.text, ((Loaded) obj).text);
            }

            public final int hashCode() {
                return this.text.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(text=", this.text, ")");
            }
        }

        public final class Loading implements LoadableText {
            public static final Loading INSTANCE = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 1431830755;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    /* loaded from: classes6.dex */
    public final class Loading implements PrepurchaseCashCardPlanningViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        @Override // com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel
        public final PrepurchaseCardHomeSheet.LocaleToggle getLocaleToggle() {
            return null;
        }

        public final int hashCode() {
            return -2065204204;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* loaded from: classes6.dex */
    public final class PrepurchaseCardHomeSheet implements PrepurchaseCashCardPlanningViewModel {
        public final String footerText;
        public final ArrayList infoRows;
        public final String infoRowsHeader;
        public final LocaleToggle localeToggle;
        public final LoadableButton primaryFooterButton;
        public final LoadableButton secondaryFooterButton;
        public final LoadableText subtitle;
        public final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class ActionIconStyle {
            public static final /* synthetic */ ActionIconStyle[] $VALUES;
            public static final ActionIconStyle LEADING_INFO;
            public static final ActionIconStyle TRAILING_CARET;

            static {
                ActionIconStyle actionIconStyle = new ActionIconStyle("LEADING_INFO", 0);
                LEADING_INFO = actionIconStyle;
                ActionIconStyle actionIconStyle2 = new ActionIconStyle("TRAILING_CARET", 1);
                TRAILING_CARET = actionIconStyle2;
                $VALUES = new ActionIconStyle[]{actionIconStyle, actionIconStyle2};
            }

            public static ActionIconStyle valueOf(String str) {
                return (ActionIconStyle) Enum.valueOf(ActionIconStyle.class, str);
            }

            public static ActionIconStyle[] values() {
                return (ActionIconStyle[]) $VALUES.clone();
            }
        }

        public final class InfoRow {
            public final Credential action;
            public final String leadingText;
            public final LoadableText trailingText;

            public InfoRow(String str, LoadableText loadableText, Credential credential) {
                str.getClass();
                this.leadingText = str;
                this.trailingText = loadableText;
                this.action = credential;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InfoRow)) {
                    return false;
                }
                InfoRow infoRow = (InfoRow) obj;
                return Intrinsics.areEqual(this.leadingText, infoRow.leadingText) && Intrinsics.areEqual(this.trailingText, infoRow.trailingText) && Intrinsics.areEqual(this.action, infoRow.action);
            }

            public final int hashCode() {
                int hashCode = this.leadingText.hashCode() * 31;
                LoadableText loadableText = this.trailingText;
                int hashCode2 = (hashCode + (loadableText == null ? 0 : loadableText.hashCode())) * 31;
                Credential credential = this.action;
                return hashCode2 + (credential != null ? credential.hashCode() : 0);
            }

            public final String toString() {
                return "InfoRow(leadingText=" + this.leadingText + ", trailingText=" + this.trailingText + ", action=" + this.action + ")";
            }
        }

        public final class LocaleToggle {
            public final ArrayList locales;
            public final int selectedLocaleIndex;

            public LocaleToggle(int i, ArrayList arrayList) {
                this.locales = arrayList;
                this.selectedLocaleIndex = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LocaleToggle)) {
                    return false;
                }
                LocaleToggle localeToggle = (LocaleToggle) obj;
                return this.locales.equals(localeToggle.locales) && this.selectedLocaleIndex == localeToggle.selectedLocaleIndex;
            }

            public final int hashCode() {
                return Integer.hashCode(this.selectedLocaleIndex) + (this.locales.hashCode() * 31);
            }

            public final String toString() {
                return "LocaleToggle(locales=" + this.locales + ", selectedLocaleIndex=" + this.selectedLocaleIndex + ")";
            }
        }

        public PrepurchaseCardHomeSheet(LocaleToggle localeToggle, String str, LoadableText loadableText, String str2, ArrayList arrayList, String str3, LoadableButton loadableButton, LoadableButton loadableButton2) {
            this.localeToggle = localeToggle;
            this.title = str;
            this.subtitle = loadableText;
            this.infoRowsHeader = str2;
            this.infoRows = arrayList;
            this.footerText = str3;
            this.primaryFooterButton = loadableButton;
            this.secondaryFooterButton = loadableButton2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrepurchaseCardHomeSheet)) {
                return false;
            }
            PrepurchaseCardHomeSheet prepurchaseCardHomeSheet = (PrepurchaseCardHomeSheet) obj;
            return Intrinsics.areEqual(this.localeToggle, prepurchaseCardHomeSheet.localeToggle) && this.title.equals(prepurchaseCardHomeSheet.title) && Intrinsics.areEqual(this.subtitle, prepurchaseCardHomeSheet.subtitle) && Intrinsics.areEqual(this.infoRowsHeader, prepurchaseCardHomeSheet.infoRowsHeader) && this.infoRows.equals(prepurchaseCardHomeSheet.infoRows) && Intrinsics.areEqual(this.footerText, prepurchaseCardHomeSheet.footerText) && Intrinsics.areEqual(this.primaryFooterButton, prepurchaseCardHomeSheet.primaryFooterButton) && Intrinsics.areEqual(this.secondaryFooterButton, prepurchaseCardHomeSheet.secondaryFooterButton);
        }

        @Override // com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel
        public final LocaleToggle getLocaleToggle() {
            return this.localeToggle;
        }

        public final int hashCode() {
            LocaleToggle localeToggle = this.localeToggle;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((localeToggle == null ? 0 : localeToggle.hashCode()) * 31, 31, this.title);
            LoadableText loadableText = this.subtitle;
            int hashCode = (m + (loadableText == null ? 0 : loadableText.hashCode())) * 31;
            String str = this.infoRowsHeader;
            int m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.infoRows, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            String str2 = this.footerText;
            int hashCode2 = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            LoadableButton loadableButton = this.primaryFooterButton;
            int hashCode3 = (hashCode2 + (loadableButton == null ? 0 : loadableButton.hashCode())) * 31;
            LoadableButton loadableButton2 = this.secondaryFooterButton;
            return hashCode3 + (loadableButton2 != null ? loadableButton2.hashCode() : 0);
        }

        public final String toString() {
            return "PrepurchaseCardHomeSheet(localeToggle=" + this.localeToggle + ", title=" + this.title + ", subtitle=" + this.subtitle + ", infoRowsHeader=" + this.infoRowsHeader + ", infoRows=" + this.infoRows + ", footerText=" + this.footerText + ", primaryFooterButton=" + this.primaryFooterButton + ", secondaryFooterButton=" + this.secondaryFooterButton + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class PrepurchaseCardInfoSheet implements PrepurchaseCashCardPlanningViewModel {
        public final PrepurchaseCardHomeSheet.LocaleToggle localeToggle;
        public final String primaryButtonText;
        public final ArrayList textBlocks;
        public final String title;

        public final class TextBlock {
            public final String body;
            public final String label;
            public final ArrayList listItems;

            public TextBlock(String str, String str2, ArrayList arrayList) {
                this.label = str;
                this.body = str2;
                this.listItems = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TextBlock)) {
                    return false;
                }
                TextBlock textBlock = (TextBlock) obj;
                return Intrinsics.areEqual(this.label, textBlock.label) && Intrinsics.areEqual(this.body, textBlock.body) && this.listItems.equals(textBlock.listItems);
            }

            public final int hashCode() {
                String str = this.label;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.body;
                return this.listItems.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return Recorder$$ExternalSyntheticOutline1.m(")", JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextBlock(label=", this.label, ", body=", this.body, ", listItems="), this.listItems);
            }
        }

        public final class TextBlockListItem {
            public final String leadingText;
            public final Style style;
            public final String trailingText;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Style {
                public static final /* synthetic */ Style[] $VALUES;
                public static final Style Prominent;
                public static final Style Standard;

                static {
                    Style style = new Style("Standard", 0);
                    Standard = style;
                    Style style2 = new Style("Prominent", 1);
                    Prominent = style2;
                    $VALUES = new Style[]{style, style2};
                }

                public static Style valueOf(String str) {
                    return (Style) Enum.valueOf(Style.class, str);
                }

                public static Style[] values() {
                    return (Style[]) $VALUES.clone();
                }
            }

            public TextBlockListItem(String str, String str2, Style style) {
                str.getClass();
                this.leadingText = str;
                this.trailingText = str2;
                this.style = style;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TextBlockListItem)) {
                    return false;
                }
                TextBlockListItem textBlockListItem = (TextBlockListItem) obj;
                return Intrinsics.areEqual(this.leadingText, textBlockListItem.leadingText) && Intrinsics.areEqual(this.trailingText, textBlockListItem.trailingText) && this.style == textBlockListItem.style;
            }

            public final int hashCode() {
                int hashCode = this.leadingText.hashCode() * 31;
                String str = this.trailingText;
                return this.style.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TextBlockListItem(leadingText=", this.leadingText, ", trailingText=", this.trailingText, ", style=");
                m.append(this.style);
                m.append(")");
                return m.toString();
            }
        }

        public PrepurchaseCardInfoSheet(PrepurchaseCardHomeSheet.LocaleToggle localeToggle, String str, ArrayList arrayList, String str2) {
            str.getClass();
            this.localeToggle = localeToggle;
            this.title = str;
            this.textBlocks = arrayList;
            this.primaryButtonText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrepurchaseCardInfoSheet)) {
                return false;
            }
            PrepurchaseCardInfoSheet prepurchaseCardInfoSheet = (PrepurchaseCardInfoSheet) obj;
            if (!Intrinsics.areEqual(this.localeToggle, prepurchaseCardInfoSheet.localeToggle) || !Intrinsics.areEqual(this.title, prepurchaseCardInfoSheet.title) || !this.textBlocks.equals(prepurchaseCardInfoSheet.textBlocks) || !Intrinsics.areEqual(this.primaryButtonText, prepurchaseCardInfoSheet.primaryButtonText)) {
                return false;
            }
            ButtonAction.Dismiss dismiss = ButtonAction.Dismiss.INSTANCE;
            return dismiss.equals(dismiss);
        }

        @Override // com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel
        public final PrepurchaseCardHomeSheet.LocaleToggle getLocaleToggle() {
            return this.localeToggle;
        }

        public final int hashCode() {
            PrepurchaseCardHomeSheet.LocaleToggle localeToggle = this.localeToggle;
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.textBlocks, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((localeToggle == null ? 0 : localeToggle.hashCode()) * 31, 31, this.title), 31);
            String str = this.primaryButtonText;
            return ((m + (str != null ? str.hashCode() : 0)) * 31) + 77363884;
        }

        public final String toString() {
            return "PrepurchaseCardInfoSheet(localeToggle=" + this.localeToggle + ", title=" + this.title + ", textBlocks=" + this.textBlocks + ", primaryButtonText=" + this.primaryButtonText + ", primaryButtonAction=" + ButtonAction.Dismiss.INSTANCE + ")";
        }
    }

    /* loaded from: classes6.dex */
    public final class PrepurchaseCardPaymentPlanOptionsSheet implements PrepurchaseCashCardPlanningViewModel {
        public final PrepurchaseCardHomeSheet.LocaleToggle localeToggle;
        public final ArrayList options;
        public final String primaryButtonText;
        public final String subtitle;
        public final String title;

        public final class Option {
            public final String identifier;
            public final boolean selected;
            public final String subtitle;
            public final String title;

            public Option(String str, String str2, String str3, boolean z) {
                str.getClass();
                str2.getClass();
                this.identifier = str;
                this.title = str2;
                this.subtitle = str3;
                this.selected = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Option)) {
                    return false;
                }
                Option option = (Option) obj;
                return Intrinsics.areEqual(this.identifier, option.identifier) && Intrinsics.areEqual(this.title, option.title) && Intrinsics.areEqual(this.subtitle, option.subtitle) && this.selected == option.selected;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.identifier.hashCode() * 31, 31, this.title);
                String str = this.subtitle;
                return Boolean.hashCode(this.selected) + ((m + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                return re$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Option(identifier=", this.identifier, ", title=", this.title, ", subtitle="), this.subtitle, ", selected=", this.selected, ")");
            }
        }

        public PrepurchaseCardPaymentPlanOptionsSheet(PrepurchaseCardHomeSheet.LocaleToggle localeToggle, String str, String str2, ArrayList arrayList, String str3) {
            str.getClass();
            str3.getClass();
            this.localeToggle = localeToggle;
            this.title = str;
            this.subtitle = str2;
            this.options = arrayList;
            this.primaryButtonText = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrepurchaseCardPaymentPlanOptionsSheet)) {
                return false;
            }
            PrepurchaseCardPaymentPlanOptionsSheet prepurchaseCardPaymentPlanOptionsSheet = (PrepurchaseCardPaymentPlanOptionsSheet) obj;
            if (!Intrinsics.areEqual(this.localeToggle, prepurchaseCardPaymentPlanOptionsSheet.localeToggle) || !Intrinsics.areEqual(this.title, prepurchaseCardPaymentPlanOptionsSheet.title) || !Intrinsics.areEqual(this.subtitle, prepurchaseCardPaymentPlanOptionsSheet.subtitle) || !this.options.equals(prepurchaseCardPaymentPlanOptionsSheet.options) || !Intrinsics.areEqual(this.primaryButtonText, prepurchaseCardPaymentPlanOptionsSheet.primaryButtonText)) {
                return false;
            }
            ButtonAction.Dismiss dismiss = ButtonAction.Dismiss.INSTANCE;
            return dismiss.equals(dismiss);
        }

        @Override // com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel
        public final PrepurchaseCardHomeSheet.LocaleToggle getLocaleToggle() {
            return this.localeToggle;
        }

        public final int hashCode() {
            PrepurchaseCardHomeSheet.LocaleToggle localeToggle = this.localeToggle;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((localeToggle == null ? 0 : localeToggle.hashCode()) * 31, 31, this.title);
            String str = this.subtitle;
            return ((this.primaryButtonText.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.options, (m + (str != null ? str.hashCode() : 0)) * 31, 31)) * 31) + 77363884;
        }

        public final String toString() {
            return "PrepurchaseCardPaymentPlanOptionsSheet(localeToggle=" + this.localeToggle + ", title=" + this.title + ", subtitle=" + this.subtitle + ", options=" + this.options + ", primaryButtonText=" + this.primaryButtonText + ", primaryButtonAction=" + ButtonAction.Dismiss.INSTANCE + ")";
        }
    }

    PrepurchaseCardHomeSheet.LocaleToggle getLocaleToggle();
}
