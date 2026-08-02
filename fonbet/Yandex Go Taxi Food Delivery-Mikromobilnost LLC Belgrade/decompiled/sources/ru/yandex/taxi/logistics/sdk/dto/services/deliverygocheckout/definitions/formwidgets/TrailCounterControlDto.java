package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.CounterActionDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TrailCounterControlDto;", "", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CounterActionDto;", "presentationId", "", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CounterActionDto;Ljava/lang/String;)V", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CounterActionDto;", "getPresentationId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class TrailCounterControlDto {
    private final CounterActionDto action;
    private final String presentationId;

    public TrailCounterControlDto(@Json(name = "action") CounterActionDto counterActionDto, @Json(name = "presentation_id") String str) {
        this.action = counterActionDto;
        this.presentationId = str;
    }

    public static /* synthetic */ TrailCounterControlDto copy$default(TrailCounterControlDto trailCounterControlDto, CounterActionDto counterActionDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            counterActionDto = trailCounterControlDto.action;
        }
        if ((i & 2) != 0) {
            str = trailCounterControlDto.presentationId;
        }
        return trailCounterControlDto.copy(counterActionDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final CounterActionDto getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPresentationId() {
        return this.presentationId;
    }

    public final TrailCounterControlDto copy(@Json(name = "action") CounterActionDto action, @Json(name = "presentation_id") String presentationId) {
        return new TrailCounterControlDto(action, presentationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrailCounterControlDto)) {
            return false;
        }
        TrailCounterControlDto trailCounterControlDto = (TrailCounterControlDto) other;
        return jl40.l(this.action, trailCounterControlDto.action) && jl40.l(this.presentationId, trailCounterControlDto.presentationId);
    }

    public final CounterActionDto getAction() {
        return this.action;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        String str = this.presentationId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "TrailCounterControlDto(action=" + this.action + ", presentationId=" + this.presentationId + Extension.C_BRAKE;
    }
}
