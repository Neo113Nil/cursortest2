package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ClientStateTransformActionDto;", "", "transformer", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ClientStateTransformerDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ClientStateTransformerDto;)V", "getTransformer", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/ClientStateTransformerDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ClientStateTransformActionDto {
    private final ClientStateTransformerDto transformer;

    public ClientStateTransformActionDto(@Json(name = "transformer") ClientStateTransformerDto clientStateTransformerDto) {
        this.transformer = clientStateTransformerDto;
    }

    public static /* synthetic */ ClientStateTransformActionDto copy$default(ClientStateTransformActionDto clientStateTransformActionDto, ClientStateTransformerDto clientStateTransformerDto, int i, Object obj) {
        if ((i & 1) != 0) {
            clientStateTransformerDto = clientStateTransformActionDto.transformer;
        }
        return clientStateTransformActionDto.copy(clientStateTransformerDto);
    }

    /* renamed from: component1, reason: from getter */
    public final ClientStateTransformerDto getTransformer() {
        return this.transformer;
    }

    public final ClientStateTransformActionDto copy(@Json(name = "transformer") ClientStateTransformerDto transformer) {
        return new ClientStateTransformActionDto(transformer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClientStateTransformActionDto) && jl40.l(this.transformer, ((ClientStateTransformActionDto) other).transformer);
    }

    public final ClientStateTransformerDto getTransformer() {
        return this.transformer;
    }

    public int hashCode() {
        return this.transformer.hashCode();
    }

    public String toString() {
        return "ClientStateTransformActionDto(transformer=" + this.transformer + Extension.C_BRAKE;
    }
}
