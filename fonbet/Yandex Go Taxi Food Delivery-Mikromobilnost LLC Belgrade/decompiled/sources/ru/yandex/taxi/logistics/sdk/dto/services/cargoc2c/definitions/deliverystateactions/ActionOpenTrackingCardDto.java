package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenTrackingCardDto;", "", "title", "", "expansion", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenTrackingCardDto$ExpansionDto;", "deliveryId", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenTrackingCardDto$ExpansionDto;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getExpansion", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenTrackingCardDto$ExpansionDto;", "getDeliveryId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ExpansionDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionOpenTrackingCardDto {
    private final String deliveryId;
    private final ExpansionDto expansion;
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOpenTrackingCardDto$ExpansionDto;", "", "<init>", "(Ljava/lang/String;I)V", "EXPANDED", "COLLAPSED", "ANCHORED", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ExpansionDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ExpansionDto[] $VALUES;

        @Json(name = "expanded")
        public static final ExpansionDto EXPANDED = new ExpansionDto("EXPANDED", 0);

        @Json(name = "collapsed")
        public static final ExpansionDto COLLAPSED = new ExpansionDto("COLLAPSED", 1);

        @Json(name = "anchored")
        public static final ExpansionDto ANCHORED = new ExpansionDto("ANCHORED", 2);

        private static final /* synthetic */ ExpansionDto[] $values() {
            return new ExpansionDto[]{EXPANDED, COLLAPSED, ANCHORED};
        }

        static {
            ExpansionDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private ExpansionDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static ExpansionDto valueOf(String str) {
            return (ExpansionDto) Enum.valueOf(ExpansionDto.class, str);
        }

        public static ExpansionDto[] values() {
            return (ExpansionDto[]) $VALUES.clone();
        }
    }

    public ActionOpenTrackingCardDto(@Json(name = "title") String str, @Json(name = "expansion") ExpansionDto expansionDto, @Json(name = "delivery_id") String str2) {
        this.title = str;
        this.expansion = expansionDto;
        this.deliveryId = str2;
    }

    public static /* synthetic */ ActionOpenTrackingCardDto copy$default(ActionOpenTrackingCardDto actionOpenTrackingCardDto, String str, ExpansionDto expansionDto, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionOpenTrackingCardDto.title;
        }
        if ((i & 2) != 0) {
            expansionDto = actionOpenTrackingCardDto.expansion;
        }
        if ((i & 4) != 0) {
            str2 = actionOpenTrackingCardDto.deliveryId;
        }
        return actionOpenTrackingCardDto.copy(str, expansionDto, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final ExpansionDto getExpansion() {
        return this.expansion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final ActionOpenTrackingCardDto copy(@Json(name = "title") String title, @Json(name = "expansion") ExpansionDto expansion, @Json(name = "delivery_id") String deliveryId) {
        return new ActionOpenTrackingCardDto(title, expansion, deliveryId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionOpenTrackingCardDto)) {
            return false;
        }
        ActionOpenTrackingCardDto actionOpenTrackingCardDto = (ActionOpenTrackingCardDto) other;
        return jl40.l(this.title, actionOpenTrackingCardDto.title) && this.expansion == actionOpenTrackingCardDto.expansion && jl40.l(this.deliveryId, actionOpenTrackingCardDto.deliveryId);
    }

    public final String getDeliveryId() {
        return this.deliveryId;
    }

    public final ExpansionDto getExpansion() {
        return this.expansion;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        ExpansionDto expansionDto = this.expansion;
        return this.deliveryId.hashCode() + ((hashCode + (expansionDto == null ? 0 : expansionDto.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        ExpansionDto expansionDto = this.expansion;
        String str2 = this.deliveryId;
        StringBuilder sb = new StringBuilder("ActionOpenTrackingCardDto(title=");
        sb.append(str);
        sb.append(", expansion=");
        sb.append(expansionDto);
        sb.append(", deliveryId=");
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
