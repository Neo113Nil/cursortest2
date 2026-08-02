package app.cash.directoryui.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.extractor.VorbisUtil$Mode;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.AvatarViewModel;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.ImageLayout;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public interface DirectoryListItem {

    public final class AvatarSectionViewModel implements DirectoryListItem {
        public final /* synthetic */ VorbisUtil$Mode $$delegate_0;
        public final String id;
        public final ArrayList items;
        public final Section.Layout layout;

        public AvatarSectionViewModel(String str, ArrayList arrayList, Section.Layout layout) {
            str.getClass();
            this.$$delegate_0 = new VorbisUtil$Mode();
            this.id = str;
            this.items = arrayList;
            this.layout = layout;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvatarSectionViewModel)) {
                return false;
            }
            AvatarSectionViewModel avatarSectionViewModel = (AvatarSectionViewModel) obj;
            return Intrinsics.areEqual(this.id, avatarSectionViewModel.id) && Intrinsics.areEqual(this.items, avatarSectionViewModel.items) && this.layout == avatarSectionViewModel.layout;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + ((this.layout.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.items, this.id.hashCode() * 31, 31)) * 31);
        }

        public final String toString() {
            StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.items, "AvatarSectionViewModel(id=", this.id, ", items=", ", layout=");
            m.append(this.layout);
            m.append(", isLarge=false)");
            return m.toString();
        }
    }

    public final class CardAvatarSectionViewModel implements DirectoryListItem {
        public final String id;
        public final ArrayList items;

        public CardAvatarSectionViewModel(String str, ArrayList arrayList) {
            str.getClass();
            this.id = str;
            this.items = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardAvatarSectionViewModel)) {
                return false;
            }
            CardAvatarSectionViewModel cardAvatarSectionViewModel = (CardAvatarSectionViewModel) obj;
            return Intrinsics.areEqual(this.id, cardAvatarSectionViewModel.id) && this.items.equals(cardAvatarSectionViewModel.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.id.hashCode() * 31);
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m(this.items, "CardAvatarSectionViewModel(id=", this.id, ", items=", ")");
        }
    }

    public final class CardSectionViewModel implements DirectoryListItem {
        public final /* synthetic */ VorbisUtil$Mode $$delegate_0 = new VorbisUtil$Mode();
        public final String id;
        public final ArrayList items;
        public final Section.Layout layout;

        public CardSectionViewModel(String str, ArrayList arrayList, Section.Layout layout) {
            this.id = str;
            this.items = arrayList;
            this.layout = layout;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardSectionViewModel)) {
                return false;
            }
            CardSectionViewModel cardSectionViewModel = (CardSectionViewModel) obj;
            return this.id.equals(cardSectionViewModel.id) && this.items.equals(cardSectionViewModel.items) && this.layout == cardSectionViewModel.layout;
        }

        public final int hashCode() {
            return this.layout.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.items, this.id.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.items, "CardSectionViewModel(id=", this.id, ", items=", ", layout=");
            m.append(this.layout);
            m.append(")");
            return m.toString();
        }
    }

    public final class Footer implements DirectoryListItem {
        public final Button actionButton;
        public final String id;

        public Footer(String str, Button button) {
            button.getClass();
            this.id = str;
            this.actionButton = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return this.id.equals(footer.id) && Intrinsics.areEqual(this.actionButton, footer.actionButton);
        }

        public final int hashCode() {
            return (this.actionButton.hashCode() + (this.id.hashCode() * 31)) * 31;
        }

        public final String toString() {
            return "Footer(id=" + this.id + ", actionButton=" + this.actionButton + ", analyticsData=null)";
        }
    }

    public final class Header implements DirectoryListItem {
        public final /* synthetic */ VorbisUtil$Mode $$delegate_0;
        public final String actionUrl;
        public final Button headerButton;
        public final String id;
        public final String sectionId;
        public final ItemViewModel.Text subtitle;
        public final ItemViewModel.Text title;

        public Header(String str, ItemViewModel.Text text, ItemViewModel.Text text2, String str2, String str3, Button button, int i) {
            str2 = (i & 8) != 0 ? null : str2;
            button = (i & 32) != 0 ? null : button;
            str.getClass();
            this.$$delegate_0 = new VorbisUtil$Mode();
            this.id = str;
            this.title = text;
            this.subtitle = text2;
            this.actionUrl = str2;
            this.sectionId = str3;
            this.headerButton = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.areEqual(this.id, header.id) && Intrinsics.areEqual(this.title, header.title) && Intrinsics.areEqual(this.subtitle, header.subtitle) && Intrinsics.areEqual(this.actionUrl, header.actionUrl) && this.sectionId.equals(header.sectionId) && Intrinsics.areEqual(this.headerButton, header.headerButton);
        }

        public final int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            ItemViewModel.Text text = this.title;
            int hashCode2 = (hashCode + (text == null ? 0 : text.hashCode())) * 31;
            ItemViewModel.Text text2 = this.subtitle;
            int hashCode3 = (hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 31;
            String str = this.actionUrl;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.sectionId);
            Button button = this.headerButton;
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (button == null ? 0 : button.hashCode())) * 31, 31, false), 961, false);
        }

        public final String toString() {
            return "Header(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", actionUrl=" + this.actionUrl + ", sectionId=" + this.sectionId + ", headerButton=" + this.headerButton + ", largeHeaderButton=false, shouldReportSectionViewed=false, analyticsData=null, backgroundColor=null)";
        }
    }

    public final class ItemViewModel implements DirectoryListItem {
        public final /* synthetic */ VorbisUtil$Mode $$delegate_0;
        public final Button actionButton;
        public final DirectoryAnalyticsData analyticsData;
        public final AvatarViewModel avatar;
        public final Text captionLeft;
        public final Text captionRight;
        public final Image icon;
        public final String id;
        public final String itemActionUrl;
        public final ImageLayout layout;
        public final Image picture;
        public final Recipient recipient;
        public final boolean shouldUseMerchantPlaceholderOverride;
        public final Text subtitle;
        public final Text title;

        public final class Text {
            public final IntRange highlightedRange;
            public final com.squareup.protos.cash.discover.api.app.v1.model.Text text;

            public Text(com.squareup.protos.cash.discover.api.app.v1.model.Text text, IntRange intRange, int i) {
                intRange = (i & 2) != 0 ? null : intRange;
                text.getClass();
                this.text = text;
                this.highlightedRange = intRange;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Text)) {
                    return false;
                }
                Text text = (Text) obj;
                return Intrinsics.areEqual(this.text, text.text) && Intrinsics.areEqual(this.highlightedRange, text.highlightedRange);
            }

            public final int hashCode() {
                int hashCode = this.text.hashCode() * 31;
                IntRange intRange = this.highlightedRange;
                return (hashCode + (intRange == null ? 0 : intRange.hashCode())) * 31;
            }

            public final String toString() {
                return "Text(text=" + this.text + ", highlightedRange=" + this.highlightedRange + ", color=null)";
            }
        }

        public ItemViewModel(String str, Recipient recipient, AvatarViewModel avatarViewModel, Text text, Text text2, Text text3, Text text4, Image image, String str2, Button button, DirectoryAnalyticsData directoryAnalyticsData, Image image2, int i) {
            avatarViewModel = (i & 4) != 0 ? null : avatarViewModel;
            boolean z = (i & 8) == 0;
            text2 = (i & 64) != 0 ? null : text2;
            Text text5 = (i & 256) != 0 ? null : text3;
            Text text6 = (i & 512) != 0 ? null : text4;
            Image image3 = (i & 1024) != 0 ? null : image;
            Button button2 = (i & 4096) != 0 ? null : button;
            Image image4 = (i & 32768) == 0 ? image2 : null;
            ImageLayout imageLayout = ImageLayout.VERTICAL_RECTANGLE;
            str.getClass();
            this.$$delegate_0 = new VorbisUtil$Mode();
            this.id = str;
            this.recipient = recipient;
            this.avatar = avatarViewModel;
            this.shouldUseMerchantPlaceholderOverride = z;
            this.title = text;
            this.subtitle = text2;
            this.captionLeft = text5;
            this.captionRight = text6;
            this.icon = image3;
            this.itemActionUrl = str2;
            this.actionButton = button2;
            this.analyticsData = directoryAnalyticsData;
            this.picture = image4;
            this.layout = imageLayout;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemViewModel)) {
                return false;
            }
            ItemViewModel itemViewModel = (ItemViewModel) obj;
            return Intrinsics.areEqual(this.id, itemViewModel.id) && Intrinsics.areEqual(this.recipient, itemViewModel.recipient) && Intrinsics.areEqual(this.avatar, itemViewModel.avatar) && this.shouldUseMerchantPlaceholderOverride == itemViewModel.shouldUseMerchantPlaceholderOverride && Intrinsics.areEqual(this.title, itemViewModel.title) && Intrinsics.areEqual(this.subtitle, itemViewModel.subtitle) && Intrinsics.areEqual(this.captionLeft, itemViewModel.captionLeft) && Intrinsics.areEqual(this.captionRight, itemViewModel.captionRight) && Intrinsics.areEqual(this.icon, itemViewModel.icon) && Intrinsics.areEqual(this.itemActionUrl, itemViewModel.itemActionUrl) && Intrinsics.areEqual(this.actionButton, itemViewModel.actionButton) && Intrinsics.areEqual(this.analyticsData, itemViewModel.analyticsData) && Intrinsics.areEqual(this.picture, itemViewModel.picture) && this.layout == itemViewModel.layout;
        }

        public final int hashCode() {
            int hashCode = (this.recipient.hashCode() + (this.id.hashCode() * 31)) * 31;
            AvatarViewModel avatarViewModel = this.avatar;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (avatarViewModel == null ? 0 : avatarViewModel.hashCode())) * 31, 961, this.shouldUseMerchantPlaceholderOverride);
            Text text = this.title;
            int hashCode2 = (m + (text == null ? 0 : text.hashCode())) * 31;
            Text text2 = this.subtitle;
            int hashCode3 = (hashCode2 + (text2 == null ? 0 : text2.hashCode())) * 961;
            Text text3 = this.captionLeft;
            int hashCode4 = (hashCode3 + (text3 == null ? 0 : text3.hashCode())) * 31;
            Text text4 = this.captionRight;
            int hashCode5 = (hashCode4 + (text4 == null ? 0 : text4.hashCode())) * 31;
            Image image = this.icon;
            int hashCode6 = (hashCode5 + (image == null ? 0 : image.hashCode())) * 31;
            String str = this.itemActionUrl;
            int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            Button button = this.actionButton;
            int hashCode8 = (this.analyticsData.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode7 + (button == null ? 0 : button.hashCode())) * 31, 31, false)) * 31;
            Image image2 = this.picture;
            return Boolean.hashCode(false) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.layout.hashCode() + ((hashCode8 + (image2 == null ? 0 : image2.hashCode())) * 31)) * 29791, 31, false);
        }

        public final String toString() {
            return "ItemViewModel(id=" + this.id + ", recipient=" + this.recipient + ", avatar=" + this.avatar + ", shouldUseMerchantPlaceholderOverride=" + this.shouldUseMerchantPlaceholderOverride + ", avatarContentDescription=null, title=" + this.title + ", subtitle=" + this.subtitle + ", subtext=null, captionLeft=" + this.captionLeft + ", captionRight=" + this.captionRight + ", icon=" + this.icon + ", itemActionUrl=" + this.itemActionUrl + ", actionButton=" + this.actionButton + ", isSelected=false, analyticsData=" + this.analyticsData + ", picture=" + this.picture + ", layout=" + this.layout + ", hideCloseButton=null, boostAddedDecorationViewModel=null, showDivider=false, showBusiness=false)";
        }
    }

    public final class MessageSectionViewModel implements DirectoryListItem {
        public final Button actionButton;
        public final String id;
        public final Image image;
        public final Text subtitle;
        public final Text title;

        public MessageSectionViewModel(String str, Text text, Text text2, Image image, Button button) {
            this.id = str;
            this.title = text;
            this.subtitle = text2;
            this.image = image;
            this.actionButton = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageSectionViewModel)) {
                return false;
            }
            MessageSectionViewModel messageSectionViewModel = (MessageSectionViewModel) obj;
            return this.id.equals(messageSectionViewModel.id) && this.title.equals(messageSectionViewModel.title) && this.subtitle.equals(messageSectionViewModel.subtitle) && Intrinsics.areEqual(this.image, messageSectionViewModel.image) && Intrinsics.areEqual(this.actionButton, messageSectionViewModel.actionButton);
        }

        public final int hashCode() {
            int hashCode = (this.subtitle.hashCode() + ((this.title.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31;
            Image image = this.image;
            int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
            Button button = this.actionButton;
            return hashCode2 + (button != null ? button.hashCode() : 0);
        }

        public final String toString() {
            return "MessageSectionViewModel(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", image=" + this.image + ", actionButton=" + this.actionButton + ")";
        }
    }

    public final class RowSectionViewModel implements DirectoryListItem {
        public final /* synthetic */ VorbisUtil$Mode $$delegate_0 = new VorbisUtil$Mode();
        public final String id;
        public final ArrayList items;
        public final Section.Layout layout;

        public RowSectionViewModel(String str, ArrayList arrayList, Section.Layout layout) {
            this.id = str;
            this.items = arrayList;
            this.layout = layout;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowSectionViewModel)) {
                return false;
            }
            RowSectionViewModel rowSectionViewModel = (RowSectionViewModel) obj;
            return Intrinsics.areEqual(this.id, rowSectionViewModel.id) && Intrinsics.areEqual(this.items, rowSectionViewModel.items) && this.layout == rowSectionViewModel.layout;
        }

        public final int hashCode() {
            return (this.layout.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.items, this.id.hashCode() * 31, 31)) * 31;
        }

        public final String toString() {
            StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.items, "RowSectionViewModel(id=", this.id, ", items=", ", layout=");
            m.append(this.layout);
            m.append(", maxItems=null)");
            return m.toString();
        }
    }

    public final class TextRowSectionViewModel implements DirectoryListItem {
        public final String id;
        public final boolean isAutocomplete;
        public final ArrayList items;
        public final Section.Layout layout;

        public TextRowSectionViewModel(String str, ArrayList arrayList, boolean z, Section.Layout layout) {
            str.getClass();
            this.id = str;
            this.items = arrayList;
            this.isAutocomplete = z;
            this.layout = layout;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextRowSectionViewModel)) {
                return false;
            }
            TextRowSectionViewModel textRowSectionViewModel = (TextRowSectionViewModel) obj;
            return Intrinsics.areEqual(this.id, textRowSectionViewModel.id) && this.items.equals(textRowSectionViewModel.items) && this.isAutocomplete == textRowSectionViewModel.isAutocomplete && this.layout == textRowSectionViewModel.layout;
        }

        public final int hashCode() {
            return this.layout.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.items, this.id.hashCode() * 31, 31), 31, this.isAutocomplete);
        }

        public final String toString() {
            StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.items, "TextRowSectionViewModel(id=", this.id, ", items=", ", isAutocomplete=");
            m.append(this.isAutocomplete);
            m.append(", layout=");
            m.append(this.layout);
            m.append(")");
            return m.toString();
        }
    }
}
