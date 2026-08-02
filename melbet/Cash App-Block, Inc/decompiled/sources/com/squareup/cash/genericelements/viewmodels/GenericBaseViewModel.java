package com.squareup.cash.genericelements.viewmodels;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.genericelements.ui.ArcadeButtonElement;
import com.squareup.protos.cash.genericelements.ui.ArcadeTextElement;
import com.squareup.protos.cash.genericelements.ui.AvatarElement;
import com.squareup.protos.cash.genericelements.ui.Button$IconButtonElement;
import com.squareup.protos.cash.genericelements.ui.Button$TextButtonElement;
import com.squareup.protos.cash.genericelements.ui.Button$Type;
import com.squareup.protos.cash.genericelements.ui.SemanticBackgroundColor;
import com.squareup.protos.cash.genericelements.ui.SemanticIconColor;
import com.squareup.protos.cash.genericelements.ui.TextElement;
import com.squareup.protos.cash.genericelements.ui.VerticalAlignment;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class GenericBaseViewModel {

    /* loaded from: classes5.dex */
    public final class ArcadeBadgedAvatarViewModel extends GenericBaseViewModel {
        public final Alignment alignment;
        public final SemanticBackgroundColor backgroundColor;
        public final Badge badge;
        public final String contentDescription;
        public final Color customBackgroundColor;
        public final Image image;
        public final String monogram;
        public final Size size;

        public interface Badge {

            public final class LocalIcon implements Badge {
                public final String iconId;
                public final SemanticIconColor tintColor;

                public LocalIcon(String str, SemanticIconColor semanticIconColor) {
                    str.getClass();
                    this.iconId = str;
                    this.tintColor = semanticIconColor;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof LocalIcon)) {
                        return false;
                    }
                    LocalIcon localIcon = (LocalIcon) obj;
                    return Intrinsics.areEqual(this.iconId, localIcon.iconId) && this.tintColor == localIcon.tintColor;
                }

                public final int hashCode() {
                    int hashCode = this.iconId.hashCode() * 31;
                    SemanticIconColor semanticIconColor = this.tintColor;
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (semanticIconColor == null ? 0 : semanticIconColor.hashCode())) * 31, 31, true);
                }

                public final String toString() {
                    return "LocalIcon(iconId=" + this.iconId + ", tintColor=" + this.tintColor + ", colorizeImage=true, backgroundColor=null)";
                }
            }

            public final class RemoteImage implements Badge {
                public final boolean colorizeImage;
                public final com.squareup.protos.cash.ui.Image image;
                public final LocalIcon placeholder;
                public final SemanticIconColor tintColor;

                public RemoteImage(com.squareup.protos.cash.ui.Image image, boolean z, LocalIcon localIcon, SemanticIconColor semanticIconColor) {
                    image.getClass();
                    this.image = image;
                    this.colorizeImage = z;
                    this.placeholder = localIcon;
                    this.tintColor = semanticIconColor;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof RemoteImage)) {
                        return false;
                    }
                    RemoteImage remoteImage = (RemoteImage) obj;
                    return Intrinsics.areEqual(this.image, remoteImage.image) && this.colorizeImage == remoteImage.colorizeImage && Intrinsics.areEqual(this.placeholder, remoteImage.placeholder) && this.tintColor == remoteImage.tintColor;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.colorizeImage);
                    LocalIcon localIcon = this.placeholder;
                    int hashCode = (m + (localIcon == null ? 0 : localIcon.hashCode())) * 31;
                    SemanticIconColor semanticIconColor = this.tintColor;
                    return (hashCode + (semanticIconColor != null ? semanticIconColor.hashCode() : 0)) * 31;
                }

                public final String toString() {
                    return "RemoteImage(image=" + this.image + ", colorizeImage=" + this.colorizeImage + ", placeholder=" + this.placeholder + ", tintColor=" + this.tintColor + ", backgroundColor=null)";
                }
            }
        }

        public interface Image {

            public final class LocalIcon implements Image {
                public final String iconId;
                public final SemanticIconColor tintColor;

                public LocalIcon(String str, SemanticIconColor semanticIconColor) {
                    str.getClass();
                    this.iconId = str;
                    this.tintColor = semanticIconColor;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof LocalIcon)) {
                        return false;
                    }
                    LocalIcon localIcon = (LocalIcon) obj;
                    return Intrinsics.areEqual(this.iconId, localIcon.iconId) && this.tintColor == localIcon.tintColor;
                }

                public final int hashCode() {
                    int hashCode = this.iconId.hashCode() * 31;
                    SemanticIconColor semanticIconColor = this.tintColor;
                    return hashCode + (semanticIconColor == null ? 0 : semanticIconColor.hashCode());
                }

                public final String toString() {
                    return "LocalIcon(iconId=" + this.iconId + ", tintColor=" + this.tintColor + ")";
                }
            }

            public final class RemoteIcon implements Image {
                public final boolean colorizeImage;
                public final com.squareup.protos.cash.ui.Image image;
                public final LocalIcon placeholder;

                public RemoteIcon(com.squareup.protos.cash.ui.Image image, boolean z, LocalIcon localIcon) {
                    image.getClass();
                    this.image = image;
                    this.colorizeImage = z;
                    this.placeholder = localIcon;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof RemoteIcon)) {
                        return false;
                    }
                    RemoteIcon remoteIcon = (RemoteIcon) obj;
                    return Intrinsics.areEqual(this.image, remoteIcon.image) && this.colorizeImage == remoteIcon.colorizeImage && Intrinsics.areEqual(this.placeholder, remoteIcon.placeholder);
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.colorizeImage);
                    LocalIcon localIcon = this.placeholder;
                    return m + (localIcon == null ? 0 : localIcon.hashCode());
                }

                public final String toString() {
                    return "RemoteIcon(image=" + this.image + ", colorizeImage=" + this.colorizeImage + ", placeholder=" + this.placeholder + ")";
                }
            }

            public final class RemoteImage implements Image {
                public final boolean colorizeImage;
                public final com.squareup.protos.cash.ui.Image image;
                public final LocalIcon placeholder;
                public final SemanticIconColor tintColor;

                public RemoteImage(com.squareup.protos.cash.ui.Image image, boolean z, LocalIcon localIcon, SemanticIconColor semanticIconColor) {
                    image.getClass();
                    this.image = image;
                    this.colorizeImage = z;
                    this.placeholder = localIcon;
                    this.tintColor = semanticIconColor;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof RemoteImage)) {
                        return false;
                    }
                    RemoteImage remoteImage = (RemoteImage) obj;
                    return Intrinsics.areEqual(this.image, remoteImage.image) && this.colorizeImage == remoteImage.colorizeImage && Intrinsics.areEqual(this.placeholder, remoteImage.placeholder) && this.tintColor == remoteImage.tintColor;
                }

                public final int hashCode() {
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.image.hashCode() * 31, 31, this.colorizeImage);
                    LocalIcon localIcon = this.placeholder;
                    int hashCode = (m + (localIcon == null ? 0 : localIcon.hashCode())) * 31;
                    SemanticIconColor semanticIconColor = this.tintColor;
                    return hashCode + (semanticIconColor != null ? semanticIconColor.hashCode() : 0);
                }

                public final String toString() {
                    return "RemoteImage(image=" + this.image + ", colorizeImage=" + this.colorizeImage + ", placeholder=" + this.placeholder + ", tintColor=" + this.tintColor + ")";
                }
            }
        }

        public enum Size {
            /* JADX INFO: Fake field, exist only in values array */
            Size16(16),
            Size32(32),
            Size48(48),
            Size64(64),
            Size96(96);

            public final int value;

            Size(int i) {
                this.value = i;
            }
        }

        public ArcadeBadgedAvatarViewModel(Size size, String str, SemanticBackgroundColor semanticBackgroundColor, Color color, String str2, Image image, Badge badge, Alignment alignment) {
            this.size = size;
            this.monogram = str;
            this.backgroundColor = semanticBackgroundColor;
            this.customBackgroundColor = color;
            this.contentDescription = str2;
            this.image = image;
            this.badge = badge;
            this.alignment = alignment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcadeBadgedAvatarViewModel)) {
                return false;
            }
            ArcadeBadgedAvatarViewModel arcadeBadgedAvatarViewModel = (ArcadeBadgedAvatarViewModel) obj;
            return this.size == arcadeBadgedAvatarViewModel.size && this.monogram.equals(arcadeBadgedAvatarViewModel.monogram) && this.backgroundColor == arcadeBadgedAvatarViewModel.backgroundColor && Intrinsics.areEqual(this.customBackgroundColor, arcadeBadgedAvatarViewModel.customBackgroundColor) && Intrinsics.areEqual(this.contentDescription, arcadeBadgedAvatarViewModel.contentDescription) && this.image.equals(arcadeBadgedAvatarViewModel.image) && Intrinsics.areEqual(this.badge, arcadeBadgedAvatarViewModel.badge) && this.alignment == arcadeBadgedAvatarViewModel.alignment;
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.size.hashCode() * 31, 31, this.monogram);
            SemanticBackgroundColor semanticBackgroundColor = this.backgroundColor;
            int hashCode = (m + (semanticBackgroundColor == null ? 0 : semanticBackgroundColor.hashCode())) * 31;
            Color color = this.customBackgroundColor;
            int hashCode2 = (hashCode + (color == null ? 0 : color.hashCode())) * 31;
            String str = this.contentDescription;
            int hashCode3 = (this.image.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Badge badge = this.badge;
            return this.alignment.hashCode() + ((hashCode3 + (badge != null ? badge.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "ArcadeBadgedAvatarViewModel(size=" + this.size + ", monogram=" + this.monogram + ", backgroundColor=" + this.backgroundColor + ", customBackgroundColor=" + this.customBackgroundColor + ", contentDescription=" + this.contentDescription + ", image=" + this.image + ", badge=" + this.badge + ", alignment=" + this.alignment + ")";
        }
    }

    public final class ArcadeButtonViewModel extends GenericBaseViewModel {
        public final Alignment alignment;
        public final boolean destructive;
        public final GenericTreeElementsViewEvent event;
        public final ArcadeButtonElement.Prominence prominence;
        public final ArcadeButtonElement.Size size;
        public final ArcadeButtonElement.State state;
        public final String text;

        public ArcadeButtonViewModel(String str, GenericTreeElementsViewEvent genericTreeElementsViewEvent, ArcadeButtonElement.State state, ArcadeButtonElement.Size size, ArcadeButtonElement.Prominence prominence, boolean z, Alignment alignment) {
            str.getClass();
            size.getClass();
            prominence.getClass();
            this.text = str;
            this.event = genericTreeElementsViewEvent;
            this.state = state;
            this.size = size;
            this.prominence = prominence;
            this.destructive = z;
            this.alignment = alignment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcadeButtonViewModel)) {
                return false;
            }
            ArcadeButtonViewModel arcadeButtonViewModel = (ArcadeButtonViewModel) obj;
            return Intrinsics.areEqual(this.text, arcadeButtonViewModel.text) && Intrinsics.areEqual(this.event, arcadeButtonViewModel.event) && this.state == arcadeButtonViewModel.state && this.size == arcadeButtonViewModel.size && this.prominence == arcadeButtonViewModel.prominence && this.destructive == arcadeButtonViewModel.destructive && this.alignment == arcadeButtonViewModel.alignment;
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = this.event;
            return this.alignment.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.prominence.hashCode() + ((this.size.hashCode() + ((this.state.hashCode() + ((hashCode + (genericTreeElementsViewEvent == null ? 0 : genericTreeElementsViewEvent.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.destructive);
        }

        public final String toString() {
            return "ArcadeButtonViewModel(text=" + this.text + ", event=" + this.event + ", state=" + this.state + ", size=" + this.size + ", prominence=" + this.prominence + ", destructive=" + this.destructive + ", alignment=" + this.alignment + ")";
        }
    }

    public final class ArcadeTextViewModel extends GenericBaseViewModel {
        public final Alignment alignment;
        public final ColorModel color;
        public final Integer maxLineNumber;
        public final boolean selectable;
        public final ArcadeTextElement.SemanticTextColor semanticColor;
        public final ArcadeTextElement.Style style;
        public final String text;
        public final VerticalAlignment verticalAlignment;

        public ArcadeTextViewModel(String str, ArcadeTextElement.Style style, ColorModel.Accented accented, ArcadeTextElement.SemanticTextColor semanticTextColor, Integer num, VerticalAlignment verticalAlignment, boolean z, Alignment alignment) {
            str.getClass();
            this.text = str;
            this.style = style;
            this.color = accented;
            this.semanticColor = semanticTextColor;
            this.maxLineNumber = num;
            this.verticalAlignment = verticalAlignment;
            this.selectable = z;
            this.alignment = alignment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArcadeTextViewModel)) {
                return false;
            }
            ArcadeTextViewModel arcadeTextViewModel = (ArcadeTextViewModel) obj;
            return Intrinsics.areEqual(this.text, arcadeTextViewModel.text) && this.style == arcadeTextViewModel.style && Intrinsics.areEqual(this.color, arcadeTextViewModel.color) && this.semanticColor == arcadeTextViewModel.semanticColor && Intrinsics.areEqual(this.maxLineNumber, arcadeTextViewModel.maxLineNumber) && this.verticalAlignment == arcadeTextViewModel.verticalAlignment && this.selectable == arcadeTextViewModel.selectable && this.alignment == arcadeTextViewModel.alignment;
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            ArcadeTextElement.Style style = this.style;
            int hashCode2 = (hashCode + (style == null ? 0 : style.hashCode())) * 31;
            ColorModel colorModel = this.color;
            int hashCode3 = (hashCode2 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
            ArcadeTextElement.SemanticTextColor semanticTextColor = this.semanticColor;
            int hashCode4 = (hashCode3 + (semanticTextColor == null ? 0 : semanticTextColor.hashCode())) * 31;
            Integer num = this.maxLineNumber;
            return this.alignment.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.verticalAlignment.hashCode() + ((hashCode4 + (num != null ? num.hashCode() : 0)) * 31)) * 31, 31, this.selectable);
        }

        public final String toString() {
            return "ArcadeTextViewModel(text=" + this.text + ", style=" + this.style + ", color=" + this.color + ", semanticColor=" + this.semanticColor + ", maxLineNumber=" + this.maxLineNumber + ", verticalAlignment=" + this.verticalAlignment + ", selectable=" + this.selectable + ", alignment=" + this.alignment + ")";
        }
    }

    public final class AvatarViewModel extends GenericBaseViewModel {
        public final Alignment alignment;
        public final ColorModel backgroundColor;
        public final AvatarElement.Badge badge;
        public final Image badgeImage;
        public final boolean colorizeAvatar;
        public final String contentDescription;
        public final Image image;
        public final Size size;

        /* loaded from: classes4.dex */
        public enum Size {
            SMALL(40),
            MEDIUM(56),
            LARGE(64);

            public final int value;

            Size(int i) {
                this.value = i;
            }
        }

        public AvatarViewModel(Image image, Size size, boolean z, AvatarElement.Badge badge, Image image2, ColorModel.Accented accented, String str, Alignment alignment) {
            image.getClass();
            this.image = image;
            this.size = size;
            this.colorizeAvatar = z;
            this.badge = badge;
            this.badgeImage = image2;
            this.backgroundColor = accented;
            this.contentDescription = str;
            this.alignment = alignment;
            if (badge == AvatarElement.Badge.IMAGE && image2 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvatarViewModel)) {
                return false;
            }
            AvatarViewModel avatarViewModel = (AvatarViewModel) obj;
            return Intrinsics.areEqual(this.image, avatarViewModel.image) && this.size == avatarViewModel.size && this.colorizeAvatar == avatarViewModel.colorizeAvatar && this.badge == avatarViewModel.badge && Intrinsics.areEqual(this.badgeImage, avatarViewModel.badgeImage) && Intrinsics.areEqual(this.backgroundColor, avatarViewModel.backgroundColor) && Intrinsics.areEqual(this.contentDescription, avatarViewModel.contentDescription) && this.alignment == avatarViewModel.alignment;
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.size.hashCode() + (this.image.hashCode() * 31)) * 31, 31, this.colorizeAvatar);
            AvatarElement.Badge badge = this.badge;
            int hashCode = (m + (badge == null ? 0 : badge.hashCode())) * 31;
            Image image = this.badgeImage;
            int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
            ColorModel colorModel = this.backgroundColor;
            int hashCode3 = (hashCode2 + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
            String str = this.contentDescription;
            return this.alignment.hashCode() + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "AvatarViewModel(image=" + this.image + ", size=" + this.size + ", colorizeAvatar=" + this.colorizeAvatar + ", badge=" + this.badge + ", badgeImage=" + this.badgeImage + ", backgroundColor=" + this.backgroundColor + ", contentDescription=" + this.contentDescription + ", alignment=" + this.alignment + ")";
        }
    }

    public final class BetweenSectionSpacerViewModel extends GenericBaseViewModel {
        public final Alignment alignment;
        public final Size size;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes7.dex */
        public final class Size {
            public static final /* synthetic */ Size[] $VALUES;
            public static final Size LARGE;
            public static final Size XLARGE;
            public static final Size XLARGE_BELLOW_CELL;

            static {
                Size size = new Size("LARGE", 0);
                LARGE = size;
                Size size2 = new Size("XLARGE", 1);
                XLARGE = size2;
                Size size3 = new Size("XLARGE_BELLOW_CELL", 2);
                XLARGE_BELLOW_CELL = size3;
                $VALUES = new Size[]{size, size2, size3};
            }

            public static Size valueOf(String str) {
                return (Size) Enum.valueOf(Size.class, str);
            }

            public static Size[] values() {
                return (Size[]) $VALUES.clone();
            }
        }

        public BetweenSectionSpacerViewModel(Size size) {
            Alignment alignment = Alignment.LEFT;
            this.size = size;
            this.alignment = alignment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BetweenSectionSpacerViewModel)) {
                return false;
            }
            BetweenSectionSpacerViewModel betweenSectionSpacerViewModel = (BetweenSectionSpacerViewModel) obj;
            return this.size == betweenSectionSpacerViewModel.size && this.alignment == betweenSectionSpacerViewModel.alignment;
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final int hashCode() {
            return this.alignment.hashCode() + (this.size.hashCode() * 31);
        }

        public final String toString() {
            return "BetweenSectionSpacerViewModel(size=" + this.size + ", alignment=" + this.alignment + ")";
        }
    }

    public final class BlankDividerBaseViewModel extends GenericBaseViewModel {
        public final Alignment alignment;
        public final Size size;

        /* loaded from: classes7.dex */
        public enum Size {
            SMALL(8),
            LARGE(16),
            X_LARGE(24);

            public final int value;

            Size(int i) {
                this.value = i;
            }
        }

        public BlankDividerBaseViewModel(Size size) {
            Alignment alignment = Alignment.LEFT;
            this.size = size;
            this.alignment = alignment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BlankDividerBaseViewModel)) {
                return false;
            }
            BlankDividerBaseViewModel blankDividerBaseViewModel = (BlankDividerBaseViewModel) obj;
            return this.size == blankDividerBaseViewModel.size && this.alignment == blankDividerBaseViewModel.alignment;
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final int hashCode() {
            return this.alignment.hashCode() + (this.size.hashCode() * 31);
        }

        public final String toString() {
            return "BlankDividerBaseViewModel(size=" + this.size + ", alignment=" + this.alignment + ")";
        }
    }

    /* loaded from: classes9.dex */
    public final class ButtonViewModel extends GenericBaseViewModel {
        public final Alignment alignment;
        public final ColorModel backgroundColor;
        public final ColorModel color;
        public final GenericTreeElementsViewEvent event;
        public final Button$TextButtonElement.Size size;
        public final Button$TextButtonElement.State state;
        public final String text;

        /* renamed from: type, reason: collision with root package name */
        public final Button$Type f1135type;

        public ButtonViewModel(String str, ColorModel.Accented accented, ColorModel.Accented accented2, Button$Type button$Type, Button$TextButtonElement.State state, Button$TextButtonElement.Size size, GenericTreeElementsViewEvent genericTreeElementsViewEvent, Alignment alignment) {
            str.getClass();
            button$Type.getClass();
            size.getClass();
            this.text = str;
            this.color = accented;
            this.backgroundColor = accented2;
            this.f1135type = button$Type;
            this.state = state;
            this.size = size;
            this.event = genericTreeElementsViewEvent;
            this.alignment = alignment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonViewModel)) {
                return false;
            }
            ButtonViewModel buttonViewModel = (ButtonViewModel) obj;
            return Intrinsics.areEqual(this.text, buttonViewModel.text) && Intrinsics.areEqual(this.color, buttonViewModel.color) && Intrinsics.areEqual(this.backgroundColor, buttonViewModel.backgroundColor) && this.f1135type == buttonViewModel.f1135type && this.state == buttonViewModel.state && this.size == buttonViewModel.size && this.event.equals(buttonViewModel.event) && this.alignment == buttonViewModel.alignment;
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            ColorModel colorModel = this.color;
            int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
            ColorModel colorModel2 = this.backgroundColor;
            return this.alignment.hashCode() + ((this.event.hashCode() + ((this.size.hashCode() + ((this.state.hashCode() + ((this.f1135type.hashCode() + ((hashCode2 + (colorModel2 != null ? colorModel2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ButtonViewModel(text=" + this.text + ", color=" + this.color + ", backgroundColor=" + this.backgroundColor + ", type=" + this.f1135type + ", state=" + this.state + ", size=" + this.size + ", event=" + this.event + ", alignment=" + this.alignment + ")";
        }
    }

    public final class CopyCodeViewModel extends GenericBaseViewModel {
        public final Alignment alignment;
        public final String body;
        public final String contentDescription;
        public final String label;

        public CopyCodeViewModel(String str, String str2, String str3) {
            Alignment alignment = Alignment.LEFT;
            str.getClass();
            this.label = str;
            this.body = str2;
            this.contentDescription = str3;
            this.alignment = alignment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CopyCodeViewModel)) {
                return false;
            }
            CopyCodeViewModel copyCodeViewModel = (CopyCodeViewModel) obj;
            return Intrinsics.areEqual(this.label, copyCodeViewModel.label) && Intrinsics.areEqual(this.body, copyCodeViewModel.body) && Intrinsics.areEqual(this.contentDescription, copyCodeViewModel.contentDescription) && this.alignment == copyCodeViewModel.alignment;
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final int hashCode() {
            int hashCode = this.label.hashCode() * 31;
            String str = this.body;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.contentDescription;
            return this.alignment.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CopyCodeViewModel(label=", this.label, ", body=", this.body, ", contentDescription=");
            m.append(this.contentDescription);
            m.append(", alignment=");
            m.append(this.alignment);
            m.append(")");
            return m.toString();
        }
    }

    public final class IconButtonViewModel extends GenericBaseViewModel {
        public final Alignment alignment;
        public final GenericTreeElementsViewEvent event;
        public final Image icon;
        public final Button$IconButtonElement.Size size;
        public final Button$IconButtonElement.State state;

        /* renamed from: type, reason: collision with root package name */
        public final Button$Type f1136type;

        public IconButtonViewModel(Image image, Button$Type button$Type, Button$IconButtonElement.State state, Button$IconButtonElement.Size size, GenericTreeElementsViewEvent genericTreeElementsViewEvent, Alignment alignment) {
            image.getClass();
            size.getClass();
            this.icon = image;
            this.f1136type = button$Type;
            this.state = state;
            this.size = size;
            this.event = genericTreeElementsViewEvent;
            this.alignment = alignment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconButtonViewModel)) {
                return false;
            }
            IconButtonViewModel iconButtonViewModel = (IconButtonViewModel) obj;
            return Intrinsics.areEqual(this.icon, iconButtonViewModel.icon) && this.f1136type == iconButtonViewModel.f1136type && this.state == iconButtonViewModel.state && this.size == iconButtonViewModel.size && Intrinsics.areEqual(this.event, iconButtonViewModel.event) && this.alignment == iconButtonViewModel.alignment;
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final int hashCode() {
            int hashCode = (this.size.hashCode() + ((this.state.hashCode() + ((this.f1136type.hashCode() + (this.icon.hashCode() * 31)) * 31)) * 31)) * 31;
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = this.event;
            return this.alignment.hashCode() + ((hashCode + (genericTreeElementsViewEvent == null ? 0 : genericTreeElementsViewEvent.hashCode())) * 31);
        }

        public final String toString() {
            return "IconButtonViewModel(icon=" + this.icon + ", type=" + this.f1136type + ", state=" + this.state + ", size=" + this.size + ", event=" + this.event + ", alignment=" + this.alignment + ")";
        }
    }

    public final class TextViewModel extends GenericBaseViewModel {
        public final Alignment alignment;
        public final ColorModel color;
        public final Integer maxLineNumber;
        public final boolean selectable;
        public final TextElement.Style style;
        public final String text;
        public final VerticalAlignment verticalAlignment;

        public TextViewModel(String str, TextElement.Style style, ColorModel.Accented accented, Integer num, VerticalAlignment verticalAlignment, boolean z, Alignment alignment) {
            str.getClass();
            style.getClass();
            this.text = str;
            this.style = style;
            this.color = accented;
            this.maxLineNumber = num;
            this.verticalAlignment = verticalAlignment;
            this.selectable = z;
            this.alignment = alignment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextViewModel)) {
                return false;
            }
            TextViewModel textViewModel = (TextViewModel) obj;
            return Intrinsics.areEqual(this.text, textViewModel.text) && this.style == textViewModel.style && Intrinsics.areEqual(this.color, textViewModel.color) && Intrinsics.areEqual(this.maxLineNumber, textViewModel.maxLineNumber) && this.verticalAlignment == textViewModel.verticalAlignment && this.selectable == textViewModel.selectable && this.alignment == textViewModel.alignment;
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final int hashCode() {
            int hashCode = (this.style.hashCode() + (this.text.hashCode() * 31)) * 31;
            ColorModel colorModel = this.color;
            int hashCode2 = (hashCode + (colorModel == null ? 0 : colorModel.hashCode())) * 31;
            Integer num = this.maxLineNumber;
            return this.alignment.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.verticalAlignment.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31)) * 31, 31, this.selectable);
        }

        public final String toString() {
            return "TextViewModel(text=" + this.text + ", style=" + this.style + ", color=" + this.color + ", maxLineNumber=" + this.maxLineNumber + ", verticalAlignment=" + this.verticalAlignment + ", selectable=" + this.selectable + ", alignment=" + this.alignment + ")";
        }
    }

    public final class WithinSectionSpacerViewModel extends GenericBaseViewModel {
        public final Alignment alignment;
        public final Size size;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes7.dex */
        public final class Size {
            public static final /* synthetic */ Size[] $VALUES;
            public static final Size MEDIUM;
            public static final Size SMALL;

            static {
                Size size = new Size("SMALL", 0);
                SMALL = size;
                Size size2 = new Size("MEDIUM", 1);
                MEDIUM = size2;
                $VALUES = new Size[]{size, size2};
            }

            public static Size valueOf(String str) {
                return (Size) Enum.valueOf(Size.class, str);
            }

            public static Size[] values() {
                return (Size[]) $VALUES.clone();
            }
        }

        public WithinSectionSpacerViewModel(Size size) {
            Alignment alignment = Alignment.LEFT;
            this.size = size;
            this.alignment = alignment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WithinSectionSpacerViewModel)) {
                return false;
            }
            WithinSectionSpacerViewModel withinSectionSpacerViewModel = (WithinSectionSpacerViewModel) obj;
            return this.size == withinSectionSpacerViewModel.size && this.alignment == withinSectionSpacerViewModel.alignment;
        }

        @Override // com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel
        public final Alignment getAlignment() {
            return this.alignment;
        }

        public final int hashCode() {
            return this.alignment.hashCode() + (this.size.hashCode() * 31);
        }

        public final String toString() {
            return "WithinSectionSpacerViewModel(size=" + this.size + ", alignment=" + this.alignment + ")";
        }
    }

    public abstract Alignment getAlignment();
}
