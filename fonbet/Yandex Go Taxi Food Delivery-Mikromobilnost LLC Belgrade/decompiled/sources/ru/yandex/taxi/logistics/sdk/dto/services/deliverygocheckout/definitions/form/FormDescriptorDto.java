package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\b\u0001\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\f\u001a\u00060\u0001j\u0002`\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\f\b\u0003\u0010\u0002\u001a\u00060\u0001j\u0002`\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormDescriptorDto;", "", "match", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormStateMatchDto;", "override", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormOverrideDto;", "<init>", "(Ljava/lang/Object;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormOverrideDto;)V", "getMatch", "()Ljava/lang/Object;", "getOverride", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormOverrideDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormDescriptorDto {
    private final Object match;
    private final FormOverrideDto override;

    public FormDescriptorDto(@Json(name = "match") Object obj, @Json(name = "override") FormOverrideDto formOverrideDto) {
        this.match = obj;
        this.override = formOverrideDto;
    }

    public static /* synthetic */ FormDescriptorDto copy$default(FormDescriptorDto formDescriptorDto, Object obj, FormOverrideDto formOverrideDto, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = formDescriptorDto.match;
        }
        if ((i & 2) != 0) {
            formOverrideDto = formDescriptorDto.override;
        }
        return formDescriptorDto.copy(obj, formOverrideDto);
    }

    /* renamed from: component1, reason: from getter */
    public final Object getMatch() {
        return this.match;
    }

    /* renamed from: component2, reason: from getter */
    public final FormOverrideDto getOverride() {
        return this.override;
    }

    public final FormDescriptorDto copy(@Json(name = "match") Object match, @Json(name = "override") FormOverrideDto override) {
        return new FormDescriptorDto(match, override);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormDescriptorDto)) {
            return false;
        }
        FormDescriptorDto formDescriptorDto = (FormDescriptorDto) other;
        return jl40.l(this.match, formDescriptorDto.match) && jl40.l(this.override, formDescriptorDto.override);
    }

    public final Object getMatch() {
        return this.match;
    }

    public final FormOverrideDto getOverride() {
        return this.override;
    }

    public int hashCode() {
        return this.override.hashCode() + (this.match.hashCode() * 31);
    }

    public String toString() {
        return "FormDescriptorDto(match=" + this.match + ", override=" + this.override + Extension.C_BRAKE;
    }
}
