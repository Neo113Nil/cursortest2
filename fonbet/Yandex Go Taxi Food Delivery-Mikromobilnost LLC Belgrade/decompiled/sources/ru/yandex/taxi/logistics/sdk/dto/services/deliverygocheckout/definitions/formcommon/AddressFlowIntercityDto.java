package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowIntercityDto;", "", "currentMode", "", "selectedClass", "selectionOnMapConfiguration", "Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CityDiscoveryScreenDto;", "initialSearchText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CityDiscoveryScreenDto;Ljava/lang/String;)V", "getCurrentMode", "()Ljava/lang/String;", "getSelectedClass", "getSelectionOnMapConfiguration", "()Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/CityDiscoveryScreenDto;", "getInitialSearchText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddressFlowIntercityDto {
    private final String currentMode;
    private final String initialSearchText;
    private final String selectedClass;
    private final CityDiscoveryScreenDto selectionOnMapConfiguration;

    public AddressFlowIntercityDto(@Json(name = "current_mode") String str, @Json(name = "selected_class") String str2, @Json(name = "selection_on_map_configuration") CityDiscoveryScreenDto cityDiscoveryScreenDto, @Json(name = "initial_search_text") String str3) {
        this.currentMode = str;
        this.selectedClass = str2;
        this.selectionOnMapConfiguration = cityDiscoveryScreenDto;
        this.initialSearchText = str3;
    }

    public static /* synthetic */ AddressFlowIntercityDto copy$default(AddressFlowIntercityDto addressFlowIntercityDto, String str, String str2, CityDiscoveryScreenDto cityDiscoveryScreenDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressFlowIntercityDto.currentMode;
        }
        if ((i & 2) != 0) {
            str2 = addressFlowIntercityDto.selectedClass;
        }
        if ((i & 4) != 0) {
            cityDiscoveryScreenDto = addressFlowIntercityDto.selectionOnMapConfiguration;
        }
        if ((i & 8) != 0) {
            str3 = addressFlowIntercityDto.initialSearchText;
        }
        return addressFlowIntercityDto.copy(str, str2, cityDiscoveryScreenDto, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCurrentMode() {
        return this.currentMode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedClass() {
        return this.selectedClass;
    }

    /* renamed from: component3, reason: from getter */
    public final CityDiscoveryScreenDto getSelectionOnMapConfiguration() {
        return this.selectionOnMapConfiguration;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInitialSearchText() {
        return this.initialSearchText;
    }

    public final AddressFlowIntercityDto copy(@Json(name = "current_mode") String currentMode, @Json(name = "selected_class") String selectedClass, @Json(name = "selection_on_map_configuration") CityDiscoveryScreenDto selectionOnMapConfiguration, @Json(name = "initial_search_text") String initialSearchText) {
        return new AddressFlowIntercityDto(currentMode, selectedClass, selectionOnMapConfiguration, initialSearchText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressFlowIntercityDto)) {
            return false;
        }
        AddressFlowIntercityDto addressFlowIntercityDto = (AddressFlowIntercityDto) other;
        return jl40.l(this.currentMode, addressFlowIntercityDto.currentMode) && jl40.l(this.selectedClass, addressFlowIntercityDto.selectedClass) && jl40.l(this.selectionOnMapConfiguration, addressFlowIntercityDto.selectionOnMapConfiguration) && jl40.l(this.initialSearchText, addressFlowIntercityDto.initialSearchText);
    }

    public final String getCurrentMode() {
        return this.currentMode;
    }

    public final String getInitialSearchText() {
        return this.initialSearchText;
    }

    public final String getSelectedClass() {
        return this.selectedClass;
    }

    public final CityDiscoveryScreenDto getSelectionOnMapConfiguration() {
        return this.selectionOnMapConfiguration;
    }

    public int hashCode() {
        String str = this.currentMode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.selectedClass;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CityDiscoveryScreenDto cityDiscoveryScreenDto = this.selectionOnMapConfiguration;
        int hashCode3 = (hashCode2 + (cityDiscoveryScreenDto == null ? 0 : cityDiscoveryScreenDto.hashCode())) * 31;
        String str3 = this.initialSearchText;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.currentMode;
        String str2 = this.selectedClass;
        CityDiscoveryScreenDto cityDiscoveryScreenDto = this.selectionOnMapConfiguration;
        String str3 = this.initialSearchText;
        StringBuilder v = b64.v("AddressFlowIntercityDto(currentMode=", str, ", selectedClass=", str2, ", selectionOnMapConfiguration=");
        v.append(cityDiscoveryScreenDto);
        v.append(", initialSearchText=");
        v.append(str3);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
