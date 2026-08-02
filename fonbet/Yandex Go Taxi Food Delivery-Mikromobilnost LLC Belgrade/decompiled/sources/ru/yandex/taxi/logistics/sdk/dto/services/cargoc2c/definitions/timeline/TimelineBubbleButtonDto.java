package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.timeline;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineBubbleButtonDto;", "", "title", "", "textColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineBubbleActionDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineBubbleActionDto;)V", "getTitle", "()Ljava/lang/String;", "getTextColor", "getBackgroundColor", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/timeline/TimelineBubbleActionDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TimelineBubbleButtonDto {
    private final TimelineBubbleActionDto action;
    private final String backgroundColor;
    private final String textColor;
    private final String title;

    public TimelineBubbleButtonDto(@Json(name = "title") String str, @Json(name = "text_color") String str2, @Json(name = "background_color") String str3, @Json(name = "action") TimelineBubbleActionDto timelineBubbleActionDto) {
        this.title = str;
        this.textColor = str2;
        this.backgroundColor = str3;
        this.action = timelineBubbleActionDto;
    }

    public static /* synthetic */ TimelineBubbleButtonDto copy$default(TimelineBubbleButtonDto timelineBubbleButtonDto, String str, String str2, String str3, TimelineBubbleActionDto timelineBubbleActionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timelineBubbleButtonDto.title;
        }
        if ((i & 2) != 0) {
            str2 = timelineBubbleButtonDto.textColor;
        }
        if ((i & 4) != 0) {
            str3 = timelineBubbleButtonDto.backgroundColor;
        }
        if ((i & 8) != 0) {
            timelineBubbleActionDto = timelineBubbleButtonDto.action;
        }
        return timelineBubbleButtonDto.copy(str, str2, str3, timelineBubbleActionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final TimelineBubbleActionDto getAction() {
        return this.action;
    }

    public final TimelineBubbleButtonDto copy(@Json(name = "title") String title, @Json(name = "text_color") String textColor, @Json(name = "background_color") String backgroundColor, @Json(name = "action") TimelineBubbleActionDto action) {
        return new TimelineBubbleButtonDto(title, textColor, backgroundColor, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimelineBubbleButtonDto)) {
            return false;
        }
        TimelineBubbleButtonDto timelineBubbleButtonDto = (TimelineBubbleButtonDto) other;
        return jl40.l(this.title, timelineBubbleButtonDto.title) && jl40.l(this.textColor, timelineBubbleButtonDto.textColor) && jl40.l(this.backgroundColor, timelineBubbleButtonDto.backgroundColor) && jl40.l(this.action, timelineBubbleButtonDto.action);
    }

    public final TimelineBubbleActionDto getAction() {
        return this.action;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.textColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        return this.action.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.textColor;
        String str3 = this.backgroundColor;
        TimelineBubbleActionDto timelineBubbleActionDto = this.action;
        StringBuilder v = b64.v("TimelineBubbleButtonDto(title=", str, ", textColor=", str2, ", backgroundColor=");
        v.append(str3);
        v.append(", action=");
        v.append(timelineBubbleActionDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
