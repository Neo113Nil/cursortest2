package ru.yandex.taxi.logistics.sdk.dto.libraries.deliverygooffers.formclientstate;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/libraries/deliverygooffers/formclientstate/FormStateContactDto;", "", "routeIndex", "", "phone", "", "<init>", "(ILjava/lang/String;)V", "getRouteIndex", "()I", "getPhone", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormStateContactDto {
    private final String phone;
    private final int routeIndex;

    public FormStateContactDto(@Json(name = "route_index") int i, @Json(name = "phone") String str) {
        this.routeIndex = i;
        this.phone = str;
    }

    public static /* synthetic */ FormStateContactDto copy$default(FormStateContactDto formStateContactDto, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = formStateContactDto.routeIndex;
        }
        if ((i2 & 2) != 0) {
            str = formStateContactDto.phone;
        }
        return formStateContactDto.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getRouteIndex() {
        return this.routeIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final FormStateContactDto copy(@Json(name = "route_index") int routeIndex, @Json(name = "phone") String phone) {
        return new FormStateContactDto(routeIndex, phone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormStateContactDto)) {
            return false;
        }
        FormStateContactDto formStateContactDto = (FormStateContactDto) other;
        return this.routeIndex == formStateContactDto.routeIndex && jl40.l(this.phone, formStateContactDto.phone);
    }

    public final String getPhone() {
        return this.phone;
    }

    public final int getRouteIndex() {
        return this.routeIndex;
    }

    public int hashCode() {
        return this.phone.hashCode() + (Integer.hashCode(this.routeIndex) * 31);
    }

    public String toString() {
        return oyr.l(this.routeIndex, "FormStateContactDto(routeIndex=", ", phone=", this.phone, Extension.C_BRAKE);
    }
}
