package app.cash.local.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class KeyValue {
    public final boolean isBold;
    public final boolean isHighlighted;
    public final String key;
    public final String value;

    public KeyValue(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.key = str;
        this.value = str2;
        this.isHighlighted = z;
        this.isBold = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyValue)) {
            return false;
        }
        KeyValue keyValue = (KeyValue) obj;
        return Intrinsics.areEqual(this.key, keyValue.key) && Intrinsics.areEqual(this.value, keyValue.value) && this.isHighlighted == keyValue.isHighlighted && this.isBold == keyValue.isBold;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isBold) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.key.hashCode() * 31, 31, this.value), 31, this.isHighlighted);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("KeyValue(key=", this.key, ", value=", this.value, ", isHighlighted="), this.isHighlighted, ", isBold=", this.isBold, ")");
    }

    public /* synthetic */ KeyValue(String str, String str2, int i, boolean z) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) == 0);
    }
}
