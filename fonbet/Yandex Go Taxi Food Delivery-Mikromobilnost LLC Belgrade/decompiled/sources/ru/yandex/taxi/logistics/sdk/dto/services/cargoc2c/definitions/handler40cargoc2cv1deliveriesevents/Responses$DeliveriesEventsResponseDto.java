package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveriesevents;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.events.EventDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"ru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveriesevents/Responses$DeliveriesEventsResponseDto", "", "", "revision", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/events/EventDto;", "events", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveriesevents/Responses$DeliveriesEventsResponseDto;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveriesevents/Responses$DeliveriesEventsResponseDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRevision", "Ljava/util/List;", "getEvents", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Responses$DeliveriesEventsResponseDto {
    private final List<EventDto> events;
    private final String revision;

    /* JADX WARN: Multi-variable type inference failed */
    public Responses$DeliveriesEventsResponseDto(@Json(name = "revision") String str, @Json(name = "events") List<? extends EventDto> list) {
        this.revision = str;
        this.events = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Responses$DeliveriesEventsResponseDto copy$default(Responses$DeliveriesEventsResponseDto responses$DeliveriesEventsResponseDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = responses$DeliveriesEventsResponseDto.revision;
        }
        if ((i & 2) != 0) {
            list = responses$DeliveriesEventsResponseDto.events;
        }
        return responses$DeliveriesEventsResponseDto.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRevision() {
        return this.revision;
    }

    public final List<EventDto> component2() {
        return this.events;
    }

    public final Responses$DeliveriesEventsResponseDto copy(@Json(name = "revision") String revision, @Json(name = "events") List<? extends EventDto> events) {
        return new Responses$DeliveriesEventsResponseDto(revision, events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Responses$DeliveriesEventsResponseDto)) {
            return false;
        }
        Responses$DeliveriesEventsResponseDto responses$DeliveriesEventsResponseDto = (Responses$DeliveriesEventsResponseDto) other;
        return jl40.l(this.revision, responses$DeliveriesEventsResponseDto.revision) && jl40.l(this.events, responses$DeliveriesEventsResponseDto.events);
    }

    public final List<EventDto> getEvents() {
        return this.events;
    }

    public final String getRevision() {
        return this.revision;
    }

    public int hashCode() {
        return this.events.hashCode() + (this.revision.hashCode() * 31);
    }

    public String toString() {
        return nnm.h("DeliveriesEventsResponseDto(revision=", this.revision, ", events=", Extension.C_BRAKE, this.events);
    }
}
