package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateorderingcontrol;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;", "", "placeholder", "", "isLocked", "", "currentValue", "editFieldName", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getPlaceholder", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCurrentValue", "getEditFieldName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateorderingcontrol/DetailFormCommonInputLayoutDto;", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DetailFormCommonInputLayoutDto {
    private final String currentValue;
    private final String editFieldName;
    private final Boolean isLocked;
    private final String placeholder;

    public DetailFormCommonInputLayoutDto(@Json(name = "placeholder") String str, @Json(name = "is_locked") Boolean bool, @Json(name = "current_value") String str2, @Json(name = "edit_field_name") String str3) {
        this.placeholder = str;
        this.isLocked = bool;
        this.currentValue = str2;
        this.editFieldName = str3;
    }

    public static /* synthetic */ DetailFormCommonInputLayoutDto copy$default(DetailFormCommonInputLayoutDto detailFormCommonInputLayoutDto, String str, Boolean bool, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailFormCommonInputLayoutDto.placeholder;
        }
        if ((i & 2) != 0) {
            bool = detailFormCommonInputLayoutDto.isLocked;
        }
        if ((i & 4) != 0) {
            str2 = detailFormCommonInputLayoutDto.currentValue;
        }
        if ((i & 8) != 0) {
            str3 = detailFormCommonInputLayoutDto.editFieldName;
        }
        return detailFormCommonInputLayoutDto.copy(str, bool, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsLocked() {
        return this.isLocked;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCurrentValue() {
        return this.currentValue;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEditFieldName() {
        return this.editFieldName;
    }

    public final DetailFormCommonInputLayoutDto copy(@Json(name = "placeholder") String placeholder, @Json(name = "is_locked") Boolean isLocked, @Json(name = "current_value") String currentValue, @Json(name = "edit_field_name") String editFieldName) {
        return new DetailFormCommonInputLayoutDto(placeholder, isLocked, currentValue, editFieldName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailFormCommonInputLayoutDto)) {
            return false;
        }
        DetailFormCommonInputLayoutDto detailFormCommonInputLayoutDto = (DetailFormCommonInputLayoutDto) other;
        return jl40.l(this.placeholder, detailFormCommonInputLayoutDto.placeholder) && jl40.l(this.isLocked, detailFormCommonInputLayoutDto.isLocked) && jl40.l(this.currentValue, detailFormCommonInputLayoutDto.currentValue) && jl40.l(this.editFieldName, detailFormCommonInputLayoutDto.editFieldName);
    }

    public final String getCurrentValue() {
        return this.currentValue;
    }

    public final String getEditFieldName() {
        return this.editFieldName;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public int hashCode() {
        String str = this.placeholder;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isLocked;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.currentValue;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.editFieldName;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean isLocked() {
        return this.isLocked;
    }

    public String toString() {
        String str = this.placeholder;
        Boolean bool = this.isLocked;
        String str2 = this.currentValue;
        String str3 = this.editFieldName;
        StringBuilder sb = new StringBuilder("DetailFormCommonInputLayoutDto(placeholder=");
        sb.append(str);
        sb.append(", isLocked=");
        sb.append(bool);
        sb.append(", currentValue=");
        return g8e.r(sb, str2, ", editFieldName=", str3, Extension.C_BRAKE);
    }
}
