package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskStatusDto;", "", "AsyncTaskStatus_ProcessingDto", "AsyncTaskStatus_CompletedDto", "Unknown_AsyncTaskStatusDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskStatusDto$AsyncTaskStatus_CompletedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskStatusDto$AsyncTaskStatus_ProcessingDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskStatusDto$Unknown_AsyncTaskStatusDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AsyncTaskStatusDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskStatusDto$AsyncTaskStatus_CompletedDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskStatusDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCompletedDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCompletedDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCompletedDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskStatusDto$AsyncTaskStatus_CompletedDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AsyncTaskStatus_CompletedDto extends AsyncTaskStatusDto {
        public final String a;
        public final AsyncTaskCompletedDto b;

        public AsyncTaskStatus_CompletedDto(@Json(name = "type") String str, AsyncTaskCompletedDto asyncTaskCompletedDto) {
            this.a = str;
            this.b = asyncTaskCompletedDto;
        }

        /* renamed from: a, reason: from getter */
        public final AsyncTaskCompletedDto getB() {
            return this.b;
        }

        public final AsyncTaskStatus_CompletedDto copy(@Json(name = "type") String type, AsyncTaskCompletedDto value) {
            return new AsyncTaskStatus_CompletedDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AsyncTaskStatus_CompletedDto)) {
                return false;
            }
            AsyncTaskStatus_CompletedDto asyncTaskStatus_CompletedDto = (AsyncTaskStatus_CompletedDto) obj;
            return this.a.equals(asyncTaskStatus_CompletedDto.a) && this.b.equals(asyncTaskStatus_CompletedDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AsyncTaskStatus_CompletedDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskStatusDto$AsyncTaskStatus_ProcessingDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskStatusDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskProcessingDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskProcessingDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskProcessingDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskStatusDto$AsyncTaskStatus_ProcessingDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AsyncTaskStatus_ProcessingDto extends AsyncTaskStatusDto {
        public final String a;
        public final AsyncTaskProcessingDto b;

        public AsyncTaskStatus_ProcessingDto(@Json(name = "type") String str, AsyncTaskProcessingDto asyncTaskProcessingDto) {
            this.a = str;
            this.b = asyncTaskProcessingDto;
        }

        /* renamed from: a, reason: from getter */
        public final AsyncTaskProcessingDto getB() {
            return this.b;
        }

        public final AsyncTaskStatus_ProcessingDto copy(@Json(name = "type") String type, AsyncTaskProcessingDto value) {
            return new AsyncTaskStatus_ProcessingDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AsyncTaskStatus_ProcessingDto)) {
                return false;
            }
            AsyncTaskStatus_ProcessingDto asyncTaskStatus_ProcessingDto = (AsyncTaskStatus_ProcessingDto) obj;
            return this.a.equals(asyncTaskStatus_ProcessingDto.a) && this.b.equals(asyncTaskStatus_ProcessingDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AsyncTaskStatus_ProcessingDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskStatusDto$Unknown_AsyncTaskStatusDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskStatusDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskStatusDto$Unknown_AsyncTaskStatusDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_AsyncTaskStatusDto extends AsyncTaskStatusDto {
        public final String a;

        public Unknown_AsyncTaskStatusDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_AsyncTaskStatusDto copy(@Json(name = "type") String type) {
            return new Unknown_AsyncTaskStatusDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_AsyncTaskStatusDto) && jl40.l(this.a, ((Unknown_AsyncTaskStatusDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_AsyncTaskStatusDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_AsyncTaskStatusDto() {
            this(0);
        }

        public /* synthetic */ Unknown_AsyncTaskStatusDto(int i) {
            this("unknown");
        }
    }
}
