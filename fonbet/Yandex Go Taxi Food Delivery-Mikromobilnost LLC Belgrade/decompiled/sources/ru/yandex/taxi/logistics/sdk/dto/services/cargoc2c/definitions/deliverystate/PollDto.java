package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollDto;", "", "header", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollsHeaderDto;", "subpolls", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/SubpollDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollsHeaderDto;Ljava/util/List;)V", "getHeader", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystate/PollsHeaderDto;", "getSubpolls", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PollDto {
    private final PollsHeaderDto header;
    private final List<SubpollDto> subpolls;

    public PollDto(@Json(name = "header") PollsHeaderDto pollsHeaderDto, @Json(name = "subpolls") List<SubpollDto> list) {
        this.header = pollsHeaderDto;
        this.subpolls = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollDto copy$default(PollDto pollDto, PollsHeaderDto pollsHeaderDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            pollsHeaderDto = pollDto.header;
        }
        if ((i & 2) != 0) {
            list = pollDto.subpolls;
        }
        return pollDto.copy(pollsHeaderDto, list);
    }

    /* renamed from: component1, reason: from getter */
    public final PollsHeaderDto getHeader() {
        return this.header;
    }

    public final List<SubpollDto> component2() {
        return this.subpolls;
    }

    public final PollDto copy(@Json(name = "header") PollsHeaderDto header, @Json(name = "subpolls") List<SubpollDto> subpolls) {
        return new PollDto(header, subpolls);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PollDto)) {
            return false;
        }
        PollDto pollDto = (PollDto) other;
        return jl40.l(this.header, pollDto.header) && jl40.l(this.subpolls, pollDto.subpolls);
    }

    public final PollsHeaderDto getHeader() {
        return this.header;
    }

    public final List<SubpollDto> getSubpolls() {
        return this.subpolls;
    }

    public int hashCode() {
        return this.subpolls.hashCode() + (this.header.hashCode() * 31);
    }

    public String toString() {
        return "PollDto(header=" + this.header + ", subpolls=" + this.subpolls + Extension.C_BRAKE;
    }
}
