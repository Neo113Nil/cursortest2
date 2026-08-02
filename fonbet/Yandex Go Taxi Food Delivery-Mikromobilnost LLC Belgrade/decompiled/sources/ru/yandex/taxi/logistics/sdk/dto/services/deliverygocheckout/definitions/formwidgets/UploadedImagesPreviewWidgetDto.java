package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.PaddingsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ResultPositionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%BI\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/UploadedImagesPreviewWidgetDto;", "", "widgetId", "", "formStateKey", "resultPosition", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "size", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/UploadedImagesPreviewWidgetDto$SizeDto;", "contentPaddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/UploadedImagesPreviewWidgetDto$SizeDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getFormStateKey", "getResultPosition", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ResultPositionDto;", "getSize", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/UploadedImagesPreviewWidgetDto$SizeDto;", "getContentPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "SizeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UploadedImagesPreviewWidgetDto {
    private final PaddingsDto contentPaddings;
    private final String formStateKey;
    private final String metricaLabel;
    private final ResultPositionDto resultPosition;
    private final SizeDto size;
    private final String widgetId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/UploadedImagesPreviewWidgetDto$SizeDto;", "", "<init>", "(Ljava/lang/String;I)V", "M", "L", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SizeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SizeDto[] $VALUES;

        @Json(name = "m")
        public static final SizeDto M = new SizeDto("M", 0);

        @Json(name = "l")
        public static final SizeDto L = new SizeDto("L", 1);

        private static final /* synthetic */ SizeDto[] $values() {
            return new SizeDto[]{M, L};
        }

        static {
            SizeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SizeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static SizeDto valueOf(String str) {
            return (SizeDto) Enum.valueOf(SizeDto.class, str);
        }

        public static SizeDto[] values() {
            return (SizeDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ UploadedImagesPreviewWidgetDto(String str, String str2, ResultPositionDto resultPositionDto, SizeDto sizeDto, PaddingsDto paddingsDto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, resultPositionDto, (i & 8) != 0 ? SizeDto.L : sizeDto, paddingsDto, str3);
    }

    public static /* synthetic */ UploadedImagesPreviewWidgetDto copy$default(UploadedImagesPreviewWidgetDto uploadedImagesPreviewWidgetDto, String str, String str2, ResultPositionDto resultPositionDto, SizeDto sizeDto, PaddingsDto paddingsDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadedImagesPreviewWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            str2 = uploadedImagesPreviewWidgetDto.formStateKey;
        }
        if ((i & 4) != 0) {
            resultPositionDto = uploadedImagesPreviewWidgetDto.resultPosition;
        }
        if ((i & 8) != 0) {
            sizeDto = uploadedImagesPreviewWidgetDto.size;
        }
        if ((i & 16) != 0) {
            paddingsDto = uploadedImagesPreviewWidgetDto.contentPaddings;
        }
        if ((i & 32) != 0) {
            str3 = uploadedImagesPreviewWidgetDto.metricaLabel;
        }
        PaddingsDto paddingsDto2 = paddingsDto;
        String str4 = str3;
        return uploadedImagesPreviewWidgetDto.copy(str, str2, resultPositionDto, sizeDto, paddingsDto2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    /* renamed from: component3, reason: from getter */
    public final ResultPositionDto getResultPosition() {
        return this.resultPosition;
    }

    /* renamed from: component4, reason: from getter */
    public final SizeDto getSize() {
        return this.size;
    }

    /* renamed from: component5, reason: from getter */
    public final PaddingsDto getContentPaddings() {
        return this.contentPaddings;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final UploadedImagesPreviewWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "form_state_key") String formStateKey, @Json(name = "result_position") ResultPositionDto resultPosition, @Json(name = "size") SizeDto size, @Json(name = "content_paddings") PaddingsDto contentPaddings, @Json(name = "metrica_label") String metricaLabel) {
        return new UploadedImagesPreviewWidgetDto(widgetId, formStateKey, resultPosition, size, contentPaddings, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadedImagesPreviewWidgetDto)) {
            return false;
        }
        UploadedImagesPreviewWidgetDto uploadedImagesPreviewWidgetDto = (UploadedImagesPreviewWidgetDto) other;
        return jl40.l(this.widgetId, uploadedImagesPreviewWidgetDto.widgetId) && jl40.l(this.formStateKey, uploadedImagesPreviewWidgetDto.formStateKey) && jl40.l(this.resultPosition, uploadedImagesPreviewWidgetDto.resultPosition) && this.size == uploadedImagesPreviewWidgetDto.size && jl40.l(this.contentPaddings, uploadedImagesPreviewWidgetDto.contentPaddings) && jl40.l(this.metricaLabel, uploadedImagesPreviewWidgetDto.metricaLabel);
    }

    public final PaddingsDto getContentPaddings() {
        return this.contentPaddings;
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ResultPositionDto getResultPosition() {
        return this.resultPosition;
    }

    public final SizeDto getSize() {
        return this.size;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int b = unr0.b(this.widgetId.hashCode() * 31, 31, this.formStateKey);
        ResultPositionDto resultPositionDto = this.resultPosition;
        int hashCode = (this.size.hashCode() + ((b + (resultPositionDto == null ? 0 : resultPositionDto.hashCode())) * 31)) * 31;
        PaddingsDto paddingsDto = this.contentPaddings;
        int hashCode2 = (hashCode + (paddingsDto == null ? 0 : paddingsDto.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        String str2 = this.formStateKey;
        ResultPositionDto resultPositionDto = this.resultPosition;
        SizeDto sizeDto = this.size;
        PaddingsDto paddingsDto = this.contentPaddings;
        String str3 = this.metricaLabel;
        StringBuilder v = b64.v("UploadedImagesPreviewWidgetDto(widgetId=", str, ", formStateKey=", str2, ", resultPosition=");
        v.append(resultPositionDto);
        v.append(", size=");
        v.append(sizeDto);
        v.append(", contentPaddings=");
        v.append(paddingsDto);
        v.append(", metricaLabel=");
        v.append(str3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public UploadedImagesPreviewWidgetDto(@Json(name = "widget_id") String str, @Json(name = "form_state_key") String str2, @Json(name = "result_position") ResultPositionDto resultPositionDto, @Json(name = "size") SizeDto sizeDto, @Json(name = "content_paddings") PaddingsDto paddingsDto, @Json(name = "metrica_label") String str3) {
        this.widgetId = str;
        this.formStateKey = str2;
        this.resultPosition = resultPositionDto;
        this.size = sizeDto;
        this.contentPaddings = paddingsDto;
        this.metricaLabel = str3;
    }
}
