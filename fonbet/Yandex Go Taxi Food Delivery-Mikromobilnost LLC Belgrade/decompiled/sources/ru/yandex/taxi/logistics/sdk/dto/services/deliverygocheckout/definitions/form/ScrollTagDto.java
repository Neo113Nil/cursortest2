package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/ScrollTagDto;", "", "title", "", "relatedWidgetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getRelatedWidgetId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ScrollTagDto {
    private final String relatedWidgetId;
    private final String title;

    public ScrollTagDto(@Json(name = "title") String str, @Json(name = "related_widget_id") String str2) {
        this.title = str;
        this.relatedWidgetId = str2;
    }

    public static /* synthetic */ ScrollTagDto copy$default(ScrollTagDto scrollTagDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scrollTagDto.title;
        }
        if ((i & 2) != 0) {
            str2 = scrollTagDto.relatedWidgetId;
        }
        return scrollTagDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRelatedWidgetId() {
        return this.relatedWidgetId;
    }

    public final ScrollTagDto copy(@Json(name = "title") String title, @Json(name = "related_widget_id") String relatedWidgetId) {
        return new ScrollTagDto(title, relatedWidgetId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollTagDto)) {
            return false;
        }
        ScrollTagDto scrollTagDto = (ScrollTagDto) other;
        return jl40.l(this.title, scrollTagDto.title) && jl40.l(this.relatedWidgetId, scrollTagDto.relatedWidgetId);
    }

    public final String getRelatedWidgetId() {
        return this.relatedWidgetId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.relatedWidgetId.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return unr0.p("ScrollTagDto(title=", this.title, ", relatedWidgetId=", this.relatedWidgetId, Extension.C_BRAKE);
    }
}
