package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonDto;", "", "title", "", "highlighted", "", "action", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto;", "metricaLabel", "<init>", "(Ljava/lang/String;ZLru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getHighlighted", "()Z", "getAction", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonActionDto;", "getMetricaLabel", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CancelMessageButtonDto {
    private final CancelMessageButtonActionDto action;
    private final boolean highlighted;
    private final String metricaLabel;
    private final String title;

    public CancelMessageButtonDto(@Json(name = "title") String str, @Json(name = "highlighted") boolean z, @Json(name = "action") CancelMessageButtonActionDto cancelMessageButtonActionDto, @Json(name = "metrica_label") String str2) {
        this.title = str;
        this.highlighted = z;
        this.action = cancelMessageButtonActionDto;
        this.metricaLabel = str2;
    }

    public static /* synthetic */ CancelMessageButtonDto copy$default(CancelMessageButtonDto cancelMessageButtonDto, String str, boolean z, CancelMessageButtonActionDto cancelMessageButtonActionDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cancelMessageButtonDto.title;
        }
        if ((i & 2) != 0) {
            z = cancelMessageButtonDto.highlighted;
        }
        if ((i & 4) != 0) {
            cancelMessageButtonActionDto = cancelMessageButtonDto.action;
        }
        if ((i & 8) != 0) {
            str2 = cancelMessageButtonDto.metricaLabel;
        }
        return cancelMessageButtonDto.copy(str, z, cancelMessageButtonActionDto, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHighlighted() {
        return this.highlighted;
    }

    /* renamed from: component3, reason: from getter */
    public final CancelMessageButtonActionDto getAction() {
        return this.action;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final CancelMessageButtonDto copy(@Json(name = "title") String title, @Json(name = "highlighted") boolean highlighted, @Json(name = "action") CancelMessageButtonActionDto action, @Json(name = "metrica_label") String metricaLabel) {
        return new CancelMessageButtonDto(title, highlighted, action, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelMessageButtonDto)) {
            return false;
        }
        CancelMessageButtonDto cancelMessageButtonDto = (CancelMessageButtonDto) other;
        return jl40.l(this.title, cancelMessageButtonDto.title) && this.highlighted == cancelMessageButtonDto.highlighted && jl40.l(this.action, cancelMessageButtonDto.action) && jl40.l(this.metricaLabel, cancelMessageButtonDto.metricaLabel);
    }

    public final CancelMessageButtonActionDto getAction() {
        return this.action;
    }

    public final boolean getHighlighted() {
        return this.highlighted;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = (this.action.hashCode() + unr0.e(this.title.hashCode() * 31, 31, this.highlighted)) * 31;
        String str = this.metricaLabel;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.title;
        boolean z = this.highlighted;
        CancelMessageButtonActionDto cancelMessageButtonActionDto = this.action;
        String str2 = this.metricaLabel;
        StringBuilder l = oo31.l("CancelMessageButtonDto(title=", str, ", highlighted=", ", action=", z);
        l.append(cancelMessageButtonActionDto);
        l.append(", metricaLabel=");
        l.append(str2);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }

    public /* synthetic */ CancelMessageButtonDto(String str, boolean z, CancelMessageButtonActionDto cancelMessageButtonActionDto, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, cancelMessageButtonActionDto, str2);
    }
}
