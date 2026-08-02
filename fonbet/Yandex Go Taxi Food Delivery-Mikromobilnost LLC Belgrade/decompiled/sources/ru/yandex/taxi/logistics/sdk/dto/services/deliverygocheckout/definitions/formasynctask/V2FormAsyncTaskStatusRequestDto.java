package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.qv10;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\b\u0001\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001a\u00060\u0001j\u0002`\u0003HÆ\u0003J\u0017\u0010\t\u001a\u00020\u00002\f\b\u0003\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/V2FormAsyncTaskStatusRequestDto;", "", "taskParams", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AsyncTaskParamsDto;", "<init>", "(Ljava/lang/Object;)V", "getTaskParams", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class V2FormAsyncTaskStatusRequestDto {
    private final Object taskParams;

    public V2FormAsyncTaskStatusRequestDto(@Json(name = "task_params") Object obj) {
        this.taskParams = obj;
    }

    public static /* synthetic */ V2FormAsyncTaskStatusRequestDto copy$default(V2FormAsyncTaskStatusRequestDto v2FormAsyncTaskStatusRequestDto, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = v2FormAsyncTaskStatusRequestDto.taskParams;
        }
        return v2FormAsyncTaskStatusRequestDto.copy(obj);
    }

    /* renamed from: component1, reason: from getter */
    public final Object getTaskParams() {
        return this.taskParams;
    }

    public final V2FormAsyncTaskStatusRequestDto copy(@Json(name = "task_params") Object taskParams) {
        return new V2FormAsyncTaskStatusRequestDto(taskParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof V2FormAsyncTaskStatusRequestDto) && jl40.l(this.taskParams, ((V2FormAsyncTaskStatusRequestDto) other).taskParams);
    }

    public final Object getTaskParams() {
        return this.taskParams;
    }

    public int hashCode() {
        return this.taskParams.hashCode();
    }

    public String toString() {
        return qv10.p("V2FormAsyncTaskStatusRequestDto(taskParams=", Extension.C_BRAKE, this.taskParams);
    }
}
