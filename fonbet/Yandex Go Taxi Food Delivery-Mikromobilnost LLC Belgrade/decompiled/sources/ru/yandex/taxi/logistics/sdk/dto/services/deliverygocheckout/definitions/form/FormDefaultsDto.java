package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001\u0012\u0010\b\u0001\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0001HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\u0010\b\u0003\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormDefaultsDto;", "", "options", "photocommentKeys", "", "", "<init>", "(Ljava/lang/Object;Ljava/util/List;)V", "getOptions", "()Ljava/lang/Object;", "getPhotocommentKeys", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FormDefaultsDto {
    private final Object options;
    private final List<String> photocommentKeys;

    public FormDefaultsDto(@Json(name = "options") Object obj, @Json(name = "photocomment_keys") List<String> list) {
        this.options = obj;
        this.photocommentKeys = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FormDefaultsDto copy$default(FormDefaultsDto formDefaultsDto, Object obj, List list, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = formDefaultsDto.options;
        }
        if ((i & 2) != 0) {
            list = formDefaultsDto.photocommentKeys;
        }
        return formDefaultsDto.copy(obj, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Object getOptions() {
        return this.options;
    }

    public final List<String> component2() {
        return this.photocommentKeys;
    }

    public final FormDefaultsDto copy(@Json(name = "options") Object options, @Json(name = "photocomment_keys") List<String> photocommentKeys) {
        return new FormDefaultsDto(options, photocommentKeys);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormDefaultsDto)) {
            return false;
        }
        FormDefaultsDto formDefaultsDto = (FormDefaultsDto) other;
        return jl40.l(this.options, formDefaultsDto.options) && jl40.l(this.photocommentKeys, formDefaultsDto.photocommentKeys);
    }

    public final Object getOptions() {
        return this.options;
    }

    public final List<String> getPhotocommentKeys() {
        return this.photocommentKeys;
    }

    public int hashCode() {
        int hashCode = this.options.hashCode() * 31;
        List<String> list = this.photocommentKeys;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "FormDefaultsDto(options=" + this.options + ", photocommentKeys=" + this.photocommentKeys + Extension.C_BRAKE;
    }
}
