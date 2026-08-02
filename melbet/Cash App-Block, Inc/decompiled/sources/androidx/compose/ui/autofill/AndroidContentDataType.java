package androidx.compose.ui.autofill;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class AndroidContentDataType {
    public final int androidAutofillType;

    public final boolean equals(Object obj) {
        if (obj instanceof AndroidContentDataType) {
            return this.androidAutofillType == ((AndroidContentDataType) obj).androidAutofillType;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.androidAutofillType);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AndroidContentDataType(androidAutofillType=", this.androidAutofillType, ')');
    }
}
