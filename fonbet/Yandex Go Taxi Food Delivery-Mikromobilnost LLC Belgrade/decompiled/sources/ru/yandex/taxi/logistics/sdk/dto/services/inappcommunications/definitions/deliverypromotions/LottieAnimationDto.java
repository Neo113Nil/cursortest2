package ru.yandex.taxi.logistics.sdk.dto.services.inappcommunications.definitions.deliverypromotions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto;", "", "source", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto;)V", "getSource", "()Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SourceDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LottieAnimationDto {
    private final SourceDto source;

    public LottieAnimationDto(@Json(name = "source") SourceDto sourceDto) {
        this.source = sourceDto;
    }

    public static /* synthetic */ LottieAnimationDto copy$default(LottieAnimationDto lottieAnimationDto, SourceDto sourceDto, int i, Object obj) {
        if ((i & 1) != 0) {
            sourceDto = lottieAnimationDto.source;
        }
        return lottieAnimationDto.copy(sourceDto);
    }

    /* renamed from: component1, reason: from getter */
    public final SourceDto getSource() {
        return this.source;
    }

    public final LottieAnimationDto copy(@Json(name = "source") SourceDto source) {
        return new LottieAnimationDto(source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LottieAnimationDto) && jl40.l(this.source, ((LottieAnimationDto) other).source);
    }

    public final SourceDto getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.source.hashCode();
    }

    public String toString() {
        return "LottieAnimationDto(source=" + this.source + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto;", "", "Source_LocalDto", "Source_RemoteDto", "Unknown_SourceDto", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto$Source_LocalDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto$Source_RemoteDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto$Unknown_SourceDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SourceDto {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto$Source_LocalDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LocalLottieAnimationDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LocalLottieAnimationDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LocalLottieAnimationDto;)Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto$Source_LocalDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Source_LocalDto extends SourceDto {
            public final String a;
            public final LocalLottieAnimationDto b;

            public Source_LocalDto(@Json(name = "type") String str, LocalLottieAnimationDto localLottieAnimationDto) {
                this.a = str;
                this.b = localLottieAnimationDto;
            }

            public final Source_LocalDto copy(@Json(name = "type") String type, LocalLottieAnimationDto value) {
                return new Source_LocalDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Source_LocalDto)) {
                    return false;
                }
                Source_LocalDto source_LocalDto = (Source_LocalDto) obj;
                return this.a.equals(source_LocalDto.a) && this.b.equals(source_LocalDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Source_LocalDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto$Source_RemoteDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/RemoteLottieAnimationDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/RemoteLottieAnimationDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/RemoteLottieAnimationDto;)Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto$Source_RemoteDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Source_RemoteDto extends SourceDto {
            public final String a;
            public final RemoteLottieAnimationDto b;

            public Source_RemoteDto(@Json(name = "type") String str, RemoteLottieAnimationDto remoteLottieAnimationDto) {
                this.a = str;
                this.b = remoteLottieAnimationDto;
            }

            public final Source_RemoteDto copy(@Json(name = "type") String type, RemoteLottieAnimationDto value) {
                return new Source_RemoteDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Source_RemoteDto)) {
                    return false;
                }
                Source_RemoteDto source_RemoteDto = (Source_RemoteDto) obj;
                return this.a.equals(source_RemoteDto.a) && this.b.equals(source_RemoteDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Source_RemoteDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto$Unknown_SourceDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/inappcommunications/definitions/deliverypromotions/LottieAnimationDto$SourceDto$Unknown_SourceDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown_SourceDto extends SourceDto {
            public final String a;

            public Unknown_SourceDto(@Json(name = "type") String str) {
                this.a = str;
            }

            public final Unknown_SourceDto copy(@Json(name = "type") String type) {
                return new Unknown_SourceDto(type);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown_SourceDto) && jl40.l(this.a, ((Unknown_SourceDto) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oyr.p("Unknown_SourceDto(type=", this.a, Extension.C_BRAKE);
            }

            public Unknown_SourceDto() {
                this(0);
            }

            public /* synthetic */ Unknown_SourceDto(int i) {
                this("unknown");
            }
        }
    }
}
