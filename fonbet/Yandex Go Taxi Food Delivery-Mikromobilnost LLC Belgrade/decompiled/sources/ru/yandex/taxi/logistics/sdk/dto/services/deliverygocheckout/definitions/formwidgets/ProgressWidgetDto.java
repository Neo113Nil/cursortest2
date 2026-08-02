package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.ProgressBarDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ProgressWidgetDto;", "", "widgetId", "", "progressBar", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarDto;", "metricaLabel", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarDto;Ljava/lang/String;Ljava/lang/Object;)V", "getWidgetId", "()Ljava/lang/String;", "getProgressBar", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/ProgressBarDto;", "getMetricaLabel", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ProgressWidgetDto {
    private final Object meta;
    private final String metricaLabel;
    private final ProgressBarDto progressBar;
    private final String widgetId;

    public ProgressWidgetDto(@Json(name = "widget_id") String str, @Json(name = "progress_bar") ProgressBarDto progressBarDto, @Json(name = "metrica_label") String str2, @Json(name = "meta") Object obj) {
        this.widgetId = str;
        this.progressBar = progressBarDto;
        this.metricaLabel = str2;
        this.meta = obj;
    }

    public static /* synthetic */ ProgressWidgetDto copy$default(ProgressWidgetDto progressWidgetDto, String str, ProgressBarDto progressBarDto, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = progressWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            progressBarDto = progressWidgetDto.progressBar;
        }
        if ((i & 4) != 0) {
            str2 = progressWidgetDto.metricaLabel;
        }
        if ((i & 8) != 0) {
            obj = progressWidgetDto.meta;
        }
        return progressWidgetDto.copy(str, progressBarDto, str2, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final ProgressBarDto getProgressBar() {
        return this.progressBar;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    /* renamed from: component4, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final ProgressWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "progress_bar") ProgressBarDto progressBar, @Json(name = "metrica_label") String metricaLabel, @Json(name = "meta") Object meta) {
        return new ProgressWidgetDto(widgetId, progressBar, metricaLabel, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressWidgetDto)) {
            return false;
        }
        ProgressWidgetDto progressWidgetDto = (ProgressWidgetDto) other;
        return jl40.l(this.widgetId, progressWidgetDto.widgetId) && jl40.l(this.progressBar, progressWidgetDto.progressBar) && jl40.l(this.metricaLabel, progressWidgetDto.metricaLabel) && jl40.l(this.meta, progressWidgetDto.meta);
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final ProgressBarDto getProgressBar() {
        return this.progressBar;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int hashCode = this.widgetId.hashCode() * 31;
        ProgressBarDto progressBarDto = this.progressBar;
        int hashCode2 = (hashCode + (progressBarDto == null ? 0 : progressBarDto.hashCode())) * 31;
        String str = this.metricaLabel;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.meta;
        return hashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        String str = this.widgetId;
        ProgressBarDto progressBarDto = this.progressBar;
        String str2 = this.metricaLabel;
        Object obj = this.meta;
        StringBuilder sb = new StringBuilder("ProgressWidgetDto(widgetId=");
        sb.append(str);
        sb.append(", progressBar=");
        sb.append(progressBarDto);
        sb.append(", metricaLabel=");
        return tse0.l(sb, str2, ", meta=", obj, Extension.C_BRAKE);
    }
}
