package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.nnm;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formcommon/AddressFlowSuggestDto;", "", "currentMode", "", "selectedClass", "suggestHint", "enableMapSelection", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getCurrentMode", "()Ljava/lang/String;", "getSelectedClass", "getSuggestHint", "getEnableMapSelection", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AddressFlowSuggestDto {
    private final String currentMode;
    private final boolean enableMapSelection;
    private final String selectedClass;
    private final String suggestHint;

    public AddressFlowSuggestDto(@Json(name = "current_mode") String str, @Json(name = "selected_class") String str2, @Json(name = "suggest_hint") String str3, @Json(name = "enable_map_selection") boolean z) {
        this.currentMode = str;
        this.selectedClass = str2;
        this.suggestHint = str3;
        this.enableMapSelection = z;
    }

    public static /* synthetic */ AddressFlowSuggestDto copy$default(AddressFlowSuggestDto addressFlowSuggestDto, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addressFlowSuggestDto.currentMode;
        }
        if ((i & 2) != 0) {
            str2 = addressFlowSuggestDto.selectedClass;
        }
        if ((i & 4) != 0) {
            str3 = addressFlowSuggestDto.suggestHint;
        }
        if ((i & 8) != 0) {
            z = addressFlowSuggestDto.enableMapSelection;
        }
        return addressFlowSuggestDto.copy(str, str2, str3, z);
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
    public final String getSuggestHint() {
        return this.suggestHint;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnableMapSelection() {
        return this.enableMapSelection;
    }

    public final AddressFlowSuggestDto copy(@Json(name = "current_mode") String currentMode, @Json(name = "selected_class") String selectedClass, @Json(name = "suggest_hint") String suggestHint, @Json(name = "enable_map_selection") boolean enableMapSelection) {
        return new AddressFlowSuggestDto(currentMode, selectedClass, suggestHint, enableMapSelection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressFlowSuggestDto)) {
            return false;
        }
        AddressFlowSuggestDto addressFlowSuggestDto = (AddressFlowSuggestDto) other;
        return jl40.l(this.currentMode, addressFlowSuggestDto.currentMode) && jl40.l(this.selectedClass, addressFlowSuggestDto.selectedClass) && jl40.l(this.suggestHint, addressFlowSuggestDto.suggestHint) && this.enableMapSelection == addressFlowSuggestDto.enableMapSelection;
    }

    public final String getCurrentMode() {
        return this.currentMode;
    }

    public final boolean getEnableMapSelection() {
        return this.enableMapSelection;
    }

    public final String getSelectedClass() {
        return this.selectedClass;
    }

    public final String getSuggestHint() {
        return this.suggestHint;
    }

    public int hashCode() {
        String str = this.currentMode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.selectedClass;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.suggestHint;
        return Boolean.hashCode(this.enableMapSelection) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.currentMode;
        String str2 = this.selectedClass;
        return nnm.i(this.suggestHint, ", enableMapSelection=", Extension.C_BRAKE, b64.v("AddressFlowSuggestDto(currentMode=", str, ", selectedClass=", str2, ", suggestHint="), this.enableMapSelection);
    }

    public /* synthetic */ AddressFlowSuggestDto(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? true : z);
    }
}
