package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.clientdashboard;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto;", "", "TileFooter_TariffTileFooterDto", "TileFooter_OptionTileFooterDto", "TileFooter_PromoTileFooterDto", "TileFooter_QuantityGraphTileFooterDto", "TileFooter_AttributedTextTileFooterDto", "TileFooter_ProgressTileFooterDto", "TileFooter_ButtonTileFooterDto", "Unknown_TileFooterDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_AttributedTextTileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_ButtonTileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_OptionTileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_ProgressTileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_PromoTileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_QuantityGraphTileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_TariffTileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$Unknown_TileFooterDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class TileFooterDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_AttributedTextTileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AttributedTextTileFooterDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AttributedTextTileFooterDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/AttributedTextTileFooterDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_AttributedTextTileFooterDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileFooter_AttributedTextTileFooterDto extends TileFooterDto {
        public final String a;
        public final AttributedTextTileFooterDto b;

        public TileFooter_AttributedTextTileFooterDto(@Json(name = "type") String str, AttributedTextTileFooterDto attributedTextTileFooterDto) {
            this.a = str;
            this.b = attributedTextTileFooterDto;
        }

        public final TileFooter_AttributedTextTileFooterDto copy(@Json(name = "type") String type, AttributedTextTileFooterDto value) {
            return new TileFooter_AttributedTextTileFooterDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TileFooter_AttributedTextTileFooterDto)) {
                return false;
            }
            TileFooter_AttributedTextTileFooterDto tileFooter_AttributedTextTileFooterDto = (TileFooter_AttributedTextTileFooterDto) obj;
            return this.a.equals(tileFooter_AttributedTextTileFooterDto.a) && this.b.equals(tileFooter_AttributedTextTileFooterDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TileFooter_AttributedTextTileFooterDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_ButtonTileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ButtonTileFooterDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ButtonTileFooterDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ButtonTileFooterDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_ButtonTileFooterDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileFooter_ButtonTileFooterDto extends TileFooterDto {
        public final String a;
        public final ButtonTileFooterDto b;

        public TileFooter_ButtonTileFooterDto(@Json(name = "type") String str, ButtonTileFooterDto buttonTileFooterDto) {
            this.a = str;
            this.b = buttonTileFooterDto;
        }

        public final TileFooter_ButtonTileFooterDto copy(@Json(name = "type") String type, ButtonTileFooterDto value) {
            return new TileFooter_ButtonTileFooterDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TileFooter_ButtonTileFooterDto)) {
                return false;
            }
            TileFooter_ButtonTileFooterDto tileFooter_ButtonTileFooterDto = (TileFooter_ButtonTileFooterDto) obj;
            return this.a.equals(tileFooter_ButtonTileFooterDto.a) && this.b.equals(tileFooter_ButtonTileFooterDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TileFooter_ButtonTileFooterDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_OptionTileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/OptionTileFooterDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/OptionTileFooterDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/OptionTileFooterDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_OptionTileFooterDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileFooter_OptionTileFooterDto extends TileFooterDto {
        public final String a;
        public final OptionTileFooterDto b;

        public TileFooter_OptionTileFooterDto(@Json(name = "type") String str, OptionTileFooterDto optionTileFooterDto) {
            this.a = str;
            this.b = optionTileFooterDto;
        }

        public final TileFooter_OptionTileFooterDto copy(@Json(name = "type") String type, OptionTileFooterDto value) {
            return new TileFooter_OptionTileFooterDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TileFooter_OptionTileFooterDto)) {
                return false;
            }
            TileFooter_OptionTileFooterDto tileFooter_OptionTileFooterDto = (TileFooter_OptionTileFooterDto) obj;
            return this.a.equals(tileFooter_OptionTileFooterDto.a) && this.b.equals(tileFooter_OptionTileFooterDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TileFooter_OptionTileFooterDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_ProgressTileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ProgressTileFooterDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ProgressTileFooterDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/ProgressTileFooterDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_ProgressTileFooterDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileFooter_ProgressTileFooterDto extends TileFooterDto {
        public final String a;
        public final ProgressTileFooterDto b;

        public TileFooter_ProgressTileFooterDto(@Json(name = "type") String str, ProgressTileFooterDto progressTileFooterDto) {
            this.a = str;
            this.b = progressTileFooterDto;
        }

        public final TileFooter_ProgressTileFooterDto copy(@Json(name = "type") String type, ProgressTileFooterDto value) {
            return new TileFooter_ProgressTileFooterDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TileFooter_ProgressTileFooterDto)) {
                return false;
            }
            TileFooter_ProgressTileFooterDto tileFooter_ProgressTileFooterDto = (TileFooter_ProgressTileFooterDto) obj;
            return this.a.equals(tileFooter_ProgressTileFooterDto.a) && this.b.equals(tileFooter_ProgressTileFooterDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TileFooter_ProgressTileFooterDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_PromoTileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/PromoTileFooterDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/PromoTileFooterDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/PromoTileFooterDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_PromoTileFooterDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileFooter_PromoTileFooterDto extends TileFooterDto {
        public final String a;
        public final PromoTileFooterDto b;

        public TileFooter_PromoTileFooterDto(@Json(name = "type") String str, PromoTileFooterDto promoTileFooterDto) {
            this.a = str;
            this.b = promoTileFooterDto;
        }

        public final TileFooter_PromoTileFooterDto copy(@Json(name = "type") String type, PromoTileFooterDto value) {
            return new TileFooter_PromoTileFooterDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TileFooter_PromoTileFooterDto)) {
                return false;
            }
            TileFooter_PromoTileFooterDto tileFooter_PromoTileFooterDto = (TileFooter_PromoTileFooterDto) obj;
            return this.a.equals(tileFooter_PromoTileFooterDto.a) && this.b.equals(tileFooter_PromoTileFooterDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TileFooter_PromoTileFooterDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_QuantityGraphTileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/QuantityGraphTileFooterDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/QuantityGraphTileFooterDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/QuantityGraphTileFooterDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_QuantityGraphTileFooterDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileFooter_QuantityGraphTileFooterDto extends TileFooterDto {
        public final String a;
        public final QuantityGraphTileFooterDto b;

        public TileFooter_QuantityGraphTileFooterDto(@Json(name = "type") String str, QuantityGraphTileFooterDto quantityGraphTileFooterDto) {
            this.a = str;
            this.b = quantityGraphTileFooterDto;
        }

        public final TileFooter_QuantityGraphTileFooterDto copy(@Json(name = "type") String type, QuantityGraphTileFooterDto value) {
            return new TileFooter_QuantityGraphTileFooterDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TileFooter_QuantityGraphTileFooterDto)) {
                return false;
            }
            TileFooter_QuantityGraphTileFooterDto tileFooter_QuantityGraphTileFooterDto = (TileFooter_QuantityGraphTileFooterDto) obj;
            return this.a.equals(tileFooter_QuantityGraphTileFooterDto.a) && this.b.equals(tileFooter_QuantityGraphTileFooterDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TileFooter_QuantityGraphTileFooterDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_TariffTileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TariffTileFooterDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TariffTileFooterDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TariffTileFooterDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$TileFooter_TariffTileFooterDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileFooter_TariffTileFooterDto extends TileFooterDto {
        public final String a;
        public final TariffTileFooterDto b;

        public TileFooter_TariffTileFooterDto(@Json(name = "type") String str, TariffTileFooterDto tariffTileFooterDto) {
            this.a = str;
            this.b = tariffTileFooterDto;
        }

        public final TileFooter_TariffTileFooterDto copy(@Json(name = "type") String type, TariffTileFooterDto value) {
            return new TileFooter_TariffTileFooterDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TileFooter_TariffTileFooterDto)) {
                return false;
            }
            TileFooter_TariffTileFooterDto tileFooter_TariffTileFooterDto = (TileFooter_TariffTileFooterDto) obj;
            return this.a.equals(tileFooter_TariffTileFooterDto.a) && this.b.equals(tileFooter_TariffTileFooterDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TileFooter_TariffTileFooterDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$Unknown_TileFooterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/clientdashboard/TileFooterDto$Unknown_TileFooterDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_TileFooterDto extends TileFooterDto {
        public final String a;

        public Unknown_TileFooterDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_TileFooterDto copy(@Json(name = "type") String type) {
            return new Unknown_TileFooterDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_TileFooterDto) && jl40.l(this.a, ((Unknown_TileFooterDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_TileFooterDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_TileFooterDto() {
            this(0);
        }

        public /* synthetic */ Unknown_TileFooterDto(int i) {
            this("unknown");
        }
    }
}
