package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.UploadImagesConstrainsDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/AddPhotocommentsActionDto;", "", "constrains", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/UploadImagesConstrainsDto;", "position", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "metricaLabel", "", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/UploadImagesConstrainsDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;Ljava/lang/String;Ljava/lang/Object;)V", "getConstrains", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/UploadImagesConstrainsDto;", "getPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "getMetricaLabel", "()Ljava/lang/String;", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddPhotocommentsActionDto {
    private final UploadImagesConstrainsDto constrains;
    private final Object meta;
    private final String metricaLabel;
    private final ResultPositionDto position;

    public AddPhotocommentsActionDto(@Json(name = "constrains") UploadImagesConstrainsDto uploadImagesConstrainsDto, @Json(name = "position") ResultPositionDto resultPositionDto, @Json(name = "metrica_label") String str, @Json(name = "meta") Object obj) {
        this.constrains = uploadImagesConstrainsDto;
        this.position = resultPositionDto;
        this.metricaLabel = str;
        this.meta = obj;
    }

    public static /* synthetic */ AddPhotocommentsActionDto copy$default(AddPhotocommentsActionDto addPhotocommentsActionDto, UploadImagesConstrainsDto uploadImagesConstrainsDto, ResultPositionDto resultPositionDto, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            uploadImagesConstrainsDto = addPhotocommentsActionDto.constrains;
        }
        if ((i & 2) != 0) {
            resultPositionDto = addPhotocommentsActionDto.position;
        }
        if ((i & 4) != 0) {
            str = addPhotocommentsActionDto.metricaLabel;
        }
        if ((i & 8) != 0) {
            obj = addPhotocommentsActionDto.meta;
        }
        return addPhotocommentsActionDto.copy(uploadImagesConstrainsDto, resultPositionDto, str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final UploadImagesConstrainsDto getConstrains() {
        return this.constrains;
    }

    /* renamed from: component2, reason: from getter */
    public final ResultPositionDto getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component4, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final AddPhotocommentsActionDto copy(@Json(name = "constrains") UploadImagesConstrainsDto constrains, @Json(name = "position") ResultPositionDto position, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new AddPhotocommentsActionDto(constrains, position, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddPhotocommentsActionDto)) {
            return false;
        }
        AddPhotocommentsActionDto addPhotocommentsActionDto = (AddPhotocommentsActionDto) other;
        return jl40.l(this.constrains, addPhotocommentsActionDto.constrains) && jl40.l(this.position, addPhotocommentsActionDto.position) && jl40.l(this.metricaLabel, addPhotocommentsActionDto.metricaLabel) && jl40.l(this.meta, addPhotocommentsActionDto.meta);
    }

    public final UploadImagesConstrainsDto getConstrains() {
        return this.constrains;
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

    public int hashCode() {
        int hashCode = (this.position.hashCode() + (this.constrains.hashCode() * 31)) * 31;
        String str = this.metricaLabel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        UploadImagesConstrainsDto uploadImagesConstrainsDto = this.constrains;
        ResultPositionDto resultPositionDto = this.position;
        String str = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("AddPhotocommentsActionDto(constrains=");
        sb.append(uploadImagesConstrainsDto);
        sb.append(", position=");
        sb.append(resultPositionDto);
        sb.append(", metricaLabel=");
        return tse0.l(sb, str, ", meta=", obj, Extension.C_BRAKE);
    }
}
