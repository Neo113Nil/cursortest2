package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "", "Action_CustomActionDto", "Action_CloseActionDto", "Action_DeeplinkActionDto", "Action_EmptyActionDto", "Action_OpenTrackingCardDto", "Action_WebViewActionDto", "Action_StoryActionDto", "Action_SummaryRedirectActionDto", "Action_SwitchProfileActionDto", "Action_OpenOrderFormActionDto", "Action_ShowModalViewActionDto", "Unknown_ActionDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_CloseActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_CustomActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_DeeplinkActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_EmptyActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_OpenOrderFormActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_OpenTrackingCardDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_ShowModalViewActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_StoryActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_SummaryRedirectActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_SwitchProfileActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_WebViewActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Unknown_ActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ActionDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_CloseActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CloseActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CloseActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CloseActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_CloseActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action_CloseActionDto extends ActionDto {
        public final String a;
        public final CloseActionDto b;

        public Action_CloseActionDto(@Json(name = "type") String str, CloseActionDto closeActionDto) {
            this.a = str;
            this.b = closeActionDto;
        }

        public final Action_CloseActionDto copy(@Json(name = "type") String type, CloseActionDto value) {
            return new Action_CloseActionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Action_CloseActionDto) {
                Action_CloseActionDto action_CloseActionDto = (Action_CloseActionDto) obj;
                return this.a.equals(action_CloseActionDto.a) && this.b == action_CloseActionDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Action_CloseActionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_CustomActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CustomActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CustomActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/CustomActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_CustomActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action_CustomActionDto extends ActionDto {
        public final String a;
        public final CustomActionDto b;

        public Action_CustomActionDto(@Json(name = "type") String str, CustomActionDto customActionDto) {
            this.a = str;
            this.b = customActionDto;
        }

        public final Action_CustomActionDto copy(@Json(name = "type") String type, CustomActionDto value) {
            return new Action_CustomActionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action_CustomActionDto)) {
                return false;
            }
            Action_CustomActionDto action_CustomActionDto = (Action_CustomActionDto) obj;
            return this.a.equals(action_CustomActionDto.a) && this.b.equals(action_CustomActionDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Action_CustomActionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_DeeplinkActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/DeeplinkActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/DeeplinkActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/DeeplinkActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_DeeplinkActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action_DeeplinkActionDto extends ActionDto {
        public final String a;
        public final DeeplinkActionDto b;

        public Action_DeeplinkActionDto(@Json(name = "type") String str, DeeplinkActionDto deeplinkActionDto) {
            this.a = str;
            this.b = deeplinkActionDto;
        }

        public final Action_DeeplinkActionDto copy(@Json(name = "type") String type, DeeplinkActionDto value) {
            return new Action_DeeplinkActionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action_DeeplinkActionDto)) {
                return false;
            }
            Action_DeeplinkActionDto action_DeeplinkActionDto = (Action_DeeplinkActionDto) obj;
            return this.a.equals(action_DeeplinkActionDto.a) && this.b.equals(action_DeeplinkActionDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Action_DeeplinkActionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_EmptyActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/EmptyActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/EmptyActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/EmptyActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_EmptyActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action_EmptyActionDto extends ActionDto {
        public final String a;
        public final EmptyActionDto b;

        public Action_EmptyActionDto(@Json(name = "type") String str, EmptyActionDto emptyActionDto) {
            this.a = str;
            this.b = emptyActionDto;
        }

        public final Action_EmptyActionDto copy(@Json(name = "type") String type, EmptyActionDto value) {
            return new Action_EmptyActionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Action_EmptyActionDto) {
                Action_EmptyActionDto action_EmptyActionDto = (Action_EmptyActionDto) obj;
                return this.a.equals(action_EmptyActionDto.a) && this.b == action_EmptyActionDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Action_EmptyActionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_OpenOrderFormActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenOrderFormActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenOrderFormActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenOrderFormActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_OpenOrderFormActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action_OpenOrderFormActionDto extends ActionDto {
        public final String a;
        public final OpenOrderFormActionDto b;

        public Action_OpenOrderFormActionDto(@Json(name = "type") String str, OpenOrderFormActionDto openOrderFormActionDto) {
            this.a = str;
            this.b = openOrderFormActionDto;
        }

        public final Action_OpenOrderFormActionDto copy(@Json(name = "type") String type, OpenOrderFormActionDto value) {
            return new Action_OpenOrderFormActionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action_OpenOrderFormActionDto)) {
                return false;
            }
            Action_OpenOrderFormActionDto action_OpenOrderFormActionDto = (Action_OpenOrderFormActionDto) obj;
            return this.a.equals(action_OpenOrderFormActionDto.a) && this.b.equals(action_OpenOrderFormActionDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Action_OpenOrderFormActionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_OpenTrackingCardDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenTrackingCardActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenTrackingCardActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenTrackingCardActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_OpenTrackingCardDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action_OpenTrackingCardDto extends ActionDto {
        public final String a;
        public final OpenTrackingCardActionDto b;

        public Action_OpenTrackingCardDto(@Json(name = "type") String str, OpenTrackingCardActionDto openTrackingCardActionDto) {
            this.a = str;
            this.b = openTrackingCardActionDto;
        }

        public final Action_OpenTrackingCardDto copy(@Json(name = "type") String type, OpenTrackingCardActionDto value) {
            return new Action_OpenTrackingCardDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action_OpenTrackingCardDto)) {
                return false;
            }
            Action_OpenTrackingCardDto action_OpenTrackingCardDto = (Action_OpenTrackingCardDto) obj;
            return this.a.equals(action_OpenTrackingCardDto.a) && this.b.equals(action_OpenTrackingCardDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Action_OpenTrackingCardDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_ShowModalViewActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ShowModalViewActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_ShowModalViewActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action_ShowModalViewActionDto extends ActionDto {
        public final String a;
        public final ShowModalViewActionDto b;

        public Action_ShowModalViewActionDto(@Json(name = "type") String str, ShowModalViewActionDto showModalViewActionDto) {
            this.a = str;
            this.b = showModalViewActionDto;
        }

        public final Action_ShowModalViewActionDto copy(@Json(name = "type") String type, ShowModalViewActionDto value) {
            return new Action_ShowModalViewActionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action_ShowModalViewActionDto)) {
                return false;
            }
            Action_ShowModalViewActionDto action_ShowModalViewActionDto = (Action_ShowModalViewActionDto) obj;
            return this.a.equals(action_ShowModalViewActionDto.a) && this.b.equals(action_ShowModalViewActionDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Action_ShowModalViewActionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_StoryActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StoryActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StoryActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/StoryActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_StoryActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action_StoryActionDto extends ActionDto {
        public final String a;
        public final StoryActionDto b;

        public Action_StoryActionDto(@Json(name = "type") String str, StoryActionDto storyActionDto) {
            this.a = str;
            this.b = storyActionDto;
        }

        public final Action_StoryActionDto copy(@Json(name = "type") String type, StoryActionDto value) {
            return new Action_StoryActionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action_StoryActionDto)) {
                return false;
            }
            Action_StoryActionDto action_StoryActionDto = (Action_StoryActionDto) obj;
            return this.a.equals(action_StoryActionDto.a) && this.b.equals(action_StoryActionDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Action_StoryActionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_SummaryRedirectActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SummaryRedirectActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SummaryRedirectActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SummaryRedirectActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_SummaryRedirectActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action_SummaryRedirectActionDto extends ActionDto {
        public final String a;
        public final SummaryRedirectActionDto b;

        public Action_SummaryRedirectActionDto(@Json(name = "type") String str, SummaryRedirectActionDto summaryRedirectActionDto) {
            this.a = str;
            this.b = summaryRedirectActionDto;
        }

        public final Action_SummaryRedirectActionDto copy(@Json(name = "type") String type, SummaryRedirectActionDto value) {
            return new Action_SummaryRedirectActionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action_SummaryRedirectActionDto)) {
                return false;
            }
            Action_SummaryRedirectActionDto action_SummaryRedirectActionDto = (Action_SummaryRedirectActionDto) obj;
            return this.a.equals(action_SummaryRedirectActionDto.a) && this.b.equals(action_SummaryRedirectActionDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Action_SummaryRedirectActionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_SwitchProfileActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SwitchProfileActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SwitchProfileActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/SwitchProfileActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_SwitchProfileActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action_SwitchProfileActionDto extends ActionDto {
        public final String a;
        public final SwitchProfileActionDto b;

        public Action_SwitchProfileActionDto(@Json(name = "type") String str, SwitchProfileActionDto switchProfileActionDto) {
            this.a = str;
            this.b = switchProfileActionDto;
        }

        public final Action_SwitchProfileActionDto copy(@Json(name = "type") String type, SwitchProfileActionDto value) {
            return new Action_SwitchProfileActionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action_SwitchProfileActionDto)) {
                return false;
            }
            Action_SwitchProfileActionDto action_SwitchProfileActionDto = (Action_SwitchProfileActionDto) obj;
            return this.a.equals(action_SwitchProfileActionDto.a) && this.b.equals(action_SwitchProfileActionDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Action_SwitchProfileActionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_WebViewActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenWebviewActionDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenWebviewActionDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenWebviewActionDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Action_WebViewActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Action_WebViewActionDto extends ActionDto {
        public final String a;
        public final OpenWebviewActionDto b;

        public Action_WebViewActionDto(@Json(name = "type") String str, OpenWebviewActionDto openWebviewActionDto) {
            this.a = str;
            this.b = openWebviewActionDto;
        }

        public final Action_WebViewActionDto copy(@Json(name = "type") String type, OpenWebviewActionDto value) {
            return new Action_WebViewActionDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action_WebViewActionDto)) {
                return false;
            }
            Action_WebViewActionDto action_WebViewActionDto = (Action_WebViewActionDto) obj;
            return this.a.equals(action_WebViewActionDto.a) && this.b.equals(action_WebViewActionDto.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Action_WebViewActionDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Unknown_ActionDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionDto$Unknown_ActionDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_ActionDto extends ActionDto {
        public final String a;

        public Unknown_ActionDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_ActionDto copy(@Json(name = "type") String type) {
            return new Unknown_ActionDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_ActionDto) && jl40.l(this.a, ((Unknown_ActionDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_ActionDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_ActionDto() {
            this(0);
        }

        public /* synthetic */ Unknown_ActionDto(int i) {
            this("unknown");
        }
    }
}
