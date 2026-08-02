package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nzs;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/LocalIconDto;", "", "name", "", "accessibilityLabel", "monochrome", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getName", "()Ljava/lang/String;", "getAccessibilityLabel", "getMonochrome", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/LocalIconDto;", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LocalIconDto {
    private final String accessibilityLabel;
    private final Boolean monochrome;
    private final String name;

    public LocalIconDto(@Json(name = "name") String str, @Json(name = "accessibility_label") String str2, @Json(name = "monochrome") Boolean bool) {
        this.name = str;
        this.accessibilityLabel = str2;
        this.monochrome = bool;
    }

    public static /* synthetic */ LocalIconDto copy$default(LocalIconDto localIconDto, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localIconDto.name;
        }
        if ((i & 2) != 0) {
            str2 = localIconDto.accessibilityLabel;
        }
        if ((i & 4) != 0) {
            bool = localIconDto.monochrome;
        }
        return localIconDto.copy(str, str2, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getMonochrome() {
        return this.monochrome;
    }

    public final LocalIconDto copy(@Json(name = "name") String name, @Json(name = "accessibility_label") String accessibilityLabel, @Json(name = "monochrome") Boolean monochrome) {
        return new LocalIconDto(name, accessibilityLabel, monochrome);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalIconDto)) {
            return false;
        }
        LocalIconDto localIconDto = (LocalIconDto) other;
        return jl40.l(this.name, localIconDto.name) && jl40.l(this.accessibilityLabel, localIconDto.accessibilityLabel) && jl40.l(this.monochrome, localIconDto.monochrome);
    }

    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    public final Boolean getMonochrome() {
        return this.monochrome;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.accessibilityLabel;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.monochrome;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.accessibilityLabel;
        return nzs.d(b64.v("LocalIconDto(name=", str, ", accessibilityLabel=", str2, ", monochrome="), this.monochrome, Extension.C_BRAKE);
    }
}
