package app.cash.local.viewmodels.sheet;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MapDecisionSheetModel {
    public final String address;
    public final boolean copyPhone;
    public final String name;

    public MapDecisionSheetModel(String str, String str2, boolean z) {
        this.name = str;
        this.address = str2;
        this.copyPhone = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapDecisionSheetModel)) {
            return false;
        }
        MapDecisionSheetModel mapDecisionSheetModel = (MapDecisionSheetModel) obj;
        return Intrinsics.areEqual(this.name, mapDecisionSheetModel.name) && Intrinsics.areEqual(this.address, mapDecisionSheetModel.address) && this.copyPhone == mapDecisionSheetModel.copyPhone;
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.address;
        return Boolean.hashCode(this.copyPhone) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MapDecisionSheetModel(name=", this.name, ", address=", this.address, ", copyPhone="), this.copyPhone, ")");
    }
}
