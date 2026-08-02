package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.n;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageV2Dto;", "", "title", "", "body", "buttons", "", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/CancelMessageButtonDto;", "metricaLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "getButtons", "()Ljava/util/List;", "getMetricaLabel", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CancelMessageV2Dto {
    private final String body;
    private final List<CancelMessageButtonDto> buttons;
    private final String metricaLabel;
    private final String title;

    public CancelMessageV2Dto(@Json(name = "title") String str, @Json(name = "body") String str2, @Json(name = "buttons") List<CancelMessageButtonDto> list, @Json(name = "metrica_label") String str3) {
        this.title = str;
        this.body = str2;
        this.buttons = list;
        this.metricaLabel = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CancelMessageV2Dto copy$default(CancelMessageV2Dto cancelMessageV2Dto, String str, String str2, List list, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cancelMessageV2Dto.title;
        }
        if ((i & 2) != 0) {
            str2 = cancelMessageV2Dto.body;
        }
        if ((i & 4) != 0) {
            list = cancelMessageV2Dto.buttons;
        }
        if ((i & 8) != 0) {
            str3 = cancelMessageV2Dto.metricaLabel;
        }
        return cancelMessageV2Dto.copy(str, str2, list, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final List<CancelMessageButtonDto> component3() {
        return this.buttons;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final CancelMessageV2Dto copy(@Json(name = "title") String title, @Json(name = "body") String body, @Json(name = "buttons") List<CancelMessageButtonDto> buttons, @Json(name = "metrica_label") String metricaLabel) {
        return new CancelMessageV2Dto(title, body, buttons, metricaLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelMessageV2Dto)) {
            return false;
        }
        CancelMessageV2Dto cancelMessageV2Dto = (CancelMessageV2Dto) other;
        return jl40.l(this.title, cancelMessageV2Dto.title) && jl40.l(this.body, cancelMessageV2Dto.body) && jl40.l(this.buttons, cancelMessageV2Dto.buttons) && jl40.l(this.metricaLabel, cancelMessageV2Dto.metricaLabel);
    }

    public final String getBody() {
        return this.body;
    }

    public final List<CancelMessageButtonDto> getButtons() {
        return this.buttons;
    }

    public final String getMetricaLabel() {
        return this.metricaLabel;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.body;
        int c = unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.buttons);
        String str2 = this.metricaLabel;
        return c + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        return n.l(", metricaLabel=", this.metricaLabel, Extension.C_BRAKE, b64.v("CancelMessageV2Dto(title=", str, ", body=", str2, ", buttons="), this.buttons);
    }
}
