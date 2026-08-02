package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\f\b\u0001\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\f\u001a\u00060\u0001j\u0002`\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\f\b\u0003\u0010\u0002\u001a\u00060\u0001j\u0002`\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCompletedDto;", "", "formStateValue", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormStateValueDto;", "communication", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCommunicationDto;", "<init>", "(Ljava/lang/Object;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCommunicationDto;)V", "getFormStateValue", "()Ljava/lang/Object;", "getCommunication", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCommunicationDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AsyncTaskCompletedDto {
    private final AsyncTaskCommunicationDto communication;
    private final Object formStateValue;

    public AsyncTaskCompletedDto(@Json(name = "form_state_value") Object obj, @Json(name = "communication") AsyncTaskCommunicationDto asyncTaskCommunicationDto) {
        this.formStateValue = obj;
        this.communication = asyncTaskCommunicationDto;
    }

    public static /* synthetic */ AsyncTaskCompletedDto copy$default(AsyncTaskCompletedDto asyncTaskCompletedDto, Object obj, AsyncTaskCommunicationDto asyncTaskCommunicationDto, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = asyncTaskCompletedDto.formStateValue;
        }
        if ((i & 2) != 0) {
            asyncTaskCommunicationDto = asyncTaskCompletedDto.communication;
        }
        return asyncTaskCompletedDto.copy(obj, asyncTaskCommunicationDto);
    }

    /* renamed from: component1, reason: from getter */
    public final Object getFormStateValue() {
        return this.formStateValue;
    }

    /* renamed from: component2, reason: from getter */
    public final AsyncTaskCommunicationDto getCommunication() {
        return this.communication;
    }

    public final AsyncTaskCompletedDto copy(@Json(name = "form_state_value") Object formStateValue, @Json(name = "communication") AsyncTaskCommunicationDto communication) {
        return new AsyncTaskCompletedDto(formStateValue, communication);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncTaskCompletedDto)) {
            return false;
        }
        AsyncTaskCompletedDto asyncTaskCompletedDto = (AsyncTaskCompletedDto) other;
        return jl40.l(this.formStateValue, asyncTaskCompletedDto.formStateValue) && jl40.l(this.communication, asyncTaskCompletedDto.communication);
    }

    public final AsyncTaskCommunicationDto getCommunication() {
        return this.communication;
    }

    public final Object getFormStateValue() {
        return this.formStateValue;
    }

    public int hashCode() {
        int hashCode = this.formStateValue.hashCode() * 31;
        AsyncTaskCommunicationDto asyncTaskCommunicationDto = this.communication;
        return hashCode + (asyncTaskCommunicationDto == null ? 0 : asyncTaskCommunicationDto.hashCode());
    }

    public String toString() {
        return "AsyncTaskCompletedDto(formStateValue=" + this.formStateValue + ", communication=" + this.communication + Extension.C_BRAKE;
    }
}
