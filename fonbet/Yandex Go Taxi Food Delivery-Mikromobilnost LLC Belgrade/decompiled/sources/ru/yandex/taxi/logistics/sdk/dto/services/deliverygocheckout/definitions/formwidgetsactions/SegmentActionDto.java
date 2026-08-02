package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentActionDto;", "", "formStateKey", "", "options", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentOptionDto;", "widthMode", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentActionDto$WidthModeDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentActionDto$WidthModeDto;Ljava/lang/String;)V", "getFormStateKey", "()Ljava/lang/String;", "getOptions", "()Ljava/util/List;", "getWidthMode", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentActionDto$WidthModeDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "WidthModeDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SegmentActionDto {
    private final String formStateKey;
    private final String metricaLabel;
    private final List<SegmentOptionDto> options;
    private final WidthModeDto widthMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/SegmentActionDto$WidthModeDto;", "", "<init>", "(Ljava/lang/String;I)V", "WRAP_CONTENT", "FILL_MAX_WIDTH", "FILL_MAX_WIDTH_PROPORTIONALLY", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WidthModeDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ WidthModeDto[] $VALUES;

        @Json(name = "wrap_content")
        public static final WidthModeDto WRAP_CONTENT = new WidthModeDto("WRAP_CONTENT", 0);

        @Json(name = "fill_max_width")
        public static final WidthModeDto FILL_MAX_WIDTH = new WidthModeDto("FILL_MAX_WIDTH", 1);

        @Json(name = "fill_max_width_proportionally")
        public static final WidthModeDto FILL_MAX_WIDTH_PROPORTIONALLY = new WidthModeDto("FILL_MAX_WIDTH_PROPORTIONALLY", 2);

        private static final /* synthetic */ WidthModeDto[] $values() {
            return new WidthModeDto[]{WRAP_CONTENT, FILL_MAX_WIDTH, FILL_MAX_WIDTH_PROPORTIONALLY};
        }

        static {
            WidthModeDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private WidthModeDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static WidthModeDto valueOf(String str) {
            return (WidthModeDto) Enum.valueOf(WidthModeDto.class, str);
        }

        public static WidthModeDto[] values() {
            return (WidthModeDto[]) $VALUES.clone();
        }
    }

    public SegmentActionDto(@Json(name = "form_state_key") String str, @Json(name = "options") List<SegmentOptionDto> list, @Json(name = "width_mode") WidthModeDto widthModeDto, @Json(name = "metrica_label") String str2) {
        this.formStateKey = str;
        this.options = list;
        this.widthMode = widthModeDto;
        this.metricaLabel = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SegmentActionDto copy$default(SegmentActionDto segmentActionDto, String str, List list, WidthModeDto widthModeDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = segmentActionDto.formStateKey;
        }
        if ((i & 2) != 0) {
            list = segmentActionDto.options;
        }
        if ((i & 4) != 0) {
            widthModeDto = segmentActionDto.widthMode;
        }
        if ((i & 8) != 0) {
            str2 = segmentActionDto.metricaLabel;
        }
        return segmentActionDto.copy(str, list, widthModeDto, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final List<SegmentOptionDto> component2() {
        return this.options;
    }

    /* renamed from: component3, reason: from getter */
    public final WidthModeDto getWidthMode() {
        return this.widthMode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final SegmentActionDto copy(@Json(name = "form_state_key") String formStateKey, @Json(name = "options") List<SegmentOptionDto> options, @Json(name = "width_mode") WidthModeDto widthMode, @Json(name = "metrica_label") String metricaLabel) {
        return new SegmentActionDto(formStateKey, options, widthMode, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentActionDto)) {
            return false;
        }
        SegmentActionDto segmentActionDto = (SegmentActionDto) other;
        return jl40.l(this.formStateKey, segmentActionDto.formStateKey) && jl40.l(this.options, segmentActionDto.options) && this.widthMode == segmentActionDto.widthMode && jl40.l(this.metricaLabel, segmentActionDto.metricaLabel);
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final List<SegmentOptionDto> getOptions() {
        return this.options;
    }

    public final WidthModeDto getWidthMode() {
        return this.widthMode;
    }

    public int hashCode() {
        int c = unr0.c(this.formStateKey.hashCode() * 31, 31, this.options);
        WidthModeDto widthModeDto = this.widthMode;
        int hashCode = (c + (widthModeDto == null ? 0 : widthModeDto.hashCode())) * 31;
        String str = this.metricaLabel;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.formStateKey;
        List<SegmentOptionDto> list = this.options;
        WidthModeDto widthModeDto = this.widthMode;
        String str2 = this.metricaLabel;
        StringBuilder r = xvz.r("SegmentActionDto(formStateKey=", str, ", options=", list, ", widthMode=");
        r.append(widthModeDto);
        r.append(", metricaLabel=");
        r.append(str2);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
