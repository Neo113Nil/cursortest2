package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCommunicationDto;", "", "AsyncTaskCommunication_InfoDto", "Unknown_AsyncTaskCommunicationDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCommunicationDto$AsyncTaskCommunication_InfoDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCommunicationDto$Unknown_AsyncTaskCommunicationDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AsyncTaskCommunicationDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCommunicationDto$AsyncTaskCommunication_InfoDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCommunicationDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskInfoDialogDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskInfoDialogDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskInfoDialogDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCommunicationDto$AsyncTaskCommunication_InfoDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AsyncTaskCommunication_InfoDto extends AsyncTaskCommunicationDto {
        public final String a;
        public final AsyncTaskInfoDialogDto b;

        public AsyncTaskCommunication_InfoDto(@Json(name = "type") String str, AsyncTaskInfoDialogDto asyncTaskInfoDialogDto) {
            this.a = str;
            this.b = asyncTaskInfoDialogDto;
        }

        /* renamed from: a, reason: from getter */
        public final AsyncTaskInfoDialogDto getB() {
            return this.b;
        }

        public final AsyncTaskCommunication_InfoDto copy(@Json(name = "type") String type, AsyncTaskInfoDialogDto value) {
            return new AsyncTaskCommunication_InfoDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AsyncTaskCommunication_InfoDto)) {
                return false;
            }
            AsyncTaskCommunication_InfoDto asyncTaskCommunication_InfoDto = (AsyncTaskCommunication_InfoDto) obj;
            return this.a.equals(asyncTaskCommunication_InfoDto.a) && this.b.equals(asyncTaskCommunication_InfoDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "AsyncTaskCommunication_InfoDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCommunicationDto$Unknown_AsyncTaskCommunicationDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCommunicationDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskCommunicationDto$Unknown_AsyncTaskCommunicationDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_AsyncTaskCommunicationDto extends AsyncTaskCommunicationDto {
        public final String a;

        public Unknown_AsyncTaskCommunicationDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_AsyncTaskCommunicationDto copy(@Json(name = "type") String type) {
            return new Unknown_AsyncTaskCommunicationDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_AsyncTaskCommunicationDto) && jl40.l(this.a, ((Unknown_AsyncTaskCommunicationDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_AsyncTaskCommunicationDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_AsyncTaskCommunicationDto() {
            this(0);
        }

        public /* synthetic */ Unknown_AsyncTaskCommunicationDto(int i) {
            this("unknown");
        }
    }
}
