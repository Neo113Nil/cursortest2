package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.smw0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0010\u001a\u00060\u0001j\u0002`\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\f\b\u0003\u0010\u0004\u001a\u00060\u0001j\u0002`\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/V2FormAsyncTaskRequestDto;", "", "taskId", "", ClidProvider.STATE, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormStateDto;", "taskParams", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AsyncTaskParamsDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "getTaskId", "()Ljava/lang/String;", "getState", "()Ljava/lang/Object;", "getTaskParams", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class V2FormAsyncTaskRequestDto {
    private final Object state;
    private final String taskId;
    private final Object taskParams;

    public V2FormAsyncTaskRequestDto(@Json(name = "task_id") String str, @Json(name = "state") Object obj, @Json(name = "task_params") Object obj2) {
        this.taskId = str;
        this.state = obj;
        this.taskParams = obj2;
    }

    public static /* synthetic */ V2FormAsyncTaskRequestDto copy$default(V2FormAsyncTaskRequestDto v2FormAsyncTaskRequestDto, String str, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            str = v2FormAsyncTaskRequestDto.taskId;
        }
        if ((i & 2) != 0) {
            obj = v2FormAsyncTaskRequestDto.state;
        }
        if ((i & 4) != 0) {
            obj2 = v2FormAsyncTaskRequestDto.taskParams;
        }
        return v2FormAsyncTaskRequestDto.copy(str, obj, obj2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getTaskParams() {
        return this.taskParams;
    }

    public final V2FormAsyncTaskRequestDto copy(@Json(name = "task_id") String taskId, @Json(name = "state") Object state, @Json(name = "task_params") Object taskParams) {
        return new V2FormAsyncTaskRequestDto(taskId, state, taskParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V2FormAsyncTaskRequestDto)) {
            return false;
        }
        V2FormAsyncTaskRequestDto v2FormAsyncTaskRequestDto = (V2FormAsyncTaskRequestDto) other;
        return jl40.l(this.taskId, v2FormAsyncTaskRequestDto.taskId) && jl40.l(this.state, v2FormAsyncTaskRequestDto.state) && jl40.l(this.taskParams, v2FormAsyncTaskRequestDto.taskParams);
    }

    public final Object getState() {
        return this.state;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final Object getTaskParams() {
        return this.taskParams;
    }

    public int hashCode() {
        int c = smw0.c(this.taskId.hashCode() * 31, 31, this.state);
        Object obj = this.taskParams;
        return c + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        String str = this.taskId;
        Object obj = this.state;
        Object obj2 = this.taskParams;
        StringBuilder sb = new StringBuilder("V2FormAsyncTaskRequestDto(taskId=");
        sb.append(str);
        sb.append(", state=");
        sb.append(obj);
        sb.append(", taskParams=");
        return x4e.h(sb, obj2, Extension.C_BRAKE);
    }
}
