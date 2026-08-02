package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScenarioSelectorWidgetDto;", "", "widgetId", "", "formStateKey", "options", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScenarioSelectorOptionDto;", "collapsedStateConfig", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CollapsedStateConfigDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CollapsedStateConfigDto;)V", "getWidgetId", "()Ljava/lang/String;", "getFormStateKey", "getOptions", "()Ljava/util/List;", "getCollapsedStateConfig", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CollapsedStateConfigDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ScenarioSelectorWidgetDto {
    private final CollapsedStateConfigDto collapsedStateConfig;
    private final String formStateKey;
    private final List<ScenarioSelectorOptionDto> options;
    private final String widgetId;

    public ScenarioSelectorWidgetDto(@Json(name = "widget_id") String str, @Json(name = "form_state_key") String str2, @Json(name = "options") List<ScenarioSelectorOptionDto> list, @Json(name = "collapsed_state_config") CollapsedStateConfigDto collapsedStateConfigDto) {
        this.widgetId = str;
        this.formStateKey = str2;
        this.options = list;
        this.collapsedStateConfig = collapsedStateConfigDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScenarioSelectorWidgetDto copy$default(ScenarioSelectorWidgetDto scenarioSelectorWidgetDto, String str, String str2, List list, CollapsedStateConfigDto collapsedStateConfigDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scenarioSelectorWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            str2 = scenarioSelectorWidgetDto.formStateKey;
        }
        if ((i & 4) != 0) {
            list = scenarioSelectorWidgetDto.options;
        }
        if ((i & 8) != 0) {
            collapsedStateConfigDto = scenarioSelectorWidgetDto.collapsedStateConfig;
        }
        return scenarioSelectorWidgetDto.copy(str, str2, list, collapsedStateConfigDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final List<ScenarioSelectorOptionDto> component3() {
        return this.options;
    }

    /* renamed from: component4, reason: from getter */
    public final CollapsedStateConfigDto getCollapsedStateConfig() {
        return this.collapsedStateConfig;
    }

    public final ScenarioSelectorWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "form_state_key") String formStateKey, @Json(name = "options") List<ScenarioSelectorOptionDto> options, @Json(name = "collapsed_state_config") CollapsedStateConfigDto collapsedStateConfig) {
        return new ScenarioSelectorWidgetDto(widgetId, formStateKey, options, collapsedStateConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScenarioSelectorWidgetDto)) {
            return false;
        }
        ScenarioSelectorWidgetDto scenarioSelectorWidgetDto = (ScenarioSelectorWidgetDto) other;
        return jl40.l(this.widgetId, scenarioSelectorWidgetDto.widgetId) && jl40.l(this.formStateKey, scenarioSelectorWidgetDto.formStateKey) && jl40.l(this.options, scenarioSelectorWidgetDto.options) && jl40.l(this.collapsedStateConfig, scenarioSelectorWidgetDto.collapsedStateConfig);
    }

    public final CollapsedStateConfigDto getCollapsedStateConfig() {
        return this.collapsedStateConfig;
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final List<ScenarioSelectorOptionDto> getOptions() {
        return this.options;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int c = unr0.c(unr0.b(this.widgetId.hashCode() * 31, 31, this.formStateKey), 31, this.options);
        CollapsedStateConfigDto collapsedStateConfigDto = this.collapsedStateConfig;
        return c + (collapsedStateConfigDto == null ? 0 : collapsedStateConfigDto.hashCode());
    }

    public String toString() {
        String str = this.widgetId;
        String str2 = this.formStateKey;
        List<ScenarioSelectorOptionDto> list = this.options;
        CollapsedStateConfigDto collapsedStateConfigDto = this.collapsedStateConfig;
        StringBuilder v = b64.v("ScenarioSelectorWidgetDto(widgetId=", str, ", formStateKey=", str2, ", options=");
        v.append(list);
        v.append(", collapsedStateConfig=");
        v.append(collapsedStateConfigDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
