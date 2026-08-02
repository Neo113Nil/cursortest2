package ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_ai_tools;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J8\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/PopupHintDto;", "", "id", "", "title", "Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/StyledTextDto;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "maxShownCount", "", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/StyledTextDto;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/StyledTextDto;", "getBackgroundColor", "getMaxShownCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/StyledTextDto;Ljava/lang/String;Ljava/lang/Integer;)Lru/yandex/taxi/logistics/sdk/delivery_launch/dto/delivery_ai_tools/PopupHintDto;", "equals", "", "other", "hashCode", "toString", "sdk-delivery-launch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PopupHintDto {
    private final String backgroundColor;
    private final String id;
    private final Integer maxShownCount;
    private final StyledTextDto title;

    public PopupHintDto(@Json(name = "id") String str, @Json(name = "title") StyledTextDto styledTextDto, @Json(name = "background_color") String str2, @Json(name = "max_shown_count") Integer num) {
        this.id = str;
        this.title = styledTextDto;
        this.backgroundColor = str2;
        this.maxShownCount = num;
    }

    public static /* synthetic */ PopupHintDto copy$default(PopupHintDto popupHintDto, String str, StyledTextDto styledTextDto, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = popupHintDto.id;
        }
        if ((i & 2) != 0) {
            styledTextDto = popupHintDto.title;
        }
        if ((i & 4) != 0) {
            str2 = popupHintDto.backgroundColor;
        }
        if ((i & 8) != 0) {
            num = popupHintDto.maxShownCount;
        }
        return popupHintDto.copy(str, styledTextDto, str2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final StyledTextDto getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getMaxShownCount() {
        return this.maxShownCount;
    }

    public final PopupHintDto copy(@Json(name = "id") String id, @Json(name = "title") StyledTextDto title, @Json(name = "background_color") String backgroundColor, @Json(name = "max_shown_count") Integer maxShownCount) {
        return new PopupHintDto(id, title, backgroundColor, maxShownCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopupHintDto)) {
            return false;
        }
        PopupHintDto popupHintDto = (PopupHintDto) other;
        return jl40.l(this.id, popupHintDto.id) && jl40.l(this.title, popupHintDto.title) && jl40.l(this.backgroundColor, popupHintDto.backgroundColor) && jl40.l(this.maxShownCount, popupHintDto.maxShownCount);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getMaxShownCount() {
        return this.maxShownCount;
    }

    public final StyledTextDto getTitle() {
        return this.title;
    }

    public int hashCode() {
        int b = unr0.b((this.title.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.backgroundColor);
        Integer num = this.maxShownCount;
        return b + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "PopupHintDto(id=" + this.id + ", title=" + this.title + ", backgroundColor=" + this.backgroundColor + ", maxShownCount=" + this.maxShownCount + Extension.C_BRAKE;
    }
}
