package ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions;

import com.squareup.moshi.Json;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionAfterRedirectDto;", "", "ActionAfterRedirect_OpenPostcardEditorDto", "Unknown_ActionAfterRedirectDto", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionAfterRedirectDto$ActionAfterRedirect_OpenPostcardEditorDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionAfterRedirectDto$Unknown_ActionAfterRedirectDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ActionAfterRedirectDto {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionAfterRedirectDto$ActionAfterRedirect_OpenPostcardEditorDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionAfterRedirectDto;", "", "type", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenPostcardEditorDto;", "value", "<init>", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenPostcardEditorDto;)V", "copy", "(Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/OpenPostcardEditorDto;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionAfterRedirectDto$ActionAfterRedirect_OpenPostcardEditorDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ActionAfterRedirect_OpenPostcardEditorDto extends ActionAfterRedirectDto {
        public final String a;
        public final OpenPostcardEditorDto b;

        public ActionAfterRedirect_OpenPostcardEditorDto(@Json(name = "type") String str, OpenPostcardEditorDto openPostcardEditorDto) {
            this.a = str;
            this.b = openPostcardEditorDto;
        }

        public final ActionAfterRedirect_OpenPostcardEditorDto copy(@Json(name = "type") String type, OpenPostcardEditorDto value) {
            return new ActionAfterRedirect_OpenPostcardEditorDto(type, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ActionAfterRedirect_OpenPostcardEditorDto) {
                ActionAfterRedirect_OpenPostcardEditorDto actionAfterRedirect_OpenPostcardEditorDto = (ActionAfterRedirect_OpenPostcardEditorDto) obj;
                return this.a.equals(actionAfterRedirect_OpenPostcardEditorDto.a) && this.b == actionAfterRedirect_OpenPostcardEditorDto.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionAfterRedirect_OpenPostcardEditorDto(type=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionAfterRedirectDto$Unknown_ActionAfterRedirectDto;", "Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionAfterRedirectDto;", "", "type", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/dto/services/cargotoolbar/definitions/ActionAfterRedirectDto$Unknown_ActionAfterRedirectDto;", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown_ActionAfterRedirectDto extends ActionAfterRedirectDto {
        public final String a;

        public Unknown_ActionAfterRedirectDto(@Json(name = "type") String str) {
            this.a = str;
        }

        public final Unknown_ActionAfterRedirectDto copy(@Json(name = "type") String type) {
            return new Unknown_ActionAfterRedirectDto(type);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unknown_ActionAfterRedirectDto) && jl40.l(this.a, ((Unknown_ActionAfterRedirectDto) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("Unknown_ActionAfterRedirectDto(type=", this.a, Extension.C_BRAKE);
        }

        public Unknown_ActionAfterRedirectDto() {
            this(0);
        }

        public /* synthetic */ Unknown_ActionAfterRedirectDto(int i) {
            this("unknown");
        }
    }
}
