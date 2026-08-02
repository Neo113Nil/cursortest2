package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/CollapseButtonDto;", "", "collapseTitle", "", "expandTitle", "targetId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCollapseTitle", "()Ljava/lang/String;", "getExpandTitle", "getTargetId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CollapseButtonDto {
    private final String collapseTitle;
    private final String expandTitle;
    private final String targetId;

    public CollapseButtonDto(@Json(name = "collapse_title") String str, @Json(name = "expand_title") String str2, @Json(name = "target_id") String str3) {
        this.collapseTitle = str;
        this.expandTitle = str2;
        this.targetId = str3;
    }

    public static /* synthetic */ CollapseButtonDto copy$default(CollapseButtonDto collapseButtonDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = collapseButtonDto.collapseTitle;
        }
        if ((i & 2) != 0) {
            str2 = collapseButtonDto.expandTitle;
        }
        if ((i & 4) != 0) {
            str3 = collapseButtonDto.targetId;
        }
        return collapseButtonDto.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCollapseTitle() {
        return this.collapseTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExpandTitle() {
        return this.expandTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTargetId() {
        return this.targetId;
    }

    public final CollapseButtonDto copy(@Json(name = "collapse_title") String collapseTitle, @Json(name = "expand_title") String expandTitle, @Json(name = "target_id") String targetId) {
        return new CollapseButtonDto(collapseTitle, expandTitle, targetId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollapseButtonDto)) {
            return false;
        }
        CollapseButtonDto collapseButtonDto = (CollapseButtonDto) other;
        return jl40.l(this.collapseTitle, collapseButtonDto.collapseTitle) && jl40.l(this.expandTitle, collapseButtonDto.expandTitle) && jl40.l(this.targetId, collapseButtonDto.targetId);
    }

    public final String getCollapseTitle() {
        return this.collapseTitle;
    }

    public final String getExpandTitle() {
        return this.expandTitle;
    }

    public final String getTargetId() {
        return this.targetId;
    }

    public int hashCode() {
        return this.targetId.hashCode() + unr0.b(this.collapseTitle.hashCode() * 31, 31, this.expandTitle);
    }

    public String toString() {
        String str = this.collapseTitle;
        String str2 = this.expandTitle;
        return oyr.t(b64.v("CollapseButtonDto(collapseTitle=", str, ", expandTitle=", str2, ", targetId="), this.targetId, Extension.C_BRAKE);
    }
}
