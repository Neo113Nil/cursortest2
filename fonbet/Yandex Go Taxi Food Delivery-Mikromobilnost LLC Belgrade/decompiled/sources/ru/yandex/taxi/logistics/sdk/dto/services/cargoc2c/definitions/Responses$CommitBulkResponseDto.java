package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\n\u001a\u00020\t2\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"ru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/Responses$CommitBulkResponseDto", "", "", "", "operationIds", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/Responses$CommitBulkResponseDto;", "copy", "(Ljava/util/List;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/Responses$CommitBulkResponseDto;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getOperationIds", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Responses$CommitBulkResponseDto {
    private final List<String> operationIds;

    public Responses$CommitBulkResponseDto(@Json(name = "operation_ids") List<String> list) {
        this.operationIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Responses$CommitBulkResponseDto copy$default(Responses$CommitBulkResponseDto responses$CommitBulkResponseDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = responses$CommitBulkResponseDto.operationIds;
        }
        return responses$CommitBulkResponseDto.copy(list);
    }

    public final List<String> component1() {
        return this.operationIds;
    }

    public final Responses$CommitBulkResponseDto copy(@Json(name = "operation_ids") List<String> operationIds) {
        return new Responses$CommitBulkResponseDto(operationIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Responses$CommitBulkResponseDto) && jl40.l(this.operationIds, ((Responses$CommitBulkResponseDto) other).operationIds);
    }

    public final List<String> getOperationIds() {
        return this.operationIds;
    }

    public int hashCode() {
        return this.operationIds.hashCode();
    }

    public String toString() {
        return tse0.k("CommitBulkResponseDto(operationIds=", Extension.C_BRAKE, this.operationIds);
    }
}
