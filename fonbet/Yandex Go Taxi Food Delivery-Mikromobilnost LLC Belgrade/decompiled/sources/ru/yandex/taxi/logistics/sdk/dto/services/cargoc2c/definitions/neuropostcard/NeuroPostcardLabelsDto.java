package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardLabelsDto;", "", "watermark", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto;", "sign", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;)V", "getWatermark", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardImageDto;", "getSign", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NeuroPostcardLabelsDto {
    private final AttributedTextDto sign;
    private final NeuroPostcardImageDto watermark;

    public NeuroPostcardLabelsDto(@Json(name = "watermark") NeuroPostcardImageDto neuroPostcardImageDto, @Json(name = "sign") AttributedTextDto attributedTextDto) {
        this.watermark = neuroPostcardImageDto;
        this.sign = attributedTextDto;
    }

    public static /* synthetic */ NeuroPostcardLabelsDto copy$default(NeuroPostcardLabelsDto neuroPostcardLabelsDto, NeuroPostcardImageDto neuroPostcardImageDto, AttributedTextDto attributedTextDto, int i, Object obj) {
        if ((i & 1) != 0) {
            neuroPostcardImageDto = neuroPostcardLabelsDto.watermark;
        }
        if ((i & 2) != 0) {
            attributedTextDto = neuroPostcardLabelsDto.sign;
        }
        return neuroPostcardLabelsDto.copy(neuroPostcardImageDto, attributedTextDto);
    }

    /* renamed from: component1, reason: from getter */
    public final NeuroPostcardImageDto getWatermark() {
        return this.watermark;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getSign() {
        return this.sign;
    }

    public final NeuroPostcardLabelsDto copy(@Json(name = "watermark") NeuroPostcardImageDto watermark, @Json(name = "sign") AttributedTextDto sign) {
        return new NeuroPostcardLabelsDto(watermark, sign);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NeuroPostcardLabelsDto)) {
            return false;
        }
        NeuroPostcardLabelsDto neuroPostcardLabelsDto = (NeuroPostcardLabelsDto) other;
        return jl40.l(this.watermark, neuroPostcardLabelsDto.watermark) && jl40.l(this.sign, neuroPostcardLabelsDto.sign);
    }

    public final AttributedTextDto getSign() {
        return this.sign;
    }

    public final NeuroPostcardImageDto getWatermark() {
        return this.watermark;
    }

    public int hashCode() {
        NeuroPostcardImageDto neuroPostcardImageDto = this.watermark;
        int hashCode = (neuroPostcardImageDto == null ? 0 : neuroPostcardImageDto.hashCode()) * 31;
        AttributedTextDto attributedTextDto = this.sign;
        return hashCode + (attributedTextDto != null ? attributedTextDto.hashCode() : 0);
    }

    public String toString() {
        return "NeuroPostcardLabelsDto(watermark=" + this.watermark + ", sign=" + this.sign + Extension.C_BRAKE;
    }
}
