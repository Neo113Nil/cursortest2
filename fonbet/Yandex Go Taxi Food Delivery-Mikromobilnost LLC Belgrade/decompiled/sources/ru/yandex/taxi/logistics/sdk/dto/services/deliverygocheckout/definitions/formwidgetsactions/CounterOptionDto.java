package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nzs;
import defpackage.smw0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0012\u001a\u00060\u0001j\u0002`\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000fJ2\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\f\b\u0003\u0010\u0004\u001a\u00060\u0001j\u0002`\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CounterOptionDto;", "", "title", "", "value", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormStateValueDto;", "default", "", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;)V", "getTitle", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "getDefault", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Boolean;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CounterOptionDto;", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CounterOptionDto {
    private final Boolean default;
    private final String title;
    private final Object value;

    public CounterOptionDto(@Json(name = "title") String str, @Json(name = "value") Object obj, @Json(name = "default") Boolean bool) {
        this.title = str;
        this.value = obj;
        this.default = bool;
    }

    public static /* synthetic */ CounterOptionDto copy$default(CounterOptionDto counterOptionDto, String str, Object obj, Boolean bool, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = counterOptionDto.title;
        }
        if ((i & 2) != 0) {
            obj = counterOptionDto.value;
        }
        if ((i & 4) != 0) {
            bool = counterOptionDto.default;
        }
        return counterOptionDto.copy(str, obj, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getDefault() {
        return this.default;
    }

    public final CounterOptionDto copy(@Json(name = "title") String title, @Json(name = "value") Object value, @Json(name = "default") Boolean r3) {
        return new CounterOptionDto(title, value, r3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CounterOptionDto)) {
            return false;
        }
        CounterOptionDto counterOptionDto = (CounterOptionDto) other;
        return jl40.l(this.title, counterOptionDto.title) && jl40.l(this.value, counterOptionDto.value) && jl40.l(this.default, counterOptionDto.default);
    }

    public final Boolean getDefault() {
        return this.default;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int c = smw0.c(this.title.hashCode() * 31, 31, this.value);
        Boolean bool = this.default;
        return c + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        String str = this.title;
        Object obj = this.value;
        Boolean bool = this.default;
        StringBuilder sb = new StringBuilder("CounterOptionDto(title=");
        sb.append(str);
        sb.append(", value=");
        sb.append(obj);
        sb.append(", default=");
        return nzs.d(sb, bool, Extension.C_BRAKE);
    }
}
