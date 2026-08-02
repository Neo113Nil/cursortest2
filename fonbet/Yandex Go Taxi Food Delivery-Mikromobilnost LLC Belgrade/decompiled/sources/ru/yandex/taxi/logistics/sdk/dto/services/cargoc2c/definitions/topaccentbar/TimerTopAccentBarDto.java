package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.topaccentbar;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerTopAccentBarDto;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "content", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerSlotContentDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerSlotContentDto;)V", "getBackgroundColor", "()Ljava/lang/String;", "getContent", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/topaccentbar/TimerSlotContentDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TimerTopAccentBarDto {
    private final String backgroundColor;
    private final TimerSlotContentDto content;

    public TimerTopAccentBarDto(@Json(name = "background_color") String str, @Json(name = "content") TimerSlotContentDto timerSlotContentDto) {
        this.backgroundColor = str;
        this.content = timerSlotContentDto;
    }

    public static /* synthetic */ TimerTopAccentBarDto copy$default(TimerTopAccentBarDto timerTopAccentBarDto, String str, TimerSlotContentDto timerSlotContentDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timerTopAccentBarDto.backgroundColor;
        }
        if ((i & 2) != 0) {
            timerSlotContentDto = timerTopAccentBarDto.content;
        }
        return timerTopAccentBarDto.copy(str, timerSlotContentDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final TimerSlotContentDto getContent() {
        return this.content;
    }

    public final TimerTopAccentBarDto copy(@Json(name = "background_color") String backgroundColor, @Json(name = "content") TimerSlotContentDto content) {
        return new TimerTopAccentBarDto(backgroundColor, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerTopAccentBarDto)) {
            return false;
        }
        TimerTopAccentBarDto timerTopAccentBarDto = (TimerTopAccentBarDto) other;
        return jl40.l(this.backgroundColor, timerTopAccentBarDto.backgroundColor) && jl40.l(this.content, timerTopAccentBarDto.content);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final TimerSlotContentDto getContent() {
        return this.content;
    }

    public int hashCode() {
        return this.content.hashCode() + (this.backgroundColor.hashCode() * 31);
    }

    public String toString() {
        return "TimerTopAccentBarDto(backgroundColor=" + this.backgroundColor + ", content=" + this.content + Extension.C_BRAKE;
    }
}
