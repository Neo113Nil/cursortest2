package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/CompositeTapActionDto;", "", "actions", "", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgetsactions/TapActionDto;", "<init>", "(Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CompositeTapActionDto {
    private final List<TapActionDto> actions;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeTapActionDto(@Json(name = "actions") List<? extends TapActionDto> list) {
        this.actions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompositeTapActionDto copy$default(CompositeTapActionDto compositeTapActionDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = compositeTapActionDto.actions;
        }
        return compositeTapActionDto.copy(list);
    }

    public final List<TapActionDto> component1() {
        return this.actions;
    }

    public final CompositeTapActionDto copy(@Json(name = "actions") List<? extends TapActionDto> actions) {
        return new CompositeTapActionDto(actions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CompositeTapActionDto) && jl40.l(this.actions, ((CompositeTapActionDto) other).actions);
    }

    public final List<TapActionDto> getActions() {
        return this.actions;
    }

    public int hashCode() {
        return this.actions.hashCode();
    }

    public String toString() {
        return tse0.k("CompositeTapActionDto(actions=", Extension.C_BRAKE, this.actions);
    }
}
