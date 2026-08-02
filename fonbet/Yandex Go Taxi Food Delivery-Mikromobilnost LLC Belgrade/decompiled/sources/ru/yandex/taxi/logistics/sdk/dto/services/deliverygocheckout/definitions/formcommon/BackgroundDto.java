package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundDto;", "", "content", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/BackgroundContentDto;", "paddings", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "<init>", "(Ljava/util/List;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;)V", "getContent", "()Ljava/util/List;", "getPaddings", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/PaddingsDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class BackgroundDto {
    private final List<BackgroundContentDto> content;
    private final PaddingsDto paddings;

    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundDto(@Json(name = "content") List<? extends BackgroundContentDto> list, @Json(name = "paddings") PaddingsDto paddingsDto) {
        this.content = list;
        this.paddings = paddingsDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BackgroundDto copy$default(BackgroundDto backgroundDto, List list, PaddingsDto paddingsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = backgroundDto.content;
        }
        if ((i & 2) != 0) {
            paddingsDto = backgroundDto.paddings;
        }
        return backgroundDto.copy(list, paddingsDto);
    }

    public final List<BackgroundContentDto> component1() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    public final BackgroundDto copy(@Json(name = "content") List<? extends BackgroundContentDto> content, @Json(name = "paddings") PaddingsDto paddings) {
        return new BackgroundDto(content, paddings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackgroundDto)) {
            return false;
        }
        BackgroundDto backgroundDto = (BackgroundDto) other;
        return jl40.l(this.content, backgroundDto.content) && jl40.l(this.paddings, backgroundDto.paddings);
    }

    public final List<BackgroundContentDto> getContent() {
        return this.content;
    }

    public final PaddingsDto getPaddings() {
        return this.paddings;
    }

    public int hashCode() {
        int hashCode = this.content.hashCode() * 31;
        PaddingsDto paddingsDto = this.paddings;
        return hashCode + (paddingsDto == null ? 0 : paddingsDto.hashCode());
    }

    public String toString() {
        return "BackgroundDto(content=" + this.content + ", paddings=" + this.paddings + Extension.C_BRAKE;
    }
}
