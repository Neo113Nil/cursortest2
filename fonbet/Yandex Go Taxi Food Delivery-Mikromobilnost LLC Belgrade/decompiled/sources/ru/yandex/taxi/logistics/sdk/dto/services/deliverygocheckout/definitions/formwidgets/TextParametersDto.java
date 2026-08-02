package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "", "size", "", "weight", "", "color", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWeight", "()Ljava/lang/String;", "getColor", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextParametersDto;", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TextParametersDto {
    private final String color;
    private final Integer size;
    private final String weight;

    public TextParametersDto(@Json(name = "size") Integer num, @Json(name = "weight") String str, @Json(name = "color") String str2) {
        this.size = num;
        this.weight = str;
        this.color = str2;
    }

    public static /* synthetic */ TextParametersDto copy$default(TextParametersDto textParametersDto, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = textParametersDto.size;
        }
        if ((i & 2) != 0) {
            str = textParametersDto.weight;
        }
        if ((i & 4) != 0) {
            str2 = textParametersDto.color;
        }
        return textParametersDto.copy(num, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getSize() {
        return this.size;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWeight() {
        return this.weight;
    }

    /* renamed from: component3, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    public final TextParametersDto copy(@Json(name = "size") Integer size, @Json(name = "weight") String weight, @Json(name = "color") String color) {
        return new TextParametersDto(size, weight, color);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextParametersDto)) {
            return false;
        }
        TextParametersDto textParametersDto = (TextParametersDto) other;
        return jl40.l(this.size, textParametersDto.size) && jl40.l(this.weight, textParametersDto.weight) && jl40.l(this.color, textParametersDto.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final Integer getSize() {
        return this.size;
    }

    public final String getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Integer num = this.size;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.weight;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.color;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.size;
        String str = this.weight;
        String str2 = this.color;
        StringBuilder sb = new StringBuilder("TextParametersDto(size=");
        sb.append(num);
        sb.append(", weight=");
        sb.append(str);
        sb.append(", color=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
