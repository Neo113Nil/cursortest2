package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ImageDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.UploadImagesConstrainsDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\r\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010%\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000eHÆ\u0003Ji\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\r\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000eHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0019\u0010\r\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailUploadImagesButtonDto;", "", "image", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "constrains", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/UploadImagesConstrainsDto;", "formStateKey", "", "position", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "accessibilityLabel", "presentationId", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/UploadImagesConstrainsDto;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getImage", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ImageDto;", "getConstrains", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/UploadImagesConstrainsDto;", "getFormStateKey", "()Ljava/lang/String;", "getPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "getAccessibilityLabel", "getPresentationId", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TrailUploadImagesButtonDto {
    private final String accessibilityLabel;
    private final UploadImagesConstrainsDto constrains;
    private final String formStateKey;
    private final ImageDto image;
    private final Object meta;
    private final String metricaLabel;
    private final ResultPositionDto position;
    private final String presentationId;

    public TrailUploadImagesButtonDto(@Json(name = "image") ImageDto imageDto, @Json(name = "constrains") UploadImagesConstrainsDto uploadImagesConstrainsDto, @Json(name = "form_state_key") String str, @Json(name = "position") ResultPositionDto resultPositionDto, @Json(name = "accessibility_label") String str2, @Json(name = "presentation_id") String str3, @Json(name = "metrica_label") String str4, @Json(name = "meta") Object obj) {
        this.image = imageDto;
        this.constrains = uploadImagesConstrainsDto;
        this.formStateKey = str;
        this.position = resultPositionDto;
        this.accessibilityLabel = str2;
        this.presentationId = str3;
        this.metricaLabel = str4;
        this.meta = obj;
    }

    public static /* synthetic */ TrailUploadImagesButtonDto copy$default(TrailUploadImagesButtonDto trailUploadImagesButtonDto, ImageDto imageDto, UploadImagesConstrainsDto uploadImagesConstrainsDto, String str, ResultPositionDto resultPositionDto, String str2, String str3, String str4, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            imageDto = trailUploadImagesButtonDto.image;
        }
        if ((i & 2) != 0) {
            uploadImagesConstrainsDto = trailUploadImagesButtonDto.constrains;
        }
        if ((i & 4) != 0) {
            str = trailUploadImagesButtonDto.formStateKey;
        }
        if ((i & 8) != 0) {
            resultPositionDto = trailUploadImagesButtonDto.position;
        }
        if ((i & 16) != 0) {
            str2 = trailUploadImagesButtonDto.accessibilityLabel;
        }
        if ((i & 32) != 0) {
            str3 = trailUploadImagesButtonDto.presentationId;
        }
        if ((i & 64) != 0) {
            str4 = trailUploadImagesButtonDto.metricaLabel;
        }
        if ((i & 128) != 0) {
            obj = trailUploadImagesButtonDto.meta;
        }
        String str5 = str4;
        Object obj3 = obj;
        String str6 = str2;
        String str7 = str3;
        return trailUploadImagesButtonDto.copy(imageDto, uploadImagesConstrainsDto, str, resultPositionDto, str6, str7, str5, obj3);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageDto getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final UploadImagesConstrainsDto getConstrains() {
        return this.constrains;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    /* renamed from: component4, reason: from getter */
    public final ResultPositionDto getPosition() {
        return this.position;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPresentationId() {
        return this.presentationId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component8, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final TrailUploadImagesButtonDto copy(@Json(name = "image") ImageDto image, @Json(name = "constrains") UploadImagesConstrainsDto constrains, @Json(name = "form_state_key") String formStateKey, @Json(name = "position") ResultPositionDto position, @Json(name = "accessibility_label") String accessibilityLabel, @Json(name = "presentation_id") String presentationId, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new TrailUploadImagesButtonDto(image, constrains, formStateKey, position, accessibilityLabel, presentationId, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrailUploadImagesButtonDto)) {
            return false;
        }
        TrailUploadImagesButtonDto trailUploadImagesButtonDto = (TrailUploadImagesButtonDto) other;
        return jl40.l(this.image, trailUploadImagesButtonDto.image) && jl40.l(this.constrains, trailUploadImagesButtonDto.constrains) && jl40.l(this.formStateKey, trailUploadImagesButtonDto.formStateKey) && jl40.l(this.position, trailUploadImagesButtonDto.position) && jl40.l(this.accessibilityLabel, trailUploadImagesButtonDto.accessibilityLabel) && jl40.l(this.presentationId, trailUploadImagesButtonDto.presentationId) && jl40.l(this.metricaLabel, trailUploadImagesButtonDto.metricaLabel) && jl40.l(this.meta, trailUploadImagesButtonDto.meta);
    }

    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    public final UploadImagesConstrainsDto getConstrains() {
        return this.constrains;
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final ImageDto getImage() {
        return this.image;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ResultPositionDto getPosition() {
        return this.position;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public int hashCode() {
        int b = unr0.b((this.constrains.hashCode() + (this.image.hashCode() * 31)) * 31, 31, this.formStateKey);
        ResultPositionDto resultPositionDto = this.position;
        int hashCode = (b + (resultPositionDto == null ? 0 : resultPositionDto.hashCode())) * 31;
        String str = this.accessibilityLabel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.presentationId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.metricaLabel;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode4 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        ImageDto imageDto = this.image;
        UploadImagesConstrainsDto uploadImagesConstrainsDto = this.constrains;
        String str = this.formStateKey;
        ResultPositionDto resultPositionDto = this.position;
        String str2 = this.accessibilityLabel;
        String str3 = this.presentationId;
        String str4 = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("TrailUploadImagesButtonDto(image=");
        sb.append(imageDto);
        sb.append(", constrains=");
        sb.append(uploadImagesConstrainsDto);
        sb.append(", formStateKey=");
        sb.append(str);
        sb.append(", position=");
        sb.append(resultPositionDto);
        sb.append(", accessibilityLabel=");
        g8e.D(sb, str2, ", presentationId=", str3, ", metricaLabel=");
        return tse0.l(sb, str4, ", meta=", obj, Extension.C_BRAKE);
    }
}
