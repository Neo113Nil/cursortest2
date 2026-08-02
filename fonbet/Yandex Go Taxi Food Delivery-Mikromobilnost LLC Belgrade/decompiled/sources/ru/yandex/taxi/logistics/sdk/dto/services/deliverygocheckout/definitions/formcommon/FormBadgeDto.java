package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormBadgeDto;", "", "text", "", "textColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getTextColor", "getBackgroundColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormBadgeDto {
    private final String backgroundColor;
    private final String text;
    private final String textColor;

    public FormBadgeDto(@Json(name = "text") String str, @Json(name = "text_color") String str2, @Json(name = "background_color") String str3) {
        this.text = str;
        this.textColor = str2;
        this.backgroundColor = str3;
    }

    public static /* synthetic */ FormBadgeDto copy$default(FormBadgeDto formBadgeDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formBadgeDto.text;
        }
        if ((i & 2) != 0) {
            str2 = formBadgeDto.textColor;
        }
        if ((i & 4) != 0) {
            str3 = formBadgeDto.backgroundColor;
        }
        return formBadgeDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final FormBadgeDto copy(@Json(name = "text") String text, @Json(name = "text_color") String textColor, @Json(name = "background_color") String backgroundColor) {
        return new FormBadgeDto(text, textColor, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormBadgeDto)) {
            return false;
        }
        FormBadgeDto formBadgeDto = (FormBadgeDto) other;
        return jl40.l(this.text, formBadgeDto.text) && jl40.l(this.textColor, formBadgeDto.textColor) && jl40.l(this.backgroundColor, formBadgeDto.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return this.backgroundColor.hashCode() + unr0.b(this.text.hashCode() * 31, 31, this.textColor);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.textColor;
        return oyr.t(b64.v("FormBadgeDto(text=", str, ", textColor=", str2, ", backgroundColor="), this.backgroundColor, Extension.C_BRAKE);
    }
}
