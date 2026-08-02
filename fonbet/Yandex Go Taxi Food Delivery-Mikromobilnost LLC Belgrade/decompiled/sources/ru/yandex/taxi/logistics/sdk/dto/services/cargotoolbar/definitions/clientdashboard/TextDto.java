package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.n;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J.\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TextDto;", "", "content", "", "fontSize", "", "textStyle", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TextStyleDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TextStyleDto;)V", "getContent", "()Ljava/lang/String;", "getFontSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTextStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TextStyleDto;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TextStyleDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TextDto;", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TextDto {
    private final String content;
    private final Integer fontSize;
    private final TextStyleDto textStyle;

    public TextDto(@Json(name = "content") String str, @Json(name = "font_size") Integer num, @Json(name = "text_style") TextStyleDto textStyleDto) {
        this.content = str;
        this.fontSize = num;
        this.textStyle = textStyleDto;
    }

    public static /* synthetic */ TextDto copy$default(TextDto textDto, String str, Integer num, TextStyleDto textStyleDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textDto.content;
        }
        if ((i & 2) != 0) {
            num = textDto.fontSize;
        }
        if ((i & 4) != 0) {
            textStyleDto = textDto.textStyle;
        }
        return textDto.copy(str, num, textStyleDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getFontSize() {
        return this.fontSize;
    }

    /* renamed from: component3, reason: from getter */
    public final TextStyleDto getTextStyle() {
        return this.textStyle;
    }

    public final TextDto copy(@Json(name = "content") String content, @Json(name = "font_size") Integer fontSize, @Json(name = "text_style") TextStyleDto textStyle) {
        return new TextDto(content, fontSize, textStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextDto)) {
            return false;
        }
        TextDto textDto = (TextDto) other;
        return jl40.l(this.content, textDto.content) && jl40.l(this.fontSize, textDto.fontSize) && this.textStyle == textDto.textStyle;
    }

    public final String getContent() {
        return this.content;
    }

    public final Integer getFontSize() {
        return this.fontSize;
    }

    public final TextStyleDto getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        int hashCode = this.content.hashCode() * 31;
        Integer num = this.fontSize;
        return this.textStyle.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public String toString() {
        String str = this.content;
        Integer num = this.fontSize;
        TextStyleDto textStyleDto = this.textStyle;
        StringBuilder q = n.q("TextDto(content=", num, str, ", fontSize=", ", textStyle=");
        q.append(textStyleDto);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
