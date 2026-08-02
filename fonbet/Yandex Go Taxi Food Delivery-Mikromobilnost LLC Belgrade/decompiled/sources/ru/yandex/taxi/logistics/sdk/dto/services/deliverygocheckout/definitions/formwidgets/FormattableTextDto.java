package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FormattableTextDto;", "", "text", "", "textStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "formatMask", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getTextStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "getFormatMask", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormattableTextDto {
    private final String formatMask;
    private final String text;
    private final TextParametersDto textStyle;

    public FormattableTextDto(@Json(name = "text") String str, @Json(name = "text_style") TextParametersDto textParametersDto, @Json(name = "format_mask") String str2) {
        this.text = str;
        this.textStyle = textParametersDto;
        this.formatMask = str2;
    }

    public static /* synthetic */ FormattableTextDto copy$default(FormattableTextDto formattableTextDto, String str, TextParametersDto textParametersDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formattableTextDto.text;
        }
        if ((i & 2) != 0) {
            textParametersDto = formattableTextDto.textStyle;
        }
        if ((i & 4) != 0) {
            str2 = formattableTextDto.formatMask;
        }
        return formattableTextDto.copy(str, textParametersDto, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final TextParametersDto getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFormatMask() {
        return this.formatMask;
    }

    public final FormattableTextDto copy(@Json(name = "text") String text, @Json(name = "text_style") TextParametersDto textStyle, @Json(name = "format_mask") String formatMask) {
        return new FormattableTextDto(text, textStyle, formatMask);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormattableTextDto)) {
            return false;
        }
        FormattableTextDto formattableTextDto = (FormattableTextDto) other;
        return jl40.l(this.text, formattableTextDto.text) && jl40.l(this.textStyle, formattableTextDto.textStyle) && jl40.l(this.formatMask, formattableTextDto.formatMask);
    }

    public final String getFormatMask() {
        return this.formatMask;
    }

    public final String getText() {
        return this.text;
    }

    public final TextParametersDto getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        TextParametersDto textParametersDto = this.textStyle;
        return this.formatMask.hashCode() + ((hashCode + (textParametersDto == null ? 0 : textParametersDto.hashCode())) * 31);
    }

    public String toString() {
        String str = this.text;
        TextParametersDto textParametersDto = this.textStyle;
        String str2 = this.formatMask;
        StringBuilder sb = new StringBuilder("FormattableTextDto(text=");
        sb.append(str);
        sb.append(", textStyle=");
        sb.append(textParametersDto);
        sb.append(", formatMask=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
