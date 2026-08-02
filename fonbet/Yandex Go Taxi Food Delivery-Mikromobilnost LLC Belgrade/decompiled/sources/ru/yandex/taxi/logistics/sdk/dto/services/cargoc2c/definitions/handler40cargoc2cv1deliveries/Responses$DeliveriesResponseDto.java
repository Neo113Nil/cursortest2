package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.handler40cargoc2cv1deliveries;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.x4e;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveriesstate.DeliveriesStateDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB'\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\r\u001a\u00020\f2\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n¨\u0006\u001c"}, d2 = {"ru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveries/Responses$DeliveriesResponseDto", "", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveries/Responses$DeliveriesResponseDto$DeliveriesDto;", "deliveries", "", "shipments", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveries/Responses$DeliveriesResponseDto;", "copy", "(Ljava/util/List;Ljava/util/List;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveries/Responses$DeliveriesResponseDto;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getDeliveries", "getShipments", "DeliveriesDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Responses$DeliveriesResponseDto {
    private final List<DeliveriesDto> deliveries;
    private final List<String> shipments;

    public Responses$DeliveriesResponseDto(@Json(name = "deliveries") List<DeliveriesDto> list, @Json(name = "shipments") List<String> list2) {
        this.deliveries = list;
        this.shipments = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Responses$DeliveriesResponseDto copy$default(Responses$DeliveriesResponseDto responses$DeliveriesResponseDto, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = responses$DeliveriesResponseDto.deliveries;
        }
        if ((i & 2) != 0) {
            list2 = responses$DeliveriesResponseDto.shipments;
        }
        return responses$DeliveriesResponseDto.copy(list, list2);
    }

    public final List<DeliveriesDto> component1() {
        return this.deliveries;
    }

    public final List<String> component2() {
        return this.shipments;
    }

    public final Responses$DeliveriesResponseDto copy(@Json(name = "deliveries") List<DeliveriesDto> deliveries, @Json(name = "shipments") List<String> shipments) {
        return new Responses$DeliveriesResponseDto(deliveries, shipments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Responses$DeliveriesResponseDto)) {
            return false;
        }
        Responses$DeliveriesResponseDto responses$DeliveriesResponseDto = (Responses$DeliveriesResponseDto) other;
        return jl40.l(this.deliveries, responses$DeliveriesResponseDto.deliveries) && jl40.l(this.shipments, responses$DeliveriesResponseDto.shipments);
    }

    public final List<DeliveriesDto> getDeliveries() {
        return this.deliveries;
    }

    public final List<String> getShipments() {
        return this.shipments;
    }

    public int hashCode() {
        return this.shipments.hashCode() + (this.deliveries.hashCode() * 31);
    }

    public String toString() {
        return xvz.l("DeliveriesResponseDto(deliveries=", this.deliveries, ", shipments=", this.shipments, Extension.C_BRAKE);
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/handler40cargoc2cv1deliveries/Responses$DeliveriesResponseDto$DeliveriesDto;", "", "revision", "", "deliveryId", "", "etag", ClidProvider.STATE, "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto;)V", "getRevision", "()J", "getDeliveryId", "()Ljava/lang/String;", "getEtag", "getState", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliveriesstate/DeliveriesStateDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DeliveriesDto {
        private final String deliveryId;
        private final String etag;
        private final long revision;
        private final DeliveriesStateDto state;

        public /* synthetic */ DeliveriesDto(long j, String str, String str2, DeliveriesStateDto deliveriesStateDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j, str, str2, deliveriesStateDto);
        }

        public static /* synthetic */ DeliveriesDto copy$default(DeliveriesDto deliveriesDto, long j, String str, String str2, DeliveriesStateDto deliveriesStateDto, int i, Object obj) {
            if ((i & 1) != 0) {
                j = deliveriesDto.revision;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                str = deliveriesDto.deliveryId;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = deliveriesDto.etag;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                deliveriesStateDto = deliveriesDto.state;
            }
            return deliveriesDto.copy(j2, str3, str4, deliveriesStateDto);
        }

        /* renamed from: component1, reason: from getter */
        public final long getRevision() {
            return this.revision;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDeliveryId() {
            return this.deliveryId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEtag() {
            return this.etag;
        }

        /* renamed from: component4, reason: from getter */
        public final DeliveriesStateDto getState() {
            return this.state;
        }

        public final DeliveriesDto copy(@Json(name = "revision") long revision, @Json(name = "delivery_id") String deliveryId, @Json(name = "etag") String etag, @Json(name = "state") DeliveriesStateDto state) {
            return new DeliveriesDto(revision, deliveryId, etag, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeliveriesDto)) {
                return false;
            }
            DeliveriesDto deliveriesDto = (DeliveriesDto) other;
            return this.revision == deliveriesDto.revision && jl40.l(this.deliveryId, deliveriesDto.deliveryId) && jl40.l(this.etag, deliveriesDto.etag) && jl40.l(this.state, deliveriesDto.state);
        }

        public final String getDeliveryId() {
            return this.deliveryId;
        }

        public final String getEtag() {
            return this.etag;
        }

        public final long getRevision() {
            return this.revision;
        }

        public final DeliveriesStateDto getState() {
            return this.state;
        }

        public int hashCode() {
            int b = unr0.b(unr0.b(Long.hashCode(this.revision) * 31, 31, this.deliveryId), 31, this.etag);
            DeliveriesStateDto deliveriesStateDto = this.state;
            return b + (deliveriesStateDto == null ? 0 : deliveriesStateDto.hashCode());
        }

        public String toString() {
            long j = this.revision;
            String str = this.deliveryId;
            String str2 = this.etag;
            DeliveriesStateDto deliveriesStateDto = this.state;
            StringBuilder k = x4e.k("DeliveriesDto(revision=", j, ", deliveryId=", str);
            k.append(", etag=");
            k.append(str2);
            k.append(", state=");
            k.append(deliveriesStateDto);
            k.append(Extension.C_BRAKE);
            return k.toString();
        }

        public DeliveriesDto(@Json(name = "revision") long j, @Json(name = "delivery_id") String str, @Json(name = "etag") String str2, @Json(name = "state") DeliveriesStateDto deliveriesStateDto) {
            this.revision = j;
            this.deliveryId = str;
            this.etag = str2;
            this.state = deliveriesStateDto;
        }
    }
}
