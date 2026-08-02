package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\t\u001a\u00020\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006!"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ArBoxesSmartCameraDto;", "", "screenTitle", "Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "surfaceScanText", "", "boxSizes", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ArSmartCameraBoxSizeDto;", "formStateBoxSizeKey", "metricaLabel", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getScreenTitle", "()Lru/yandex/taxi/logistics/sdk/dto/libraries/extendedtemplate/definitions/AttributedTextDto;", "getSurfaceScanText", "()Ljava/lang/String;", "getBoxSizes", "()Ljava/util/List;", "getFormStateBoxSizeKey", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ArBoxesSmartCameraDto {
    private final List<ArSmartCameraBoxSizeDto> boxSizes;
    private final String formStateBoxSizeKey;
    private final String metricaLabel;
    private final AttributedTextDto screenTitle;
    private final String surfaceScanText;

    public ArBoxesSmartCameraDto(@Json(name = "screen_title") AttributedTextDto attributedTextDto, @Json(name = "surface_scan_text") String str, @Json(name = "box_sizes") List<ArSmartCameraBoxSizeDto> list, @Json(name = "form_state_box_size_key") String str2, @Json(name = "metrica_label") String str3) {
        this.screenTitle = attributedTextDto;
        this.surfaceScanText = str;
        this.boxSizes = list;
        this.formStateBoxSizeKey = str2;
        this.metricaLabel = str3;
    }

    public static /* synthetic */ ArBoxesSmartCameraDto copy$default(ArBoxesSmartCameraDto arBoxesSmartCameraDto, AttributedTextDto attributedTextDto, String str, List list, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            attributedTextDto = arBoxesSmartCameraDto.screenTitle;
        }
        if ((i & 2) != 0) {
            str = arBoxesSmartCameraDto.surfaceScanText;
        }
        if ((i & 4) != 0) {
            list = arBoxesSmartCameraDto.boxSizes;
        }
        if ((i & 8) != 0) {
            str2 = arBoxesSmartCameraDto.formStateBoxSizeKey;
        }
        if ((i & 16) != 0) {
            str3 = arBoxesSmartCameraDto.metricaLabel;
        }
        String str4 = str3;
        List list2 = list;
        return arBoxesSmartCameraDto.copy(attributedTextDto, str, list2, str2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final AttributedTextDto getScreenTitle() {
        return this.screenTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSurfaceScanText() {
        return this.surfaceScanText;
    }

    public final List<ArSmartCameraBoxSizeDto> component3() {
        return this.boxSizes;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFormStateBoxSizeKey() {
        return this.formStateBoxSizeKey;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ArBoxesSmartCameraDto copy(@Json(name = "screen_title") AttributedTextDto screenTitle, @Json(name = "surface_scan_text") String surfaceScanText, @Json(name = "box_sizes") List<ArSmartCameraBoxSizeDto> boxSizes, @Json(name = "form_state_box_size_key") String formStateBoxSizeKey, @Json(name = "metrica_label") String metricaLabel) {
        return new ArBoxesSmartCameraDto(screenTitle, surfaceScanText, boxSizes, formStateBoxSizeKey, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArBoxesSmartCameraDto)) {
            return false;
        }
        ArBoxesSmartCameraDto arBoxesSmartCameraDto = (ArBoxesSmartCameraDto) other;
        return jl40.l(this.screenTitle, arBoxesSmartCameraDto.screenTitle) && jl40.l(this.surfaceScanText, arBoxesSmartCameraDto.surfaceScanText) && jl40.l(this.boxSizes, arBoxesSmartCameraDto.boxSizes) && jl40.l(this.formStateBoxSizeKey, arBoxesSmartCameraDto.formStateBoxSizeKey) && jl40.l(this.metricaLabel, arBoxesSmartCameraDto.metricaLabel);
    }

    public final List<ArSmartCameraBoxSizeDto> getBoxSizes() {
        return this.boxSizes;
    }

    public final String getFormStateBoxSizeKey() {
        return this.formStateBoxSizeKey;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final AttributedTextDto getScreenTitle() {
        return this.screenTitle;
    }

    public final String getSurfaceScanText() {
        return this.surfaceScanText;
    }

    public int hashCode() {
        int b = unr0.b(unr0.c(unr0.b(this.screenTitle.hashCode() * 31, 31, this.surfaceScanText), 31, this.boxSizes), 31, this.formStateBoxSizeKey);
        String str = this.metricaLabel;
        return b + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        AttributedTextDto attributedTextDto = this.screenTitle;
        String str = this.surfaceScanText;
        List<ArSmartCameraBoxSizeDto> list = this.boxSizes;
        String str2 = this.formStateBoxSizeKey;
        String str3 = this.metricaLabel;
        StringBuilder sb = new StringBuilder("ArBoxesSmartCameraDto(screenTitle=");
        sb.append(attributedTextDto);
        sb.append(", surfaceScanText=");
        sb.append(str);
        sb.append(", boxSizes=");
        oyr.D(", formStateBoxSizeKey=", str2, ", metricaLabel=", sb, list);
        return oyr.t(sb, str3, Extension.C_BRAKE);
    }
}
