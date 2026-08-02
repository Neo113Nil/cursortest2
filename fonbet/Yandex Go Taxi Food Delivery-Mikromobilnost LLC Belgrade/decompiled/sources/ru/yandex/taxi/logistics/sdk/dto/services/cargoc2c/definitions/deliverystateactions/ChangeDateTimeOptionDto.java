package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ChangeDateTimeOptionDto;", "", MetaDataField.DATE_FIELD, "", "timeslots", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/TimeslotDto;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getDate", "()Ljava/lang/String;", "getTimeslots", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ChangeDateTimeOptionDto {
    private final String date;
    private final List<TimeslotDto> timeslots;

    public ChangeDateTimeOptionDto(@Json(name = "date") String str, @Json(name = "timeslots") List<TimeslotDto> list) {
        this.date = str;
        this.timeslots = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeDateTimeOptionDto copy$default(ChangeDateTimeOptionDto changeDateTimeOptionDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changeDateTimeOptionDto.date;
        }
        if ((i & 2) != 0) {
            list = changeDateTimeOptionDto.timeslots;
        }
        return changeDateTimeOptionDto.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final List<TimeslotDto> component2() {
        return this.timeslots;
    }

    public final ChangeDateTimeOptionDto copy(@Json(name = "date") String date, @Json(name = "timeslots") List<TimeslotDto> timeslots) {
        return new ChangeDateTimeOptionDto(date, timeslots);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeDateTimeOptionDto)) {
            return false;
        }
        ChangeDateTimeOptionDto changeDateTimeOptionDto = (ChangeDateTimeOptionDto) other;
        return jl40.l(this.date, changeDateTimeOptionDto.date) && jl40.l(this.timeslots, changeDateTimeOptionDto.timeslots);
    }

    public final String getDate() {
        return this.date;
    }

    public final List<TimeslotDto> getTimeslots() {
        return this.timeslots;
    }

    public int hashCode() {
        return this.timeslots.hashCode() + (this.date.hashCode() * 31);
    }

    public String toString() {
        return nnm.h("ChangeDateTimeOptionDto(date=", this.date, ", timeslots=", Extension.C_BRAKE, this.timeslots);
    }
}
