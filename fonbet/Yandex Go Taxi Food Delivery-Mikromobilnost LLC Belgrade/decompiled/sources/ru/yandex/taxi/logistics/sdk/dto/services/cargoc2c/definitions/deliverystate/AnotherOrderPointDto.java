package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\b\u0001\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\u0012\b\u0003\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001b\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/AnotherOrderPointDto;", "", "coordinates", "", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/CoordinatesDto;", "<init>", "(Ljava/util/List;)V", "getCoordinates", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AnotherOrderPointDto {
    private final List<Double> coordinates;

    public AnotherOrderPointDto(@Json(name = "coordinates") List<Double> list) {
        this.coordinates = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnotherOrderPointDto copy$default(AnotherOrderPointDto anotherOrderPointDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = anotherOrderPointDto.coordinates;
        }
        return anotherOrderPointDto.copy(list);
    }

    public final List<Double> component1() {
        return this.coordinates;
    }

    public final AnotherOrderPointDto copy(@Json(name = "coordinates") List<Double> coordinates) {
        return new AnotherOrderPointDto(coordinates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AnotherOrderPointDto) && jl40.l(this.coordinates, ((AnotherOrderPointDto) other).coordinates);
    }

    public final List<Double> getCoordinates() {
        return this.coordinates;
    }

    public int hashCode() {
        return this.coordinates.hashCode();
    }

    public String toString() {
        return tse0.k("AnotherOrderPointDto(coordinates=", Extension.C_BRAKE, this.coordinates);
    }
}
