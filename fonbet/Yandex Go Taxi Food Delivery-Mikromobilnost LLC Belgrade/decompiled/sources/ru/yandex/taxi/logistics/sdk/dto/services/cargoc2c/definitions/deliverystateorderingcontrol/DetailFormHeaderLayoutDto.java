package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormHeaderLayoutDto;", "", "headline", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getHeadline", "()Ljava/lang/String;", "getDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DetailFormHeaderLayoutDto {
    private final String description;
    private final String headline;

    public DetailFormHeaderLayoutDto(@Json(name = "headline") String str, @Json(name = "description") String str2) {
        this.headline = str;
        this.description = str2;
    }

    public static /* synthetic */ DetailFormHeaderLayoutDto copy$default(DetailFormHeaderLayoutDto detailFormHeaderLayoutDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailFormHeaderLayoutDto.headline;
        }
        if ((i & 2) != 0) {
            str2 = detailFormHeaderLayoutDto.description;
        }
        return detailFormHeaderLayoutDto.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHeadline() {
        return this.headline;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final DetailFormHeaderLayoutDto copy(@Json(name = "headline") String headline, @Json(name = "description") String description) {
        return new DetailFormHeaderLayoutDto(headline, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailFormHeaderLayoutDto)) {
            return false;
        }
        DetailFormHeaderLayoutDto detailFormHeaderLayoutDto = (DetailFormHeaderLayoutDto) other;
        return jl40.l(this.headline, detailFormHeaderLayoutDto.headline) && jl40.l(this.description, detailFormHeaderLayoutDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getHeadline() {
        return this.headline;
    }

    public int hashCode() {
        int hashCode = this.headline.hashCode() * 31;
        String str = this.description;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return unr0.p("DetailFormHeaderLayoutDto(headline=", this.headline, ", description=", this.description, Extension.C_BRAKE);
    }
}
