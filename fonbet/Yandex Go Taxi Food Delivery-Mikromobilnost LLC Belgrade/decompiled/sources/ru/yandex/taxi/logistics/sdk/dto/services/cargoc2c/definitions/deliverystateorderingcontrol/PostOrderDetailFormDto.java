package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/PostOrderDetailFormDto;", "", "isForced", "", "forcedDisplayDelay", "", "layout", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormLayoutDto;", "<init>", "(ZLjava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormLayoutDto;)V", "()Z", "getForcedDisplayDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLayout", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormLayoutDto;", "component1", "component2", "component3", "copy", "(ZLjava/lang/Integer;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormLayoutDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/PostOrderDetailFormDto;", "equals", "other", "hashCode", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PostOrderDetailFormDto {
    private final Integer forcedDisplayDelay;
    private final boolean isForced;
    private final DetailFormLayoutDto layout;

    public PostOrderDetailFormDto(@Json(name = "is_forced") boolean z, @Json(name = "forced_display_delay") Integer num, @Json(name = "layout") DetailFormLayoutDto detailFormLayoutDto) {
        this.isForced = z;
        this.forcedDisplayDelay = num;
        this.layout = detailFormLayoutDto;
    }

    public static /* synthetic */ PostOrderDetailFormDto copy$default(PostOrderDetailFormDto postOrderDetailFormDto, boolean z, Integer num, DetailFormLayoutDto detailFormLayoutDto, int i, Object obj) {
        if ((i & 1) != 0) {
            z = postOrderDetailFormDto.isForced;
        }
        if ((i & 2) != 0) {
            num = postOrderDetailFormDto.forcedDisplayDelay;
        }
        if ((i & 4) != 0) {
            detailFormLayoutDto = postOrderDetailFormDto.layout;
        }
        return postOrderDetailFormDto.copy(z, num, detailFormLayoutDto);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsForced() {
        return this.isForced;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getForcedDisplayDelay() {
        return this.forcedDisplayDelay;
    }

    /* renamed from: component3, reason: from getter */
    public final DetailFormLayoutDto getLayout() {
        return this.layout;
    }

    public final PostOrderDetailFormDto copy(@Json(name = "is_forced") boolean isForced, @Json(name = "forced_display_delay") Integer forcedDisplayDelay, @Json(name = "layout") DetailFormLayoutDto layout) {
        return new PostOrderDetailFormDto(isForced, forcedDisplayDelay, layout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostOrderDetailFormDto)) {
            return false;
        }
        PostOrderDetailFormDto postOrderDetailFormDto = (PostOrderDetailFormDto) other;
        return this.isForced == postOrderDetailFormDto.isForced && jl40.l(this.forcedDisplayDelay, postOrderDetailFormDto.forcedDisplayDelay) && jl40.l(this.layout, postOrderDetailFormDto.layout);
    }

    public final Integer getForcedDisplayDelay() {
        return this.forcedDisplayDelay;
    }

    public final DetailFormLayoutDto getLayout() {
        return this.layout;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isForced) * 31;
        Integer num = this.forcedDisplayDelay;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        DetailFormLayoutDto detailFormLayoutDto = this.layout;
        return hashCode2 + (detailFormLayoutDto != null ? detailFormLayoutDto.hashCode() : 0);
    }

    public final boolean isForced() {
        return this.isForced;
    }

    public String toString() {
        return "PostOrderDetailFormDto(isForced=" + this.isForced + ", forcedDisplayDelay=" + this.forcedDisplayDelay + ", layout=" + this.layout + Extension.C_BRAKE;
    }
}
