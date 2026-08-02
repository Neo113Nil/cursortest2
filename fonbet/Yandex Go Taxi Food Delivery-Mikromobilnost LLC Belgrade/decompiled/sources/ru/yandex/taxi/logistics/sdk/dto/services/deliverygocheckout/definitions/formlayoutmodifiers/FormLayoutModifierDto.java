package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formlayoutmodifiers;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormLayoutModifierDto;", "", "FormLayoutModifier_ReplaceWidgetDto", "Unknown_FormLayoutModifierDto", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormLayoutModifierDto$FormLayoutModifier_ReplaceWidgetDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormLayoutModifierDto$Unknown_FormLayoutModifierDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class FormLayoutModifierDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormLayoutModifierDto$FormLayoutModifier_ReplaceWidgetDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormLayoutModifierDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormLayoutModifierReplaceWidgetDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormLayoutModifierReplaceWidgetDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormLayoutModifierReplaceWidgetDto;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormLayoutModifierDto$FormLayoutModifier_ReplaceWidgetDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FormLayoutModifier_ReplaceWidgetDto extends FormLayoutModifierDto {
        public final String a;
        public final FormLayoutModifierReplaceWidgetDto b;

        public FormLayoutModifier_ReplaceWidgetDto(@Json(name = "type") String str, FormLayoutModifierReplaceWidgetDto formLayoutModifierReplaceWidgetDto) {
            this.a = str;
            this.b = formLayoutModifierReplaceWidgetDto;
        }

        public final FormLayoutModifier_ReplaceWidgetDto copy(@Json(name = "type") String type, FormLayoutModifierReplaceWidgetDto value) {
            return new FormLayoutModifier_ReplaceWidgetDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FormLayoutModifier_ReplaceWidgetDto)) {
                return false;
            }
            FormLayoutModifier_ReplaceWidgetDto formLayoutModifier_ReplaceWidgetDto = (FormLayoutModifier_ReplaceWidgetDto) obj;
            return this.a.equals(formLayoutModifier_ReplaceWidgetDto.a) && this.b.equals(formLayoutModifier_ReplaceWidgetDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FormLayoutModifier_ReplaceWidgetDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormLayoutModifierDto$Unknown_FormLayoutModifierDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormLayoutModifierDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formlayoutmodifiers/FormLayoutModifierDto$Unknown_FormLayoutModifierDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_FormLayoutModifierDto extends FormLayoutModifierDto {
        public final String a;

        public Unknown_FormLayoutModifierDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_FormLayoutModifierDto copy(@Json(name = "type") String type) {
            return new Unknown_FormLayoutModifierDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_FormLayoutModifierDto) && jl40.l(this.a, ((Unknown_FormLayoutModifierDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_FormLayoutModifierDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_FormLayoutModifierDto() {
            this(0);
        }

        public /* synthetic */ Unknown_FormLayoutModifierDto(int i) {
            this("unknown");
        }
    }
}
