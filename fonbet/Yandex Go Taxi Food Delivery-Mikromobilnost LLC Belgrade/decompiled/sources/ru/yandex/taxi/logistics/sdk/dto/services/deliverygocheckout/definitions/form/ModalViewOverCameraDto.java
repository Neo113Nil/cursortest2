package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ModalViewOverCameraDto;", "", "id", "", "layout", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormLayoutOverrideDto;", "initialType", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormLayoutOverrideDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto;)V", "getId", "()Ljava/lang/String;", "getLayout", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormLayoutOverrideDto;", "getInitialType", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SmartCameraTypeDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ModalViewOverCameraDto {
    private final String id;
    private final SmartCameraTypeDto initialType;
    private final FormLayoutOverrideDto layout;

    public ModalViewOverCameraDto(@Json(name = "id") String str, @Json(name = "layout") FormLayoutOverrideDto formLayoutOverrideDto, @Json(name = "initial_type") SmartCameraTypeDto smartCameraTypeDto) {
        this.id = str;
        this.layout = formLayoutOverrideDto;
        this.initialType = smartCameraTypeDto;
    }

    public static /* synthetic */ ModalViewOverCameraDto copy$default(ModalViewOverCameraDto modalViewOverCameraDto, String str, FormLayoutOverrideDto formLayoutOverrideDto, SmartCameraTypeDto smartCameraTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modalViewOverCameraDto.id;
        }
        if ((i & 2) != 0) {
            formLayoutOverrideDto = modalViewOverCameraDto.layout;
        }
        if ((i & 4) != 0) {
            smartCameraTypeDto = modalViewOverCameraDto.initialType;
        }
        return modalViewOverCameraDto.copy(str, formLayoutOverrideDto, smartCameraTypeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final FormLayoutOverrideDto getLayout() {
        return this.layout;
    }

    /* renamed from: component3, reason: from getter */
    public final SmartCameraTypeDto getInitialType() {
        return this.initialType;
    }

    public final ModalViewOverCameraDto copy(@Json(name = "id") String id, @Json(name = "layout") FormLayoutOverrideDto layout, @Json(name = "initial_type") SmartCameraTypeDto initialType) {
        return new ModalViewOverCameraDto(id, layout, initialType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalViewOverCameraDto)) {
            return false;
        }
        ModalViewOverCameraDto modalViewOverCameraDto = (ModalViewOverCameraDto) other;
        return jl40.l(this.id, modalViewOverCameraDto.id) && jl40.l(this.layout, modalViewOverCameraDto.layout) && jl40.l(this.initialType, modalViewOverCameraDto.initialType);
    }

    public final String getId() {
        return this.id;
    }

    public final SmartCameraTypeDto getInitialType() {
        return this.initialType;
    }

    public final FormLayoutOverrideDto getLayout() {
        return this.layout;
    }

    public int hashCode() {
        return this.initialType.hashCode() + ((this.layout.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "ModalViewOverCameraDto(id=" + this.id + ", layout=" + this.layout + ", initialType=" + this.initialType + Extension.C_BRAKE;
    }
}
