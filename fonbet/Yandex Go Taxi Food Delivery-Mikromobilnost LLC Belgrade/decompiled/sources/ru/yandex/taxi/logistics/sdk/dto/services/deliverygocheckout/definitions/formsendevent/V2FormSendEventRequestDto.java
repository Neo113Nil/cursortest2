package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formsendevent;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\b\u0001\u0010\u0005\u001a\u00060\u0001j\u0002`\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0001\u0010\t\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\r\u0010\u0017\u001a\u00060\u0001j\u0002`\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\u0011\u0010\u0019\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\nHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\b\u0003\u0010\u0005\u001a\u00060\u0001j\u0002`\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\u0010\b\u0003\u0010\t\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u00060\u0001j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006!"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/V2FormSendEventRequestDto;", "", "mode", "", "scenario", ClidProvider.STATE, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormStateDto;", "eventPayload", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto;", Constants.REFERRER_API_META, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/MetadataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto;Ljava/lang/Object;)V", "getMode", "()Ljava/lang/String;", "getScenario", "getState", "()Ljava/lang/Object;", "getEventPayload", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formsendevent/FormEventPayloadDto;", "getMeta", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class V2FormSendEventRequestDto {
    private final FormEventPayloadDto eventPayload;
    private final Object meta;
    private final String mode;
    private final String scenario;
    private final Object state;

    public V2FormSendEventRequestDto(@Json(name = "mode") String str, @Json(name = "scenario") String str2, @Json(name = "state") Object obj, @Json(name = "event_payload") FormEventPayloadDto formEventPayloadDto, @Json(name = "meta") Object obj2) {
        this.mode = str;
        this.scenario = str2;
        this.state = obj;
        this.eventPayload = formEventPayloadDto;
        this.meta = obj2;
    }

    public static /* synthetic */ V2FormSendEventRequestDto copy$default(V2FormSendEventRequestDto v2FormSendEventRequestDto, String str, String str2, Object obj, FormEventPayloadDto formEventPayloadDto, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            str = v2FormSendEventRequestDto.mode;
        }
        if ((i & 2) != 0) {
            str2 = v2FormSendEventRequestDto.scenario;
        }
        if ((i & 4) != 0) {
            obj = v2FormSendEventRequestDto.state;
        }
        if ((i & 8) != 0) {
            formEventPayloadDto = v2FormSendEventRequestDto.eventPayload;
        }
        if ((i & 16) != 0) {
            obj2 = v2FormSendEventRequestDto.meta;
        }
        Object obj4 = obj2;
        Object obj5 = obj;
        return v2FormSendEventRequestDto.copy(str, str2, obj5, formEventPayloadDto, obj4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getState() {
        return this.state;
    }

    /* renamed from: component4, reason: from getter */
    public final FormEventPayloadDto getEventPayload() {
        return this.eventPayload;
    }

    /* renamed from: component5, reason: from getter */
    public final Object getMeta() {
        return this.meta;
    }

    public final V2FormSendEventRequestDto copy(@Json(name = "mode") String mode, @Json(name = "scenario") String scenario, @Json(name = "state") Object state, @Json(name = "event_payload") FormEventPayloadDto eventPayload, @Json(name = "meta") Object meta) {
        return new V2FormSendEventRequestDto(mode, scenario, state, eventPayload, meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V2FormSendEventRequestDto)) {
            return false;
        }
        V2FormSendEventRequestDto v2FormSendEventRequestDto = (V2FormSendEventRequestDto) other;
        return jl40.l(this.mode, v2FormSendEventRequestDto.mode) && jl40.l(this.scenario, v2FormSendEventRequestDto.scenario) && jl40.l(this.state, v2FormSendEventRequestDto.state) && jl40.l(this.eventPayload, v2FormSendEventRequestDto.eventPayload) && jl40.l(this.meta, v2FormSendEventRequestDto.meta);
    }

    public final FormEventPayloadDto getEventPayload() {
        return this.eventPayload;
    }

    public final Object getMeta() {
        return this.meta;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public final Object getState() {
        return this.state;
    }

    public int hashCode() {
        int hashCode = this.mode.hashCode() * 31;
        String str = this.scenario;
        int hashCode2 = (this.eventPayload.hashCode() + smw0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.state)) * 31;
        Object obj = this.meta;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        String str = this.mode;
        String str2 = this.scenario;
        Object obj = this.state;
        FormEventPayloadDto formEventPayloadDto = this.eventPayload;
        Object obj2 = this.meta;
        StringBuilder v = b64.v("V2FormSendEventRequestDto(mode=", str, ", scenario=", str2, ", state=");
        v.append(obj);
        v.append(", eventPayload=");
        v.append(formEventPayloadDto);
        v.append(", meta=");
        return x4e.h(v, obj2, Extension.C_BRAKE);
    }
}
