package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CustomActionDto;", "", "name", "", "args", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getName", "()Ljava/lang/String;", "getArgs", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CustomActionDto {
    private final Object args;
    private final String name;

    public CustomActionDto(@Json(name = "name") String str, @Json(name = "args") Object obj) {
        this.name = str;
        this.args = obj;
    }

    public static /* synthetic */ CustomActionDto copy$default(CustomActionDto customActionDto, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = customActionDto.name;
        }
        if ((i & 2) != 0) {
            obj = customActionDto.args;
        }
        return customActionDto.copy(str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getArgs() {
        return this.args;
    }

    public final CustomActionDto copy(@Json(name = "name") String name, @Json(name = "args") Object args) {
        return new CustomActionDto(name, args);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomActionDto)) {
            return false;
        }
        CustomActionDto customActionDto = (CustomActionDto) other;
        return jl40.l(this.name, customActionDto.name) && jl40.l(this.args, customActionDto.args);
    }

    public final Object getArgs() {
        return this.args;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Object obj = this.args;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "CustomActionDto(name=" + this.name + ", args=" + this.args + Extension.C_BRAKE;
    }
}
