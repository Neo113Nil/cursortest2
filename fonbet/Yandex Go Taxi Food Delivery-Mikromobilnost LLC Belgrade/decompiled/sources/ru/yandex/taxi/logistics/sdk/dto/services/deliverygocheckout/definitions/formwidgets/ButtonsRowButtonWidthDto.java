package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto;", "", "ButtonsRowButtonWidth_PercentDto", "ButtonsRowButtonWidth_ConstDto", "ButtonsRowButtonWidth_WrapDto", "ButtonsRowButtonWidth_FillDto", "Unknown_ButtonsRowButtonWidthDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$ButtonsRowButtonWidth_ConstDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$ButtonsRowButtonWidth_FillDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$ButtonsRowButtonWidth_PercentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$ButtonsRowButtonWidth_WrapDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$Unknown_ButtonsRowButtonWidthDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ButtonsRowButtonWidthDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$ButtonsRowButtonWidth_ConstDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonWidthConstValueDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonWidthConstValueDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonWidthConstValueDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$ButtonsRowButtonWidth_ConstDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonsRowButtonWidth_ConstDto extends ButtonsRowButtonWidthDto {
        public final String a;
        public final ButtonWidthConstValueDto b;

        public ButtonsRowButtonWidth_ConstDto(@Json(name = "type") String str, ButtonWidthConstValueDto buttonWidthConstValueDto) {
            this.a = str;
            this.b = buttonWidthConstValueDto;
        }

        public final ButtonsRowButtonWidth_ConstDto copy(@Json(name = "type") String type, ButtonWidthConstValueDto value) {
            return new ButtonsRowButtonWidth_ConstDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonsRowButtonWidth_ConstDto)) {
                return false;
            }
            ButtonsRowButtonWidth_ConstDto buttonsRowButtonWidth_ConstDto = (ButtonsRowButtonWidth_ConstDto) obj;
            return this.a.equals(buttonsRowButtonWidth_ConstDto.a) && this.b.equals(buttonsRowButtonWidth_ConstDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ButtonsRowButtonWidth_ConstDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$ButtonsRowButtonWidth_FillDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonWidthFillDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonWidthFillDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonWidthFillDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$ButtonsRowButtonWidth_FillDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonsRowButtonWidth_FillDto extends ButtonsRowButtonWidthDto {
        public final String a;
        public final ButtonWidthFillDto b;

        public ButtonsRowButtonWidth_FillDto(@Json(name = "type") String str, ButtonWidthFillDto buttonWidthFillDto) {
            this.a = str;
            this.b = buttonWidthFillDto;
        }

        public final ButtonsRowButtonWidth_FillDto copy(@Json(name = "type") String type, ButtonWidthFillDto value) {
            return new ButtonsRowButtonWidth_FillDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ButtonsRowButtonWidth_FillDto) {
                ButtonsRowButtonWidth_FillDto buttonsRowButtonWidth_FillDto = (ButtonsRowButtonWidth_FillDto) obj;
                return this.a.equals(buttonsRowButtonWidth_FillDto.a) && this.b == buttonsRowButtonWidth_FillDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ButtonsRowButtonWidth_FillDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$ButtonsRowButtonWidth_PercentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonWidthPercentDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonWidthPercentDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonWidthPercentDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$ButtonsRowButtonWidth_PercentDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonsRowButtonWidth_PercentDto extends ButtonsRowButtonWidthDto {
        public final String a;
        public final ButtonWidthPercentDto b;

        public ButtonsRowButtonWidth_PercentDto(@Json(name = "type") String str, ButtonWidthPercentDto buttonWidthPercentDto) {
            this.a = str;
            this.b = buttonWidthPercentDto;
        }

        public final ButtonsRowButtonWidth_PercentDto copy(@Json(name = "type") String type, ButtonWidthPercentDto value) {
            return new ButtonsRowButtonWidth_PercentDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonsRowButtonWidth_PercentDto)) {
                return false;
            }
            ButtonsRowButtonWidth_PercentDto buttonsRowButtonWidth_PercentDto = (ButtonsRowButtonWidth_PercentDto) obj;
            return this.a.equals(buttonsRowButtonWidth_PercentDto.a) && this.b.equals(buttonsRowButtonWidth_PercentDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ButtonsRowButtonWidth_PercentDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$ButtonsRowButtonWidth_WrapDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonWidthWrapDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonWidthWrapDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonWidthWrapDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$ButtonsRowButtonWidth_WrapDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonsRowButtonWidth_WrapDto extends ButtonsRowButtonWidthDto {
        public final String a;
        public final ButtonWidthWrapDto b;

        public ButtonsRowButtonWidth_WrapDto(@Json(name = "type") String str, ButtonWidthWrapDto buttonWidthWrapDto) {
            this.a = str;
            this.b = buttonWidthWrapDto;
        }

        public final ButtonsRowButtonWidth_WrapDto copy(@Json(name = "type") String type, ButtonWidthWrapDto value) {
            return new ButtonsRowButtonWidth_WrapDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ButtonsRowButtonWidth_WrapDto) {
                ButtonsRowButtonWidth_WrapDto buttonsRowButtonWidth_WrapDto = (ButtonsRowButtonWidth_WrapDto) obj;
                return this.a.equals(buttonsRowButtonWidth_WrapDto.a) && this.b == buttonsRowButtonWidth_WrapDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ButtonsRowButtonWidth_WrapDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$Unknown_ButtonsRowButtonWidthDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowButtonWidthDto$Unknown_ButtonsRowButtonWidthDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_ButtonsRowButtonWidthDto extends ButtonsRowButtonWidthDto {
        public final String a;

        public Unknown_ButtonsRowButtonWidthDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_ButtonsRowButtonWidthDto copy(@Json(name = "type") String type) {
            return new Unknown_ButtonsRowButtonWidthDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_ButtonsRowButtonWidthDto) && jl40.l(this.a, ((Unknown_ButtonsRowButtonWidthDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_ButtonsRowButtonWidthDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_ButtonsRowButtonWidthDto() {
            this(0);
        }

        public /* synthetic */ Unknown_ButtonsRowButtonWidthDto(int i) {
            this("unknown");
        }
    }
}
