package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.smw0;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0017\u001a\u00060\u0001j\u0002`\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\f\b\u0003\u0010\u0004\u001a\u00060\u0001j\u0002`\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006\""}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/V2FormRequestDto;", "", "userInfo", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormUserInfoDto;", ClidProvider.STATE, "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormStateDto;", "mode", "", "displayingModals", "", "scenario", "<init>", "(Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormUserInfoDto;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getUserInfo", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/form/FormUserInfoDto;", "getState", "()Ljava/lang/Object;", "getMode", "()Ljava/lang/String;", "getDisplayingModals", "()Ljava/util/List;", "getScenario", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class V2FormRequestDto {
    private final List<String> displayingModals;
    private final String mode;
    private final String scenario;
    private final Object state;
    private final FormUserInfoDto userInfo;

    public V2FormRequestDto(@Json(name = "user_info") FormUserInfoDto formUserInfoDto, @Json(name = "state") Object obj, @Json(name = "mode") String str, @Json(name = "displaying_modals") List<String> list, @Json(name = "scenario") String str2) {
        this.userInfo = formUserInfoDto;
        this.state = obj;
        this.mode = str;
        this.displayingModals = list;
        this.scenario = str2;
    }

    public static /* synthetic */ V2FormRequestDto copy$default(V2FormRequestDto v2FormRequestDto, FormUserInfoDto formUserInfoDto, Object obj, String str, List list, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            formUserInfoDto = v2FormRequestDto.userInfo;
        }
        if ((i & 2) != 0) {
            obj = v2FormRequestDto.state;
        }
        if ((i & 4) != 0) {
            str = v2FormRequestDto.mode;
        }
        if ((i & 8) != 0) {
            list = v2FormRequestDto.displayingModals;
        }
        if ((i & 16) != 0) {
            str2 = v2FormRequestDto.scenario;
        }
        String str3 = str2;
        String str4 = str;
        return v2FormRequestDto.copy(formUserInfoDto, obj, str4, list, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final FormUserInfoDto getUserInfo() {
        return this.userInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    public final List<String> component4() {
        return this.displayingModals;
    }

    /* renamed from: component5, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    public final V2FormRequestDto copy(@Json(name = "user_info") FormUserInfoDto userInfo, @Json(name = "state") Object state, @Json(name = "mode") String mode, @Json(name = "displaying_modals") List<String> displayingModals, @Json(name = "scenario") String scenario) {
        return new V2FormRequestDto(userInfo, state, mode, displayingModals, scenario);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V2FormRequestDto)) {
            return false;
        }
        V2FormRequestDto v2FormRequestDto = (V2FormRequestDto) other;
        return jl40.l(this.userInfo, v2FormRequestDto.userInfo) && jl40.l(this.state, v2FormRequestDto.state) && jl40.l(this.mode, v2FormRequestDto.mode) && jl40.l(this.displayingModals, v2FormRequestDto.displayingModals) && jl40.l(this.scenario, v2FormRequestDto.scenario);
    }

    public final List<String> getDisplayingModals() {
        return this.displayingModals;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getScenario() {
        return this.scenario;
    }

    public final Object getState() {
        return this.state;
    }

    public final FormUserInfoDto getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int b = unr0.b(smw0.c(this.userInfo.hashCode() * 31, 31, this.state), 31, this.mode);
        List<String> list = this.displayingModals;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.scenario;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        FormUserInfoDto formUserInfoDto = this.userInfo;
        Object obj = this.state;
        String str = this.mode;
        List<String> list = this.displayingModals;
        String str2 = this.scenario;
        StringBuilder sb = new StringBuilder("V2FormRequestDto(userInfo=");
        sb.append(formUserInfoDto);
        sb.append(", state=");
        sb.append(obj);
        sb.append(", mode=");
        tse0.x(str, ", displayingModals=", ", scenario=", sb, list);
        return oyr.t(sb, str2, Extension.C_BRAKE);
    }
}
