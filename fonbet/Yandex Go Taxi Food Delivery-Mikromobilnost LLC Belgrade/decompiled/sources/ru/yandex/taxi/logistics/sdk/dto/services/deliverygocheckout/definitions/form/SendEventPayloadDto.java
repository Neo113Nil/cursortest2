package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.FormEventTypeDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0006HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/SendEventPayloadDto;", "", "availableEvents", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormEventTypeDto;", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Ljava/util/List;Ljava/lang/Object;)V", "getAvailableEvents", "()Ljava/util/List;", "getMeta", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SendEventPayloadDto {
    private final List<FormEventTypeDto> availableEvents;
    private final Object meta;

    /* JADX WARN: Multi-variable type inference failed */
    public SendEventPayloadDto(@Json(name = "available_events") List<? extends FormEventTypeDto> list, @Json(name = "meta") Object obj) {
        this.availableEvents = list;
        this.meta = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SendEventPayloadDto copy$default(SendEventPayloadDto sendEventPayloadDto, List list, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = sendEventPayloadDto.availableEvents;
        }
        if ((i & 2) != 0) {
            obj = sendEventPayloadDto.meta;
        }
        return sendEventPayloadDto.copy(list, obj);
    }

    public final List<FormEventTypeDto> component1() {
        return this.availableEvents;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final SendEventPayloadDto copy(@Json(name = "available_events") List<? extends FormEventTypeDto> availableEvents, @Json(name = "meta") Object meta) {
        return new SendEventPayloadDto(availableEvents, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendEventPayloadDto)) {
            return false;
        }
        SendEventPayloadDto sendEventPayloadDto = (SendEventPayloadDto) other;
        return jl40.l(this.availableEvents, sendEventPayloadDto.availableEvents) && jl40.l(this.meta, sendEventPayloadDto.meta);
    }

    public final List<FormEventTypeDto> getAvailableEvents() {
        return this.availableEvents;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public int hashCode() {
        int hashCode = this.availableEvents.hashCode() * 31;
        Object obj = this.meta;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "SendEventPayloadDto(availableEvents=" + this.availableEvents + ", meta=" + this.meta + Extension.C_BRAKE;
    }
}
