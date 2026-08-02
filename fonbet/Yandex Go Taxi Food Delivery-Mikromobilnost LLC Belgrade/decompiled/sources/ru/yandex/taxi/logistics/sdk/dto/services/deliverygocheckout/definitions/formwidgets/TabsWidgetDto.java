package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TabsWidgetDto;", "", "widgetId", "", "formStateKey", "options", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TabOptionDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getWidgetId", "()Ljava/lang/String;", "getFormStateKey", "getOptions", "()Ljava/util/List;", "getMetricaLabel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TabsWidgetDto {
    private final String formStateKey;
    private final String metricaLabel;
    private final List<TabOptionDto> options;
    private final String widgetId;

    public TabsWidgetDto(@Json(name = "widget_id") String str, @Json(name = "form_state_key") String str2, @Json(name = "options") List<TabOptionDto> list, @Json(name = "metrica_label") String str3) {
        this.widgetId = str;
        this.formStateKey = str2;
        this.options = list;
        this.metricaLabel = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TabsWidgetDto copy$default(TabsWidgetDto tabsWidgetDto, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tabsWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            str2 = tabsWidgetDto.formStateKey;
        }
        if ((i & 4) != 0) {
            list = tabsWidgetDto.options;
        }
        if ((i & 8) != 0) {
            str3 = tabsWidgetDto.metricaLabel;
        }
        return tabsWidgetDto.copy(str, str2, list, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final List<TabOptionDto> component3() {
        return this.options;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final TabsWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "form_state_key") String formStateKey, @Json(name = "options") List<TabOptionDto> options, @Json(name = "metrica_label") String metricaLabel) {
        return new TabsWidgetDto(widgetId, formStateKey, options, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabsWidgetDto)) {
            return false;
        }
        TabsWidgetDto tabsWidgetDto = (TabsWidgetDto) other;
        return jl40.l(this.widgetId, tabsWidgetDto.widgetId) && jl40.l(this.formStateKey, tabsWidgetDto.formStateKey) && jl40.l(this.options, tabsWidgetDto.options) && jl40.l(this.metricaLabel, tabsWidgetDto.metricaLabel);
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final List<TabOptionDto> getOptions() {
        return this.options;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int c = unr0.c(unr0.b(this.widgetId.hashCode() * 31, 31, this.formStateKey), 31, this.options);
        String str = this.metricaLabel;
        return c + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.widgetId;
        String str2 = this.formStateKey;
        return n.l(", metricaLabel=", this.metricaLabel, Extension.C_BRAKE, b64.v("TabsWidgetDto(widgetId=", str, ", formStateKey=", str2, ", options="), this.options);
    }
}
