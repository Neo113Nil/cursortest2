package app.cash.directory.data;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.extractor.text.CueEncoder;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.customersearch.api.SearchCommonMessageSection;
import com.squareup.protos.cash.customersearch.api.SearchCommonPlaceholderSection;
import com.squareup.protos.cash.discover.api.app.v1.model.Avatar;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.EmbeddedImageSection;
import com.squareup.protos.cash.discover.api.app.v1.model.ImageLayout;
import com.squareup.protos.cash.discover.api.app.v1.model.PlaceholderSection;
import com.squareup.protos.cash.discover.api.app.v1.model.Section;
import com.squareup.protos.cash.discover.api.app.v1.model.ShopInfoResponse;
import com.squareup.protos.cash.discover.api.app.v1.model.TapAction;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.discover.api.app.v1.model.TextDecoration;
import com.squareup.protos.cash.discover.api.app.v1.model.TextStyle;
import com.squareup.protos.cash.discover.api.app.v1.model.TileSection;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class Directory$Section {
    public final Color backgroundColor;
    public final EmbeddedImageSection embeddedImageSection;
    public final Text eyebrow;
    public final Button footerButton;
    public final String headerActionUrl;
    public final Button headerButton;
    public final Text headerText;
    public final String id;
    public final boolean isMultiPathGroup;
    public final List items;
    public final Section.Layout layout;
    public final Long maxDisplayItems;
    public final PlaceholderSection placeholderSection;
    public final Boolean renderSectionDivider;
    public final SearchCommonPlaceholderSection searchCommonPlaceholderSection;
    public final SearchCommonMessageSection searchMessageSection;
    public final String serverId;
    public final Text subtitle;
    public final TapAction tapAction;
    public final TileSection tileSection;
    public final Text title;

    /* renamed from: type, reason: collision with root package name */
    public final Type f908type;

    public abstract class Item {

        public final class CardItem extends Item {
            public final String actionUrl;
            public final SimpleItem.ItemText captionLeft;
            public final SimpleItem.ItemText captionRight;
            public final Metadata metadata;
            public final Image picture;
            public final SimpleItem.ItemText subheader;
            public final SimpleItem.ItemText title;

            public CardItem(SimpleItem.ItemText itemText, SimpleItem.ItemText itemText2, SimpleItem.ItemText itemText3, SimpleItem.ItemText itemText4, Metadata metadata, Image image, String str) {
                this.title = itemText;
                this.subheader = itemText2;
                this.captionLeft = itemText3;
                this.captionRight = itemText4;
                this.metadata = metadata;
                this.picture = image;
                this.actionUrl = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CardItem)) {
                    return false;
                }
                CardItem cardItem = (CardItem) obj;
                return Intrinsics.areEqual(this.title, cardItem.title) && Intrinsics.areEqual(this.subheader, cardItem.subheader) && Intrinsics.areEqual(this.captionLeft, cardItem.captionLeft) && Intrinsics.areEqual(this.captionRight, cardItem.captionRight) && Intrinsics.areEqual(this.metadata, cardItem.metadata) && Intrinsics.areEqual(this.picture, cardItem.picture) && Intrinsics.areEqual(this.actionUrl, cardItem.actionUrl);
            }

            public final int hashCode() {
                SimpleItem.ItemText itemText = this.title;
                int hashCode = (itemText == null ? 0 : itemText.hashCode()) * 31;
                SimpleItem.ItemText itemText2 = this.subheader;
                int hashCode2 = (hashCode + (itemText2 == null ? 0 : itemText2.hashCode())) * 31;
                SimpleItem.ItemText itemText3 = this.captionLeft;
                int hashCode3 = (hashCode2 + (itemText3 == null ? 0 : itemText3.hashCode())) * 31;
                SimpleItem.ItemText itemText4 = this.captionRight;
                int hashCode4 = (hashCode3 + (itemText4 == null ? 0 : itemText4.hashCode())) * 961;
                Metadata metadata = this.metadata;
                int hashCode5 = (hashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
                Image image = this.picture;
                int hashCode6 = (hashCode5 + (image == null ? 0 : image.hashCode())) * 31;
                String str = this.actionUrl;
                return hashCode6 + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CardItem(title=");
                sb.append(this.title);
                sb.append(", subheader=");
                sb.append(this.subheader);
                sb.append(", captionLeft=");
                sb.append(this.captionLeft);
                sb.append(", captionRight=");
                sb.append(this.captionRight);
                sb.append(", cardMetadata=null, metadata=");
                sb.append(this.metadata);
                sb.append(", picture=");
                sb.append(this.picture);
                sb.append(", actionUrl=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.actionUrl, ")");
            }
        }

        public final class SimpleItem extends Item {
            public final String accountHolderToken;
            public final String actionUrl;
            public final Button button;
            public final ShopInfoResponse halfSheet;
            public final Image icon;
            public final ImageLayout layout;
            public final Metadata metadata;
            public final Avatar profileImage;
            public final ItemText subtext;
            public final ItemText subtitle;
            public final ItemText title;
            public final String token;

            public final class ItemText {
                public final TextDecoration decoration;
                public final IntRange highlightRange;
                public final Image icon;
                public final TextStyle style;
                public final String text;
                public final Color textColor;

                public ItemText(String str, Color color, TextStyle textStyle, TextDecoration textDecoration, IntRange intRange, Image image, int i) {
                    textDecoration = (i & 8) != 0 ? null : textDecoration;
                    intRange = (i & 16) != 0 ? null : intRange;
                    this.text = str;
                    this.textColor = color;
                    this.style = textStyle;
                    this.decoration = textDecoration;
                    this.highlightRange = intRange;
                    this.icon = image;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ItemText)) {
                        return false;
                    }
                    ItemText itemText = (ItemText) obj;
                    return Intrinsics.areEqual(this.text, itemText.text) && Intrinsics.areEqual(this.textColor, itemText.textColor) && this.style == itemText.style && this.decoration == itemText.decoration && Intrinsics.areEqual(this.highlightRange, itemText.highlightRange) && Intrinsics.areEqual(this.icon, itemText.icon);
                }

                public final int hashCode() {
                    String str = this.text;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    Color color = this.textColor;
                    int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
                    TextStyle textStyle = this.style;
                    int hashCode3 = (hashCode2 + (textStyle == null ? 0 : textStyle.hashCode())) * 31;
                    TextDecoration textDecoration = this.decoration;
                    int hashCode4 = (hashCode3 + (textDecoration == null ? 0 : textDecoration.hashCode())) * 31;
                    IntRange intRange = this.highlightRange;
                    int hashCode5 = (hashCode4 + (intRange == null ? 0 : intRange.hashCode())) * 31;
                    Image image = this.icon;
                    return hashCode5 + (image != null ? image.hashCode() : 0);
                }

                public final String toString() {
                    return "ItemText(text=" + this.text + ", textColor=" + this.textColor + ", style=" + this.style + ", decoration=" + this.decoration + ", highlightRange=" + this.highlightRange + ", icon=" + this.icon + ")";
                }
            }

            public SimpleItem(String str, ItemText itemText, ItemText itemText2, ItemText itemText3, Avatar avatar, Image image, String str2, Button button, Metadata metadata, ShopInfoResponse shopInfoResponse, String str3, int i) {
                str = (i & 1) != 0 ? null : str;
                itemText2 = (i & 4) != 0 ? null : itemText2;
                itemText3 = (i & 8) != 0 ? null : itemText3;
                avatar = (i & 32) != 0 ? null : avatar;
                image = (i & 64) != 0 ? null : image;
                str2 = (i & 128) != 0 ? null : str2;
                button = (i & 256) != 0 ? null : button;
                shopInfoResponse = (i & 2048) != 0 ? null : shopInfoResponse;
                ImageLayout imageLayout = ImageLayout.VERTICAL_RECTANGLE;
                str3 = (i & 16384) != 0 ? null : str3;
                this.token = str;
                this.title = itemText;
                this.subtitle = itemText2;
                this.subtext = itemText3;
                this.profileImage = avatar;
                this.icon = image;
                this.actionUrl = str2;
                this.button = button;
                this.metadata = metadata;
                this.halfSheet = shopInfoResponse;
                this.layout = imageLayout;
                this.accountHolderToken = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!SimpleItem.class.equals(obj != null ? obj.getClass() : null)) {
                    return false;
                }
                obj.getClass();
                SimpleItem simpleItem = (SimpleItem) obj;
                return Intrinsics.areEqual(this.title, simpleItem.title) && Intrinsics.areEqual(this.subtitle, simpleItem.subtitle) && Intrinsics.areEqual(this.profileImage, simpleItem.profileImage) && Intrinsics.areEqual(this.icon, simpleItem.icon) && Intrinsics.areEqual(this.actionUrl, simpleItem.actionUrl) && Intrinsics.areEqual(this.button, simpleItem.button) && Intrinsics.areEqual(this.metadata, simpleItem.metadata) && Intrinsics.areEqual(this.accountHolderToken, simpleItem.accountHolderToken);
            }

            public final int hashCode() {
                ItemText itemText = this.title;
                int hashCode = (itemText != null ? itemText.hashCode() : 0) * 31;
                ItemText itemText2 = this.subtitle;
                int hashCode2 = (hashCode + (itemText2 != null ? itemText2.hashCode() : 0)) * 961;
                Avatar avatar = this.profileImage;
                int hashCode3 = (hashCode2 + (avatar != null ? avatar.hashCode() : 0)) * 31;
                Image image = this.icon;
                int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 31;
                String str = this.actionUrl;
                int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
                Button button = this.button;
                int hashCode6 = (hashCode5 + (button != null ? button.hashCode() : 0)) * 961;
                Metadata metadata = this.metadata;
                int hashCode7 = (hashCode6 + (metadata != null ? metadata.hashCode() : 0)) * 31;
                String str2 = this.accountHolderToken;
                return hashCode7 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return "SimpleItem(token=" + this.token + ", title=" + this.title + ", subtitle=" + this.subtitle + ", subtext=" + this.subtext + ", header=null, profileImage=" + this.profileImage + ", icon=" + this.icon + ", actionUrl=" + this.actionUrl + ", button=" + this.button + ", itemMetadata=null, metadata=" + this.metadata + ", halfSheet=" + this.halfSheet + ", layout=" + this.layout + ", hideCloseButton=null, accountHolderToken=" + this.accountHolderToken + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type AVATAR;
        public static final Type CARD;
        public static final CueEncoder Companion;
        public static final Type MESSAGE;
        public static final Type PLACEHOLDER;
        public static final Type ROW;
        public static final Type TEXT_ROW;

        static {
            Type type2 = new Type("AVATAR", 0);
            AVATAR = type2;
            Type type3 = new Type("ROW", 1);
            ROW = type3;
            Type type4 = new Type("PLACEHOLDER", 2);
            PLACEHOLDER = type4;
            Type type5 = new Type("CARD", 3);
            CARD = type5;
            Type type6 = new Type("TEXT_ROW", 4);
            TEXT_ROW = type6;
            Type type7 = new Type("EMBEDDED_IMAGE", 5);
            Type type8 = new Type("AVATAR_OVERLAY_CARD", 6);
            Type type9 = new Type("MESSAGE", 7);
            MESSAGE = type9;
            Type[] typeArr = {type2, type3, type4, type5, type6, type7, type8, type9, new Type("TILE", 8)};
            $VALUES = typeArr;
            $ENTRIES = new EnumEntriesList(typeArr);
            Companion = new CueEncoder(15);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ Directory$Section(Text text, Text text2, List list, Type type2, String str, Button button, Button button2, SearchCommonPlaceholderSection searchCommonPlaceholderSection, SearchCommonMessageSection searchCommonMessageSection, Long l, Section.Layout layout, int i) {
        this("", null, null, text, text2, list, type2, null, (i & 256) != 0 ? null : str, (i & 512) != 0 ? null : button, button2, null, null, null, (i & 16384) != 0 ? null : searchCommonPlaceholderSection, searchCommonMessageSection, null, (i & PKIFailureInfo.unsupportedVersion) != 0 ? null : l, layout, null, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Directory$Section.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        Directory$Section directory$Section = (Directory$Section) obj;
        return Intrinsics.areEqual(this.title, directory$Section.title) && Intrinsics.areEqual(this.items, directory$Section.items) && this.f908type == directory$Section.f908type && Intrinsics.areEqual(this.placeholderSection, directory$Section.placeholderSection);
    }

    public final int hashCode() {
        Text text = this.title;
        int hashCode = (this.f908type.hashCode() + Recorder$$ExternalSyntheticOutline2.m((text != null ? text.hashCode() : 0) * 31, 31, this.items)) * 31;
        PlaceholderSection placeholderSection = this.placeholderSection;
        return hashCode + (placeholderSection != null ? placeholderSection.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Section(id=", this.id, ", serverId=", this.serverId, ", eyebrow=");
        m.append(this.eyebrow);
        m.append(", title=");
        m.append(this.title);
        m.append(", subtitle=");
        m.append(this.subtitle);
        m.append(", items=");
        m.append(this.items);
        m.append(", type=");
        m.append(this.f908type);
        m.append(", headerText=");
        m.append(this.headerText);
        m.append(", headerActionUrl=");
        m.append(this.headerActionUrl);
        m.append(", headerButton=");
        m.append(this.headerButton);
        m.append(", footerButton=");
        m.append(this.footerButton);
        m.append(", tapAction=");
        m.append(this.tapAction);
        m.append(", placeholderSection=");
        m.append(this.placeholderSection);
        m.append(", embeddedImageSection=");
        m.append(this.embeddedImageSection);
        m.append(", searchCommonPlaceholderSection=");
        m.append(this.searchCommonPlaceholderSection);
        m.append(", searchMessageSection=");
        m.append(this.searchMessageSection);
        m.append(", tileSection=");
        m.append(this.tileSection);
        m.append(", maxDisplayItems=");
        m.append(this.maxDisplayItems);
        m.append(", layout=");
        m.append(this.layout);
        m.append(", backgroundColor=");
        m.append(this.backgroundColor);
        m.append(", isMultiPathGroup=");
        m.append(this.isMultiPathGroup);
        m.append(", renderSectionDivider=");
        m.append(this.renderSectionDivider);
        m.append(")");
        return m.toString();
    }

    public Directory$Section(String str, String str2, Text text, Text text2, Text text3, List list, Type type2, Text text4, String str3, Button button, Button button2, TapAction tapAction, PlaceholderSection placeholderSection, EmbeddedImageSection embeddedImageSection, SearchCommonPlaceholderSection searchCommonPlaceholderSection, SearchCommonMessageSection searchCommonMessageSection, TileSection tileSection, Long l, Section.Layout layout, Color color, boolean z, Boolean bool) {
        str.getClass();
        list.getClass();
        type2.getClass();
        this.id = str;
        this.serverId = str2;
        this.eyebrow = text;
        this.title = text2;
        this.subtitle = text3;
        this.items = list;
        this.f908type = type2;
        this.headerText = text4;
        this.headerActionUrl = str3;
        this.headerButton = button;
        this.footerButton = button2;
        this.tapAction = tapAction;
        this.placeholderSection = placeholderSection;
        this.embeddedImageSection = embeddedImageSection;
        this.searchCommonPlaceholderSection = searchCommonPlaceholderSection;
        this.searchMessageSection = searchCommonMessageSection;
        this.tileSection = tileSection;
        this.maxDisplayItems = l;
        this.layout = layout;
        this.backgroundColor = color;
        this.isMultiPathGroup = z;
        this.renderSectionDivider = bool;
    }
}
