package app.cash.local.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class GiftCardInputState {
    public final String code;
    public final String errorMessage;
    public final boolean isLoading;

    public GiftCardInputState(String str, boolean z, String str2) {
        str.getClass();
        this.code = str;
        this.isLoading = z;
        this.errorMessage = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftCardInputState)) {
            return false;
        }
        GiftCardInputState giftCardInputState = (GiftCardInputState) obj;
        return Intrinsics.areEqual(this.code, giftCardInputState.code) && this.isLoading == giftCardInputState.isLoading && Intrinsics.areEqual(this.errorMessage, giftCardInputState.errorMessage);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.code.hashCode() * 31, 31, this.isLoading);
        String str = this.errorMessage;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("GiftCardInputState(code=", this.code, ", isLoading=", ", errorMessage=", this.isLoading), this.errorMessage, ")");
    }
}
