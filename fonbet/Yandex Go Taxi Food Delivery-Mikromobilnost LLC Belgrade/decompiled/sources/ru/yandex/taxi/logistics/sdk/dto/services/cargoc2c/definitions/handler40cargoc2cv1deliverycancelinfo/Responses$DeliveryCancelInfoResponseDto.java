package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliverycancelinfo;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.CancelTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handlersdefinitions.CancelInfoActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001:\u000234BO\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJX\u0010\u001c\u001a\u00020\u001b2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0013R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u0018R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010\u001a¨\u00065"}, d2 = {"ru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;", "cancelType", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "title", "subtitle", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handlersdefinitions/CancelInfoActionDto;", "contentActions", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto$CancelButtonDto;", "cancelButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto$DismissButtonDto;", "dismissButton", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto$CancelButtonDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto$DismissButtonDto;)V", "component1", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;", "component2", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "component3", "component4", "()Ljava/util/List;", "component5", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto$CancelButtonDto;", "component6", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto$DismissButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto;", "copy", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto$CancelButtonDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto$DismissButtonDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CancelTypeDto;", "getCancelType", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getTitle", "getSubtitle", "Ljava/util/List;", "getContentActions", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto$CancelButtonDto;", "getCancelButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto$DismissButtonDto;", "getDismissButton", "CancelButtonDto", "DismissButtonDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Responses$DeliveryCancelInfoResponseDto {
    private final CancelButtonDto cancelButton;
    private final CancelTypeDto cancelType;
    private final List<CancelInfoActionDto> contentActions;
    private final DismissButtonDto dismissButton;
    private final AttributedTextDto subtitle;
    private final AttributedTextDto title;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto$CancelButtonDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "price", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getPrice", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CancelButtonDto {
        private final AttributedTextDto price;
        private final AttributedTextDto title;

        public CancelButtonDto(@Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "price") AttributedTextDto attributedTextDto2) {
            this.title = attributedTextDto;
            this.price = attributedTextDto2;
        }

        public static /* synthetic */ CancelButtonDto copy$default(CancelButtonDto cancelButtonDto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, int i, Object obj) {
            if ((i & 1) != 0) {
                attributedTextDto = cancelButtonDto.title;
            }
            if ((i & 2) != 0) {
                attributedTextDto2 = cancelButtonDto.price;
            }
            return cancelButtonDto.copy(attributedTextDto, attributedTextDto2);
        }

        /* renamed from: component1, reason: from getter */
        public final AttributedTextDto getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final AttributedTextDto getPrice() {
            return this.price;
        }

        public final CancelButtonDto copy(@Json(name = "title") AttributedTextDto title, @Json(name = "price") AttributedTextDto price) {
            return new CancelButtonDto(title, price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CancelButtonDto)) {
                return false;
            }
            CancelButtonDto cancelButtonDto = (CancelButtonDto) other;
            return jl40.l(this.title, cancelButtonDto.title) && jl40.l(this.price, cancelButtonDto.price);
        }

        public final AttributedTextDto getPrice() {
            return this.price;
        }

        public final AttributedTextDto getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            AttributedTextDto attributedTextDto = this.price;
            return hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode());
        }

        public String toString() {
            return "CancelButtonDto(title=" + this.title + ", price=" + this.price + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliverycancelinfo/Responses$DeliveryCancelInfoResponseDto$DismissButtonDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DismissButtonDto {
        private final AttributedTextDto title;

        public DismissButtonDto(@Json(name = "title") AttributedTextDto attributedTextDto) {
            this.title = attributedTextDto;
        }

        public static /* synthetic */ DismissButtonDto copy$default(DismissButtonDto dismissButtonDto, AttributedTextDto attributedTextDto, int i, Object obj) {
            if ((i & 1) != 0) {
                attributedTextDto = dismissButtonDto.title;
            }
            return dismissButtonDto.copy(attributedTextDto);
        }

        /* renamed from: component1, reason: from getter */
        public final AttributedTextDto getTitle() {
            return this.title;
        }

        public final DismissButtonDto copy(@Json(name = "title") AttributedTextDto title) {
            return new DismissButtonDto(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DismissButtonDto) && jl40.l(this.title, ((DismissButtonDto) other).title);
        }

        public final AttributedTextDto getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return "DismissButtonDto(title=" + this.title + Extension.C_BRAKE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Responses$DeliveryCancelInfoResponseDto(@Json(name = "cancel_type") CancelTypeDto cancelTypeDto, @Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "subtitle") AttributedTextDto attributedTextDto2, @Json(name = "content_actions") List<? extends CancelInfoActionDto> list, @Json(name = "cancel_button") CancelButtonDto cancelButtonDto, @Json(name = "dismiss_button") DismissButtonDto dismissButtonDto) {
        this.cancelType = cancelTypeDto;
        this.title = attributedTextDto;
        this.subtitle = attributedTextDto2;
        this.contentActions = list;
        this.cancelButton = cancelButtonDto;
        this.dismissButton = dismissButtonDto;
    }

    public static /* synthetic */ Responses$DeliveryCancelInfoResponseDto copy$default(Responses$DeliveryCancelInfoResponseDto responses$DeliveryCancelInfoResponseDto, CancelTypeDto cancelTypeDto, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, List list, CancelButtonDto cancelButtonDto, DismissButtonDto dismissButtonDto, int i, Object obj) {
        if ((i & 1) != 0) {
            cancelTypeDto = responses$DeliveryCancelInfoResponseDto.cancelType;
        }
        if ((i & 2) != 0) {
            attributedTextDto = responses$DeliveryCancelInfoResponseDto.title;
        }
        if ((i & 4) != 0) {
            attributedTextDto2 = responses$DeliveryCancelInfoResponseDto.subtitle;
        }
        if ((i & 8) != 0) {
            list = responses$DeliveryCancelInfoResponseDto.contentActions;
        }
        if ((i & 16) != 0) {
            cancelButtonDto = responses$DeliveryCancelInfoResponseDto.cancelButton;
        }
        if ((i & 32) != 0) {
            dismissButtonDto = responses$DeliveryCancelInfoResponseDto.dismissButton;
        }
        CancelButtonDto cancelButtonDto2 = cancelButtonDto;
        DismissButtonDto dismissButtonDto2 = dismissButtonDto;
        return responses$DeliveryCancelInfoResponseDto.copy(cancelTypeDto, attributedTextDto, attributedTextDto2, list, cancelButtonDto2, dismissButtonDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final CancelTypeDto getCancelType() {
        return this.cancelType;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final List<CancelInfoActionDto> component4() {
        return this.contentActions;
    }

    /* renamed from: component5, reason: from getter */
    public final CancelButtonDto getCancelButton() {
        return this.cancelButton;
    }

    /* renamed from: component6, reason: from getter */
    public final DismissButtonDto getDismissButton() {
        return this.dismissButton;
    }

    public final Responses$DeliveryCancelInfoResponseDto copy(@Json(name = "cancel_type") CancelTypeDto cancelType, @Json(name = "title") AttributedTextDto title, @Json(name = "subtitle") AttributedTextDto subtitle, @Json(name = "content_actions") List<? extends CancelInfoActionDto> contentActions, @Json(name = "cancel_button") CancelButtonDto cancelButton, @Json(name = "dismiss_button") DismissButtonDto dismissButton) {
        return new Responses$DeliveryCancelInfoResponseDto(cancelType, title, subtitle, contentActions, cancelButton, dismissButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Responses$DeliveryCancelInfoResponseDto)) {
            return false;
        }
        Responses$DeliveryCancelInfoResponseDto responses$DeliveryCancelInfoResponseDto = (Responses$DeliveryCancelInfoResponseDto) other;
        return this.cancelType == responses$DeliveryCancelInfoResponseDto.cancelType && jl40.l(this.title, responses$DeliveryCancelInfoResponseDto.title) && jl40.l(this.subtitle, responses$DeliveryCancelInfoResponseDto.subtitle) && jl40.l(this.contentActions, responses$DeliveryCancelInfoResponseDto.contentActions) && jl40.l(this.cancelButton, responses$DeliveryCancelInfoResponseDto.cancelButton) && jl40.l(this.dismissButton, responses$DeliveryCancelInfoResponseDto.dismissButton);
    }

    public final CancelButtonDto getCancelButton() {
        return this.cancelButton;
    }

    public final CancelTypeDto getCancelType() {
        return this.cancelType;
    }

    public final List<CancelInfoActionDto> getContentActions() {
        return this.contentActions;
    }

    public final DismissButtonDto getDismissButton() {
        return this.dismissButton;
    }

    public final AttributedTextDto getSubtitle() {
        return this.subtitle;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.cancelType.hashCode() * 31;
        AttributedTextDto attributedTextDto = this.title;
        int hashCode2 = (hashCode + (attributedTextDto == null ? 0 : attributedTextDto.hashCode())) * 31;
        AttributedTextDto attributedTextDto2 = this.subtitle;
        int hashCode3 = (hashCode2 + (attributedTextDto2 == null ? 0 : attributedTextDto2.hashCode())) * 31;
        List<CancelInfoActionDto> list = this.contentActions;
        int hashCode4 = list != null ? list.hashCode() : 0;
        return this.dismissButton.hashCode() + ((this.cancelButton.hashCode() + ((hashCode3 + hashCode4) * 31)) * 31);
    }

    public String toString() {
        return "DeliveryCancelInfoResponseDto(cancelType=" + this.cancelType + ", title=" + this.title + ", subtitle=" + this.subtitle + ", contentActions=" + this.contentActions + ", cancelButton=" + this.cancelButton + ", dismissButton=" + this.dismissButton + Extension.C_BRAKE;
    }
}
