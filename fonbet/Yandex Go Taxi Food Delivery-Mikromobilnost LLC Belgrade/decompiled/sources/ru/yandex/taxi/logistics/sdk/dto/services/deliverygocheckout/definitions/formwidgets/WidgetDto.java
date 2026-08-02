package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:.\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./\u0082\u0001.0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]¨\u0006^"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "Widget_BubbleTogglesDto", "Widget_HeaderDto", "Widget_FlatHeaderDto", "Widget_SegmentDto", "Widget_CounterDto", "Widget_TagLineDto", "Widget_ImageDto", "Widget_SlotDto", "Widget_NotificationDto", "Widget_DividerDto", "Widget_AddressDto", "Widget_AddressDetailsInputFieldDto", "Widget_MiniMapDto", "Widget_ContactDto", "Widget_PaymentMethodDto", "Widget_ActionButtonDto", "Widget_BannerCarouselDto", "Widget_DiscountDto", "Widget_CostDetailDto", "Widget_SelectorDto", "Widget_TabsDto", "Widget_TextDto", "Widget_NumericInputDto", "Widget_TextInputDto", "Widget_ScrollableItemsDto", "Widget_GridLayoutDto", "Widget_FieldDisplayDto", "Widget_MultiAddressDto", "Widget_EditableRouteWidgetsDto", "Widget_UploadedImagesPreviewDto", "Widget_ScenarioSelectorDto", "Widget_InputCircleDto", "Widget_ButtonsRowDto", "Widget_PickerDto", "Widget_VerticalStackDto", "Widget_HorizontalStackDto", "Widget_ScalableSelectorDto", "Widget_LoadingSpinnerDto", "Widget_ProgressDto", "Widget_TemplateDto", "Widget_DigitsInputDto", "Widget_CartDto", "Widget_SliderButtonDto", "Widget_CarouselItemsDto", "Widget_ShortcutDto", "Unknown_WidgetDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Unknown_WidgetDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ActionButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_AddressDetailsInputFieldDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_AddressDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_BannerCarouselDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_BubbleTogglesDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ButtonsRowDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_CarouselItemsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_CartDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ContactDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_CostDetailDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_CounterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_DigitsInputDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_DiscountDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_DividerDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_EditableRouteWidgetsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_FieldDisplayDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_FlatHeaderDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_GridLayoutDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_HeaderDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_HorizontalStackDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ImageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_InputCircleDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_LoadingSpinnerDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_MiniMapDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_MultiAddressDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_NotificationDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_NumericInputDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_PaymentMethodDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_PickerDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ProgressDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ScalableSelectorDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ScenarioSelectorDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ScrollableItemsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_SegmentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_SelectorDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ShortcutDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_SliderButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_SlotDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TabsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TagLineDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TemplateDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TextDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TextInputDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_UploadedImagesPreviewDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_VerticalStackDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class WidgetDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ActionButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ActionButtonWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ActionButtonWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ActionButtonWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ActionButtonDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_AddressDetailsInputFieldDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsInputFieldWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsInputFieldWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressDetailsInputFieldWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_AddressDetailsInputFieldDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_AddressDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/AddressWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_AddressDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_AddressDto extends WidgetDto {
        public final String a;
        public final AddressWidgetDto b;

        public Widget_AddressDto(@Json(name = "type") String str, AddressWidgetDto addressWidgetDto) {
            this.a = str;
            this.b = addressWidgetDto;
        }

        public final Widget_AddressDto copy(@Json(name = "type") String type, AddressWidgetDto value) {
            return new Widget_AddressDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_AddressDto)) {
                return false;
            }
            Widget_AddressDto widget_AddressDto = (Widget_AddressDto) obj;
            return this.a.equals(widget_AddressDto.a) && this.b.equals(widget_AddressDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_AddressDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_BannerCarouselDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BannerCarouselDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BannerCarouselDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BannerCarouselDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_BannerCarouselDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_BannerCarouselDto extends WidgetDto {
        public final String a;
        public final BannerCarouselDto b;

        public Widget_BannerCarouselDto(@Json(name = "type") String str, BannerCarouselDto bannerCarouselDto) {
            this.a = str;
            this.b = bannerCarouselDto;
        }

        public final Widget_BannerCarouselDto copy(@Json(name = "type") String type, BannerCarouselDto value) {
            return new Widget_BannerCarouselDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_BannerCarouselDto)) {
                return false;
            }
            Widget_BannerCarouselDto widget_BannerCarouselDto = (Widget_BannerCarouselDto) obj;
            return this.a.equals(widget_BannerCarouselDto.a) && this.b.equals(widget_BannerCarouselDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_BannerCarouselDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_BubbleTogglesDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/BubbleToggleWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_BubbleTogglesDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_BubbleTogglesDto extends WidgetDto {
        public final String a;
        public final BubbleToggleWidgetDto b;

        public Widget_BubbleTogglesDto(@Json(name = "type") String str, BubbleToggleWidgetDto bubbleToggleWidgetDto) {
            this.a = str;
            this.b = bubbleToggleWidgetDto;
        }

        public final Widget_BubbleTogglesDto copy(@Json(name = "type") String type, BubbleToggleWidgetDto value) {
            return new Widget_BubbleTogglesDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_BubbleTogglesDto)) {
                return false;
            }
            Widget_BubbleTogglesDto widget_BubbleTogglesDto = (Widget_BubbleTogglesDto) obj;
            return this.a.equals(widget_BubbleTogglesDto.a) && this.b.equals(widget_BubbleTogglesDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_BubbleTogglesDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ButtonsRowDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ButtonsRowWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ButtonsRowDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_ButtonsRowDto extends WidgetDto {
        public final String a;
        public final ButtonsRowWidgetDto b;

        public Widget_ButtonsRowDto(@Json(name = "type") String str, ButtonsRowWidgetDto buttonsRowWidgetDto) {
            this.a = str;
            this.b = buttonsRowWidgetDto;
        }

        public final Widget_ButtonsRowDto copy(@Json(name = "type") String type, ButtonsRowWidgetDto value) {
            return new Widget_ButtonsRowDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_ButtonsRowDto)) {
                return false;
            }
            Widget_ButtonsRowDto widget_ButtonsRowDto = (Widget_ButtonsRowDto) obj;
            return this.a.equals(widget_ButtonsRowDto.a) && this.b.equals(widget_ButtonsRowDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_ButtonsRowDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_CarouselItemsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselItemsWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselItemsWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CarouselItemsWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_CarouselItemsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_CarouselItemsDto extends WidgetDto {
        public final String a;
        public final CarouselItemsWidgetDto b;

        public Widget_CarouselItemsDto(@Json(name = "type") String str, CarouselItemsWidgetDto carouselItemsWidgetDto) {
            this.a = str;
            this.b = carouselItemsWidgetDto;
        }

        public final Widget_CarouselItemsDto copy(@Json(name = "type") String type, CarouselItemsWidgetDto value) {
            return new Widget_CarouselItemsDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_CarouselItemsDto)) {
                return false;
            }
            Widget_CarouselItemsDto widget_CarouselItemsDto = (Widget_CarouselItemsDto) obj;
            return this.a.equals(widget_CarouselItemsDto.a) && this.b.equals(widget_CarouselItemsDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_CarouselItemsDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_CartDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CartWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CartWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CartWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_CartDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_CartDto extends WidgetDto {
        public final String a;
        public final CartWidgetDto b;

        public Widget_CartDto(@Json(name = "type") String str, CartWidgetDto cartWidgetDto) {
            this.a = str;
            this.b = cartWidgetDto;
        }

        public final Widget_CartDto copy(@Json(name = "type") String type, CartWidgetDto value) {
            return new Widget_CartDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_CartDto)) {
                return false;
            }
            Widget_CartDto widget_CartDto = (Widget_CartDto) obj;
            return this.a.equals(widget_CartDto.a) && this.b.equals(widget_CartDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_CartDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ContactDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ContactWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ContactDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_ContactDto extends WidgetDto {
        public final String a;
        public final ContactWidgetDto b;

        public Widget_ContactDto(@Json(name = "type") String str, ContactWidgetDto contactWidgetDto) {
            this.a = str;
            this.b = contactWidgetDto;
        }

        public final Widget_ContactDto copy(@Json(name = "type") String type, ContactWidgetDto value) {
            return new Widget_ContactDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_ContactDto)) {
                return false;
            }
            Widget_ContactDto widget_ContactDto = (Widget_ContactDto) obj;
            return this.a.equals(widget_ContactDto.a) && this.b.equals(widget_ContactDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_ContactDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_CostDetailDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDetailWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDetailWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CostDetailWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_CostDetailDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_CostDetailDto extends WidgetDto {
        public final String a;
        public final CostDetailWidgetDto b;

        public Widget_CostDetailDto(@Json(name = "type") String str, CostDetailWidgetDto costDetailWidgetDto) {
            this.a = str;
            this.b = costDetailWidgetDto;
        }

        public final Widget_CostDetailDto copy(@Json(name = "type") String type, CostDetailWidgetDto value) {
            return new Widget_CostDetailDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_CostDetailDto)) {
                return false;
            }
            Widget_CostDetailDto widget_CostDetailDto = (Widget_CostDetailDto) obj;
            return this.a.equals(widget_CostDetailDto.a) && this.b.equals(widget_CostDetailDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_CostDetailDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_CounterDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CounterWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CounterWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/CounterWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_CounterDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_DigitsInputDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DigitsInputWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_DigitsInputDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_DigitsInputDto extends WidgetDto {
        public final String a;
        public final DigitsInputWidgetDto b;

        public Widget_DigitsInputDto(@Json(name = "type") String str, DigitsInputWidgetDto digitsInputWidgetDto) {
            this.a = str;
            this.b = digitsInputWidgetDto;
        }

        public final Widget_DigitsInputDto copy(@Json(name = "type") String type, DigitsInputWidgetDto value) {
            return new Widget_DigitsInputDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_DigitsInputDto)) {
                return false;
            }
            Widget_DigitsInputDto widget_DigitsInputDto = (Widget_DigitsInputDto) obj;
            return this.a.equals(widget_DigitsInputDto.a) && this.b.equals(widget_DigitsInputDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_DigitsInputDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_DiscountDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DiscountWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DiscountWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DiscountWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_DiscountDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_DiscountDto extends WidgetDto {
        public final String a;
        public final DiscountWidgetDto b;

        public Widget_DiscountDto(@Json(name = "type") String str, DiscountWidgetDto discountWidgetDto) {
            this.a = str;
            this.b = discountWidgetDto;
        }

        public final Widget_DiscountDto copy(@Json(name = "type") String type, DiscountWidgetDto value) {
            return new Widget_DiscountDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_DiscountDto)) {
                return false;
            }
            Widget_DiscountDto widget_DiscountDto = (Widget_DiscountDto) obj;
            return this.a.equals(widget_DiscountDto.a) && this.b.equals(widget_DiscountDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_DiscountDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_DividerDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/DividerWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_DividerDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_DividerDto extends WidgetDto {
        public final String a;
        public final DividerWidgetDto b;

        public Widget_DividerDto(@Json(name = "type") String str, DividerWidgetDto dividerWidgetDto) {
            this.a = str;
            this.b = dividerWidgetDto;
        }

        public final Widget_DividerDto copy(@Json(name = "type") String type, DividerWidgetDto value) {
            return new Widget_DividerDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_DividerDto)) {
                return false;
            }
            Widget_DividerDto widget_DividerDto = (Widget_DividerDto) obj;
            return this.a.equals(widget_DividerDto.a) && this.b.equals(widget_DividerDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_DividerDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_EditableRouteWidgetsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/EditableRouteWidgetsDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/EditableRouteWidgetsDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/EditableRouteWidgetsDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_EditableRouteWidgetsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_EditableRouteWidgetsDto extends WidgetDto {
        public final String a;
        public final EditableRouteWidgetsDto b;

        public Widget_EditableRouteWidgetsDto(@Json(name = "type") String str, EditableRouteWidgetsDto editableRouteWidgetsDto) {
            this.a = str;
            this.b = editableRouteWidgetsDto;
        }

        public final Widget_EditableRouteWidgetsDto copy(@Json(name = "type") String type, EditableRouteWidgetsDto value) {
            return new Widget_EditableRouteWidgetsDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_EditableRouteWidgetsDto)) {
                return false;
            }
            Widget_EditableRouteWidgetsDto widget_EditableRouteWidgetsDto = (Widget_EditableRouteWidgetsDto) obj;
            return this.a.equals(widget_EditableRouteWidgetsDto.a) && this.b.equals(widget_EditableRouteWidgetsDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_EditableRouteWidgetsDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_FieldDisplayDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FieldDisplayWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FieldDisplayWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FieldDisplayWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_FieldDisplayDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_FieldDisplayDto extends WidgetDto {
        public final String a;
        public final FieldDisplayWidgetDto b;

        public Widget_FieldDisplayDto(@Json(name = "type") String str, FieldDisplayWidgetDto fieldDisplayWidgetDto) {
            this.a = str;
            this.b = fieldDisplayWidgetDto;
        }

        public final Widget_FieldDisplayDto copy(@Json(name = "type") String type, FieldDisplayWidgetDto value) {
            return new Widget_FieldDisplayDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_FieldDisplayDto)) {
                return false;
            }
            Widget_FieldDisplayDto widget_FieldDisplayDto = (Widget_FieldDisplayDto) obj;
            return this.a.equals(widget_FieldDisplayDto.a) && this.b.equals(widget_FieldDisplayDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_FieldDisplayDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_FlatHeaderDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FlatNavigationHeaderWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FlatNavigationHeaderWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FlatNavigationHeaderWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_FlatHeaderDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_FlatHeaderDto extends WidgetDto {
        public final String a;
        public final FlatNavigationHeaderWidgetDto b;

        public Widget_FlatHeaderDto(@Json(name = "type") String str, FlatNavigationHeaderWidgetDto flatNavigationHeaderWidgetDto) {
            this.a = str;
            this.b = flatNavigationHeaderWidgetDto;
        }

        public final Widget_FlatHeaderDto copy(@Json(name = "type") String type, FlatNavigationHeaderWidgetDto value) {
            return new Widget_FlatHeaderDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_FlatHeaderDto)) {
                return false;
            }
            Widget_FlatHeaderDto widget_FlatHeaderDto = (Widget_FlatHeaderDto) obj;
            return this.a.equals(widget_FlatHeaderDto.a) && this.b.equals(widget_FlatHeaderDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_FlatHeaderDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_GridLayoutDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/GridLayoutWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_GridLayoutDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_GridLayoutDto extends WidgetDto {
        public final String a;
        public final GridLayoutWidgetDto b;

        public Widget_GridLayoutDto(@Json(name = "type") String str, GridLayoutWidgetDto gridLayoutWidgetDto) {
            this.a = str;
            this.b = gridLayoutWidgetDto;
        }

        public final Widget_GridLayoutDto copy(@Json(name = "type") String type, GridLayoutWidgetDto value) {
            return new Widget_GridLayoutDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_GridLayoutDto)) {
                return false;
            }
            Widget_GridLayoutDto widget_GridLayoutDto = (Widget_GridLayoutDto) obj;
            return this.a.equals(widget_GridLayoutDto.a) && this.b.equals(widget_GridLayoutDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_GridLayoutDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_HeaderDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HeaderWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HeaderWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HeaderWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_HeaderDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_HeaderDto extends WidgetDto {
        public final String a;
        public final HeaderWidgetDto b;

        public Widget_HeaderDto(@Json(name = "type") String str, HeaderWidgetDto headerWidgetDto) {
            this.a = str;
            this.b = headerWidgetDto;
        }

        public final Widget_HeaderDto copy(@Json(name = "type") String type, HeaderWidgetDto value) {
            return new Widget_HeaderDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_HeaderDto)) {
                return false;
            }
            Widget_HeaderDto widget_HeaderDto = (Widget_HeaderDto) obj;
            return this.a.equals(widget_HeaderDto.a) && this.b.equals(widget_HeaderDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_HeaderDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_HorizontalStackDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/HorizontalStackWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_HorizontalStackDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_HorizontalStackDto extends WidgetDto {
        public final String a;
        public final HorizontalStackWidgetDto b;

        public Widget_HorizontalStackDto(@Json(name = "type") String str, HorizontalStackWidgetDto horizontalStackWidgetDto) {
            this.a = str;
            this.b = horizontalStackWidgetDto;
        }

        public final Widget_HorizontalStackDto copy(@Json(name = "type") String type, HorizontalStackWidgetDto value) {
            return new Widget_HorizontalStackDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_HorizontalStackDto)) {
                return false;
            }
            Widget_HorizontalStackDto widget_HorizontalStackDto = (Widget_HorizontalStackDto) obj;
            return this.a.equals(widget_HorizontalStackDto.a) && this.b.equals(widget_HorizontalStackDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_HorizontalStackDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ImageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ImageWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ImageWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ImageWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ImageDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_ImageDto extends WidgetDto {
        public final String a;
        public final ImageWidgetDto b;

        public Widget_ImageDto(@Json(name = "type") String str, ImageWidgetDto imageWidgetDto) {
            this.a = str;
            this.b = imageWidgetDto;
        }

        public final Widget_ImageDto copy(@Json(name = "type") String type, ImageWidgetDto value) {
            return new Widget_ImageDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_ImageDto)) {
                return false;
            }
            Widget_ImageDto widget_ImageDto = (Widget_ImageDto) obj;
            return this.a.equals(widget_ImageDto.a) && this.b.equals(widget_ImageDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_ImageDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_InputCircleDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/InputCircleWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_InputCircleDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_InputCircleDto extends WidgetDto {
        public final String a;
        public final InputCircleWidgetDto b;

        public Widget_InputCircleDto(@Json(name = "type") String str, InputCircleWidgetDto inputCircleWidgetDto) {
            this.a = str;
            this.b = inputCircleWidgetDto;
        }

        public final Widget_InputCircleDto copy(@Json(name = "type") String type, InputCircleWidgetDto value) {
            return new Widget_InputCircleDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_InputCircleDto)) {
                return false;
            }
            Widget_InputCircleDto widget_InputCircleDto = (Widget_InputCircleDto) obj;
            return this.a.equals(widget_InputCircleDto.a) && this.b.equals(widget_InputCircleDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_InputCircleDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_LoadingSpinnerDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/LoadingSpinnerWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/LoadingSpinnerWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/LoadingSpinnerWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_LoadingSpinnerDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_LoadingSpinnerDto extends WidgetDto {
        public final String a;
        public final LoadingSpinnerWidgetDto b;

        public Widget_LoadingSpinnerDto(@Json(name = "type") String str, LoadingSpinnerWidgetDto loadingSpinnerWidgetDto) {
            this.a = str;
            this.b = loadingSpinnerWidgetDto;
        }

        public final Widget_LoadingSpinnerDto copy(@Json(name = "type") String type, LoadingSpinnerWidgetDto value) {
            return new Widget_LoadingSpinnerDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_LoadingSpinnerDto)) {
                return false;
            }
            Widget_LoadingSpinnerDto widget_LoadingSpinnerDto = (Widget_LoadingSpinnerDto) obj;
            return this.a.equals(widget_LoadingSpinnerDto.a) && this.b.equals(widget_LoadingSpinnerDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_LoadingSpinnerDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_MiniMapDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/MiniMapWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/MiniMapWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/MiniMapWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_MiniMapDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_MiniMapDto extends WidgetDto {
        public final String a;
        public final MiniMapWidgetDto b;

        public Widget_MiniMapDto(@Json(name = "type") String str, MiniMapWidgetDto miniMapWidgetDto) {
            this.a = str;
            this.b = miniMapWidgetDto;
        }

        public final Widget_MiniMapDto copy(@Json(name = "type") String type, MiniMapWidgetDto value) {
            return new Widget_MiniMapDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_MiniMapDto)) {
                return false;
            }
            Widget_MiniMapDto widget_MiniMapDto = (Widget_MiniMapDto) obj;
            return this.a.equals(widget_MiniMapDto.a) && this.b.equals(widget_MiniMapDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_MiniMapDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_MultiAddressDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/MultiAddressWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/MultiAddressWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/MultiAddressWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_MultiAddressDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_MultiAddressDto extends WidgetDto {
        public final String a;
        public final MultiAddressWidgetDto b;

        public Widget_MultiAddressDto(@Json(name = "type") String str, MultiAddressWidgetDto multiAddressWidgetDto) {
            this.a = str;
            this.b = multiAddressWidgetDto;
        }

        public final Widget_MultiAddressDto copy(@Json(name = "type") String type, MultiAddressWidgetDto value) {
            return new Widget_MultiAddressDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_MultiAddressDto)) {
                return false;
            }
            Widget_MultiAddressDto widget_MultiAddressDto = (Widget_MultiAddressDto) obj;
            return this.a.equals(widget_MultiAddressDto.a) && this.b.equals(widget_MultiAddressDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_MultiAddressDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_NotificationDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NotificationWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NotificationWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NotificationWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_NotificationDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_NotificationDto extends WidgetDto {
        public final String a;
        public final NotificationWidgetDto b;

        public Widget_NotificationDto(@Json(name = "type") String str, NotificationWidgetDto notificationWidgetDto) {
            this.a = str;
            this.b = notificationWidgetDto;
        }

        public final Widget_NotificationDto copy(@Json(name = "type") String type, NotificationWidgetDto value) {
            return new Widget_NotificationDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_NotificationDto)) {
                return false;
            }
            Widget_NotificationDto widget_NotificationDto = (Widget_NotificationDto) obj;
            return this.a.equals(widget_NotificationDto.a) && this.b.equals(widget_NotificationDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_NotificationDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_NumericInputDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NumericInputWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NumericInputWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/NumericInputWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_NumericInputDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_NumericInputDto extends WidgetDto {
        public final String a;
        public final NumericInputWidgetDto b;

        public Widget_NumericInputDto(@Json(name = "type") String str, NumericInputWidgetDto numericInputWidgetDto) {
            this.a = str;
            this.b = numericInputWidgetDto;
        }

        public final Widget_NumericInputDto copy(@Json(name = "type") String type, NumericInputWidgetDto value) {
            return new Widget_NumericInputDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_NumericInputDto)) {
                return false;
            }
            Widget_NumericInputDto widget_NumericInputDto = (Widget_NumericInputDto) obj;
            return this.a.equals(widget_NumericInputDto.a) && this.b.equals(widget_NumericInputDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_NumericInputDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_PaymentMethodDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PaymentMethodWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PaymentMethodWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PaymentMethodWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_PaymentMethodDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_PaymentMethodDto extends WidgetDto {
        public final String a;
        public final PaymentMethodWidgetDto b;

        public Widget_PaymentMethodDto(@Json(name = "type") String str, PaymentMethodWidgetDto paymentMethodWidgetDto) {
            this.a = str;
            this.b = paymentMethodWidgetDto;
        }

        public final Widget_PaymentMethodDto copy(@Json(name = "type") String type, PaymentMethodWidgetDto value) {
            return new Widget_PaymentMethodDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_PaymentMethodDto)) {
                return false;
            }
            Widget_PaymentMethodDto widget_PaymentMethodDto = (Widget_PaymentMethodDto) obj;
            return this.a.equals(widget_PaymentMethodDto.a) && this.b.equals(widget_PaymentMethodDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_PaymentMethodDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_PickerDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/PickerWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_PickerDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_PickerDto extends WidgetDto {
        public final String a;
        public final PickerWidgetDto b;

        public Widget_PickerDto(@Json(name = "type") String str, PickerWidgetDto pickerWidgetDto) {
            this.a = str;
            this.b = pickerWidgetDto;
        }

        public final Widget_PickerDto copy(@Json(name = "type") String type, PickerWidgetDto value) {
            return new Widget_PickerDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_PickerDto)) {
                return false;
            }
            Widget_PickerDto widget_PickerDto = (Widget_PickerDto) obj;
            return this.a.equals(widget_PickerDto.a) && this.b.equals(widget_PickerDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_PickerDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ProgressDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ProgressWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ProgressWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ProgressWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ProgressDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_ProgressDto extends WidgetDto {
        public final String a;
        public final ProgressWidgetDto b;

        public Widget_ProgressDto(@Json(name = "type") String str, ProgressWidgetDto progressWidgetDto) {
            this.a = str;
            this.b = progressWidgetDto;
        }

        public final Widget_ProgressDto copy(@Json(name = "type") String type, ProgressWidgetDto value) {
            return new Widget_ProgressDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_ProgressDto)) {
                return false;
            }
            Widget_ProgressDto widget_ProgressDto = (Widget_ProgressDto) obj;
            return this.a.equals(widget_ProgressDto.a) && this.b.equals(widget_ProgressDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_ProgressDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ScalableSelectorDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScalableSelectorWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ScalableSelectorDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_ScalableSelectorDto extends WidgetDto {
        public final String a;
        public final ScalableSelectorWidgetDto b;

        public Widget_ScalableSelectorDto(@Json(name = "type") String str, ScalableSelectorWidgetDto scalableSelectorWidgetDto) {
            this.a = str;
            this.b = scalableSelectorWidgetDto;
        }

        public final Widget_ScalableSelectorDto copy(@Json(name = "type") String type, ScalableSelectorWidgetDto value) {
            return new Widget_ScalableSelectorDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_ScalableSelectorDto)) {
                return false;
            }
            Widget_ScalableSelectorDto widget_ScalableSelectorDto = (Widget_ScalableSelectorDto) obj;
            return this.a.equals(widget_ScalableSelectorDto.a) && this.b.equals(widget_ScalableSelectorDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_ScalableSelectorDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ScenarioSelectorDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScenarioSelectorWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScenarioSelectorWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScenarioSelectorWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ScenarioSelectorDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_ScenarioSelectorDto extends WidgetDto {
        public final String a;
        public final ScenarioSelectorWidgetDto b;

        public Widget_ScenarioSelectorDto(@Json(name = "type") String str, ScenarioSelectorWidgetDto scenarioSelectorWidgetDto) {
            this.a = str;
            this.b = scenarioSelectorWidgetDto;
        }

        public final Widget_ScenarioSelectorDto copy(@Json(name = "type") String type, ScenarioSelectorWidgetDto value) {
            return new Widget_ScenarioSelectorDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_ScenarioSelectorDto)) {
                return false;
            }
            Widget_ScenarioSelectorDto widget_ScenarioSelectorDto = (Widget_ScenarioSelectorDto) obj;
            return this.a.equals(widget_ScenarioSelectorDto.a) && this.b.equals(widget_ScenarioSelectorDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_ScenarioSelectorDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ScrollableItemsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemsWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemsWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ScrollableItemsWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ScrollableItemsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_ScrollableItemsDto extends WidgetDto {
        public final String a;
        public final ScrollableItemsWidgetDto b;

        public Widget_ScrollableItemsDto(@Json(name = "type") String str, ScrollableItemsWidgetDto scrollableItemsWidgetDto) {
            this.a = str;
            this.b = scrollableItemsWidgetDto;
        }

        public final Widget_ScrollableItemsDto copy(@Json(name = "type") String type, ScrollableItemsWidgetDto value) {
            return new Widget_ScrollableItemsDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_ScrollableItemsDto)) {
                return false;
            }
            Widget_ScrollableItemsDto widget_ScrollableItemsDto = (Widget_ScrollableItemsDto) obj;
            return this.a.equals(widget_ScrollableItemsDto.a) && this.b.equals(widget_ScrollableItemsDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_ScrollableItemsDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_SegmentDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SegmentWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SegmentWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SegmentWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_SegmentDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_SegmentDto extends WidgetDto {
        public final String a;
        public final SegmentWidgetDto b;

        public Widget_SegmentDto(@Json(name = "type") String str, SegmentWidgetDto segmentWidgetDto) {
            this.a = str;
            this.b = segmentWidgetDto;
        }

        public final Widget_SegmentDto copy(@Json(name = "type") String type, SegmentWidgetDto value) {
            return new Widget_SegmentDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_SegmentDto)) {
                return false;
            }
            Widget_SegmentDto widget_SegmentDto = (Widget_SegmentDto) obj;
            return this.a.equals(widget_SegmentDto.a) && this.b.equals(widget_SegmentDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_SegmentDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_SelectorDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SelectorWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SelectorWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SelectorWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_SelectorDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_SelectorDto extends WidgetDto {
        public final String a;
        public final SelectorWidgetDto b;

        public Widget_SelectorDto(@Json(name = "type") String str, SelectorWidgetDto selectorWidgetDto) {
            this.a = str;
            this.b = selectorWidgetDto;
        }

        public final Widget_SelectorDto copy(@Json(name = "type") String type, SelectorWidgetDto value) {
            return new Widget_SelectorDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_SelectorDto)) {
                return false;
            }
            Widget_SelectorDto widget_SelectorDto = (Widget_SelectorDto) obj;
            return this.a.equals(widget_SelectorDto.a) && this.b.equals(widget_SelectorDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_SelectorDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ShortcutDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_ShortcutDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_ShortcutDto extends WidgetDto {
        public final String a;
        public final ShortcutWidgetDto b;

        public Widget_ShortcutDto(@Json(name = "type") String str, ShortcutWidgetDto shortcutWidgetDto) {
            this.a = str;
            this.b = shortcutWidgetDto;
        }

        public final Widget_ShortcutDto copy(@Json(name = "type") String type, ShortcutWidgetDto value) {
            return new Widget_ShortcutDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_ShortcutDto)) {
                return false;
            }
            Widget_ShortcutDto widget_ShortcutDto = (Widget_ShortcutDto) obj;
            return this.a.equals(widget_ShortcutDto.a) && this.b.equals(widget_ShortcutDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_ShortcutDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_SliderButtonDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderButtonWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderButtonWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SliderButtonWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_SliderButtonDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_SliderButtonDto extends WidgetDto {
        public final String a;
        public final SliderButtonWidgetDto b;

        public Widget_SliderButtonDto(@Json(name = "type") String str, SliderButtonWidgetDto sliderButtonWidgetDto) {
            this.a = str;
            this.b = sliderButtonWidgetDto;
        }

        public final Widget_SliderButtonDto copy(@Json(name = "type") String type, SliderButtonWidgetDto value) {
            return new Widget_SliderButtonDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_SliderButtonDto)) {
                return false;
            }
            Widget_SliderButtonDto widget_SliderButtonDto = (Widget_SliderButtonDto) obj;
            return this.a.equals(widget_SliderButtonDto.a) && this.b.equals(widget_SliderButtonDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_SliderButtonDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_SlotDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/SlotWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_SlotDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_SlotDto extends WidgetDto {
        public final String a;
        public final SlotWidgetDto b;

        public Widget_SlotDto(@Json(name = "type") String str, SlotWidgetDto slotWidgetDto) {
            this.a = str;
            this.b = slotWidgetDto;
        }

        public final Widget_SlotDto copy(@Json(name = "type") String type, SlotWidgetDto value) {
            return new Widget_SlotDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_SlotDto)) {
                return false;
            }
            Widget_SlotDto widget_SlotDto = (Widget_SlotDto) obj;
            return this.a.equals(widget_SlotDto.a) && this.b.equals(widget_SlotDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_SlotDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TabsDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TabsWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TabsWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TabsWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TabsDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_TabsDto extends WidgetDto {
        public final String a;
        public final TabsWidgetDto b;

        public Widget_TabsDto(@Json(name = "type") String str, TabsWidgetDto tabsWidgetDto) {
            this.a = str;
            this.b = tabsWidgetDto;
        }

        public final Widget_TabsDto copy(@Json(name = "type") String type, TabsWidgetDto value) {
            return new Widget_TabsDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_TabsDto)) {
                return false;
            }
            Widget_TabsDto widget_TabsDto = (Widget_TabsDto) obj;
            return this.a.equals(widget_TabsDto.a) && this.b.equals(widget_TabsDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_TabsDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TagLineDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TagLineWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TagLineWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TagLineWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TagLineDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_TagLineDto extends WidgetDto {
        public final String a;
        public final TagLineWidgetDto b;

        public Widget_TagLineDto(@Json(name = "type") String str, TagLineWidgetDto tagLineWidgetDto) {
            this.a = str;
            this.b = tagLineWidgetDto;
        }

        public final Widget_TagLineDto copy(@Json(name = "type") String type, TagLineWidgetDto value) {
            return new Widget_TagLineDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_TagLineDto)) {
                return false;
            }
            Widget_TagLineDto widget_TagLineDto = (Widget_TagLineDto) obj;
            return this.a.equals(widget_TagLineDto.a) && this.b.equals(widget_TagLineDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_TagLineDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TemplateDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FormTemplateWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FormTemplateWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/FormTemplateWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TemplateDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_TemplateDto extends WidgetDto {
        public final String a;
        public final FormTemplateWidgetDto b;

        public Widget_TemplateDto(@Json(name = "type") String str, FormTemplateWidgetDto formTemplateWidgetDto) {
            this.a = str;
            this.b = formTemplateWidgetDto;
        }

        public final Widget_TemplateDto copy(@Json(name = "type") String type, FormTemplateWidgetDto value) {
            return new Widget_TemplateDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_TemplateDto)) {
                return false;
            }
            Widget_TemplateDto widget_TemplateDto = (Widget_TemplateDto) obj;
            return this.a.equals(widget_TemplateDto.a) && this.b.equals(widget_TemplateDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_TemplateDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TextDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TextDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TextInputDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextInputWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_TextInputDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_TextInputDto extends WidgetDto {
        public final String a;
        public final TextInputWidgetDto b;

        public Widget_TextInputDto(@Json(name = "type") String str, TextInputWidgetDto textInputWidgetDto) {
            this.a = str;
            this.b = textInputWidgetDto;
        }

        public final Widget_TextInputDto copy(@Json(name = "type") String type, TextInputWidgetDto value) {
            return new Widget_TextInputDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_TextInputDto)) {
                return false;
            }
            Widget_TextInputDto widget_TextInputDto = (Widget_TextInputDto) obj;
            return this.a.equals(widget_TextInputDto.a) && this.b.equals(widget_TextInputDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_TextInputDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_UploadedImagesPreviewDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/UploadedImagesPreviewWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/UploadedImagesPreviewWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/UploadedImagesPreviewWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_UploadedImagesPreviewDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_UploadedImagesPreviewDto extends WidgetDto {
        public final String a;
        public final UploadedImagesPreviewWidgetDto b;

        public Widget_UploadedImagesPreviewDto(@Json(name = "type") String str, UploadedImagesPreviewWidgetDto uploadedImagesPreviewWidgetDto) {
            this.a = str;
            this.b = uploadedImagesPreviewWidgetDto;
        }

        public final Widget_UploadedImagesPreviewDto copy(@Json(name = "type") String type, UploadedImagesPreviewWidgetDto value) {
            return new Widget_UploadedImagesPreviewDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_UploadedImagesPreviewDto)) {
                return false;
            }
            Widget_UploadedImagesPreviewDto widget_UploadedImagesPreviewDto = (Widget_UploadedImagesPreviewDto) obj;
            return this.a.equals(widget_UploadedImagesPreviewDto.a) && this.b.equals(widget_UploadedImagesPreviewDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_UploadedImagesPreviewDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_VerticalStackDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/VerticalStackWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/VerticalStackWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/VerticalStackWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Widget_VerticalStackDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Widget_VerticalStackDto extends WidgetDto {
        public final String a;
        public final VerticalStackWidgetDto b;

        public Widget_VerticalStackDto(@Json(name = "type") String str, VerticalStackWidgetDto verticalStackWidgetDto) {
            this.a = str;
            this.b = verticalStackWidgetDto;
        }

        public final Widget_VerticalStackDto copy(@Json(name = "type") String type, VerticalStackWidgetDto value) {
            return new Widget_VerticalStackDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Widget_VerticalStackDto)) {
                return false;
            }
            Widget_VerticalStackDto widget_VerticalStackDto = (Widget_VerticalStackDto) obj;
            return this.a.equals(widget_VerticalStackDto.a) && this.b.equals(widget_VerticalStackDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Widget_VerticalStackDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Unknown_WidgetDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/WidgetDto$Unknown_WidgetDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
