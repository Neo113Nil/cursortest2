package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto;", "", "StatePoint_SourceDto", "StatePoint_DestinationDto", "StatePoint_ReturnDto", "StatePoint_AnotherOrderPointDto", "Unknown_StatePointDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$StatePoint_AnotherOrderPointDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$StatePoint_DestinationDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$StatePoint_ReturnDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$StatePoint_SourceDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$Unknown_StatePointDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class StatePointDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$StatePoint_AnotherOrderPointDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AnotherOrderPointDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AnotherOrderPointDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AnotherOrderPointDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$StatePoint_AnotherOrderPointDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StatePoint_AnotherOrderPointDto extends StatePointDto {
        public final String a;
        public final AnotherOrderPointDto b;

        public StatePoint_AnotherOrderPointDto(@Json(name = "type") String str, AnotherOrderPointDto anotherOrderPointDto) {
            this.a = str;
            this.b = anotherOrderPointDto;
        }

        public final StatePoint_AnotherOrderPointDto copy(@Json(name = "type") String type, AnotherOrderPointDto value) {
            return new StatePoint_AnotherOrderPointDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatePoint_AnotherOrderPointDto)) {
                return false;
            }
            StatePoint_AnotherOrderPointDto statePoint_AnotherOrderPointDto = (StatePoint_AnotherOrderPointDto) obj;
            return this.a.equals(statePoint_AnotherOrderPointDto.a) && this.b.equals(statePoint_AnotherOrderPointDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StatePoint_AnotherOrderPointDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$StatePoint_DestinationDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderPointDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderPointDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderPointDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$StatePoint_DestinationDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StatePoint_DestinationDto extends StatePointDto {
        public final String a;
        public final OrderPointDto b;

        public StatePoint_DestinationDto(@Json(name = "type") String str, OrderPointDto orderPointDto) {
            this.a = str;
            this.b = orderPointDto;
        }

        public final StatePoint_DestinationDto copy(@Json(name = "type") String type, OrderPointDto value) {
            return new StatePoint_DestinationDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatePoint_DestinationDto)) {
                return false;
            }
            StatePoint_DestinationDto statePoint_DestinationDto = (StatePoint_DestinationDto) obj;
            return this.a.equals(statePoint_DestinationDto.a) && this.b.equals(statePoint_DestinationDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StatePoint_DestinationDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$StatePoint_ReturnDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderPointDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderPointDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderPointDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$StatePoint_ReturnDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StatePoint_ReturnDto extends StatePointDto {
        public final String a;
        public final OrderPointDto b;

        public StatePoint_ReturnDto(@Json(name = "type") String str, OrderPointDto orderPointDto) {
            this.a = str;
            this.b = orderPointDto;
        }

        public final StatePoint_ReturnDto copy(@Json(name = "type") String type, OrderPointDto value) {
            return new StatePoint_ReturnDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatePoint_ReturnDto)) {
                return false;
            }
            StatePoint_ReturnDto statePoint_ReturnDto = (StatePoint_ReturnDto) obj;
            return this.a.equals(statePoint_ReturnDto.a) && this.b.equals(statePoint_ReturnDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StatePoint_ReturnDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$StatePoint_SourceDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderPointDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderPointDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/OrderPointDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$StatePoint_SourceDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StatePoint_SourceDto extends StatePointDto {
        public final String a;
        public final OrderPointDto b;

        public StatePoint_SourceDto(@Json(name = "type") String str, OrderPointDto orderPointDto) {
            this.a = str;
            this.b = orderPointDto;
        }

        public final StatePoint_SourceDto copy(@Json(name = "type") String type, OrderPointDto value) {
            return new StatePoint_SourceDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatePoint_SourceDto)) {
                return false;
            }
            StatePoint_SourceDto statePoint_SourceDto = (StatePoint_SourceDto) obj;
            return this.a.equals(statePoint_SourceDto.a) && this.b.equals(statePoint_SourceDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StatePoint_SourceDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$Unknown_StatePointDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/StatePointDto$Unknown_StatePointDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_StatePointDto extends StatePointDto {
        public final String a;

        public Unknown_StatePointDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_StatePointDto copy(@Json(name = "type") String type) {
            return new Unknown_StatePointDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_StatePointDto) && jl40.l(this.a, ((Unknown_StatePointDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_StatePointDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_StatePointDto() {
            this(0);
        }

        public /* synthetic */ Unknown_StatePointDto(int i) {
            this("unknown");
        }
    }
}
