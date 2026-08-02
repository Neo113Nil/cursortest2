package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NumberInputTypeDto;", "", "minValue", "", "maxValue", "invalidInputMessage", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;)V", "getMinValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxValue", "getInvalidInputMessage", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NumberInputTypeDto;", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NumberInputTypeDto {
    private final AttributedTextDto invalidInputMessage;
    private final Integer maxValue;
    private final Integer minValue;

    public NumberInputTypeDto(@Json(name = "min_value") Integer num, @Json(name = "max_value") Integer num2, @Json(name = "invalid_input_message") AttributedTextDto attributedTextDto) {
        this.minValue = num;
        this.maxValue = num2;
        this.invalidInputMessage = attributedTextDto;
    }

    public static /* synthetic */ NumberInputTypeDto copy$default(NumberInputTypeDto numberInputTypeDto, Integer num, Integer num2, AttributedTextDto attributedTextDto, int i, Object obj) {
        if ((i & 1) != 0) {
            num = numberInputTypeDto.minValue;
        }
        if ((i & 2) != 0) {
            num2 = numberInputTypeDto.maxValue;
        }
        if ((i & 4) != 0) {
            attributedTextDto = numberInputTypeDto.invalidInputMessage;
        }
        return numberInputTypeDto.copy(num, num2, attributedTextDto);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getMinValue() {
        return this.minValue;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: component3, reason: from getter */
    public final AttributedTextDto getInvalidInputMessage() {
        return this.invalidInputMessage;
    }

    public final NumberInputTypeDto copy(@Json(name = "min_value") Integer minValue, @Json(name = "max_value") Integer maxValue, @Json(name = "invalid_input_message") AttributedTextDto invalidInputMessage) {
        return new NumberInputTypeDto(minValue, maxValue, invalidInputMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NumberInputTypeDto)) {
            return false;
        }
        NumberInputTypeDto numberInputTypeDto = (NumberInputTypeDto) other;
        return jl40.l(this.minValue, numberInputTypeDto.minValue) && jl40.l(this.maxValue, numberInputTypeDto.maxValue) && jl40.l(this.invalidInputMessage, numberInputTypeDto.invalidInputMessage);
    }

    public final AttributedTextDto getInvalidInputMessage() {
        return this.invalidInputMessage;
    }

    public final Integer getMaxValue() {
        return this.maxValue;
    }

    public final Integer getMinValue() {
        return this.minValue;
    }

    public int hashCode() {
        Integer num = this.minValue;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxValue;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        AttributedTextDto attributedTextDto = this.invalidInputMessage;
        return hashCode2 + (attributedTextDto != null ? attributedTextDto.hashCode() : 0);
    }

    public String toString() {
        return "NumberInputTypeDto(minValue=" + this.minValue + ", maxValue=" + this.maxValue + ", invalidInputMessage=" + this.invalidInputMessage + Extension.C_BRAKE;
    }
}
