package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TagLineWidgetDto;", "", "widgetId", "", "tags", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TagDto;", "viewMode", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ViewModeDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ViewModeDto;)V", "getWidgetId", "()Ljava/lang/String;", "getTags", "()Ljava/util/List;", "getViewMode", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ViewModeDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TagLineWidgetDto {
    private final List<TagDto> tags;
    private final ViewModeDto viewMode;
    private final String widgetId;

    public TagLineWidgetDto(@Json(name = "widget_id") String str, @Json(name = "tags") List<TagDto> list, @Json(name = "view_mode") ViewModeDto viewModeDto) {
        this.widgetId = str;
        this.tags = list;
        this.viewMode = viewModeDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TagLineWidgetDto copy$default(TagLineWidgetDto tagLineWidgetDto, String str, List list, ViewModeDto viewModeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagLineWidgetDto.widgetId;
        }
        if ((i & 2) != 0) {
            list = tagLineWidgetDto.tags;
        }
        if ((i & 4) != 0) {
            viewModeDto = tagLineWidgetDto.viewMode;
        }
        return tagLineWidgetDto.copy(str, list, viewModeDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWidgetId() {
        return this.widgetId;
    }

    public final List<TagDto> component2() {
        return this.tags;
    }

    /* renamed from: component3, reason: from getter */
    public final ViewModeDto getViewMode() {
        return this.viewMode;
    }

    public final TagLineWidgetDto copy(@Json(name = "widget_id") String widgetId, @Json(name = "tags") List<TagDto> tags, @Json(name = "view_mode") ViewModeDto viewMode) {
        return new TagLineWidgetDto(widgetId, tags, viewMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagLineWidgetDto)) {
            return false;
        }
        TagLineWidgetDto tagLineWidgetDto = (TagLineWidgetDto) other;
        return jl40.l(this.widgetId, tagLineWidgetDto.widgetId) && jl40.l(this.tags, tagLineWidgetDto.tags) && jl40.l(this.viewMode, tagLineWidgetDto.viewMode);
    }

    public final List<TagDto> getTags() {
        return this.tags;
    }

    public final ViewModeDto getViewMode() {
        return this.viewMode;
    }

    public final String getWidgetId() {
        return this.widgetId;
    }

    public int hashCode() {
        int c = unr0.c(this.widgetId.hashCode() * 31, 31, this.tags);
        ViewModeDto viewModeDto = this.viewMode;
        return c + (viewModeDto == null ? 0 : viewModeDto.hashCode());
    }

    public String toString() {
        String str = this.widgetId;
        List<TagDto> list = this.tags;
        ViewModeDto viewModeDto = this.viewMode;
        StringBuilder r = xvz.r("TagLineWidgetDto(widgetId=", str, ", tags=", list, ", viewMode=");
        r.append(viewModeDto);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
