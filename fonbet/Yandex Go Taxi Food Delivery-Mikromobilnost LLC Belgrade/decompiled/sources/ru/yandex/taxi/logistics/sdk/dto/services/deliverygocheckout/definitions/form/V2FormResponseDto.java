package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formtemplate.FormTemplateDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/V2FormResponseDto;", "", "descriptors", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormDescriptorDto;", "templates", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formtemplate/FormTemplateDto;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getDescriptors", "()Ljava/util/List;", "getTemplates", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class V2FormResponseDto {
    private final List<FormDescriptorDto> descriptors;
    private final List<FormTemplateDto> templates;

    public V2FormResponseDto(@Json(name = "descriptors") List<FormDescriptorDto> list, @Json(name = "templates") List<FormTemplateDto> list2) {
        this.descriptors = list;
        this.templates = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ V2FormResponseDto copy$default(V2FormResponseDto v2FormResponseDto, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = v2FormResponseDto.descriptors;
        }
        if ((i & 2) != 0) {
            list2 = v2FormResponseDto.templates;
        }
        return v2FormResponseDto.copy(list, list2);
    }

    public final List<FormDescriptorDto> component1() {
        return this.descriptors;
    }

    public final List<FormTemplateDto> component2() {
        return this.templates;
    }

    public final V2FormResponseDto copy(@Json(name = "descriptors") List<FormDescriptorDto> descriptors, @Json(name = "templates") List<FormTemplateDto> templates) {
        return new V2FormResponseDto(descriptors, templates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V2FormResponseDto)) {
            return false;
        }
        V2FormResponseDto v2FormResponseDto = (V2FormResponseDto) other;
        return jl40.l(this.descriptors, v2FormResponseDto.descriptors) && jl40.l(this.templates, v2FormResponseDto.templates);
    }

    public final List<FormDescriptorDto> getDescriptors() {
        return this.descriptors;
    }

    public final List<FormTemplateDto> getTemplates() {
        return this.templates;
    }

    public int hashCode() {
        int hashCode = this.descriptors.hashCode() * 31;
        List<FormTemplateDto> list = this.templates;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return xvz.l("V2FormResponseDto(descriptors=", this.descriptors, ", templates=", this.templates, Extension.C_BRAKE);
    }
}
