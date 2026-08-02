package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDigitsInputTypeDto;", "", "currencySymbol", "", "currencySymbolAnchor", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDigitsInputTypeDto$CurrencySymbolAnchorDto;", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDigitsInputTypeDto$CurrencySymbolAnchorDto;)V", "getCurrencySymbol", "()Ljava/lang/String;", "getCurrencySymbolAnchor", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDigitsInputTypeDto$CurrencySymbolAnchorDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "CurrencySymbolAnchorDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CostDigitsInputTypeDto {
    private final String currencySymbol;
    private final CurrencySymbolAnchorDto currencySymbolAnchor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDigitsInputTypeDto$CurrencySymbolAnchorDto;", "", "<init>", "(Ljava/lang/String;I)V", "TRAILING", "LEADING", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CurrencySymbolAnchorDto {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ CurrencySymbolAnchorDto[] $VALUES;

        @Json(name = "trailing")
        public static final CurrencySymbolAnchorDto TRAILING = new CurrencySymbolAnchorDto("TRAILING", 0);

        @Json(name = "leading")
        public static final CurrencySymbolAnchorDto LEADING = new CurrencySymbolAnchorDto("LEADING", 1);

        private static final /* synthetic */ CurrencySymbolAnchorDto[] $values() {
            return new CurrencySymbolAnchorDto[]{TRAILING, LEADING};
        }

        static {
            CurrencySymbolAnchorDto[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CurrencySymbolAnchorDto(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static CurrencySymbolAnchorDto valueOf(String str) {
            return (CurrencySymbolAnchorDto) Enum.valueOf(CurrencySymbolAnchorDto.class, str);
        }

        public static CurrencySymbolAnchorDto[] values() {
            return (CurrencySymbolAnchorDto[]) $VALUES.clone();
        }
    }

    public /* synthetic */ CostDigitsInputTypeDto(String str, CurrencySymbolAnchorDto currencySymbolAnchorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CurrencySymbolAnchorDto.TRAILING : currencySymbolAnchorDto);
    }

    public static /* synthetic */ CostDigitsInputTypeDto copy$default(CostDigitsInputTypeDto costDigitsInputTypeDto, String str, CurrencySymbolAnchorDto currencySymbolAnchorDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = costDigitsInputTypeDto.currencySymbol;
        }
        if ((i & 2) != 0) {
            currencySymbolAnchorDto = costDigitsInputTypeDto.currencySymbolAnchor;
        }
        return costDigitsInputTypeDto.copy(str, currencySymbolAnchorDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* renamed from: component2, reason: from getter */
    public final CurrencySymbolAnchorDto getCurrencySymbolAnchor() {
        return this.currencySymbolAnchor;
    }

    public final CostDigitsInputTypeDto copy(@Json(name = "currency_symbol") String currencySymbol, @Json(name = "currency_symbol_anchor") CurrencySymbolAnchorDto currencySymbolAnchor) {
        return new CostDigitsInputTypeDto(currencySymbol, currencySymbolAnchor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CostDigitsInputTypeDto)) {
            return false;
        }
        CostDigitsInputTypeDto costDigitsInputTypeDto = (CostDigitsInputTypeDto) other;
        return jl40.l(this.currencySymbol, costDigitsInputTypeDto.currencySymbol) && this.currencySymbolAnchor == costDigitsInputTypeDto.currencySymbolAnchor;
    }

    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public final CurrencySymbolAnchorDto getCurrencySymbolAnchor() {
        return this.currencySymbolAnchor;
    }

    public int hashCode() {
        String str = this.currencySymbol;
        return this.currencySymbolAnchor.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return "CostDigitsInputTypeDto(currencySymbol=" + this.currencySymbol + ", currencySymbolAnchor=" + this.currencySymbolAnchor + Extension.C_BRAKE;
    }

    public CostDigitsInputTypeDto(@Json(name = "currency_symbol") String str, @Json(name = "currency_symbol_anchor") CurrencySymbolAnchorDto currencySymbolAnchorDto) {
        this.currencySymbol = str;
        this.currencySymbolAnchor = currencySymbolAnchorDto;
    }
}
