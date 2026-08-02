package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaddingsDto;", "", "lead", "", "trail", "top", "bottom", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getLead", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrail", "getTop", "getBottom", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/PaddingsDto;", "equals", "", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PaddingsDto {
    private final Integer bottom;
    private final Integer lead;
    private final Integer top;
    private final Integer trail;

    public PaddingsDto(@Json(name = "lead") Integer num, @Json(name = "trail") Integer num2, @Json(name = "top") Integer num3, @Json(name = "bottom") Integer num4) {
        this.lead = num;
        this.trail = num2;
        this.top = num3;
        this.bottom = num4;
    }

    public static /* synthetic */ PaddingsDto copy$default(PaddingsDto paddingsDto, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = paddingsDto.lead;
        }
        if ((i & 2) != 0) {
            num2 = paddingsDto.trail;
        }
        if ((i & 4) != 0) {
            num3 = paddingsDto.top;
        }
        if ((i & 8) != 0) {
            num4 = paddingsDto.bottom;
        }
        return paddingsDto.copy(num, num2, num3, num4);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getLead() {
        return this.lead;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getTrail() {
        return this.trail;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getTop() {
        return this.top;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getBottom() {
        return this.bottom;
    }

    public final PaddingsDto copy(@Json(name = "lead") Integer lead, @Json(name = "trail") Integer trail, @Json(name = "top") Integer top, @Json(name = "bottom") Integer bottom) {
        return new PaddingsDto(lead, trail, top, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingsDto)) {
            return false;
        }
        PaddingsDto paddingsDto = (PaddingsDto) other;
        return jl40.l(this.lead, paddingsDto.lead) && jl40.l(this.trail, paddingsDto.trail) && jl40.l(this.top, paddingsDto.top) && jl40.l(this.bottom, paddingsDto.bottom);
    }

    public final Integer getBottom() {
        return this.bottom;
    }

    public final Integer getLead() {
        return this.lead;
    }

    public final Integer getTop() {
        return this.top;
    }

    public final Integer getTrail() {
        return this.trail;
    }

    public int hashCode() {
        Integer num = this.lead;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.trail;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.top;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.bottom;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public String toString() {
        return "PaddingsDto(lead=" + this.lead + ", trail=" + this.trail + ", top=" + this.top + ", bottom=" + this.bottom + Extension.C_BRAKE;
    }
}
