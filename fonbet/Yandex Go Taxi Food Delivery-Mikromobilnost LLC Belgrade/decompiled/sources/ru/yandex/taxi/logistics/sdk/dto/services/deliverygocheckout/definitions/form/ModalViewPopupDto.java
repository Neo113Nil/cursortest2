package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ModalViewPopupDto;", "", "id", "", "layout", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormLayoutOverrideDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormLayoutOverrideDto;)V", "getId", "()Ljava/lang/String;", "getLayout", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormLayoutOverrideDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ModalViewPopupDto {
    private final String id;
    private final FormLayoutOverrideDto layout;

    public ModalViewPopupDto(@Json(name = "id") String str, @Json(name = "layout") FormLayoutOverrideDto formLayoutOverrideDto) {
        this.id = str;
        this.layout = formLayoutOverrideDto;
    }

    public static /* synthetic */ ModalViewPopupDto copy$default(ModalViewPopupDto modalViewPopupDto, String str, FormLayoutOverrideDto formLayoutOverrideDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modalViewPopupDto.id;
        }
        if ((i & 2) != 0) {
            formLayoutOverrideDto = modalViewPopupDto.layout;
        }
        return modalViewPopupDto.copy(str, formLayoutOverrideDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final FormLayoutOverrideDto getLayout() {
        return this.layout;
    }

    public final ModalViewPopupDto copy(@Json(name = "id") String id, @Json(name = "layout") FormLayoutOverrideDto layout) {
        return new ModalViewPopupDto(id, layout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalViewPopupDto)) {
            return false;
        }
        ModalViewPopupDto modalViewPopupDto = (ModalViewPopupDto) other;
        return jl40.l(this.id, modalViewPopupDto.id) && jl40.l(this.layout, modalViewPopupDto.layout);
    }

    public final String getId() {
        return this.id;
    }

    public final FormLayoutOverrideDto getLayout() {
        return this.layout;
    }

    public int hashCode() {
        return this.layout.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return "ModalViewPopupDto(id=" + this.id + ", layout=" + this.layout + Extension.C_BRAKE;
    }
}
