package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.LayoutDistributionPolicyDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto;", "", "distributionPolicy", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto;", "widget", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto;)V", "getDistributionPolicy", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/LayoutDistributionPolicyDto;", "getWidget", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "WidgetDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HorizontalStackWidgetItemDto {
    private final LayoutDistributionPolicyDto distributionPolicy;
    private final WidgetDto widget;

    public HorizontalStackWidgetItemDto(@Json(name = "distribution_policy") LayoutDistributionPolicyDto layoutDistributionPolicyDto, @Json(name = "widget") WidgetDto widgetDto) {
        this.distributionPolicy = layoutDistributionPolicyDto;
        this.widget = widgetDto;
    }

    public static /* synthetic */ HorizontalStackWidgetItemDto copy$default(HorizontalStackWidgetItemDto horizontalStackWidgetItemDto, LayoutDistributionPolicyDto layoutDistributionPolicyDto, WidgetDto widgetDto, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutDistributionPolicyDto = horizontalStackWidgetItemDto.distributionPolicy;
        }
        if ((i & 2) != 0) {
            widgetDto = horizontalStackWidgetItemDto.widget;
        }
        return horizontalStackWidgetItemDto.copy(layoutDistributionPolicyDto, widgetDto);
    }

    /* renamed from: component1, reason: from getter */
    public final LayoutDistributionPolicyDto getDistributionPolicy() {
        return this.distributionPolicy;
    }

    /* renamed from: component2, reason: from getter */
    public final WidgetDto getWidget() {
        return this.widget;
    }

    public final HorizontalStackWidgetItemDto copy(@Json(name = "distribution_policy") LayoutDistributionPolicyDto distributionPolicy, @Json(name = "widget") WidgetDto widget) {
        return new HorizontalStackWidgetItemDto(distributionPolicy, widget);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalStackWidgetItemDto)) {
            return false;
        }
        HorizontalStackWidgetItemDto horizontalStackWidgetItemDto = (HorizontalStackWidgetItemDto) other;
        return jl40.l(this.distributionPolicy, horizontalStackWidgetItemDto.distributionPolicy) && jl40.l(this.widget, horizontalStackWidgetItemDto.widget);
    }

    public final LayoutDistributionPolicyDto getDistributionPolicy() {
        return this.distributionPolicy;
    }

    public final WidgetDto getWidget() {
        return this.widget;
    }

    public int hashCode() {
        return this.widget.hashCode() + (this.distributionPolicy.hashCode() * 31);
    }

    public String toString() {
        return "HorizontalStackWidgetItemDto(distributionPolicy=" + this.distributionPolicy + ", widget=" + this.widget + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto;", "", "Widget_PaymentButtonDto", "Widget_ActionButtonDto", "Widget_AddressDetailsInputFieldDto", "Widget_TextDto", "Widget_CounterDto", "Unknown_WidgetDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Unknown_WidgetDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_ActionButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_AddressDetailsInputFieldDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_CounterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_PaymentButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_TextDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class WidgetDto {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_ActionButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ActionButtonWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ActionButtonWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ActionButtonWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_ActionButtonDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Widget_ActionButtonDto extends WidgetDto {
            public final String a;
            public final ActionButtonWidgetDto b;

            public Widget_ActionButtonDto(@Json(name = "type") String str, ActionButtonWidgetDto actionButtonWidgetDto) {
                this.a = str;
                this.b = actionButtonWidgetDto;
            }

            public final Widget_ActionButtonDto copy(@Json(name = "type") String type, ActionButtonWidgetDto value) {
                return new Widget_ActionButtonDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Widget_ActionButtonDto)) {
                    return false;
                }
                Widget_ActionButtonDto widget_ActionButtonDto = (Widget_ActionButtonDto) obj;
                return this.a.equals(widget_ActionButtonDto.a) && this.b.equals(widget_ActionButtonDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Widget_ActionButtonDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_AddressDetailsInputFieldDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsInputFieldWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsInputFieldWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsInputFieldWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_AddressDetailsInputFieldDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Widget_AddressDetailsInputFieldDto extends WidgetDto {
            public final String a;
            public final AddressDetailsInputFieldWidgetDto b;

            public Widget_AddressDetailsInputFieldDto(@Json(name = "type") String str, AddressDetailsInputFieldWidgetDto addressDetailsInputFieldWidgetDto) {
                this.a = str;
                this.b = addressDetailsInputFieldWidgetDto;
            }

            public final Widget_AddressDetailsInputFieldDto copy(@Json(name = "type") String type, AddressDetailsInputFieldWidgetDto value) {
                return new Widget_AddressDetailsInputFieldDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Widget_AddressDetailsInputFieldDto)) {
                    return false;
                }
                Widget_AddressDetailsInputFieldDto widget_AddressDetailsInputFieldDto = (Widget_AddressDetailsInputFieldDto) obj;
                return this.a.equals(widget_AddressDetailsInputFieldDto.a) && this.b.equals(widget_AddressDetailsInputFieldDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Widget_AddressDetailsInputFieldDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_CounterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CounterWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CounterWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CounterWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_CounterDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Widget_CounterDto extends WidgetDto {
            public final String a;
            public final CounterWidgetDto b;

            public Widget_CounterDto(@Json(name = "type") String str, CounterWidgetDto counterWidgetDto) {
                this.a = str;
                this.b = counterWidgetDto;
            }

            public final Widget_CounterDto copy(@Json(name = "type") String type, CounterWidgetDto value) {
                return new Widget_CounterDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Widget_CounterDto)) {
                    return false;
                }
                Widget_CounterDto widget_CounterDto = (Widget_CounterDto) obj;
                return this.a.equals(widget_CounterDto.a) && this.b.equals(widget_CounterDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Widget_CounterDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_PaymentButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PaymentButtonWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PaymentButtonWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PaymentButtonWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_PaymentButtonDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Widget_PaymentButtonDto extends WidgetDto {
            public final String a;
            public final PaymentButtonWidgetDto b;

            public Widget_PaymentButtonDto(@Json(name = "type") String str, PaymentButtonWidgetDto paymentButtonWidgetDto) {
                this.a = str;
                this.b = paymentButtonWidgetDto;
            }

            public final Widget_PaymentButtonDto copy(@Json(name = "type") String type, PaymentButtonWidgetDto value) {
                return new Widget_PaymentButtonDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Widget_PaymentButtonDto)) {
                    return false;
                }
                Widget_PaymentButtonDto widget_PaymentButtonDto = (Widget_PaymentButtonDto) obj;
                return this.a.equals(widget_PaymentButtonDto.a) && this.b.equals(widget_PaymentButtonDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Widget_PaymentButtonDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_TextDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Widget_TextDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Widget_TextDto extends WidgetDto {
            public final String a;
            public final TextWidgetDto b;

            public Widget_TextDto(@Json(name = "type") String str, TextWidgetDto textWidgetDto) {
                this.a = str;
                this.b = textWidgetDto;
            }

            public final Widget_TextDto copy(@Json(name = "type") String type, TextWidgetDto value) {
                return new Widget_TextDto(type, value);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Widget_TextDto)) {
                    return false;
                }
                Widget_TextDto widget_TextDto = (Widget_TextDto) obj;
                return this.a.equals(widget_TextDto.a) && this.b.equals(widget_TextDto.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Widget_TextDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Unknown_WidgetDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetItemDto$WidgetDto$Unknown_WidgetDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Unknown_WidgetDto extends WidgetDto {
            public final String a;

            public Unknown_WidgetDto(@Json(name = "type") String str) {
                this.a = str;
            }

            public final Unknown_WidgetDto copy(@Json(name = "type") String type) {
                return new Unknown_WidgetDto(type);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Unknown_WidgetDto) && jl40.l(this.a, ((Unknown_WidgetDto) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oyr.p("Unknown_WidgetDto(type=", this.a, Extension.C_BRAKE);
            }

            public Unknown_WidgetDto() {
                this(0);
            }

            public /* synthetic */ Unknown_WidgetDto(int i) {
                this("unknown");
            }
        }
    }
}
