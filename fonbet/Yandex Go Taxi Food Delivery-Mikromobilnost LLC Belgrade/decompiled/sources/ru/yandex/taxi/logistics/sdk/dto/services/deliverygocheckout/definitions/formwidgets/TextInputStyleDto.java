package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputStyleDto;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "border", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BorderDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BorderDto;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBorder", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BorderDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TextInputStyleDto {
    private final String backgroundColor;
    private final BorderDto border;

    public TextInputStyleDto(@Json(name = "background_color") String str, @Json(name = "border") BorderDto borderDto) {
        this.backgroundColor = str;
        this.border = borderDto;
    }

    public static /* synthetic */ TextInputStyleDto copy$default(TextInputStyleDto textInputStyleDto, String str, BorderDto borderDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = textInputStyleDto.backgroundColor;
        }
        if ((i & 2) != 0) {
            borderDto = textInputStyleDto.border;
        }
        return textInputStyleDto.copy(str, borderDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final BorderDto getBorder() {
        return this.border;
    }

    public final TextInputStyleDto copy(@Json(name = "background_color") String backgroundColor, @Json(name = "border") BorderDto border) {
        return new TextInputStyleDto(backgroundColor, border);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextInputStyleDto)) {
            return false;
        }
        TextInputStyleDto textInputStyleDto = (TextInputStyleDto) other;
        return jl40.l(this.backgroundColor, textInputStyleDto.backgroundColor) && jl40.l(this.border, textInputStyleDto.border);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BorderDto getBorder() {
        return this.border;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BorderDto borderDto = this.border;
        return hashCode + (borderDto != null ? borderDto.hashCode() : 0);
    }

    public String toString() {
        return "TextInputStyleDto(backgroundColor=" + this.backgroundColor + ", border=" + this.border + Extension.C_BRAKE;
    }
}
