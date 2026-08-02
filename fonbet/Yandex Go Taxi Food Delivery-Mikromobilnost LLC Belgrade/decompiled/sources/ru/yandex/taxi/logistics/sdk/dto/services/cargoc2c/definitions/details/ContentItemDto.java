package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto;", "", "ContentItem_ListItemDto", "ContentItem_HeaderDto", "ContentItem_SeparatorDto", "ContentItem_PostcardDto", "ContentItem_DetailsDto", "ContentItem_TextWidgetDto", "ContentItem_BarcodeDto", "ContentItem_PhotosDto", "ContentItem_ActionButtonDto", "ContentItem_SpacerDto", "ContentItem_SlotDto", "Unknown_ContentItemDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_ActionButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_BarcodeDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_DetailsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_HeaderDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_ListItemDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_PhotosDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_PostcardDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_SeparatorDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_SlotDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_SpacerDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_TextWidgetDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$Unknown_ContentItemDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class ContentItemDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_ActionButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentActionButtonDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentActionButtonDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentActionButtonDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_ActionButtonDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentItem_ActionButtonDto extends ContentItemDto {
        public final String a;
        public final ContentActionButtonDto b;

        public ContentItem_ActionButtonDto(@Json(name = "type") String str, ContentActionButtonDto contentActionButtonDto) {
            this.a = str;
            this.b = contentActionButtonDto;
        }

        public final ContentItem_ActionButtonDto copy(@Json(name = "type") String type, ContentActionButtonDto value) {
            return new ContentItem_ActionButtonDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItem_ActionButtonDto)) {
                return false;
            }
            ContentItem_ActionButtonDto contentItem_ActionButtonDto = (ContentItem_ActionButtonDto) obj;
            return this.a.equals(contentItem_ActionButtonDto.a) && this.b.equals(contentItem_ActionButtonDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ContentItem_ActionButtonDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_BarcodeDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentBarcodeItemDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentBarcodeItemDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentBarcodeItemDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_BarcodeDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentItem_BarcodeDto extends ContentItemDto {
        public final String a;
        public final ContentBarcodeItemDto b;

        public ContentItem_BarcodeDto(@Json(name = "type") String str, ContentBarcodeItemDto contentBarcodeItemDto) {
            this.a = str;
            this.b = contentBarcodeItemDto;
        }

        public final ContentItem_BarcodeDto copy(@Json(name = "type") String type, ContentBarcodeItemDto value) {
            return new ContentItem_BarcodeDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItem_BarcodeDto)) {
                return false;
            }
            ContentItem_BarcodeDto contentItem_BarcodeDto = (ContentItem_BarcodeDto) obj;
            return this.a.equals(contentItem_BarcodeDto.a) && this.b.equals(contentItem_BarcodeDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ContentItem_BarcodeDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_DetailsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentDetailsItemDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentDetailsItemDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentDetailsItemDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_DetailsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentItem_DetailsDto extends ContentItemDto {
        public final String a;
        public final ContentDetailsItemDto b;

        public ContentItem_DetailsDto(@Json(name = "type") String str, ContentDetailsItemDto contentDetailsItemDto) {
            this.a = str;
            this.b = contentDetailsItemDto;
        }

        public final ContentItem_DetailsDto copy(@Json(name = "type") String type, ContentDetailsItemDto value) {
            return new ContentItem_DetailsDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItem_DetailsDto)) {
                return false;
            }
            ContentItem_DetailsDto contentItem_DetailsDto = (ContentItem_DetailsDto) obj;
            return this.a.equals(contentItem_DetailsDto.a) && this.b.equals(contentItem_DetailsDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ContentItem_DetailsDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_HeaderDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentHeaderItemDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentHeaderItemDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentHeaderItemDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_HeaderDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentItem_HeaderDto extends ContentItemDto {
        public final String a;
        public final ContentHeaderItemDto b;

        public ContentItem_HeaderDto(@Json(name = "type") String str, ContentHeaderItemDto contentHeaderItemDto) {
            this.a = str;
            this.b = contentHeaderItemDto;
        }

        public final ContentItem_HeaderDto copy(@Json(name = "type") String type, ContentHeaderItemDto value) {
            return new ContentItem_HeaderDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItem_HeaderDto)) {
                return false;
            }
            ContentItem_HeaderDto contentItem_HeaderDto = (ContentItem_HeaderDto) obj;
            return this.a.equals(contentItem_HeaderDto.a) && this.b.equals(contentItem_HeaderDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ContentItem_HeaderDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_ListItemDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentListItemDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentListItemDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentListItemDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_ListItemDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentItem_ListItemDto extends ContentItemDto {
        public final String a;
        public final ContentListItemDto b;

        public ContentItem_ListItemDto(@Json(name = "type") String str, ContentListItemDto contentListItemDto) {
            this.a = str;
            this.b = contentListItemDto;
        }

        public final ContentItem_ListItemDto copy(@Json(name = "type") String type, ContentListItemDto value) {
            return new ContentItem_ListItemDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItem_ListItemDto)) {
                return false;
            }
            ContentItem_ListItemDto contentItem_ListItemDto = (ContentItem_ListItemDto) obj;
            return this.a.equals(contentItem_ListItemDto.a) && this.b.equals(contentItem_ListItemDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ContentItem_ListItemDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_PhotosDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentPhotosItemDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentPhotosItemDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentPhotosItemDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_PhotosDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentItem_PhotosDto extends ContentItemDto {
        public final String a;
        public final ContentPhotosItemDto b;

        public ContentItem_PhotosDto(@Json(name = "type") String str, ContentPhotosItemDto contentPhotosItemDto) {
            this.a = str;
            this.b = contentPhotosItemDto;
        }

        public final ContentItem_PhotosDto copy(@Json(name = "type") String type, ContentPhotosItemDto value) {
            return new ContentItem_PhotosDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItem_PhotosDto)) {
                return false;
            }
            ContentItem_PhotosDto contentItem_PhotosDto = (ContentItem_PhotosDto) obj;
            return this.a.equals(contentItem_PhotosDto.a) && this.b.equals(contentItem_PhotosDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ContentItem_PhotosDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_PostcardDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentPostcardItemDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentPostcardItemDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentPostcardItemDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_PostcardDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentItem_PostcardDto extends ContentItemDto {
        public final String a;
        public final ContentPostcardItemDto b;

        public ContentItem_PostcardDto(@Json(name = "type") String str, ContentPostcardItemDto contentPostcardItemDto) {
            this.a = str;
            this.b = contentPostcardItemDto;
        }

        public final ContentItem_PostcardDto copy(@Json(name = "type") String type, ContentPostcardItemDto value) {
            return new ContentItem_PostcardDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItem_PostcardDto)) {
                return false;
            }
            ContentItem_PostcardDto contentItem_PostcardDto = (ContentItem_PostcardDto) obj;
            return this.a.equals(contentItem_PostcardDto.a) && this.b.equals(contentItem_PostcardDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ContentItem_PostcardDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_SeparatorDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSeparatorItemDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSeparatorItemDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSeparatorItemDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_SeparatorDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentItem_SeparatorDto extends ContentItemDto {
        public final String a;
        public final ContentSeparatorItemDto b;

        public ContentItem_SeparatorDto(@Json(name = "type") String str, ContentSeparatorItemDto contentSeparatorItemDto) {
            this.a = str;
            this.b = contentSeparatorItemDto;
        }

        public final ContentItem_SeparatorDto copy(@Json(name = "type") String type, ContentSeparatorItemDto value) {
            return new ContentItem_SeparatorDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItem_SeparatorDto)) {
                return false;
            }
            ContentItem_SeparatorDto contentItem_SeparatorDto = (ContentItem_SeparatorDto) obj;
            return this.a.equals(contentItem_SeparatorDto.a) && this.b.equals(contentItem_SeparatorDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ContentItem_SeparatorDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_SlotDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSlotDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSlotDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSlotDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_SlotDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentItem_SlotDto extends ContentItemDto {
        public final String a;
        public final ContentSlotDto b;

        public ContentItem_SlotDto(@Json(name = "type") String str, ContentSlotDto contentSlotDto) {
            this.a = str;
            this.b = contentSlotDto;
        }

        public final ContentItem_SlotDto copy(@Json(name = "type") String type, ContentSlotDto value) {
            return new ContentItem_SlotDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItem_SlotDto)) {
                return false;
            }
            ContentItem_SlotDto contentItem_SlotDto = (ContentItem_SlotDto) obj;
            return this.a.equals(contentItem_SlotDto.a) && this.b.equals(contentItem_SlotDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ContentItem_SlotDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_SpacerDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSpacerDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSpacerDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentSpacerDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_SpacerDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentItem_SpacerDto extends ContentItemDto {
        public final String a;
        public final ContentSpacerDto b;

        public ContentItem_SpacerDto(@Json(name = "type") String str, ContentSpacerDto contentSpacerDto) {
            this.a = str;
            this.b = contentSpacerDto;
        }

        public final ContentItem_SpacerDto copy(@Json(name = "type") String type, ContentSpacerDto value) {
            return new ContentItem_SpacerDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItem_SpacerDto)) {
                return false;
            }
            ContentItem_SpacerDto contentItem_SpacerDto = (ContentItem_SpacerDto) obj;
            return this.a.equals(contentItem_SpacerDto.a) && this.b.equals(contentItem_SpacerDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ContentItem_SpacerDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_TextWidgetDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextWidgetItemDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextWidgetItemDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentTextWidgetItemDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$ContentItem_TextWidgetDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ContentItem_TextWidgetDto extends ContentItemDto {
        public final String a;
        public final ContentTextWidgetItemDto b;

        public ContentItem_TextWidgetDto(@Json(name = "type") String str, ContentTextWidgetItemDto contentTextWidgetItemDto) {
            this.a = str;
            this.b = contentTextWidgetItemDto;
        }

        public final ContentItem_TextWidgetDto copy(@Json(name = "type") String type, ContentTextWidgetItemDto value) {
            return new ContentItem_TextWidgetDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItem_TextWidgetDto)) {
                return false;
            }
            ContentItem_TextWidgetDto contentItem_TextWidgetDto = (ContentItem_TextWidgetDto) obj;
            return this.a.equals(contentItem_TextWidgetDto.a) && this.b.equals(contentItem_TextWidgetDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ContentItem_TextWidgetDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$Unknown_ContentItemDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/details/ContentItemDto$Unknown_ContentItemDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_ContentItemDto extends ContentItemDto {
        public final String a;

        public Unknown_ContentItemDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_ContentItemDto copy(@Json(name = "type") String type) {
            return new Unknown_ContentItemDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_ContentItemDto) && jl40.l(this.a, ((Unknown_ContentItemDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_ContentItemDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_ContentItemDto() {
            this(0);
        }

        public /* synthetic */ Unknown_ContentItemDto(int i) {
            this("unknown");
        }
    }
}
