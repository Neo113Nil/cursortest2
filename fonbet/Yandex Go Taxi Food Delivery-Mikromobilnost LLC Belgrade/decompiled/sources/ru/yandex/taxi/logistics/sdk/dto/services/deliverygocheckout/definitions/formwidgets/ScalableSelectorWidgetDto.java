package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorWidgetDto;", "", "widgetId", "", "formStateKey", "options", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorOptionDto;", "scrollable", "", "style", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorStyleDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorStyleDto;)V", "getWidgetId", "()Ljava/lang/String;", "getFormStateKey", "getOptions", "()Ljava/util/List;", "getScrollable", "()Z", "getStyle", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorStyleDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ScalableSelectorWidgetDto {
    private final String formStateKey;
    private final List<ScalableSelectorOptionDto> options;
    private final boolean scrollable;
    private final ScalableSelectorStyleDto style;
    private final String widgetId;

    public /* synthetic */ ScalableSelectorWidgetDto(String str, String str2, List list, boolean z, ScalableSelectorStyleDto scalableSelectorStyleDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i & 8) != 0 ? false : z, scalableSelectorStyleDto);
    }

    public static /* synthetic */ ScalableSelectorWidgetDto copy$default(ScalableSelectorWidgetDto scalableSelectorWidgetDto, String str, String str2, List list, boolean z, ScalableSelectorStyleDto scalableSelectorStyleDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scalableSelectorWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            str2 = scalableSelectorWidgetDto.formStateKey;
        }
        if ((i & 4) != 0) {
            list = scalableSelectorWidgetDto.options;
        }
        if ((i & 8) != 0) {
            z = scalableSelectorWidgetDto.scrollable;
        }
        if ((i & 16) != 0) {
            scalableSelectorStyleDto = scalableSelectorWidgetDto.style;
        }
        ScalableSelectorStyleDto scalableSelectorStyleDto2 = scalableSelectorStyleDto;
        List list2 = list;
        return scalableSelectorWidgetDto.copy(str, str2, list2, z, scalableSelectorStyleDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final List<ScalableSelectorOptionDto> component3() {
        return this.options;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getScrollable() {
        return this.scrollable;
    }

    /* renamed from: component5, reason: from getter */
    public final ScalableSelectorStyleDto getStyle() {
        return this.style;
    }

    public final ScalableSelectorWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "form_state_key") String formStateKey, @Json(name = "options") List<ScalableSelectorOptionDto> options, @Json(name = "scrollable") boolean scrollable, @Json(name = "style") ScalableSelectorStyleDto style) {
        return new ScalableSelectorWidgetDto(widgetId, formStateKey, options, scrollable, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScalableSelectorWidgetDto)) {
            return false;
        }
        ScalableSelectorWidgetDto scalableSelectorWidgetDto = (ScalableSelectorWidgetDto) other;
        return jl40.l(this.widgetId, scalableSelectorWidgetDto.widgetId) && jl40.l(this.formStateKey, scalableSelectorWidgetDto.formStateKey) && jl40.l(this.options, scalableSelectorWidgetDto.options) && this.scrollable == scalableSelectorWidgetDto.scrollable && jl40.l(this.style, scalableSelectorWidgetDto.style);
    }

    public final String getFormStateKey() {
        return this.formStateKey;
    }

    public final List<ScalableSelectorOptionDto> getOptions() {
        return this.options;
    }

    public final boolean getScrollable() {
        return this.scrollable;
    }

    public final ScalableSelectorStyleDto getStyle() {
        return this.style;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int e = unr0.e(unr0.c(unr0.b(this.widgetId.hashCode() * 31, 31, this.formStateKey), 31, this.options), 31, this.scrollable);
        ScalableSelectorStyleDto scalableSelectorStyleDto = this.style;
        return e + (scalableSelectorStyleDto == null ? 0 : scalableSelectorStyleDto.hashCode());
    }

    public String toString() {
        String str = this.widgetId;
        String str2 = this.formStateKey;
        List<ScalableSelectorOptionDto> list = this.options;
        boolean z = this.scrollable;
        ScalableSelectorStyleDto scalableSelectorStyleDto = this.style;
        StringBuilder v = b64.v("ScalableSelectorWidgetDto(widgetId=", str, ", formStateKey=", str2, ", options=");
        nzs.p(v, list, ", scrollable=", z, ", style=");
        v.append(scalableSelectorStyleDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public ScalableSelectorWidgetDto(@Json(name = "widget_id") String str, @Json(name = "form_state_key") String str2, @Json(name = "options") List<ScalableSelectorOptionDto> list, @Json(name = "scrollable") boolean z, @Json(name = "style") ScalableSelectorStyleDto scalableSelectorStyleDto) {
        this.widgetId = str;
        this.formStateKey = str2;
        this.options = list;
        this.scrollable = z;
        this.style = scalableSelectorStyleDto;
    }
}
