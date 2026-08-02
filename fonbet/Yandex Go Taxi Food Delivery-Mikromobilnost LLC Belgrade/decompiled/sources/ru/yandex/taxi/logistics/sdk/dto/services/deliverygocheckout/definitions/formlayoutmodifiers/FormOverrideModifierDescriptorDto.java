package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formlayoutmodifiers;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\b\u0001\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\r\u001a\u00060\u0001j\u0002`\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\f\b\u0003\u0010\u0002\u001a\u00060\u0001j\u0002`\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormOverrideModifierDescriptorDto;", "", "match", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/FormStateMatchDto;", "modifiers", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormLayoutModifierDto;", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "getMatch", "()Ljava/lang/Object;", "getModifiers", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormOverrideModifierDescriptorDto {
    private final Object match;
    private final List<FormLayoutModifierDto> modifiers;

    /* JADX WARN: Multi-variable type inference failed */
    public FormOverrideModifierDescriptorDto(@Json(name = "match") Object obj, @Json(name = "modifiers") List<? extends FormLayoutModifierDto> list) {
        this.match = obj;
        this.modifiers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormOverrideModifierDescriptorDto copy$default(FormOverrideModifierDescriptorDto formOverrideModifierDescriptorDto, Object obj, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = formOverrideModifierDescriptorDto.match;
        }
        if ((i & 2) != 0) {
            list = formOverrideModifierDescriptorDto.modifiers;
        }
        return formOverrideModifierDescriptorDto.copy(obj, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Object getMatch() {
        return this.match;
    }

    public final List<FormLayoutModifierDto> component2() {
        return this.modifiers;
    }

    public final FormOverrideModifierDescriptorDto copy(@Json(name = "match") Object match, @Json(name = "modifiers") List<? extends FormLayoutModifierDto> modifiers) {
        return new FormOverrideModifierDescriptorDto(match, modifiers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormOverrideModifierDescriptorDto)) {
            return false;
        }
        FormOverrideModifierDescriptorDto formOverrideModifierDescriptorDto = (FormOverrideModifierDescriptorDto) other;
        return jl40.l(this.match, formOverrideModifierDescriptorDto.match) && jl40.l(this.modifiers, formOverrideModifierDescriptorDto.modifiers);
    }

    public final Object getMatch() {
        return this.match;
    }

    public final List<FormLayoutModifierDto> getModifiers() {
        return this.modifiers;
    }

    public int hashCode() {
        return this.modifiers.hashCode() + (this.match.hashCode() * 31);
    }

    public String toString() {
        return "FormOverrideModifierDescriptorDto(match=" + this.match + ", modifiers=" + this.modifiers + Extension.C_BRAKE;
    }
}
