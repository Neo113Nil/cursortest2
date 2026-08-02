package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.chooseprofile;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/chooseprofile/ExistingProfileDescriptionDto;", "", "text", "", "textColor", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;)V", "getText", "()Ljava/lang/String;", "getTextColor", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ColorDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ExistingProfileDescriptionDto {
    private final String text;
    private final ColorDto textColor;

    public ExistingProfileDescriptionDto(@Json(name = "text") String str, @Json(name = "text_color") ColorDto colorDto) {
        this.text = str;
        this.textColor = colorDto;
    }

    public static /* synthetic */ ExistingProfileDescriptionDto copy$default(ExistingProfileDescriptionDto existingProfileDescriptionDto, String str, ColorDto colorDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = existingProfileDescriptionDto.text;
        }
        if ((i & 2) != 0) {
            colorDto = existingProfileDescriptionDto.textColor;
        }
        return existingProfileDescriptionDto.copy(str, colorDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final ColorDto getTextColor() {
        return this.textColor;
    }

    public final ExistingProfileDescriptionDto copy(@Json(name = "text") String text, @Json(name = "text_color") ColorDto textColor) {
        return new ExistingProfileDescriptionDto(text, textColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExistingProfileDescriptionDto)) {
            return false;
        }
        ExistingProfileDescriptionDto existingProfileDescriptionDto = (ExistingProfileDescriptionDto) other;
        return jl40.l(this.text, existingProfileDescriptionDto.text) && jl40.l(this.textColor, existingProfileDescriptionDto.textColor);
    }

    public final String getText() {
        return this.text;
    }

    public final ColorDto getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        ColorDto colorDto = this.textColor;
        return hashCode + (colorDto == null ? 0 : colorDto.hashCode());
    }

    public String toString() {
        return "ExistingProfileDescriptionDto(text=" + this.text + ", textColor=" + this.textColor + Extension.C_BRAKE;
    }
}
