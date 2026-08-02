package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/AIChatDynamicTextItemDto;", "", "displayTimeMs", "", "dynamicText", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "<init>", "(ILru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;)V", "getDisplayTimeMs", "()I", "getDynamicText", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AIChatDynamicTextItemDto {
    private final int displayTimeMs;
    private final AttributedTextDto dynamicText;

    public AIChatDynamicTextItemDto(@Json(name = "display_time_ms") int i, @Json(name = "dynamic_text") AttributedTextDto attributedTextDto) {
        this.displayTimeMs = i;
        this.dynamicText = attributedTextDto;
    }

    public static /* synthetic */ AIChatDynamicTextItemDto copy$default(AIChatDynamicTextItemDto aIChatDynamicTextItemDto, int i, AttributedTextDto attributedTextDto, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aIChatDynamicTextItemDto.displayTimeMs;
        }
        if ((i2 & 2) != 0) {
            attributedTextDto = aIChatDynamicTextItemDto.dynamicText;
        }
        return aIChatDynamicTextItemDto.copy(i, attributedTextDto);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDisplayTimeMs() {
        return this.displayTimeMs;
    }

    /* renamed from: component2, reason: from getter */
    public final AttributedTextDto getDynamicText() {
        return this.dynamicText;
    }

    public final AIChatDynamicTextItemDto copy(@Json(name = "display_time_ms") int displayTimeMs, @Json(name = "dynamic_text") AttributedTextDto dynamicText) {
        return new AIChatDynamicTextItemDto(displayTimeMs, dynamicText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIChatDynamicTextItemDto)) {
            return false;
        }
        AIChatDynamicTextItemDto aIChatDynamicTextItemDto = (AIChatDynamicTextItemDto) other;
        return this.displayTimeMs == aIChatDynamicTextItemDto.displayTimeMs && jl40.l(this.dynamicText, aIChatDynamicTextItemDto.dynamicText);
    }

    public final int getDisplayTimeMs() {
        return this.displayTimeMs;
    }

    public final AttributedTextDto getDynamicText() {
        return this.dynamicText;
    }

    public int hashCode() {
        return this.dynamicText.hashCode() + (Integer.hashCode(this.displayTimeMs) * 31);
    }

    public String toString() {
        return "AIChatDynamicTextItemDto(displayTimeMs=" + this.displayTimeMs + ", dynamicText=" + this.dynamicText + Extension.C_BRAKE;
    }
}
