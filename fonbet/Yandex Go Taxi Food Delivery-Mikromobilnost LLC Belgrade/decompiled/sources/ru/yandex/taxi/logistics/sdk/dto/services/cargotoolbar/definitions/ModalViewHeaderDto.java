package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ModalViewHeaderDto;", "", "icon", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/RemoteIconDto;", "iconText", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "contentItem", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ModalViewListItemDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/RemoteIconDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ModalViewListItemDto;)V", "getIcon", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/RemoteIconDto;", "getIconText", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getBackgroundColor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "getContentItem", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ModalViewListItemDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ModalViewHeaderDto {
    private final ColorDto backgroundColor;
    private final ModalViewListItemDto contentItem;
    private final RemoteIconDto icon;
    private final AttributedTextDto iconText;

    public ModalViewHeaderDto(@Json(name = "icon") RemoteIconDto remoteIconDto, @Json(name = "icon_text") AttributedTextDto attributedTextDto, @Json(name = "background_color") ColorDto colorDto, @Json(name = "content_item") ModalViewListItemDto modalViewListItemDto) {
        this.icon = remoteIconDto;
        this.iconText = attributedTextDto;
        this.backgroundColor = colorDto;
        this.contentItem = modalViewListItemDto;
    }

    public static /* synthetic */ ModalViewHeaderDto copy$default(ModalViewHeaderDto modalViewHeaderDto, RemoteIconDto remoteIconDto, AttributedTextDto attributedTextDto, ColorDto colorDto, ModalViewListItemDto modalViewListItemDto, int i, Object obj) {
        if ((i & 1) != 0) {
            remoteIconDto = modalViewHeaderDto.icon;
        }
        if ((i & 2) != 0) {
            attributedTextDto = modalViewHeaderDto.iconText;
        }
        if ((i & 4) != 0) {
            colorDto = modalViewHeaderDto.backgroundColor;
        }
        if ((i & 8) != 0) {
            modalViewListItemDto = modalViewHeaderDto.contentItem;
        }
        return modalViewHeaderDto.copy(remoteIconDto, attributedTextDto, colorDto, modalViewListItemDto);
    }

    /* renamed from: component1, reason: from getter */
    public final RemoteIconDto getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getIconText() {
        return this.iconText;
    }

    /* renamed from: component3, reason: from getter */
    public final ColorDto getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final ModalViewListItemDto getContentItem() {
        return this.contentItem;
    }

    public final ModalViewHeaderDto copy(@Json(name = "icon") RemoteIconDto icon, @Json(name = "icon_text") AttributedTextDto iconText, @Json(name = "background_color") ColorDto backgroundColor, @Json(name = "content_item") ModalViewListItemDto contentItem) {
        return new ModalViewHeaderDto(icon, iconText, backgroundColor, contentItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalViewHeaderDto)) {
            return false;
        }
        ModalViewHeaderDto modalViewHeaderDto = (ModalViewHeaderDto) other;
        return jl40.l(this.icon, modalViewHeaderDto.icon) && jl40.l(this.iconText, modalViewHeaderDto.iconText) && jl40.l(this.backgroundColor, modalViewHeaderDto.backgroundColor) && jl40.l(this.contentItem, modalViewHeaderDto.contentItem);
    }

    public final ColorDto getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ModalViewListItemDto getContentItem() {
        return this.contentItem;
    }

    public final RemoteIconDto getIcon() {
        return this.icon;
    }

    public final AttributedTextDto getIconText() {
        return this.iconText;
    }

    public int hashCode() {
        int hashCode = this.icon.hashCode() * 31;
        AttributedTextDto attributedTextDto = this.iconText;
        return this.contentItem.hashCode() + ((this.backgroundColor.hashCode() + ((hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31)) * 31);
    }

    public String toString() {
        return "ModalViewHeaderDto(icon=" + this.icon + ", iconText=" + this.iconText + ", backgroundColor=" + this.backgroundColor + ", contentItem=" + this.contentItem + Extension.C_BRAKE;
    }
}
