package androidx.compose.ui.tooling.data;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ParameterInformation {
    public final boolean compared;
    public final boolean fromDefault;
    public final String inlineClass;
    public final String name;
    public final boolean stable;

    /* renamed from: static, reason: not valid java name */
    public final boolean f11static;
    public final Object value;

    public ParameterInformation(String str, Object obj, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        this.name = str;
        this.value = obj;
        this.fromDefault = z;
        this.f11static = z2;
        this.compared = z3;
        this.inlineClass = str2;
        this.stable = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParameterInformation)) {
            return false;
        }
        ParameterInformation parameterInformation = (ParameterInformation) obj;
        return this.name.equals(parameterInformation.name) && Intrinsics.areEqual(this.value, parameterInformation.value) && this.fromDefault == parameterInformation.fromDefault && this.f11static == parameterInformation.f11static && this.compared == parameterInformation.compared && Intrinsics.areEqual(this.inlineClass, parameterInformation.inlineClass) && this.stable == parameterInformation.stable;
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Object obj = this.value;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (obj == null ? 0 : obj.hashCode())) * 31, 31, this.fromDefault), 31, this.f11static), 31, this.compared);
        String str = this.inlineClass;
        return Boolean.hashCode(this.stable) + ((m + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParameterInformation(name=");
        sb.append(this.name);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", fromDefault=");
        sb.append(this.fromDefault);
        sb.append(", static=");
        sb.append(this.f11static);
        sb.append(", compared=");
        sb.append(this.compared);
        sb.append(", inlineClass=");
        sb.append(this.inlineClass);
        sb.append(", stable=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.stable, ')');
    }
}
