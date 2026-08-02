package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/StoragePeriodOptionsDto;", "", "options", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/StoragePeriodOptionDto;", "<init>", "(Ljava/util/List;)V", "getOptions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class StoragePeriodOptionsDto {
    private final List<StoragePeriodOptionDto> options;

    public StoragePeriodOptionsDto(@Json(name = "options") List<StoragePeriodOptionDto> list) {
        this.options = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoragePeriodOptionsDto copy$default(StoragePeriodOptionsDto storagePeriodOptionsDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = storagePeriodOptionsDto.options;
        }
        return storagePeriodOptionsDto.copy(list);
    }

    public final List<StoragePeriodOptionDto> component1() {
        return this.options;
    }

    public final StoragePeriodOptionsDto copy(@Json(name = "options") List<StoragePeriodOptionDto> options) {
        return new StoragePeriodOptionsDto(options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StoragePeriodOptionsDto) && jl40.l(this.options, ((StoragePeriodOptionsDto) other).options);
    }

    public final List<StoragePeriodOptionDto> getOptions() {
        return this.options;
    }

    public int hashCode() {
        return this.options.hashCode();
    }

    public String toString() {
        return tse0.k("StoragePeriodOptionsDto(options=", Extension.C_BRAKE, this.options);
    }
}
