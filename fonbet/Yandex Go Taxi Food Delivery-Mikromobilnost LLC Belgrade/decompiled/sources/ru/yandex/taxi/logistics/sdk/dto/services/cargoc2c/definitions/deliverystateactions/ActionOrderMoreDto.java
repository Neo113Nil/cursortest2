package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystateactions;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J<\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOrderMoreDto;", "", "title", "", "vertical", "verticalTrap", "", "sheetExpansion", "Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOrderMoreDto$SheetExpansionDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOrderMoreDto$SheetExpansionDto;)V", "getTitle", "()Ljava/lang/String;", "getVertical", "getVerticalTrap", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSheetExpansion", "()Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOrderMoreDto$SheetExpansionDto;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOrderMoreDto$SheetExpansionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOrderMoreDto;", "equals", "other", "hashCode", "", "toString", "SheetExpansionDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionOrderMoreDto {
    private final SheetExpansionDto sheetExpansion;
    private final String title;
    private final String vertical;
    private final Boolean verticalTrap;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/deliverystateactions/ActionOrderMoreDto$SheetExpansionDto;", "", "<init>", "(Ljava/lang/String;I)V", "COLLAPSED", "EXPANDED", "ANCHORED", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SheetExpansionDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ SheetExpansionDto[] $VALUES;

        @Json(name = "collapsed")
        public static final SheetExpansionDto COLLAPSED = new SheetExpansionDto("COLLAPSED", 0);

        @Json(name = "expanded")
        public static final SheetExpansionDto EXPANDED = new SheetExpansionDto("EXPANDED", 1);

        @Json(name = "anchored")
        public static final SheetExpansionDto ANCHORED = new SheetExpansionDto("ANCHORED", 2);

        private static final /* synthetic */ SheetExpansionDto[] $values() {
            return new SheetExpansionDto[]{COLLAPSED, EXPANDED, ANCHORED};
        }

        static {
            SheetExpansionDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private SheetExpansionDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static SheetExpansionDto valueOf(String str) {
            return (SheetExpansionDto) Enum.valueOf(SheetExpansionDto.class, str);
        }

        public static SheetExpansionDto[] values() {
            return (SheetExpansionDto[]) $VALUES.clone();
        }
    }

    public ActionOrderMoreDto(@Json(name = "title") String str, @Json(name = "vertical") String str2, @Json(name = "vertical_trap") Boolean bool, @Json(name = "sheet_expansion") SheetExpansionDto sheetExpansionDto) {
        this.title = str;
        this.vertical = str2;
        this.verticalTrap = bool;
        this.sheetExpansion = sheetExpansionDto;
    }

    public static /* synthetic */ ActionOrderMoreDto copy$default(ActionOrderMoreDto actionOrderMoreDto, String str, String str2, Boolean bool, SheetExpansionDto sheetExpansionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionOrderMoreDto.title;
        }
        if ((i & 2) != 0) {
            str2 = actionOrderMoreDto.vertical;
        }
        if ((i & 4) != 0) {
            bool = actionOrderMoreDto.verticalTrap;
        }
        if ((i & 8) != 0) {
            sheetExpansionDto = actionOrderMoreDto.sheetExpansion;
        }
        return actionOrderMoreDto.copy(str, str2, bool, sheetExpansionDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVertical() {
        return this.vertical;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getVerticalTrap() {
        return this.verticalTrap;
    }

    /* renamed from: component4, reason: from getter */
    public final SheetExpansionDto getSheetExpansion() {
        return this.sheetExpansion;
    }

    public final ActionOrderMoreDto copy(@Json(name = "title") String title, @Json(name = "vertical") String vertical, @Json(name = "vertical_trap") Boolean verticalTrap, @Json(name = "sheet_expansion") SheetExpansionDto sheetExpansion) {
        return new ActionOrderMoreDto(title, vertical, verticalTrap, sheetExpansion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionOrderMoreDto)) {
            return false;
        }
        ActionOrderMoreDto actionOrderMoreDto = (ActionOrderMoreDto) other;
        return jl40.l(this.title, actionOrderMoreDto.title) && jl40.l(this.vertical, actionOrderMoreDto.vertical) && jl40.l(this.verticalTrap, actionOrderMoreDto.verticalTrap) && this.sheetExpansion == actionOrderMoreDto.sheetExpansion;
    }

    public final SheetExpansionDto getSheetExpansion() {
        return this.sheetExpansion;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getVertical() {
        return this.vertical;
    }

    public final Boolean getVerticalTrap() {
        return this.verticalTrap;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.vertical;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.verticalTrap;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        SheetExpansionDto sheetExpansionDto = this.sheetExpansion;
        return hashCode3 + (sheetExpansionDto != null ? sheetExpansionDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.vertical;
        Boolean bool = this.verticalTrap;
        SheetExpansionDto sheetExpansionDto = this.sheetExpansion;
        StringBuilder v = b64.v("ActionOrderMoreDto(title=", str, ", vertical=", str2, ", verticalTrap=");
        v.append(bool);
        v.append(", sheetExpansion=");
        v.append(sheetExpansionDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
