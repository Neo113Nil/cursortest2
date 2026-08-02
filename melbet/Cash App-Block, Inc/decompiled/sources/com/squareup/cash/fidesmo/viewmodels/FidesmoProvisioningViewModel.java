package com.squareup.cash.fidesmo.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.knotapi.knot.utilities.Constants;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes6.dex */
public interface FidesmoProvisioningViewModel {

    public final class Activating implements FidesmoProvisioningViewModel {
        public final Button button;
        public final boolean connected;
        public final String deviceDisplayName;
        public final FidesmoScanningPulseShape pulseShape;
        public final ScanningStarPlacement starPlacement;
        public final String title;
        public final float verifiedStableConnectionPercent;

        public Activating(String str, boolean z, float f, Button button, String str2, ScanningStarPlacement scanningStarPlacement, FidesmoScanningPulseShape fidesmoScanningPulseShape) {
            str.getClass();
            str2.getClass();
            scanningStarPlacement.getClass();
            fidesmoScanningPulseShape.getClass();
            this.title = str;
            this.connected = z;
            this.verifiedStableConnectionPercent = f;
            this.button = button;
            this.deviceDisplayName = str2;
            this.starPlacement = scanningStarPlacement;
            this.pulseShape = fidesmoScanningPulseShape;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activating)) {
                return false;
            }
            Activating activating = (Activating) obj;
            return Intrinsics.areEqual(this.title, activating.title) && this.connected == activating.connected && Float.compare(this.verifiedStableConnectionPercent, activating.verifiedStableConnectionPercent) == 0 && Intrinsics.areEqual(this.button, activating.button) && Intrinsics.areEqual(this.deviceDisplayName, activating.deviceDisplayName) && Intrinsics.areEqual(this.starPlacement, activating.starPlacement) && this.pulseShape == activating.pulseShape;
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.verifiedStableConnectionPercent, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.connected), 31);
            Button button = this.button;
            return this.pulseShape.hashCode() + ((this.starPlacement.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (button == null ? 0 : button.hashCode())) * 31, 31, this.deviceDisplayName)) * 31);
        }

        public final String toString() {
            StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("Activating(title=", this.title, ", connected=", ", verifiedStableConnectionPercent=", this.connected);
            m1540m.append(this.verifiedStableConnectionPercent);
            m1540m.append(", button=");
            m1540m.append(this.button);
            m1540m.append(", deviceDisplayName=");
            m1540m.append(this.deviceDisplayName);
            m1540m.append(", starPlacement=");
            m1540m.append(this.starPlacement);
            m1540m.append(", pulseShape=");
            m1540m.append(this.pulseShape);
            m1540m.append(")");
            return m1540m.toString();
        }
    }

    public final class Button {
        public final ButtonAction action;
        public final String text;

        public Button(String str, ButtonAction buttonAction) {
            this.text = str;
            this.action = buttonAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return this.text.equals(button.text) && this.action.equals(button.action);
        }

        public final int hashCode() {
            return this.action.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return "Button(text=" + this.text + ", action=" + this.action + ")";
        }
    }

    public interface ButtonAction {

        public final class Close implements ButtonAction {
            public static final Close INSTANCE = new Close();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Close);
            }

            public final int hashCode() {
                return -1026003158;
            }

            public final String toString() {
                return Constants.META_CLOSE;
            }
        }

        public final class OpenNfcSettings implements ButtonAction {
            public static final OpenNfcSettings INSTANCE = new OpenNfcSettings();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenNfcSettings);
            }

            public final int hashCode() {
                return -1768703754;
            }

            public final String toString() {
                return "OpenNfcSettings";
            }
        }

        public final class OpenUrl implements ButtonAction {
            public final String url;

            public OpenUrl(String str) {
                this.url = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && this.url.equals(((OpenUrl) obj).url);
            }

            public final int hashCode() {
                return this.url.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ")");
            }
        }

        public final class Retry implements ButtonAction {
            public static final Retry INSTANCE = new Retry();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Retry);
            }

            public final int hashCode() {
                return -1012354086;
            }

            public final String toString() {
                return "Retry";
            }
        }
    }

    public final class Error implements FidesmoProvisioningViewModel {
        public final Icon icon;
        public final ListUnordered instructions;
        public final String message;
        public final ButtonAction primaryButtonAction;
        public final String primaryButtonText;
        public final ButtonAction secondaryButtonAction;
        public final String secondaryButtonText;
        public final String title;

        public Error(String str, String str2, Icon icon, ListUnordered listUnordered, String str3, String str4, ButtonAction buttonAction, ButtonAction buttonAction2) {
            str.getClass();
            listUnordered.getClass();
            this.title = str;
            this.message = str2;
            this.icon = icon;
            this.instructions = listUnordered;
            this.primaryButtonText = str3;
            this.secondaryButtonText = str4;
            this.primaryButtonAction = buttonAction;
            this.secondaryButtonAction = buttonAction2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.areEqual(this.title, error.title) && Intrinsics.areEqual(this.message, error.message) && Intrinsics.areEqual(this.icon, error.icon) && Intrinsics.areEqual(this.instructions, error.instructions) && Intrinsics.areEqual(this.primaryButtonText, error.primaryButtonText) && Intrinsics.areEqual(this.secondaryButtonText, error.secondaryButtonText) && Intrinsics.areEqual(this.primaryButtonAction, error.primaryButtonAction) && Intrinsics.areEqual(this.secondaryButtonAction, error.secondaryButtonAction);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            String str = this.message;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Icon icon = this.icon;
            int hashCode3 = (this.instructions.hashCode() + ((hashCode2 + (icon == null ? 0 : icon.hashCode())) * 31)) * 31;
            String str2 = this.primaryButtonText;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.secondaryButtonText;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ButtonAction buttonAction = this.primaryButtonAction;
            int hashCode6 = (hashCode5 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
            ButtonAction buttonAction2 = this.secondaryButtonAction;
            return hashCode6 + (buttonAction2 != null ? buttonAction2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Error(title=", this.title, ", message=", this.message, ", icon=");
            m.append(this.icon);
            m.append(", instructions=");
            m.append(this.instructions);
            m.append(", primaryButtonText=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.primaryButtonText, ", secondaryButtonText=", this.secondaryButtonText, ", primaryButtonAction=");
            m.append(this.primaryButtonAction);
            m.append(", secondaryButtonAction=");
            m.append(this.secondaryButtonAction);
            m.append(")");
            return m.toString();
        }
    }

    public final class Failed implements FidesmoProvisioningViewModel {
        public final String doneButtonText;
        public final String message;
        public final String retryButtonText;
        public final String title;

        public Failed(String str, int i, String str2, String str3, String str4) {
            str4 = (i & 8) != 0 ? null : str4;
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.title = str;
            this.message = str2;
            this.doneButtonText = str3;
            this.retryButtonText = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) obj;
            return Intrinsics.areEqual(this.title, failed.title) && Intrinsics.areEqual(this.message, failed.message) && Intrinsics.areEqual(this.doneButtonText, failed.doneButtonText) && Intrinsics.areEqual(this.retryButtonText, failed.retryButtonText);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.doneButtonText);
            String str = this.retryButtonText;
            return (m + (str == null ? 0 : str.hashCode())) * 31;
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed(title=", this.title, ", message=", this.message, ", doneButtonText="), this.doneButtonText, ", retryButtonText=", this.retryButtonText, ", contactSupportButtonText=null)");
        }
    }

    public final class Loading implements FidesmoProvisioningViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 619253124;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class PreScanInstructions implements FidesmoProvisioningViewModel {
        public final String disclosureText;
        public final String imageUrl;
        public final List infoCards;
        public final ListUnordered instructions;
        public final String startButtonPreScrollText;
        public final String startButtonText;
        public final String title;

        public final class InfoCard {
            public final String body;
            public final String imageUrl;
            public final String title;

            public InfoCard(String str, String str2, String str3) {
                this.imageUrl = str;
                this.title = str2;
                this.body = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InfoCard)) {
                    return false;
                }
                InfoCard infoCard = (InfoCard) obj;
                return Intrinsics.areEqual(this.imageUrl, infoCard.imageUrl) && this.title.equals(infoCard.title) && Intrinsics.areEqual(this.body, infoCard.body);
            }

            public final int hashCode() {
                String str = this.imageUrl;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
                String str2 = this.body;
                return m + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InfoCard(imageUrl=", this.imageUrl, ", title=", this.title, ", body="), this.body, ")");
            }
        }

        public PreScanInstructions(String str, ListUnordered listUnordered, List list, String str2, String str3, String str4, String str5) {
            str.getClass();
            list.getClass();
            str2.getClass();
            this.title = str;
            this.instructions = listUnordered;
            this.infoCards = list;
            this.startButtonText = str2;
            this.startButtonPreScrollText = str3;
            this.imageUrl = str4;
            this.disclosureText = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PreScanInstructions)) {
                return false;
            }
            PreScanInstructions preScanInstructions = (PreScanInstructions) obj;
            return Intrinsics.areEqual(this.title, preScanInstructions.title) && Intrinsics.areEqual(this.instructions, preScanInstructions.instructions) && Intrinsics.areEqual(this.infoCards, preScanInstructions.infoCards) && Intrinsics.areEqual(this.startButtonText, preScanInstructions.startButtonText) && Intrinsics.areEqual(this.startButtonPreScrollText, preScanInstructions.startButtonPreScrollText) && Intrinsics.areEqual(this.imageUrl, preScanInstructions.imageUrl) && Intrinsics.areEqual(this.disclosureText, preScanInstructions.disclosureText);
        }

        public final int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            ListUnordered listUnordered = this.instructions;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (listUnordered == null ? 0 : listUnordered.hashCode())) * 31, 31, this.infoCards), 31, this.startButtonText);
            String str = this.startButtonPreScrollText;
            int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.imageUrl;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.disclosureText;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PreScanInstructions(title=");
            sb.append(this.title);
            sb.append(", instructions=");
            sb.append(this.instructions);
            sb.append(", infoCards=");
            Recorder$$ExternalSyntheticOutline2.m(", startButtonText=", this.startButtonText, ", startButtonPreScrollText=", sb, this.infoCards);
            Boxes$$ExternalSyntheticOutline1.m(sb, this.startButtonPreScrollText, ", imageUrl=", this.imageUrl, ", disclosureText=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.disclosureText, ")");
        }
    }

    public interface Success extends FidesmoProvisioningViewModel {

        public final class Deprovisioned implements Success {
            public final String buttonText;
            public final String message;
            public final String title;

            public Deprovisioned(String str, String str2, String str3) {
                re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
                this.title = str;
                this.message = str2;
                this.buttonText = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Deprovisioned)) {
                    return false;
                }
                Deprovisioned deprovisioned = (Deprovisioned) obj;
                return Intrinsics.areEqual(this.title, deprovisioned.title) && Intrinsics.areEqual(this.message, deprovisioned.message) && Intrinsics.areEqual(this.buttonText, deprovisioned.buttonText);
            }

            public final int hashCode() {
                return this.buttonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Deprovisioned(title=", this.title, ", message=", this.message, ", buttonText="), this.buttonText, ")");
            }
        }

        public final class Provisioned implements Success {
            public final BookletGrid bookletGrid;
            public final List cards;
            public final String disclosureText;
            public final String doneButtonText;
            public final TagFormFactor formFactor;
            public final String message;
            public final Tile tile;
            public final String title;

            public final class BookletGrid {
                public final String headline;
                public final List items;

                public final class Item {
                    public final String body;
                    public final Icon icon;
                    public final String title;

                    public Item(Icon icon, String str, String str2) {
                        this.icon = icon;
                        this.title = str;
                        this.body = str2;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Item)) {
                            return false;
                        }
                        Item item = (Item) obj;
                        return this.icon.equals(item.icon) && this.title.equals(item.title) && this.body.equals(item.body);
                    }

                    public final int hashCode() {
                        return this.body.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.title);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("Item(icon=");
                        sb.append(this.icon);
                        sb.append(", title=");
                        sb.append(this.title);
                        sb.append(", body=");
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.body, ")");
                    }
                }

                public BookletGrid(String str, List list) {
                    list.getClass();
                    this.headline = str;
                    this.items = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof BookletGrid)) {
                        return false;
                    }
                    BookletGrid bookletGrid = (BookletGrid) obj;
                    return this.headline.equals(bookletGrid.headline) && Intrinsics.areEqual(this.items, bookletGrid.items);
                }

                public final int hashCode() {
                    return this.items.hashCode() + (this.headline.hashCode() * 31);
                }

                public final String toString() {
                    return CameraState$Type$EnumUnboxingLocalUtility.m("BookletGrid(headline=", this.headline, ", items=", ")", this.items);
                }
            }

            public final class Card {
                public final String buttonText;
                public final String buttonUrl;
                public final String header;
                public final String imageUrl;

                public Card(String str, String str2, String str3, String str4) {
                    this.imageUrl = str;
                    this.header = str2;
                    this.buttonText = str3;
                    this.buttonUrl = str4;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Card)) {
                        return false;
                    }
                    Card card = (Card) obj;
                    return Intrinsics.areEqual(this.imageUrl, card.imageUrl) && this.header.equals(card.header) && Intrinsics.areEqual(this.buttonText, card.buttonText) && Intrinsics.areEqual(this.buttonUrl, card.buttonUrl);
                }

                public final int hashCode() {
                    String str = this.imageUrl;
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.header);
                    String str2 = this.buttonText;
                    int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.buttonUrl;
                    return hashCode + (str3 != null ? str3.hashCode() : 0);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Card(imageUrl=", this.imageUrl, ", header=", this.header, ", buttonText="), this.buttonText, ", buttonUrl=", this.buttonUrl, ")");
                }
            }

            public final class Tile {
                public final String body;
                public final Image image;
                public final String title;

                public Tile(Image image, String str, String str2) {
                    image.getClass();
                    this.image = image;
                    this.title = str;
                    this.body = str2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Tile)) {
                        return false;
                    }
                    Tile tile = (Tile) obj;
                    return Intrinsics.areEqual(this.image, tile.image) && this.title.equals(tile.title) && this.body.equals(tile.body);
                }

                public final int hashCode() {
                    return this.body.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.title);
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Matcher$$ExternalSyntheticOutline0.m(this.image, "Tile(image=", ", title=", this.title, ", body="), this.body, ")");
                }
            }

            public Provisioned(String str, BookletGrid bookletGrid, Tile tile, int i) {
                this("Ta-daaaaaa.", str, "Done", bookletGrid, (i & 16) != 0 ? null : tile, EmptyList.INSTANCE, (i & 64) == 0 ? "*You must notify Cash App immediately—and no later than 60 days after a suspicious charge appears on your account—of any unauthorized Cash App Card or Cash App Tag use. For specific restrictions, limitations and other details, please consult the [Cash App Terms of Service](https://cash.app/legal/us/en-us/tos)." : null, TagFormFactor.WAND);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Provisioned)) {
                    return false;
                }
                Provisioned provisioned = (Provisioned) obj;
                return Intrinsics.areEqual(this.title, provisioned.title) && Intrinsics.areEqual(this.message, provisioned.message) && Intrinsics.areEqual(this.doneButtonText, provisioned.doneButtonText) && Intrinsics.areEqual(this.bookletGrid, provisioned.bookletGrid) && Intrinsics.areEqual(this.tile, provisioned.tile) && Intrinsics.areEqual(this.cards, provisioned.cards) && Intrinsics.areEqual(this.disclosureText, provisioned.disclosureText) && this.formFactor == provisioned.formFactor;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.message), 31, this.doneButtonText);
                BookletGrid bookletGrid = this.bookletGrid;
                int hashCode = (m + (bookletGrid == null ? 0 : bookletGrid.hashCode())) * 31;
                Tile tile = this.tile;
                int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode + (tile == null ? 0 : tile.hashCode())) * 31, 31, this.cards);
                String str = this.disclosureText;
                return this.formFactor.hashCode() + ((m2 + (str != null ? str.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Provisioned(title=", this.title, ", message=", this.message, ", doneButtonText=");
                m.append(this.doneButtonText);
                m.append(", bookletGrid=");
                m.append(this.bookletGrid);
                m.append(", tile=");
                m.append(this.tile);
                m.append(", cards=");
                m.append(this.cards);
                m.append(", disclosureText=");
                m.append(this.disclosureText);
                m.append(", formFactor=");
                m.append(this.formFactor);
                m.append(")");
                return m.toString();
            }

            public Provisioned(String str, String str2, String str3, BookletGrid bookletGrid, Tile tile, List list, String str4, TagFormFactor tagFormFactor) {
                str3.getClass();
                list.getClass();
                tagFormFactor.getClass();
                this.title = str;
                this.message = str2;
                this.doneButtonText = str3;
                this.bookletGrid = bookletGrid;
                this.tile = tile;
                this.cards = list;
                this.disclosureText = str4;
                this.formFactor = tagFormFactor;
            }
        }
    }

    public interface Scanning extends FidesmoProvisioningViewModel {

        public final class Disconnected implements Scanning {
            public final Button button;
            public final String title;

            public Disconnected(String str, Button button) {
                str.getClass();
                this.title = str;
                this.button = button;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Disconnected)) {
                    return false;
                }
                Disconnected disconnected = (Disconnected) obj;
                return Intrinsics.areEqual(this.title, disconnected.title) && Intrinsics.areEqual(this.button, disconnected.button);
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                Button button = this.button;
                return hashCode + (button == null ? 0 : button.hashCode());
            }

            public final String toString() {
                return "Disconnected(title=" + this.title + ", button=" + this.button + ")";
            }
        }

        public final class InProgress implements Scanning {
            public final Integer currentStep;
            public final String deviceDisplayName;
            public final Integer progressPercent;
            public final FidesmoScanningPulseShape pulseShape;
            public final ScanningStarPlacement starPlacement;
            public final int starStepAnimationPercentInterval;
            public final int starStepAnimationTurnsPerInterval;
            public final String title;
            public final Integer totalSteps;

            public /* synthetic */ InProgress(String str, Integer num, Integer num2, String str2, ScanningStarPlacement scanningStarPlacement, FidesmoScanningPulseShape fidesmoScanningPulseShape, int i) {
                this(str, num, num2, null, 10, 1, (i & 64) != 0 ? "tag" : str2, (i & 128) != 0 ? ScanningStarPlacement.Companion.TopCenter : scanningStarPlacement, (i & 256) != 0 ? FidesmoScanningPulseShape.STAR : fidesmoScanningPulseShape);
            }

            public static InProgress copy$default(InProgress inProgress, Integer num) {
                String str = inProgress.title;
                Integer num2 = inProgress.currentStep;
                Integer num3 = inProgress.totalSteps;
                int i = inProgress.starStepAnimationPercentInterval;
                int i2 = inProgress.starStepAnimationTurnsPerInterval;
                String str2 = inProgress.deviceDisplayName;
                ScanningStarPlacement scanningStarPlacement = inProgress.starPlacement;
                FidesmoScanningPulseShape fidesmoScanningPulseShape = inProgress.pulseShape;
                str.getClass();
                str2.getClass();
                scanningStarPlacement.getClass();
                fidesmoScanningPulseShape.getClass();
                return new InProgress(str, num2, num3, num, i, i2, str2, scanningStarPlacement, fidesmoScanningPulseShape);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InProgress)) {
                    return false;
                }
                InProgress inProgress = (InProgress) obj;
                return Intrinsics.areEqual(this.title, inProgress.title) && Intrinsics.areEqual(this.currentStep, inProgress.currentStep) && Intrinsics.areEqual(this.totalSteps, inProgress.totalSteps) && Intrinsics.areEqual(this.progressPercent, inProgress.progressPercent) && this.starStepAnimationPercentInterval == inProgress.starStepAnimationPercentInterval && this.starStepAnimationTurnsPerInterval == inProgress.starStepAnimationTurnsPerInterval && Intrinsics.areEqual(this.deviceDisplayName, inProgress.deviceDisplayName) && Intrinsics.areEqual(this.starPlacement, inProgress.starPlacement) && this.pulseShape == inProgress.pulseShape;
            }

            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                Integer num = this.currentStep;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Integer num2 = this.totalSteps;
                int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.progressPercent;
                return this.pulseShape.hashCode() + ((this.starPlacement.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.starStepAnimationTurnsPerInterval, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.starStepAnimationPercentInterval, (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31, 31), 31), 31, this.deviceDisplayName)) * 31);
            }

            public final String toString() {
                StringBuilder m = NavAction$$ExternalSyntheticOutline0.m(this.currentStep, "InProgress(title=", this.title, ", currentStep=", ", totalSteps=");
                NavAction$$ExternalSyntheticOutline0.m(m, this.totalSteps, ", progressPercent=", this.progressPercent, ", starStepAnimationPercentInterval=");
                Recorder$$ExternalSyntheticOutline1.m105m(this.starStepAnimationPercentInterval, this.starStepAnimationTurnsPerInterval, ", starStepAnimationTurnsPerInterval=", ", deviceDisplayName=", m);
                m.append(this.deviceDisplayName);
                m.append(", starPlacement=");
                m.append(this.starPlacement);
                m.append(", pulseShape=");
                m.append(this.pulseShape);
                m.append(")");
                return m.toString();
            }

            public InProgress(String str, Integer num, Integer num2, Integer num3, int i, int i2, String str2, ScanningStarPlacement scanningStarPlacement, FidesmoScanningPulseShape fidesmoScanningPulseShape) {
                str.getClass();
                str2.getClass();
                scanningStarPlacement.getClass();
                fidesmoScanningPulseShape.getClass();
                this.title = str;
                this.currentStep = num;
                this.totalSteps = num2;
                this.progressPercent = num3;
                this.starStepAnimationPercentInterval = i;
                this.starStepAnimationTurnsPerInterval = i2;
                this.deviceDisplayName = str2;
                this.starPlacement = scanningStarPlacement;
                this.pulseShape = fidesmoScanningPulseShape;
            }
        }
    }
}
