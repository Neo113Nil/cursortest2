package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.ly3;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\"#B=\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J?\u0010\u001b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto;", "", "headerImageTag", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "body", "closeButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto$CloseButtonDto;", "confirmButton", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto$ConfirmButtonDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto$CloseButtonDto;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto$ConfirmButtonDto;)V", "getHeaderImageTag", "()Ljava/lang/String;", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getBody", "getCloseButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto$CloseButtonDto;", "getConfirmButton", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto$ConfirmButtonDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "CloseButtonDto", "ConfirmButtonDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class StateModalDto {
    private final AttributedTextDto body;
    private final CloseButtonDto closeButton;
    private final ConfirmButtonDto confirmButton;
    private final String headerImageTag;
    private final AttributedTextDto title;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto$CloseButtonDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CloseButtonDto {
        private final AttributedTextDto title;

        public CloseButtonDto(@Json(name = "title") AttributedTextDto attributedTextDto) {
            this.title = attributedTextDto;
        }

        public static /* synthetic */ CloseButtonDto copy$default(CloseButtonDto closeButtonDto, AttributedTextDto attributedTextDto, int i, Object obj) {
            if ((i & 1) != 0) {
                attributedTextDto = closeButtonDto.title;
            }
            return closeButtonDto.copy(attributedTextDto);
        }

        /* renamed from: component1, reason: from getter */
        public final AttributedTextDto getTitle() {
            return this.title;
        }

        public final CloseButtonDto copy(@Json(name = "title") AttributedTextDto title) {
            return new CloseButtonDto(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CloseButtonDto) && jl40.l(this.title, ((CloseButtonDto) other).title);
        }

        public final AttributedTextDto getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return "CloseButtonDto(title=" + this.title + Extension.C_BRAKE;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/StateModalDto$ConfirmButtonDto;", "", "title", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;)V", "getTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ConfirmButtonDto {
        private final AttributedTextDto title;

        public ConfirmButtonDto(@Json(name = "title") AttributedTextDto attributedTextDto) {
            this.title = attributedTextDto;
        }

        public static /* synthetic */ ConfirmButtonDto copy$default(ConfirmButtonDto confirmButtonDto, AttributedTextDto attributedTextDto, int i, Object obj) {
            if ((i & 1) != 0) {
                attributedTextDto = confirmButtonDto.title;
            }
            return confirmButtonDto.copy(attributedTextDto);
        }

        /* renamed from: component1, reason: from getter */
        public final AttributedTextDto getTitle() {
            return this.title;
        }

        public final ConfirmButtonDto copy(@Json(name = "title") AttributedTextDto title) {
            return new ConfirmButtonDto(title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConfirmButtonDto) && jl40.l(this.title, ((ConfirmButtonDto) other).title);
        }

        public final AttributedTextDto getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.title.hashCode();
        }

        public String toString() {
            return "ConfirmButtonDto(title=" + this.title + Extension.C_BRAKE;
        }
    }

    public StateModalDto(@Json(name = "header_image_tag") String str, @Json(name = "title") AttributedTextDto attributedTextDto, @Json(name = "body") AttributedTextDto attributedTextDto2, @Json(name = "close_button") CloseButtonDto closeButtonDto, @Json(name = "confirm_button") ConfirmButtonDto confirmButtonDto) {
        this.headerImageTag = str;
        this.title = attributedTextDto;
        this.body = attributedTextDto2;
        this.closeButton = closeButtonDto;
        this.confirmButton = confirmButtonDto;
    }

    public static /* synthetic */ StateModalDto copy$default(StateModalDto stateModalDto, String str, AttributedTextDto attributedTextDto, AttributedTextDto attributedTextDto2, CloseButtonDto closeButtonDto, ConfirmButtonDto confirmButtonDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stateModalDto.headerImageTag;
        }
        if ((i & 2) != 0) {
            attributedTextDto = stateModalDto.title;
        }
        if ((i & 4) != 0) {
            attributedTextDto2 = stateModalDto.body;
        }
        if ((i & 8) != 0) {
            closeButtonDto = stateModalDto.closeButton;
        }
        if ((i & 16) != 0) {
            confirmButtonDto = stateModalDto.confirmButton;
        }
        ConfirmButtonDto confirmButtonDto2 = confirmButtonDto;
        AttributedTextDto attributedTextDto3 = attributedTextDto2;
        return stateModalDto.copy(str, attributedTextDto, attributedTextDto3, closeButtonDto, confirmButtonDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHeaderImageTag() {
        return this.headerImageTag;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final AttributedTextDto getBody() {
        return this.body;
    }

    /* renamed from: component4, reason: from getter */
    public final CloseButtonDto getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component5, reason: from getter */
    public final ConfirmButtonDto getConfirmButton() {
        return this.confirmButton;
    }

    public final StateModalDto copy(@Json(name = "header_image_tag") String headerImageTag, @Json(name = "title") AttributedTextDto title, @Json(name = "body") AttributedTextDto body, @Json(name = "close_button") CloseButtonDto closeButton, @Json(name = "confirm_button") ConfirmButtonDto confirmButton) {
        return new StateModalDto(headerImageTag, title, body, closeButton, confirmButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StateModalDto)) {
            return false;
        }
        StateModalDto stateModalDto = (StateModalDto) other;
        return jl40.l(this.headerImageTag, stateModalDto.headerImageTag) && jl40.l(this.title, stateModalDto.title) && jl40.l(this.body, stateModalDto.body) && jl40.l(this.closeButton, stateModalDto.closeButton) && jl40.l(this.confirmButton, stateModalDto.confirmButton);
    }

    public final AttributedTextDto getBody() {
        return this.body;
    }

    public final CloseButtonDto getCloseButton() {
        return this.closeButton;
    }

    public final ConfirmButtonDto getConfirmButton() {
        return this.confirmButton;
    }

    public final String getHeaderImageTag() {
        return this.headerImageTag;
    }

    public final AttributedTextDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.headerImageTag;
        int e = ly3.e(this.title, (str == null ? 0 : str.hashCode()) * 31, 31);
        AttributedTextDto attributedTextDto = this.body;
        return this.confirmButton.hashCode() + ((this.closeButton.hashCode() + ((e + (attributedTextDto != null ? attributedTextDto.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        return "StateModalDto(headerImageTag=" + this.headerImageTag + ", title=" + this.title + ", body=" + this.body + ", closeButton=" + this.closeButton + ", confirmButton=" + this.confirmButton + Extension.C_BRAKE;
    }
}
