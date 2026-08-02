package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0005\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00052\u0010\b\u0003\u0010\u0006\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/AsyncActionDto;", "", "taskId", "", "formStateValue", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormStateValueDto;", "taskParams", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AsyncTaskParamsDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "getTaskId", "()Ljava/lang/String;", "getFormStateValue", "()Ljava/lang/Object;", "getTaskParams", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AsyncActionDto {
    private final Object formStateValue;
    private final String taskId;
    private final Object taskParams;

    public AsyncActionDto(@Json(name = "task_id") String str, @Json(name = "form_state_value") Object obj, @Json(name = "task_params") Object obj2) {
        this.taskId = str;
        this.formStateValue = obj;
        this.taskParams = obj2;
    }

    public static /* synthetic */ AsyncActionDto copy$default(AsyncActionDto asyncActionDto, String str, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            str = asyncActionDto.taskId;
        }
        if ((i & 2) != 0) {
            obj = asyncActionDto.formStateValue;
        }
        if ((i & 4) != 0) {
            obj2 = asyncActionDto.taskParams;
        }
        return asyncActionDto.copy(str, obj, obj2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getFormStateValue() {
        return this.formStateValue;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getTaskParams() {
        return this.taskParams;
    }

    public final AsyncActionDto copy(@Json(name = "task_id") String taskId, @Json(name = "form_state_value") Object formStateValue, @Json(name = "task_params") Object taskParams) {
        return new AsyncActionDto(taskId, formStateValue, taskParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncActionDto)) {
            return false;
        }
        AsyncActionDto asyncActionDto = (AsyncActionDto) other;
        return jl40.l(this.taskId, asyncActionDto.taskId) && jl40.l(this.formStateValue, asyncActionDto.formStateValue) && jl40.l(this.taskParams, asyncActionDto.taskParams);
    }

    public final Object getFormStateValue() {
        return this.formStateValue;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final Object getTaskParams() {
        return this.taskParams;
    }

    public int hashCode() {
        int hashCode = this.taskId.hashCode() * 31;
        Object obj = this.formStateValue;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.taskParams;
        return hashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        String str = this.taskId;
        Object obj = this.formStateValue;
        Object obj2 = this.taskParams;
        StringBuilder sb = new StringBuilder("AsyncActionDto(taskId=");
        sb.append(str);
        sb.append(", formStateValue=");
        sb.append(obj);
        sb.append(", taskParams=");
        return x4e.h(sb, obj2, Extension.C_BRAKE);
    }
}
