package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardSendingStageDto;", "", "labels", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardLabelsDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardLabelsDto;)V", "getLabels", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/neuropostcard/NeuroPostcardLabelsDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class NeuroPostcardSendingStageDto {
    private final NeuroPostcardLabelsDto labels;

    public NeuroPostcardSendingStageDto(@Json(name = "labels") NeuroPostcardLabelsDto neuroPostcardLabelsDto) {
        this.labels = neuroPostcardLabelsDto;
    }

    public static /* synthetic */ NeuroPostcardSendingStageDto copy$default(NeuroPostcardSendingStageDto neuroPostcardSendingStageDto, NeuroPostcardLabelsDto neuroPostcardLabelsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            neuroPostcardLabelsDto = neuroPostcardSendingStageDto.labels;
        }
        return neuroPostcardSendingStageDto.copy(neuroPostcardLabelsDto);
    }

    /* renamed from: component1, reason: from getter */
    public final NeuroPostcardLabelsDto getLabels() {
        return this.labels;
    }

    public final NeuroPostcardSendingStageDto copy(@Json(name = "labels") NeuroPostcardLabelsDto labels) {
        return new NeuroPostcardSendingStageDto(labels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NeuroPostcardSendingStageDto) && jl40.l(this.labels, ((NeuroPostcardSendingStageDto) other).labels);
    }

    public final NeuroPostcardLabelsDto getLabels() {
        return this.labels;
    }

    public int hashCode() {
        NeuroPostcardLabelsDto neuroPostcardLabelsDto = this.labels;
        if (neuroPostcardLabelsDto == null) {
            return 0;
        }
        return neuroPostcardLabelsDto.hashCode();
    }

    public String toString() {
        return "NeuroPostcardSendingStageDto(labels=" + this.labels + Extension.C_BRAKE;
    }
}
