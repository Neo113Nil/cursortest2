package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.VerticalContentAlignmentDto;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto;", "", "widget", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto;", "verticalAlignment", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/VerticalContentAlignmentDto;", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/VerticalContentAlignmentDto;)V", "getWidget", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto;", "getVerticalAlignment", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/VerticalContentAlignmentDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "WidgetDto", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ShortcutLayerDto {
    private final VerticalContentAlignmentDto verticalAlignment;
    private final WidgetDto widget;

    public ShortcutLayerDto(@Json(name = "widget") WidgetDto widgetDto, @Json(name = "vertical_alignment") VerticalContentAlignmentDto verticalContentAlignmentDto) {
        this.widget = widgetDto;
        this.verticalAlignment = verticalContentAlignmentDto;
    }

    public static /* synthetic */ ShortcutLayerDto copy$default(ShortcutLayerDto shortcutLayerDto, WidgetDto widgetDto, VerticalContentAlignmentDto verticalContentAlignmentDto, int i, Object obj) {
        if ((i & 1) != 0) {
            widgetDto = shortcutLayerDto.widget;
        }
        if ((i & 2) != 0) {
            verticalContentAlignmentDto = shortcutLayerDto.verticalAlignment;
        }
        return shortcutLayerDto.copy(widgetDto, verticalContentAlignmentDto);
    }

    /* renamed from: component1, reason: from getter */
    public final WidgetDto getWidget() {
        return this.widget;
    }

    /* renamed from: component2, reason: from getter */
    public final VerticalContentAlignmentDto getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public final ShortcutLayerDto copy(@Json(name = "widget") WidgetDto widget, @Json(name = "vertical_alignment") VerticalContentAlignmentDto verticalAlignment) {
        return new ShortcutLayerDto(widget, verticalAlignment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortcutLayerDto)) {
            return false;
        }
        ShortcutLayerDto shortcutLayerDto = (ShortcutLayerDto) other;
        return jl40.l(this.widget, shortcutLayerDto.widget) && this.verticalAlignment == shortcutLayerDto.verticalAlignment;
    }

    public final VerticalContentAlignmentDto getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public final WidgetDto getWidget() {
        return this.widget;
    }

    public int hashCode() {
        int hashCode = this.widget.hashCode() * 31;
        VerticalContentAlignmentDto verticalContentAlignmentDto = this.verticalAlignment;
        return hashCode + (verticalContentAlignmentDto == null ? 0 : verticalContentAlignmentDto.hashCode());
    }

    public String toString() {
        return "ShortcutLayerDto(widget=" + this.widget + ", verticalAlignment=" + this.verticalAlignment + Extension.C_BRAKE;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto;", "", "Widget_TextDto", "Widget_ImageDto", "Widget_ProgressDto", "Unknown_WidgetDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto$Unknown_WidgetDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto$Widget_ImageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto$Widget_ProgressDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto$Widget_TextDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class WidgetDto {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto$Widget_ImageDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ImageWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ImageWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ImageWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto$Widget_ImageDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto$Widget_ProgressDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ProgressWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ProgressWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ProgressWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto$Widget_ProgressDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto$Widget_TextDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/TextWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto$Widget_TextDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto$Unknown_WidgetDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formwidgets/ShortcutLayerDto$WidgetDto$Unknown_WidgetDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
