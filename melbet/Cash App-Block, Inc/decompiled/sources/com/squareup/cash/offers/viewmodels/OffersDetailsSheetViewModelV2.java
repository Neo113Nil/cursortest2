package com.squareup.cash.offers.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.offers.viewmodels.viewevents.OffersDetailsSheetViewEventV2;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface OffersDetailsSheetViewModelV2 {

    public final class Loaded implements OffersDetailsSheetViewModelV2 {
        public final StackedAvatarViewModel avatar;
        public final OfferDetailsButton button;
        public final ArrayList details;
        public final GreenStatusSection greenUpsellSection;
        public final String title;

        public final class GreenStatusSection {
            public final GreenStatusIcon icon;
            public final OffersDetailsSheetViewEventV2 linkEvent;
            public final String linkText;
            public final String subtitle;
            public final String title;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* loaded from: classes7.dex */
            public final class GreenStatusIcon {
                public static final /* synthetic */ GreenStatusIcon[] $VALUES;
                public static final GreenStatusIcon GREEN_RECTANGLE;
                public static final GreenStatusIcon MAGIC;

                static {
                    GreenStatusIcon greenStatusIcon = new GreenStatusIcon("MAGIC", 0);
                    MAGIC = greenStatusIcon;
                    GreenStatusIcon greenStatusIcon2 = new GreenStatusIcon("GREEN_RECTANGLE", 1);
                    GREEN_RECTANGLE = greenStatusIcon2;
                    $VALUES = new GreenStatusIcon[]{greenStatusIcon, greenStatusIcon2};
                }

                public static GreenStatusIcon valueOf(String str) {
                    return (GreenStatusIcon) Enum.valueOf(GreenStatusIcon.class, str);
                }

                public static GreenStatusIcon[] values() {
                    return (GreenStatusIcon[]) $VALUES.clone();
                }
            }

            public GreenStatusSection(GreenStatusIcon greenStatusIcon, String str, String str2, String str3, OffersDetailsSheetViewEventV2 offersDetailsSheetViewEventV2) {
                str.getClass();
                str3.getClass();
                this.icon = greenStatusIcon;
                this.title = str;
                this.subtitle = str2;
                this.linkText = str3;
                this.linkEvent = offersDetailsSheetViewEventV2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GreenStatusSection)) {
                    return false;
                }
                GreenStatusSection greenStatusSection = (GreenStatusSection) obj;
                return this.icon == greenStatusSection.icon && Intrinsics.areEqual(this.title, greenStatusSection.title) && this.subtitle.equals(greenStatusSection.subtitle) && Intrinsics.areEqual(this.linkText, greenStatusSection.linkText) && this.linkEvent.equals(greenStatusSection.linkEvent);
            }

            public final int hashCode() {
                return this.linkEvent.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.linkText);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GreenStatusSection(icon=");
                sb.append(this.icon);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", subtitle=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.subtitle, ", linkText=", this.linkText, ", linkEvent=");
                sb.append(this.linkEvent);
                sb.append(")");
                return sb.toString();
            }
        }

        public final class OfferDetailRow {
            public final Icons icon;
            public final String text;

            public OfferDetailRow(Icons icons, String str) {
                str.getClass();
                this.icon = icons;
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OfferDetailRow)) {
                    return false;
                }
                OfferDetailRow offerDetailRow = (OfferDetailRow) obj;
                return this.icon == offerDetailRow.icon && Intrinsics.areEqual(this.text, offerDetailRow.text);
            }

            public final int hashCode() {
                return this.text.hashCode() + (this.icon.hashCode() * 31);
            }

            public final String toString() {
                return "OfferDetailRow(icon=" + this.icon + ", text=" + this.text + ")";
            }
        }

        public interface OfferDetailsButton {

            /* loaded from: classes7.dex */
            public final class Loading implements OfferDetailsButton {
                public static final Loading INSTANCE = new Loading();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Loading);
                }

                public final int hashCode() {
                    return 437386035;
                }

                public final String toString() {
                    return "Loading";
                }
            }

            public final class MessageText implements OfferDetailsButton {
                public final String text;

                public MessageText(String str) {
                    str.getClass();
                    this.text = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof MessageText) && Intrinsics.areEqual(this.text, ((MessageText) obj).text);
                }

                public final int hashCode() {
                    return this.text.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MessageText(text=", this.text, ")");
                }
            }

            public final class Standard implements OfferDetailsButton {
                public final OfferStandardButton primaryButton;
                public final OfferStandardButton secondaryButton;

                public final class OfferStandardButton {
                    public final OffersDetailsSheetViewEventV2 event;
                    public final String text;

                    public OfferStandardButton(String str, OffersDetailsSheetViewEventV2 offersDetailsSheetViewEventV2) {
                        str.getClass();
                        this.text = str;
                        this.event = offersDetailsSheetViewEventV2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof OfferStandardButton)) {
                            return false;
                        }
                        OfferStandardButton offerStandardButton = (OfferStandardButton) obj;
                        return Intrinsics.areEqual(this.text, offerStandardButton.text) && this.event.equals(offerStandardButton.event);
                    }

                    public final int hashCode() {
                        return this.event.hashCode() + (this.text.hashCode() * 31);
                    }

                    public final String toString() {
                        return "OfferStandardButton(text=" + this.text + ", event=" + this.event + ")";
                    }
                }

                public Standard(OfferStandardButton offerStandardButton, OfferStandardButton offerStandardButton2) {
                    this.primaryButton = offerStandardButton;
                    this.secondaryButton = offerStandardButton2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Standard)) {
                        return false;
                    }
                    Standard standard = (Standard) obj;
                    return this.primaryButton.equals(standard.primaryButton) && Intrinsics.areEqual(this.secondaryButton, standard.secondaryButton);
                }

                public final int hashCode() {
                    int hashCode = this.primaryButton.hashCode() * 31;
                    OfferStandardButton offerStandardButton = this.secondaryButton;
                    return hashCode + (offerStandardButton == null ? 0 : offerStandardButton.hashCode());
                }

                public final String toString() {
                    return "Standard(primaryButton=" + this.primaryButton + ", secondaryButton=" + this.secondaryButton + ")";
                }
            }
        }

        public Loaded(StackedAvatarViewModel stackedAvatarViewModel, String str, ArrayList arrayList, GreenStatusSection greenStatusSection, OfferDetailsButton offerDetailsButton) {
            str.getClass();
            this.avatar = stackedAvatarViewModel;
            this.title = str;
            this.details = arrayList;
            this.greenUpsellSection = greenStatusSection;
            this.button = offerDetailsButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.avatar.equals(loaded.avatar) && Intrinsics.areEqual(this.title, loaded.title) && this.details.equals(loaded.details) && Intrinsics.areEqual(this.greenUpsellSection, loaded.greenUpsellSection) && this.button.equals(loaded.button);
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.details, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatar.hashCode() * 31, 31, this.title), 31);
            GreenStatusSection greenStatusSection = this.greenUpsellSection;
            return this.button.hashCode() + ((m + (greenStatusSection == null ? 0 : greenStatusSection.hashCode())) * 31);
        }

        public final String toString() {
            return "Loaded(avatar=" + this.avatar + ", title=" + this.title + ", details=" + this.details + ", greenUpsellSection=" + this.greenUpsellSection + ", button=" + this.button + ")";
        }
    }

    public final class Loading implements OffersDetailsSheetViewModelV2 {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 360598912;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
